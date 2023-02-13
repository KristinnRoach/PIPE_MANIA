package vinnsla;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Random;

public class Pipukista {
    private final ObservableList<Pipa> kista = FXCollections.observableArrayList();

    public Pipukista(int fjoldi) {
        for (int i = 0; i < fjoldi; i++){
            this.kista.add(nyPipa());
        }
    }
    private Pipa nyPipa(){   // afhverju ekki bara nota smiðinn í Pipa klasanum?
        Pipa rndPipa = new Pipa();
        return rndPipa;
    }
    public Pipa naestaPipa(){  // EFTIR AÐ GERa
        return this.kista.get(0);
    }

   /* public void usePipe(){
        for(int i=0; i < kista.size()-1; i++){
            this.kista.set(i, this.kista.get(i + 1));

        }
    } */

}

    /* Kistan hefur nokkrar pípur (4 í þessu verkefni). Skrifið eftirfarandi aðferðir

A. Smiður fyrir klasann sem tekur inn fjoldi og býr til fjoldi pípa og bætir við í kista.

B. aðferðin nyPipa sem býr til pípu sem er með lögun af handahófi t.d. private Pipa nyPipa ()

C. aðferðin public Pipa naestaPipa() sem nær í næstu pípu úr kistunni fjarlægir hana úr kistunni og skilar henni.
Búin er til ný pípa sem er sett í kistuna. Vísað er í verkefnislýsinguna fyrir hvaða röð er náð í pípurnar.

9.  Bættu tilviksbreytunni fxStig við í PipemaniaController þar sem breytan er viðmótshluturinn sem þú ætlar að birta stigin í.

10. Bættu tilviksbreytu stig af taginu IntegerProperty í klasann Pipemania klasann.
Tilviksbreytan á að innihalda stigin sem fást í leiknum fyrir að smíða samfellda pípu sem vatn rennur í gegnum.
Í aðferðinni initialize í PipemaniaController skaltu búa til binding á milli fxStig og stig.

kóðinn gæti verið svona í initialize:
fxStig.textProperty().bind(mania.stigProperty().asString()); */


