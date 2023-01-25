public class FizzBuzz {
    /* public String convertir(int numero) {
        if (numero == 2) return "2";
        if (numero == 7) return "7";
        return "1";
    } */
  /*  public String convertir(int numero) {
        return String.valueOf(numero);
    }*/
    public String convertir(int i) {
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        if (i % 3 == 0 & i % 5 == 0) return "FizzBuzz";
        return String.valueOf(i);
    }
}
