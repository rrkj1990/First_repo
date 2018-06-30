class L 
{
	public static void main(String[] args) 
	{
		int i=0;
		int j=i++  +  i++  +  i++  + i++  + i +
			// 0       1       2      3     4
			  i--  +  i--  +  i--  + i--  + i +
           //  4       3       2      1     0
			  i++  +  i--  +  i++  + i--  + i ;
           //  0      1       0      0     0

		System.out.println(i);
		System.out.println(j);
	}
}
