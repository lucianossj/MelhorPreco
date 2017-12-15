
package controller;

import datastructures.AVLTree;
import datastructures.BinarySearchTree;
import datastructures.DuplicateKeyException;
import datastructures.Hashtable;
import datastructures.LinkedList;
import model.Category;
import model.Establishment;
import model.Product;
import view.MainGraphicInterface;


public class Main {
 
    public static LinkedList<Establishment> establishments = new LinkedList();
    public static LinkedList<Category> categories = new LinkedList();
    public static LinkedList<Product> products = new LinkedList();
    
    public static void main(String args[]) throws DuplicateKeyException{
    
        MainGraphicInterface mainInterface = new MainGraphicInterface(null, true);
        mainInterface.setVisible(true);
        
        /*BinarySearchTree teste = new BinarySearchTree();
        
        teste.insert(2.0);
        teste.insert(0.9);
        teste.insert(11.0);
        teste.insert(0.1);
        teste.insert(27.0);
        teste.insert(22.0);
        teste.insert(37.0);
        teste.insert(34.0);
        teste.insert(100.0);
        teste.insert(10.0);
        
        teste.print_tree(teste.getRaiz());*/
        
    }
    
}
