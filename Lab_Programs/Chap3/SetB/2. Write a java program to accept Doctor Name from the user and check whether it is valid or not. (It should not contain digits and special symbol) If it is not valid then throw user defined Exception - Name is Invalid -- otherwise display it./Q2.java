/*
2. Write a java program to accept Doctor Name from the user and check whether it is valid
or not. (It should not contain digits and special symbol) If it is not valid then throw user
defined Exception - Name is Invalid -- otherwise display it.
*/

package Chap3SetB_Q2;
import java.lang.*;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Exception;

class Name_is_Invalid extends Exception{
    String Msg;
    Name_is_Invalid(String Msg){
        this.Msg=Msg;
    }
    void Message(){
         System.out.println(Msg);
    }
}
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String regex="^[A-Za-z]*$";
        // Compile the pattern
        Pattern p=Pattern.compile(regex);
        try{
            System.out.println("Enter Doctor Name:");
            String Name=sc.next();
            // Create a matcher to match the pattern against the input string
            Matcher match=p.matcher(Name);
            if(!match.find()){
                throw new Name_is_Invalid("Name Invalid.");
            }
            else{
                System.out.println("Dr."+Name);
                System.out.println("Name is Valid");
            }
        }
        catch(Name_is_Invalid err){
            err.Message();
        }
       
    }
}

/*
Regular Expression Rules:
Creating a regular expression involves understanding the syntax and constructs available in regex. 
Here are some basic rules and components you can use to build regular expressions:

Basic Constructs
Literals: Match the exact characters you specify.

Example: a matches the character 'a'.
Character Classes: Define a set of characters to match.

[abc]: Matches any one of 'a', 'b', or 'c'.
[^abc]: Matches any character except 'a', 'b', or 'c'.
[a-z]: Matches any lowercase letter.
[A-Z]: Matches any uppercase letter.
[0-9]: Matches any digit.
Predefined Character Classes:

.: Matches any character except a newline.
\d: Matches any digit (equivalent to [0-9]).
\D: Matches any non-digit.
\w: Matches any word character (alphanumeric plus underscore, equivalent to [a-zA-Z0-9_]).
\W: Matches any non-word character.
\s: Matches any whitespace character (spaces, tabs, newlines).
\S: Matches any non-whitespace character.
Anchors:

^: Matches the beginning of a line.
$: Matches the end of a line.
\b: Matches a word boundary.
\B: Matches a non-word boundary.
Quantifiers: Specify the number of occurrences.

*: Matches 0 or more occurrences.
+: Matches 1 or more occurrences.
?: Matches 0 or 1 occurrence.
{n}: Matches exactly n occurrences.
{n,}: Matches n or more occurrences.
{n,m}: Matches between n and m occurrences.
Groups and Alternation:

(abc): Matches exactly "abc".
a|b: Matches either 'a' or 'b'.
(a|b)c: Matches 'ac' or 'bc'.
Escaping Special Characters:

If you need to match a character that has a special meaning in regex, use a backslash (\) to escape it. For example, \. matches a literal period.
Example Regular Expressions
Email Address:

regex
Copy code
^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
This matches email addresses by ensuring a valid format before and after the '@' symbol.
Phone Number (e.g., US format):

regex
Copy code
^\(\d{3}\) \d{3}-\d{4}$
Matches phone numbers in the format (123) 456-7890.
URL:

regex
Copy code
^https?:\/\/[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}\/?$
Matches URLs starting with "http://" or "https://", followed by a domain.

*/
