package o;

/* renamed from: o.lB0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7703lB0 extends AbstractC2787Dt implements InterfaceC6976iB0, FW0 {
    public final int c1;
    @InterfaceC6480g82(version = "1.4")
    public final int d1;

    public C7703lB0(int i) {
        this(i, AbstractC2787Dt.b1, null, null, null, 0);
    }

    @Override // o.FW0
    @InterfaceC6480g82(version = "1.1")
    public boolean L() {
        return p0().L();
    }

    @Override // o.FW0
    @InterfaceC6480g82(version = "1.1")
    public boolean W() {
        return p0().W();
    }

    @Override // o.AbstractC2787Dt, o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.1")
    public boolean e() {
        return p0().e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7703lB0) {
            C7703lB0 c7703lB0 = (C7703lB0) obj;
            if (getName().equals(c7703lB0.getName()) && q0().equals(c7703lB0.q0()) && this.d1 == c7703lB0.d1 && this.c1 == c7703lB0.c1 && C6562gT0.g(n0(), c7703lB0.n0()) && C6562gT0.g(o0(), c7703lB0.o0())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof FW0)) {
            return false;
        } else {
            return obj.equals(l0());
        }
    }

    @Override // o.InterfaceC6976iB0
    public int getArity() {
        return this.c1;
    }

    @Override // o.FW0
    @InterfaceC6480g82(version = "1.1")
    public boolean h0() {
        return p0().h0();
    }

    public int hashCode() {
        int hashCode;
        if (o0() == null) {
            hashCode = 0;
        } else {
            hashCode = o0().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + q0().hashCode();
    }

    @Override // o.FW0
    @InterfaceC6480g82(version = "1.1")
    public boolean i0() {
        return p0().i0();
    }

    @Override // o.AbstractC2787Dt
    @InterfaceC6480g82(version = "1.1")
    public InterfaceC11215zW0 m0() {
        return C6551gQ1.c(this);
    }

    @Override // o.AbstractC2787Dt
    @InterfaceC6480g82(version = "1.1")
    /* renamed from: t0 */
    public FW0 p0() {
        return (FW0) super.p0();
    }

    public String toString() {
        InterfaceC11215zW0 l0 = l0();
        if (l0 != this) {
            return l0.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + C6551gQ1.b;
    }

    @InterfaceC6480g82(version = "1.1")
    public C7703lB0(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @InterfaceC6480g82(version = "1.4")
    public C7703lB0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.c1 = i;
        this.d1 = i2 >> 1;
    }
}
