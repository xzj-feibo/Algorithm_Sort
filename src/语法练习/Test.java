package 语法练习;

import java.util.*;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/5/28 12:27
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        User user = new User("xzj", 13,list);
        User clone = user.clone();
        System.out.println(user==clone);
        System.out.println(clone);
        user.fixList();
        System.out.println(user);
        System.out.println(clone);
        StringBuilder a=new StringBuilder("greagera");

    }
}
