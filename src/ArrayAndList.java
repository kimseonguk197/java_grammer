//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class ArrayAndList {
//    public static void main(String[] args) {
//
//////        int집합
////        int[] odds = {1, 3, 5, 7, 9};
//////        String집합
////        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
//////        아래 방식은 불가
////        String[] weeks2 = new String[];
//////        아래 방식은 가능
////        String[] weeks3 = new String[7];
//////        배열의 사용
////        System.out.println(weeks[3]);
//
//
//////        배열의 초기값
////        int[] num = new int[10];
////        char[] ch = new char[10];
////        String[] st = new String[10];
////        System.out.println(num[0]);
////        System.out.println(ch[0]);
////        System.out.println(st[0]);
//
//////        배열을 이용한 총합, 평균값
////        int[] grade = new int[]{85, 65, 90}; // 길이가 3인 int형 배열을 선언과 동시에 초기화
////        int sum = 0;
////        for (int i = 0; i < grade.length; i++) {
////            sum += grade[i];
////        }
////        System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");
////        System.out.println("이 학생의 평균은 " + (sum / grade.length) + "입니다.");
//
//////        Arrays클래스 메소드
////      선택정렬
////        int[] a = {2,1,3,5,1};
////        for(int i=0; i<a.length-1; i++){
////            for(int j=i+1; j<a.length; j++){
////                if(a[i]>a[j]){
////                    int temp = a[j];
////                    a[j] =a[i];
////                    a[i] = temp;
////                }
////            }
////        }
////        System.out.println(Arrays.toString(a));
//
//
//
////        bubble sort
////        int[] a = {2,1,3,5,1};
////        for(int i=0; i<a.length; i++){
////            for(int j=0; j<a.length-i-1; j++){
////                if(a[j]>a[j+1]){
////                    int temp = a[j+1];
////                    a[j+1] =a[j];
////                    a[j] = temp;
////                }
////            }
////        }
////        System.out.println(Arrays.toString(a));
//
////        bubble sort
////        int[] a = {2,1,3,5,1};
////        int size = a.length;
////        // round는 배열 크기 - 1 만큼 진행됨
////        for(int i = 1; i < size; i++) {
////            boolean swapped = false;
////            // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
////            for(int j = 0; j < size - i; j++) {
////                /*
////                 *  현재 원소가 다음 원소보다 클 경우
////                 *  서로 원소의 위치를 교환하고
////                 *  비교수행을 했다는 표시로 swapped 변수를 true로 변경한다.
////                 */
////                if(a[j] > a [j + 1]) {
////                    int temp = a[j];
////                    a[j] = a[j+1];
////                    a[j+1] = temp;
////                    swapped = true;
////                }
////            }
////            /*
////             * 만약 swap된적이 없다면 이미 정렬되었다는 의미이므로
////             * 반복문을 종료한다.
////             */
////            if(swapped == false) {
////                break;
////            }
////        }
////        System.out.println(Arrays.toString(a));
//
//
//////        binarySearch
////        int[] arr = {3,4,7,9,10};
////        Arrays.sort(arr);
////        System.out.println(Arrays.binarySearch(arr, 8));
//
//////        list기본
////        int[] abc = {1};
////        ArrayList<String> pitches = new ArrayList<String>();
////        pitches.add("123");
//////        특정 index에도 삽입이 가능
////        pitches.add("124");
////        pitches.add("125");
////        pitches.add(2, "126");
////        pitches.add("123");
////        System.out.println(pitches.get(1));
////        System.out.println(pitches.size());
////        System.out.println(pitches);
////        pitches.remove("123");
////        System.out.println(pitches);
////        System.out.println(pitches.contains("127"));
////        pitches.sort(Comparator.naturalOrder());
////        pitches.sort(Comparator.reverseOrder());
////        System.out.println(pitches);
//
//
//////        1.String 배열을 list로 (asList)
////        String[] data = {"138", "129", "142"};
////        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
////        List<String> pitches3 = Arrays.stream(data).collect(Collectors.toList());
//////        2.int 배열을 list로 (Stream)
//////        int 자체로는 Collection에 못 담기 때문에 Integer 클래스로 변환하여 List<Integer> 로 담기 위해 boxed() 메소드 사용
//////        boxed() 메소드는 IntStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입(예: IntStream -> Stream<Integer>)으로 전환하여 전용으로 실행
////        int[] data2 = {1,2,3};
////        List<Integer> pitches4 = Arrays.stream(data2).boxed().collect(Collectors.toList());
//////        3.String list를 배열로
////        String[] test = pitches.stream().toArray(a->new String[a]);
////        String[] test2 = pitches.toArray(new String[pitches.size()]);
//
//////        4.int list를 배열로
//////        메소드 참조 표현식은  a -> a.intValue() 이렇게 사용해도 되는 것을, 아래와 같이
//////        [인스턴스]::[메소드명(또는 new)] 이런식으로,  파라미터를 중복해서 쓰기 싫을 때 사용
////        int[] new_data2 = pitches4.stream().mapToInt(a->a.intValue()).toArray();
////        System.out.println(Arrays.toString(new_data2));
//
//
//////          List와 Array에서 문자열로
////        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
////        String[] pitches_arr = {"138", "129", "142"};
////        String result = String.join("", pitches);
////        String result2 = String.join("", pitches_arr);
////        System.out.println(result);  // 138,129,142 출력
////        System.out.println(result2);  // 138,129,142 출력
//
//////      배열복사
////        int[] arr = {3,4,7,8,10};
////        int[] new_arr = Arrays.copyOf(arr, 3);
//////        new_arr = Arrays.copyOf(arr, 10);
////        new_arr = Arrays.copyOfRange(arr, 1,3);
////        System.out.println(Arrays.toString(new_arr));
//
////      copyof활용문제 : 많은 숫자가 있다고 가정
////        int[] arr = {11,14,1,3,12,11,15,16,17,11,14,1,3,12,11,15,16,17};
////        짝수값만 담은 배열을 return 해당 배열에 0이 담겨 있으면 안됨.
//////        방법1 : list에 담은 후 array 변환
////        List<Integer> lst = new ArrayList<>();
////        for(int a : arr){
////            if(a % 2 == 0){
////                lst.add(a);
////            }
////        }
////        int[] arr_new = lst.stream().mapToInt(a->a.intValue()).toArray();
////        System.out.println(Arrays.toString(arr_new));
//
//////        방법2 : temp array 배열을 선언하여, copy를 통해 값 담기
////        int[] temp = new int[arr.length];
////        int arr_new_num = 0;
////        for(int a : arr){
////            if(a % 2 == 0){
////                temp[arr_new_num] = a;
////                arr_new_num++;
////            }
////        }
////        int[] arr_new = new int[arr_new_num];
////        arr_new = Arrays.copyOfRange(temp, 0, arr_new_num);
////        System.out.println(Arrays.toString(arr_new));
//
//
//
//    }
//}
