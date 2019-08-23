package PrinterExample;
//with lambda expression
public class Test {
    static Printer p = ()-> System.out.println("Hi");

    public static void main(String[] args) {
        p.print();
    }
}
