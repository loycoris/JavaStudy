//静态代理类：持有对真实主题类的引用
class Purchasing implements IShop {
    private IShop mShop;

    public Purchasing(IShop shop) {
        mShop = shop;
    }

    @Override
    public void buy() {
        mShop.buy();
    }
}
