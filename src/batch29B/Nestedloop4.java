package batch29B;

public class Nestedloop4 {

	public static void main(String[] args) {
		int num=0;
		for (int i=0;i<=4;i++)
		{
			for (int j=0;j<=i;j--) {
				System.out.print(num +"\t");
				num++;
			}
			System.out.println("");
		}

	}

}
