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
        for(Student s: students){if(s.getAge()>=oldest.getAge();){oldest=s;}}
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
        for(Student s: students){sum+=s.getGrade;}
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
        
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {

    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students


        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}

