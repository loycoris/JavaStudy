public class GDComputerFactory extends ComputerFactory {
    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        Computer mComputer = null;
        String className = clz.getName();
        try {
            mComputer = (Computer) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) mComputer;
    }
}
