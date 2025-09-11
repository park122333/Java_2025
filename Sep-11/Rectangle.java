package basic;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("높이 입력: ");
        int height = scan.nextInt();
        System.out.print("너비 입력: ");
        int width = scan.nextInt();
        int rect = height * width;
        System.out.print("높이 = "+height+" 너비 = "+width+" 넓이 = "+rect);
        scan.close();
    }
}
