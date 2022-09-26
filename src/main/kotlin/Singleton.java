import org.jetbrains.annotations.NotNull;

public final class Singleton {
    @NotNull
    public final static Singleton INSTANCE;

    public void doSomething() {

    }

    private Singleton() {

    }

    static {
        Singleton var = new Singleton();
        INSTANCE = var;
    }

}
