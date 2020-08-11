package io.github.pinnsvin.demos;

import java.util.HashSet;
import java.util.Set;

/**
 * result:
 *  JDK1.6 false false
 *  JDK1.7+ true false
 * 在JDK 6中，intern()方法会把首次遇到的字符串实例复制到永久代的字符串常量池中存储，返回的也是永久代里面这个字符串实例的引用，而由StringBuilder创建的字符串对象实例在Java堆上，所以必然不可能是同一个引用，结果将返回false。
 * JDK 7（以及部分其他虚拟机，例如JRockit）的intern()方法实现就不需要再拷贝字符串的实例 到永久代了，既然字符串常量池已经移到Java堆中，那只需要在常量池里记录一下首次出现的实例引用即可，因此intern()返回的引用和由StringBuilder创建的那个字符串实例就是同一个。
 *
 * jar 在 org.junit.platform.commons.util.CloseablePath#JAR_URI_SCHEME
 */
public class RuntimeConstantPoolOOMDemo2 {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja").append("r").toString();
        System.out.println(str2.intern() == str2);
    }

}
