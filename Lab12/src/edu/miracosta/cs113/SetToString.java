/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 8
* LAB # 12
* LAST MODIFIED: 11/6/2016
***********************************************************************
* TITLE:				SetToString
* PROGRAM DESCRIPTION: Creates some methods for set implementation including toString (which is asked to be recreated)
***********************************************************************/

package edu.miracosta.cs113;

import java.util.ArrayList;

public class SetToString<E> { //implements Set
	
	//Instance Variables
	protected ArrayList<E> data;
	
	//Constructor
	/** SetToString : default constructor
	 * @param n/a
	 * @return n/a
	 */
	public SetToString() {
		data = new ArrayList<E>();
	}
	
	//Add
	/** addAll : used to add to set (if not present)
	 * @param E item
	 * @return boolean added
	 */
	public boolean addAll(E item) {
		if(!this.data.contains(item)) {
			this.data.add(item);
			return true;
		}
		else return false;
	}
	
	//toString
	/** toString : used to convert class to readable String format
	 * @param n/a
	 * @return String set
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(E item : data) {
			sb.append(item + ", ");
		}
		if(sb.length() > 2) {
			sb.delete(sb.length() - 2, sb.length()); //clean up last ", " if added
		}
		sb.append("]");
		return sb.toString();
	}


	
}


