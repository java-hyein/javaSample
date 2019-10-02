import java.util.Scanner;
	class Tri{
		public static void main(String[] args) throws Exception{
			int width;
			int height;
				Scanner scanner = new Scanner(System.in);
			

	System.out.print("밑변 : ");
        width = scanner.nextInt();
	System.out.print("밑변 : ");
        width = scanner.nextInt();
	System.out.print("높이 : ");
        height = scanner.nextInt();
	System.out.println("삼각형의 넓이는 : " + (width * height)/ 2.0);
	}
}
