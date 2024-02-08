import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class F_CompetenciaNacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec=new Scanner(System.in);
		Map<String, Integer> mp=new HashMap<String, Integer>();
		int n=lec.nextInt();
		int cont=0;
		mp.put("max", 1);
		String save;
		
		for(int i=1;i<=n;i++)
		{
			String compe=lec.next();
			if(!mp.containsKey(compe))
			{
				mp.put(compe, 1);
				if(i==1)
				{
					save=compe;
					continue;
				}
			}
			else
			{
				mp.put(compe, mp.get(compe)+1);
				if(mp.get(compe)>max)
				{
					max=mp.get(compe);
				}
			}
			
		}
		System.out.println(cont);
	}

}
