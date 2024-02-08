import java.util.Scanner;

public class E_DivisorInteresante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec=new Scanner(System.in);
		long x=lec.nextLong();
		long y=lec.nextLong();
		if(x==1 || y==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
