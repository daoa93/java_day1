import java.util.*;

public class Main {
    public static void main(String[] args) {
       //value값에 해당하는 자료형이 다양하게 들어올때는 Object로 타입 지정
        //Generic :  파리미터에 어떤 자료형의 인자값이 전달되야 되는지 호출시점에 지정하는 것
        Map<String, Object> student1 = new HashMap<>();
       student1.put("name","David");
       student1.put("age",23);
       student1.put("isFemale",false);
       student1.remove("isFemale");

       System.out.println(student1);
       System.out.println(student1.get("abc"));
    }
}

