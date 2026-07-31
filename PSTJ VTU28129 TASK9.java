interface Palindrome{
    boolean check(int n);
}

public class Main{
    public static void main(String[] args){

        Palindrome p = (n)->{

            int temp=n;
            int rev=0;

            while(temp>0){
                rev=rev*10+temp%10;
                temp/=10;
            }

            return rev==n;
        };

        System.out.println(p.check(121));
    }
}

OUTPUT:
true
false
