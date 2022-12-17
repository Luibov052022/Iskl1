import java.util.Arrays;

/*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый элемент которого равен частному 
элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода 
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.*/

public class z4 {

  public static void main(String[] args) {
    int[] m1 = new int[] { 3, 3, 6 };
    int[] m2 = new int[] { 2, 2, 3 };
    int[] m3 = twoArray(m1,m2);
    System.out.println(Arrays.toString(m3));
  }

  public static int[] twoArray(int[] m1, int[] m2) {
    for (int elem:m2){
      if (elem == 0){throw new RuntimeException("На ноль делить нельзя");}
    }
    if (m1.length != m2.length) {
      throw new RuntimeException("Масcивы не равны");
    }
    
    int[] m3 = new int[m1.length];
    for (int i = 0; i < m3.length; i++) {
      m3[i] = m1[i] / m2[i];
    }
    return m3;
  }
}
