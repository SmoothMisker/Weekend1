import java.util.*;

public class Assignment2 {
    @FunctionalInterface
    interface right{
        List<Integer> mostRight(List<Integer> x);
    }

    public static void main(String [] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(20);
        list.add(23);
        list.add(45);

        right r = (List<Integer> nums) -> {
            List<Integer> list2 = new ArrayList<Integer>();
            for(int i=0; i<nums.size(); i++){
                list2.add(nums.get(i) % 10);
            }
            return list2;
        };

        System.out.print(r.mostRight(list));
    }
}
