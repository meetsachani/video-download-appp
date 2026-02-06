package o;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC7415k0;

/* renamed from: o.De0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2728De0 extends AbstractC7415k0<Integer> {
    public static final Map<AbstractC7415k0.b, c> i = h();
    public final AtomicReference<b> d;
    public final int e;
    public final long f;
    public final int g;
    public final long h;

    /* renamed from: o.De0$b */
    /* loaded from: classes4.dex */
    public static class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public long a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public b c(int i) {
            if (i == 0) {
                return this;
            }
            return new b(b() + i, a());
        }
    }

    /* renamed from: o.De0$c */
    /* loaded from: classes4.dex */
    public static abstract class c {
        public c() {
        }

        public abstract long a(C2728De0 c2728De0);

        public boolean b(C2728De0 c2728De0, b bVar, long j) {
            if (j - bVar.a() > a(c2728De0)) {
                return true;
            }
            return false;
        }

        public abstract boolean c(C2728De0 c2728De0, b bVar, b bVar2);
    }

    /* renamed from: o.De0$d */
    /* loaded from: classes4.dex */
    public static class d extends c {
        public d() {
            super();
        }

        @Override // o.C2728De0.c
        public long a(C2728De0 c2728De0) {
            return c2728De0.k();
        }

        @Override // o.C2728De0.c
        public boolean c(C2728De0 c2728De0, b bVar, b bVar2) {
            if (bVar2.b() > c2728De0.l()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: o.De0$e */
    /* loaded from: classes4.dex */
    public static class e extends c {
        public e() {
            super();
        }

        @Override // o.C2728De0.c
        public long a(C2728De0 c2728De0) {
            return c2728De0.i();
        }

        @Override // o.C2728De0.c
        public boolean c(C2728De0 c2728De0, b bVar, b bVar2) {
            if (bVar2.a() != bVar.a() && bVar.b() < c2728De0.j()) {
                return true;
            }
            return false;
        }
    }

    public C2728De0(int i2, long j, TimeUnit timeUnit, int i3, long j2, TimeUnit timeUnit2) {
        this.d = new AtomicReference<>(new b(0, 0L));
        this.e = i2;
        this.f = timeUnit.toNanos(j);
        this.g = i3;
        this.h = timeUnit2.toNanos(j2);
    }

    public static Map<AbstractC7415k0.b, c> h() {
        EnumMap enumMap = new EnumMap(AbstractC7415k0.b.class);
        enumMap.put((EnumMap) AbstractC7415k0.b.X, (AbstractC7415k0.b) new d());
        enumMap.put((EnumMap) AbstractC7415k0.b.Y, (AbstractC7415k0.b) new e());
        return enumMap;
    }

    public static c r(AbstractC7415k0.b bVar) {
        return i.get(bVar);
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    public boolean a() {
        return q(0);
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    public void close() {
        super.close();
        this.d.set(new b(0, o()));
    }

    public final void g(AbstractC7415k0.b bVar) {
        d(bVar);
        this.d.set(new b(0, o()));
    }

    public long i() {
        return this.h;
    }

    public int j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public int l() {
        return this.e;
    }

    public boolean m() {
        return b(1);
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    /* renamed from: n */
    public boolean b(Integer num) {
        return q(num.intValue());
    }

    public long o() {
        return System.nanoTime();
    }

    @Override // o.AbstractC7415k0, o.InterfaceC10161vC
    public void open() {
        super.open();
        this.d.set(new b(0, o()));
    }

    public final b p(int i2, b bVar, AbstractC7415k0.b bVar2, long j) {
        if (r(bVar2).b(this, bVar, j)) {
            return new b(i2, j);
        }
        return bVar.c(i2);
    }

    public final boolean q(int i2) {
        AbstractC7415k0.b bVar;
        b bVar2;
        b p;
        while (true) {
            long o2 = o();
            bVar = this.a.get();
            bVar2 = this.d.get();
            int i3 = i2;
            p = p(i3, bVar2, bVar, o2);
            if (s(bVar2, p)) {
                break;
            }
            i2 = i3;
        }
        if (r(bVar).c(this, bVar2, p)) {
            bVar = bVar.e();
            g(bVar);
        }
        return !AbstractC7415k0.e(bVar);
    }

    public final boolean s(b bVar, b bVar2) {
        if (bVar != bVar2 && !C6515gH1.a(this.d, bVar, bVar2)) {
            return false;
        }
        return true;
    }

    public C2728De0(int i2, long j, TimeUnit timeUnit, int i3) {
        this(i2, j, timeUnit, i3, j, timeUnit);
    }

    public C2728De0(int i2, long j, TimeUnit timeUnit) {
        this(i2, j, timeUnit, i2);
    }
}
