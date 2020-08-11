package max;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> cars = new Map<>();
        cars.add(2007, "Scenic");
        cars.add(2010, "Megane");
        cars.add(2001, "Laguna");
        cars.add(1999, "Clio");
        cars.showAllMap();
        cars.showListValue();
        cars.showSetKey();
        cars.removeKey(2007);
        cars.removeValue("Laguna");
        System.out.println("Remove key: 2007 and value: Laguna");
        cars.showAllMap();
        cars.showListValue();
        cars.showSetKey();
    }
}
