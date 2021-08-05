import java.util.Scanner;

class conversion{
public void convert(long m){
    long y = m / 525600;
    long r = (m % 525600); 
    long d = r / 1440;
    System.out.println(m+" minutes is approximately: "+y+" Years and "+d+" days.");
}
}

class years{
    public static void main(String[] args){
        System.out.println("Enter minutes: ");
        Scanner s = new Scanner(System.in);
        long m = s.nextLong();
        s.close();
        conversion obj = new conversion();
        obj.convert(m);
    }
}
