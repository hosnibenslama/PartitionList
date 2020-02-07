package com.adneom.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @param <T> the type of elements in the list and sublist
 * @author  Hosni
 */


public class Partition<T> {

  /**
   * Split a List into several sublists of a given size
   * @param list is the List that will be divided into sublist
   * @param chunk is the size of sublist
   * @return List of sublists
   */

   public List<List<T>> split(List<T> list, int chunk){

     final AtomicInteger counter = new AtomicInteger();
     return new ArrayList<>(list.stream()
         .collect(Collectors.groupingBy(it -> counter.getAndIncrement() / chunk))
         .values());
  }

}
