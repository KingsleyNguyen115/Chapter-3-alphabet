import java.util.Scanner;
public class Vowel {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character from A to Z: ");
        char letter = input.next().charAt(0);
        switch(letter){
            case 'a':
            case 'e':
            case 'u':
            case 'o':
            case 'i':
            case'A':
            case'E':
            case'U':
            case'O':
            case'I':
                System.out.println("the alphabet " + letter + " is a vowel");
                break;
            default:
                System.out.println("the alphabet " +  letter + " is a constant");

        }
    }
}
