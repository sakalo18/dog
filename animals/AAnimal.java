public abstract class AAnimal implements Animal{
    protected int runDistance;
    protected int swimDistance;
    protected String name;
    protected AAnimal( String name, int run, int swim) {
        this.runDistance = run;
        this.swimDistance = swim;
        this.name = name;

    }
    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getSwimDistance() {
        return swimDistance;
    }

    @Override
    public String getName() {
        return name;
    }
    public int run(int distance) {
        int ret = distance;
        if (ret > getRunDistance()) {
            ret = getRunDistance();
        }
        return ret;
/*
        String ret =  getKind() + " " + getName();
        if (getRunDistance() > 0) {
            ret += " ran " + getRunDistance() + " meters.";
        } else {
            ret += " cannot run.";
        }
        return ret;

 */
    }
    public int swim(int distance) {
        int ret = distance;
        if (ret > getSwimDistance()) {
            ret = getSwimDistance();
        }
        return ret;
/*
        String ret =  getKind() + " " + getName();
        if (getSwimDistance() > 0) {
            ret += " swam " + getRunDistance() + " meters.";
        } else {
            ret += " cannot swim.";
        }
        return ret;

 */
    }

}
