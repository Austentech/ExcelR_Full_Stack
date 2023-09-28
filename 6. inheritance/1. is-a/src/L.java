class L 
{
	L()
	{
		System.out.println("L()");
	}
}
class M extends L
{
	M()
	{
		System.out.println("M()");
	}


	public static void main(String[] args) 
	{
		M obj = new M();
	}
}
