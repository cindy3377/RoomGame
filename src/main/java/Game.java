public class Game {
    public static void main(String[] args) {
        Map cityMap = new CityMap(10, 5);
        System.out.println("City Map:");
        cityMap.display();

        Map wildernessMap = new WildernessMap(10, 5);
        System.out.println("\nWilderness Map:");
        wildernessMap.display();
    }
}
