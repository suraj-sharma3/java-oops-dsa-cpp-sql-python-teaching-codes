/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
/*

anything that is stored in the form of bits & bytes in the memory is called as Data. e.g. text, images, videos, etc

when data is processed & can be interpreted, it is called as information

Data is the new oil, it can make you wealthy

DBMS is just a software used to create, read, update & delete data

DBMS basic architecture is built on File System only

File System module is present in every programming language

Advantages of DBMS over File System :

1) Querying : SQL queries are one line commands
DBMS is implemented using great algorithms that make CRUD operations possible with the least TC & SC 
We don't have to build any logic by ourselves

2) Redundancy is eliminated
Redundancy is storing the same information repeatedly

3) Data is consistent

4) We just have to tell what to do? & not how to do it?

5) Security & access control

The types of DBMS based on data model are as follows −

Relational database.

Object oriented database.

Hierarchical database.

Network database.

Relational database is the most important

A relational database management system (RDBMS) is a system where data is organized in two-dimensional tables using rows and columns.

This is one of the most popular data models which is used in industries. It is based on SQL.

Every table in a database has a key field which uniquely identifies each record.

This type of system is the most widely used DBMS.

Relational database management system software is available for personal computers, workstation and large mainframe systems.

For example − Oracle Database, MySQL, Microsoft SQL Server etc.

Columns - fields or attributes
Rows - records or tuples
Instances - set of all the tuples / rows + table structure

Keys play an important role in the relational database.
It is used to uniquely identify any record or row of data from the table. It is also used to establish and identify relationships between tables.

Simple Key : Key with only 1 attribute or Column

Compound Key : Key with multiple attributes or Columns

Canditate Key : Set of all unique Keys

Primary Key : any one key of the candidate keys that is chosen to maintain uniqueness
Primary key cannot be null for any row or tuple

There has to be some uniqueness in a table to create Primary key

alternate / secondary key - candidate keys that are not primary keys

Relation means table.

Relational schema : table structure + integrity constraints (table + rules)

for primary key, Integrity constraints sre entity integrity
Entity Integrity Rule For Primary key −

Make sure that each tuple in a table is unique.
Every table mush has a primary key, for example, Student_ID for a Student table.
Every entity is unique.
The relations Primary Key must have unique values for each row.
Primary Key cannot have NULL value and must be unique.
Example can be an Employee_ID cannot be null in an Employee table.

Super Key : any candidate key union any attribute

Foreign Key : when any attribute of a table is a primary key for another table, it is called as foreign key
a foreign key can be null

Integrity Constraints : 

1) Entity Integrity : primary key (every table must have 1 primary key, primary key should be unique, it cannot be null)
2) Domain Integrity : we can provide the values of only that datatype to a column of which datatype the column is,
e.g. if the column's datatype is int, we cannot insert values of char datatype in it
3) User defined Integrity : User-defined integrity refers to the rules and restrictions that the user creates to meet their specific requirements. 
When it comes to data security, person, referential, and domain integrity aren't always enough.
4) referential integrity : 
the table that has the primary key is the referenced table & the table that has the foreign key referencing to the primary key of the referenced table is called as referencing table

on deleting a record, 3 actions can be performed : 
1) no action (don't delete)
2) cascade, if tou delete a record from one table for 'x' primary key (e.g. ID), everywhere ID is 'x', the data should be deleted
3) on deleting, set null everywher the primary key is 'x' - safest option

if a record which is a primary key is deleted, then it can't be a foreign key
It is a good practice to have a primary key for every table that you create
