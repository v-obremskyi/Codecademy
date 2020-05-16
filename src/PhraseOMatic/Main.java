package PhraseOMatic;

public class Main {
    public static void main(String[] args) {

        //make three sets of words to choose from
        String[] worldListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] worldListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] worldListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //find out how many words are in each list
        int oneLength = worldListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = worldListThree.length;

        //generate three random numbers
        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * twoLength);
        int random3 = (int) (Math.random() * threeLength);

        //now build a phrase
        String phrase = worldListOne[random1] + " " + worldListTwo[random2] + " " + worldListThree[random3];

        //print out the phrase
        System.out.println("What we need is a " + phrase);
    }
}
