import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
    //  int number;

     //  number = scan.nextInt(); //동기식 blocked IO
        //ex 01
      // System.out.println(number % 2 == 0 ? "짝수 " : "홀수 ");
       //ex 02
    //  number % 2 == 0 ? System.out.println("짝수") : System.out.println("홀수");
      /* if (number % 2 == 0)
           System.out.println("짝수");
       else
           System.out.println("홀수");*/

//숫자 N (1과 9사이의 숫자)를 입력받아 구구단을 출력하시오.
/*
        do {
                System.out.println("1과 9 사이의 숫자를 입력하세요");
                int num = scan.nextInt();
                //입력된 숫자가 1보다 작고, 9보다 크다면?
                if(num < 1 || num > 9)
                   continue;
                for(int i = 1; i <=9; i++){
                    System.out.format("%d x %d = %d\n", num, i,(num * i)); 
                }
                System.out.println("===================================");
        } while(true);
        
        
*/

        //for문 으로 구구단 찍기

/*            for(int num = 1; num <= 9; num++) {
                for(int i = 1; i <= 9; i++){
                    System.out.format("%d x %d = %d\n", num, i, (num * i));
            }
                    System.out.println("==================");
        }
*/
//별찍기
// format 문자열
// %[width][format]
// width = 출력폭
// format = [d, f, s, x, o]
// o = 8진수
// d = 10진수 정수
// x = 16진수
// f = 실수
// s = 문자열
//
    
    //n을 입력 받을 때
/*    String pattern = "*";
      int n = scan.nextInt(); 
        for(int i = 1; i <= n; i++){ 
       System.out.format(String.format("%%%ds\n", n), pattern);  //%% -> %  ,  $d -> 입력받은 수(10)  ,  s는 String 이라는 뜻  그대로 나옴    =    %10s 
         pattern += "*";
        }   
    }   
}



/*        
        //n 이 10으로 정해졌을때 
String pattern = "*";
    int n = 10;
        for(int i = 1; i <= n; i++){
            System.out.format("%10s\n", pattern);
            pattern +="*";
        }
    }
}

*/

//문자열을 입력받아 숫자로만 이루어졌는지 확인하시오

 /*   String temp;
    boolean isDigit = true;


        temp = scan.next();
    
        try {
            int value = Integer.parselnt(temp);
        }catch (Exception ex) {
        }

        temp.trim();

    for(int i = 0; i < temp.length(); i++){
         char ch = temp.charAt(i);
        System.out.format("%c %b\n", ch, Character.isDigit(ch));
        
       if(!Character.isDigit(ch)) {
           isDigit = false;
           break;
            }
        }   */
    }

}




