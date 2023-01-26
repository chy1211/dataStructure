package midTerm;

import java.util.Scanner;

public class practice20 {
    public static void main(String[] args) {
        //declare four-dimensional array store student's number, name, and Department
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        String[][][] student = {
            {{"123", "Tom", "DTGD"}, {"456", "Cat", "CSIE"}, {"789", "Nana", "ASIE"}},
            {{"321", "Lim", "DBA"}, {"654", "Won", "FDD"}}
        };

        //input student's number and print student's name and Department
        System.out.println("請輸入學號:");
        inputString = scanner.nextLine();
        for (int i = 0; i < student.length; i++) {
            for (int j = 0; j < student[i].length; j++) {
                if (inputString.equals(student[i][j][0])) {
                    System.out.println("姓名:" + student[i][j][1]);
                    System.out.println("系別:" + student[i][j][2]);
                }
            }
        }
        scanner.close();
    }
}
