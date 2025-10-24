import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeCards extends Application {


    private final HBox cardBox = new HBox(10);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #f0f0f0;"); // Light gray background
        root.setPadding(new Insets(15));


        cardBox.setAlignment(Pos.CENTER);
        root.setCenter(cardBox);


        Button btRefresh = new Button("Refresh");


        btRefresh.setOnAction(e -> showRandomCards());


        BorderPane.setAlignment(btRefresh, Pos.CENTER);
        root.setBottom(btRefresh);


        showRandomCards();


        Scene scene = new Scene(root, 400, 250);
        primaryStage.setTitle("Three Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Clears the old cards and displays three new random cards.
     */
    private void showRandomCards() {
        cardBox.getChildren().clear();


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }


        Collections.shuffle(list);


        for (int i = 0; i < 3; i++) {
            int cardNumber = list.get(i);

            Image image = new Image(getClass().getResourceAsStream("/card/" + cardNumber + ".png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(150); // Adjust size as needed
            imageView.setPreserveRatio(true);
            cardBox.getChildren().add(imageView);
        }
    }
}
