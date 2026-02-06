package o;

import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import o.InterfaceC10233vU;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.oa2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8547oa2 implements InterfaceC10233vU, InterfaceC10233vU.a {
    public static final String c1 = "SourceGenerator";
    public final WV<?> X;
    public final InterfaceC10233vU.a Y;
    public volatile C8769pU Y0;
    public volatile int Z;
    public volatile Object Z0;
    public volatile InterfaceC7595kk1.a<?> a1;
    public volatile C9012qU b1;

    /* renamed from: o.oa2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC9990uU.a<Object> {
        public final /* synthetic */ InterfaceC7595kk1.a X;

        public a(InterfaceC7595kk1.a aVar) {
            this.X = aVar;
        }

        @Override // o.InterfaceC9990uU.a
        public void c(Exception exc) {
            if (C8547oa2.this.d(this.X)) {
                C8547oa2.this.f(this.X, exc);
            }
        }

        @Override // o.InterfaceC9990uU.a
        public void f(Object obj) {
            if (C8547oa2.this.d(this.X)) {
                C8547oa2.this.e(this.X, obj);
            }
        }
    }

    public C8547oa2(WV<?> wv, InterfaceC10233vU.a aVar) {
        this.X = wv;
        this.Y = aVar;
    }

    @Override // o.InterfaceC10233vU
    public boolean a() {
        if (this.Z0 != null) {
            Object obj = this.Z0;
            this.Z0 = null;
            try {
                if (!b(obj)) {
                    return true;
                }
            } catch (IOException e) {
                if (Log.isLoggable(c1, 3)) {
                    Log.d(c1, "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.Y0 != null && this.Y0.a()) {
            return true;
        }
        this.Y0 = null;
        this.a1 = null;
        boolean z = false;
        while (!z && c()) {
            List<InterfaceC7595kk1.a<?>> g = this.X.g();
            int i = this.Z;
            this.Z = i + 1;
            this.a1 = g.get(i);
            if (this.a1 != null && (this.X.e().c(this.a1.c.e()) || this.X.u(this.a1.c.a()))) {
                j(this.a1);
                z = true;
            }
        }
        return z;
    }

    public final boolean b(Object obj) throws IOException {
        Throwable th;
        long b = C5965e41.b();
        boolean z = false;
        try {
            com.bumptech.glide.load.data.a<T> o2 = this.X.o(obj);
            Object c = o2.c();
            InterfaceC2422Ab0<X> q = this.X.q(c);
            C9261rU c9261rU = new C9261rU(q, c, this.X.k());
            C9012qU c9012qU = new C9012qU(this.a1.a, this.X.p());
            Y30 d = this.X.d();
            d.a(c9012qU, c9261rU);
            if (Log.isLoggable(c1, 2)) {
                Log.v(c1, "Finished encoding source to cache, key: " + c9012qU + ", data: " + obj + ", encoder: " + q + ", duration: " + C5965e41.a(b));
            }
            if (d.b(c9012qU) != null) {
                this.b1 = c9012qU;
                this.Y0 = new C8769pU(Collections.singletonList(this.a1.a), this.X, this);
                this.a1.c.b();
                return true;
            }
            if (Log.isLoggable(c1, 3)) {
                Log.d(c1, "Attempt to write: " + this.b1 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.Y.h(this.a1.a, o2.c(), this.a1.c, this.a1.c.e(), this.a1.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (!z) {
                    this.a1.c.b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean c() {
        if (this.Z < this.X.g().size()) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10233vU
    public void cancel() {
        InterfaceC7595kk1.a<?> aVar = this.a1;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public boolean d(InterfaceC7595kk1.a<?> aVar) {
        InterfaceC7595kk1.a<?> aVar2 = this.a1;
        if (aVar2 != null && aVar2 == aVar) {
            return true;
        }
        return false;
    }

    public void e(InterfaceC7595kk1.a<?> aVar, Object obj) {
        AbstractC4994a40 e = this.X.e();
        if (obj != null && e.c(aVar.c.e())) {
            this.Z0 = obj;
            this.Y.i();
            return;
        }
        InterfaceC10233vU.a aVar2 = this.Y;
        InterfaceC6575gX0 interfaceC6575gX0 = aVar.a;
        InterfaceC9990uU<?> interfaceC9990uU = aVar.c;
        aVar2.h(interfaceC6575gX0, obj, interfaceC9990uU, interfaceC9990uU.e(), this.b1);
    }

    public void f(InterfaceC7595kk1.a<?> aVar, Exception exc) {
        InterfaceC10233vU.a aVar2 = this.Y;
        C9012qU c9012qU = this.b1;
        InterfaceC9990uU<?> interfaceC9990uU = aVar.c;
        aVar2.g(c9012qU, exc, interfaceC9990uU, interfaceC9990uU.e());
    }

    @Override // o.InterfaceC10233vU.a
    public void g(InterfaceC6575gX0 interfaceC6575gX0, Exception exc, InterfaceC9990uU<?> interfaceC9990uU, GU gu) {
        this.Y.g(interfaceC6575gX0, exc, interfaceC9990uU, this.a1.c.e());
    }

    @Override // o.InterfaceC10233vU.a
    public void h(InterfaceC6575gX0 interfaceC6575gX0, Object obj, InterfaceC9990uU<?> interfaceC9990uU, GU gu, InterfaceC6575gX0 interfaceC6575gX02) {
        this.Y.h(interfaceC6575gX0, obj, interfaceC9990uU, this.a1.c.e(), interfaceC6575gX0);
    }

    @Override // o.InterfaceC10233vU.a
    public void i() {
        throw new UnsupportedOperationException();
    }

    public final void j(InterfaceC7595kk1.a<?> aVar) {
        this.a1.c.d(this.X.l(), new a(aVar));
    }
}
