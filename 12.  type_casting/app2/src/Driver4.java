class Driver4 
{
	static void test1(A a1)
	{
		System.out.println("test1(A)" + a1);		
	}
	static void test2(C c1)
	{
		System.out.println("test1(C)" + c1);		
	}

	public static void main(String[] args) 
	{
		test1 (new A());
		test2(new C());

		A a1 = new A();
		test1(a1);

		C c1 = new C();
		test2(c1);

		System.out.println(a1);
		System.out.println(c1);
	}
}
