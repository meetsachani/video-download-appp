package androidx.camera.core;

import androidx.camera.core.b;
import androidx.camera.core.e;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import o.C5211ay;
import o.C7221jC0;
import o.InterfaceC8499oN0;
import o.XB0;

/* loaded from: classes.dex */
public final class e extends d {
    public final Executor u;
    public final Object v = new Object();
    public g w;
    public b x;

    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            this.a.close();
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends androidx.camera.core.b {
        public final WeakReference<e> Y0;

        public b(g gVar, e eVar) {
            super(gVar);
            this.Y0 = new WeakReference<>(eVar);
            a(new b.a() { // from class: o.qM0
                @Override // androidx.camera.core.b.a
                public final void b(androidx.camera.core.g gVar2) {
                    e.b.f(e.b.this, gVar2);
                }
            });
        }

        public static /* synthetic */ void f(b bVar, g gVar) {
            final e eVar = bVar.Y0.get();
            if (eVar != null) {
                eVar.u.execute(new Runnable() { // from class: o.rM0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.e.this.x();
                    }
                });
            }
        }
    }

    public e(Executor executor) {
        this.u = executor;
    }

    @Override // androidx.camera.core.d
    public g d(InterfaceC8499oN0 interfaceC8499oN0) {
        return interfaceC8499oN0.a();
    }

    @Override // androidx.camera.core.d
    public void g() {
        synchronized (this.v) {
            try {
                g gVar = this.w;
                if (gVar != null) {
                    gVar.close();
                    this.w = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.d
    public void m(g gVar) {
        synchronized (this.v) {
            try {
                if (!this.s) {
                    gVar.close();
                } else if (this.x != null) {
                    if (gVar.I4().c() <= this.x.I4().c()) {
                        gVar.close();
                    } else {
                        g gVar2 = this.w;
                        if (gVar2 != null) {
                            gVar2.close();
                        }
                        this.w = gVar;
                    }
                } else {
                    b bVar = new b(gVar, this);
                    this.x = bVar;
                    C7221jC0.b(e(bVar), new a(bVar), C5211ay.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.v) {
            try {
                this.x = null;
                g gVar = this.w;
                if (gVar != null) {
                    this.w = null;
                    m(gVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
