class Items {
    public String name;
    public int price;

    public Items() {}

    public Items(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print_info() {
        System.out.printf("%s is $%d ", name, price);
    }
}
