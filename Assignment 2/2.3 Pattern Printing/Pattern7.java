class Pattern7{
	
	public static void main(String args[]){
		
		for(int i=9; i>=1; i--){
			
			for(int space=1; space<=9-i; space++){
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++){
				
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}