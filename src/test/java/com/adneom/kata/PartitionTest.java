package com.adneom.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class PartitionTest {

  @Test
  public void givenListOfIntegerElements_whenParitioningIntoSublists_thenCorrect() {
    Partition<Integer> partition = new Partition<>();

    final List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
    final int chunk = 2;
    List<List<Integer>> result = partition.split(list, chunk);
    List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5,6), Arrays.asList(7));
    assertEquals(expected, result);
  }


  @Test
  public void givenListOfStringElements_whenParitioningIntoSublists_thenCorrect() {

    Partition<String> partition = new Partition<>();
    final List<String> list = Arrays.asList("Lorem","ipsum","dolor","sit","amet.");
    final int chunk = 3;
    List<List<String>> result = partition.split(list, chunk);
    List<List<String>> expected = Arrays.asList(Arrays.asList("Lorem","ipsum","dolor"), Arrays.asList("sit","amet."));
    assertEquals(expected, result);
  }


}
