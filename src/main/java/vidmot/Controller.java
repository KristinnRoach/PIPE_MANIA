package vidmot;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import vinnsla.Pipa;
import vinnsla.Pipemania;
import javafx.scene.control.Button;
import javafx.collections.ListChangeListener;


public class Controller {
    private Pipemania mania;
    @FXML
    private Label fxStig;
    @FXML
    private GridPane fxGridPane;
    @FXML
    private VBox fxVbKista;
    @FXML
    private Button hnappur;
    @FXML
    private Button buttonFlaedir;


    public void initialize() {
        this.mania = new Pipemania();
        for (int i = 0; i < Pipemania.F; i++){
            fxVbKista.getChildren().get(i).getStyleClass().add(getMyndStyleClass(mania.getNuverandiPipa()));
        }
        fxStig.textProperty().bind(mania.stigProperty().asString());
        mania.nuverandiPipaProperty().addListener((observable, oldValue, newValue) -> hnappur.getStyleClass().add(getMyndStyleClass(newValue)));
        ObservableList<Pipa> q = mania.getObsKista();
        q.addListener((ListChangeListener<Pipa>) change -> {
            if (change.next() && change.wasAdded()) {
                int i = 3;
                for (Pipa p : q) {
                    fxVbKista.getChildren().get(i).getStyleClass().clear();
                    fxVbKista.getChildren().get(i--).getStyleClass().add(getMyndStyleClass(p));
                }
                ;
            }
        });
    }
    /* public void fxStigHandler() {
        System.out.println("fxStighandler");
    }*/

    public void fxVeljaReitHandler(ActionEvent e) {
        this.hnappur = (Button) e.getSource();
        int row = GridPane.getRowIndex(hnappur);
        int col = GridPane.getColumnIndex(hnappur);
        mania.setNaestaPipa(row, col);
    }

    public void fxAthFlaedirHandler(MouseEvent e) {

        System.out.println("fxATHhandler");
    }

    private String getMyndStyleClass(Pipa p) {
        String styleClass = "." + p.getLogun();
        return styleClass;
    }

  /*  public VBox getFxVbKista() {
        return fxVbKista;
    }

    public void setStyleClassKista(Pipa p) {
        for (int i = 0; i < Pipemania.F; i++) {
            this.fxVbKista.getChildren().get(i).getStyleClass().add(getMyndStyleClass(p));
        }
    } */
}

/* til að ná í styleClass þegar ýtt er á hnapp og skipta honum út:

hnappur.getStyleClass().add(".SA");
   scenebuilder, ef gridbuttons vísa á #yttAhnapp

   yttAHnapp(ActionEvent e){
   Pipa p = kista.setNaestaPipa();
   Button takki = (Button) actionEvent.getSource();
   fyrst clear-a myndina sem er fyrir, svo:
   takki.getMyndStyleClass().add("NA");

   last=x = GridPane.getRowIndex(takki);
   last_y = GridPane.getCIndex(takki);
   mania.setNaestaPipa(last_x, last_y);

getStilKlasi(p){
    return ("." + p.getLogun.toString)

Pipa p = pipukista.next();

 */