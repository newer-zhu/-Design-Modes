package adapter.objectAdapter;


/**
 * 适配器在springMvc的handler和handlerAdapter使用过
 */
public class Adapter implements InternalPower {
    private PowerSource p;
    public Adapter(PowerSource p){
        this.p = p;
    }

    @Override
    public int output5v() {
        int transfer = 0;
        if (p != null) {
            int source = p.output220v();
            transfer = source / 44;
        }
        return transfer;
    }
}
