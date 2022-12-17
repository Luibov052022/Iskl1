import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.processing.FilerException;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class z1 {

  public static void main(String[] args) {
    //delZero(10);
    indexO(null);
    parse("aaa");
  }

  private static int delZero(int number) {
    return number / 0;
  }

  private static int indexO(int[] array) {
    return array[0];
  }

  private static int parse(String number) {
    return Integer.parseInt(number);
  }
}
