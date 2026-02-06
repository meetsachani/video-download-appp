package o;

import java.util.LinkedHashMap;
import java.util.Map;

@Deprecated
/* renamed from: o.zC1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11138zC1 implements InterfaceC4938Zo2 {
    public static final int f = 10;
    public static final float g = 0.5f;
    public static final int h = 10;
    public final LinkedHashMap<OU, Long> a;
    public final C7454k92 b;
    public final float c;
    public final LD d;
    public boolean e;

    /* renamed from: o.zC1$a */
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

    public C11138zC1() {
        this(10, 0.5f);
    }

    @Override // o.InterfaceC4938Zo2
    public void a(OU ou) {
        Long remove = this.a.remove(ou);
        if (remove == null) {
            return;
        }
        this.b.c(1, (float) (TD2.j1(this.d.b()) - remove.longValue()));
        this.e = false;
    }

    @Override // o.InterfaceC4938Zo2
    public long b() {
        if (!this.e) {
            return this.b.f(this.c);
        }
        return C10323vs.b;
    }

    @Override // o.InterfaceC4938Zo2
    public void c(OU ou) {
        this.a.remove(ou);
        this.a.put(ou, Long.valueOf(TD2.j1(this.d.b())));
    }

    @Override // o.InterfaceC4938Zo2
    public void reset() {
        this.b.g();
        this.e = true;
    }

    public C11138zC1(int i, float f2) {
        this(i, f2, LD.a);
    }

    @InterfaceC5056aJ2
    public C11138zC1(int i, float f2, LD ld) {
        C9542sf.a(i > 0 && f2 > 0.0f && f2 <= 1.0f);
        this.c = f2;
        this.d = ld;
        this.a = new a(10);
        this.b = new C7454k92(i);
        this.e = true;
    }
}
