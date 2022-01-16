package Task;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		String Name = scan.nextLine();
		
		System.out.println("Enter Student Registration Number : ");
		String RegNo = scan.nextLine();
		
		System.out.println("Enter Subject Name : ");
		String SubName = scan.nextLine();
		
		System.out.println("Enter Max Marks : ");
		double MaxMarks = scan.nextDouble();
		
		System.out.println("Enter Obtained Marks : ");
		double ObtMarks = scan.nextDouble();
		
		IU_Mark_Sheet MS = new IU_Mark_Sheet(Name, RegNo);
		MS.Subject_Name(SubName);
		MS.Subject_Max_Mark(MaxMarks);
		MS.Subject_Scored_Mark(ObtMarks);
		MS.StudentGPA();
		MS.IU_Marks_Sheet();
	}
}
