# NumberFormatterTest


# Implementation Approach 

1. First implementation is array based. Declare two arrays one for storing the values of roman numerals and second for storing the corresponding letters
   - input number is >= highest roman numeral. add it to the string builder and reduce its corresponding value
   - input number is < highest roman numeral then check next roman highest number. Repeat the process above till number becomes 0.
2. Second implementation, create four arrays unit, tens, hundred, and thousand. calculates its place value and convert into roman numerals



# Design Approach
1. Code is being develop using the loosely coupled practice.
2. NumeralGenerator is the interface, each implementation will have to implement this interface to provide its implementation.
3. Validator interface is also available with the default validation implementation.  If any class need to add custom impl then the class should overried the validate method.
4. Finally, NumberGenerator a builder class is responsible to take generator implementation and run the logic.
5. Pattern used, strategy design pattern, builder design pattern