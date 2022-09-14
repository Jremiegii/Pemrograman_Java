package latihan5;

import java.util.Scanner;

public class NewClass {

    private static boolean Jawab;

    
    public static void main(String[] args){
        
        Scanner Like = new Scanner(System.in);
        
        int Question;
        int Answer = 0;
        int pernyataan;
        int pertanyaan;
        
        
        
        System.out.print("Do You Love Me ? ");
        System.out.println("Select 1.Yes or 2.No");
        Question = Like.nextInt();
        
        switch(Question) {
            case 1 : Jawab = ((Question!=Answer) && (Question!=Answer));
            System.out.println("I Love You");
            break;
            default :
                System.out.println("I Want Me Cry");
        } 
        
        System.out.print("Are You Kidding ? ");
        System.out.println("Select 1.Yes or 2.No");
        Question = Like.nextInt();
        
        if ((Answer != Question) || (Answer != Question)) {
            System.out.println("Thanks You Baby");
        } else 
            System.out.println("Don't Watc Me Cry");
    }
}
