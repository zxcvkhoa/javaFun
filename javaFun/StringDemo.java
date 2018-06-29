public class StringDemo{
    public static void main(String[] args){
        String ninja = "Coding Dojo is Awesome";
        int length = ninja.length();
        System.out.println("String Length is : " + length);
    }
}

// Concatenate
// String string1 = "My name is ";
// String string2 = "Michael";
// String string3 = string1.concat(string2);
// System.out.println(string3);
// ****** This will print "My name is Michael" ******

// Format
// String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
// System.out.println(ninja);
// *** %s is expecting a string, %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point. ***

// Trim: The trim() method removes any trailing or leading white spaces from the string.
// String sentence = "   spaces everwhere!   ";
// System.out.println(sentence.trim())
// *** This will output: "spaces everywhere!" ***


