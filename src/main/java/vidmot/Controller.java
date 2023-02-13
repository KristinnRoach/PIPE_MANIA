package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import vinnsla.Pipemania;

public class Controller {
    @FXML
    private Label fxStig;
    // @FXML ?
    private Pipemania mania;

    public void initialize(Pipemania pm){
        this.mania = pm;
        // this.fxStig = 0;
       fxStig.textProperty().bind(mania.stigProperty().asString());
       // binding og changeListener
    }
   /* public void fxStigHandler() {
        System.out.println("fxStighandler");
    } */
    public void fxVeljaReitHandler(ActionEvent e){
        System.out.println("fxVeljaReithandler");
    }
    public void fxAthFlaedirHandler(MouseEvent e){
        System.out.println("fxATHhandler");
    }
}