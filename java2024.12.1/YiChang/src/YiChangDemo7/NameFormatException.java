package YiChangDemo7;

public class NameFormatException extends Exception{ //自定义异常类
    //技巧:
    //NameFormat:当前异常的名字,例如此处表示姓名格式化问题
    //Exception:表示当前类是一个异常类
    //运行时:继承RuntimeException,就表示由于参数错误而导致的问题
    //编译时:继承Exception,提醒程序员检查本地信息

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }

}
