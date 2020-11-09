package top.djosimon.servlet.servlet_learn_01;

// Servlet接口是servlet规范的核心，服务端的小java程序必须实现Servlet接口
public interface Servlet {
    // 要求服务端的小java程序必须将service方法实现
    void service();
}
