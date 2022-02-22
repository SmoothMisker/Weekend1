import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Lambdas {

    interface lambda1{
        String isOdd(int x);
    }

    interface lambda2{
        String isPrime(int x);

    }

    static class check{
        int x;
        check(int x){this.x = x;}
        boolean isPalindrome(){
            String original = x+"";
            String reversed = new StringBuilder(original).reverse().toString();
            if(original.equals(reversed)) return true;
            else return false;
        }
    }

    interface lambda3{
        String isPalindrome(int x);
    }

    public static void main(String[] args) {
           lambda1 x = (int y) -> {if(y%2 == 0) return y + " is Even"; else return y + " is Odd";};
           //System.out.println(x.isOdd(5));
           lambda2 number = (int y) -> {
               String prime = y +" is Prime";
               for(int i = 2; i < y; i++){
                   if(((y % i) == 0)) prime = y + " is Composite";
               }

               return prime;
           };
           //System.out.println(number.isPrime(5));
           lambda3 pal = (int y) -> {if(new check(y).isPalindrome()) return y+ " is a palindrome!!"; else return y + " is not a palindrome!";};
           //System.out.println(pal.isPalindrome(145));

           BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Enter the number of test cases: ");
                int testCase = Integer.valueOf(br.readLine());
                List<String> list= new ArrayList<>();
                System.out.println("Enter the values: ");
                    for(int i = 0; i < testCase; i++){
                        list.add(br.readLine());
                    }

                    for(String s : list){
                        if(s.charAt(0) == '1'){System.out.println(x.isOdd(Integer.valueOf(s.substring(2,s.length()))));}
                        if(s.charAt(0) == '2'){System.out.println(number.isPrime(Integer.valueOf(s.substring(2,s.length()))));}
                        if(s.charAt(0) == '3'){System.out.println(pal.isPalindrome(Integer.valueOf(s.substring(2,s.length()))));}
                    }
            } catch (IOException e) {
                e.printStackTrace();
            }



    }



}
