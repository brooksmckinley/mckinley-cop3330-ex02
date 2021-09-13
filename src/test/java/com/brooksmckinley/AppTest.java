package com.brooksmckinley;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testHomer() {
        Assertions.assertEquals(App.checkLength("Homer"), 5);
    }

    @Test
    public void testAnother() {
        Assertions.assertEquals(App.checkLength("Another"), 7);
    }
}