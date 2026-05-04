package Tennis;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Version modificada desde IntelliJ"+"\n");
        System.out.printf("Version modificada desde GitHub"+"\n");

        TennisGame partido1 = new TennisGame1("antonio", "jose");
        partido1.wonPoint("antonio");

        System.out.println(partido1.getScore());

    }
}
