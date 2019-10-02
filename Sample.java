import java.util.Scanner;

class Sample{
   //Entry point
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double kor, eng, math;

        System.out.print(" 국어점수 입력하세요 : ");
        kor = scanner.nextDouble();
        System.out.print(" 영어점수 입력하세요 : ");
        eng = scanner.nextDouble();
        System.out.print(" 수학점수 입력하세요 : ");
        math = scanner.nextDouble();

        System.out.println("점수의 합계는 : " + (kor + eng + math) +"입니다.");
        System.out.println("점수의 평균은 : " + (kor + eng + math) / 3.0 +"입니다.");
        System.out.format("평균 둘째자리 : %.2f\n", ( kor + eng + math) / 3.0 );

      /*  int age, height;
           System.out.print("input age : ");
           age = scanner.nextInt();
           System.out.print("input height : ");
           height = scanner.nextInt();
           
           boolean result = age>=20 && height >=170;
           System.out.println("나이가 스무살이상이고 키가 170이상인 사람인가?  " + result);
        */
           
        /*int a, b;

        System.out.print("Input Number a : ");
        a = scanner.nextInt();
        System.out.print("Input Number b : ");
        b = scanner.nextInt();

        System.out.println(" a > b " + (a > b));
        System.out.println(" a >= b " + (a >= b));
        System.out.println(" a == b " + (a == b));
        System.out.println(" a =< b " + (a <= b));
        System.out.println(" a < b " + (a < b));*/
    }
}
