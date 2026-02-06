package o;

import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
/* renamed from: o.lj0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7833lj0 implements InterfaceC4938Zo2 {
    public static final double e = 0.85d;
    public static final int f = 10;
    public final LinkedHashMap<OU, Long> a;
    public final double b;
    public final LD c;
    public long d;

    /* renamed from: o.lj0$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends LinkedHashMap<K, V> {
        public final int X;

        public a(int i) {
            this.X = i;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            if (size() > this.X) {
                return true;
            }
            return false;
        }
    }

    public C7833lj0() {
        this(0.85d, LD.a);
    }

    @Override // o.InterfaceC4938Zo2
    public void a(OU ou) {
        Long remove = this.a.remove(ou);
        if (remove == null) {
            return;
        }
        long j1 = TD2.j1(this.c.b()) - remove.longValue();
        long j = this.d;
        if (j == C10323vs.b) {
            this.d = j1;
            return;
        }
        double d = this.b;
        this.d = (long) ((j * d) + ((1.0d - d) * j1));
    }

    @Override // o.InterfaceC4938Zo2
    public long b() {
        return this.d;
    }

    @Override // o.InterfaceC4938Zo2
    public void c(OU ou) {
        this.a.remove(ou);
        this.a.put(ou, Long.valueOf(TD2.j1(this.c.b())));
    }

    @Override // o.InterfaceC4938Zo2
    public void reset() {
        this.d = C10323vs.b;
    }

    public C7833lj0(double d) {
        this(d, LD.a);
    }

    @InterfaceC5056aJ2
    public C7833lj0(double d, LD ld) {
        this.b = d;
        this.c = ld;
        this.a = new a(10);
        this.d = C10323vs.b;
    }
}
