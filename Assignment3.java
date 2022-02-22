import java.util.*;
public class Assignment3 {
    @FunctionalInterface
    interface multipyBy2{
        List<Integer> multiply(List<Integer> x);
    }

    public static void main(String [] args){

        multipyBy2 dub = (List<Integer> y) -> {List<Integer> z = new ArrayList<>();  for(int i : y){z.add(i*2);} return z;};

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(dub.multiply(list));
    }
}
