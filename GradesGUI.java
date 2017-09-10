import javax.swing.JOptionPane;

public class GradesGUI {
	
	public static void main(String[] args) {
		String choice = null;
		do{
			String Students =JOptionPane.showInputDialog("Please enter the number of students: ");
			String NumExams = JOptionPane.showInputDialog("Please enter the number of exams of the current semester: ");
			int NumberOfStudents =Integer.valueOf(Students);
			int NumberOfExams =Integer.valueOf(NumExams);
			int StudentScores[][] = new int[NumberOfStudents][NumberOfExams];
			String grade[] =new String[NumberOfStudents];
			int total=0;
			for(int i =0;i<NumberOfStudents;i++){
				total =0;
				for(int j=0;j<NumberOfExams;j++){
					String score =JOptionPane.showInputDialog("Student "+(i+1)+"\nEnter the total tally of each exam "+(j+1)+": ");
					StudentScores[i][j] = Integer.valueOf(score);
					total+=StudentScores[i][j];
				}
				if(total/(NumberOfExams)>=90) {
					grade[i]="A";
				}
				else if(total/(NumberOfExams)>=80) {
					grade[i]="B";
				}
				else if(total/(NumberOfExams)>=70) {
					grade[i]="C";
				}
				else if(total/(NumberOfExams)>=60) {
					grade[i]="D";
				}
				else{
					grade[i]="F";
				}
			}
			String result="";
			for(int i =0;i<NumberOfStudents;i++) {
				result+="Student "+(i+1)+ " : "+ grade[i]+"\n";
			}
			JOptionPane.showMessageDialog(null, "Student grade standings are... \n"+ result);
			choice =JOptionPane.showInputDialog("Press E to terminate the program ");
			
		}
		while(!"E".equalsIgnoreCase(choice));
		

	}

	
}
