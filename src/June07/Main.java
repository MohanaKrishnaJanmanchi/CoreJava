package June07;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StringManipulations s = new StringManipulations();

        System.out.println("NUMBER OF VOWELS");
        System.out.println(s.vowelCount("Bella Conners"));
        System.out.println(s.vowelCount("JMKS"));
        System.out.println(s.vowelCount("assignment"));

        System.out.println("\nANAGRAM CHECK");
        System.out.println(s.checkAnagram("cat","tac"));
        System.out.println(s.checkAnagram("eight","nine"));
        System.out.println(s.checkAnagram("kill","likl"));

        System.out.println("\nREVERSING EACH WORD IN A STRING");
        s.reversingEachWord("Fox jumps on a Frog");
        s.reversingEachWord("Laughing is not always a best Medicine");
        s.reversingEachWord("level radar kayak civic rotor kayak radar level");

        System.out.println("\nChecking if String is rotated");
        System.out.println(s.checkIfRotated("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
        System.out.println(s.checkIfRotated("thisisacheck","checkthisisa"));
        System.out.println(s.checkIfRotated("is it rotated","or not?"));

        System.out.println("\nSorted List of Student based on Last Name");
        CSVReaderExample c = new CSVReaderExample();
        c.sortStudent();
    }

}
