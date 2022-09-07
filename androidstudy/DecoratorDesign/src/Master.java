public abstract class Master extends Swordsman {
    private Swordsman mSwordsman;

    public Master(Swordsman swordsman) {
        this.mSwordsman = swordsman;
    }

    @Override
    public void attackMagic() {
        mSwordsman.attackMagic();
    }
}
