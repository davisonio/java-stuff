import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class UniversitiesGUI
{
    public static void main(String[] args)
    {
        new JFXPanel();
        Platform.runLater(() -> initGUI());
    }

    private static void initGUI()
    {
        // Stage
        Stage stage = new Stage();
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setTitle("Universities GUI");
        stage.setResizable(false);
        stage.setWidth(1080);
        stage.setHeight(720);
        stage.setOnCloseRequest((WindowEvent we) -> terminate());
        stage.show();
        
        // Label
        
        Label label = new Label("Enter university entry:");
        label.setLayoutX(10);
        label.setLayoutY(10);
        rootPane.getChildren().add(label);
        
        // Ranking
        TextField txtFieldRank = new TextField();
        txtFieldRank.setLayoutX(10);
        txtFieldRank.setLayoutY(50);
        txtFieldRank.setPrefWidth(120);
        txtFieldRank.setPromptText("Ranking");
        rootPane.getChildren().add(txtFieldRank);
        
        
        // Name
        
        TextField txtFieldName = new TextField();
        txtFieldName.setLayoutX(10);
        txtFieldName.setLayoutY(90);
        txtFieldName.setPrefWidth(120);
        txtFieldName.setPromptText("Name");
        rootPane.getChildren().add(txtFieldName);
        
        // Country
        
        TextField txtFieldCountry = new TextField();
        txtFieldCountry.setLayoutX(10);
        txtFieldCountry.setLayoutY(130);
        txtFieldCountry.setPrefWidth(120);
        txtFieldCountry.setPromptText("Country");
        rootPane.getChildren().add(txtFieldCountry);
        
        // Enter

        Button btn = new Button();
        btn.setText("Send");
        btn.setLayoutX(10);
        btn.setLayoutY(170);
        btn.setOnAction((ActionEvent ae) -> System.out.println(txtFieldRank.getText() + " " + txtFieldName.getText() + " " + txtFieldCountry.getText()));
        rootPane.getChildren().add(btn);
        
        // University Icon
        ImageView uniIcon = new ImageView();
        uniIcon.setImage(new Image("university-icon.png"));
        uniIcon.setLayoutX(10);
        uniIcon.setLayoutY(210);
        uniIcon.setFitWidth(120);
        uniIcon.setPreserveRatio(true);
        rootPane.getChildren().add(uniIcon);
    }
    
    private static void terminate()
    {
        System.out.println("Terminating...");
        System.exit(0);
    }
}