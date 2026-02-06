package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.C3743Nk1;
import o.Z71;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class Y71 {
    public static final int g = 16;
    public static final int h = 4;
    public static final int i = -1;
    public boolean a;
    public int b = -1;
    public int c = -1;
    @MB
    public Z71.q d;
    @MB
    public Z71.q e;
    @MB
    public AbstractC6843he0<Object> f;

    /* loaded from: classes3.dex */
    public enum a {
        VALUE
    }

    @InterfaceC6181ey
    public Y71 a(int i2) {
        boolean z;
        int i3 = this.c;
        boolean z2 = false;
        if (i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.n0(z, "concurrency level was already set to %s", i3);
        if (i2 > 0) {
            z2 = true;
        }
        C10664xF1.d(z2);
        this.c = i2;
        return this;
    }

    public int b() {
        int i2 = this.c;
        if (i2 == -1) {
            return 4;
        }
        return i2;
    }

    public int c() {
        int i2 = this.b;
        if (i2 == -1) {
            return 16;
        }
        return i2;
    }

    public AbstractC6843he0<Object> d() {
        return (AbstractC6843he0) C3743Nk1.a(this.f, e().g());
    }

    public Z71.q e() {
        return (Z71.q) C3743Nk1.a(this.d, Z71.q.X);
    }

    public Z71.q f() {
        return (Z71.q) C3743Nk1.a(this.e, Z71.q.X);
    }

    @InterfaceC6181ey
    public Y71 g(int i2) {
        boolean z;
        int i3 = this.b;
        boolean z2 = false;
        if (i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.n0(z, "initial capacity was already set to %s", i3);
        if (i2 >= 0) {
            z2 = true;
        }
        C10664xF1.d(z2);
        this.b = i2;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    public Y71 h(AbstractC6843he0<Object> abstractC6843he0) {
        boolean z;
        AbstractC6843he0<Object> abstractC6843he02 = this.f;
        if (abstractC6843he02 == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.x0(z, "key equivalence was already set to %s", abstractC6843he02);
        this.f = (AbstractC6843he0) C10664xF1.E(abstractC6843he0);
        this.a = true;
        return this;
    }

    public <K, V> ConcurrentMap<K, V> i() {
        if (!this.a) {
            return new ConcurrentHashMap(c(), 0.75f, b());
        }
        return Z71.c(this);
    }

    public Y71 j(Z71.q qVar) {
        boolean z;
        Z71.q qVar2 = this.d;
        if (qVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.x0(z, "Key strength was already set to %s", qVar2);
        this.d = (Z71.q) C10664xF1.E(qVar);
        if (qVar != Z71.q.X) {
            this.a = true;
        }
        return this;
    }

    public Y71 k(Z71.q qVar) {
        boolean z;
        Z71.q qVar2 = this.e;
        if (qVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.x0(z, "Value strength was already set to %s", qVar2);
        this.e = (Z71.q) C10664xF1.E(qVar);
        if (qVar != Z71.q.X) {
            this.a = true;
        }
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    public Y71 l() {
        return j(Z71.q.Y);
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    public Y71 m() {
        return k(Z71.q.Y);
    }

    public String toString() {
        C3743Nk1.b c = C3743Nk1.c(this);
        int i2 = this.b;
        if (i2 != -1) {
            c.d("initialCapacity", i2);
        }
        int i3 = this.c;
        if (i3 != -1) {
            c.d("concurrencyLevel", i3);
        }
        Z71.q qVar = this.d;
        if (qVar != null) {
            c.f("keyStrength", C8077mf.g(qVar.toString()));
        }
        Z71.q qVar2 = this.e;
        if (qVar2 != null) {
            c.f("valueStrength", C8077mf.g(qVar2.toString()));
        }
        if (this.f != null) {
            c.s("keyEquivalence");
        }
        return c.toString();
    }
}
