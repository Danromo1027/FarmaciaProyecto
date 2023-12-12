/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmacia_final;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author EDER ROJAS , CRISTIAN BANQUETT, RUBEN RODRIGUEZ, JORGE CORTES
 */
public class Farmacia_final {
    Medicamentos medArray[]=new Medicamentos[100];
    public static Tipos typeArray[]=new Tipos[100];
    int i=0;
    int p =0;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormRegisterMedicine ventana1=new FormRegisterMedicine();
        ventana1.setSize(520,670);
        ventana1.setTitle("EL REBAJON | REGISTRO ");
        ventana1.setLocationRelativeTo(null);
        ventana1.setVisible(true);

        
    }
    
    //  add methods
    public void addMedicine(String Code, String Name, String Description, String Price, String Stock, String Supplier, String TypeCode, String TypeName) {
       Medicamentos medicineObj = new Medicamentos(Integer.parseInt(Code), Name, Description, Integer.parseInt(Price), Integer.parseInt(Stock), Supplier, Integer.parseInt(TypeCode), TypeName);
       medArray[i] = medicineObj;
       i++;
       JOptionPane.showMessageDialog(null, "Medicine added successfully");
    }
    
    public void addTypes(String typeCode, String typeName) {
        Tipos typeObject = new Tipos(Integer.parseInt(typeCode), typeName);
        typeArray[p] = typeObject;
        p++;
        JOptionPane.showMessageDialog(null, "Medication Type added successfully");
    }
    
    // uptdate methods
    public void updateMedication(String code, String name, String Description, String price, String stock, String supplier, String typeCode, String typeName) {
    for (int j = 0; j < i; j++) {
        if (code.equals(Integer.toString(medArray[j].getCode()))) {
            medArray[j].setCode(Integer.parseInt(code));
            medArray[j].setName(name);
            medArray[j].setDescription(Description);
            medArray[j].setPrice(Integer.parseInt(price));
            medArray[j].setStock(Integer.parseInt(stock));
            medArray[j].setSupplier(supplier);
            medArray[j].setCode_type(Integer.parseInt(typeCode));
            medArray[j].setName_type(typeName);
        }
        JOptionPane.showMessageDialog(null, "Medication updated successfully");
        }
    }
    
    public void updateType(String typeCode, String typeName) {
    for (int j = 0; j < p; j++) {
        if (typeCode.equals(Integer.toString(typeArray[j].getCode_type()))) {
            typeArray[j].setCode_type(Integer.parseInt(typeCode));
            typeArray[j].setName_type(typeName);
        }
        JOptionPane.showMessageDialog(null, "Medication Type updated successfully");
        }
    }
    
    public void deleteMedication(String code, String name, String description, String price, String stock, String supplier, String typeCode, String typeName) {    
        int indexToRemove = -1;

        for (int j = 0; j < i; j++) {
            if (code.equals(Integer.toString(medArray[j].getCode()))) {
                indexToRemove = j;
                break;
            }
        }

        if (indexToRemove != -1) {
            // Shift remaining elements backward to fill the space
            for (int k = indexToRemove; k < i - 1; k++) {
                medArray[k] = medArray[k + 1];
            }

            // Nullify the last element
            medArray[i - 1] = null;

            // Decrease the element counter
            i--;

            JOptionPane.showMessageDialog(null, "Medication deleted successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Medication not found");
            }

    }
    
    public void deleteType(String typeCode, String typeName) {
    int indexToRemove = -1;

    for (int j = 0; j < p; j++) {
        if (typeCode.equals(Integer.toString(typeArray[j].getCode_type()))) {
            indexToRemove = j;
            break;
        }
    }

    if (indexToRemove != -1) {
        // Shift remaining elements backward to fill the space
        for (int k = indexToRemove; k < p - 1; k++) {
            typeArray[k] = typeArray[k + 1];
        }

        // Nullify the last element
        typeArray[p - 1] = null;

        // Decrease the element counter
        p--;

        JOptionPane.showMessageDialog(null, "Medication Type deleted successfully");
    } else {
        JOptionPane.showMessageDialog(null, "Medication Type not found");
        }
    }
    
    public String searchMedication(String data) {
    for (int j = 0; j < i; j++) {
        if (data.equals(medArray[j].getName())) {
            return medArray[j].toString();
        }
    }
    JOptionPane.showMessageDialog(null, "Medication not found");
    return "Not found";
}

    public String searchType(String data) {
        
        for (int j = 0; j < p; j++) {// i por p
            if (data.equals(typeArray[j].getName_type())) {
                return typeArray[j].toString();
            }
        }
        JOptionPane.showMessageDialog(null, "Medication Type not found");
        return "Not found";
    }

    public String getValueFromToString(String cadena, String clave) {
            String regex = clave + "=([^,}]*)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(cadena);
            if (matcher.find()) {
                return matcher.group(1).trim();
            }
            return null;
        } 
    
    public Tipos[] getTypeArray(){
        return typeArray;
    }
    

    
}
