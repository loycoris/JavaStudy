public class Goods implements IGoods {
    String name;
    String version;

    public Goods(String name) {
        this.name = name;
    }

    @Override
    public void showGoodPrice(String version) {
        if (version.equals("32G")) {
            System.out.println("price is 5199");
        } else if (version.equals("128G")) {
            System.out.println("price is 5999");
        }
    }
}
