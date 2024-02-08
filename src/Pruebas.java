import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lec=new Scanner(System.in);
		BigInteger fac=new BigInteger("1");
		BigDecimal facdeci=new BigDecimal("1.0");
		MathContext mc=new MathContext(30);
		for(int i=1;i<=9999;i++)
		{
			BigInteger indice=new BigInteger(i+"");
			BigDecimal indiceDeci=new BigDecimal(i+".0");
			fac=fac.multiply(indice);
			facdeci=facdeci.multiply(indiceDeci);
			System.out.println("Factorial de "+i);
			BigDecimal raizreal= new BigDecimal(facdeci.sqrt(mc)+"");
			BigInteger raizEntera= new BigInteger(fac.sqrt()+"");
			System.out.println(raizreal+" =? "+raizEntera);
			
		}
	}

}
