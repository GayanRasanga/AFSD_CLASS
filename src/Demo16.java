public class Demo16 {
    public static void main(String[] args) {
        String name = "Gayan";//literal Babe String // char[] ar = {"G","a","y"}
        String name1 = new String("Gayan");// object base string// not use dew string fool
        /*String Pool in Java is a special storage space in Java Heap memory where string literals are stored.
        It is also known by the names - String Constant Pool or String Intern Pool.
        Whenever a string literal is created, the JVM first checks the String Constant Pool
        before creating a new String object corresponding to it.
         */
        System.out.println(name.charAt(3));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(2));
        System.out.println(name.length());

        StringBuffer sb = new StringBuffer("Gayan");
        sb.append(" Rasanga");
        System.out.println("From StringBuffer"+" "+sb);

        StringBuilder sbu = new StringBuilder("Rasanga");
        sbu.append(" Mahagamage");
        System.out.println("From StringBuilder"+" "+sbu);


    }
}
