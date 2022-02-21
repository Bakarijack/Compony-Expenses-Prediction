package com.example.prediction;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.net.URL;

public class FileLoader {
    private Pane view;

    public Pane getPage(String fileName){
        try {
            URL fileUrl = HelloController.class.getResource(fileName+".fxml");
            if (fileUrl == null){
                throw new FileNotFoundException("The file is not found");
            }

            view = new FXMLLoader().load(fileUrl);
        }catch(Exception e){
            System.out.println("NO page "+fileName+" check the  file please");
        }

        return view;
    }
}
