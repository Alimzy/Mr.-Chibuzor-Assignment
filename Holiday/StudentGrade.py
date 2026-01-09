numberOfStudents = int(input("How many student do you have? "))

numberOfSubjects = int(input("How many subject do they offer? "))


studentData = []

totalEachStudentScores = []
averageEachStudentScores = []
positionEachStudent = []

passPerSubject = []
failPerSubject = []

totalStudentScores = 0;
averageStudentScores = 0;
overallHighestScore = studentData[0][0];
getOverallHighestStudent = 0;
getOverallHighestSubject = 0;

overallLowestScore = studentData[0][0];
getOverallLowestStudent = 0;
getOverallLowestSubject = 0;

for students in range(0, numberOfStudents):
    print("Entering score for student " + (students + 1));
    totalScores = 0;
    averageScores = 0;

    for subjects in range(0, numberOfSubjects):
        studentData[students][subjects] = Number(prompt("Enter score for subject " + (subjects + 1)));
        totalScores += studentData[students][subjects]
        averageScores = totalScores / numberOfStudents

    totalEachStudentScores[students].append(totalScores)
    totalStudentScores += totalScores
    averageEachStudentScores[students].append(averageScores)
    averageStudentScores += averageScores;




for student in range(0,numberOfStudents):
    pos = 1

    for otherStudent range(0, numberOfStudents):
        if totalEachStudentScores[otherStudent] > totalEachStudentScores[student]:
            pos++

        if studentData[student][otherStudent] > overallHighestScore:
            overallHighestScore = studentData[student][otherStudent]
            getOverallHighestStudent = otherStudent
            getOverallHighestSubject = student


        if studentData[student][otherStudent] < overallLowestScore:
            overallHighestScore = studentData[student][otherStudent]
            getOverallLowestStudent = student
            getOverallLowestSubject = otherStudent
    

    
    positionEachStudent[student] = pos
    

print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

print(f{'STUDENT':<10})

for subjectHeading in range(0,numberOfSubject):
    print(f"%10s", "SUB" + subjectHeading);


console.log("%10s%10s%10s%n", "TOT", "AVE", "POS");

console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

for( displayStudent = 0; displayStudent < numberOfStudents; displayStudent++){
console.log("%-10s", "Student" + (displayStudent + 1));

for( displaySubject = 0; displaySubject < numberOfSubjects; displaySubject++){
console.log("%10d",studentData[displayStudent][displaySubject]);

}
console.log("%10d", totalEachStudentScores[displayStudent]);

console.log("%10d", averageEachStudentScores[displayStudent]);

console.log("%10d", positionEachStudent[displayStudent]);

console.log();
}

console.log("SUBJECT SUMMARY");



for( subject = 0; subject < numberOfSubjects; subject++){
 highestScore = studentData[0][subject];
 lowestScore = studentData[0][subject];
 totalScore = 0;
double averageScore = 0;
 numberOfPasses = 0;
 numberOfFails = 0;
 getHighestStudent = 0;
 getLowestStudent = 0;



console.log("Subject " + (subject + 1));

for( student = 0; student < numberOfStudents;student++){
 element = studentData[student][subject];
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
console.log("Highest Scoring student is:  Student " +  (getHighestStudent + 1) + " Scoring " + highestScore);
console.log("Lowest Scoring student is:  Student " + (getLowestStudent + 1) + " Scoring " + lowestScore);
console.log("Total Score is: " + totalScore);
console.log("Average Score is: " + averageScore);
console.log("Number of passes is: " + numberOfPasses);
console.log("Number of Fails is: " + numberOfFails);

console.log("");
}

console.log("");
console.log("");

 hardestSubject = 0;
 hardestSubjectFail = failPerSubject[0];;
 easiestSubject = 0;
 easiestSubjectPasses = passPerSubject[0];

for( count = 0; count < numberOfSubjects; count++){
if(passPerSubject[count] > easiestSubject){
easiestSubject = count;
easiestSubjectPasses = passPerSubject[count];
}

if(failPerSubject[count] > hardestSubject){
hardestSubject = count;
hardestSubjectFail = failPerSubject[count];
}

}

console.log("The hardest subject is subject " + (hardestSubject + 1)  + " with " + hardestSubjectFail + " failures" );

console.log("The easiest subject is subject " + (easiestSubject + 1) + " with " + easiestSubjectPasses + " Passes" );

console.log("The overall Highest score is scored by student " + getOverallHighestStudent + " in subject " + getOverallHighestSubject + " scoring " + overallHighestScore);

console.log("The overall Lowest score is scored by student " + getOverallLowestStudent + " in subject " + getOverallLowestSubject + " scoring " + overallLowestScore);


console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
console.log("CLASS SUMMARY");
console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

 bestGraduatingStudent = totalEachStudentScores[0];
 worstGraduatingStudent = totalEachStudentScores[0];

 getBGS = 0;
 getWGS = 0;


for( counter = 0; counter < numberOfStudents; counter++){



if(totalEachStudentScores[counter] > bestGraduatingStudent){
bestGraduatingStudent = totalEachStudentScores[counter];
getBGS = counter;
}

if(totalEachStudentScores[counter] < bestGraduatingStudent){
bestGraduatingStudent = totalEachStudentScores[counter];
getBGS = counter;
}
}

console.log("");    
console.log("Best Graduating Student is: Student " + (getBGS + 1) + " Scoring " + bestGraduatingStudent);
console.log("");
console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
console.log("");
console.log("");

console.log("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
console.log("");
console.log("Worst Graduating Student is: Student " + (getWGS + 1) + " Scoring " + worstGraduatingStudent);
console.log("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
console.log("");
console.log("");

console.log(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
console.log("Class total Score is: " + totalStudentScores);
console.log("Class Average Score is: " + averageStudentScores);
}
} 
