package hazi2;
import java.util.Random;
import java.util.Arrays;

public class ArraysHazi {
	
	public static void main(String[] args) {
		
		
		/*tömbök létrehozása*/
		double array1[]=new double [10];
		int array2[]=new int[10];
		char array3[]=new char[10];
		
		java.util.Random rand= new java.util.Random();
		
		for(int i=0;i<10;i++) {
			array1[i]=rand.nextDouble();
			array2[i]=rand.nextInt(50)+1;
			array3[i]=(char)(rand.nextInt(26)+'a');
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("double: "+array1[i]+" int: "+array2[i]+" char: "+array3[i]);
		}
		
		
		
		
		/*rendezés*/
		java.util.Arrays.sort(array1);
		java.util.Arrays.sort(array2);
		java.util.Arrays.sort(array3);
		
		System.out.println();
		
		for(int i=0;i<10;i++) {
			System.out.println("double: "+array1[i]+" int: "+array2[i]+" char: "+array3[i]);
		}
		
		
		double searchable1= 0.92;
		int searchable2= 22;
		char searchable3='d';
		System.out.println();
		System.out.println("keresett double: "+searchable1+" a keresett int: "+searchable2+" a keresett char: "+searchable3);
		System.out.println();
		
		/*keresés*/
		if(java.util.Arrays.binarySearch(array1, searchable1)>=0) {
			System.out.println(java.util.Arrays.binarySearch(array1, searchable1)+1+". elem az");
		}
		else {
			System.out.println("a double nincs benne a tömbben");
		}
		
		
		
		if(java.util.Arrays.binarySearch(array2, searchable2)>=0) {
			System.out.println(java.util.Arrays.binarySearch(array2, searchable2)+1+". elem az");
		}
		else {
			System.out.println("a int nincs benne a tömbben");
		}
		
		
		
		if(java.util.Arrays.binarySearch(array3, searchable3)>=0) {
			System.out.println(java.util.Arrays.binarySearch(array3, searchable3)+1+". elem az");
		}
		else {
			System.out.println("a char nincs benne a tömbben");
		}
		
		
		System.out.println();
		
		
		/*egyezés vizsgálat*/
		int eq1[]={1,2,3};
		int eq2[]={1,2,3};
		double eq3[]= {2,5,2,6};
		double eq4[]= {3.5,3.6};
		char eq5[]= {'a','s','d'};
		char eq6[]= {'a','s','d'};
		
		if(java.util.Arrays.equals(eq1, eq2)==true)
			System.out.println("A tömbök megegyeznek");
		else
			System.out.println("A tömbök nem egyeznek meg");
		
		if(java.util.Arrays.equals(eq3, eq4)==true)
			System.out.println("A tömbök megegyeznek");
		else
			System.out.println("A tömbök nem egyeznek meg");
		
		if(java.util.Arrays.equals(eq5, eq6)==true)
			System.out.println("A tömbök megegyeznek");
		else
			System.out.println("A tömbök nem egyeznek meg");
		
	}

}
