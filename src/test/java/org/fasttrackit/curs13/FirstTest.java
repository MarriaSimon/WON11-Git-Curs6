package org.fasttrackit.curs13;

import org.fasttrackit.course13.First;
import org.junit.jupiter.api.*;


public class FirstTest {
    private static First first;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll(");
        first = new First();
    }
    @AfterAll
    public static void  afterAll(){
        System.out.println("after All()");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each()");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }
    @Test
    @DisplayName("when")

    public void sumTest(){
        //GIVEN
        int a = 2;
        int b = 3;
        First first = new First();

        //when
        int sum = first.sum(a,b);

        //THEN
       // Assertions.asssertThat(sum).isEqualTo(5);
    }
}







