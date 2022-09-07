public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscription = new SubscriptionSubject();

        WeiXinUser hongYang = new WeiXinUser("HongYang");
        WeiXinUser rengYuGang = new WeiXinUser("RengYuGang");
        WeiXinUser liuWangShu = new WeiXinUser("LiuWangShu");

        subscription.addWeiXinUser(hongYang);
        subscription.addWeiXinUser(rengYuGang);
        subscription.addWeiXinUser(liuWangShu);
        subscription.notify("New article coming");
    }
}
