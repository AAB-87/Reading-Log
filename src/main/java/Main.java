public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long expected = 30;
    long amount = 1000_60;
    boolean registered = true;

    long actual = service.calculate(amount, registered);
    // производим проверку (сравниваем ожидаемый и фактический):
    // если true — то PASS
    // если false — то FAIL
    boolean passed = expected == actual;
    // выводим результат
    System.out.println(passed);
  }
}

