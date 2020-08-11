package io.github.pinnsvin.demos;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆用于存储对象实例
 *
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * 堆的最小值和最大值设置一样，可避免堆自动拓展
 * -XX:+HeapDumpOnOutOfMemoryError参数表示当JVM发生OOM时，自动生成DUMP文件
 * -XX:HeapDumpPath=${目录}参数表示生成DUMP文件的路径，也可以指定文件名称，例如：-XX:HeapDumpPath=${目录}/java_heapdump.hprof。如果不指定文件名，默认为：java_<pid>_<date>_<time>_heapDump.hprof。
 */
public class HeapOOMDemo {

    public static void main(String[] args) {
        List<HeapOOMDemo> heapOOMDemos = new ArrayList<>();
        while (true) {
            heapOOMDemos.add(new HeapOOMDemo());
        }
    }
}
