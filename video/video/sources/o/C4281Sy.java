package o;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import o.InterfaceC8499oN0;

/* renamed from: o.Sy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4281Sy implements InterfaceC3962Pq1<b, c> {
    public static final String f = "CaptureNode";
    public static final int g = 4;
    public final Set<Integer> a = new HashSet();
    public C9944uI1 b = null;
    public androidx.camera.core.l c;
    public c d;
    public b e;

    /* renamed from: o.Sy$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public AbstractC3393Jv a = new a();
        public D10 b;

        /* renamed from: o.Sy$b$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC3393Jv {
            public a() {
            }
        }

        public static b j(Size size, int i, int i2, boolean z, InterfaceC8742pN0 interfaceC8742pN0) {
            return new C11015yi(size, i, i2, z, interfaceC8742pN0, new C7695l90(), new C7695l90());
        }

        public AbstractC3393Jv a() {
            return this.a;
        }

        public abstract C7695l90<DM0> b();

        public abstract InterfaceC8742pN0 c();

        public abstract int d();

        public abstract int e();

        public abstract C7695l90<C9944uI1> f();

        public abstract Size g();

        public D10 h() {
            D10 d10 = this.b;
            Objects.requireNonNull(d10);
            return d10;
        }

        public abstract boolean i();

        public void k(AbstractC3393Jv abstractC3393Jv) {
            this.a = abstractC3393Jv;
        }

        public void l(Surface surface) {
            boolean z;
            if (this.b == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "The surface is already set.");
            this.b = new MN0(surface, g(), d());
        }
    }

    /* renamed from: o.Sy$c */
    /* loaded from: classes.dex */
    public static abstract class c {
        public static c e(int i, int i2) {
            return new C11258zi(new C7695l90(), new C7695l90(), i, i2);
        }

        public abstract C7695l90<androidx.camera.core.g> a();

        public abstract int b();

        public abstract int c();

        public abstract C7695l90<C9944uI1> d();
    }

    public static /* synthetic */ void b(C4281Sy c4281Sy, InterfaceC8499oN0 interfaceC8499oN0) {
        c4281Sy.getClass();
        try {
            androidx.camera.core.g a2 = interfaceC8499oN0.a();
            if (a2 != null) {
                c4281Sy.j(a2);
            } else {
                c4281Sy.m(new DM0(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e) {
            c4281Sy.m(new DM0(2, "Failed to acquire latest image", e));
        }
    }

    public static /* synthetic */ void c(C4281Sy c4281Sy, C2875Eq1 c2875Eq1, C9944uI1 c9944uI1) {
        c4281Sy.k(c9944uI1);
        c2875Eq1.h(c9944uI1);
    }

    public static InterfaceC8499oN0 d(InterfaceC8742pN0 interfaceC8742pN0, int i, int i2, int i3) {
        if (interfaceC8742pN0 != null) {
            return interfaceC8742pN0.a(i, i2, i3, 4, 0L);
        }
        return C8985qN0.a(i, i2, i3, 4);
    }

    public int e() {
        boolean z;
        C5901do2.c();
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "The ImageReader is not initialized.");
        return this.c.i();
    }

    public b f() {
        b bVar = this.e;
        Objects.requireNonNull(bVar);
        return bVar;
    }

    @Override // o.InterfaceC3962Pq1
    public void g() {
        C5901do2.c();
        b bVar = this.e;
        Objects.requireNonNull(bVar);
        androidx.camera.core.l lVar = this.c;
        Objects.requireNonNull(lVar);
        l(bVar, lVar);
    }

    public androidx.camera.core.l h() {
        androidx.camera.core.l lVar = this.c;
        Objects.requireNonNull(lVar);
        return lVar;
    }

    public final void i(androidx.camera.core.g gVar) {
        Object d = gVar.I4().a().d(this.b.h());
        Objects.requireNonNull(d);
        Integer num = (Integer) d;
        int intValue = num.intValue();
        boolean contains = this.a.contains(num);
        C10907yF1.o(contains, "Received an unexpected stage id" + intValue);
        this.a.remove(num);
        c cVar = this.d;
        Objects.requireNonNull(cVar);
        cVar.a().accept(gVar);
        if (this.a.isEmpty()) {
            C9944uI1 c9944uI1 = this.b;
            this.b = null;
            c9944uI1.n();
        }
    }

    public void j(androidx.camera.core.g gVar) {
        C5901do2.c();
        if (this.b == null) {
            C7433k41.a(f, "Discarding ImageProxy which was inadvertently acquired: " + gVar);
            gVar.close();
            return;
        }
        i(gVar);
    }

    public void k(C9944uI1 c9944uI1) {
        boolean z;
        C5901do2.c();
        boolean z2 = false;
        if (e() > 0) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "Too many acquire images. Close image to be able to process next.");
        if (this.b == null || this.a.isEmpty()) {
            z2 = true;
        }
        C10907yF1.o(z2, "The previous request is not complete");
        this.b = c9944uI1;
        this.a.addAll(c9944uI1.g());
        c cVar = this.d;
        Objects.requireNonNull(cVar);
        cVar.d().accept(c9944uI1);
        C7221jC0.b(c9944uI1.a(), new a(c9944uI1), C5211ay.b());
    }

    public final void l(b bVar, androidx.camera.core.l lVar) {
        bVar.h().d();
        InterfaceFutureC8411o11<Void> k = bVar.h().k();
        Objects.requireNonNull(lVar);
        k.h4(new RunnableC10212vO2(lVar), C5211ay.f());
    }

    public void m(DM0 dm0) {
        C5901do2.c();
        C9944uI1 c9944uI1 = this.b;
        if (c9944uI1 != null) {
            c9944uI1.k(dm0);
        }
    }

    public void n(b.a aVar) {
        boolean z;
        C5901do2.c();
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "The ImageReader is not initialized.");
        this.c.m(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC3962Pq1
    /* renamed from: o */
    public c a(b bVar) {
        boolean z;
        InterfaceC10929yL<C9944uI1> interfaceC10929yL;
        C2875Eq1 c2875Eq1;
        if (this.e == null && this.c == null) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.o(z, "CaptureNode does not support recreation yet.");
        this.e = bVar;
        Size g2 = bVar.g();
        int d = bVar.d();
        if (!bVar.i() && bVar.c() == null) {
            androidx.camera.core.j jVar = new androidx.camera.core.j(g2.getWidth(), g2.getHeight(), d, 4);
            bVar.k(jVar.m());
            interfaceC10929yL = new InterfaceC10929yL() { // from class: o.Oy
                @Override // o.InterfaceC10929yL
                public final void accept(Object obj) {
                    C4281Sy.this.k((C9944uI1) obj);
                }
            };
            c2875Eq1 = jVar;
        } else {
            final C2875Eq1 c2875Eq12 = new C2875Eq1(d(bVar.c(), g2.getWidth(), g2.getHeight(), d));
            interfaceC10929yL = new InterfaceC10929yL() { // from class: o.Py
                @Override // o.InterfaceC10929yL
                public final void accept(Object obj) {
                    C4281Sy.c(C4281Sy.this, c2875Eq12, (C9944uI1) obj);
                }
            };
            c2875Eq1 = c2875Eq12;
        }
        Surface surface = c2875Eq1.getSurface();
        Objects.requireNonNull(surface);
        bVar.l(surface);
        this.c = new androidx.camera.core.l(c2875Eq1);
        c2875Eq1.f(new InterfaceC8499oN0.a() { // from class: o.Qy
            @Override // o.InterfaceC8499oN0.a
            public final void a(InterfaceC8499oN0 interfaceC8499oN0) {
                C4281Sy.b(C4281Sy.this, interfaceC8499oN0);
            }
        }, C5211ay.f());
        bVar.f().a(interfaceC10929yL);
        bVar.b().a(new InterfaceC10929yL() { // from class: o.Ry
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C4281Sy.this.m((DM0) obj);
            }
        });
        c e = c.e(bVar.d(), bVar.e());
        this.d = e;
        return e;
    }

    /* renamed from: o.Sy$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ C9944uI1 a;

        public a(C9944uI1 c9944uI1) {
            this.a = c9944uI1;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C5901do2.c();
            C9944uI1 c9944uI1 = this.a;
            C4281Sy c4281Sy = C4281Sy.this;
            if (c9944uI1 == c4281Sy.b) {
                c4281Sy.b = null;
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }
}
