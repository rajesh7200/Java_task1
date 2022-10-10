package pgm;

public class Jpattern {
	static void patternJ()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<=5; j++)
			{
				if(i==1|| i==2&&j==3|| i==3&&j==0 || i==3&&j==3 || i==4&&j==0 || i==4&&j==3 || i==5&&j==2 || i==5&&j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		patternJ();

	}

}