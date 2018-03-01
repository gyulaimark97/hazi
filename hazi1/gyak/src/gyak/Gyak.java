package gyak;

public class Gyak {
	
	public static double fakt(int limit) {
		if (limit==0)
			return (double)1;
	
		double faktorialis=1;
	
		for(double i=1;i<=limit;i++){
		
			faktorialis=faktorialis*i;
			

		}
		return faktorialis;
	}

	public static void main(String[] args) {
		double euler=0;
		
		for(int i=0;i<=1000;i++)
		{
			euler=euler+(1/fakt(i));
			
		}
		
		System.out.println("Az e szám közelítő értéke: "+euler);
		System.out.println();
		
		for(int a=1;a<100;a++)
		{
			for(int b=a+1;b<100;b++)
			{
				for(int c=a+2;c<100;c++)
				{
					int sqa=a*a;
					int sqb=b*b;
					int sqc=c*c;
					
				if((sqa+sqb)==sqc) {
					if((a+b)>c) {
						 if((a+c)>b) {
							 if((b+c)>a) {			
								
									System.out.print(a+" ");
									System.out.print(b+" ");
									System.out.print(c);
									System.out.println();}
							 }
						 }	 
					}
					
						
						
						

				}
			}
		}
		

	}

}
