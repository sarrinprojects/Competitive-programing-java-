import java.util.Scanner;
public class z_algm2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text");
        String text = sc.nextLine();
        System.out.println("enter the pattern");
        String pattern = sc.nextLine();
        

        int count = 0;

        for (int i = 0; i <= text.length() - pattern.length(); i++){
                int j;
                for(j = 0; j < pattern.length(); j++){
                    if (text.charAt( j + i )!= pattern.charAt(j)){
                        break;
                    }
                }
                if (j == pattern.length()){
                   count ++;
                }
            }
                
        
        System.out.println(count);
        sc.close();
                
    }
  }