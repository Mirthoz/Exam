import Enums.IceCreamBalls;

import java.util.ArrayList;
import java.util.List;

public class Data {
    protected List<Melba> melbas = new ArrayList<>();
    protected List<IceCreamBalls> iceCreamBalls = new ArrayList<>();

    public void setIceCreamBalls(List<IceCreamBalls> iceCreamBalls) {
        this.iceCreamBalls = iceCreamBalls;
    }

    public List<IceCreamBalls> getIceCreamBalls() {
        return iceCreamBalls;
    }

    public List<Melba> getMelbas() {
        return melbas;
    }
}
