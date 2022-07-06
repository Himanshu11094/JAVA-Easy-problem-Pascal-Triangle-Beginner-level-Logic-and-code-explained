  import java.util.Scanner;

public class PascalTriangle {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

			int rows=0;
			int triangle[][] = new int[100][100];
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("How many rows do you want in the Pascal triangle:");
			
			rows= input.nextInt();
			for (int i=0; i<rows;i++)
			{
				
				triangle[i][0] =1;
				triangle[i][i] =1;
				
				for(int j=i-1; j>0;j--)
				{
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1] ;
					 
				}
				
			}
			
			  for(int i=0; i<rows; i++)
			  {
				  for(int k=rows-i; k>0;k--)
				  {System.out.print(" ");}
				  
				  for(int j=0; j<=i;j++)
				  {  System.out.print(triangle[i][j]);
				  System.out.print(" ");
					  }
				  System.out.println("");
			  }
	}

}
