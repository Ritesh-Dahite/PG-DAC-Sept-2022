class Pattern8{
	
	public static void main(String args[]){
		
		for(int i=5; i>=1; i--){
			
			for(int space=1; space<=i-1; space++){
				
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}