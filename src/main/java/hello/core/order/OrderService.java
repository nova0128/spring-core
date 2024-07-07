package hello.core.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int item);
    //주문결과를 반환한다. 구현하기 위해 Impl
}
