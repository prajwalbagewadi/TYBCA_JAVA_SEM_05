/*
4. Create a package “utility”. Define a class CapitalString under “utility” package which will
contain a method to return String with first letter capital. Create a Person class (members
– name, city) outside the package. Display the person name with first letter as capital by
making use of CapitalString.
*/

package Utility;
import java.lang.*;
import java.util.*;
import java.io.*;

/*
In Java, a String is a sequence of characters. 
It is one of the most commonly used classes 
in Java and is provided by the java.lang package. 
Strings in Java are immutable, 
meaning once a String object is created, 
its value cannot be changed.
*/


/*
Using String.charAt() method:
Get the string and the index
Get the specific character using String.charAt(index) method.
Return the specific character.
*/

/*
Using String.toCharArray() method:
Get the string and the index
Convert the String into Character array using String.toCharArray() method.
Get the specific character at the specific index of the character array.
Return the specific character.
*/

/*
Character Class Methods
isLetter(char ch): Determines if the specified character is a letter.

java
Copy code
boolean isLetter = Character.isLetter('a'); // true
isDigit(char ch): Determines if the specified character is a digit.

java
Copy code
boolean isDigit = Character.isDigit('5'); // true
isWhitespace(char ch): Determines if the specified character is a whitespace character.

java
Copy code
boolean isWhitespace = Character.isWhitespace(' '); // true
isUpperCase(char ch): Determines if the specified character is an uppercase letter.

java
Copy code
boolean isUpperCase = Character.isUpperCase('A'); // true
isLowerCase(char ch): Determines if the specified character is a lowercase letter.

java
Copy code
boolean isLowerCase = Character.isLowerCase('a'); // true
toUpperCase(char ch): Converts the specified character to uppercase.

java
Copy code
char upper = Character.toUpperCase('a'); // 'A'
toLowerCase(char ch): Converts the specified character to lowercase.

java
Copy code
char lower = Character.toLowerCase('A'); // 'a'
isLetterOrDigit(char ch): Determines if the specified character is a letter or digit.

java
Copy code
boolean isLetterOrDigit = Character.isLetterOrDigit('1'); // true
getNumericValue(char ch): Returns the int value that the specified Unicode character represents.

java
Copy code
int numericValue = Character.getNumericValue('5'); // 5
charValue(): Returns the value of this Character object.

java
Copy code
Character character = new Character('a');
char value = character.charValue(); // 'a'
*/

public class CapitalString{
    private String mem;
    public CapitalString(String var){
        char first=Character.toUpperCase(var.charAt(0));
        StringBuilder sb=new StringBuilder();
        sb.append(first); // add first char to stringBuilder;
        sb.append(var.substring(1)); //extract a substring to add firstChar
        String result=sb.toString(); // convert stringBuilder to string
        System.out.println("result="+result);
        this.mem=result;
    }
    public String getResult(){
        return this.mem;
    }
//    public static void main(String[] args){
//        CapitalString obj=new CapitalString("kajal");
//    }
}