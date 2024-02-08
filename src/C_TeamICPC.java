import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class C_TeamICPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec=new Scanner(System.in);
		
		//PriorityQueue<Long> colap=new PriorityQueue<Long>();
		int n=lec.nextInt();
		int j=lec.nextInt();
		int indice=0;
		Queue<Long> cola=new LinkedList<Long>();
		Long[] vec=new Long[j];
		//Long[] vec2=new Long[j];
		while(indice<j)
		{
			
			vec[indice]=lec.nextLong();
			cola.add(vec[indice]);
			//vec2[indice]=vec[indice];
			indice++;
		}
		int medio;
		if(j%2==0)
		{
			medio=(j/2)-1;
		}
		else
		{
			medio=j/2;
		}
		
		long primer=cola.poll();
		Arrays.sort(vec);
		System.out.println(vec[medio]);
		for(int i=j;i<n;i++)
		{
			for(int k=0;k<vec.length;k++)
			{
				if(vec[k]==primer)
				{
					vec[k]=lec.nextLong();
					cola.add(vec[k]);
					primer=cola.poll();
					break;
				}
			}
			
			Arrays.sort(vec);
			System.out.println(vec[medio]);
		}
		
		
		
	}

}
