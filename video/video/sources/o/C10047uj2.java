package o;

/* renamed from: o.uj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10047uj2 extends C3349Jj2 implements InterfaceC5664cq {
    private static final long serialVersionUID = -6859936183953626253L;

    public C10047uj2(InterfaceC5664cq interfaceC5664cq) {
        super(interfaceC5664cq);
    }

    public static InterfaceC5664cq e(InterfaceC5664cq interfaceC5664cq) {
        return new C10047uj2(interfaceC5664cq);
    }

    public InterfaceC5664cq f() {
        return (InterfaceC5664cq) this.X;
    }

    public Object get() {
        Object obj;
        synchronized (this.Y) {
            obj = f().get();
        }
        return obj;
    }

    public Object remove() {
        Object remove;
        synchronized (this.Y) {
            remove = f().remove();
        }
        return remove;
    }

    public C10047uj2(InterfaceC5664cq interfaceC5664cq, Object obj) {
        super(interfaceC5664cq, obj);
    }
}
