package Session24.bt4;

public interface Vehicle {

    interface EngineVehicle {
        void sound(String message);
    }

    interface NonEngineVehicle {
       void sound(String message);
    }
}
