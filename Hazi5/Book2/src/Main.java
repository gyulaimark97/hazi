import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please give the details of the book!");
		Book firstBook=new Book(scan.nextLine(),scan.nextLine(),scan.nextInt(),scan.nextDouble());
		scan.nextLine();
		System.out.println("Please give the details of the new book!");
		Book secondBook= new Book(scan.nextLine(), scan.nextLine());
		
		System.out.println(firstBook.toString());
		System.out.println(secondBook.toString());
		
		
		if(firstBook.isTitleMatch(secondBook)==true)
			System.out.println("the titles match!");
	}
}
