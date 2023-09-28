class S3
{
	static int i;
	static int j=i++ + i;
	public static void main(String[] args) 
	{
		System.out.println(i);//1
		System.out.println(j);//1
	}
}
