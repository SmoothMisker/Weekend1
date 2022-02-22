import java.util.*;

public class Assignment5 {
    static List<Integer> list = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    static int target = 0;
    static int added = 0;
    static int total = 0;

    public static void main(String [] args){
        int [] arr = {0, 2, 4, 8, 10};
        int [] arr2 = {0, 1, 2, 4, 8, 1, 14};
        int [] arr3 = {0, 2, 4, 4, 8, 14};
        int [] arr4 = {1, 2, 2, 2, 2, 5, 2};
        target = 6;

        int [] modifiedArr = remove(arr4);                  //checks the array with duplicates
        boolean original = groupSumClump(arr4);
        added= 0;                           //reset added
        total = 0;                          //reset total
        boolean modified = groupSumClump(modifiedArr);                //checks the array without duplicates
        boolean finalAnswer = original || modified;
        System.out.println(finalAnswer);

    }

    public static boolean groupSumClump(int[] arr){

        if (added < arr.length-1) {

            total += arr[added];
            added += 1;
            list.add(total);

            if (target == total) {
                return true;
            }
            if (groupSumClump(arr))
                return true;
        }
        return false;
    }
//method to remove duplicate values
    public static int[] remove(int [] arr) {
        boolean hasDup = false;
        List<Integer> returnList = new ArrayList<>();
        int sameSum = 0;
        int next = 0;

        for (int i = next + 1; i < arr.length; i++) {
            if (arr[i] == arr[next]) {
                list2.add(i);
                sameSum++;
                hasDup = true;
            }
            next++;
        }

        if(hasDup){
            int max = list2.get(list2.size() - 1);
            int min = max - (sameSum + 1);

            for (int i = 0; i < arr.length; i++) {
                if (i <= min || i > max) {
                    returnList.add(arr[i]);
                }
            }

            int[] arr2 = new int[returnList.size()];
            for (int i = 0; i < returnList.size(); i++) {
                arr2[i] = returnList.get(i);
            }
            return arr2;
        }
        else
            return arr;
    }
}
