import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LoopStatements {
    public static void main(String[] args) {
////        불편한 구구단
//        int n = 2;
//
//        System.out.println(n*1);
//        System.out.println(n*2);
//        System.out.println(n*3);
//        System.out.println(n*4);
//        System.out.println(n*5);
//        System.out.println(n*6);
//        System.out.println(n*7);
//        System.out.println(n*8);
//        System.out.println(n*9);
//
////        while문
//        int num = 10;
//        while(num == 10){
//            System.out.println("num은 10입니다.");
//        }
//
////        while문이 종료될수 있도록 && 0~4까지 출력되도록 만들어 봅시다.
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//        }
//
//
////        do while문과 while문의 차이
//        int i = 1, j = 1;
//        while (i < 1) {
//            System.out.println("while 문이 " + i + "번째 반복 실행중입니다.");
//            i++;	// 이 부분을 삭제하면 무한 루프에 빠지게 됨.
//        }
//        System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
//
//        do {
//            System.out.println("do / while 문이 " + i + "번째 반복 실행중입니다.");
//            j++;	// 이 부분을 삭제하면 무한 루프에 빠지게 됨.
//        } while (j < 1);
//        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
//
//
////        do while문을 사용하는 경우는?
//        Scanner scan = new Scanner(System.in);
//        int num = 0 ;
//        System.out.println("양의 숫자를 입력해주세요");
//        num = scan.nextInt();
//        while(num < 0){
//            System.out.println("양의 숫자를 입력해주세요");
//            num = scan.nextInt();
//        }
//        System.out.println("입력하신 양수는 " + num + "입니다.");
//
////        위의 문장은 불필요하게 scan.nextInt()를 반복하고 있음
//        Scanner scan = new Scanner(System.in);
//        int num = 0 ;
//        do{
//            System.out.println("양의 숫자를 입력해주세요");
//            num = scan.nextInt();
//        }while(num < 0);
//
//        System.out.println("입력하신 양수는 " + num + "입니다.");
//
////        강제로 무한 loop를 만드는 경우 : 계속 돌아가는 사칙연산 프로그램
//        while(true){
//            System.out.println("어떤 사칙연산을 수행하시겠습니까? + - * / 중");
//            Scanner scan = new Scanner(System.in);
//            String calc = scan.nextLine();
//            System.out.println("두개의 숫자를 입력해주세요");
//            double num1 = scan.nextDouble();
//            double num2 = scan.nextDouble();
//            switch (calc){
//                case("+"):
//                    System.out.println(num1+num2);
//                    break;
//                case("-"):
//                    System.out.println(num1-num2);
//                    break;
//                case("*"):
//                    System.out.println(num1*num2);
//                    break;
//                case("/"):
//                    System.out.println(num1/num2);
//                    break;
//            }
//        }
//
////        for문을 이용해 0~4까지 출력되도록 만들어 봅시다. feat.while문과 비교
//        for(int i=0; i<5; i++){
//            System.out.println(i);
//        }
//
//        //        for문을 이용해 10~20까지 출력되도록 만들어 봅시다. feat.while문과 비교
//        for(int i=0; i<5; i++){
//            System.out.println(i);
//        }
//
////        자바 변수 유효 범위 : scope.java 파일 참고
//        int num =10;
//        if(num > 1){
//            int abc = 0;
//        }
//        System.out.println(abc);
//
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("for 문이 " + (i + 1) + "번째 반복 실행중입니다.");
//
//        }
//
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println("for 문이 " + (i + 1) + "번째 반복 실행중입니다.");
//
//        }
//
//
////        Enhanced for문
//        int[] arr1 = new int[]{1, 2, 3, 4, 5};
//        int[] arr2 = new int[]{1, 2, 3, 4, 5};
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] += 10; // 각 배열 요소에 10을 더함.
//        }
//        for (int e : arr2) {
//            e += 10;       // 각 배열 요소에 10을 더함.
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//
//        continue문
//        2중 for문의 효율성을 위해서 많이 사용
//        1~100까지의 숫자중에 3의 약수를 제외한 값들의 약수를 모두 print하라
//        ex)
//        1
//        1,2
//        1,2,4
//        1,5
//        for(int i=1; i<=100; i++){
//            if(i%3==0){
//                continue;
//            }
//            for(int j=1; j<=i; j++){
//                if(i % j == 0){
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println("");
//        }
//
//        break문
//        숫자 n1과 n2사이의 값 중에 약수의 개수가 5개이상인 합성수가 있다.
//        이 값중에 가장 숫자가 작은 값은?
//        int n1 = 10;
//        int n2 = 20;
//        int answer = 0;
//        for(int i=n1; i<=n2; i++){
//            int a =0;
//            for(int j=1; j<=i; j++){
//                if(i % j ==0){
//                    a ++;
//                }
//            }
//            if(a>=5){
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);
//
//        라벨문
//        int n1 = 10;
//        int n2 = 20;
//        int answer = 0;
//        loop1 :
//        for(int i=n1; i<=n2; i++){
//            int a =0;
//            loop2 :
//            for(int j=1; j<=i; j++){
//                if(i % j ==0){
//                    a ++;
//                    if(a>=5){
//                        answer = i;
//                        break loop1;
//                    }
//                }
//            }
//        }
//        System.out.println(answer);

////        selection sort
//        int[] arr = {5,1,2,3,10,8,6};
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//        bubble sort
        int[] arr = {5,1,2,3,10,8,6};


    }
}
