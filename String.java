public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Java";
        System.out.println("Original : " + s1);
        System.out.println("length() : " + s1.length());
        System.out.println("charAt(1) : " + s1.charAt(1));
        System.out.println("substring(6) : " + s1.substring(6));
        System.out.println("substring(0,5) : " + s1.substring(0,5));
        System.out.println("concat() : " + s1.concat(" Programming"));
        System.out.println("equals() : " + s2.equals("Java"));
        System.out.println("equalsIgnoreCase() : " + s2.equalsIgnoreCase("java"));
        System.out.println("compareTo() : " + s2.compareTo("Python"));
        System.out.println("compareToIgnoreCase() : " + s2.compareToIgnoreCase("JAVA"));
        System.out.println("contains() : " + s1.contains("World"));
        System.out.println("startsWith() : " + s1.startsWith("Hello"));
        System.out.println("endsWith() : " + s1.endsWith("World"));
        System.out.println("indexOf('o') : " + s1.indexOf('o'));
        System.out.println("lastIndexOf('o') : " + s1.lastIndexOf('o'));
        System.out.println("replace() : " + s1.replace("World","Java"));
        System.out.println("replaceAll() : " + s1.replaceAll("o","0"));
        System.out.println("replaceFirst() : " + s1.replaceFirst("o","0"));
        System.out.println("toUpperCase() : " + s1.toUpperCase());
        System.out.println("toLowerCase() : " + s1.toLowerCase());
        String s3 = "   Java   ";
        System.out.println("trim() : '" + s3.trim() + "'");
        String s4 = "";
        String s5 = "   ";
        System.out.println("isEmpty() : " + s4.isEmpty());
        System.out.println("isBlank() : " + s5.isBlank());
        String[] arr = s1.split(" ");
        System.out.println("split() :");
        for(String x : arr)
            System.out.println(x);
        System.out.println("join() : " + String.join("-", "A","B","C"));
        System.out.println("valueOf() : " + String.valueOf(123));
        System.out.println("repeat() : " + "Hi ".repeat(3));
        char[] ch = s2.toCharArray();
        System.out.print("toCharArray() : ");
        for(char c : ch)
            System.out.print(c + " ");
        System.out.println();
        byte[] b = s2.getBytes();
        System.out.print("getBytes() : ");
        for(byte x : b)
            System.out.print(x + " ");
        System.out.println();
        System.out.println("matches() : " + "12345".matches("\\d+"));
        String a = new String("Java");
        String b1 = a.intern();
        System.out.println("intern() : " + (b1 == "Java"));
        String s6 = "   Hello   ";
        System.out.println("strip() : '" + s6.strip() + "'");
        System.out.println("stripLeading() : '" + s6.stripLeading() + "'");
        System.out.println("stripTrailing() : '" + s6.stripTrailing() + "'");
        String text = "A\nB\nC";
        System.out.println("lines() :");
        text.lines().forEach(System.out::println);
        System.out.println("formatted() : " + "Name: %s Age: %d".formatted("Anish",21));
    }
}