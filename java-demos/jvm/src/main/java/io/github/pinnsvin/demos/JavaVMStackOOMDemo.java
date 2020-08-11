package io.github.pinnsvin.demos;


public class JavaVMStackOOMDemo {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackOOMDemo oom = new JavaVMStackOOMDemo();
        oom.stackLeakByThread();
    }

}
