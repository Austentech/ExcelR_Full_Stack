class H 
{
	public static void main(String[] args) 
	{
		int i=0;
		if ((i++ == 0) || (i++ == 1))
		{
			System.out.println("from if ");
			i++;
		}
		System.out.println("Hello World!");
		System.out.println(i);
	}
}
