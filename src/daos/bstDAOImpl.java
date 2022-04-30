package daos;

import app.StudentMarksBST;
import datastructures.BinarySearchTree;
import helpers.Sorts;
import helpers.TextColours;
import model.DisplayOrder;
import model.StudentMarks;
import view.aView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bstDAOImpl<E> extends DAO<E>{

    private BinarySearchTree<StudentMarks> theBST;
    private aView theView;
    public static final char DELIMITER = ',';
    public static final char EOLN='\n';
    public static final String QUOTE="\"";
    public static final String USERDIRECTORY = System.getProperty("user.dir");

    private String stripQuotes(String str) {
        return str.substring(1, str.length()-1);
    }

    public bstDAOImpl() {
        // Add your code here
    }

    public BinarySearchTree<StudentMarks> getTheBST() {
        // Add your code here
        return null; // Add your return type here
    }

    public void setTheBST(BinarySearchTree<StudentMarks> theBST) {
        // Add your code here
    }

    @Override
    public void loadFromFile(String filename) {
        String transactionFile = USERDIRECTORY +"\\" + filename;
        // Add your variables here

        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) {
            // Add your variables here

            String[] temp;
            String line = br.readLine();
            while(line!=null){
                // split each line and store the values in your variables

                // Create required instances of your modelled data

                // Insert into the dataset
                line = br.readLine();

            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(StudentMarksBST.class.getName()).log(Level.INFO, null, ex);
        }
        // sort the dataset
        // create a balanced tree

    }

    @Override
    public void writeToFile(String filename) {
        // Add your code here
    }

    @Override
    public void add(E theData) {
        // Add your code here
    }

    @Override
    public void update(E theData) {

    }

    @Override
    public void findData(int theData) {
        // Add your code here
    }

    @Override
    public E getData(String theData) {
        return null;
    }

    @Override
    public void removeData(int theData) {
        // Add your code here
    }

    public void displayBST(DisplayOrder order){
        // Add your code here
    }

    public void displayBSTChart(){
        // Add your code here
    }

}
