import Enums.IceCreamBalls;
import Enums.Names;
import Enums.Size;
import Enums.Topping;

import java.util.ArrayList;
import java.util.List;

public class StartProgram {
    public static void startProgram() {
        List<IceCreamBalls> melba11 = new ArrayList<>();
        melba11.add(IceCreamBalls.CHOCOLATE);
        melba11.add(IceCreamBalls.BERRY);

        Melba melba1 = new Melba(Names.CHOCO_WORLD, Size.SMALL, melba11, Topping.WITHOUT_TOPPING);

        List<IceCreamBalls> melba22 = new ArrayList<>();
        melba22.add(IceCreamBalls.CHOCOLATE);
        melba22.add(IceCreamBalls.BERRY);

        Melba melba2 = new Melba(Names.CHOCO_WORLD, Size.SMALL, melba22, Topping.WITHOUT_TOPPING);

        List<IceCreamBalls> melba33 = new ArrayList<>();
        melba33.add(IceCreamBalls.CHOCOLATE);
        melba33.add(IceCreamBalls.BERRY);

        Melba melba3 = new Melba(Names.CHOCO_WORLD, Size.SMALL, melba33, Topping.WITHOUT_TOPPING);
    }
}
