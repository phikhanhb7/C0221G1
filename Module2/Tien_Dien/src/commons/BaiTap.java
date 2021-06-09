package commons;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        int number = 1 ;
        System.out.println("Nhập gì bạn muốn ");
        String input = scanner.nextLine();
        String[] strings = input.split("");
            for (int i = 0; i < strings.length; i++) {
                 if (!map.containsKey(strings[i])){
                     map.put(strings[i],number);

                }else {
                     map.replace(strings[i], map.get(strings[i])+1);
                 }
            }
        Set<String> strings1 = map.keySet();
            for (String set : strings1){
                System.out.println(set+ " : " + map.get(set));
            }


    }
}
