public class StringCompare {

    static void compareStr(){

        String Str1 = new String("Welcome");
        String Str2 = new String("HW32" );

        int s1l = Str1.length();
        int s2l = Str2.length();

        System.out.println(s1l>s2l);

    }
    public static void main(String[] args) {
        StringCompare.compareStr();
    }
}
