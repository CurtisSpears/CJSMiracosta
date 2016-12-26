/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 9
* LAB # 14
* LAST MODIFIED: 11/13/2016
***********************************************************************
* TITLE:				Lab14
* PROGRAM DESCRIPTION: find method for object array (HashTable practice)
***********************************************************************/

package edu.miracosta.cs113;

public class Lab14 {

	/** find : finds index of obj in table, if not present returns -1
	 * @param Object[] table
	 * @param Object obj
	 * @return int index
	 */
	public static int find(Object[] table, Object obj) {
		//avoid crashes
		if(table == null || obj == null) {
			return -1;
		}
		//else
		//find index
		int index = obj.hashCode() % table.length;
		if(index < 0) {
			index += table.length;
		}
		//not found
		if(table[index] == null) {
			return -1;
		}
		//found obj
		else if(table[index].equals(obj)) {
			return index;
		}
		else {
			//increment through until found obj or null
			while(table[index] != null && !table[index].equals(obj)) {
				index++;
			}
			//found
			if(table[index].equals(obj)) {
				return index;
			}
		}
		return -1; //not found
	}
	
}
