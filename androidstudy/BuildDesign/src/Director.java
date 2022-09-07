public class Director {
    Builder mBuilder = null;

    public Director(Builder builder) {
        this.mBuilder = builder;
    }

    public Computer createComputer(String cpu, String mainboard, String ram) {
        mBuilder.buildCpu(cpu);
        mBuilder.buildMainboard(mainboard);
        mBuilder.buildRam(ram);
        return mBuilder.create();
    }
}
