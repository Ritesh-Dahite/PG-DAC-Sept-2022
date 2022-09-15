class Pattern10{
	
	public static void main(String args[]){
		
		for(int i=5; i>=1; i--){
		
			for(int space=1; space<=i-1; space++){
			
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
				
				char a = (char)(64+j);
				
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}