package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        if(students.length==0){
            return null;
        }
        Student oldest = students[0];
        for(Student s: students){if(s.getAge()>=oldest.getAge()){oldest=s;}}
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int count=0;
        for(Student s: students){if(s.getAge()>=18){count++;}}
        return count;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        if (students.length==0){return Double.NaN;}
        double sum=0;
        for(Student s: students){sum+=s.getGrade();}
        return sum/students.length;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s: students){if(s.getName().equals(name)){return s;}}
        return null;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s: students){if(s.getGrade()>=15){System.out.println(s);}}
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for(Student s: students){
            if(s.getId()==id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for(int i=0;i< students.length;i++){
            for(int j=i+1;j< students.length;j++){
                if (students[i].getName().equals(students[j].getName())){
                    return true;
                }
            }
        }return false;
    }
    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] temp = new Student[students.length+1];
        for(int i=0;i<students.length;i++) {temp[i]=students[i];}
        temp[students.length]=newStudent;
        return temp;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr=new Student[5];
        arr[0]=new Student(1,"Student1",19,19);
        arr[1]=new Student(2,"Student2",20,18);
        arr[2]=new Student(3,"Student3",21,20);
        arr[3]=new Student(4,"Dina",20,19);
        arr[4]=new Student(5,"Student5",19,18);


        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        System.out.println("Oldest : " + ManageStudent.findOldest(arr));

        // 3) Count adults
        System.out.println("Adults count : " + ManageStudent.countAdults(arr));
        // 4) Average grade
        System.out.println("Average grade : " + ManageStudent.averageGrade(arr));

        // 5) Find by name
        if(ManageStudent.findStudentByName(arr,"Student3")!=null){
            System.out.println("Student3 found");
        }else{
            System.out.println("Student3 not found");
        }

        // 6) Sort by grade desc
        // sort function
        ManageStudent.sortByGradeDesc(arr);
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        boolean updated = ManageStudent.updateGrade(arr,4,18);
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names
        if(ManageStudent.hasDuplicateNames(arr)){
            System.out.println("Duplicate found");
        }else {
            System.out.println("No duplicate found");
        }
        // 10) Append new student
        arr=ManageStudent.appendStudent(arr,new Student(6,"Student6",20,18));

        //11 The class question
        Student[][] classrooms= new Student[2][3];

        classrooms[0][0]=arr[0];
        classrooms[0][1]=arr[1];
        classrooms[0][2]=arr[2];
        classrooms[1][0]=arr[3];
        classrooms[1][1]=arr[4];
        classrooms[1][2]=arr[5];

        for(int i=0;i<classrooms.length;i++){
            System.out.println("All student in class : "+i);
            for (int j=0;j<classrooms[i].length;j++){
                System.out.println(classrooms[i][j]);
            }
        }

        for(int i=0;i<classrooms.length;i++){
            System.out.println("Best student in class : "+i);
            ManageStudent.sortByGradeDesc(classrooms[i]);
            System.out.println(classrooms[i][0]);
        }
    }
}

