import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_MichiTorres {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec=new Scanner(System.in);
		Map<Integer,Integer> mpx=new HashMap<Integer, Integer>();
		Map<Integer,Integer> mpy=new HashMap<Integer, Integer>();
		int n=lec.nextInt();
		int m=lec.nextInt();
		long vivos=n*n;
		for(int i=1;i<=m;i++)
		{
			int x=lec.nextInt();
			int y=lec.nextInt();
			if(!mpx.containsKey(x)&& !mpy.containsKey(y))
			{
				vivos=vivos-
			}
			else
			{
				
			}
			vivos=(long)Math.pow(n-i, 2);
			System.out.println(vivos);
		}
			
	}

}
