
package controller;

import datastructures.LinkedList;
import model.Category;
import model.Establishment;
import model.Product;
import view.MainGraphicInterface;


public class Main {
 
    public static LinkedList<Establishment> establishments = new LinkedList();
    public static LinkedList<Category> categories = new LinkedList();
    public static LinkedList<Product> products = new LinkedList();
    
    public static void main(String args[]){
    
        MainGraphicInterface mainInterface = new MainGraphicInterface(null, true);
        mainInterface.setVisible(true);
    
    }
    
}
