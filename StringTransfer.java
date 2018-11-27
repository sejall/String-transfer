class StringTransfer
{
	public static void main(String args[])
	{
		String s1="matrix";
		String s2=s1;
		do
		{
			System.out.println(s1);
			s1=s1.substring(1)+s1.charAt(0);
		}while(!s1.equals(s2));
		
	}
}