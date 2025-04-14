package mid_study.middle2.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }


    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int cartPrice = 0;
        for (Item item : items) {
            System.out.printf("상품명: %s, 합계:%d%n", item.getName(), item.getTotalPrice());
            cartPrice += item.getTotalPrice();
        }
        System.out.println("전체 가격 합:" + cartPrice);
    }
}
