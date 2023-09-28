class Driver24 
{
	public static void test(Object a1)
	{
		if (a1 instanceof Object)
		{
			if (a1 instanceof Object)
			{
				Object obj = (Object) a1;
				System.out.println("Casting to Object");
			}

			if (a1 instanceof A)
			{
				A obj = (A) a1;
				System.out.println("Casting a1 to A");
			}

			if (a1 instanceof B)
			{
				B obj = (B) a1;
				System.out.println("Casting a1 to B");
			}

			if (a1 instanceof C)
			{
				C obj = (C) a1;
				System.out.println("Casting a1 to C");
			}

			if (a1 instanceof D)
			{
				D obj = (D) a1;
				System.out.println("Casting a1 to D");
			}
		}
	}


	public static void main(String[] args) 
	{
		Object obj = new Object();
		test(obj);
		System.out.println("----------------");
		Object obj1 = new A();
		test(obj1);
		System.out.println("----------------");
		Object obj2 = new B();
		test(obj2);
		System.out.println("----------------");
		Object obj3 = new C();
		test(obj3);
		System.out.println("----------------");
		Object obj4 = new D();
		test(obj4);
		System.out.println("----------------");
	}
}
