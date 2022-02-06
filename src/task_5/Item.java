package task_5;

public class Item {
    private final String name;
    private final int size;
    private final int price;

    public Item(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Предмет: " + name + ", цена: " + price +
                ", вес: " + size + '.';
    }

    public int getPrice() {
        return price;
    }
}
