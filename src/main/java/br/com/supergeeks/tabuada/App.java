package br.com.supergeeks.tabuada;

import br.com.supergeeks.tabuada.service.TabuadaService;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application{
    
    @Override
    public void start(Stage stage){
        Label titulo = new Label("Digite um número");

        TextField campoNumero = new TextField();

        Button botaoGerar = new Button("Gerar tabuada");

        TextArea areaResultado = new TextArea();
        areaResultado.setEditable(false);

        botaoGerar.setOnAction(evento -> {
            int numero = Integer.parseInt(campoNumero.getText());

            String resultado = TabuadaService.gerarTabuada(numero, 10);
            areaResultado.setText(resultado);
        });

        VBox layout = new VBox(10, titulo, campoNumero, botaoGerar, areaResultado);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 420, 400);

        //Importando o CSS para o projeto
        String css = getClass().getResource("/br/com/supergeeks/tabuada/css/estilo.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Tabuada com JavaFX");
        stage.setScene(scene);
        stage.show();
        
    }


    public static void main(String[] args){
        launch(args);
    }
}