public class FizzBuzz {
    /* public String convertir(int numbers) {
        if (numbers == 2) return "2";
        if (numbers== 7) return "7";
        return "1";
    } */
  /*  public String convertir(int numbers) {
        return String.valueOf(numbers);
    }*/
    public String convertir(int i) {
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        if (i % 3 == 0 & i % 5 == 0) return "FizzBuzz";
        return String.valueOf(i);
    }
}
