class I 
{
	static int x;
	static void test()
	{
		System.out.println("from test"+x);
		x=10;
	}
	public static void main(String[] args) 
	{
		System.out.println("main1"+x);//0
		x=20;
		test();//20
		System.out.println("main2"+x);//10
	}
}
