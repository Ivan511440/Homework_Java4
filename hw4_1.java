// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;

public class hw4_1{
     public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reverse(ls));
    }
    public static LinkedList<Integer> reverse(LinkedList<Integer> ls) {
        LinkedList<Integer> rev_ls = new LinkedList<>();
        for (int i = ls.size()-1; i > 0; i--) {
            rev_ls.add(ls.get(i));
        }
        return rev_ls;
    }
}