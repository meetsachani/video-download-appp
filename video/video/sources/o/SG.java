package o;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public class SG<K, V> extends PG<K, V> {
    public static final int l1 = -2;
    @MB
    @InterfaceC5299bJ2
    public transient long[] h1;
    public transient int i1;
    public transient int j1;
    public final boolean k1;

    public SG() {
        this(3);
    }

    public static <K, V> SG<K, V> i0() {
        return new SG<>();
    }

    public static <K, V> SG<K, V> m0(int i) {
        return new SG<>(i);
    }

    @Override // o.PG
    public int E() {
        return this.i1;
    }

    @Override // o.PG
    public int F(int i) {
        return ((int) q0(i)) - 1;
    }

    @Override // o.PG
    public void J(int i) {
        super.J(i);
        this.i1 = -2;
        this.j1 = -2;
    }

    @Override // o.PG
    public void K(int i, @InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v, int i2, int i3) {
        super.K(i, k, v, i2, i3);
        u0(this.j1, i);
        u0(i, -2);
    }

    @Override // o.PG
    public void O(int i, int i2) {
        int size = size() - 1;
        super.O(i, i2);
        u0(o0(i), F(i));
        if (i < size) {
            u0(o0(size), i);
            u0(i, F(size));
        }
        s0(size, 0L);
    }

    @Override // o.PG
    public void X(int i) {
        super.X(i);
        this.h1 = Arrays.copyOf(r0(), i);
    }

    @Override // o.PG, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        this.i1 = -2;
        this.j1 = -2;
        long[] jArr = this.h1;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // o.PG
    public void o(int i) {
        if (this.k1) {
            u0(o0(i), F(i));
            u0(this.j1, i);
            u0(i, -2);
            H();
        }
    }

    public final int o0(int i) {
        return ((int) (q0(i) >>> 32)) - 1;
    }

    public final long q0(int i) {
        return r0()[i];
    }

    @Override // o.PG
    public int r(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    public final long[] r0() {
        long[] jArr = this.h1;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void s0(int i, long j) {
        r0()[i] = j;
    }

    @Override // o.PG
    public int t() {
        int t = super.t();
        this.h1 = new long[t];
        return t;
    }

    public final void t0(int i, int i2) {
        s0(i, (q0(i) & 4294967295L) | ((i2 + 1) << 32));
    }

    @Override // o.PG
    @InterfaceC6181ey
    public Map<K, V> u() {
        Map<K, V> u = super.u();
        this.h1 = null;
        return u;
    }

    public final void u0(int i, int i2) {
        if (i == -2) {
            this.i1 = i2;
        } else {
            v0(i, i2);
        }
        if (i2 == -2) {
            this.j1 = i;
        } else {
            t0(i2, i);
        }
    }

    public final void v0(int i, int i2) {
        s0(i, (q0(i) & C5920dt1.l) | ((i2 + 1) & 4294967295L));
    }

    @Override // o.PG
    public Map<K, V> x(int i) {
        return new LinkedHashMap(i, 1.0f, this.k1);
    }

    public SG(int i) {
        this(i, false);
    }

    public SG(int i, boolean z) {
        super(i);
        this.k1 = z;
    }
}
