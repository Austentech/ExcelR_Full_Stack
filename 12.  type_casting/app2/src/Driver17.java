class Driver17
{
	static C test()
	{
		A a1 = new B();
		return (C)a1;
	}
	public static void main(String[] args) 
	{
		D d1 = (D)test();

		System.out.println("Done");
	}
}
