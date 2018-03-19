import java.util.Scanner;

public class Mainperson {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		Person person=new Person();
		
		
		 /*person.name=scanner.nextLine();
		 person.weight=scanner.nextInt();
		 person.height=scanner.nextDouble();*/
		System.out.println("adja meg a személy nevét: ");
		person.setName(scanner.nextLine());
		System.out.println("adja meg a személy súlyát: ");
		person.setWeight(scanner.nextInt());
		System.out.println("adja meg a személy magasságát (méterben) : ");
		person.setHeight(scanner.nextDouble());
		
		System.out.println(person.allData());
		
	}
}
