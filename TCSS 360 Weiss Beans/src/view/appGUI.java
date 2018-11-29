package view;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.embed.swing.SwingNode;
import javafx.fxml.FXMLLoader;
import javafx.fxml.*;
import javafx.scene.Parent;
@SuppressWarnings("restriction")
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harrison
 * @editor Tien
 */
                      

public class appGUI extends Application {

	Scene scene1;
	Scene scene2;
	Button btnAbout;

	private final String VERSION = "0.0.1";
	
	//initialization code for the javaFX application
    @Override
	public void start(Stage appStage) throws Exception {
    	Parent root;
    	
    	
    	
    	root = FXMLLoader.load(getClass().getResource("Main_Window.fxml"));
    	scene1= new Scene(root);
        appStage.setScene(scene1);
    	appStage.setTitle("Constructor");
        appStage.setScene(scene1);
        appStage.show();	
	}
    
    @FXML
    private void aboutButtonAction(ActionEvent event) {
        // Button was clicked, do something�
        showAboutScreen(VERSION);
    }
    
    private void showAboutScreen(String version) {
    	JOptionPane.showMessageDialog(null, "Constructor\n By Weiss and Beans Team\n Version: " 
    										+ version);
    }
    
    


    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//    	launch(args);
//    }
    // End of variables declaration     
    
    
	
}
