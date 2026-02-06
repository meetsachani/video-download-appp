package o;

/* renamed from: o.nD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8215nD0 extends L60<C7468kD0> implements DP0 {
    public C8215nD0(C7468kD0 c7468kD0) {
        super(c7468kD0);
    }

    @Override // o.InterfaceC5580cT1
    public void a() {
        ((C7468kD0) this.X).stop();
        ((C7468kD0) this.X).o();
    }

    @Override // o.InterfaceC5580cT1
    public int h0() {
        return ((C7468kD0) this.X).l();
    }

    @Override // o.InterfaceC5580cT1
    public Class<C7468kD0> i0() {
        return C7468kD0.class;
    }

    @Override // o.L60, o.DP0
    public void initialize() {
        ((C7468kD0) this.X).g().prepareToDraw();
    }
}
