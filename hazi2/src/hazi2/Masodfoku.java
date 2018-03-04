package hazi2;

import java.lang.Math;
import java.util.Scanner;

public class Masodfoku {
	
	
	public static double discriminant(double a, double b, double c) {
		double diszkriminans=b*b-(4*a*c);
		return diszkriminans;
	}

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		/* egyessével bekérve
		double a=0;
		double b=0;
		double c=0;
		System.out.println("Adja meg az első együtthatót: ");
		a=scanner.nextDouble();
		System.out.println("Adja meg az második együtthatót: ");
		b=scanner.nextDouble();
		System.out.println("Adja meg az harmadik együtthatót: ");
		c=scanner.nextDouble();
		*/
		
		
		// egysorba bekérve
		System.out.println("Adja meg az egyenlet együtthatóit vesszővel elválasztva!");
		String egyenlet=scanner.nextLine();
		double a=Double.parseDouble(egyenlet.split(",")[0]);
		double b=Double.parseDouble(egyenlet.split(",")[1]);
		double c=Double.parseDouble(egyenlet.split(",")[2]);
		
			
		
		double diszkriminans=discriminant(a,b,c);
		System.out.println("Diszkrimináns= "+diszkriminans);
		
		double x1=0;
		double x2=0;
		
		if(diszkriminans<0) {
			System.out.println("Nincs az egyenletnek valós gyöke!");
		}
		else{
			
			x1=((-b)+Math.sqrt(diszkriminans))/(2*a);
			x2=((-b)-Math.sqrt(diszkriminans))/(2*a);
			System.out.println("Az egyenlet gyökei: x1="+x1+" x2="+x2);
		}
		
		scanner.close();
		

	}
	
}
