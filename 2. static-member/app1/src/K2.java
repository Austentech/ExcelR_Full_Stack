class K2
{
	static int i=100;
	public static void main(String[] args) 
	{
		System.out.println("a: "+i);//100
		int i=10;
		System.out.println("b: "+i);//10
		i=20;
		System.out.println("c: "+k2.i);//100
		k2.i=200;
		System.out.println("d: "+K2.i);//200
		System.out.println("e: "+.i);//20

	}
}