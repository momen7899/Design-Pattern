package creational_patterns.builder;

public class House {
    private int room;
    private boolean hasBasement;
    private boolean hasRooms;
    private boolean hasRoof;
    private boolean hasBathroom;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasKitchen;
    private int tree;

    public static class Builder {
        private int room;
        private boolean hasBasement;
        private boolean hasRooms;
        private boolean hasRoof;
        private boolean hasBathroom;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasKitchen;
        private int tree;

        public Builder setRoom(int room) {
            this.room = room;
            return this;
        }

        public Builder setHasBasement(boolean hasBasement) {
            this.hasBasement = hasBasement;
            return this;
        }

        public Builder setHasRooms(boolean hasRooms) {
            this.hasRooms = hasRooms;
            return this;
        }

        public Builder setHasRoof(boolean hasRoof) {
            this.hasRoof = hasRoof;
            return this;
        }

        public Builder setHasBathroom(boolean hasBathroom) {
            this.hasBathroom = hasBathroom;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setHasKitchen(boolean hasKitchen) {
            this.hasKitchen = hasKitchen;
            return this;
        }

        public Builder setTree(int tree) {
            this.tree = tree;
            return this;
        }
    }
}