//package File_handling_assignment;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class test_file {
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(new FileReader("C:\\Users\\tdhurwe\\Documents\\java assignment solution\\StudentData.csv"));
//            ArrayList<Student> students = new ArrayList<Student>();
//            int i = 0;
//            while (sc.hasNext()) {
//                String[] str = sc.nextLine().split(",");
//                if (i != 0) {
//                    students.add(new Student(str[0], str[1], str[2], str[3], Integer.parseInt(str[4])));
//                    // System.out.println(Arrays.toString(str));
//                }
//                i++;
//            }
//            Collections.sort(students, (a, b)-> a.getRank()-b.getRank());
//            // System.out.println(students.toString());
//            for (i = 0; i < Math.min(5, students.size()); i++) {
//                System.out.println(students.get(i));
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//
//    }
//}
//}
//class Student {
//    private String name, regNo10, regNo12, btechRegNo;
//    private int rank;
//
//    public Student(String name, String regNo10, String regNo12, String btechRegNo, int rank) {
//        this.name = name;
//        this.regNo10 = regNo10;
//        this.regNo12 = regNo12;
//        this.btechRegNo = btechRegNo;
//        this.rank = rank;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRegNo10() {
//        return regNo10;
//    }
//
//    public String getRegNo12() {
//        return regNo12;
//    }
//
//    public String getBtechRegNo() {
//        return btechRegNo;
//    }
//}
