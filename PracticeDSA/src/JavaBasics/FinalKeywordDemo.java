package JavaBasics;

public class FinalKeywordDemo {
//    static final int staticVar;  // Compilation error - should be initialized if final
    static final int staticVar = 10;
//    public final int instanceVar;  // Compilation error - should be initialized if final
    public final int instanceVar = 20;

    public static void main(String[] args) {
        final int x;
//        System.out.println(x); // compilation error
        x=0;
        int y = x+2;
//        x=y+3;   // compilation error because x is final
        System.out.println(x); // 0

        System.out.println(staticVar);
//        staticVar = 20;  // compilation error because of final

        FinalKeywordDemo obj = new FinalKeywordDemo();
        System.out.println(obj.instanceVar);
//        obj.instanceVar=22;  // compilation error because of final
    }
}
