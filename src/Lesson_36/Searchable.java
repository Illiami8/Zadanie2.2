package Lesson_36;

import Dz_Lesson37.Product;

import java.util.ArrayList;
import java.util.List;

public interface Searchable<T> {
   boolean test(T product);
   default List<T> filter(List<T> objectList, Searchable<T> searchable) {
      List<T> products = new ArrayList<>();
      for (T object : objectList) {
         if (searchable.test(object)) {
            products.add(object);
         }
      }
      return products;
   }

}
