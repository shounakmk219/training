public class ExceptionHandling{
	public static void main(String args[])
	{
		try{
			abc();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}		
	}

	public void abc() throws IOException
	{
		try{
			int a=15;
			for(int i=1;i<100;i++)
			{
				if(i>a)
					throw new IOException(""+i);
				System.out.println(":-"+a/a-i);
				
			}
		}catch(ArithematicException e){
			System.out.println("Divide by zero!");
		}
	}
}