package DesertIslandPlaylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        desertIslandPlaylist.add("Turbo, Gunna & Young Thug - Quarantine Clean");
        desertIslandPlaylist.add("Drake - Toosie Slide");
        desertIslandPlaylist.add("Gunna - SKYBOX");
        desertIslandPlaylist.add("A Boogie wit da Hoodie - Might not give up (feat Young Thug)");
        desertIslandPlaylist.add("Jay Electronica - The Blinding (feat Travis Scott)");
        desertIslandPlaylist.add("A$AP Rocky - A$AP Forever");

        desertIslandPlaylist.remove(1);

        int indexA = desertIslandPlaylist.indexOf("A$AP Rocky - A$AP Forever");
        int indexB = desertIslandPlaylist.indexOf("Turbo, Gunna & Young Thug - Quarantine Clean");

        String tempA = "A$AP Rocky - A$AP Forever";

        desertIslandPlaylist.set(indexA, "Turbo, Gunna & Young Thug - Quarantine Clean");

        desertIslandPlaylist.set(indexB, tempA);

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

    }
}
