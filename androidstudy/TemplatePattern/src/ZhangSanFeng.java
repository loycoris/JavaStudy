public class ZhangSanFeng extends AbstractSwordsman {
    @Override
    public void neigong() {
        System.out.println("chunyang");
    }

    @Override
    public void weapons() {
        System.out.println("zhenwujian");
    }

    @Override
    public void moves() {
        System.out.println("shenmen");
    }

    @Override
    public void hook() {
        // 额外处理
        System.out.println("go to toilet");
    }
}
