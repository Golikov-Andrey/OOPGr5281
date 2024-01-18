public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       iCalculable calc = new Calculator(0);

       iCalculable decor = new Decorator(new Calculator(0), new Logger());

       ViewCalculator view = new ViewCalculator(decor);
       view.run();
    }
}
