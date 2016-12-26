/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* LAB #: 17
* LAST MODIFIED: 11/24/2016
***********************************************************************
* TITLE:				Lab17Exercise1
* PROGRAM DESCRIPTION:  Lab17Exercise1: mirrors methods from 
* 						Data Structures: Abstraction and Design
* 						Using Java by Koffman & Wolfgang. Implement
* 						rebalanceRight method for self-balancing tree
* NOTE : see Assignment 11 for implementation
***********************************************************************/
package edu.miracosta.cs113;

//Note: currently missing AVLNode<E> class from book in project & instance variables, 
//		exercise asked for writing of rebalanceRight method exclusively
public class Lab17Exercise1 <E> {
	
	//Rebalancing *********************************************************************************
	/** rebalanceRight : method to rebalance right
	 * pre:  localRoot is the root of an AVL subtree 
	 * 		 that is critically right-heavy.
	 * post: Balance is restored
	 * @param localRoot Root of the AVL subtree
	 * 		  that needs rebalancing
	 * @return a new localRoot
	*/
	private AVLNode<E> rebalanceRight(AVLNode<E> localRoot) {
		// Obtain reference to right child
		AVLNode<E> rightChild = (AVLNode<E>) localRoot.right;
		// See whether right-left heavy
		if(rightChild.balance < AVLNode.BALANCED) {
			// Obtain reference to right-left child
			AVLNode<E> rightLeftChild = (AVLNode<E>) rightChild.left;
			/** Adjust the balances to be their new values after 
		 	the rotation are performed.     */
			if(rightLeftChild.balance < AVLNode.BALANCED) {
				rightChild.balance = AVLNode.BALANCED;
				rightLeftChild.balance = AVLNode.BALANCED;
				localRoot.balance = AVLNode.LEFT_HEAVY; 
			} else {
				rightChild.balance = AVLNode.RIGHT_HEAVY;
				rightLeftChild.balance = AVLNode.BALANCED;
				localRoot.balance = AVLNode.BALANCED;
			}
			// Perform right rotation
			localRoot.right = rotateRight(rightChild);
		} else { // Right - Right case
			/** In this case the rightChild (the new root)
			 	and the root (new left child) will both be balanced
			 	after the rotation
			 */
			rightChild.balance = AVLNode.BALANCED;
			localRoot.balance = AVLNode.BALANCED;
		}
		return (AVLNode<E>) rotateLeft(localRoot);
	}
	
	//Rotations *********************************************************************************
	/** rotateRight : method to perform right rotation.
	 * pre:  root is root of binary tree
	 * post: root.right is the root of the binary search tree
	 * 		 root.right.right is raised one level
	 * 	 	 root.right.left has no level changes
	 * 		 root.left is lowered a level
	 * 		 the new root is returned
	 * @param root The root of binary tree to be rotated
	 * @return The root of the rotated tree
	 */
	protected Node<E> rotateRight(Node<E> root) {
		Node<E> temp = root.left;
		root.left = temp.right;
		temp.right = root;
		return temp;
	}
	
	/** rotateLeft : method to perform left rotation.
	 * pre:  root is root of binary tree
	 * post: root.left is the root of the binary search tree
	 * 		 root.left.left is raised one level
	 * 	 	 root.left.right has no level changes
	 * 		 root.right is lowered a level
	 * 		 the new root is returned
	 * @param root The root of binary tree to be rotated
	 * @return The root of the rotated tree
	 */
	protected Node<E> rotateLeft(Node<E> root) {
		Node<E> temp = root.right;
		root.right = temp.left;
		temp.left = root;
		return temp;
	}
}
