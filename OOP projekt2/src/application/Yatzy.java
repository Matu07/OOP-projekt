package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yatzy extends Application {

	@Override
	public void start(final Stage PeaM�ng) {
		Group juur = new Group();
		Text �hed = new Text("�hed");
		Text kahed = new Text("Kahed");
		Text kolmed = new Text("Kolmed");
		Text neljad = new Text("Neljad");
		Text viied = new Text("Viied");
		Text kuued = new Text("Kuued");
		Text veereta = new Text("Veereta");

		VBox vBox = new VBox(10);
		vBox.setAlignment(Pos.BASELINE_LEFT);
		vBox.getChildren().addAll(�hed, kahed, kolmed, neljad, viied, kuued);

		�hed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				System.out.println("TULEB �HTEDE KOGUSUMMA ! ! ! ! ! ! !");

			}
		});

		// M�NGIJANIME EI SISESTATUD
		final Stage m�ngijaaken = new Stage();

		Label tekst = new Label("TE EI SISESTANUD NIME!");
		final Stage error = new Stage();

		Button tagasi = new Button("OK. Kohe sisestan.");

		tagasi.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				error.hide();
				m�ngijaaken.show();
			}
		});

		VBox errorbox = new VBox(10);
		errorbox.setAlignment(Pos.CENTER);

		FlowPane errorpane = new FlowPane(10, 10);
		errorpane.setAlignment(Pos.BOTTOM_CENTER);
		errorpane.getChildren().add(tagasi);

		errorbox.getChildren().addAll(tekst, errorpane);

		Scene errorstseen = new Scene(errorbox);
		error.setScene(errorstseen);

		error.setTitle("VIGA: EI SISESTATUD NIME!");

		// M�NGIJANIME AKEN

		final TextField nimi = new TextField();
		nimi.setText("Sisesta oma nimi");

		Button sisenem�ngu = new Button("SISENE M�NGU");

		sisenem�ngu.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				String m�ngijanimi = nimi.getText();
				if (m�ngijanimi.equals("Sisesta oma nimi")) {
					m�ngijaaken.hide();
					error.show();
				} else {
					m�ngijaaken.hide();
					PeaM�ng.show();
					System.out.println(m�ngijanimi);
				}

			}
		});

		VBox nimebox = new VBox(10);
		nimebox.setAlignment(Pos.CENTER);

		FlowPane pane1 = new FlowPane(10, 10);
		pane1.setAlignment(Pos.BOTTOM_CENTER);
		pane1.getChildren().add(sisenem�ngu);

		nimebox.getChildren().addAll(nimi, pane1);

		Scene stseen2 = new Scene(nimebox);
		m�ngijaaken.setScene(stseen2);

		m�ngijaaken.setTitle("M�NGIJA NIME AKEN");

		Scene stseen1 = new Scene(vBox, 535, 535, Color.GREEN);

		PeaM�ng.setTitle("Yatzy");

		PeaM�ng.setScene(stseen1);

		PeaM�ng.hide();
		m�ngijaaken.show();
		error.hide();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
