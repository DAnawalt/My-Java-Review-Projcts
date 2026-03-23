class FizzBuzz{
  public static void fizzBuzzClass(int Ceiling){
    for (int i = 0; i <= Ceiling; i++){
      if (i % 15 == 0){
        System.out.println("FizzBuzz!");
      }
      else if (i % 3 == 0){
        System.out.println("Fizz");
      }
      else if (i % 5 == 0){
        System.out.println("Buzz");
      }
    }
  }
  public static void main(String[] args){
    fizzBuzzClass(100);
  }
}
