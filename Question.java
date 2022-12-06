
public class Question {
   
    private String text, answer;
    
    public Question() {
        this.text = "";
        this.answer = "";
    }

    public void SetText(String value) {
        this.text = value;
    }
    public void setAnswer(String value) {
        this.answer = value;
    }

    public boolean checkAnswer(String reponse) {
        boolean bool;
        if (this.answer.equals(reponse)) {
            bool = true;
        }else{
            bool = false;
        }
        return bool;
    }

    public void display() {
        System.out.println("\t\t\t-------------------------------------------------------------------------------------------");
        System.out.printf("\t\t\t\t\t\t %s\n", this.text);
        System.out.println("\t\t\t-------------------------------------------------------------------------------------------");
    }

}
