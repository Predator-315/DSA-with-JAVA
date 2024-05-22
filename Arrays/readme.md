# **Arrays**
---

## **Definition:** 
### _It is a Data Structure which stores a collection of elements of the same type stored in contigious memory locations._

## **Properties:**
- ### _Data Structure which stores a collection of homogenous elements (elements of the same data type)._
- ### _Zero-based indexing (first element has a subscript/index of 0)._
- ### _Elements are stored in contigious memory locations (consecutive memory locations)._
- ### _Holds multiple values under a single variable name._ 

## **Types of Arrays**
- ### _Single Dimensional Array(SDA)_
- ### _Multi Dimensional Array(MDA) (Array of Arrays)_

## **Declaration:**
#### Method 1:
```
//Declaration of SDA
int num[]=new int[6];
// size of 6 elements here

//Declaration of DDA
int num[][]=new int[3][2];
// 3 rows & 2 columns here
```
#### Method 2 (Array literal):
```
//Declaration & Initialization of SDA
int num[]={1,2,3,4,5,6};
// 6 elements here

//Declaration & Initialization of DDA
int num[]={{1,2},{3,4},{5,6}};
//3 rows & 2 columns here
```
## **Initializing elements**
```
//Assigning values to SDA
for(int i=0;i<array.length;i++)
{
    a[i]=i+1;
}

//Assigning values to DDA
for(int i=0;i<array.length;i++)
{
    for(int j=0;j<array[i].length;j++)
    {
        a[i][j]=j+1;
    }
}
```

## **Accessing Elements**
```
//Accessing elements in SDA
num[1] //returns the 2nd element

//Accessing elements in DDA
num[1][0] //returns the first element of 2nd row
```

## **Traversal**
- #### _using for loop_
  ```
  for(int i=0;i<array.length;i++)
  {
    System.out.println(array[i]);
  }
  ```
- #### _using for each loop_
  ```
  for(value:array)
  {
    System.out.println(value);
  }
  ```
- #### _using while loop_
  ```
  int i=0;
  while(i<array.length)
  {
    System.out.println(array[i]);
    i++;
  }
  ```
  