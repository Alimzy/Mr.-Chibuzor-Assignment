const prompt = require('prompt-sync')()


let  numberOfStudents = Number(prompt("How many student do you have? "));

let numberOfSubjects = Number(prompt("How many subject do they offer? "));


let studentData = []

let totalEachStudentScores = []
let averageEachStudentScores = []
let positionEachStudent = []

let passPerSubject = []
let failPerSubject = []

let totalStudentScores = 0;
let averageStudentScores = 0;
let overallHighestScore = studentData[0][0];
let getOverallHighestStudent = 0;
let getOverallHighestSubject = 0;

let overallLowestScore = studentData[0][0];
let getOverallLowestStudent = 0;
let getOverallLowestSubject = 0;

for(int students = 0; students < numberOfStudents; students++){
console.lo("Entering score for student " + (students + 1));
let totalScores = 0;
let averageScores = 0;

for(int subjects = 0; subjects < numberOfSubjects; subjects++){
studentData[students][subjects] = Number(prompt("Enter score for subject " + (subjects + 1)));


totalScores += studentData[students][subjects];
averageScores = totalScores / numberOfStudents;
}
totalEachStudentScores[students] = totalScores;
totalStudentScores += totalScores;
averageEachStudentScores[students] = averageScores;
averageStudentScores += averageScores;
}



for(int student = 0; student < numberOfStudents; student++){
let pos = 1;

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

console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

console.log("%-10s", "STUDENTS");

for(int subjectHeading = 1; subjectHeading <= numberOfSubjects; subjectHeading++){
console.log("%10s", "SUB" + subjectHeading);
}

console.log("%10s%10s%10s%n", "TOT", "AVE", "POS");

console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

for(int displayStudent = 0; displayStudent < numberOfStudents; displayStudent++){
console.log("%-10s", "Student" + (displayStudent + 1));

for(int displaySubject = 0; displaySubject < numberOfSubjects; displaySubject++){
console.log("%10d",studentData[displayStudent][displaySubject]);

}
console.log("%10d", totalEachStudentScores[displayStudent]);

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

if(totalEachStudentScores[counter] < bestGraduatingStudent){
bestGraduatingStudent = totalEachStudentScores[counter];
getBGS = counter;
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
