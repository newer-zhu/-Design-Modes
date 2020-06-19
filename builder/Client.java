package builder;

public class Client {
    /**
     * StringBuilder就是此模式
     * @param args
     */
    public static void main(String[] args) {
        BuildingDirector director = new BuildingDirector(new BuildApartment());
        Building villa = director.build();
        System.out.println(villa);

        System.out.println("---------------------------------");

        BuildingDirector director1 = new BuildingDirector(new BuildVilla());
        Building apartment = director1.build();
        System.out.println(apartment);
    }
}
