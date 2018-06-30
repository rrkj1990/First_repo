class Z 
{
	public static void main(String[] args) 
	{

		int i =0;
		int j=i++  +  i     +  ++i  +  i     +  ++i  +  i++  +
			// 0      1         2      2         3       3  
			  ++i  +  i--   +   i   +  i++   +    i  +   --i  +  i   + 
            // 5      5          4      4         5       4       4
			  i--  +  i++   +   i   +  i++   +  i--  +   i  +   ++i  +
			// 4       3        4       4        5       4       5 	   
			  i++  +   --i  +   i    +  --i  +  i--  +   ++i    +  i
            // 5        5       5        4       4        4        4
		
		System.out.println(i);//i=4
		System.out.println(j);//j=102
	}
}
