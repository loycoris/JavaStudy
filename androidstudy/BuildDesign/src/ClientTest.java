public class ClientTest {
    public static void main(String[] args) {
        MoonComputerBuilder builder = new MoonComputerBuilder();
        Director director = new Director(builder);
        director.createComputer("cpu", "mainboard", "ram");
    }
}
