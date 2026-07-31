interface LastDigit{
    int sum(int a,int b);
}

public class Main{
    public static void main(String[] args){

        LastDigit ld=(a,b)->(a%10)+(b%10);

        System.out.println(ld.sum(123,456));
    }
}

OUTPUT:
9
