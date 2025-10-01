package stringbufferjavaexample;

public class ExampleOneJavaString {
    public static void main(String[] args) {

        /*
        *
        * | Feature           | **StringBuffer**                                               | **StringBuilder**
| ----------------- | -------------------------------------------------------------- | ---------------------------------------------------- |
| **Thread Safety** | ✅ **Thread-safe** (all methods are synchronized)               | ❌ **Not thread-safe** (methods are not synchronized)
| **Performance**   | Slower (because synchronization overhead)                      | Faster (no synchronization)                          |
| **Introduced in** | JDK 1.0                                                        | JDK 1.5                                              |
| **Use Case**      | When multiple threads **might modify the same string object**. | When only **a single thread** modifies the string.   |
| **Mutability**    | Mutable                                                        | Mutable                                              |
| **Package**       | `java.lang.StringBuffer`                                       | `java.lang.StringBuilder`                            |
*/
    }
}
