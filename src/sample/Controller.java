package sample;

import javafx.scene.control.Label;

public class Controller {

    public Label lblUpMessage;

    public Label lblDownMessage;

    public void up_clicked() {
        System.out.println("up clicked");
        lblUpMessage.setText("Up Clicked");
        lblDownMessage.setText("");
    }

    public void down_clicked() {
        System.out.println("down clicked");
        lblDownMessage.setText("Down Clicked");
        lblUpMessage.setText("");
    }
}
