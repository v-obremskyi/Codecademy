package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> sherlockToDos = new ArrayList<>();

        sherlockToDos.add("visit the crime scene");
        sherlockToDos.add("play violin");
        sherlockToDos.add("interview suspects");
        sherlockToDos.add("solve the case");
        sherlockToDos.add("apprehend the criminal");

        ArrayList<String> poirotsToDos = new ArrayList<>();

        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");

        System.out.println(sherlockToDos.size());
        System.out.println(poirotsToDos.size());

        if (sherlockToDos.size() > poirotsToDos.size()) {
            System.out.println("Sherlock Holmes");
        } else {
            System.out.println("Hercule Poirot");
        }
    }
}
