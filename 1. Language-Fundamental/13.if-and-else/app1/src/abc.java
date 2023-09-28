class abc 
{
	public static void main(String[] args) 
	{
		int num = 24;
        if (num % 6 == 0) {
            if (num % 8 == 0)
                System.out.print("Divisible by both 6 and 8");
            else
                System.out.print("Divisible by 6 but not 8");
        } else {
            System.out.print("Not divisible by 6");
            if (num % 8 == 0)
                System.out.print(" but divisible by 8");
        }		
	}
}
