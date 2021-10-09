package firstPackage;
import java.util.Scanner; 
public class Ass4 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number of subjects  ");
		// 3dd el mwad numberofsubjects
		
		int numberofsubjects= (int) sc.nextFloat();
		
		int maxmarks[] = new int[numberofsubjects];
		
		int sumofmax=0;
		
		int sumofmarks=0;
//----------------------------------------------------------------------
//sys read max
        for(int i=0;i<numberofsubjects;i++) 
        {
        	System.out.println("please enter the max marks of subject number "+(i+1));
          	maxmarks[i]=sc.nextInt();
          	sumofmax=sumofmax+maxmarks[i];
        }
//----------------------------------------------------------------------------
//sys write max
        for (int j=0; j<numberofsubjects; j++)   
    	{  
    	    System.out.println("Your max marks of subject number "+(j+1)+" is "+ maxmarks[j]);
    	    System.out.println();
    	}
        System.out.println();
//----------------------------------------------------------------------------
//sys read marks 
        
       System.out.println("PLEAS ENTER YOUR SUBJECTS GRADE ");
        int marks[] = new int[numberofsubjects];
        for(int y=0;y<numberofsubjects;y++) 
        {
        	
        	//System.out.println("Enter the marks of subject number "+(y+1));
          //	marks[y]=sc.nextInt();
          	do
          	{
          		System.out.println("Please enter grade between 0 ---- " + maxmarks[y] );
          		System.out.println("Enter the marks of subject number "+(y+1));
              	marks[y]=sc.nextInt();
          	}
          	while((marks[y]>maxmarks[y])||(marks[y]<0));
          	sumofmarks=sumofmarks+marks[y];
          	         	
        }
        System.out.println();
//---------------------------------------------------------------------------
//write marks
        for (int z=0; z<numberofsubjects; z++)   
    	{  
    	    System.out.println("Your marks of subject number "+(z+1)+" is "+ marks[z]);
    	    System.out.println();
    	}
//-------------------------------------------------
//precentage of each subject

        for (int a=0; a<numberofsubjects; a++)   
    	{  
    	    System.out.println("Your precentage of subject number "+(a+1)+" is "+ ((marks[a]/maxmarks[a])*100));
    	    System.out.println();
       	}
//---------------------------------------------------------------------------------
//pass or fail result for each sub
        for (int a=0; a<numberofsubjects; a++)   
    	{  
      	    if(((marks[a]/maxmarks[a])*100)>=50) 
      	    {
      	    	System.out.println("Student result of subject  " + (a+1) + "  Passed" );
      	        System.out.println();
      	    }
            else 
            {
            	System.out.println("Student result of subject  " + (a+1) + "Failed" );
            }
    	}
//-------------------------------------------------------------------
//
        
       	float precentage = ((sumofmarks)/sumofmax)*100 ;
       	
        float average = (sumofmarks)/numberofsubjects;
        
        System.out.println("Total percentage is: " + precentage );
        System.out.println();
        
        System.out.println("Average degree is: " + average );	
        System.out.println();
        
        if(precentage>=50)
        {
        	System.out.println("Student total result: " + "Passed" );
        	System.out.println();
        }
        else
        {
        	System.out.println("Student total result: " + "Failed" );
        	System.out.println();
        }	
		
	}
}

