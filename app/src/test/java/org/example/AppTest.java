package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
  Todo test;

  @BeforeEach
  void setup(){
    test = new Todo();
  }
  
  //test one list
  @Test
  void testAddone(){
    test.add("buy milk");
    assertEquals(1, test.getSize());
  }

  //Check if complete
  @Test
  void testAddANDcheckcompletion(){
    test.add("buy milk");
    test.add("go to gym");
    test.markComplete("buy milk");

    assertEquals(2, test.getSize());
    test.complete();
  }

  //test three list
  @Test
  void testAddthree(){
    test.add("buy milk");
    test.add("go to gym");
    test.add("study for exam");
    assertEquals(3, test.getSize());
  }

  //test Clear
  @Test
  void testClear(){
    test.add("buy milk");
    test.add("go to gym");
    test.add("study for exam");
    test.clear();

    assertEquals(0, test.getSize());
  }

}
