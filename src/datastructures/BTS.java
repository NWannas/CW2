/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.ArrayList;

/**
 *
 * @author rla
 * @param <E>
 */
public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements IBSearchTree<E> {
    // <E extends Comparable<E>>

    @Override
    public void createBalancedTree(ArrayList<E> dataList, int leftCurrentRange, int rightCurrentRange){
        // Add your code here
        if (root == null)  return root; 
   
        //traverse the tree
        if (key < root.key)     //traverse left subtree 
            root.left = delete_Recursive(root.left, key); 
        else if (key > root.key)  //traverse right subtree
            root.right = delete_Recursive(root.right, key); 
        else  { 
            // node contains only one child
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
   
            // node has two children; 
            //get inorder successor (min value in the right subtree) 
            root.key = minValue(root.right); 
   
            // Delete the inorder successor 
            root.right = delete_Recursive(root.right, root.key); 
        } 
        return root; 
    }

    public Node<E> balancedTree(ArrayList<E> dataList, int leftCurrentRange, int rightCurrentRange){
       
            //initially minval = root
        int minval = root.key; 
        //find minval
        while (root.left != null)  { 
            minval = root.left.key; 
            root = root.left; 
        } 
        return minval; 
        
    }


    @Override
    public void addNode(E theItem){
        
  root = insert_Recursive(root, key); 
    }

    private Node<E> addNode(Node<E> localRoot, E theItem) {
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
        //traverse the tree
        if (key < root.key)     //insert in the left subtree
            root.left = insert_Recursive(root.left, key); 
        else if (key > root.key)    //insert in the right subtree
            root.right = insert_Recursive(root.right, key); 
          // return pointer
        return root; 
    }

    @Override
    public boolean nodeContains(E desiredItem){
         if (root != null) { 
            inorder_Recursive(root.left); 
            System.out.print(root.key + " "); 
            inorder_Recursive(root.right); 
        }
    }

    @Override
    public E findItem(E desiredItem){
    boolean search(int key)  { 
        root = search_Recursive(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    }
    }
    private E findItem(Node<E> localRoot, E desiredItem) {
           // Base Cases: root is null or key is present at root 
        if (root==null || root.key==key) 
            return root; 
        // val is greater than root's key 
        if (root.key > key) 
            return search_Recursive(root.left, key); 
        // val is less than root's key 
        return search_Recursive(root.right, key); 
    }

    @Override
    public E deleteNode(E desiredItem){
    bst.deleteKey(E); 
    bst.inorder();
        return null; 
    }
    
    private Node<E> deleteNode(Node<E> localRoot, E desiredItem){
          inorder_Recursive(root); re
        return root;
    }
    private E inOrderSuccessor(Node<E> localRoot) {
        // If the left child has no left child, it is
        // the inorder successor.
        if (localRoot.leftNode.leftNode == null) {
            E minimum = localRoot.leftNode.nodeData;
            localRoot.leftNode = localRoot.leftNode.rightNode;
            return minimum;
        }
        return inOrderSuccessor(localRoot.leftNode);
    }
    
    @Override
    public boolean removeNode(E desiredItem){
        return deleteNode(desiredItem) != null;
    }

}
