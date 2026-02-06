package o;

import java.io.File;
import java.io.IOException;
import java.util.NavigableSet;
import java.util.Set;

@Deprecated
/* renamed from: o.Ys  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4844Ys {
    public static final long a = -1;

    /* renamed from: o.Ys$a */
    /* loaded from: classes2.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: o.Ys$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt);

        void d(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt, C8376nt c8376nt2);

        void e(InterfaceC4844Ys interfaceC4844Ys, C8376nt c8376nt);
    }

    long a();

    @InterfaceC10697xN2
    File b(String str, long j, long j2) throws a;

    void c(String str, b bVar);

    InterfaceC6278fM d(String str);

    long e(String str, long j, long j2);

    @InterfaceC11300zs1
    @InterfaceC10697xN2
    C8376nt f(String str, long j, long j2) throws a;

    @InterfaceC10697xN2
    void g();

    long h(String str, long j, long j2);

    Set<String> i();

    @InterfaceC10697xN2
    void j(C8376nt c8376nt);

    long k();

    void l(C8376nt c8376nt);

    @InterfaceC10697xN2
    void m(String str, C6533gM c6533gM) throws a;

    @InterfaceC10697xN2
    C8376nt n(String str, long j, long j2) throws InterruptedException, a;

    @InterfaceC10697xN2
    void o(File file, long j) throws a;

    @InterfaceC10697xN2
    void p(String str);

    boolean q(String str, long j, long j2);

    NavigableSet<C8376nt> r(String str, b bVar);

    NavigableSet<C8376nt> s(String str);
}
