import java.util.Scanner;
public class test{
    public static void main(String[] args){
        int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int b[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int d[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int c;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements of first matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = s.nextInt();
            }
        }

        System.out.println("Press 1 for addition and 2 for multiplication");
        int button = s.nextInt();
        s.close();
        switch(button)
        {
            case 1:
                for(int i=0;i<3;i++){
                   for(int j=0;j<3;j++){
                       c= a[i][j]  + b[i][j];
                       System.out.print(c+" ");
                   }
                   System.out.println();
                }
            break;
            case 2:
          int sum = 0;
          for(int i=0;i<3;i++){
              for(int j=0;j<3;j++){
                  for(int k=0;k<3;k++){
                    sum = sum + (a[i][k] * b[k][j]);
                  }
                  d[i][j] = sum;
                  sum = 0;
              }
          }
          for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(d[i][j]+"  ");
            }
            System.out.println();
          }
            break;
            default : 
                System.out.println("Invalid Choice."); 
        }
    }
}
