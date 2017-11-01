package UniversitiesGUI;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.stage.WindowEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Optional;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import java.util.ArrayList;
import javafx.scene.input.MouseEvent;

public class UniversitiesGUI
{
    private static TextField txtFieldRanking;
    private static TextField txtFieldName;
    private static TextField txtFieldCountry;
    private static ListView<University> uniListView;
    private static ArrayList<University> uniArrList = new ArrayList<>();
    private static University currentlySelectedUniversity = null;
    
    public static void main(String[] args)
    {
        new JFXPanel();
        Platform.runLater(UniversitiesGUI::initGUI);
    }

    private static void initGUI()
    {
        // Stage
        Stage stage = new Stage();
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.setTitle("Universities GUI");
        stage.setResizable(false);
        stage.setWidth(720);
        stage.setHeight(480);
        stage.setOnCloseRequest(UniversitiesGUI::terminate);
        stage.show();
        
        // Label - Add
        Label label = new Label("Add university entry:");
        label.setLayoutX(10);
        label.setLayoutY(10);
        rootPane.getChildren().add(label);
        
        // Label - Remove
        Label labelRem = new Label("Remove university entry:");
        labelRem.setLayoutX(400);
        labelRem.setLayoutY(10);
        rootPane.getChildren().add(labelRem);
        
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
        
        // Add Button
        Button btn = new Button();
        btn.setText("Add");
        btn.setLayoutX(10);
        btn.setLayoutY(170);
        btn.setOnAction((ActionEvent ae) -> addItem(txtFieldRank, txtFieldName, txtFieldCountry));
        rootPane.getChildren().add(btn);
        
        // Remove Button
        Button btnRemove = new Button();
        btnRemove.setText("Remove");
        btnRemove.setLayoutX(400);
        btnRemove.setLayoutY(170);
        btnRemove.setOnAction((ActionEvent ae) -> deleteItem());
        rootPane.getChildren().add(btnRemove);
        
        // University Icon
        ImageView uniIcon = new ImageView();
        uniIcon.setImage(new Image("src/UniversitiesGUI/university-icon.png"));
        uniIcon.setLayoutX(10);
        uniIcon.setLayoutY(210);
        uniIcon.setFitWidth(120);
        uniIcon.setPreserveRatio(true);
        rootPane.getChildren().add(uniIcon);
        
        // List View
        uniListView = new ListView<>();
        uniListView.setLayoutX(400);
        uniListView.setLayoutY(50);
        uniListView.setOnMouseClicked((MouseEvent me) -> currentlySelectedUniversity = uniListView.getSelectionModel().getSelectedItem());
        uniListView.setPrefHeight(100);
        rootPane.getChildren().add(uniListView);
        updateListView();
    }
    
    private static void terminate(WindowEvent we)
    {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText("Confirmation");
        alert.setContentText("Are you sure you want to quit?");
        
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK)
        {
            System.out.println("Terminating...");
            System.exit(0);
        } else {
            we.consume();
        }
    }
    
    private static void addItem(TextField txtFieldRank, TextField txtFieldName, TextField txtFieldCountry)
    {
        int ranking = Integer.parseInt(txtFieldRank.getText());
        String name = txtFieldName.getText();
        String country = txtFieldCountry.getText();
        
        uniArrList.add(new University(ranking, name, country));
        
        updateListView();
        //System.out.println(txtFieldRank.getText() + " " + txtFieldName.getText() + " " + txtFieldCountry.getText());
    }
    
    private static void deleteItem()
    {
        uniArrList.remove(currentlySelectedUniversity);
        
        updateListView();
    }
    
    private static void updateListView()
    {
        uniListView.getItems().clear();
        
        for (University uni : uniArrList)
        {
            uniListView.getItems().add(uni);
        }
    }
}