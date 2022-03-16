package DemoPack;

public class StringDemo2 {
    public static void main(String[] args) {
        String word ="java";
        String Word = " comp";
        String word10 = "java string"; //illegal character
        String word12 = "java string";
        String word_12 = "java string";
        String int11 = "java";// int reserved word
        String java12 = "java";//should not Start with * apostaphe error illegal character
        String symbol$ = "100 dollars";//illegal character
        String word100 ="java";
        String word200 = " comp";
        String word_ ="java";//illegal character
        String word$  ="java is here";//- hiphen cannot be used
        String capital = "delhi"; //syntax error;
        System.out.println(word$);
        System.out.println(word+Word+word_+int11);
        System.out.println(word10+word12+word100+word200+word_12+word$+word_);
        System.out.println(symbol$);

    }
}
