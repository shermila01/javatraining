package PrinterExample;
//without lambda expression

public class TextPrinter {
    Printer p = new Printer() {
        public void print() {
            System.out.println("Hi");
        }
    };
}
