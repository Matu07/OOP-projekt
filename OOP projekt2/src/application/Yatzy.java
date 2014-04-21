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
	public void start(final Stage PeaM�ng) {
		Text �hed = new Text("�hed");
		Text kahed = new Text("Kahed");
		Text kolmed = new Text("Kolmed");
		Text neljad = new Text("Neljad");
		Text viied = new Text("Viied");
		Text kuued = new Text("Kuued");

		�hed.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				System.out.println("TULEB �HTEDE KOGUSUMMA ! ! ! ! ! ! !");

			}
		});
		
		
		
		//PUNKTIDE ALA

		VBox punktiala = new VBox(40);
		punktiala.setPadding(new Insets(10));
		Text punktid = new Text("Punktid");
		punktid.setFont(Font.font("Ariel", 20));
		punktid.setUnderline(true);
		
	    punktiala.getChildren().addAll(punktid,�hed,kahed, kolmed,neljad,viied,kuued);
	    punktiala.setStyle("-fx-background-color: ghostwhite");
	    
	    //P�HIALA
	    final BorderPane p�hiala = new BorderPane();
	    p�hiala.setPadding(new Insets(10));
	    
	    //P�HIALA �LEMINE TEKSTIOSA
	    HBox p�hi�lemine = new HBox();
	    p�hi�lemine.setPadding(new Insets(10));
	    Text yatzym�ng = new Text("Yatzy m�ng");
	  	yatzym�ng.setFont(Font.font("Ariel", 18));
	  	yatzym�ng.setUnderline(true);
	  	Text eesm�rk = new Text("\n\nM�ngu eesm�rk on saada v�imalikult palju\netten�htud v��rtusega t�ringuviskeid.");
	  	p�hi�lemine.getChildren().addAll(yatzym�ng, eesm�rk);
	  	
	  	//P�HIALA KESKMINE M�NGUOSA
	  	VBox p�hikesk = new VBox();
	    p�hikesk.setPadding(new Insets(10));
	    Text ajutine1 = new Text("Siin hakkab jooksma m�nguinfo");
	    p�hikesk.getChildren().addAll(ajutine1);
	  	
	  	//P�HIALA ALUMINE T�RINGUTEGA OSA
	  	final HBox p�hit�ringud = new HBox();
	    p�hit�ringud.setPadding(new Insets(10));
	    p�hit�ringud.setStyle("-fx-background-color: ghostwhite");
	    
		
		//NUPPUDE ALA
	    HBox nuppudeala = new HBox();
	    nuppudeala.setPadding(new Insets(40));
	    nuppudeala.setAlignment(Pos.CENTER);
	    
	    Button veereta = new Button("VEERETA T�RINGUID");
	    veereta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				//N�ITAB NUPUVAJUTUSE PEALE T�RINGUID, ESIALGU J�RJEST JA KORDUV VAJUTUS TEKITAB JAMA
				ImageView iv1 = new ImageView();
		        iv1.setImage(Numbrid.t�ring1);
		        iv1.setFitWidth(75);
		        iv1.setPreserveRatio(true);
		        ImageView iv2 = new ImageView();
		        iv2.setImage(Numbrid.t�ring2);
		        iv2.setFitWidth(75);
		        iv2.setPreserveRatio(true);
		        ImageView iv3 = new ImageView();
		        iv3.setImage(Numbrid.t�ring3);
		        iv3.setFitWidth(75);
		        iv3.setPreserveRatio(true);
		        ImageView iv4 = new ImageView();
		        iv4.setImage(Numbrid.t�ring4);
		        iv4.setFitWidth(75);
		        iv4.setPreserveRatio(true);
		        ImageView iv5 = new ImageView();
		        iv5.setImage(Numbrid.t�ring5);
		        iv5.setFitWidth(75);
		        iv5.setPreserveRatio(true);
		        ImageView iv6 = new ImageView();
		        iv6.setImage(Numbrid.t�ring6);
		        iv6.setFitWidth(72);
		        iv6.setPreserveRatio(true);
				p�hit�ringud.getChildren().addAll(iv1, iv2, iv3, iv4, iv5, iv6);
				
			}
	    });
	    
	    Button l�peta = new Button("L�PETA M�NG");
	    l�peta.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				PeaM�ng.hide();
			}
	    });
	    nuppudeala.getChildren().addAll(veereta, l�peta);
	    
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

		Scene stseen1 = new Scene(m�nguala, 535, 535, Color.GREEN);


		PeaM�ng.setTitle("Yatzy");

		PeaM�ng.setScene(stseen1);
		PeaM�ng.setResizable(false);

		PeaM�ng.hide();
		m�ngijaaken.show();
		error.hide();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
