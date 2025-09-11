package basic;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        final float PI = 3.14f;
        Scanner scan = new Scanner(System.in);
        System.out.print("반지름: ");
        float rad = scan.nextFloat();
        float circleArea = rad * rad * PI;
        System.out.print("원넓이 = "+circleArea);
        scan.close();
    }
}
