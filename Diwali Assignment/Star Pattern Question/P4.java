class P4
{
   public static void main(String[] args)
   {
      int num;
      for(int i=0;i<5;i++)
      {
         for(int k=5;k>i;k--)
         {
            System.out.print(" ");
         }
         num=1;
         for(int j=0;j<=i;j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.println();
      }
   }
}