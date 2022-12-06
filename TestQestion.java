import java.util.*;

/**
 * TestQestion
 */
public class TestQestion {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question q = new Question();
        q.SetText("Who was the invator of java ?");
        q.setAnswer("James Gosling");

        clearConsole();
        q.display();
        System.out.print("\t\t\tYour answer : ");
        String reponse = sc.nextLine();
        System.out.println("\t\t\t"+q.checkAnswer(reponse));

    }
    public static void clearConsole() {
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(final Exception ex){
            ex.printStackTrace();
        }
    }
}