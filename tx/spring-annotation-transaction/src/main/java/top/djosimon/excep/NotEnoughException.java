package top.djosimon.excep;

/**
 * @author : dj
 * @date : 2020/12/5
 */

// 用户购买的商品库存不足时将会抛出此异常
public class NotEnoughException extends RuntimeException {
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
