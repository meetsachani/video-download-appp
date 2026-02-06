package o;

import android.graphics.Bitmap;
import androidx.camera.core.f;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C2970Fn;
import o.C6777hM0;
import o.C8286nV0;
import o.C9701tI1;

/* renamed from: o.tI1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9701tI1 implements InterfaceC3962Pq1<a, Void> {
    public final Executor a;
    public final ES0 b;
    public a c;
    public InterfaceC3493Kv1<b, AbstractC3401Jx1<androidx.camera.core.g>> d;
    public InterfaceC3493Kv1<C6777hM0.a, AbstractC3401Jx1<byte[]>> e;
    public InterfaceC3493Kv1<C2970Fn.a, AbstractC3401Jx1<byte[]>> f;
    public InterfaceC3493Kv1<C8286nV0.a, f.m> g;
    public InterfaceC3493Kv1<AbstractC3401Jx1<byte[]>, AbstractC3401Jx1<Bitmap>> h;
    public InterfaceC3493Kv1<AbstractC3401Jx1<androidx.camera.core.g>, androidx.camera.core.g> i;
    public InterfaceC3493Kv1<AbstractC3401Jx1<byte[]>, AbstractC3401Jx1<androidx.camera.core.g>> j;
    public InterfaceC3493Kv1<AbstractC3401Jx1<Bitmap>, AbstractC3401Jx1<Bitmap>> k;
    public final C10931yL1 l;
    public final boolean m;

    /* renamed from: o.tI1$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        public static a d(int i, int i2) {
            return new C6364fj(new C7695l90(), i, i2);
        }

        public abstract C7695l90<b> a();

        public abstract int b();

        public abstract int c();
    }

    /* renamed from: o.tI1$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static b c(C9944uI1 c9944uI1, androidx.camera.core.g gVar) {
            return new C6619gj(c9944uI1, gVar);
        }

        public abstract androidx.camera.core.g a();

        public abstract C9944uI1 b();
    }

    public C9701tI1(Executor executor) {
        this(executor, null, U20.b());
    }

    public static /* synthetic */ void b(final C9701tI1 c9701tI1, final b bVar) {
        c9701tI1.getClass();
        if (bVar.b().i()) {
            return;
        }
        c9701tI1.a.execute(new Runnable() { // from class: o.sI1
            @Override // java.lang.Runnable
            public final void run() {
                C9701tI1.this.k(bVar);
            }
        });
    }

    public static void m(final C9944uI1 c9944uI1, final DM0 dm0) {
        C5211ay.f().execute(new Runnable() { // from class: o.pI1
            @Override // java.lang.Runnable
            public final void run() {
                C9944uI1.this.o(dm0);
            }
        });
    }

    public final AbstractC3401Jx1<byte[]> h(AbstractC3401Jx1<byte[]> abstractC3401Jx1, int i) throws DM0 {
        boolean z;
        if (abstractC3401Jx1.e() == 256) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.n(z);
        AbstractC3401Jx1<Bitmap> apply = this.h.apply(abstractC3401Jx1);
        InterfaceC3493Kv1<AbstractC3401Jx1<Bitmap>, AbstractC3401Jx1<Bitmap>> interfaceC3493Kv1 = this.k;
        if (interfaceC3493Kv1 != null) {
            apply = interfaceC3493Kv1.apply(apply);
        }
        return this.f.apply(C2970Fn.a.c(apply, i));
    }

    public void i(InterfaceC3493Kv1<b, AbstractC3401Jx1<androidx.camera.core.g>> interfaceC3493Kv1) {
        this.d = interfaceC3493Kv1;
    }

    public androidx.camera.core.g j(b bVar) throws DM0 {
        C9944uI1 b2 = bVar.b();
        AbstractC3401Jx1<androidx.camera.core.g> apply = this.d.apply(bVar);
        if ((apply.e() == 35 || this.k != null || this.m) && this.c.c() == 256) {
            AbstractC3401Jx1<byte[]> apply2 = this.e.apply(C6777hM0.a.c(apply, b2.c()));
            if (this.k != null) {
                apply2 = h(apply2, b2.c());
            }
            apply = this.j.apply(apply2);
        }
        return this.i.apply(apply);
    }

    public void k(b bVar) {
        final C9944uI1 b2 = bVar.b();
        try {
            if (bVar.b().j()) {
                final androidx.camera.core.g j = j(bVar);
                C5211ay.f().execute(new Runnable() { // from class: o.qI1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9944uI1.this.m(j);
                    }
                });
                return;
            }
            final f.m l = l(bVar);
            C5211ay.f().execute(new Runnable() { // from class: o.rI1
                @Override // java.lang.Runnable
                public final void run() {
                    C9944uI1.this.l(l);
                }
            });
        } catch (OutOfMemoryError e) {
            m(b2, new DM0(0, "Processing failed due to low memory.", e));
        } catch (RuntimeException e2) {
            m(b2, new DM0(0, "Processing failed.", e2));
        } catch (DM0 e3) {
            m(b2, e3);
        }
    }

    public f.m l(b bVar) throws DM0 {
        boolean z;
        if (this.c.c() == 256) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, String.format("On-disk capture only support JPEG output format. Output format: %s", Integer.valueOf(this.c.c())));
        C9944uI1 b2 = bVar.b();
        AbstractC3401Jx1<byte[]> apply = this.e.apply(C6777hM0.a.c(this.d.apply(bVar), b2.c()));
        if (apply.i() || this.k != null) {
            apply = h(apply, b2.c());
        }
        InterfaceC3493Kv1<C8286nV0.a, f.m> interfaceC3493Kv1 = this.g;
        f.l d = b2.d();
        Objects.requireNonNull(d);
        return interfaceC3493Kv1.apply(C8286nV0.a.c(apply, d));
    }

    @Override // o.InterfaceC3962Pq1
    /* renamed from: n */
    public Void a(a aVar) {
        this.c = aVar;
        aVar.a().a(new InterfaceC10929yL() { // from class: o.oI1
            @Override // o.InterfaceC10929yL
            public final void accept(Object obj) {
                C9701tI1.b(C9701tI1.this, (C9701tI1.b) obj);
            }
        });
        this.d = new C8236nI1();
        this.e = new C6777hM0(this.l);
        this.h = new C8043mV0();
        this.f = new C2970Fn();
        this.g = new C8286nV0();
        this.i = new C9265rV0();
        if (aVar.b() == 35 || this.b != null || this.m) {
            this.j = new C8530oV0();
        }
        ES0 es0 = this.b;
        if (es0 != null) {
            this.k = new C3948Pn(es0);
            return null;
        }
        return null;
    }

    public C9701tI1(Executor executor, C10931yL1 c10931yL1) {
        this(executor, null, c10931yL1);
    }

    public C9701tI1(Executor executor, ES0 es0) {
        this(executor, es0, U20.b());
    }

    public C9701tI1(Executor executor, ES0 es0, C10931yL1 c10931yL1) {
        if (U20.a(Q61.class) != null) {
            this.a = C5211ay.i(executor);
        } else {
            this.a = executor;
        }
        this.b = es0;
        this.l = c10931yL1;
        this.m = c10931yL1.a(C6048eP0.class);
    }

    @Override // o.InterfaceC3962Pq1
    public void g() {
    }
}
