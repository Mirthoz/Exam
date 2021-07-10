public class Mechanics {
    public static void printAllMelbas(){
        Data data = new Data();
        data.getMelbas().stream().forEach(System.out::println);
    };
}
