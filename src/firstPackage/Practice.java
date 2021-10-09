package firstPackage;
import java.util.Scanner;
public class Practice
{
	 public static void main(String[] args)	
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("please enter number of rows");
		int n= (int) sc.nextFloat();
//------------------------------------------------------------------------------
// 1- Square of stars
		 for(int i=1;i<=n;i++)
			 // el for bta3 el i ms2ola 3n rows
		 {
			 for(int j=1;j<=n;j++)
				 //el for bta3 el j ms2ola 3n el columns
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 } 
//------------------------------------------------------------------------------
		 System.out.println();
//------------------------------------------------------------------------------
//2-increasing triangle 
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 } 
//------------------------------------------------------------------------------ 
         System.out.println();
//--------------------------------------------------------------------------------	
//3-decreasing triangle
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 } 
//------------------------------------------------------------------------------	 
         System.out.println();
//-------------------------------------------------------------------------------	
//another idea of decreasing triangle	 
/*
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=5;j>=i;j--)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
*/
//------------------------------------------------------------------------------
		 System.out.println();
//------------------------------------------------------------------------------
//right sided triangle
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 
			 System.out.println();
		 }
//------------------------------------------------------------------------------
		 System.out.println();
//------------------------------------------------------------------------------
//right sided triangle
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("* ");
			 }
			 
			 System.out.println();
		 }
//---------------------------------------------------------------------------------
		 System.out.println();
//------------------------------------------------------------------------------
//ass 4 sand clock
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("* ");
			 }
			 for(int j=i;j<n;j++)
			 {
				 System.out.print("* ");
			 }
			 
			 System.out.println();
		 }
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 for(int j=1;j<i;j++)
			 {
				 System.out.print("* ");
			 }
						 
			 System.out.println();
		 }
//---------------------------------------------------------------------------------
		 System.out.println();
//------------------------------------------------------------------------------
//ass 4 sand clock with only one middle point
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("* ");
			 }
			 for(int j=i;j<n;j++)
			 {
				 System.out.print("* ");
			 }
			 
			 System.out.println();
		 }
		 for(int i=2;i<=n;i++)
		 {
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 for(int j=1;j<i;j++)
			 {
				 System.out.print("* ");
			 }
						 
			 System.out.println();
		 }
		 
		 
		 
//---------------------------------------------------------------------------------
		 System.out.println();
//------------------------------------------------------------------------------		 
/* dah 7l tany bs ana mfhmto4 w katbo as2l feh	 
		 
		 
		 for(int i=1; i<=5; i++)
	     {
	         for(int k=1; k<=i-1; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=5-i+1; j++)
	         {
	             System.out.print("* ");
	         } 
	         System.out.println();
	     }
		 
	     for(int i=4; i>=1; i--)
	     {
	         for(int k=1; k<=i-1; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=i; j<=5; j++)
	         {
	             System.out.print("* ");
	         } 
	         System.out.println();
	     }
		 */
//------------------------------------------------------------------------------
		 for (int i = 1 ; i <=4 ; i ++ ) {
			 for (int j = 4 ; j >=i ; j -- ) {
			 System.out.print("*");
			 }
			 System.out.println(" ");
			 }


			 for (int r=2 ; r <=4 ; r++) {
			 for (int l = 1 ; l <=r ; l ++ ) {
			 System.out.print("*");
			 }
			 System.out.println(" ");
			 }
//------------------------------------------------------------------------------			 
	 }

}
