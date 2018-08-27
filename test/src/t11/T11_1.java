package t11;


import java.util.Scanner;
public class T11_1 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String word = sc.next();
             
            if(isAllUpCase(word) && isConEql(word) && isThrEql(word))
                System.out.println("Likes");
            else
                System.out.println("Dislikes");
        }
    }
    //条件1
     public static boolean isAllUpCase(String word){
        return word.matches("[A-Z]+");
    }
    //条件2
    public static boolean isConEql(String word){
        return !word.matches(".*(.)(\\1).*");
    }
    //条件3
    public static boolean isThrEql(String word){
        return !word.matches(".*(.).*(.)(.*\\1)(.*\\2).*");
    }
}