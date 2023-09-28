class Driver5 
{
	public static void test1(A obj)
	{
		System.out.println("test1(A) : "+ obj);
	}

	public static void test2(B obj)
	{
		System.out.println("test1(B) :"+ obj);
	}

	public static void main(String[] args) 
	{
		 A a1 = new A();
		 test1(a1);

		 B b1 = new B();
		 test2(b1);

		System.out.println(a1);
		System.out.println(b1);

		System.out.println("---------------------");

		A a1 = new A();
		test1(a1);

		B b1 = new B();
		test2(b1);

		System.out.println(a1);
		System.out.println(b1);

	}
}
