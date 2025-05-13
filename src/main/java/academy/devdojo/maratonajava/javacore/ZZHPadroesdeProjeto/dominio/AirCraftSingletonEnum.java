package academy.devdojo.maratonajava.javacore.ZZHPadroesdeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AirCraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    AirCraftSingletonEnum(){
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
