# Recursion
- ### _When a function calls itself in its own body, then it is a recursive function._
- ### _Whenever a function is called/invoked, it creates a stack frame on the call stack & upon its completion of execution, the stack frame gets removed from the call stack._
- ### _The call stack works on the principle of LIFO(Last in First Out)._
- ### _In Recursion, a problem is seen as a function & a bigger problem is solved by solving its subproblem._
  ### _Example: sum(n)=sum(n-1)+n_

- ### _Each recursive function has a base case/haulting condition which terminates from infinite recursion._

- ### _Base case is the smallest subproblem where the solution is pre-known or can be easily evaluated & which can't be divided into further subproblem._

- ### _The relation between a problem & its subproblem is called Recurrence Relation._

- ### _Time complexity = No of recursive calls * Time taken in one recursive call(usually constant)_

- ### _Space complexity = Max No of stack frames in call stack at any time_

## Approach to solve Recursion questions:
- ### _Step 1: Identify the subproblem_
- ### _Step 2: Self work(Logic part)_
- ### _Step 3: Identify the base case_

## Example
```
static void printIncreasing(int n)
{
  //base case
  if(n==1)                 //Line 1
  {                        
    System.out.println(1); //Line 2
    return;                //Line 3
  }
  //subproblem
  printIncreasing(n-1);    //Line 4
  //self work
  System.out.println(n);   //Line 5
}
public static void main()  
{
  int n=5                  //Line 1
  printIncreasing(n);      //Line 2
}
//Output: 1 2 3 4
```

## Diagrammtic Representation

- #### main()
![Image 1](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_1.png) 
---
- #### when n=4
![Image 2](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_2.png)
---
- #### When n=3
![Image 3](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_3.png)
---
- #### When n=2
![Image 4](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_4.png)
---
- #### When n=1
![Image 5](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_5.png)
---
- #### When n=2
![Image 6](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_6.png)
---
- #### When n=3
![Image 7](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_7.png)
---
- #### When n=4
![Image 8](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_8.png)
---
- #### main()
![Image 9](https://github.com/Predator-315/DSA-with-JAVA/blob/main/Recursion/assets/Recursion_9.png)
---
