import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * @author: Cloud
 * @create: 2020/6/24 14:55:45
 */
public class test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int size = list.size();
//        list1.add(list.get(size-1));
        Integer remove = list.remove(size - 1);
//        list1.add(list.remove(size-1));
        for (Integer i : list1) {
            System.out.print(i);
        }
        System.out.println();
        for (Integer j : list) {
            System.out.print(j+" ");
        }
    }
}
