//客户端类。
public class test {
    public static void main(String[] args) {
        //静态代理
        /*IShop jsonChao = new JsonChao();
        IShop purchasing = new Purchasing(jsonChao);
        purchasing.buy();*/
        //动态代理
        /*IShop jsonChao = new JsonChao();
        //创建动态代理
        DynamicPurchasing mDynamicPurchasing = new DynamicPurchasing(jsonChao);
        ////创建jsonChao的ClassLoader
        ClassLoader loader = jsonChao.getClass().getClassLoader();
        System.out.println(jsonChao.getClass().getName());
        ////动态创建代理类
        IShop purchasing = (IShop) Proxy.newProxyInstance(loader, new Class[]{IShop.class}, mDynamicPurchasing);
        purchasing.buy();*/

        IShop jsonChao = new JsonChao();
        Dynamic mDynamic = new Dynamic(jsonChao);
        IShop purchasing = mDynamic.instance.create(IShop.class);
        purchasing.buy();
    }
}

