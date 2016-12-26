/**********************************************************************
* AUTHOR: Curtis Spears
* COURSE: CS 113 Data Structures & Algorithms
* SECTION: Mon/Wed 11 - 12:50 PM 
* HOMEWORK #: Homework 3
* PROJECT #: Project 1
* LAST MODIFIED: 9/17/16 9:00PM
***********************************************************************
* TITLE:				Student
* PROGRAM DESCRIPTION:	Constructor class for Student, used in Tester with ArrayListMethods class 
***********************************************************************/

package edu.miracosta.cs113;

public class Student 
{
	//Constants 
	public static final String DEFAULT_NAME = "DEFAULT";
	
	//Instance Variables 
	private String name;
	
	//Constructors
	/** Student : Default constructor
	 *  @param n/a
	 *  @return n/a
	 */ 
	public Student()
	{
		this.setName(DEFAULT_NAME);
	}
	
	/** Student: Filled Constructor for Student
	 * @param String name
	 * @return n/a
	 */
	public Student(String name)
	{
		this.setName(name);
	}
	
	
	/** Student : Copy constructor for Student class
	 * @param Student other
	 * @return n/a
	 */
	public Student(Student other)
	{
		if(other instanceof Student && other != null)
		{
			this.setName(other.getName());
		}
	}
	
	//Mutators/Setters
	/** setName : setter for String name instance variable 
	 * @param name
	 * @return n/a
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	//Accessors/Getters
	/** getName : returns String name instance variable
	 * @param n/a
	 * @return String name
	 */
	public String getName()
	{
		return this.name;
	}
	
	//Other required methods
	/** equals : returns boolean based on instance variable equality
	 * @param Student another
	 * @return boolean areEqual
	 */
	public boolean equals(Student another)
	{
		if(another == null)
		{
			return false; //can't call method on null object
		}
		if(another instanceof Student && this.getName().equals(another.getName()))
		{ 
			return true;
		}
		else 
		{
			return false; 
		}
	}
	
	/** clone() overrides default clone() 
	 * @param  n/a
	 * @return clone of this object */
	@Override
    public Object clone() 
    {
		try 
		{
			return super.clone(); 
		} 
		catch (CloneNotSupportedException e) 
		{
			return null; 
		}
    }
    
    /** toString : overrides default toString method for object by putting instance variables in readable format
     * @param n/a
     * @return String instances
     */
    public String toString()
    {
		return "" + this.getName();
	}
    
}
