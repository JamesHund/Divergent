/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divergent;

/**
 *
 * @author James
 */
public class Faction {
    private String name, firstName, surname, motto;
    private long total;

    public Faction(String name, String firstName, String surname, String motto, long total) {
        this.name = name;
        this.firstName = firstName;
        this.surname = surname;
        this.motto = motto;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
        
    public void splitMotto(){
        String arr[] = motto.split(" ");
        String temp = "";
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            temp+= arr[i] + " ";
            count+= arr[i].length() + 1;
            if(count >= 60){
                temp+="\n";
                count = 0;
            }
            }
        motto = temp;
    }

    @Override
    public String toString() {
        return name + "\n" + firstName + " " + surname + "\t" + "Total " + total + "\n" + motto;
    }
    
    
}
