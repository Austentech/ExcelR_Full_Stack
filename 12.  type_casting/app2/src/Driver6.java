class Driver6 
{
	static D test1()
	{
		D d1 = new D();
		System.out.println(d1);
		return d1;
	}

	static A test2()
	{
		return new A();
	}

	public static void main(String[] args) 
	{
		D d1 = test1();
		A a1 = test2();
		System.out.println(d1);
		System.out.println(a1);


		System.out.println("----------------------");

		D d2 = test1();
		A a2 = test2();
		System.out.println(d2);
		System.out.println(a2);




		
	}
}
