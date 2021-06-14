# assignment1

## `Person Class`

This class is declared to store the `gender`, `age` and `name` of an individual
This is considered as base class for all students in a school

## `Grades ENUM`

This is basically used to store the grade in which the student is Studying
For instance we will store names of three classes as follows:
- `STD1`
- `STD2`
- `STD3`

## `Standard Interface`

This interface is used to represent the structure of the performance of the student in a particular grade.
This will contain the following details:
- `firsTermMarks` : This is used to get the first term marks of a student 
- `secondTermMarks` : This is used to get the second term marks of a student
- `isOngoing` : This is basically to know if the student has completed the grade.

## `Standard IMPL`

This is an implementation of the standard interface.
We can put in extra parameters/calculations in this class which will help us in retrieving the functions of the parent interface down the line.

##`School Interface`

This interface is the blueprint to get the following details:

- `School Name`
- `School Address`
- `School ID`
- `Array of "StandardImpl" to be stored`

## SchoolImpl

This is an implementation of the school interface, this will help us in retriving the details that the `School Interface` had 
mentioned as abstract.

## Student

This will be the `Extension` of the person class. This class will have the following details:

- `Variable to hold the School Interface` : this will in turn store the SchoolImpl in our case, This can be changed as per the requirements down the line.

### Sudent Specific parameters:
- `Id` : Id of the school
- `isDayScholar`


## Representation of the Idea:





