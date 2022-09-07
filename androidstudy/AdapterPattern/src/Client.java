public class Client {
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
