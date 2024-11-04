public class DrinkList {
    Drink[] a;
    int count;
    int next;

    

    public DrinkList(){
        a = new Drink[5]; //inital capacity
        count = 0;
        next = 0;
    }

    public void add(Drink d){
        a[next] = d;
        next++;
    }

    public int count(){
        return next;
    }

    public void print(){
        for(int i = 0; i < a.length; i++){   
            System.out.println(a[i]);
        }
    }

    public int find(String name){
        for (int i = 0; i < count(); i++) {
            if (a[i].name.equalsIgnoreCase(name)) return i;
        }
        return -1;
    }

    public Drink get(int index){
        return a[index];
    }

    public void set(int i, Drink drink) {
        a[i] = drink;
    }

    public void remove(int index){
        for (int i = index + 1; i < next; i++){
            a[i - 1] = a[i];
        }
        next--;
    }
}
