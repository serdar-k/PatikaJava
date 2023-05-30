// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Fighter1", 10, 100, 85, 20);
        Fighter fighter2 = new Fighter("Fighter2", 15, 95, 90, 30);

        Match match = new Match(fighter1, fighter2, 90, 75);
        match.run();
    }
}