public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i=0;i<16;i++)
			System.out.print("*");
		
		System.out.println();
		
			
		
		for(int i=0;i<6;i++) {
	     for(int j=6;j > i ;j--) {
		    System.out.print("*");
	     }
	     System.out.println();
		}
		for(int i=0;i<6;i++) {
		     for(int j=0;j<i+2 ;j++) {
			    System.out.print("*");
		
		     }
		     System.out.println();
		}
		
		
		for(int i=0;i<16;i++)
			System.out.print("*");

	}

}