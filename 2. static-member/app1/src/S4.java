class S4
{
	static int i;
	static int j=j;// not possible
	public static void main(String[] args) 
	{
		System.out.println(i);//0 error
		System.out.println(j);//2
	}
}
