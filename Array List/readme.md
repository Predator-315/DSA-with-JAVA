# Array List
## Definition
### _ArrayList is a part of the Java collections framework and it is a class of java.util package. It provides us with dynamic arrays._

## Properties
- ### _The main advantage of ArrayList is that if we declare an array then we need to mention the size, but in ArrayList, it is not needed to mention the size of ArrayList._
- ### _Size of ArrayList dynamically changes whenever we add or remove elements from it._

- ### _Each element in an ArrayList is an object._

## Declaration
```
import java.util.ArrayList; //import the ArrayList class

ArrayList<Integer> num = new ArrayList<>(); //Creates an ArrayList of type Integer Class

ArrayList<Integer> num = new ArrayList<>(5); //Creates an ArrayList with initial size 5

ArrayList num = new ArrayList(); //Creates an ArrayList which can store any value(same or different data type values at the same time). 
```

## Adding a new element
```
num.add(5); //appends 5 to the end of ArrayList
num.add(6); //appends 6 to the end of ArrayList
``` 

## Accessing an element
```
num.get(1); //returns the element at index 1
``` 

## Size of Arraylist
```
num.size(); //returns the size of ArrayList
```

## Printing the ArrayList
- #### Method 1: Using loops
    ```
    for(int i=0;i<num.size();i++)
    {
        System.out.println(num.get(i));
    }
    //Output: 5
              6
    ```
- #### Method 2: Direct Printing
    ```
    System.out.println(num);
    //Output: [5,6]
    ```

## Adding an element at index i
```
num.add(i,4); //adds/inserts an element 4 at index i while keeping other elements
```

## Modifying an element at index i
```
num.set(i,10); //modifies the element at index i with 10
``` 

## Removing an element at index i
```
num.remove(i); //removes the element at index i
```

## Removing an element with its value
```
num.remove(Integer.valueOf(10)); //removes the first occurrence of the element with value 10
//returns true if element is removed & false if element is not found 
```
## Checking the presence of an element
```
num.contains(Integer.valueOf(10)); //returns true if element is present else false
```

## Reversing ArrayList using Collections class
```
import java.util.Collections; //import the Collections class

Collections.reverse(num); //reverses the ArrayList
```
## Sorting ArrayList using Collections class
```
import java.util.Collections; //import the Collections class

Collections.sort(num); //sorts the ArrayList in ascending order

Collections.sort(num, Collections.reverseOrder()); //sorts the ArrayList in descending order
```