package Sample5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.event.*;

public class Sample5 extends Application {
    private Label lb;
    private Button bt;

    public static void main(String[] args){
        launch(args);
    }
    public void start(Stage stage)throws Exception{
        lb = new Label("いらっしゃいませ。");
        BorderPane bp = new BorderPane();
        bp.setTop(lb);
        bp.setCenter(bt);
        Scene sc = new Scene(bp,300,200);
        sc.addEventHandler(MouseEvent.MOUSE_CLICKED,new SampleEventHandler());
        stage.setScene(sc);
        stage.setTitle("サンプル");
        stage.show();

    }

    class SampleEventHandler implements EventHandler<MouseEvent>{
        public void handle(MouseEvent e){
            lb.setText("ご購入ありがとうございます。");
        }
    }
}
