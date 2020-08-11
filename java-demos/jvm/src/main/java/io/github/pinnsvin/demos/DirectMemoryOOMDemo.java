package io.github.pinnsvin.demos;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VM Args：-Xmx20M -XX:MaxDirectMemorySize=10M
 *
 * -XX:MaxDirectMemorySize： 指定直接内存大小，默认与Java堆最大值（由-Xmx指定）一致
 *
 */
public class DirectMemoryOOMDemo {

    private final static int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
