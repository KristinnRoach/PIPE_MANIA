package vinnsla;

/*  Nú þarftu að taka forritunarhönnunarákvörðun um hvað á að vera í Pipa og hvernig þú ætlar að útfæra gögnin og aðferðirnar.
     E.t.v. viltu hafa sem minnst í klasanum til að byrja með og bæta við eftir þörfum.

     Eftirfarandi gögn ættu að vera í Pipa:

        A.  lögun pípu - athugið að hér á ekki að geyma myndina af pípunni.
        B.  eiginleiki sem segir hvort vatn flæði í pípuna, t.d. StringProperty opin

        Eftirfarandi aðferðir gætu verið í pípu

        A. smiður sem setur gögnin
        B. aðferð sem segir til um hvort flæði úr núverandi pípu yfir í pípu s. t.d. public boolean  flaedir (Pipa s)
        C. get og set aðferðir fyrir gögnin eins og á þarf að halda */


import java.util.Random;

public class Pipa {

    private int logun;

    public Pipa(){
        Random r = new Random();
        this.logun = r.nextInt(5);
    }
    public boolean flaedir (Pipa s){
        boolean b = false;
        return b;
    }

    public int getLogun() {
        return logun;
    }
}

