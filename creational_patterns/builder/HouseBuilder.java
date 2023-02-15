package creational_patterns.builder;

public interface HouseBuilder {
    void buildBasement();

    void buildRooms(int room);

    void buildRoof();

    void buildBathroom();

    void buildGarage();

    void buildGarden();
}
