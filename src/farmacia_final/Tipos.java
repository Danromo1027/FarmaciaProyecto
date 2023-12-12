/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia_final;

/**
 *
 * @author Usuario
 */
public class Tipos {
    
    int Code_type;
    String Name_type;

    public Tipos(int Code_type, String Name_type) {
        this.Code_type = Code_type;
        this.Name_type = Name_type;
    }

    public int getCode_type() {
        return Code_type;
    }

    public void setCode_type(int Code_type) {
        this.Code_type = Code_type;
    }

    public String getName_type() {
        return Name_type;
    }

    public void setName_type(String Name_type) {
        this.Name_type = Name_type;
    }

    @Override
    public String toString() {
        return "Tipos{" + "Code_type=" + Code_type + ", Name_type=" + Name_type + '}';
    }


    
    




    
    
 
    
    
}
