package LanguageFamilies;

public class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // summon constructor
    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public static void main(String[] args) {

        Language spanish = new Language("Spanish", 555_000_000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        spanish.getInfo();

        Mayan tzutujil = new Mayan("Tzʼutujil", 63_200);
        tzutujil.getInfo();

    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }
}
