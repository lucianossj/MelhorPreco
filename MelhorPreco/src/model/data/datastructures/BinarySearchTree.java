/*
 * Data Structures and Algorithms.
 * Copyright (C) 2016 Rafael Guterres Jeffman
 *
 * See the LICENSE file accompanying this source code, for
 * licensing restrictions that might apply.
 *
 */
package datastructures;

import java.util.ArrayList;

class BSTNode<T extends Comparable<T>> {

    private T value;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode(T value) {
        this.value = value;
    }

    public T getValue(){
    
        return value;
        
    }
    
    public BSTNode<T> getRight() {
        return right;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void insert(T value) throws DuplicateKeyException {
        int cmp = value.compareTo(this.value);
        if (cmp < 0) {
            insertLeft(value);
        } else if (cmp > 0) {
            insertRight(value);
        } else {
            throw new DuplicateKeyException("Already inserted: " + value);
        }
    }

    private void insertLeft(T value) throws DuplicateKeyException {
        if (left == null) {
            left = new BSTNode<>(value);
        } else {
            left.insert(value);
        }
    }

    private void insertRight(T value) throws DuplicateKeyException {
        if (right == null) {
            right = new BSTNode<>(value);
        } else {
            right.insert(value);
        }
    }

    public void print() {
        System.out.print("(" + value + " ");
        if (left != null) {
            left.print();
        } else {
            System.out.print("_");
        }
        if (right != null) {
            right.print();
        } else {
            System.out.print(" _");
        }
        System.out.print(")");
    }

    public T search(T key) {
        int cmp = key.compareTo(this.value);
        if (cmp < 0) {
            if (left == null) {
                return null;
            } else {
                return left.search(key);
            }
        } else if (cmp > 0) {
            if (right == null) {
                return null;
            } else {
                return right.search(key);
            }
        } else {
            return value;
        }
    }

}

public class BinarySearchTree<T extends Comparable<T>> {

    private BSTNode<T> raiz;
    
    public BSTNode<T> getRaiz(){
    
        return raiz;
        
    }

    public void insert(T value) throws DuplicateKeyException {
        if (raiz == null) {
            raiz = new BSTNode<>(value);
        } else {
            raiz.insert(value);
        }
    }

    public void print() {
        if (raiz != null) {
            raiz.print();
        }
    }

    public T search(T key) {
        if (raiz == null) {
            return null;
        }
        return raiz.search(key);
    }

    public void printTree(BSTNode<T> node) {

        if (node != null) {
            
            printTree(node.getLeft());
                        
            System.out.println(node.getValue());
            
            printTree(node.getRight());
            
        }
        
    }
    
    ArrayList<T> allDataArray = new ArrayList();
    
    public ArrayList<T> allDataArray(BSTNode<T> node){
    
        if(node != null){
        
            allDataArray(node.getLeft());
            
            allDataArray.add(node.getValue());
            
            allDataArray(node.getRight());
            
        }
        
        return allDataArray;
        
    }

}
