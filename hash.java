import java.util.Scanner;
public class hash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] N_line = new String[N];

        for (int i = 0; i < N; i++){
                N_line[i]=sc.next();
        }
        for(int i=0;i<N;i++){
            System.out.println(N_line[i]);
        }
        System.out.println("type the string:");
                String x =sc.next();
                 
 
            for (int i = 0;i< N; i++){
                if ( N_line[i].equals(x)){
                    System.out.println("Found");
                    break;
                } 
                else{System.out.println("not_found");
                break;}
            }
    }
}    

