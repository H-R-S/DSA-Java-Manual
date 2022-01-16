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
