import java.util.*;

public class Assignment4 {
    @FunctionalInterface
    interface Remove{
        List<String> remove(List<String> x);
    }

    public static void main(String [] args){
        Remove r = (List<String> list) -> {
            List<String> answer = new ArrayList<>();
            for(String j : list) {
                String after = "";
                for (char i : j.toLowerCase().toCharArray()) {
                    if (!(i == 'x')) after += i;
                }
            answer.add(after);
            }
            return answer;
        };

        List<String> test = new ArrayList<>();
        test.add("ax");
        test.add("bb");
        test.add("cx");

        System.out.println(r.remove(test));
    }
}
