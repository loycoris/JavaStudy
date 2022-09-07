public interface Subject {
    public void addWeiXinUser(WeiXinUser weiXinUser);

    public void removeWeiXinUser(WeiXinUser weiXinUser);

    public void notify(String message);
}
