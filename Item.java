public class Item {
    public String name;
    public int price;

    public Item() {}

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print_info() {
        System.out.printf("%s is $%d\n", name, price);
    }
}