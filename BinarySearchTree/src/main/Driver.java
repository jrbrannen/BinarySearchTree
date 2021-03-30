/**************************************************************
* Name        : Project Name
* Author      : Jeremy Brannen
* Created     : 3/24/2021
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program overall description here
*               Input:  list and describe
*               Output: list and describe
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
package main;
import model.Tree;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		// make a girls name tree
		
		Tree girlsNameTree = new Tree();
		
		girlsNameTree.insert(1, "Emma" );
		girlsNameTree.insert(2, "Olivia");
		girlsNameTree.insert(3, "Sophia");
		girlsNameTree.insert(4, "Ava");
		girlsNameTree.insert(5, "Isabella");
		girlsNameTree.insert(6, "Mia");
		girlsNameTree.insert(7, "Abigail");
		girlsNameTree.insert(8, "Emily");
		girlsNameTree.insert(9, "Charolette");
		girlsNameTree.insert(10, "Harper");

		// proof dfs search works
		System.out.println(girlsNameTree.dfsSearch("Mia"));
		System.out.println(girlsNameTree.dfsSearch("Charolette"));
		System.out.println(girlsNameTree.dfsSearch("Ava"));
		System.out.println(girlsNameTree.dfsSearch("Emma"));
		System.out.println(girlsNameTree.dfsSearch("Emily"));
		System.out.println(girlsNameTree.dfsSearch("Abigail"));
		System.out.println(girlsNameTree.dfsSearch("Sophia"));
		System.out.println(girlsNameTree.dfsSearch("Harper"));
		System.out.println(girlsNameTree.dfsSearch("Isabella"));
		System.out.println(girlsNameTree.dfsSearch("Olivia"));
		
		// name not in the tree
		System.out.println(girlsNameTree.dfsSearch("Julie"));
		
		// proof bfs search works
		System.out.println(girlsNameTree.bfsSearch("Mia"));
		System.out.println(girlsNameTree.bfsSearch("Charolette"));
		System.out.println(girlsNameTree.bfsSearch("Ava"));
		System.out.println(girlsNameTree.bfsSearch("Emma"));
		System.out.println(girlsNameTree.bfsSearch("Emily"));
		System.out.println(girlsNameTree.bfsSearch("Abigail"));
		System.out.println(girlsNameTree.bfsSearch("Sophia"));
		System.out.println(girlsNameTree.bfsSearch("Harper"));
		System.out.println(girlsNameTree.bfsSearch("Isabella"));
		System.out.println(girlsNameTree.bfsSearch("Olivia"));
		
		// name not in the tree
		System.out.println(girlsNameTree.bfsSearch("Julie"));
		
		// Make a boy name tree
//		Tree boysNameTree = new Tree();
//		
//		// insert each name and number on the list
//		boysNameTree.insert(1, "Noah");
//		boysNameTree.insert(2, "Liam");
//		boysNameTree.insert(3, "Mason");
//		boysNameTree.insert(4, "Jacob");
//		boysNameTree.insert(5, "William");
//		boysNameTree.insert(6, "Ethan");
//		boysNameTree.insert(7, "James");
//		boysNameTree.insert(8, "Alexander");
//		boysNameTree.insert(9, "Michael");
//		boysNameTree.insert(10, "Benjamin");
//		
//		// search for the names on the list.. I did it randomly
//		System.out.println(boysNameTree.search("Liam"));
//		System.out.println(boysNameTree.search("James"));
//		System.out.println(boysNameTree.search("Jacob"));
//		System.out.println(boysNameTree.search("Benjamin"));
//		System.out.println(boysNameTree.search("William"));
//		System.out.println(boysNameTree.search("Noah"));
//		System.out.println(boysNameTree.search("Ethan"));
//		System.out.println(boysNameTree.search("Michael"));
//		System.out.println(boysNameTree.search("Alexander"));
//		System.out.println(boysNameTree.search("Mason"));
//
//		// search for a name not on the list
//		System.out.println(boysNameTree.search("Jeremy"));
		
//		System.out.println(girlsNameTree.search("Mia"));
//		System.out.println(girlsNameTree.search("Charolette"));
//		System.out.println(girlsNameTree.search("Ava"));
//		System.out.println(girlsNameTree.search("Emma"));
//		System.out.println(girlsNameTree.search("Emily"));
//		System.out.println(girlsNameTree.search("Abigail"));
//		System.out.println(girlsNameTree.search("Sophia"));
//		System.out.println(girlsNameTree.search("Harper"));
//		System.out.println(girlsNameTree.search("Isabella"));
//		System.out.println(girlsNameTree.search("Olivia"));
		
		// search for a name not on the list
//		System.out.println(girlsNameTree.search("Julie"));
		

		//System.out.println(boysNameTree.dfsSearch("Ethan"));
	}

}
