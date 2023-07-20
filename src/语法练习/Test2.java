package 语法练习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 夏子健
 * @version 1.0
 * @date 2023/7/10 21:13
 */
public class Test2 {
    public static int myAtoi(String s) {
        boolean negative = false;
        int I = 0;
        for(int i = 0;i <s.length();i++){
            if(s.charAt(i) == ' '){
                continue;  //空格结束本次循环
            }else if(s.charAt(i) == '-'){
                negative = true;
                I = i;
                break;
            }else if(s.charAt(i) == '+'){
                I = i;
                break;
            }
            else{
                I = i - 1;
                break;
            }
        }
        List<Integer> list = new ArrayList<>();
        int v = 0;      //位数
        if (Character.isDigit(s.charAt(I + 1))) {
            for (int i = I + 1; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    v++;
                    int j = Character.getNumericValue(s.charAt(i));
                    list.add(j);
                } else {
                    break;
                }
            }
        }
        long sum = 0;
        if(list != null){
            for(int i = v - 1,j = 0;i >= 0;i--,j++){
                int k = list.get(j);
                sum += k * Math.pow(10,i);
            }
        }
        if(negative == true){
            sum *= -1;
        }
        if(sum > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sum < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int)sum;
    }
    public static void main(String[] args) {
        long i = myAtoi("-91283472332");
        System.out.println(i);
    }
}
