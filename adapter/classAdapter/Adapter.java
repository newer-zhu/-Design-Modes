package adapter.classAdapter;

public class Adapter extends PowerSource implements InternalPower {

    @Override
    public int output5v() {
        int source = output220v();
        int transfer = source/44;
        return transfer;
    }
}
