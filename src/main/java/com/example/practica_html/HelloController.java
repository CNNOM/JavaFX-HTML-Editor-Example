package com.example.practica_html;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebView;

public class HelloController {

    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    private WebView webView;

    @FXML
    private TextArea textArea;

    @FXML
    private Button htmlToText;

    @FXML
    private Button textToHtml;

    @FXML
    private void initialize() {
        // Обработчик для кнопки "Преобразовать в HTML"
        htmlToText.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                htmlEditor.setHtmlText(textArea.getText());
            }
        });

        // Обработчик для кнопки "Преобразовать в текст"
        textToHtml.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                textArea.setText(htmlEditor.getHtmlText());
            }
        });
    }

}