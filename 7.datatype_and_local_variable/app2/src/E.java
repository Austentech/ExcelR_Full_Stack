import java.text.DecimalFormat;
class E
{
	public static void main(String[] args) 
	{
		int a=20;
		double b=100.5;
		char c='^';
		boolean d=false;
		String str="abc";
		DecimalFormat df=new DecimalFormat ("#.###");
		float i=100.903f;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(str);
		System.out.println(df.format(i));

	}
}
