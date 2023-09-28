class G
{
	void test1()
	{
		System.out.println("from test1.G");
	}
}

class H extends G
{
	void test1()
	{
		System.out.println("from test1.H");
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test1();
	}
}
