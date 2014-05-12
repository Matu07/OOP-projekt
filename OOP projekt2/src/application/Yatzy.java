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
	public void start(final Stage PeaM�ng) {
		final Text �hed = new Text("�hed");
		final Text kahed = new Text("Kahed");
		final Text kolmed = new Text("Kolmed");
		final Text neljad = new Text("Neljad");
		final Text viied = new Text("Viied");
		final Text kuued = new Text("Kuued");

		// PUNKTIDE ALA

		final VBox punktiala = new VBox(40);
		punktiala.setPadding(new Insets(10));
		Text punktid = new Text("Punktid");
		punktid.setFont(Font.font("Ariel", 20));
		punktid.setUnderline(true);

		punktiala.getChildren().addAll(punktid, �hed, kahed, kolmed, neljad,
				viied, kuued);
		punktiala.setStyle("-fx-background-color: ghostwhite");

		�hed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (T�ringud.veeretus == 2) {
					T�ringud.LeiaArv(1);
					punktiala.getChildren().remove(�hed);
					Text �hedl�plik = new Text("�hed: " + T�ringud.skoor);
					punktiala.getChildren().add(1, �hedl�plik);
					PealePunkte(punktiala);

				}
			}
		});

		kahed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (T�ringud.veeretus == 2) {
					T�ringud.LeiaArv(2);
					punktiala.getChildren().remove(kahed);
					Text kahedl�plik = new Text("Kahed: " + T�ringud.skoor);
					punktiala.getChildren().add(2, kahedl�plik);
					PealePunkte(punktiala);

				}
			}
		});

		kolmed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (T�ringud.veeretus == 2) {
					T�ringud.LeiaArv(3);
					punktiala.getChildren().remove(kolmed);
					Text kolmedl�plik = new Text("Kolmed: " + T�ringud.skoor);
					punktiala.getChildren().add(3, kolmedl�plik);
					PealePunkte(punktiala);

				}
			}
		});

		neljad.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (T�ringud.veeretus == 2) {
					T�ringud.LeiaArv(4);
					punktiala.getChildren().remove(neljad);
					Text neljadl�plik = new Text("Neljad: " + T�ringud.skoor);
					punktiala.getChildren().add(4, neljadl�plik);
					PealePunkte(punktiala);

				}
			}

		});

		viied.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (T�ringud.veeretus == 2) {
					T�ringud.LeiaArv(5);
					punktiala.getChildren().remove(viied);
					Text viiedl�plik = new Text("Viied: " + T�ringud.skoor);
					punktiala.getChildren().add(5, viiedl�plik);
					PealePunkte(punktiala);

				}
			}
		});

		kuued.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				if (T�ringud.veeretus == 2) {
					T�ringud.LeiaArv(6);
					punktiala.getChildren().remove(kuued);
					Text kuuedl�plik = new Text("Kuued: " + T�ringud.skoor);
					punktiala.getChildren().add(6, kuuedl�plik);
					PealePunkte(punktiala);

				}
			}
		});

		// P�HIALA
		final BorderPane p�hiala = new BorderPane();
		p�hiala.setPadding(new Insets(10));

		// P�HIALA �LEMINE TEKSTIOSA
		VBox p�hi�lemine = new VBox();
		p�hi�lemine.setPadding(new Insets(10));
		p�hi�lemine.setSpacing(30);
		Text yatzym�ng = new Text("Yatzy m�ng");
		yatzym�ng.setFont(Font.font("Ariel", 18));
		yatzym�ng.setUnderline(true);
		Text eesm�rk = new Text(
				"\n\nM�ngu eesm�rk on saada v�imalikult palju\netten�htud v��rtusega t�ringuviskeid.");

		// P�HIALA KESKMINE M�NGUOSA
		Button veereta = new Button("VEERETA!");
		final VBox p�hikesk = new VBox();
		p�hikesk.setPadding(new Insets(10));
		final Text vahetustekst = new Text(
				"Vali, millist t�ringut soovid vahetada.");
		final Text valipunkt = new Text(
				"Vajutage kohale, kuhu soovite oma punktid panna.");

		// P�HIALA ALUMINE T�RINGUTEGA OSA
		final HBox p�hit�ringud = new HBox();
		p�hit�ringud.setPadding(new Insets(10));
		p�hit�ringud.setStyle("-fx-background-color: ghostwhite");

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
				// N�ITAB NUPUVAJUTUSE PEALE T�RINGUID
				if (T�ringud.punktide_lisamine == 0) {
					if (T�ringud.veeretus == 1) {
						p�hikesk.getChildren().clear();
						KasVaheta(vahetus1, vahetus2, vahetus3, vahetus4,
								vahetus5);
						p�hikesk.getChildren().addAll(vahetustekst);
						p�hit�ringud.getChildren().clear();
						T�ringud.Veeretamine();
						T�ringud.N�itamine(p�hit�ringud);
						T�ringud.veeretus += 1;
					} else if (T�ringud.veeretus == 2) {
						KasVaheta(vahetus1, vahetus2, vahetus3, vahetus4,
								vahetus5);
						p�hikesk.getChildren().clear();
						p�hit�ringud.getChildren().clear();
						p�hikesk.getChildren().add(valipunkt);
						T�ringud.Veeretamine();
						T�ringud.N�itamine(p�hit�ringud);
						T�ringud.punktide_lisamine = 1;

					} else {
						vahetus1.setSelected(true);
						vahetus2.setSelected(true);
						vahetus3.setSelected(true);
						vahetus4.setSelected(true);
						vahetus5.setSelected(true);
						p�hikesk.getChildren().clear();
						p�hit�ringud.getChildren().clear();
						p�hikesk.getChildren().addAll(vahetustekst);
						T�ringud.Veeretamine();
						T�ringud.N�itamine(p�hit�ringud);
						T�ringud.veeretus += 1;
					}

				}

			}

			private void KasVaheta(final CheckBox vahetus1,
					final CheckBox vahetus2, final CheckBox vahetus3,
					final CheckBox vahetus4, final CheckBox vahetus5) {
				T�ringud.vaheta1 = vahetus1.isSelected();
				T�ringud.vaheta2 = vahetus2.isSelected();
				T�ringud.vaheta3 = vahetus3.isSelected();
				T�ringud.vaheta4 = vahetus4.isSelected();
				T�ringud.vaheta5 = vahetus5.isSelected();
			}

		});

		Button l�peta = new Button("V�LJU");
		l�peta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				PeaM�ng.hide();
			}
		});
		
		//VAJA TEHA!
		//*Vajutamisel loetakse failist eelmise k�igu seis ja antakse t�ringutele vastavad v��rtused.
		//*Saab vajutada �he korra, kui rohkem, siis tekib vastav erind.
		Button k�iktagasi = new Button("K�IK TAGASI");
		k�iktagasi.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				try {
					//Panin praegu absolute pathi, sest ei saanud suhtelist t��le. V�iks �ra muuta.
					InputStream fis=new FileInputStream("C:/Users/Martin/git/OOP--projekt/OOP projekt2/manguseis.txt");
					BufferedReader br = new BufferedReader(new InputStreamReader((fis), "UTF8"));
					while (true) {
						String viimane = null, rida;
						while ((rida = br.readLine()) != null) {
					        viimane = rida;
					    }
						String[] numbrid = viimane.split(";");
						if (numbrid == null) break;
						//vaja siduda p�ris v��rtustega
						int t�ring1 = Integer.parseInt(numbrid[0]);
						int t�ring2 = Integer.parseInt(numbrid[1]);
						int t�ring3 = Integer.parseInt(numbrid[2]);
						int t�ring4 = Integer.parseInt(numbrid[3]);
						int t�ring5 = Integer.parseInt(numbrid[4].trim()); 
						System.out.print(numbrid); //testimiseks
			        }
			        br.close();
		        } 
				catch (Exception e) {
		            System.out.println("Erind: " + e);
		        }

			}
		});
		
		
		nuppudeala.getChildren().addAll(vahetus1, vahetus2, vahetus3, vahetus4,
				vahetus5);
		p�hi�lemine.getChildren().addAll(yatzym�ng, eesm�rk, veereta, k�iktagasi, l�peta);

		p�hiala.setTop(p�hi�lemine);
		p�hiala.setCenter(p�hikesk);
		p�hiala.setBottom(p�hit�ringud);

		// M�NGUALA
		BorderPane m�nguala = new BorderPane();
		m�nguala.setLeft(punktiala);
		m�nguala.setBottom(nuppudeala);
		m�nguala.setCenter(p�hiala);

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
				m�ngijanimi = nimi.getText();
				if (m�ngijanimi.equals("Sisesta oma nimi")) {
					m�ngijaaken.hide();
					error.show();
				} else {
					m�ngijaaken.hide();
					PeaM�ng.show();
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

		Scene stseen1 = new Scene(m�nguala, 535, 535, Color.GREEN);

		PeaM�ng.setTitle("Yatzy");

		PeaM�ng.setScene(stseen1);
		PeaM�ng.setResizable(false);

		PeaM�ng.hide();
		m�ngijaaken.show();
		error.hide();
	}

	// MEETOD KONTROLLIMAKS, KAS K�IK PUNKTIKOHAD ON T�IDETUD. KUI JAH; SIIS
	// LISAB PUNKTIDE L�PPU KOGUSKOORI
	String m�ngijanimi;

	// Meetod koodi, mis nullib ja lisab juurde asju enne j�rgmist veeretamist
	private void PealePunkte(final VBox punktiala) {
		T�ringud.punktide_lisamine = 0;
		T�ringud.veeretus = 0;
		T�ringud.koguskoor += T�ringud.skoor;
		T�ringud.skoor = 0;
		T�ringud.korraloendur += 1;
		T�ringud.vaheta1 = true;
		T�ringud.vaheta2 = true;
		T�ringud.vaheta3 = true;
		T�ringud.vaheta4 = true;
		T�ringud.vaheta5 = true;

		if (T�ringud.korraloendur == 6) {
			Text kokku = new Text("M�ngija: " + "\n" + m�ngijanimi
					+ "\nskoor kokku:\n" + T�ringud.koguskoor);
			punktiala.getChildren().add(kokku);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
