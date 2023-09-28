class H 
{
	static int i;
	static void test()
	{
		System.out.println("from test:" +i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main"+i);//0
		i=10;
		test();//10
	}
}
