public class IndexOfandCompareTo {
    public static void main(String[] args) {
        String str="HELLO EVERYONE";
        System.out.println(str.indexOf('H'));
        String str2="Hello Everyone";
        //STR2>STR LEXOGRAPHICALLY(ASCII VALUE)
        System.out.println(str.compareTo(str2));
    }
}
