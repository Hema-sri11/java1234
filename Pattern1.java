public class Pattern1 {

	public static void main(String[] args) {
		int n=14;
		for(int i=0;i< n/2 ;i++)
		{
			for(int j=i;j< n/2;j++)
			{
				System.out.print("*");
		    }
			
			int spaces =  2*i;
			
			for(int s = 0;s<spaces;s++) {
				System.out.print(" ");
			}
			
			for(int j=i;j < (n/2);j++)
			{
				System.out.print("*");
		    }
			
			System.out.println();
	    }
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j< n;j++) {
				if(j == 0 || j == n-1 || i == n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
}
}
