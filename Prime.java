class Prime {
  static boolean isPrime(int n) {
    if (n <= 1)
      return false;

    for (int i = 2; i < n; i++)
      if (n % i == 0)
        return false;

    return true;
  }

  public static void main(String args[]) {
    if (isPrime(11))
      System.out.println(" true , The number is Prime");
    else
      System.out.println(" false , The number is non-Prime");
    if (isPrime(15))
      System.out.println(" true , The number is Prime");
    else
      System.out.println(" false , The number is non-Prime");
  }
}
