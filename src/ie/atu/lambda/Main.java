package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = (a,b) -> a+ b;
        StringOperation toupper = s -> s.toUpperCase();

        Runnable task = () -> System.out.println("Hello from the thread");
        
        Thread thread = new Thread(task);
        thread.start();
            
        
        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println(toupper.apply("Evan"));
    }
}
