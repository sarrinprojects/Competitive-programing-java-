import java.util.Scanner;
public class z_algm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("enter the text");
        String pattern = sc.next();
        

        boolean found = false;

        for (int i = 0; i <= text.length() - pattern.length(); i++){
                int j;
                for(j = 0; j < pattern.length(); j++){
                    if (text.charAt( j + i )!= pattern.charAt(j)){
                        break;
                    }
                }
                if (j == pattern.length()){
                    found = true;
                    break;
                }
            }
                if (found){
                    System.out.println("pattern found");
                } else {
                    System.out.println("not found");
                }
        
        
        sc.close();
                
    }
  }
    
