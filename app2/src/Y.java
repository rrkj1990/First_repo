class Y 
{
	public static void main(String[] args) 
	{
		int i =0;
		int j= ++i  +i  ++i  +  ++i  + i  +  --i  +  ++i  +  --i  + i  +  ++i;
		//      1    1   2       3     3       2         3      2     2      3	  
		
		System.out.println(i);//i=3
		System.out.println(j);//j=22
	}
}
