package day4;

public class hw4 {

    int array[]={4,5,7};


  public int getSmallPositive(int[] array) {

      try {
          for (int i = 0; i < 3; i++) {
              if (array[i] > 0) ;
          }
      } catch (Exception e) {
          System.out.prinln(" negative number");
      }
      for (int i = 0; i < array.length; i++) {
          for (int j = 1; j < array.length; j++) {
              if (array[i] > array[j]) ;
              array[i] = array[j];

          }
          return i;
      }


  }


}
