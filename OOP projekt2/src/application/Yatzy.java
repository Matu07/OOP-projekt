package application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yatzy extends Application {

	@Override
	public void start(final Stage PeaMäng) {
		final Text ühed = new Text("Ühed");
		final Text kahed = new Text("Kahed");
		final Text kolmed = new Text("Kolmed");
		final Text neljad = new Text("Neljad");
		final Text viied = new Text("Viied");
		final Text kuued = new Text("Kuued");
		final Text boonus = new Text("Boonus");
		

		// PUNKTIDE ALA
		final Button tulemused = new Button("TULEMUSED");
		final VBox põhiülemine = new VBox();
		final Button veereta = new Button("VEERETA!");

		final VBox punktiala = new VBox(30);
		punktiala.setPadding(new Insets(10));
		Text punktid = new Text("Punktid");
		punktid.setFont(Font.font("Ariel", 20));
		punktid.setUnderline(true);

		punktiala.getChildren().addAll(punktid, ühed, kahed, kolmed, neljad,
				viied, kuued,boonus);
		punktiala.setStyle("-fx-background-color: ghostwhite");

		ühed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (Täringud.veeretus == 2) {
					Täringud.LeiaArv(1);
					punktiala.getChildren().remove(ühed);
					Text ühedlõplik = new Text("Ühed: " + Täringud.skoor);
					punktiala.getChildren().add(1, ühedlõplik);
					Täringud.boonusloendur+= Täringud.skoor;
					PealePunkte(punktiala, põhiülemine, veereta, tulemused, boonus);

				}
			}
		});

		kahed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (Täringud.veeretus == 2) {
					Täringud.LeiaArv(2);
					punktiala.getChildren().remove(kahed);
					Text kahedlõplik = new Text("Kahed: " + Täringud.skoor);
					punktiala.getChildren().add(2, kahedlõplik);
					Täringud.boonusloendur+= Täringud.skoor;
					PealePunkte(punktiala, põhiülemine, veereta, tulemused, boonus);
				}
			}
		});

		kolmed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (Täringud.veeretus == 2) {
					Täringud.LeiaArv(3);
					punktiala.getChildren().remove(kolmed);
					Text kolmedlõplik = new Text("Kolmed: " + Täringud.skoor);
					punktiala.getChildren().add(3, kolmedlõplik);
					Täringud.boonusloendur+= Täringud.skoor;
					PealePunkte(punktiala, põhiülemine, veereta, tulemused, boonus);

				}
			}
		});

		neljad.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (Täringud.veeretus == 2) {
					Täringud.LeiaArv(4);
					punktiala.getChildren().remove(neljad);
					Text neljadlõplik = new Text("Neljad: " + Täringud.skoor);
					punktiala.getChildren().add(4, neljadlõplik);
					Täringud.boonusloendur+= Täringud.skoor;
					PealePunkte(punktiala, põhiülemine, veereta, tulemused, boonus);

				}
			}

		});

		viied.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (Täringud.veeretus == 2) {
					Täringud.LeiaArv(5);
					punktiala.getChildren().remove(viied);
					Text viiedlõplik = new Text("Viied: " + Täringud.skoor);
					punktiala.getChildren().add(5, viiedlõplik);
					Täringud.boonusloendur+= Täringud.skoor;
					PealePunkte(punktiala, põhiülemine, veereta, tulemused, boonus);

				}
			}
		});

		kuued.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (Täringud.veeretus == 2) {
					Täringud.LeiaArv(6);
					punktiala.getChildren().remove(kuued);
					Text kuuedlõplik = new Text("Kuued: " + Täringud.skoor);
					punktiala.getChildren().add(6, kuuedlõplik);
					Täringud.boonusloendur+= Täringud.skoor;
					PealePunkte(punktiala, põhiülemine, veereta, tulemused, boonus);

				}
			}
		});
		

		// PÕHIALA
		final BorderPane põhiala = new BorderPane();
		põhiala.setPadding(new Insets(10));

		// PÕHIALA ÜLEMINE TEKSTIOSA
		põhiülemine.setPadding(new Insets(10));
		põhiülemine.setSpacing(30);
		Text yatzymäng = new Text("Yatzy mäng");
		yatzymäng.setFont(Font.font("Ariel", 18));
		yatzymäng.setUnderline(true);
		Text eesmärk = new Text(
				"\n\nMängu eesmärk on saada võimalikult palju\nettenähtud väärtusega täringuviskeid.");

		// PÕHIALA KESKMINE MÄNGUOSA
		final VBox põhikesk = new VBox();
		põhikesk.setPadding(new Insets(10));
		final Text vahetustekst = new Text(
				"Vali, millist täringut soovid vahetada.");
		final Text valipunkt = new Text(
				"Vajutage kohale, kuhu soovite oma punktid panna.");

		// PÕHIALA ALUMINE TÄRINGUTEGA OSA
		final HBox põhitäringud = new HBox();
		põhitäringud.setPadding(new Insets(10));
		põhitäringud.setStyle("-fx-background-color: ghostwhite");

		// NUPPUDE ALA
		HBox nuppudeala = new HBox();
		nuppudeala.setPadding(new Insets(10));
		nuppudeala.setSpacing(15);
		nuppudeala.setAlignment(Pos.CENTER);

		final CheckBox vahetus1 = new CheckBox("VAHETA 1.");

		final CheckBox vahetus2 = new CheckBox("VAHETA 2.");

		final CheckBox vahetus3 = new CheckBox("VAHETA 3.");

		final CheckBox vahetus4 = new CheckBox("VAHETA 4.");

		final CheckBox vahetus5 = new CheckBox("VAHETA 5.");

		Group vahetusnupud = new Group();
		vahetusnupud.getChildren().addAll(vahetus1, vahetus2, vahetus3,
				vahetus4, vahetus5);

		veereta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				// NÄITAB NUPUVAJUTUSE PEALE TÄRINGUID
				if (Täringud.punktide_lisamine == 0) {
					if (Täringud.veeretus == 1) {
						põhikesk.getChildren().clear();
						KasVaheta(vahetus1, vahetus2, vahetus3, vahetus4,
								vahetus5);
						põhikesk.getChildren().addAll(vahetustekst);
						põhitäringud.getChildren().clear();
						Täringud.Veeretamine();
						Täringud.Näitamine(põhitäringud);
						Täringud.veeretus += 1;
					} else if (Täringud.veeretus == 2) {
						KasVaheta(vahetus1, vahetus2, vahetus3, vahetus4,
								vahetus5);
						põhikesk.getChildren().clear();
						põhitäringud.getChildren().clear();
						põhikesk.getChildren().add(valipunkt);
						Täringud.Veeretamine();
						Täringud.Näitamine(põhitäringud);
						Täringud.punktide_lisamine = 1;

					} else {
						vahetus1.setSelected(true);
						vahetus2.setSelected(true);
						vahetus3.setSelected(true);
						vahetus4.setSelected(true);
						vahetus5.setSelected(true);
						põhikesk.getChildren().clear();
						põhitäringud.getChildren().clear();
						põhikesk.getChildren().addAll(vahetustekst);
						Täringud.Veeretamine();
						Täringud.Näitamine(põhitäringud);
						Täringud.veeretus += 1;
					}

				}

			}

			private void KasVaheta(final CheckBox vahetus1,
					final CheckBox vahetus2, final CheckBox vahetus3,
					final CheckBox vahetus4, final CheckBox vahetus5) {
				Täringud.vaheta1 = vahetus1.isSelected();
				Täringud.vaheta2 = vahetus2.isSelected();
				Täringud.vaheta3 = vahetus3.isSelected();
				Täringud.vaheta4 = vahetus4.isSelected();
				Täringud.vaheta5 = vahetus5.isSelected();
			}

		});

		Button lõpeta = new Button("VÄLJU");
		lõpeta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				PeaMäng.hide();
			}
		});

		nuppudeala.getChildren().addAll(vahetus1, vahetus2, vahetus3, vahetus4,
				vahetus5);
		põhiülemine.getChildren().addAll(yatzymäng, eesmärk, veereta, lõpeta);

		põhiala.setTop(põhiülemine);
		põhiala.setCenter(põhikesk);
		põhiala.setBottom(põhitäringud);

		// MÄNGUALA
		BorderPane mänguala = new BorderPane();
		mänguala.setLeft(punktiala);
		mänguala.setBottom(nuppudeala);
		mänguala.setCenter(põhiala);

		// MÄNGIJANIME EI SISESTATUD

		final Stage mängijaaken = new Stage();

		Label tekst = new Label("TE EI SISESTANUD NIME!");
		final Stage error = new Stage();

		Button tagasi = new Button("OK. Kohe sisestan.");

		tagasi.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				error.hide();
				mängijaaken.show();
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
		
		
		
		// TULEMUSTE AKEN
		

		final Stage tulemusteaken = new Stage();
		Button sulge = new Button("SULGE MÄNG");

		sulge.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				tulemusteaken.hide();
			}
		});

		final VBox tulemusbox = new VBox(10);
		tulemusbox.setAlignment(Pos.CENTER);

		FlowPane tulemuspane = new FlowPane(10, 10);
		tulemuspane.setAlignment(Pos.TOP_CENTER);
		tulemusbox.getChildren().add(tulemuspane);
		tulemuspane.getChildren().add(sulge);

		tulemused.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				PeaMäng.hide();
				tulemusteaken.show();
				try {
					InputStream fis = new FileInputStream("tulemused.txt");
					BufferedReader br = new BufferedReader(
							new InputStreamReader((fis), "UTF8"));
					while (true) {
						String viimane = null, rida;
						while ((rida = br.readLine()) != null) {

							viimane = rida;
							String[] numbrid = viimane.split(";");
							Label uus = new Label(numbrid[0] + ": "
									+ numbrid[1]);
							tulemusbox.getChildren().add(uus);
						}
						if (rida == null)
							break;
					}
					br.close();
				} catch (Exception e) {
					System.out.println("Erind: " + e);
				}
				Täringud.KirjutaFaili();
				Label sinutulemus = new Label("Praegune mäng - " + mängijanimi
						+ ": " + Täringud.koguskoor);
				tulemusbox.getChildren().add(sinutulemus);
			}
		});

		Scene tulemusstseen = new Scene(tulemusbox, 535, 535, Color.GHOSTWHITE);
		tulemusteaken.setScene(tulemusstseen);
		tulemusteaken.setTitle("EELMISTE MÄNGUDE TULEMUSED");

		// MÄNGIJANIME AKEN

		final TextField nimi = new TextField();
		nimi.setText("Sisesta oma nimi");

		Button sisenemängu = new Button("SISENE MÄNGU");

		sisenemängu.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				mängijanimi = nimi.getText();
				try {
					if (NimeErind.MängijaNimeKontroll(mängijanimi) == false) {
						mängijaaken.hide();
						PeaMäng.show();
					}
				} catch (NimeErind o) {
					System.out.println("Erind:" + o);
					mängijaaken.hide();
					error.show();
				}

			}
		});

		VBox nimebox = new VBox(10);
		nimebox.setAlignment(Pos.CENTER);

		FlowPane pane1 = new FlowPane(10, 10);
		pane1.setAlignment(Pos.BOTTOM_CENTER);
		pane1.getChildren().add(sisenemängu);

		nimebox.getChildren().addAll(nimi, pane1);

		Scene stseen2 = new Scene(nimebox);
		mängijaaken.setScene(stseen2);

		mängijaaken.setTitle("MÄNGIJA NIME AKEN");

		Scene stseen1 = new Scene(mänguala, 535, 535, Color.GREEN);

		PeaMäng.setTitle("Yatzy");

		PeaMäng.setScene(stseen1);
		PeaMäng.setResizable(false);

		PeaMäng.hide();
		mängijaaken.show();
		error.hide();
	}

	// MEETOD KONTROLLIMAKS, KAS KÕIK PUNKTIKOHAD ON TÄIDETUD. KUI JAH; SIIS
	// LISAB PUNKTIDE LÕPPU KOGUSKOORI
	static String mängijanimi;

	// Meetod koodi, mis nullib ja lisab juurde asju enne järgmist veeretamist
	private void PealePunkte(final VBox punktiala, final VBox põhiülemine,
			Button veereta, Button tulemused, Text boonus) {
		Täringud.punktide_lisamine = 0;
		Täringud.veeretus = 0;
		Täringud.koguskoor += Täringud.skoor;
		Täringud.skoor = 0;
		Täringud.korraloendur += 1;
		Täringud.vaheta1 = true;
		Täringud.vaheta2 = true;
		Täringud.vaheta3 = true;
		Täringud.vaheta4 = true;
		Täringud.vaheta5 = true;

		if (Täringud.korraloendur == 6) {
			boonusekontroll(punktiala, boonus);
			Text kokku = new Text("Mängija: " + "\n" + mängijanimi
					+ "\nskoor kokku:\n" + Täringud.koguskoor);
			punktiala.getChildren().add(kokku);
			põhiülemine.getChildren().remove(veereta);
			põhiülemine.getChildren().add(tulemused);

		}
	}

	public void boonusekontroll(final VBox punktiala, Text boonus) {
		if (Täringud.boonusloendur > 62) {
			Täringud.koguskoor += 50;
			punktiala.getChildren().remove(boonus);
			Text boonuslõplik = new Text("Boonus: " + 50);
			punktiala.getChildren().add(7, boonuslõplik);
			
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
