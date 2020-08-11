package io.github.pinnsvin;

import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void test() {
        String str = "123";
        String intern = str.intern();
        System.out.println(intern);
    }
}
