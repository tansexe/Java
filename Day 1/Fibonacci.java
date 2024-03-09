class Fibonacci{
	public static void main(String args[])
	{
		int i,a=1,b=1,c;
		System.out.print(a);
		System.out.print(",");
		System.out.print(b);
		for(i=0;i<=10;i++){
			c=a+b;
			System.out.print(",");
			System.out.print(c);
			a=b;
			b=c;
		}
		
	}

}