/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws2;

/**
 *
 * @author Lakshmi Manjari Alapati
 */
public class ThesaurusDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thesaurus t = new Thesaurus();

        t.addWord("rapid");
        t.addWord("slow");
        System.out.println(t);
        t.addSynonym("rapid", "fast");
        t.addSynonym("rapid", "quick");
        t.addSynonym("rapid", "swift");
        t.addSynonym("slow", "leisurely");
        t.addSynonym("slow", "sluggish");
        System.out.println(t);
        System.out.println(t.getSynonyms("rapid"));

        t.addSynonym("fun", "enjoyable");
        System.out.println(t);
    }

}
