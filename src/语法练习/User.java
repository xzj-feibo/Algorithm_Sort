package 语法练习;


import java.util.List;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/5/28 12:17
 */
public class User implements Cloneable{
    private String name;
    private Integer age;
    private List<String> list;

    public User(String name, Integer age, List<String> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String  toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }

    public void fixList(){
        list.remove(0);
    }


    @Override
    public User clone() throws CloneNotSupportedException{
        return (User)super.clone();
    }
}
