class Pattern
{
	public static void main(String args[])
	{
		int i=1, j=1,k=10;
		while(i<=6){
			System.out.print(j);
			System.out.print(",");
			System.out.print(k);
			System.out.println();
			j+=2;
			k-=2;
			i++;
		}
	}

}