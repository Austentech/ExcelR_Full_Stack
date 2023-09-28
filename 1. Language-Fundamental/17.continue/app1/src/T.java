class T 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<2 ;i++ )
		{
			System.out.println("loop 1 begin" + "i:" + i);
			for (int j =0;j<5 ;j++ )
			{
				System.out.println("loop 2 begin" + "i:"+ i + "j:"+j);
				if (j>2)
				{
					continue;
				}
				System.out.println("loop 2 end"+ "j:" + j);
			}
			System.out.println("loop 1 end"+ "i:" + i);
		}
		System.out.println("end main");
	}
}
