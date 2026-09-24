package samplearrays;

public class CourseNumbersArray {
    public static int [] AddCourse(int c, int[] courses){
        int [] updatedCourses = new int [courses.length+1];
        for(int i=0;i<courses.length;i++){
            updatedCourses[i]=courses[i];
        }
        updatedCourses[courses.length]=c;
        return updatedCourses;
    }
    public static void printArray(int[]arr){
        for (int k : arr) {
            System.out.println(k);
        }
    }
    public static boolean Contains(int[]arr, int x){
        for (int k : arr) {
            if (k==x){return true;}
        }
        return false;
    }
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        registeredCourses = AddCourse(2026,registeredCourses);
        printArray(registeredCourses);
        System.out.println(Contains(registeredCourses,3000));
        System.out.println(Contains(registeredCourses,2150));
    }
}
