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


import javafx.beans.property.BooleanProperty;

public class Pipa {

    private final String logun;
    private String[] innUt;
    private BooleanProperty opin;

    public enum Att {V, N, A, S}

    private Att inn;
    private Att ut;
    // private final String[] gerdir = {"NV", "NA", "SV", "SA", "NS", "VA"};

    // GETTERS AND SETTERS

    public boolean isOpin() {
        return opin.get();
    }

    public BooleanProperty opinProperty() {
        return opin;
    }

    public void setOpin(boolean opin) {
        this.opin.set(opin);
    }

    public String getLogun() {
        return logun;
    }

    /**
     * Smiður fyrir pípu
     * @param x úr hvaða átt flæðir inn í pípuna
     * @param y úr hvaða átt flæðir út úr pípunni
     */
    public Pipa(Att x, Att y) {
        this.inn = x;
        this.ut = y;
        this.logun = x.toString() + y.toString();
    }

    /**
     * Athugar hvort flæðir í gegnum pípuna sem er gefin og skilar Boolean gildi
     * @param s Pípan
     * @return
     */
    public boolean flaedir(Pipa s) {
        if ((ut.ordinal() + 2) % 4 == s.inn.ordinal()) return true;
        else if ((ut.ordinal() + 2) % 4 == s.ut.ordinal()) {
            Att tmp = s.ut;
            s.ut = s.inn;
            s.inn = tmp;
            return true;
        }
        return false;
    }
}
