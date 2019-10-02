import java.util.Scanner;
//삼각형의 넓이 구하기
class Tri {
    public static void main(String[] args) throws Exception {
        double radius;
        double width, height;
        Scanner scan = new Scanner(System.in);

        System.out.print("Input Width :");
            width = scan.nextDouble();
        System.out.print("Input height :");
            height = scan.nextDouble();


        System.out.println("Area of triangle :"+( width * height )/2.0);
        radius = scan.nextDouble();
    }
}
