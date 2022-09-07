public class Computer {
    private String mCpu;
    private String mMainboard;
    private String mRam;

    public void setmCpu(String cpu) {
        this.mCpu = cpu;
        System.out.println("set cpu");
    }

    public void setmMainboard(String mainboard) {
        this.mMainboard = mainboard;
        System.out.println("set mainboard");
    }

    public void setmRam(String ram) {
        this.mRam = ram;
        System.out.println("set ram");
    }
}
