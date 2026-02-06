package o;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import o.AbstractC7373jp2;
import o.ED1;
import o.InterfaceC7583kh1;
import o.J8;

@Deprecated
/* renamed from: o.i00  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6932i00 implements ED1 {
    public static final InterfaceC8331nh2<String> i = new InterfaceC8331nh2() { // from class: o.h00
        @Override // o.InterfaceC8331nh2
        public final Object get() {
            String n;
            n = C6932i00.n();
            return n;
        }
    };
    public static final Random j = new Random();
    public static final int k = 12;
    public final AbstractC7373jp2.d a;
    public final AbstractC7373jp2.b b;
    public final HashMap<String, a> c;
    public final InterfaceC8331nh2<String> d;
    public ED1.a e;
    public AbstractC7373jp2 f;
    @InterfaceC11300zs1
    public String g;
    public long h;

    /* renamed from: o.i00$a */
    /* loaded from: classes2.dex */
    public final class a {
        public final String a;
        public int b;
        public long c;
        public InterfaceC7583kh1.b d;
        public boolean e;
        public boolean f;

        public a(String str, int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            long j;
            this.a = str;
            this.b = i;
            if (bVar == null) {
                j = -1;
            } else {
                j = bVar.d;
            }
            this.c = j;
            if (bVar != null && bVar.c()) {
                this.d = bVar;
            }
        }

        public boolean i(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            if (bVar == null) {
                if (i != this.b) {
                    return false;
                }
                return true;
            }
            InterfaceC7583kh1.b bVar2 = this.d;
            if (bVar2 == null) {
                if (bVar.c() || bVar.d != this.c) {
                    return false;
                }
                return true;
            } else if (bVar.d != bVar2.d || bVar.b != bVar2.b || bVar.c != bVar2.c) {
                return false;
            } else {
                return true;
            }
        }

        public boolean j(J8.b bVar) {
            InterfaceC7583kh1.b bVar2 = bVar.d;
            if (bVar2 == null) {
                if (this.b != bVar.c) {
                    return true;
                }
                return false;
            }
            long j = this.c;
            if (j == -1) {
                return false;
            }
            if (bVar2.d > j) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int g = bVar.b.g(bVar2.a);
            int g2 = bVar.b.g(this.d.a);
            InterfaceC7583kh1.b bVar3 = bVar.d;
            if (bVar3.d < this.d.d || g < g2) {
                return false;
            }
            if (g > g2) {
                return true;
            }
            if (bVar3.c()) {
                InterfaceC7583kh1.b bVar4 = bVar.d;
                int i = bVar4.b;
                int i2 = bVar4.c;
                InterfaceC7583kh1.b bVar5 = this.d;
                int i3 = bVar5.b;
                if (i > i3 || (i == i3 && i2 > bVar5.c)) {
                    return true;
                }
                return false;
            }
            int i4 = bVar.d.e;
            if (i4 == -1 || i4 > this.d.b) {
                return true;
            }
            return false;
        }

        public void k(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            if (this.c == -1 && i == this.b && bVar != null && bVar.d >= C6932i00.this.o()) {
                this.c = bVar.d;
            }
        }

        public final int l(AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2 abstractC7373jp22, int i) {
            if (i >= abstractC7373jp2.w()) {
                if (i >= abstractC7373jp22.w()) {
                    return -1;
                }
                return i;
            }
            abstractC7373jp2.u(i, C6932i00.this.a);
            for (int i2 = C6932i00.this.a.j1; i2 <= C6932i00.this.a.k1; i2++) {
                int g = abstractC7373jp22.g(abstractC7373jp2.t(i2));
                if (g != -1) {
                    return abstractC7373jp22.k(g, C6932i00.this.b).Z;
                }
            }
            return -1;
        }

        public boolean m(AbstractC7373jp2 abstractC7373jp2, AbstractC7373jp2 abstractC7373jp22) {
            int l = l(abstractC7373jp2, abstractC7373jp22, this.b);
            this.b = l;
            if (l == -1) {
                return false;
            }
            InterfaceC7583kh1.b bVar = this.d;
            if (bVar != null && abstractC7373jp22.g(bVar.a) == -1) {
                return false;
            }
            return true;
        }
    }

    public C6932i00() {
        this(i);
    }

    public static String n() {
        byte[] bArr = new byte[12];
        j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // o.ED1
    @InterfaceC11300zs1
    public synchronized String a() {
        return this.g;
    }

    @Override // o.ED1
    public synchronized String b(AbstractC7373jp2 abstractC7373jp2, InterfaceC7583kh1.b bVar) {
        return p(abstractC7373jp2.m(bVar.a, this.b).Z, bVar).a;
    }

    @Override // o.ED1
    public void c(ED1.a aVar) {
        this.e = aVar;
    }

    @Override // o.ED1
    public synchronized void d(J8.b bVar, int i2) {
        boolean z;
        boolean z2;
        try {
            C9542sf.g(this.e);
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(bVar)) {
                    it.remove();
                    if (next.e) {
                        boolean equals = next.a.equals(this.g);
                        if (z && equals && next.f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (equals) {
                            m(next);
                        }
                        this.e.V(bVar, next.a, z2);
                    }
                }
            }
            q(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.ED1
    public synchronized void e(J8.b bVar) {
        ED1.a aVar;
        try {
            String str = this.g;
            if (str != null) {
                m((a) C9542sf.g(this.c.get(str)));
            }
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.e && (aVar = this.e) != null) {
                    aVar.V(bVar, next.a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.ED1
    public synchronized void f(J8.b bVar) {
        try {
            C9542sf.g(this.e);
            AbstractC7373jp2 abstractC7373jp2 = this.f;
            this.f = bVar.b;
            Iterator<a> it = this.c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.m(abstractC7373jp2, this.f) && !next.j(bVar)) {
                }
                it.remove();
                if (next.e) {
                    if (next.a.equals(this.g)) {
                        m(next);
                    }
                    this.e.V(bVar, next.a, false);
                }
            }
            q(bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.ED1
    public synchronized void g(J8.b bVar) {
        C9542sf.g(this.e);
        if (bVar.b.x()) {
            return;
        }
        InterfaceC7583kh1.b bVar2 = bVar.d;
        if (bVar2 != null) {
            if (bVar2.d < o()) {
                return;
            }
            a aVar = this.c.get(this.g);
            if (aVar != null && aVar.c == -1 && aVar.b != bVar.c) {
                return;
            }
        }
        a p = p(bVar.c, bVar.d);
        if (this.g == null) {
            this.g = p.a;
        }
        InterfaceC7583kh1.b bVar3 = bVar.d;
        if (bVar3 != null && bVar3.c()) {
            InterfaceC7583kh1.b bVar4 = bVar.d;
            InterfaceC7583kh1.b bVar5 = new InterfaceC7583kh1.b(bVar4.a, bVar4.d, bVar4.b);
            a p2 = p(bVar.c, bVar5);
            if (!p2.e) {
                p2.e = true;
                bVar.b.m(bVar.d.a, this.b);
                this.e.m(new J8.b(bVar.a, bVar.b, bVar.c, bVar5, Math.max(0L, TD2.b2(this.b.j(bVar.d.b)) + this.b.s()), bVar.f, bVar.g, bVar.h, bVar.i, bVar.j), p2.a);
            }
        }
        if (!p.e) {
            p.e = true;
            this.e.m(bVar, p.a);
        }
        if (p.a.equals(this.g) && !p.f) {
            p.f = true;
            this.e.i0(bVar, p.a);
        }
    }

    @Override // o.ED1
    public synchronized boolean h(J8.b bVar, String str) {
        a aVar = this.c.get(str);
        if (aVar == null) {
            return false;
        }
        aVar.k(bVar.c, bVar.d);
        return aVar.i(bVar.c, bVar.d);
    }

    public final void m(a aVar) {
        if (aVar.c != -1) {
            this.h = aVar.c;
        }
        this.g = null;
    }

    public final long o() {
        a aVar = this.c.get(this.g);
        if (aVar != null && aVar.c != -1) {
            return aVar.c;
        }
        return this.h + 1;
    }

    public final a p(int i2, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
        int i3;
        a aVar = null;
        long j2 = Long.MAX_VALUE;
        for (a aVar2 : this.c.values()) {
            aVar2.k(i2, bVar);
            if (aVar2.i(i2, bVar)) {
                long j3 = aVar2.c;
                if (j3 != -1 && j3 >= j2) {
                    if (i3 == 0 && ((a) TD2.o(aVar)).d != null && aVar2.d != null) {
                        aVar = aVar2;
                    }
                } else {
                    aVar = aVar2;
                    j2 = j3;
                }
            }
        }
        if (aVar == null) {
            String str = this.d.get();
            a aVar3 = new a(str, i2, bVar);
            this.c.put(str, aVar3);
            return aVar3;
        }
        return aVar;
    }

    @HS1({ServiceSpecificExtraArgs.CastExtraArgs.a})
    public final void q(J8.b bVar) {
        if (bVar.b.x()) {
            String str = this.g;
            if (str != null) {
                m((a) C9542sf.g(this.c.get(str)));
                return;
            }
            return;
        }
        a aVar = this.c.get(this.g);
        a p = p(bVar.c, bVar.d);
        this.g = p.a;
        g(bVar);
        InterfaceC7583kh1.b bVar2 = bVar.d;
        if (bVar2 != null && bVar2.c()) {
            if (aVar == null || aVar.c != bVar.d.d || aVar.d == null || aVar.d.b != bVar.d.b || aVar.d.c != bVar.d.c) {
                InterfaceC7583kh1.b bVar3 = bVar.d;
                this.e.r(bVar, p(bVar.c, new InterfaceC7583kh1.b(bVar3.a, bVar3.d)).a, p.a);
            }
        }
    }

    public C6932i00(InterfaceC8331nh2<String> interfaceC8331nh2) {
        this.d = interfaceC8331nh2;
        this.a = new AbstractC7373jp2.d();
        this.b = new AbstractC7373jp2.b();
        this.c = new HashMap<>();
        this.f = AbstractC7373jp2.X;
        this.h = -1L;
    }
}
