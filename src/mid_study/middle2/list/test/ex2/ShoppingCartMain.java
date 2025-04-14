package mid_study.middle2.list.test.ex2;

public class ShoppingCartMain {

    public static void main(String[] args) {
        /**
         * 문제가 돌아가도록 ShoppingCart 클래스 완성
         */

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
