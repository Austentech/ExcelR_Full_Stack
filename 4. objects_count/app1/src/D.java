class D 
{
	int count=0;
	D()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		D obj1 = new D();
		System.out.println("a: " + obj1.count);//1
		D obj2 = new D();
		System.out.println("b: " + obj2.count);//2
		D obj3 = new D();
		System.out.println("c: " + obj3.count);//4
		D obj5 = new D();
		System.out.println("e: " + obj4.count);//5
		
		System.out.println("f: " + obj1.count);//1
		System.out.println("g: " + obj2.count);//2
		System.out.println("h: " + obj3.count);//3
		System.out.println("i: " + obj4.count);//4
		System.out.println("j: " + obj5.count);//5
	}
}
