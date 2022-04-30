/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

/**
 *
 * @author palletta
 */
import java.util.*;

class BinarySearchTree {
	public static void main (String[] args) {
            
            Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
            System.out.print("Enter Test 1 Marks:- ");
            int test1= sc.nextInt();
            System.out.print("Enter Test 2 Marks:- ");
            int test2= sc.nextInt();
            System.out.print("Enter Test 3 Marks:- ");
            int test3= sc.nextInt();
            
            double module=(test1*0.3) + (test2 *0.3) + (test3 * 0.4);
            int ModuleMarks = (int) module;
            
            
		BST tree=new BST();
		tree.insert(test1);
		tree.insert(test2);
		tree.insert(test3);
		tree.inorder();
                System.out.println("Module marks is:- "+ModuleMarks);
	}
}

class Node{
	Node left;
	int val;
	Node right;
	Node(int val){
		this.val=val;
	}
}

class BST{
Node root;

public void insert(int key){
		Node node=new Node(key);
		if(root==null) {
			root = node;
			return;
		}
		Node prev=null;
		Node temp=root;
		while (temp!=null){
			if(temp.val>key){
				prev=temp;
				temp=temp.left;
			}
			else if (temp.val<key){
				prev=temp;
				temp=temp.right;
			}
		}
		if(prev.val>key)
			prev.left=node;
		else prev.right=node;
	}

public void inorder(){
		Node temp=root;
		Stack<Node> stack=new Stack<>();
		while (temp!=null||!stack.isEmpty()){
			if(temp!=null){
				stack.add(temp);
				temp=temp.left;
			}
			else {
				temp=stack.pop();
				System.out.print(temp.val+" ");
				temp=temp.right;
			}
		}
	}
}

