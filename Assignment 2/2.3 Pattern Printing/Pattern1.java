class Pattern1{
	
	public static void main(String args[]){
		
		for(int i=1; i<=9; i++){
			
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