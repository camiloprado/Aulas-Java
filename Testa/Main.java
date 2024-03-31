public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, 5, "Prego");
        Product prod2 = new Product(2, 10, "Carteira");
        Product prod3 = new Product(3, 105, "Liquidificador");

        shoppinCart cart1 = new shoppinCart();
        shoppinCart cart2 = new shoppinCart();

        cart1.addCarItem(0, 5, prod2);
        cart1.addCarItem(1, 1, prod3);

        cart2.addCarItem(0, 1, prod1);

        System.out.println(cart2.itemCarrinho());
    }
}