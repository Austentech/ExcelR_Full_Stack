class J 
{
	static int x=0;
	static void test1(){
		System.out.println("test1: "+x);
		x=1;
	}
	static void test2(){
		System.out.println("test1: "+x);
		x=2;
	}
	public static void main(String[] args) 
	{
		test1();//0
		System.out.println("main1: "+x);//1
		test2();//1
		System.out.println("main2: "+x);//2
	}
}
