class U 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=++i + i-- + ++i + i+
			i-- + i + --i + i +
			++i + i++ + --i + i +
			--i + i++ + --i + i +
			++i + --i + ++i + i +
			--i + i + --i + i +
			++i + i++ + --i + i +
			i-- + i + i-- + i;

		
		System.out.println(i);
		System.out.println(j);
	
	}
}
// 1 + 1 + 1 + 1 + 
//1+ 0 + -1 + -1 +
//1+ 1 + 1+ 1+
//0 +1 + 1 + 0+
//1+ 0 + -1 + -1+
//-2 + -2 + -3 + -3+
//-2+ -2+ -2 + -2+
//-2 + -3 + -3 + -2


//12 + (-32)
//j= -20
//i= -2