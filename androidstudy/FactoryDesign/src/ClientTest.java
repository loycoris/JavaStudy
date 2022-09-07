public class ClientTest {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new GDComputerFactory();
        LenovoComputer lenovoComputer = computerFactory.createComputer(LenovoComputer.class);
        lenovoComputer.start();
        HpComputer hpComputer = computerFactory.createComputer(HpComputer.class);
        hpComputer.start();
        AsusComputer asusComputer = computerFactory.createComputer(AsusComputer.class);
        asusComputer.start();
    }
}
