public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str1 = "Aditya Kumar";
        String str2 = "  Hello World  ";
        // String str3 = "java programming is fun";

        // 1️⃣ length()
        System.out.println("1. Length of str1: " + str1.length());

        // 2️⃣ charAt()
        System.out.println("2. Character at index 3: " + str1.charAt(3));

        // 3️⃣ toUpperCase() and toLowerCase()
        System.out.println("3. Uppercase: " + str1.toUpperCase());
        System.out.println("   Lowercase: " + str1.toLowerCase());

        // 4️⃣ trim()
        System.out.println("4. Trimmed str2: '" + str2.trim() + "'");

        // 5️⃣ substring()
        System.out.println("5. Substring (from index 7): " + str1.substring(7));
        System.out.println("   Substring (3 to 8): " + str1.substring(3, 8));

        // 6️⃣ contains()
        System.out.println("6. str1 contains 'Kumar'? " + str1.contains("Kumar"));

        // 7️⃣ startsWith() and endsWith()
        System.out.println("7. Starts with 'Adi'? " + str1.startsWith("Adi"));
        System.out.println("   Ends with 'mar'? " + str1.endsWith("mar"));

        // 8️⃣ equals() and equalsIgnoreCase()
        System.out.println("8. Equals 'aditya kumar'? " + str1.equals("aditya kumar"));
        System.out.println("   EqualsIgnoreCase 'aditya kumar'? " + str1.equalsIgnoreCase("aditya kumar"));

        // 9️⃣ indexOf() and lastIndexOf()
        System.out.println("9. Index of 'a': " + str1.indexOf('a'));
        System.out.println("   Last index of 'a': " + str1.lastIndexOf('a'));

        // 🔟 replace()
        System.out.println("10. Replace 'a' with '@': " + str1.replace('a', '@'));
        System.out.println("    Replace 'Aditya' with 'Mr. Aditya': " + str1.replace("Aditya", "Mr. Aditya"));

        // 11️⃣ split()
        System.out.println("11. Split str1 by space:");
        String[] parts = str1.split(" ");
        for (String part : parts) {
            System.out.println("   -> " + part);
        }

        // 12️⃣ concat()
        System.out.println("12. Concatenation: " + str1.concat(" is a developer"));

        // 13️⃣ compareTo() and compareToIgnoreCase()
        System.out.println("13. compareTo('Aditya Kumar'): " + str1.compareTo("Aditya Kumar")); // 0 → equal
        System.out.println("    compareTo('Aditya'): " + str1.compareTo("Aditya"));
        System.out.println("    compareToIgnoreCase('aditya kumar'): " + str1.compareToIgnoreCase("aditya kumar"));

        // 14️⃣ isEmpty() and isBlank() (Java 11+)
        String empty = "";
        String blank = "   ";
        System.out.println("14. isEmpty on empty string: " + empty.isEmpty());
        System.out.println("    isBlank on blank string: " + blank.isBlank());

        // 15️⃣ join() (Java 8+)
        System.out.println("15. Join example: " + String.join("-", "Java", "Python", "C++"));

        // 16️⃣ repeat() (Java 11+)
        System.out.println("16. Repeat 'Hi ' 3 times: " + "Hi ".repeat(3));

        // 17️⃣ toCharArray()
        System.out.print("17. Characters in str1: ");
        char[] chars = str1.toCharArray();
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 18️⃣ valueOf()
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("18. valueOf(int): " + numStr + " (String now)");

        // 19️⃣ format()
        String formatted = String.format("My name is %s and I scored %d marks.", "Aditya", 95);
        System.out.println("19. format(): " + formatted);

        // 20️⃣ matches() with regex
        System.out.println("20. matches(): Does 'Aditya Kumar' start with 'A' and contain letters only? "
                + str1.matches("[A-Za-z ]+"));
    }
}
