package task_5;

import java.util.ArrayList;

public class Safe {

    private final int capacity;
    private boolean wasFirstIteration = false;

    private ArrayList< ArrayList<Item> > currentBestItemsCombination;

    private ArrayList< ArrayList<Item> > nextBestItemsCombination;

    public Safe(int capacity) {
        this.capacity = capacity + 1;

        //инициализируем табличку для заполнения предметами
        currentBestItemsCombination = new ArrayList<>(this.capacity);
        nextBestItemsCombination = new ArrayList<>(this.capacity);
        for (int i = 0; i < this.capacity; i++) {
            currentBestItemsCombination.add(new ArrayList<>());
            nextBestItemsCombination.add(new ArrayList<>());
        }
    }

    private int getTotalCost(ArrayList<Item> items) {
        int totalCost = 0;
        for (Item item: items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }

    public void addNewItem(Item item) {
        for (int currentQuantity = item.getSize(); currentQuantity < capacity; currentQuantity++) {
            int indexOfRemainingItems = currentQuantity - item.getSize();
            //если при текуещй заполненности старый сейф стоит дороже, чем новый из нового предмета и предеметов, которые можно положить из старого рюкзака на оставщееся место
            //то заносим в текущую лучшую комбинацию преметов предыдущую
            if (getTotalCost(currentBestItemsCombination.get(currentQuantity)) >= item.getPrice() + getTotalCost(currentBestItemsCombination.get(indexOfRemainingItems))) {
                nextBestItemsCombination.set(currentQuantity, currentBestItemsCombination.get(currentQuantity));
            }
            else {//иначе лучшая комбинация - новый предмет + оставшиеся предметы из предыдущего рюкзака
                ArrayList<Item> newItemsCombination =  currentBestItemsCombination.get(indexOfRemainingItems);
                newItemsCombination.add(item);
                nextBestItemsCombination.set(currentQuantity, newItemsCombination);
            }
        }
        currentBestItemsCombination = nextBestItemsCombination;
        nextBestItemsCombination = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            nextBestItemsCombination.add(new ArrayList<>());
        }
    }

    public void printCurrentBestCombination() {
        ArrayList<Item> bestCombination = currentBestItemsCombination.get(capacity - 1);
        for (Item item: bestCombination) {
            System.out.println(item);
        }
        System.out.println("Итоговая ценность: " + getTotalCost(bestCombination));
    }



}
