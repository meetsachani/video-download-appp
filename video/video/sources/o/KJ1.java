package o;

/* loaded from: classes3.dex */
public abstract class KJ1 extends AbstractC2787Dt implements TW0 {
    public final boolean c1;

    public KJ1() {
        this.c1 = false;
    }

    @Override // o.TW0
    @InterfaceC6480g82(version = "1.1")
    public boolean K() {
        return p0().K();
    }

    @Override // o.TW0
    @InterfaceC6480g82(version = "1.1")
    public boolean b0() {
        return p0().b0();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KJ1) {
            KJ1 kj1 = (KJ1) obj;
            if (o0().equals(kj1.o0()) && getName().equals(kj1.getName()) && q0().equals(kj1.q0()) && C6562gT0.g(n0(), kj1.n0())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof TW0)) {
            return false;
        } else {
            return obj.equals(l0());
        }
    }

    public int hashCode() {
        return (((o0().hashCode() * 31) + getName().hashCode()) * 31) + q0().hashCode();
    }

    @Override // o.AbstractC2787Dt
    public InterfaceC11215zW0 l0() {
        if (this.c1) {
            return this;
        }
        return super.l0();
    }

    @Override // o.AbstractC2787Dt
    @InterfaceC6480g82(version = "1.1")
    /* renamed from: t0 */
    public TW0 p0() {
        if (!this.c1) {
            return (TW0) super.p0();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public String toString() {
        InterfaceC11215zW0 l0 = l0();
        if (l0 != this) {
            return l0.toString();
        }
        return "property " + getName() + C6551gQ1.b;
    }

    @InterfaceC6480g82(version = "1.1")
    public KJ1(Object obj) {
        super(obj);
        this.c1 = false;
    }

    @InterfaceC6480g82(version = "1.4")
    public KJ1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.c1 = (i & 2) == 2;
    }
}
