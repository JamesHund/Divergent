/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divergent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class FactionArray {
    
    private Faction arr[];
    private int count;

    public FactionArray(String file) {
        arr = new Faction[10];
        count = 0;
        
        try {
            Scanner scFile = new Scanner(new File(file));
            while(scFile.hasNext()){
                Scanner scLine = new Scanner(scFile.nextLine()).useDelimiter(";");
                String faction = scLine.next();
                String firstName = scLine.next();
                String surname = scLine.next();
                long total = scLine.nextLong();
                String motto = scLine.next();
                arr[count] = new Faction(faction,firstName,surname,motto,total);
                count++;
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found ");
        }
        
    } 

    @Override
    public String toString() {
        String temp = "";
        for(int i = 0; i < arr.length; i++){
            temp+=arr[i].toString() + "\n";
        }
        return temp;
    }
    
    
    
}
