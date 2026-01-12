import java.util.Scanner;
//import java.util.Arrays;

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
int[] positionEachStudent = new int[numberOfStudents];

int[] passPerSubject = new int[numberOfSubjects];
int[] failPerSubject = new int[numberOfSubjects];

int totalStudentScores = 0;
int averageStudentScores = 0;
int overallHighestScore = studentData[0][0];
int getOverallHighestStudent = 0;
int getOverallHighestSubject = 0;

int overallLowestScore = studentData[0][0];
int getOverallLowestStudent = 0;
int getOverallLowestSubject = 0;

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
averageStudentScores += averageScores;
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

for(int student = 0; student < numberOfStudents; student++){
int pos = 1;

for(int otherStudent = 0; otherStudent < numberOfStudents; otherStudent++){
if(totalEachStudentScores[otherStudent] > totalEachStudentScores[student]){
pos++;
}
if(studentData[student][otherStudent] > overallHighestScore){
overallHighestScore = studentData[student][otherStudent];
getOverallHighestStudent = otherStudent;
getOverallHighestSubject = student;

}

if(studentData[student][otherStudent] < overallLowestScore){
overallHighestScore = studentData[student][otherStudent];
getOverallLowestStudent = student;
getOverallLowestSubject = otherStudent;
}

}
positionEachStudent[student] = pos;
}

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

System.out.printf("%-10s", "STUDENTS");

for(int subjectHeading = 1; subjectHeading <= numberOfSubjects; subjectHeading++){
System.out.printf("%10s", "SUB" + subjectHeading);
}

System.out.printf("%10s%10s%10s%n", "TOT", "AVE", "POS");

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

for(int displayStudent = 0; displayStudent < numberOfStudents; displayStudent++){
System.out.printf("%-10s", "Student" + (displayStudent + 1));

for(int displaySubject = 0; displaySubject < numberOfSubjects; displaySubject++){
System.out.printf("%10d",studentData[displayStudent][displaySubject]);

}
System.out.printf("%10d", totalEachStudentScores[displayStudent]);

System.out.printf("%10d", averageEachStudentScores[displayStudent]);

System.out.printf("%10d", positionEachStudent[displayStudent]);

System.out.println();
}

System.out.println("SUBJECT SUMMARY");



for(int subject = 0; subject < numberOfSubjects; subject++){
int highestScore = studentData[0][subject];
int lowestScore = studentData[0][subject];
int totalScore = 0;
double averageScore = 0;
int numberOfPasses = 0;
int numberOfFails = 0;
int getHighestStudent = 0;
int getLowestStudent = 0;



System.out.println("Subject " + (subject + 1));

for(int student = 0; student < numberOfStudents;student++){
int element = studentData[student][subject];
totalScore += element;
if(element >= 50){
numberOfPasses += 1;
}
if(element < 50){
numberOfFails += 1;
}
if(element > highestScore){
highestScore = element;
 getHighestStudent = student;
}

if(element < lowestScore){
lowestScore = element;
 getLowestStudent = student;
}

}

passPerSubject[subject] = numberOfPasses;
failPerSubject[subject] = numberOfFails;

averageScore = totalScore / numberOfStudents;
System.out.println("Highest Scoring student is:  Student " +  (getHighestStudent + 1) + " Scoring " + highestScore);
System.out.println("Lowest Scoring student is:  Student " + (getLowestStudent + 1) + " Scoring " + lowestScore);
System.out.println("Total Score is: " + totalScore);
System.out.println("Average Score is: " + averageScore);
System.out.println("Number of passes is: " + numberOfPasses);
System.out.println("Number of Fails is: " + numberOfFails);

System.out.println("");
}

System.out.println("");
System.out.println("");

int hardestSubject = 0;
int hardestSubjectFail = failPerSubject[0];;
int easiestSubject = 0;
int easiestSubjectPasses = passPerSubject[0];

for(int count = 0; count < numberOfSubjects; count++){
if(passPerSubject[count] > easiestSubject){
easiestSubject = count;
easiestSubjectPasses = passPerSubject[count];
}

if(failPerSubject[count] > hardestSubject){
hardestSubject = count;
hardestSubjectFail = failPerSubject[count];
}

}

System.out.println("The hardest subject is subject " + (hardestSubject + 1)  + " with " + hardestSubjectFail + " failures" );

System.out.println("The easiest subject is subject " + (easiestSubject + 1) + " with " + easiestSubjectPasses + " Passes" );

System.out.println("The overall Highest score is scored by student " + getOverallHighestStudent + " in subject " + getOverallHighestSubject + " scoring " + overallHighestScore);

System.out.println("The overall Lowest score is scored by student " + getOverallLowestStudent + " in subject " + getOverallLowestSubject + " scoring " + overallLowestScore);


System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("CLASS SUMMARY");
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

int bestGraduatingStudent = totalEachStudentScores[0];
int worstGraduatingStudent = totalEachStudentScores[0];

int getBGS = 0;
int getWGS = 0;


for(int counter = 0; counter < numberOfStudents; counter++){



if(totalEachStudentScores[counter] > bestGraduatingStudent){
bestGraduatingStudent = totalEachStudentScores[counter];
getBGS = counter;
}

if(totalEachStudentScores[counter] < worstGraduatingStudent){
worstGraduatingStudent = totalEachStudentScores[counter];
getWGS = counter;
}
}

System.out.println("");    
System.out.println("Best Graduating Student is: Student " + (getBGS + 1) + " Scoring " + bestGraduatingStudent);
System.out.println("");
System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("");
System.out.println("");

System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("");
System.out.println("Worst Graduating Student is: Student " + (getWGS + 1) + " Scoring " + worstGraduatingStudent);
System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
System.out.println("");
System.out.println("");

System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
System.out.println("Class total Score is: " + totalStudentScores);
System.out.println("Class Average Score is: " + averageStudentScores);
}
} 
