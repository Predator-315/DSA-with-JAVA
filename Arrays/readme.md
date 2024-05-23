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

## **Memory Allocation for Array**
  ```
  int num[];
  num=new int[5];
  ```
- ### _When 1st statement is executed, it creates a pointer/reference variable named 'num' in the stack memory, which points to null initially_
- ### _When 2nd statement is executed, it allocates memory in heap memory (here,4*5=20 bytes) at contigious memory locations & the reference/memory address of the first element is stored in the pointer variable 'num'(which means 'num' points to the first element of the array)._
- ### _Suppose, num[2] is accessed, then it will refer to the memory address of the 2th element by moving 2 positions from 0th position._

## **Shallow Copy of Array**
```
int a[]=new int[10];
int b[]=a; //shallow copy of Array a
```
### _Here, the memory address of the first element of Array a to which the pointer variable 'a' is pointing, will be assigned to pointer variable 'b', which means b will also refer to the same memory location of Array a due to which any changes made through b will reflect on a & vice-versa._