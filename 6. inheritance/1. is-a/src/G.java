class G 
{
	static void test1()
	{
		System.out.println("G-tets1");
	}
}
class H extends G
{
	static void test2()
	{
		System.out.println("H-test2");
	}

	public static void main(String[] args) 
	{
		H.test1();
		H.test2();
	}
}
class I extends H
{
	static void test3()
	{
		System.out.println("I-test3");
	}
	public static void main(String[] args)
	{
		I.test1();
		I.test2();
		I.test3();
	}

}
