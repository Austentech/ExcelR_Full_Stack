class Driver23 
{
	public static void main(String[] args) 
	{
		/*
		A a1 = new B();
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(a1 instanceof C);
		System.out.println(a1 instanceof D);*/

		A a1 = new C();
		B b1 = B(a1);
		C c1 = C(b1);
		D d1 = D(c1);
		System.out.println(a1);
		System.out.println((B)a1);
		System.out.println((C)a1);
		System.out.println(a1 instanceof D);

	}
}
