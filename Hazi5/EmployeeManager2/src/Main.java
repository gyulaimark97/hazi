
public class Main {


	public static void main(String[] args) {
		
			Employee employee=new Employee("MindlessWorker");

			
			Employee employee2 =new Employee("Pista",300000);
			
//			employee2.setEmployeeName("Pista");
//			employee2.setSalary(300000);
			
			
			
			System.out.println(employee.displayInfo());
			employee.incSalary(50000);
			System.out.println(employee.displayInfo());
			System.out.println(employee2.displayInfo());
		
			System.out.println(employee.isInSalaryRange(10000, 5000000));
			System.out.println(employee.hasHigherSalary(employee2));
			System.out.println(employee.getTax());
			
			
			
			Employee employeeArray[]=new Employee[10];
			
			for(int i=0;i<employeeArray.length;i++) {
				
				employeeArray[i]=new Employee("Worker"+i);	//példányosítás
				employeeArray[i].setSalary(i*1000+i*200);
				employeeArray[i].setEmployeeName("MindlessWorker "+i);
			}
			
			
			
			//legnagyobb keresése
			
			/*long biggestSalary=employeeArray[0].getSalary();
			
			for(int i=1;i<employeeArray.length;i++) {
				if(employeeArray[i].getSalary()>biggestSalary) {
					biggestSalary=employeeArray[i].getSalary();
					
				}
			}*/
			
			int maxindex=0;;
			for(int i=1;i<employeeArray.length;i++) {
				if(employeeArray[i].hasHigherSalary(employeeArray[maxindex])) {
					maxindex=i;
					
				}
			}
			
			System.out.println(maxindex);
			System.out.println(employeeArray[maxindex].getSalary());
					
			//szamlalas
			
			int counter=0;
			
			for(int i=0;i<employeeArray.length;i++) {
				if(employeeArray[i].isInSalaryRange(5000, 10000)) {
					counter++;
				}
			}
			
			System.out.println(counter);
			
			
			//atlag
			
			double avg=0; 
			
			for(Employee anEmployee3 : employeeArray) {
				avg+=employee.getSalary();
				avg/=employeeArray.length;
			}
			
			System.out.println(avg);
			
			
			//ado szamítas
			
			long tax=0;
			for(Employee anEmployee : employeeArray) {
				tax+=employee.getTax();
			}
			
			System.out.println(tax);
			
		}
			
	}


