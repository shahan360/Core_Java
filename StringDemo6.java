class StringDemo6{
    public static void main(String[] args) {
        String s1=new String("java"); //stored in heap and String Constant Pool
        String s2=new String("java"); //stored in heap and String Constant Pool
        // System.out.println(s1==s2); //false //because both are different objects as s1 and s2 are in heap

        String s3="java"; //stored in String Constant Pool
        // System.out.println(s1==s3); //false //because both are different objects as s1 is in heap and s3 is in String Constant Pool

        String s4="java"; //stored in String Constant Pool with reference to object created in s3
        // System.out.println(s3==s4); //true //because both are referring to same object in String Constant Pool

        String s5="ja"+"va"; //stored in String Constant Pool as "java" after concatenation
        // System.out.println(s3==s5); //true //because both are referring to same object in String Constant Pool

        String s6="ja"; //stored in String Constant Pool as "ja"
        String s7=s6+"va"; //stored in heap by taking reference of s6 from String Constant Pool and then concatenating "va" to it
        // System.out.println(s4==s7); //false //because both are different objects as s4 is in String Constant Pool and s7 is in heap

        final String s8="ja"; //stored in String Constant Pool as "ja" and final keyword makes it constant
        String s9=s8+"va"; //stored in String Constant Pool as "java" after concatenation with reference to object created in s8
        System.out.println(s4==s9); //true //because both are referring to same object in String Constant Pool

    }
}