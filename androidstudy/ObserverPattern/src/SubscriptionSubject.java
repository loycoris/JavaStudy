import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {
    private List<Observer> mWeixinUserList = new ArrayList();

    @Override
    public void addWeiXinUser(WeiXinUser weXinUser) {
        mWeixinUserList.add(weXinUser);
    }

    @Override
    public void removeWeiXinUser(WeiXinUser weXinUser) {
        mWeixinUserList.remove(weXinUser);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : mWeixinUserList) {
            observer.update(message);
        }
    }
}
