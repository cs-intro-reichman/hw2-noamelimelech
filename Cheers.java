//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
String name = args[0];
name = name.toUpperCase(); // פונקציה של סטרינג שהופכת את כל המחרוזת לאותיות גדולות
String anLetters = "AEFHILMNOR";
int times = Integer.parseInt(args[1]);
for (int i = 0; i < name.length(); i++) {
        char current = name.charAt(i);
        if (anLetters.indexOf(current) == -1 ) {
                System.out.println("Give me a: " + current +": " + current +"!");
        }
        else
        System.out.println("Give me an: " + current +": " + current +"!");
}
        System.out.println("What does that spell?");

for (int i = 0; i < times; i++) {
        System.out.println(name + " !!!");
}

}
}
