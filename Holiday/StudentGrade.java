import java.util.Scanner;
import java.util.Arrays;

public class StudentGrade{
public static void main(String... args){
Scanner input = new Scanner(System.in);

System.out.println("How many student do you have? ");
int numberOfStudents = input.nextInt();

System.out.println("How many subject do they offer? ");
int numberOfSubjects = input.nextInt();

int[][] studentData = new int[numberOfStudents][numberOfSubjects];

int[] totalEachStudentScores = new int[numberOfStudents];
int[] averageEachStudentScores = new int[numberOfStudents];
int totalStudentScores = 0;

for(int students = 0; students < numberOfStudents; students++){
System.out.println("Entering score for student " + (students + 1));
int totalScores = 0;
int averageScores = 0;

for(int subjects = 0; subjects < numberOfSubjects; subjects++){
System.out.println("Enter score for subject " + (subjects + 1));
studentData[students][subjects] = input.nextInt();

totalScores += studentData[students][subjects];
averageScores = totalScores / numberOfStudents;
}
totalEachStudentScores[students] = totalScores;
totalStudentScores += totalScores;
averageEachStudentScores[students] = averageScores;
}


//System.out.println(Arrays.deepToString(studentData));
//System.out.println(Arrays.toString(totalEachStudentScores));
//System.out.println(Arrays.toString(averageEachStudentScores));
//System.out.println(totalStudentScores);
//int total = 0;
//for(int students = 0; counter < totalEachRows.length; counter++){
//int 
//
//
//}
//

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.printf("%-10s", "STUDENTS");

for(int subjectHeading = 1; subjectHeading <= numberOfSubjects; subjectHeading++){
System.out.printf("%10s", "SUB" + subjectHeading);
}

System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
}
} 
