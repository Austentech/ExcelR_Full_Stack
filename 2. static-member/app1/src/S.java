class S 
{
	static int i;
	static int j=i=10;
	public static void main(String[] args) 
	{
		System.out.println(i);//10
		System.out.println(j);//10
	}
}
