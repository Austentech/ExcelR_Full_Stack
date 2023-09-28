class V 
{
	public static byte test(double i)
	{
		return (byte)(short)(int)(long)(double)(float)(double)i;
	}
	public static void main(String[] args) 
	{
		double i = 10.2;
		//byte b = (byte)(short)(int)(long)(double)(float)(double)i;
		test(20.4);
		System.out.println(test(i));
		//System.out.println(b);
	}
}
