class Main {
  public static void main(String[] args) {
    int number = 1;

    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while (number <= 30) {
      if (number % 15 == 0) {
        System.out.println("FizzBuzz");
      }
      else if (number % 3 == 0) {
        System.out.println("Fizz");
      }
      else if (number % 5 == 0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(number);
      }

      number++;
    }
  }
}