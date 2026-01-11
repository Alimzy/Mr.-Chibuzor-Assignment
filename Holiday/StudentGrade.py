number_of_students = int(input("How many student do you have? "))

number_of_subjects = int(input("How many subject do they offer? "))


student_data = []

total_each_student_scores = []
average_each_student_scores = []
position_each_student = []

pass_per_subject = []
fail_per_subject = []

total_student_scores = 0
average_student_scores = 0
overall_highest_score = 0
get_overall_highest_student = 0
get_overall_highest_subject = 0

overall_lowest_score = 0
get_overall_lowest_student = 0
get_overall_lowest_subject = 0

for students in range(0, number_of_students):
    print("Entering score for student " , (students + 1))
    student_data.append([])
    total_scores = 0;
    average_scores = 0;

    for subjects in range(0, number_of_subjects):
        score = int(input(f"Enter score for subject {subjects + 1} : "))
        student_data[students].append(score)
        total_scores += score
        average_scores = total_scores / number_of_students

    total_each_student_scores.append(total_scores)
    total_student_scores += total_scores
    average_each_student_scores.append(average_scores)
    average_student_scores += average_scores;




for student in range(0,number_of_students):
    pos = 1

    for otherStudent in range(0, number_of_students):
        if total_each_student_scores[otherStudent] > total_each_student_scores[student]:
            pos += 1

        if student_data[student][otherStudent] > overall_highest_score:
            overall_highest_score = student_data[student][otherStudent]
            get_overall_highest_student = otherStudent
            get_overall_highest_subject = student


        if student_data[student][otherStudent] < overall_lowest_score:
            overall_highest_score = student_data[student][otherStudent]
            get_overall_lowest_student = student
            get_overall_lowest_subject = otherStudent
    

    
    position_each_student.append(pos)
    

print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

print(f"{'STUDENT':<10}",end="")

for subject_heading in range(0,number_of_subjects):
    print(f"{'SUB' + str(subject_heading + 1): >10} ",end="")
 

print(f"{'TOT': >10} {'AVE':>10} {'POS':>10}")

print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")


for display_student in range(0,number_of_students):
    print(f"{'Student' + str(display_student + 1)}",end="")

    for display_subject in range(0,number_of_subjects):
        print(f"{student_data[display_student][display_subject]:>10}",end="")


    print(f"{total_each_student_scores[display_student]:>10}",end="")

    print(f"{average_each_student_scores[display_student]:>10}",end="")

    print(f"{position_each_student[display_student]:>10}",end="")

    print();




print("SUBJECT SUMMARY")



for subject in range(0,number_of_subjects):
    highest_score = student_data[0][subject]
    lowest_score = student_data[0][subject]
    total_score = 0;
    average_score = 0;
    number_of_passes = 0;
    number_of_fails = 0;
    get_highest_student = 0;
    get_lowest_student = 0;

    print("Subject " , (subject + 1))

    for student in range(0,number_of_students):
        element = student_data[student][subject];
        total_score += element;
        if element >= 50:
            number_of_passes += 1
        if element < 50:
            number_of_fails += 1
        if element > highest_score:
            highest_score = element
            get_highest_student = student
        if element < lowest_score:
            lowest_score = element
            get_lowest_student = student;


    pass_per_subject.append(number_of_passes)
    fail_per_subject.append(number_of_fails)

    average_score = total_score / number_of_students;
    print("Highest Scoring student is:  Student " ,  (get_highest_student + 1) , " Scoring " , highest_score)
    print("Lowest Scoring student is:  Student " , (get_lowest_student + 1) , " Scoring " , lowest_score)
    print("Total Score is: " , total_score)
    print("Average Score is: " , average_score)
    print("Number of passes is: " , number_of_passes)
    print("Number of Fails is: " , number_of_fails)

    print("")


print("")
print("")

hardest_subject = 0
hardest_subject_fail = fail_per_subject[0]
easiest_subject = 0
easiest_subject_passes = pass_per_subject[0]

for  count in range(0,number_of_subjects):
    if pass_per_subject[count] > easiest_subject:
        easiest_subject = count
        easiest_subject_passes = pass_per_subject[count]


    if fail_per_subject[count] > hardest_subject:
        hardest_subject = count
        hardest_subject_fail = fail_per_subject[count]


print("The hardest subject is subject " , (hardest_subject + 1)  , " with " , hardest_subject_fail , " failures" )

print("The easiest subject is subject " , (easiest_subject + 1) , " with " , easiest_subject_passes , " Passes" )

print("The overall Highest score is scored by student " , get_overall_highest_student , " in subject " , get_overall_highest_subject , " scoring " , overall_highest_score)

print("The overall Lowest score is scored by student " , get_overall_lowest_student , " in subject " , get_overall_lowest_subject , " scoring " , overall_lowest_score)


print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("CLASS SUMMARY")
print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

best_graduating_student = total_each_student_scores[0]
worst_graduating_student = total_each_student_scores[0]

get_BGS = 0
get_WGS = 0


for counter in range(0,number_of_students):
    if total_each_student_scores[counter] > best_graduating_student:
        best_graduating_student = total_each_student_scores[counter]
        get_BGS = counter

    if total_each_student_scores[counter] < worst_graduating_student:
        worst_graduating_student = total_each_student_scores[counter]
        get_WGS = counter
    
    

print("")    
print("Best Graduating Student is: Student " , (get_BGS + 1) , " Scoring " , best_graduating_student)
print("")
print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("")
print("")

print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
print("")
print("Worst Graduating Student is: Student " , (get_WGS + 1) , " Scoring " , worst_graduating_student)
print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
print("")
print("")

print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("Class total Score is: " , total_student_scores)
print("Class Average Score is: " , average_student_scores)

