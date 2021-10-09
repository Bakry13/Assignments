package assignments;

public class Assignment5 {

	public static void main(String[] args) {
		int hight = 5; int length = 5;
		for(int i=-hight; i<=hight; i++)
		{
			for(int j = 0; j<=length; j++)
			{
				if(i*i == j*j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
