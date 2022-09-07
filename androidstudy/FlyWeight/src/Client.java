public class Client {
    public static void main(String[] args) {
        Goods good1 = GoodsFactory.getGoods("iphone7");
        good1.showGoodPrice("32G");
        Goods good2 = GoodsFactory.getGoods("iphone7");
        good2.showGoodPrice("32G");
        Goods good3 = GoodsFactory.getGoods("iphone7");
        good3.showGoodPrice("128G");
    }
}
