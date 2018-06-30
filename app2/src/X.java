class X 
{
	public static void main(String[] args) 
	{
		int i=10;
		int j=--i  + --i  +  --i  + --i  +  i;
		//     9      8        7     6      6
		
		System.out.println(i);//i=6
		System.out.println(j);//j=36
	}
}
