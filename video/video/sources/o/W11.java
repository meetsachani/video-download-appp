package o;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import o.Q11;
import o.TD0;
import o.V11;

/* loaded from: classes.dex */
public class W11 extends V11 {
    public static final String c = "LoaderManager";
    public static boolean d = false;
    public final KZ0 a;
    public final c b;

    /* loaded from: classes.dex */
    public static class a<D> extends C7364jn1<D> implements Q11.c<D> {
        public final int m;
        public final Bundle n;

        /* renamed from: o  reason: collision with root package name */
        public final Q11<D> f651o;
        public KZ0 p;
        public b<D> q;
        public Q11<D> r;

        public a(int i, Bundle bundle, Q11<D> q11, Q11<D> q112) {
            this.m = i;
            this.n = bundle;
            this.f651o = q11;
            this.r = q112;
            q11.u(i, this);
        }

        @Override // o.Q11.c
        public void a(Q11<D> q11, D d) {
            if (W11.d) {
                Log.v(W11.c, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                r(d);
                return;
            }
            if (W11.d) {
                Log.w(W11.c, "onLoadComplete was incorrectly called on a background thread");
            }
            o(d);
        }

        @Override // androidx.lifecycle.LiveData
        public void m() {
            if (W11.d) {
                Log.v(W11.c, "  Starting: " + this);
            }
            this.f651o.y();
        }

        @Override // androidx.lifecycle.LiveData
        public void n() {
            if (W11.d) {
                Log.v(W11.c, "  Stopping: " + this);
            }
            this.f651o.z();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void p(InterfaceC3583Lt1<? super D> interfaceC3583Lt1) {
            super.p(interfaceC3583Lt1);
            this.p = null;
            this.q = null;
        }

        @Override // o.C7364jn1, androidx.lifecycle.LiveData
        public void r(D d) {
            super.r(d);
            Q11<D> q11 = this.r;
            if (q11 != null) {
                q11.w();
                this.r = null;
            }
        }

        public Q11<D> s(boolean z) {
            if (W11.d) {
                Log.v(W11.c, "  Destroying: " + this);
            }
            this.f651o.b();
            this.f651o.a();
            b<D> bVar = this.q;
            if (bVar != null) {
                p(bVar);
                if (z) {
                    bVar.d();
                }
            }
            this.f651o.B(this);
            if ((bVar != null && !bVar.c()) || z) {
                this.f651o.w();
                return this.r;
            }
            return this.f651o;
        }

        public void t(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.m);
            printWriter.print(" mArgs=");
            printWriter.println(this.n);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f651o);
            Q11<D> q11 = this.f651o;
            q11.g(str + TD0.a.Y0, fileDescriptor, printWriter, strArr);
            if (this.q != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.q);
                b<D> bVar = this.q;
                bVar.a(str + TD0.a.Y0, printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(u().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(h());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.m);
            sb.append(" : ");
            PV.a(this.f651o, sb);
            sb.append("}}");
            return sb.toString();
        }

        public Q11<D> u() {
            return this.f651o;
        }

        public boolean v() {
            b<D> bVar;
            if (!h() || (bVar = this.q) == null || bVar.c()) {
                return false;
            }
            return true;
        }

        public void w() {
            KZ0 kz0 = this.p;
            b<D> bVar = this.q;
            if (kz0 != null && bVar != null) {
                super.p(bVar);
                k(kz0, bVar);
            }
        }

        public Q11<D> x(KZ0 kz0, V11.a<D> aVar) {
            b<D> bVar = new b<>(this.f651o, aVar);
            k(kz0, bVar);
            b<D> bVar2 = this.q;
            if (bVar2 != null) {
                p(bVar2);
            }
            this.p = kz0;
            this.q = bVar;
            return this.f651o;
        }
    }

    /* loaded from: classes.dex */
    public static class b<D> implements InterfaceC3583Lt1<D> {
        public final Q11<D> a;
        public final V11.a<D> b;
        public boolean c = false;

        public b(Q11<D> q11, V11.a<D> aVar) {
            this.a = q11;
            this.b = aVar;
        }

        public void a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.c);
        }

        @Override // o.InterfaceC3583Lt1
        public void b(D d) {
            if (W11.d) {
                Log.v(W11.c, "  onLoadFinished in " + this.a + ": " + this.a.d(d));
            }
            this.b.c(this.a, d);
            this.c = true;
        }

