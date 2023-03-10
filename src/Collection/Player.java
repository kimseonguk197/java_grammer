package Collection;

import java.util.*;

public class Player implements Comparable<Player> {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 899));
        players.add(new Player("Bob", 982));
        players.add(new Player("Chloe", 1090));
        players.add(new Player("Dale", 982));
        players.add(new Player("Eric", 1018));
//        특정 타입의 객체는 기본형 데이터와 달리 정렬 기준이 없으면 정렬을 할 수가 없다.
//        Collections.sort(players); // Compile error!
        for(Player p : players){
            System.out.println(p.getName());
            System.out.println(p.getScore());
        }
        List<String> lst = new ArrayList<>();
        lst.add("hello3");
        lst.add("hello2");
        lst.add("hello4");
//        System.out.println(lst);
        Collections.sort(lst);
        Collections.sort(lst, Comparator.reverseOrder());
//        System.out.println(lst);


//        Comparator사용시 상속받아 익명클래스를 만들어 사용
        Comparator<Player> comparator = new Comparator<Player>() {
            @Override
            public int compare(Player a, Player b) {
                return b.getScore() - a.getScore();
            }
        };

        Comparator<Player> comparator2 = (a, b) -> b.getScore() - a.getScore();

        Collections.sort(players, comparator);
        for(Player p : players){
            System.out.println(p.getName());
            System.out.println(p.getScore());
        }

//        람다함수를 사용해 더욱 간결하게
//        람다함수란 익명함수
//        만들어진 comparator객체를 사용하는 것이 아니므로, 객체자체에 영향을 끼치지 않고, 일회용 함수만을 가져다 씀. 이것을 함수형 프로그래밍이라 함.
//        즉, 전달받은 인자값을 중심으로 로직을 수행하고 결과값을 리턴하는 프로그래밍 방식을 함수형 프로그래밍이라함.
        Collections.sort(players, (a, b) -> b.getScore() - a.getScore());



    }

    @Override
    public int compareTo(Player o) {
//        getScore는 앞의 값대상 o는 뒤에값
        return getScore() - o.getScore();
    }
}
