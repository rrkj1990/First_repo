class V 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=++i  + ++i  + ++i  +  ++i  + ++i  +  i;
		//     1      2      3       4     5       5
		
		System.out.println(i); // i = 5
		System.out.println(j); // j = 20
	}
}
