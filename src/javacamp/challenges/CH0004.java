/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacamp.challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author trabdlkarim
 */
public enum CH0004 {
    INSTANCE;
    private String text = null;
    
    public String getText() {
      if (text == null){
      try {
          File chFile = new File("chfiles/ch0004.txt");
         Scanner reader = new Scanner(chFile);
         this.text = "\n";
         while (reader.hasNextLine()) {
             String line = reader.nextLine();
               this.text += line + "\n";
         }
        reader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        System.exit(1);
      }
    }
     return text;
    }
    
    public CH0004 getInstance(){
     return INSTANCE;
    }
    
    
}
