package MathExample;
//without lambda expression
public class Calculate {
    Math m = new Math(){
       public int power(int x){
            return x*x;
        }
    };
}
