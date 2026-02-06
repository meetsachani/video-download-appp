package o;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: o.d60  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5730d60 {
    public EnumC10183vH1 a;
    public Object b;
    public String c;
    public String d;
    public String e;
    public int f;
    public Future g;
    public long h;
    public long i;
    public int j;
    public int k;
    public String l;
    public InterfaceC6171ev1 m;
    public InterfaceC4562Vu1 n;

    /* renamed from: o  reason: collision with root package name */
    public InterfaceC7153iv1 f710o;
    public InterfaceC5686cv1 p;
    public InterfaceC3392Ju1 q;
    public int r;
    public HashMap<String, List<String>> s;
    public EnumC4101Rc2 t;

    /* renamed from: o.d60$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ C7327je0 X;

        public a(C7327je0 c7327je0) {
            this.X = c7327je0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5730d60.this.n != null) {
                C5730d60.this.n.c(this.X);
            }
            C5730d60.this.n();
        }
    }

    /* renamed from: o.d60$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5730d60.this.n != null) {
                C5730d60.this.n.a();
            }
            C5730d60.this.n();
        }
    }

    /* renamed from: o.d60$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5730d60.this.f710o != null) {
                C5730d60.this.f710o.a();
            }
        }
    }

    /* renamed from: o.d60$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5730d60.this.p != null) {
                C5730d60.this.p.onPause();
            }
        }
    }

    /* renamed from: o.d60$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C5730d60.this.q != null) {
                C5730d60.this.q.onCancel();
            }
        }
    }

    public C5730d60(C6215f60 c6215f60) {
        this.c = c6215f60.a;
        this.d = c6215f60.b;
        this.e = c6215f60.c;
        this.s = c6215f60.i;
        this.a = c6215f60.d;
        this.b = c6215f60.e;
        int i = c6215f60.f;
        this.j = i == 0 ? z() : i;
        int i2 = c6215f60.g;
        this.k = i2 == 0 ? p() : i2;
        this.l = c6215f60.h;
    }

    public int A() {
        return this.f;
    }

    public EnumC4101Rc2 B() {
        return this.t;
    }

    public Object C() {
        return this.b;
    }

    public long D() {
        return this.i;
    }

    public String E() {
        return this.c;
    }

    public String F() {
        if (this.l == null) {
            this.l = BI.d().f();
        }
        return this.l;
    }

    public void G(int i) {
        this.k = i;
    }

    public void H(String str) {
        this.d = str;
    }

    public void I(int i) {
        this.r = i;
    }

    public void J(long j) {
        this.h = j;
    }

    public void K(String str) {
        this.e = str;
    }

    public void L(Future future) {
        this.g = future;
    }

    public C5730d60 M(InterfaceC3392Ju1 interfaceC3392Ju1) {
        this.q = interfaceC3392Ju1;
        return this;
    }

    public C5730d60 N(InterfaceC5686cv1 interfaceC5686cv1) {
        this.p = interfaceC5686cv1;
        return this;
    }

    public C5730d60 O(InterfaceC6171ev1 interfaceC6171ev1) {
        this.m = interfaceC6171ev1;
        return this;
    }

    public C5730d60 P(InterfaceC7153iv1 interfaceC7153iv1) {
        this.f710o = interfaceC7153iv1;
        return this;
    }

    public void Q(EnumC10183vH1 enumC10183vH1) {
        this.a = enumC10183vH1;
    }

    public void R(int i) {
        this.j = i;
    }

    public void S(int i) {
        this.f = i;
    }

    public void T(EnumC4101Rc2 enumC4101Rc2) {
        this.t = enumC4101Rc2;
    }

    public void U(Object obj) {
        this.b = obj;
    }

    public void V(long j) {
        this.i = j;
    }

    public void W(String str) {
        this.c = str;
    }

    public void X(String str) {
        this.l = str;
    }

    public int Y(InterfaceC4562Vu1 interfaceC4562Vu1) {
        this.n = interfaceC4562Vu1;
        this.r = C5279bE2.f(this.c, this.d, this.e);
        C6470g60.g().a(this);
        return this.r;
    }

    public void f() {
        this.t = EnumC4101Rc2.CANCELLED;
        Future future = this.g;
        if (future != null) {
            future.cancel(true);
        }
        g();
        C5279bE2.a(C5279bE2.e(this.d, this.e), this.r);
    }

    public final void g() {
        SP.b().a().b().execute(new e());
    }

    public void h(C7327je0 c7327je0) {
        if (this.t != EnumC4101Rc2.CANCELLED) {
            T(EnumC4101Rc2.FAILED);
            SP.b().a().b().execute(new a(c7327je0));
        }
    }

    public void i() {
        if (this.t != EnumC4101Rc2.CANCELLED) {
            SP.b().a().b().execute(new d());
        }
    }

    public void j() {
        if (this.t != EnumC4101Rc2.CANCELLED) {
            SP.b().a().b().execute(new c());
        }
    }

    public void k() {
        if (this.t != EnumC4101Rc2.CANCELLED) {
            T(EnumC4101Rc2.COMPLETED);
            SP.b().a().b().execute(new b());
        }
    }

    public final void l() {
        this.m = null;
        this.n = null;
        this.f710o = null;
        this.p = null;
        this.q = null;
    }

    public ET1 m() {
        this.r = C5279bE2.f(this.c, this.d, this.e);
        return new C5158ak2(this).a();
    }

    public final void n() {
        l();
        C6470g60.g().f(this);
    }

    public int o() {
        return this.k;
    }

    public final int p() {
        return BI.d().a();
    }

    public String q() {
        return this.d;
    }

    public int r() {
        return this.r;
    }

    public long s() {
        return this.h;
    }

    public String t() {
        return this.e;
    }

    public Future u() {
        return this.g;
    }

    public HashMap<String, List<String>> v() {
        return this.s;
    }

    public InterfaceC6171ev1 w() {
        return this.m;
    }

    public EnumC10183vH1 x() {
        return this.a;
    }

    public int y() {
        return this.j;
    }

    public final int z() {
        return BI.d().e();
    }
}
