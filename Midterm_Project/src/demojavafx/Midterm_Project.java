package demojavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.*;

public class Midterm_Project extends Application {

    private static final int NUM_CARDS = 5;
    private static final String CARD_PATH = "/image/card/";
    private final ImageView[] cardViews = new ImageView[NUM_CARDS];
    private final Label scoreLabel = new Label("Score: ");

    @Override
    public void start(Stage primaryStage) {
        // Initialize 5 card backs
        for (int i = 0; i < NUM_CARDS; i++) {
            Image backImage = new Image(getClass().getResource(CARD_PATH + "b1fv.png").toExternalForm());
            cardViews[i] = new ImageView(backImage);
            cardViews[i].setFitHeight(150);
            cardViews[i].setFitWidth(100);
        }

        // Buttons
        Button btnShow = new Button("Show Cards");
        Button btnExit = new Button("Exit");

        btnShow.setOnAction(e -> showRandomCards());
        btnExit.setOnAction(e -> primaryStage.close());

        // Layouts
        HBox cardBox = new HBox(10, cardViews);
        HBox buttonBox = new HBox(10, btnShow, btnExit);
        VBox root = new VBox(15, cardBox, scoreLabel, buttonBox);

        Scene scene = new Scene(root, 650, 300);
        primaryStage.setTitle("Midterm Project - Ahmad Hejjih");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private void showRandomCards() {
        List<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 54; i++) deck.add(i);
        Collections.shuffle(deck);

        int total = 0;
        for (int i = 0; i < NUM_CARDS; i++) {
            int cardNum = deck.get(i);
            Image cardImage = new Image(getClass().getResource(CARD_PATH + cardNum + ".png").toExternalForm());
            cardViews[i].setImage(cardImage);
            total += getCardValue(cardNum);
        }

        int score = total % 10;
        scoreLabel.setText("Score: " + score);
    }

    private int getCardValue(int cardNum) {
        int rank = ((cardNum - 1) % 13) + 1;
        if (rank >= 10 && rank <= 13) return 0;
        return rank;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
