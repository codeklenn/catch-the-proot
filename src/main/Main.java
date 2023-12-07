package main;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;	
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;



public class Main extends Application {



    public static void main(String[] args) {

        launch(args);

    }



    @Override

    public void start(Stage primaryStage) {

        primaryStage.setTitle("Catch the Proot");



        // Create buttons for the main menu
        Button startButton = new Button("Start New Game");
        Button aboutButton = new Button("About");
        Button developersButton = new Button("Developers");
        Button exitButton = new Button("Exit");

        

        //To make the buttons larger in scale we can set its size:
        startButton.setPrefSize(200, 40);
        aboutButton.setPrefSize(100, 40);
        developersButton.setPrefSize(100, 40);
        exitButton.setPrefSize(100, 40);   
        // Set button actions

        startButton.setOnAction(e -> startNewGame());

        aboutButton.setOnAction(e -> displayAbout());

        developersButton.setOnAction(e -> displayDevelopers());

        exitButton.setOnAction(e -> primaryStage.close());
        // Create a layout for the main menu
        VBox menuLayout = new VBox(10);
        menuLayout.getChildren().addAll(startButton, aboutButton, developersButton, exitButton);
        menuLayout.setPadding(new Insets(10));
        menuLayout.setAlignment(Pos.CENTER);
        Image background_image = new Image("file:img/out-0.png");
        BackgroundImage background = new BackgroundImage(
        		background_image,
        		BackgroundRepeat.NO_REPEAT,
        		BackgroundRepeat.NO_REPEAT,
        		BackgroundPosition.CENTER,
        		BackgroundSize.DEFAULT
        		);
        menuLayout.setBackground(new Background(background));
        // Create the main scene
        Scene scene = new Scene(menuLayout, 1280, 720);
        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Placeholder methods for different menu options
    private void startNewGame() {

        System.out.println("Starting a new game!");

        // Implement game initialization here

    }
    private void displayAbout() {

        System.out.println("About the game:");

        // Provide information about the game

    }

    private void displayDevelopers() {

        System.out.println("Meet the developers:");

        // Display information about the developers

    }

}

