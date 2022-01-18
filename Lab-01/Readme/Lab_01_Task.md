# Data Structure & Algorithm Manual | Lab: 01 Task | (Solved)
## [Lab: 01 | Task]()
Lab Tasks 1:
-
Develop Java Class IU_Mark_Sheet with following Constructor and Methods.
Constructor:
- IU_Mark_Sheet(String Student, String Registration Number);
Methods: 
- Void Subject_Name(String Subject[]);
- Void Subject_Max_Mark(double MaxMark[]);
- Void Subject_Scored_Mark(double ScoredMark[]);
- Double StudentGPA();
### Code:
#### main.java:
```
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
```
#### IU_Mark_Sheet.java:
```
package Task;

public class IU_Mark_Sheet {
	
	String Student;
	String RegistrationNumber;
	String Subject;	
	double MaxMark;
	double ScoredMark;
	double gpa;
	
	IU_Mark_Sheet(String Student, String RegistrationNumber) {
		this.Student= Student;
		this.RegistrationNumber = RegistrationNumber;
	}
	
	void Subject_Name(String Subject) {
		this.Subject=Subject;
	}
	
	void Subject_Max_Mark(double MaxMark) {
		this.MaxMark=MaxMark;
	}
	
	void Subject_Scored_Mark(double ScoredMark) {
		this.ScoredMark=ScoredMark;
	}
	
	double StudentGPA() {
		double percentage;
		percentage = (ScoredMark/MaxMark)*100;
		if(percentage>=88)
			gpa = 4.0;
		else if(percentage<=87 && percentage>=81)
			gpa = 3.5;
		else if(percentage<=80 && percentage>=74)
			gpa = 3.0;
		else if(percentage<=73 && percentage>=67)
			gpa = 2.5;
		else if(percentage<=66 && percentage>=60)
			gpa = 2.0;
		else
			gpa = 0;
		return gpa;
	}
	
	void IU_Marks_Sheet() {
		
		System.out.println("\n\n__________________________________________________________\n\n");
		System.out.println("\t\t IQRA UNIVERSITY MARK SHEET\n\t\t ");
		System.out.println("\nNAME : " + Student + "\nRegistration Number : " + RegistrationNumber);
		System.out.println("\n\n\nSUBJECT\t\tMAX MARKS \tOBTAINED MARKS \tGPA\n");
		System.out.println(Subject + "\t\t" + MaxMark + "\t\t" + ScoredMark + "\t\t" + gpa);
		System.out.println("\n\n___________________________________________________________\n\n");
	}
}
```
### Code Output:
```
```
### Code Screen Shots:
#### main.java:
![main.java](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Code/main.jpg)
#### IU_Mark_Sheet.java:
![IU_Mark_Sheet.java SS1](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Code/ms_ss1.JPG)
![IU_Mark_Sheet.java SS2](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Code/ms_ss2.JPG)
### Code Ouput Screen Shot:
![output](https://github.com/H-R-S/DSA-Java-Manual/blob/main/Lab-01/ScreenShots/Task/Output/output.JPG)