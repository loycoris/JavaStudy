public class ZhangWuJi extends AbstractSwordsman{
    @Override
    public void neigong() {
        System.out.println("jiuyang");
    }

    @Override
    public void weapons() {
        // 没有武器，不做处理
    }

    @Override
    public void moves() {
        System.out.println("qiankun");
    }

    @Override
    public boolean hasWeapons() {
        return false;
    }
}
