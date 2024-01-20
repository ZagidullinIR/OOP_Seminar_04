import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(10);
        list.add(19);
        System.out.println(list);
        System.out.println(list.size());
    }
}