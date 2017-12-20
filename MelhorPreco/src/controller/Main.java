
package controller;

import datastructures.DuplicateKeyException;
import datastructures.LinkedList;
import model.Category;
import model.Establishment;
import model.Product;
import view.MainGraphicInterface;

public class Main {
 
    FileReader fr = new FileReader();
    
    public static LinkedList<Establishment> establishments = FileReader.getEstsData();
    public static LinkedList<Category> categories = new LinkedList();
    public static LinkedList<Product> products = new LinkedList();
    
    public static void main(String args[]) throws DuplicateKeyException{
    
        MainGraphicInterface mainInterface = new MainGraphicInterface(null, true);
        mainInterface.setVisible(true);
        
    }
    
}
