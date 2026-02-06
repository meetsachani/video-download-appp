package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.C3051Gi2;

/* renamed from: o.ti2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9800ti2 implements InterfaceC3962Pq1<b, c> {
    public static final String e = "SurfaceProcessorNode";
    public final InterfaceC8822pi2 a;
    public final InterfaceC7402jx b;
    public c c;
    public b d;

    /* renamed from: o.ti2$a */
    /* loaded from: classes.dex */
    public class a implements XB0<InterfaceC7588ki2> {
        public a() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C7433k41.q(C9800ti2.e, "Downstream node failed to provide Surface.", th);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(InterfaceC7588ki2 interfaceC7588ki2) {
            C10907yF1.l(interfaceC7588ki2);
            try {
                C9800ti2.this.a.b(interfaceC7588ki2);
            } catch (C7993mI1 e) {
                C7433k41.d(C9800ti2.e, "Failed to send SurfaceOutput to SurfaceProcessor.", e);
            }
        }
    }

    /* renamed from: o.ti2$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static b c(C6618gi2 c6618gi2, List<d> list) {
            return new C10776xj(c6618gi2, list);
        }

        public abstract List<d> a();

        public abstract C6618gi2 b();
    }

    /* renamed from: o.ti2$c */
    /* loaded from: classes.dex */
    public static class c extends HashMap<d, C6618gi2> {
    }

    /* renamed from: o.ti2$d */
    /* loaded from: classes.dex */
    public static abstract class d {
        public static d h(int i, int i2, Rect rect, Size size, int i3, boolean z) {
            return new C11019yj(UUID.randomUUID(), i, i2, rect, size, i3, z);
        }

        public static d i(C6618gi2 c6618gi2) {
            return h(c6618gi2.v(), c6618gi2.q(), c6618gi2.n(), C5433bs2.f(c6618gi2.n(), c6618gi2.s()), c6618gi2.s(), c6618gi2.r());
        }

        public abstract Rect a();

        public abstract int b();

        public abstract boolean c();

        public abstract int d();

        public abstract Size e();

        public abstract int f();

        public abstract UUID g();
    }

    public C9800ti2(InterfaceC7402jx interfaceC7402jx, InterfaceC8822pi2 interfaceC8822pi2) {
        this.b = interfaceC7402jx;
        this.a = interfaceC8822pi2;
    }

    public static /* synthetic */ void c(Map map, C3051Gi2.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int c2 = hVar.c() - ((d) entry.getKey()).d();
            if (((d) entry.getKey()).c()) {
                c2 = -c2;
            }
            ((C6618gi2) entry.getValue()).D(C5433bs2.A(c2), -1);
        }
    }

    public static /* synthetic */ void d(C9800ti2 c9800ti2) {
        c cVar = c9800ti2.c;
        if (cVar != null) {
            for (C6618gi2 c6618gi2 : cVar.values()) {
                c6618gi2.i();
            }
        }
    }

    public final void e(C6618gi2 c6618gi2, Map.Entry<d, C6618gi2> entry) {
        InterfaceC7402jx interfaceC7402jx;
        C6618gi2 value = entry.getValue();
        Size e2 = c6618gi2.u().e();
        int b2 = entry.getKey().b();
        Rect a2 = entry.getKey().a();
        int d2 = entry.getKey().d();
        boolean c2 = entry.getKey().c();
        if (c6618gi2.w()) {
            interfaceC7402jx = this.b;
        } else {
            interfaceC7402jx = null;
        }
        C7221jC0.b(value.j(e2, b2, a2, d2, c2, interfaceC7402jx), new a(), C5211ay.f());
    }

    public InterfaceC8822pi2 f() {
        return this.a;
    }

    @Override // o.InterfaceC3962Pq1
    public void g() {
        this.a.g();
        C5211ay.f().execute(new Runnable() { // from class: o.ri2
            @Override // java.lang.Runnable
            public final void run() {
                C9800ti2.d(C9800ti2.this);
            }
        });
    }

    public final void h(final C6618gi2 c6618gi2, Map<d, C6618gi2> map) {
        for (final Map.Entry<d, C6618gi2> entry : map.entrySet()) {
            e(c6618gi2, entry);
            entry.getValue().f(new Runnable() { // from class: o.qi2
                @Override // java.lang.Runnable
                public final void run() {
                    C9800ti2.this.e(c6618gi2, entry);
                }
            });
        }
    }

    public final void i(C6618gi2 c6618gi2, Map<d, C6618gi2> map) {
        C3051Gi2 k = c6618gi2.k(this.b);
        j(k, map);
        try {
            this.a.a(k);
        } catch (C7993mI1 e2) {
            C7433k41.d(e, "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
    }

    public void j(C3051Gi2 c3051Gi2, final Map<d, C6618gi2> map) {
        c3051Gi2.u(C5211ay.f(), new C3051Gi2.i() { // from class: o.si2
            @Override // o.C3051Gi2.i
            public final void a(C3051Gi2.h hVar) {
                C9800ti2.c(map, hVar);
            }
        });
    }

    @Override // o.InterfaceC3962Pq1
    /* renamed from: k */
    public c a(b bVar) {
        C5901do2.c();
        this.d = bVar;
        this.c = new c();
        C6618gi2 b2 = bVar.b();
        for (d dVar : bVar.a()) {
            this.c.put(dVar, l(b2, dVar));
        }
        i(b2, this.c);
        h(b2, this.c);
        return this.c;
    }

    public final C6618gi2 l(C6618gi2 c6618gi2, d dVar) {
        boolean z;
        Rect a2 = dVar.a();
        int d2 = dVar.d();
        boolean c2 = dVar.c();
        Matrix matrix = new Matrix(c6618gi2.t());
        matrix.postConcat(C5433bs2.e(new RectF(a2), C5433bs2.v(dVar.e()), d2, c2));
        C10907yF1.a(C5433bs2.i(C5433bs2.f(a2, d2), dVar.e()));
        AbstractC4008Qd2 a3 = c6618gi2.u().f().e(dVar.e()).a();
        int f = dVar.f();
        int b2 = dVar.b();
        Rect t = C5433bs2.t(dVar.e());
        int s = c6618gi2.s() - d2;
        if (c6618gi2.r() != c2) {
            z = true;
        } else {
            z = false;
        }
        return new C6618gi2(f, b2, a3, matrix, false, t, s, -1, z);
    }
}
