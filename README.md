In this assignment, all exercises should be completed in the same file. Write some code in the `main` method to demonstrate/test each method.

1. `nHellos`

Take as input an integer, `n`, representing the number of "hello"s to print. You may assume `n` is less than 1000. Don't return anything. Simply print `n` numbered "hello" messages. Use `% 10` and `% 100` to determine when to use "st", "nd", "rd", or "th".

`n` | Printed Output 
---|---
22 | 1st hello <br> 2nd hello <br> 3rd hello <br> 4th hello <br> 5th hello <br> 6th hello <br> 7th hello <br> 8th hello <br> 9th hello <br> 10th hello <br> 11th hello <br> 12th hello <br> 13th hello <br> 14th hello <br> 15th hello <br> 16th hello <br> 17th hello <br> 18th hello <br> 19th hello <br> 20th hello <br> 21st hello <br> 22nd hello

2. `nRandoms`

Take as input an integer, `n`. Generate and print `n` uniform random values between 0 and 1 using `Math.random()`, then return their average value.

`n` | Printed Output | Return value
---|---|---
2 | 0.9319447192025012 <br> 0.7696017405716646 | 0.8507732298870829
5 | 0.04813041154762332 <br> 0.1796053520740879 <br> 0.782643307909016 <br> 0.9086505236281459 <br> 0.9171021925307627 | 0.5672263575379273

3. `isPrime`

Take as input an integer, `n`, and return a `boolean` indicating whether `n` is a prime number. Prime numbers are only divisible by 1 and themselves. The modulo (`%`) operator can test the divisibility of numbers.

`n` | Return value
--- | ---
13 | true
57 | false
59 | true

4. `getFactors`

Take as input an integer, `n`, and return an array of integers that contains the factors of that number in ascending order.

`n` | Return value
--- | ---
6 | [1, 2, 3, 6] 
24 | [1, 2, 3, 4, 6, 8, 12, 24]
57 | [1, 3, 19, 57]
59 | [1, 59]


5. `pepysSimulation`

This method takes no input and returns nothing. It run a simulation exploring the question: What is more likely, getting 1 at least once when rolling a fair (six-sided) die six times, or getting 1 at least twice when rolling it 12 times. Your program should print output detailing what calculations it did. Note: in this, and other assignments, it can be helpful to define your own intermediate static methods (for example, `private static int rollDie()`)

6. `montyHallSimulation`

In a gameshow, a contestant is presented with three doors. Behind one of them is a valuable prize. After the contestant chooses a door, the host opens one of the other two doors (never revealing the prize). The contestant is then given the pooprtunity to switch to the other unopened door. Should the contestant do so? Intuitively, it might seem that the contestant's initial choice door and the other unopened door are equally likely to contain the prize, so there would be no incentive to switch.  Write a static method to test this intuition by simulation. Your method should take an integer `n`, play the game `n` times using each of the two strategies (switch or do not switch), and print the chance of success for each of the two strategies.