/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.json_app;

import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class Json_App {

    public static void main(String[] args) {
        //create a JSON object from the import library 
        //ClassName objectname = new ClassName();
        
        JSONObject person = new JSONObject();
        person.put("name", "Jake");
        person.put("age", 23);
        person.put("isStudent", false);
        
      String prettyJson = person.toString(4); 
      
      //write to file
       String fileName = "person.json";
       try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(prettyJson);
            fileWriter.flush(); // optional but good practice
            System.out.println("Successfully wrote pretty JSON to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
        }
        
        
        
    }
}
