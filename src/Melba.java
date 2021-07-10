import Enums.IceCreamBalls;
import Enums.Names;
import Enums.Size;
import Enums.Topping;

import java.util.List;

public class Melba {
    protected Names name;
    protected Size size;
    protected List<IceCreamBalls> iceCreamBalls;
    protected Topping topping;

    public Melba(Names name, Size size, List<IceCreamBalls> iceCreamBalls, Topping topping) {
        this.name = name;
        this.size = size;
        this.iceCreamBalls = iceCreamBalls;
        this.topping = topping;
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<IceCreamBalls> getIceCreamBalls() {
        return iceCreamBalls;
    }

    public void setIceCreamBalls(List<IceCreamBalls> iceCreamBalls) {
        this.iceCreamBalls = iceCreamBalls;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public static double totalPrise(Melba melba){
        double size = Double.parseDouble(melba.size.getPrise());
        double balls = melba.iceCreamBalls
                .stream()
                .mapToDouble(it -> Double.parseDouble(it.getPrise())).sum();
        return size + balls;
    }


}
