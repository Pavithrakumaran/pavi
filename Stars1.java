package pavi;

public class Stars1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int k=0;k<=i;k++)
			{
			System.out.print("  ");
			}
		}
		// TODO Auto-generated method stub

	}

}
