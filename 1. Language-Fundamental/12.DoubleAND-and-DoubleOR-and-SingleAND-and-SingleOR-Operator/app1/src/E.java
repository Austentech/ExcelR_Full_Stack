class E
{
	public static void main(String[] args) 
	{
		int i=0;
		if((++i==1) && (i++==2))
		{

			System.out.println("from if");
			i++;
		}
		System.out.println("end to end");
		System.out.println(i);
	}
}
