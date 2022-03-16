package DemoPack;

public class DemoParaConstructors {
    public DemoParaConstructors() {
        int i;
        int j;
        String str;
        System.out.println("Default Constructor");
            }
            public  DemoParaConstructors(int i)
            {
                i=i*i;
                System.out.println(i);
            }
            public  DemoParaConstructors(String s){
                System.out.println(s);
            }
            public DemoParaConstructors(int i,int j)
            {
                int k= i*j;
                System.out.println(k);
            }

    public static void main(String[] args) {
       DemoParaConstructors demo11=new DemoParaConstructors();
        DemoParaConstructors demo1=new DemoParaConstructors(10);
        DemoParaConstructors demo2=new DemoParaConstructors("Saritha");
        DemoParaConstructors demo3=new DemoParaConstructors(6,7);
    }
}
