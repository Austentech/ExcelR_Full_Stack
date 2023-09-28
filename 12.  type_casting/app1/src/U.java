class U 
{
	public static void main(String[] args) 
	{
		double d1 = 20.0;
		float f1 = (float)d1;
		long lon = (float)f1;
		int i = (int)lon;
		short s = (short)i;
		byte b = (byte)s;

		System.out.println(d1);//20.0
		System.out.println(f1);//20.0
		System.out.println(lon);//20
		System.out.println(i);//20
		System.out.println(s);//20
		System.out.println(b);//20
	}
}
