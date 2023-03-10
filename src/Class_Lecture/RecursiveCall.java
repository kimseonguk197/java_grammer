package Class_Lecture;//package Class_Lecture;
//
//import java.util.Arrays;
//
//public class RecursiveCall {
//    public static void main(String[] args) {
//
//////        result결과 구하는 방법1
////        int result = 0;
////        int n = 10;
////        for (int i = 1; i <= n; i++) {
////            result += i;
////        }
////        System.out.println(result);
//
//////        방법2.재귀함수 호출
////        int total = add_acc(10);
////        System.out.println(total);
//
////        재귀함수를 사용할수 밖에 없는 상황예시
////        다음 배열을 2개의 숫자로 조합할수 있는 경우의 수는?
////        숫자 1개의 조합
//        int[] arr = {10, 20, 30, 40};
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }
//
////        다음 배열을 2개의 숫자로 조합할수 있는 경우의 수는?
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                System.out.println(arr[i]+" "+arr[j]);
//            }
//        }
////        3개 숫자의 조합
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//                for(int k=j+1; k<arr.length; k++){
//                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
//                }
//            }
//        }
//
////        일단 현재의 코드도 중복코드가 반복되어 굉장히 비효율적
////        그렇다면, 숫자가 위와같이 4개로 주어진것이 아닌 알수 없다면, 최대한의 조합을 만들어야 한다면?
////        그것은 재귀가 아니면 할수없음.
//
//
////        먼저 위 코드를 변형해보자.
////        int[] arr = {10, 20, 30, 40};
//
////        1개짜리 배열
////        int[] new_arr = new int[1];
////        int num = 0;
////        for(int i=0; i<arr.length; i++){
////            new_arr[num] = arr[i];
////            System.out.println(Arrays.toString(new_arr));
////        }
//
////        2개짜리 배열
////        int[] new_arr = new int[2];
////        for(int i=0; i<arr.length; i++){
////            int num = 0;
////            new_arr[num] = arr[i];
////            for(int j=i+1; j<arr.length; j++){
////                num = 1;
////                new_arr[num] = arr[j];
////                System.out.println(Arrays.toString(new_arr));
////            }
////        }
//
//////        3개짜리 배열
////        int[] new_arr = new int[3];
////        for(int i=0; i<arr.length; i++){
////            int num = 0;
////            new_arr[num] = arr[i];
////            for(int j=i+1; j<arr.length; j++){
////                num = 1;
////                new_arr[num] = arr[j];
////                for(int k=j+1; k<arr.length; k++){
////                    num = 2;
////                    new_arr[num] = arr[k];
////                    System.out.println(Arrays.toString(new_arr));
////                }
////            }
////        }
//
////        이제 재귀함수를 통해 위의 반복을 제거할 방법을 찾아보자.
////        2개짜리 조합 재귀
//        int[] arr = {10, 20, 30, 40};
//        recur(arr, new int[2], 0, 0);
//
////        그렇다면, 2개로 정해진 것이 아닌, 최대한의 조합을 만들어야 한다면?
//        int[] arr2 = {10, 20, 30, 40};
//        for(int i=1; i<=arr2.length; i++){
//            recur(arr2, new int[i], 0, 0);
//        }
//    }
//
//    static void recur(int[] arr, int[] new_arr, int start, int cnt){
//        if(cnt == new_arr.length){
//            System.out.println(Arrays.toString(new_arr));
//            return;
//        }
//        if(start == arr.length){
//            return;
//        }
//        for(int i=start; i<arr.length; i++){
//            new_arr[cnt] = arr[i];
//            recur(arr, new_arr, i+1, cnt+1);
//        }
//    }
//
//
//
////    static int add_acc(int n){
////        if(n==1){
////            return 1;
////        }
////        return n+add_acc(n-1);
////    }
//
//}
