class F
{
	public static void main(String[] args) 
	{
		boolean flag=true;
		if((flag =false) && (flag = true))
		{

			System.out.println("from if");
			
		}
		System.out.println("end to main");
		System.out.println(flag);
	}
}
