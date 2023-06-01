package exercice;

import java.util.List;

public class simplicite-meilleur {
	public static List<String> trierMots(String phrase, String alphabet) {
        char[] alphabetArray = alphabet.toCharArray();

        Map<Character, List<String>> motsParLettre = new HashMap<>();
        for (char lettre : alphabetArray) {
            motsParLettre.put(lettre, new ArrayList<>());
        }

        String[] mots = phrase.toLowerCase().split("\\W+");

        for (String mot : mots) {
            if (!mot.isEmpty()) {
                char premiereLettre = mot.charAt(0);
                if (motsParLettre.containsKey(premiereLettre)) {
                    motsParLettre.get(premiereLettre).add(mot);
                }
            }
        }

        List<String> motsTries = new ArrayList<>();
        for (char lettre : alphabetArray) {
            List<String> motsDeLaLettre = motsParLettre.get(lettre);
            motsTries.addAll(motsDeLaLettre);
        }

        return motsTries;
    }
}
