import java.util.Scanner;
public class climbingstairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println(1);
            return;
        }
        int climb[] = new int[n+1];
        climb[1] = 1;
        climb[2] = 2;
         for (int i = 3; i <= n; i++){
         climb[i] = climb[i-1] + climb[i-2];
         

        }
        System.out.println(climb[n]);
        sc.close();
    }
}
