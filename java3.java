import java.util.Scanner;
public class decision_making {
    public static void main(String[] args)
    {
        System.out.println("Choose a fruit :1.apple\t 2.banana\t 3.cucumber");
        int button;
        Scanner s = new Scanner(System.in);
        button = s.nextInt();
        s.close();
        switch(button)
        {
            case 1: System.out.println("You choose apple");
            break;
            case 2: System.out.println("You choose banana");
            break;
            case 3: System.out.println("You choose cucumber");
            break;
            default: System.out.println("invalid");
        }
    }
}
