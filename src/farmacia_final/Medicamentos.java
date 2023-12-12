/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia_final;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Medicamentos extends Tipos {
    
    public int Code;
    public String Name;
    public String Description;
    public int Price;
    public int Stock;
    public String Supplier;


   
 
    

    public Medicamentos(int Code, String Name, String Description, int Price, int Stock, String Supplier, int Cod_type, String Name_type) {
        super(Cod_type, Name_type);
        this.Code = Code;
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        this.Stock = Stock;
        this.Supplier = Supplier;
        
    }



    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
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
        return "Medicamentos{" + "Code=" + Code + ", Name=" + Name + ", Description=" + Description + ", Price=" + Price + ", Stock=" + Stock + ", Supplier=" + Supplier + ", Code_type=" + Code_type + ", Name_type=" + Name_type + '}';
    }
    
       
    
    
    
}
