public class FizzBuzz {
    public static void main(String[] args) {
      fizzBuzzTest(100);
    }

public static void fizzBuzzTest(int total){
    for (int i = 1; i <= total ; i++) {
        if (i % 3 == 0 && i % 5 == 0){
            System.out.println("Fizz Buzz");
        } else if(i % 3 == 0){
            System.out.println("Fizz");
        } else if(i % 5 == 0){
            System.out.println("Buzz");
        } else{
            System.out.println(i);
        }
    }
    }
}