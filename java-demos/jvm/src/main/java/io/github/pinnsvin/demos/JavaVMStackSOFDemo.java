package io.github.pinnsvin.demos;

/**
 * VM args: -Xss128k
 * -Xss: 设置栈内存容量
 *
 */
public class JavaVMStackSOFDemo {

    private int stackLength = 1;

    public void stack() {
        stackLength ++;
        stack();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOFDemo javaVMStackSOFDemo = new JavaVMStackSOFDemo();
        try {
            javaVMStackSOFDemo.stack();
        }catch (Throwable e) {
            System.out.println("stack length:" + javaVMStackSOFDemo.stackLength);
            throw e;
        }
    }
}
