import java.util.ArrayList;

class ItemManager {
  private ArrayList<Item> items;

  public ItemManager() {
    items = new ArrayList<Item>();
  }

  public void add(Item x) {
    if (items.size() < 25) {
      items.add(x);
    } else {
      System.err.println("Exceeded limit (25)");
    }
  }

  public void print(String search) {
    for (Item item : items) {
      item.print();
    }
    
  }

  public void lookup(String search){
    for (Item item : items) {
      if (item.getName().equals(search)){
        System.out.printf("\nPrice of item:  %s $%.2f", item.getName(), item.getPrice());
      }
    } System.out.println("not found");
  }

  public void Quicksort(){
    recQuickSort(0, items.size() - 1);
  }

  private void recQuickSort(int left, int right) {
    // TODO Auto-generated method stub
    if (right - left <= 0)
      return;
    else
    {
      String pivot = items.get(right).getName();
      
      int partition = partitionIT(left, right, pivot);
      recQuickSort(left, right-1);
      recQuickSort(partition+ 1, right);
    } //fin
  }

  private int partitionIT(int left, int right, String pivot) {
    int leftPtr = left -1;
    int rightPtr = right;

    while (true){
      while (items.get(++leftPtr).getName().compareTo(pivot) <0);
      while(rightPtr > 0 && items.get(--rightPtr).getName().compareTo(pivot) > 0);
      if (leftPtr >= rightPtr){
        break;
      } else {
        swap(leftPtr, rightPtr);
      }
    }
    swap(leftPtr, right);
    return leftPtr;
  }

  private void swap(int dex1, int dex2) {
    Item temp = items.get(dex1);
    items.set(dex1, items.get(dex2));
    items.set(dex2, temp);
  }

  
}