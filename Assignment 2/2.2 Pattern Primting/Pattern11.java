class Pattern11{
	
	public static void main(String args[]){
		
		for(int i=5; i>=1; i--){
			
			for(int space=5; space>i; space--){
				System.out.print(" ");
			}
		
			for(int j=1;j<=5;j++){
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}