package vinnsla;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.ObservableList;

import java.nio.channels.Pipe;


public class Pipemania {
    public static final int F = 5;
    private final ObjectProperty<Pipa> nuverandiPipa = new SimpleObjectProperty<Pipa>();
    private IntegerProperty stig = new SimpleIntegerProperty();

    public Pipa[][] getPipulogn() {
        return pipulogn;
    }

    private final Pipa[][] pipulogn = new Pipa[F][F];
    private Pipukista pipuKista;

    public IntegerProperty stigProperty() {
        return this.stig;
    }

    // SMIÐUR
    public Pipemania() {
        this.pipuKista = new Pipukista(4);
    }

    // GETTERS AND SETTERS

    public ObservableList<Pipa> getObsKista() {
        return this.pipuKista.getListKista();
    }

    public Pipa getNuverandiPipa() {
        return nuverandiPipa.get();
    }

    public ObjectProperty<Pipa> nuverandiPipaProperty() {
        return nuverandiPipa;
    }

    public int getStig() {
        return stig.get();
    }

    /**
     * Uppfærir stakið á því indexi sem er tekið inn í pípulögn fylkinu.
     * @param i : Röð index
     * @param j : Dálkur index
     */
    public void setNaestaPipa(int i, int j) {
        Pipa temp = pipuKista.naestaPipa();
        this.pipulogn[i][j] = temp;
        setNuverandiPipa(temp);
    }

    private void setNuverandiPipa(Pipa p) {
        this.nuverandiPipa.set(p);
    }


   /* public void setStig(int stig) {
        this.stig.set(stig); */

    public boolean flaedir() {
        return false;
    }
}


