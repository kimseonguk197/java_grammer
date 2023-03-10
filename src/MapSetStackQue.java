
import java.util.*;
import java.util.stream.Collectors;

public class MapSetStackQue {
    public static void main(String[] args) {

//        HashMap<String, String> map = new HashMap<>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.get("people"));
//        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력
//        System.out.println(map.containsKey("people"));  // true 출력
//        System.out.println(map);
//        System.out.println(map.keySet());  // [baseball, people] 출력
//
////        Enhanced for 문을 통한 출력
//        for (String e : map.keySet()) {
//            System.out.print(e + " ");
//        }
////       iterator() 메소드를 이용한 요소의 출력
//        Iterator<String> iter = map.values().iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }


////        완주하지 못한 선수
//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};
//        String answer = "";
//        Map<String, Integer> m = new HashMap<>();
//        for(String a : participant){
//            if(m.containsKey(a)){
//                m.put(a, m.get(a)+1);
//            }else{
//                m.put(a, 1);
//            }
//        }
//        for(String a : completion){
//            if((m.get(a) > 1)){
//                m.put(a, m.get(a)-1);
//            }else if(m.get(a) == 1){
//                m.remove(a);
//            }
//        }
//        answer = m.keySet().stream().collect(Collectors.toList()).get(0);
//        System.out.println(answer);

////        Set
//        HashSet<String> set = new HashSet<>();
//        set.add("H");
//        set.add("e");
//        set.add("l");
//        set.add("l");
//        set.add("o");
//        System.out.println(set);  //  [e, H, l, o] 출력
//        HashSet<String> set2 = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
//        System.out.println(set2);  //  [e, H, l, o] 출력
//
//
//        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
//        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
//
////        교집합
//        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 HashSet 객체를 Copy하여 생성 intersection 생성
//        intersection.retainAll(s2);  // 교집합 수행
//        System.out.println(intersection);  // [4, 5, 6] 출력
//
////        합집합
//        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
//        union.addAll(s2); // 합집합 수행
//        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
//
////        차집합
//        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
//        substract.removeAll(s2); // 차집합 수행
//        System.out.println(substract);  // [1, 2, 3] 출력

////        add함수
//        HashSet<String> set = new HashSet<>();
//        set.add("Jump");
//        set.add("To");
//        set.add("Java");
//        System.out.println(set);  // [Java, To, Jump] 출력

//////        addAll함수
//        HashSet<String> set = new HashSet<>();
//        set.add("Jump");
//        set.addAll(Arrays.asList("To", "Java"));
//        System.out.println(set);  // [Java, To, Jump] 출력
////        제거
//        set.remove("To");
//        System.out.println(set);  // [Java, Jump] 출력
//
////        Enhanced for 문을 통한 출력
//        for (String e : set) {
//            System.out.print(e + " ");
//        }
////       iterator() 메소드를 이용한 요소의 출력
//        Iterator<String> iter = set.iterator();
//        while (iter.hasNext()) {
//            System.out.print(iter.next() + " ");
//        }

////        stack 선언
//        Stack<Integer> st = new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        System.out.println(st);
//        System.out.println(st.peek());
////        제거와 꺼냄을 동시에
//        System.out.println(st.pop());
//        System.out.println(st);


////        queue 선언
//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        System.out.println(q);
//        System.out.println(q.peek());
////        제거와 꺼냄을 동시에
//        System.out.println(q.poll());
//        System.out.println(q);

////        ArrayDeque
//        Deque<Integer> dq = new ArrayDeque<>();
//        dq.addFirst(10);
//        dq.addFirst(20);
//        System.out.println(dq);
//        dq.addLast(30);
//        dq.addLast(10);
//        System.out.println(dq);
//        System.out.println(dq.peekFirst());
//        System.out.println(dq.peekLast());

////        2차원 배열
//        int[][] arr = {{1,2,3}, {10,20,30}};
//        int[] arr_new = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            int total = 0;
//            for(int j=0; j<arr[i].length; j++){
//                total += arr[i][j];
//            }
//            arr_new[i] = total / arr[i].length;
//        }
//        System.out.println(Arrays.toString(arr_new));

////        가변배열
//        int[][] arr = {{1,2,3}, {10,20,30}, {100, 200, 300, 400}, {1000, 2000, 3000, 4000,5000}};
//        int[] arr_new = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            int total = 0;
//            for(int j=0; j<arr[i].length; j++){
//                total += arr[i][j];
//            }
//            arr_new[i] = total / arr[i].length;
//        }
//        System.out.println(Arrays.toString(arr_new));


    }
}