        public boolean c() {
            return this.c;
        }

        public void d() {
            if (this.c) {
                if (W11.d) {
                    Log.v(W11.c, "  Resetting: " + this.a);
                }
                this.b.a(this.a);
            }
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends CH2 {
        public static final u.b f = new a();
        public C10986ya2<a> d = new C10986ya2<>();
        public boolean e = false;

        /* loaded from: classes.dex */
        public static class a implements u.b {
            @Override // androidx.lifecycle.u.b
            public <T extends CH2> T b(Class<T> cls) {
                return new c();
            }
        }

        public static c i(GH2 gh2) {
            return (c) new androidx.lifecycle.u(gh2, f).a(c.class);
        }

        @Override // o.CH2
        public void e() {
            super.e();
            int y = this.d.y();
            for (int i = 0; i < y; i++) {
                this.d.z(i).s(true);
            }
            this.d.c();
        }

        public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.d.y() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.d.y(); i++) {
                    a z = this.d.z(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.d.n(i));
                    printWriter.print(": ");
                    printWriter.println(z.toString());
                    z.t(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void h() {
            this.e = false;
        }

        public <D> a<D> j(int i) {
            return this.d.h(i);
        }

        public boolean k() {
            int y = this.d.y();
            for (int i = 0; i < y; i++) {
                if (this.d.z(i).v()) {
                    return true;
                }
            }
            return false;
        }

        public boolean l() {
            return this.e;
        }

        public void m() {
            int y = this.d.y();
            for (int i = 0; i < y; i++) {
                this.d.z(i).w();
            }
        }

        public void n(int i, a aVar) {
            this.d.o(i, aVar);
        }

        public void o(int i) {
            this.d.r(i);
        }

        public void p() {
            this.e = true;
        }
    }

    public W11(KZ0 kz0, GH2 gh2) {
        this.a = kz0;
        this.b = c.i(gh2);
    }

    @Override // o.V11
    public void a(int i) {
        if (!this.b.l()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (d) {
                    Log.v(c, "destroyLoader in " + this + " of " + i);
                }
                a j = this.b.j(i);
                if (j != null) {
                    j.s(true);
                    this.b.o(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // o.V11
    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.b.g(str, fileDescriptor, printWriter, strArr);
    }

    @Override // o.V11
    public <D> Q11<D> e(int i) {
        if (!this.b.l()) {
            a<D> j = this.b.j(i);
            if (j != null) {
                return j.u();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // o.V11
    public boolean f() {
        return this.b.k();
    }

    @Override // o.V11
    public <D> Q11<D> g(int i, Bundle bundle, V11.a<D> aVar) {
        if (!this.b.l()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                a<D> j = this.b.j(i);
                if (d) {
                    Log.v(c, "initLoader in " + this + ": args=" + bundle);
                }
                if (j == null) {
                    return j(i, bundle, aVar, null);
                }
                if (d) {
                    Log.v(c, "  Re-using existing loader " + j);
                }
                return j.x(this.a, aVar);
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @Override // o.V11
    public void h() {
        this.b.m();
    }

    @Override // o.V11
    public <D> Q11<D> i(int i, Bundle bundle, V11.a<D> aVar) {
        Q11<D> q11;
        if (!this.b.l()) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                if (d) {
                    Log.v(c, "restartLoader in " + this + ": args=" + bundle);
                }
                a<D> j = this.b.j(i);
                if (j != null) {
                    q11 = j.s(false);
                } else {
                    q11 = null;
                }
                return j(i, bundle, aVar, q11);
            }
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final <D> Q11<D> j(int i, Bundle bundle, V11.a<D> aVar, Q11<D> q11) {
        try {
            this.b.p();
            Q11<D> b2 = aVar.b(i, bundle);
            if (b2 != null) {
                if (b2.getClass().isMemberClass() && !Modifier.isStatic(b2.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2);
                }
                a aVar2 = new a(i, bundle, b2, q11);
                if (d) {
                    Log.v(c, "  Created new loader " + aVar2);
                }
                this.b.n(i, aVar2);
                this.b.h();
                return aVar2.x(this.a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.b.h();
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        PV.a(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
