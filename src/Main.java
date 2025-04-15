import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList란 클래스로 List 생성 시, 반환 받는 자료형이 무조건 문자열 형식으로 지정
        List<String> names = new ArrayList<>();
        names.add("David");
        names.add("Emily");
        names.add("James");
        names.add("Chris");
        System.out.println(names);

        //자바에서 Array와 List의 차이
        //Array: 고정형, 값 추가 불가
        //List : 가변형, 값 추가 가능
    }
}

