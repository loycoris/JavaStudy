public abstract class AbstractSwordsman {
    public final void fighting() {
        neigong();

        // 这个是具体方法
        jingmai();

        if (hasWeapons()) {
            weapons();
        }

        moves();

        hook();
    }

    protected void hook() { }
    protected abstract void neigong();
    protected abstract void weapons();
    protected abstract void moves();

    public void jingmai() {
        System.out.println("开启正经与奇经");
    }

    protected boolean hasWeapons() {
        return true;
    }
}
