class V 
{
	static int count = 0;
	V()
	{
		count++;
	}
	static int getCount()
	{
		return count;
	}
}
class W extends V
{
	static int count = 100;

	W()
	{
		count++;
	}
	public static void main(String[] args) 
	{
		V v1 = new V();
		V v2 = new V();

		System.out.println("V.getCount():" + v1.getCount());

		W w1 = new W();
		W w2 = new W();

		System.out.println("W.getCount():" + W.getCount());
		System.out.println("V.getCount():" + w1.getCount());
	}
}
