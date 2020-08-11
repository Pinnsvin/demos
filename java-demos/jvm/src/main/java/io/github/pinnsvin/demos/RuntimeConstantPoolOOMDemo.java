package io.github.pinnsvin.demos;

import java.util.HashSet;
import java.util.Set;

/**
 * 运行时常量池导致的内存溢出异常
 * <p>
 * JDK1.6 VM Arags: -XX:PermSize=6M -XX:MaxPermSize=6M
 * JDK1.7+ VM Arags: -Xmx6M
 * <p>
 * Ignoring option PermSize; support was removed in 8.0
 * Ignoring option MaxPermSize; support was removed in 8.0
 * <p>
 * PermGen space 结果说明运行时常量池的确是属于方法区（即JDK 6的HotSpot虚拟机中的永久代）的 一部分。
 * 自JDK1.7起，原本放在永久代中的字符串常量被移到了Java堆中
 */
public class RuntimeConstantPoolOOMDemo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        short i = 1;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}
