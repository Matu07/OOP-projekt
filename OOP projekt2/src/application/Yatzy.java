package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Yatzy extends Application {


	@Override
	public void start(final Stage PeaMäng) {
		final Text ühed = new Text("Ühed");
		Text kahed = new Text("Kahed");
		Text kolmed = new Text("Kolmed");
		Text neljad = new Text("Neljad");
		Text viied = new Text("Viied");
		Text kuued = new Text("Kuued");


		
		
		
		//PUNKTIDE ALA

		final VBox punktiala = new VBox(40);
		punktiala.setPadding(new Insets(10));
		Text punktid = new Text("Punktid");
		punktid.setFont(Font.font("Ariel", 20));
		punktid.setUnderline(true);
		
	    punktiala.getChildren().addAll(punktid,ühed,kahed, kolmed,neljad,viied,kuued);
	    punktiala.setStyle("-fx-background-color: ghostwhite");
	    
	    ühed.setOnMouseClicked(new EventHandler<MouseEvent>() {
	    	public void handle(MouseEvent me) {
	    		if (Täringud.veeretus ==2) {
	    			if (Täringud.täring1 == 1) {
	    				Täringud.skoor += Täringud.täring1;
	    			}
	    			if (Täringud.täring2 == 1) {
	    				Täringud.skoor += Täringud.täring2;
	    			}
	    			if (Täringud.täring3 == 1) {
	    				Täringud.skoor += Täringud.täring3;
	    			}
	    			if (Täringud.täring4 == 1) {
	    				Täringud.skoor += Täringud.täring4;
	    			}
	    			if (Täringud.täring5 == 1) {
	    				Täringud.skoor += Täringud.täring5;
	    			}
	    			System.out.println("Prindib väärtused, mis peaksid olema samad täringutega : " + Täringud.täring1 + " " + Täringud.täring2 + " " + Täringud.täring3 + " " + Täringud.täring4 + " " + Täringud.täring5 );
	    			punktiala.getChildren().remove(ühed);
	    			Text ühedlõplik = new Text("Ühed: " + Täringud.skoor);
	    			punktiala.getChildren().add(1, ühedlõplik);
	    			Täringud.punktide_lisamine = 0;
	    			Täringud.veeretus=0;
	    		}
	    	}
	    });
	    
	    
	    
	    //PÕHIALA
	    final BorderPane põhiala = new BorderPane();
	    põhiala.setPadding(new Insets(10));
	    
	    //PÕHIALA ÜLEMINE TEKSTIOSA
	    HBox põhiülemine = new HBox();
	    põhiülemine.setPadding(new Insets(10));
	    Text yatzymäng = new Text("Yatzy mäng");
	  	yatzymäng.setFont(Font.font("Ariel", 18));
	  	yatzymäng.setUnderline(true);
	  	Text eesmärk = new Text("\n\nMängu eesmärk on saada võimalikult palju\nettenähtud väärtusega täringuviskeid.");
	  	põhiülemine.getChildren().addAll(yatzymäng, eesmärk);
	  	
	  	//PÕHIALA KESKMINE MÄNGUOSA
	  	VBox põhikesk = new VBox();
	    põhikesk.setPadding(new Insets(10));
	    Text ajutine1 = new Text("Siin hakkab jooksma mänguinfo");
	    põhikesk.getChildren().addAll(ajutine1);
	  	
	  	//PÕHIALA ALUMINE TÄRINGUTEGA OSA
	  	final HBox põhitäringud = new HBox();
	    põhitäringud.setPadding(new Insets(10));
	    põhitäringud.setStyle("-fx-background-color: ghostwhite");
	    
		
		//NUPPUDE ALA
	    HBox nuppudeala = new HBox();
	    nuppudeala.setPadding(new Insets(40));
	    nuppudeala.setAlignment(Pos.CENTER);
	    
	    
	    
	    
	    Button veereta = new Button("VEERETA TÄRINGUID");
	    veereta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				//NÄITAB NUPUVAJUTUSE PEALE TÄRINGUID, ESIALGU JÄRJEST JA KORDUV VAJUTUS TEKITAB JAMA
				if (Täringud.punktide_lisamine==0) {
					if (Täringud.veeretus == 1) {
						põhitäringud.getChildren().clear();
						Täringud.Veeretamine();
						Täringud.Näitamine(põhitäringud);
						Täringud.veeretus+=1;				
						}
					else if (Täringud.veeretus ==2) {
						põhitäringud.getChildren().clear();
						Täringud.Veeretamine();
						Täringud.Näitamine(põhitäringud);
						Täringud.punktide_lisamine=1;
						
					}
					else {
						Täringud.Veeretamine();
						Täringud.Näitamine(põhitäringud);
						Täringud.veeretus+=1;
					}
					
				}
				
			}
	    });
	    
	    Button lõpeta = new Button("LÕPETA MÄNG");
	    lõpeta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				PeaMäng.hide();
			}
	    });
	    nuppudeala.getChildren().addAll(veereta, lõpeta);
	    
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

		// MÄNGIJANIME AKEN

		final TextField nimi = new TextField();
		nimi.setText("Sisesta oma nimi");

		Button sisenemängu = new Button("SISENE MÄNGU");

		sisenemängu.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				String mängijanimi = nimi.getText();
				if (mängijanimi.equals("Sisesta oma nimi")) {
					mängijaaken.hide();
					error.show();
				} else {
					mängijaaken.hide();
					PeaMäng.show();
					System.out.println(mängijanimi);
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

	public static void main(String[] args) {
		launch(args);
	}
}
