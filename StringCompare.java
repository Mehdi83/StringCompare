public class StringCompare {
    public static void main(String[] args) {
        StringCompare.compareStr()
    }
    public static void compareStr(String Str1, String Str2) {
        init len1 = Str1.length();
        init len2 = Str2.length();

        if (len1 > len2) {
            return true;
        }

        else if (len1 = len2) {
           System.out.println("Equal strings lenght");
        }
    }
}
