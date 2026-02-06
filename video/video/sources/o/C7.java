package o;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.AbstractC7373jp2;
import o.C7;
import o.C8322nf1;
import o.InterfaceC11116z7;
import o.InterfaceC7583kh1;
import o.J6;
import o.J81;

@Deprecated
/* loaded from: classes2.dex */
public final class C7 extends TI<InterfaceC7583kh1.b> {
    public static final InterfaceC7583kh1.b s1 = new InterfaceC7583kh1.b(new Object());
    public final InterfaceC7583kh1 f1;
    @InterfaceC11300zs1
    public final C8322nf1.f g1;
    public final InterfaceC7583kh1.a h1;
    public final InterfaceC11116z7 i1;
    public final InterfaceC7929m7 j1;
    public final OU k1;
    public final Object l1;
    @InterfaceC11300zs1
    public d o1;
    @InterfaceC11300zs1
    public AbstractC7373jp2 p1;
    @InterfaceC11300zs1
    public J6 q1;
    public final Handler m1 = new Handler(Looper.getMainLooper());
    public final AbstractC7373jp2.b n1 = new AbstractC7373jp2.b();
    public b[][] r1 = new b[0];

    /* loaded from: classes2.dex */
    public static final class a extends IOException {
        public static final int Y = 0;
        public static final int Y0 = 2;
        public static final int Z = 1;
        public static final int Z0 = 3;
        public final int X;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: o.C7$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public @interface InterfaceC0166a {
        }

        public a(int i, Exception exc) {
            super(exc);
            this.X = i;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        public static a b(Exception exc, int i) {
            return new a(1, new IOException("Failed to load ad group " + i, exc));
        }

        public static a c(Exception exc) {
            return new a(2, exc);
        }

        public static a d(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }

        public RuntimeException e() {
            boolean z;
            if (this.X == 3) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            return (RuntimeException) C9542sf.g(getCause());
        }
    }

    /* loaded from: classes2.dex */
    public final class b {
        public final InterfaceC7583kh1.b a;
        public final List<J81> b = new ArrayList();
        public Uri c;
        public InterfaceC7583kh1 d;
        public AbstractC7373jp2 e;

        public b(InterfaceC7583kh1.b bVar) {
            this.a = bVar;
        }

        public InterfaceC4410Ug1 a(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
            J81 j81 = new J81(bVar, interfaceC10877y8, j);
            this.b.add(j81);
            InterfaceC7583kh1 interfaceC7583kh1 = this.d;
            if (interfaceC7583kh1 != null) {
                j81.y(interfaceC7583kh1);
                j81.z(new c((Uri) C9542sf.g(this.c)));
            }
            AbstractC7373jp2 abstractC7373jp2 = this.e;
            if (abstractC7373jp2 != null) {
                j81.b(new InterfaceC7583kh1.b(abstractC7373jp2.t(0), bVar.d));
            }
            return j81;
        }

        public long b() {
            AbstractC7373jp2 abstractC7373jp2 = this.e;
            if (abstractC7373jp2 == null) {
                return C10323vs.b;
            }
            return abstractC7373jp2.k(0, C7.this.n1).p();
        }

        public void c(AbstractC7373jp2 abstractC7373jp2) {
            boolean z = true;
            if (abstractC7373jp2.n() != 1) {
                z = false;
            }
            C9542sf.a(z);
            if (this.e == null) {
                Object t = abstractC7373jp2.t(0);
                for (int i = 0; i < this.b.size(); i++) {
                    J81 j81 = this.b.get(i);
                    j81.b(new InterfaceC7583kh1.b(t, j81.X.d));
                }
            }
            this.e = abstractC7373jp2;
        }

        public boolean d() {
            if (this.d != null) {
                return true;
            }
            return false;
        }

        public void e(InterfaceC7583kh1 interfaceC7583kh1, Uri uri) {
            this.d = interfaceC7583kh1;
            this.c = uri;
            for (int i = 0; i < this.b.size(); i++) {
                J81 j81 = this.b.get(i);
                j81.y(interfaceC7583kh1);
                j81.z(new c(uri));
            }
            C7.this.A0(this.a, interfaceC7583kh1);
        }

        public boolean f() {
            return this.b.isEmpty();
        }

        public void g() {
            if (d()) {
                C7.this.B0(this.a);
            }
        }

        public void h(J81 j81) {
            this.b.remove(j81);
            j81.x();
        }
    }

    /* loaded from: classes2.dex */
    public final class c implements J81.a {
        public final Uri a;

        public c(Uri uri) {
            this.a = uri;
        }

        @Override // o.J81.a
        public void a(final InterfaceC7583kh1.b bVar, final IOException iOException) {
            C7.this.b0(bVar).q(new N11(N11.a(), new OU(this.a), SystemClock.elapsedRealtime()), 6, a.a(iOException), true);
            C7.this.m1.post(new Runnable() { // from class: o.D7
                @Override // java.lang.Runnable
                public final void run() {
                    C7.this.i1.f(C7.this, r1.b, bVar.c, iOException);
                }
            });
        }

        @Override // o.J81.a
        public void b(final InterfaceC7583kh1.b bVar) {
            C7.this.m1.post(new Runnable() { // from class: o.E7
                @Override // java.lang.Runnable
                public final void run() {
                    C7.this.i1.b(C7.this, r1.b, bVar.c);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public final class d implements InterfaceC11116z7.a {
        public final Handler a = TD2.C();
        public volatile boolean b;

        public d() {
        }

        public static /* synthetic */ void d(d dVar, J6 j6) {
            if (!dVar.b) {
                C7.this.Q0(j6);
            }
        }

        @Override // o.InterfaceC11116z7.a
        public void b(final J6 j6) {
            if (this.b) {
                return;
            }
            this.a.post(new Runnable() { // from class: o.F7
                @Override // java.lang.Runnable
                public final void run() {
                    C7.d.d(C7.d.this, j6);
                }
            });
        }

        @Override // o.InterfaceC11116z7.a
        public void c(a aVar, OU ou) {
            if (this.b) {
                return;
            }
            C7.this.b0(null).q(new N11(N11.a(), ou, SystemClock.elapsedRealtime()), 6, aVar, true);
        }

        public void e() {
            this.b = true;
            this.a.removeCallbacksAndMessages(null);
        }
    }

    public C7(InterfaceC7583kh1 interfaceC7583kh1, OU ou, Object obj, InterfaceC7583kh1.a aVar, InterfaceC11116z7 interfaceC11116z7, InterfaceC7929m7 interfaceC7929m7) {
        this.f1 = interfaceC7583kh1;
        this.g1 = ((C8322nf1.h) C9542sf.g(interfaceC7583kh1.k().Y)).Z;
        this.h1 = aVar;
        this.i1 = interfaceC11116z7;
        this.j1 = interfaceC7929m7;
        this.k1 = ou;
        this.l1 = obj;
        interfaceC11116z7.c(aVar.b());
    }

    public final long[][] M0() {
        long b2;
        long[][] jArr = new long[this.r1.length];
        int i = 0;
        while (true) {
            b[][] bVarArr = this.r1;
            if (i < bVarArr.length) {
                jArr[i] = new long[bVarArr[i].length];
                int i2 = 0;
                while (true) {
                    b[] bVarArr2 = this.r1[i];
                    if (i2 < bVarArr2.length) {
                        b bVar = bVarArr2[i2];
                        long[] jArr2 = jArr[i];
                        if (bVar == null) {
                            b2 = C10323vs.b;
                        } else {
                            b2 = bVar.b();
                        }
                        jArr2[i2] = b2;
                        i2++;
                    }
                }
                i++;
            } else {
                return jArr;
            }
        }
    }

    @Override // o.TI
    /* renamed from: N0 */
    public InterfaceC7583kh1.b w0(InterfaceC7583kh1.b bVar, InterfaceC7583kh1.b bVar2) {
        if (bVar.c()) {
            return bVar;
        }
        return bVar2;
    }

    public final void O0() {
        Uri uri;
        J6 j6 = this.q1;
        if (j6 != null) {
            for (int i = 0; i < this.r1.length; i++) {
                int i2 = 0;
                while (true) {
                    b[] bVarArr = this.r1[i];
                    if (i2 < bVarArr.length) {
                        b bVar = bVarArr[i2];
                        J6.b g = j6.g(i);
                        if (bVar != null && !bVar.d()) {
                            Uri[] uriArr = g.Y0;
                            if (i2 < uriArr.length && (uri = uriArr[i2]) != null) {
                                C8322nf1.c L = new C8322nf1.c().L(uri);
                                C8322nf1.f fVar = this.g1;
                                if (fVar != null) {
                                    L.m(fVar);
                                }
                                bVar.e(this.h1.e(L.a()), uri);
                            }
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public final void P0() {
        AbstractC7373jp2 abstractC7373jp2 = this.p1;
        J6 j6 = this.q1;
        if (j6 != null && abstractC7373jp2 != null) {
            if (j6.Y == 0) {
                p0(abstractC7373jp2);
                return;
            }
            this.q1 = j6.o(M0());
            p0(new C9176r82(abstractC7373jp2, this.q1));
        }
    }

    public final void Q0(J6 j6) {
        J6 j62 = this.q1;
        boolean z = false;
        if (j62 == null) {
            b[][] bVarArr = new b[j6.Y];
            this.r1 = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            if (j6.Y == j62.Y) {
                z = true;
            }
            C9542sf.i(z);
        }
        this.q1 = j6;
        O0();
        P0();
    }

    @Override // o.TI
    /* renamed from: R0 */
    public void z0(InterfaceC7583kh1.b bVar, InterfaceC7583kh1 interfaceC7583kh1, AbstractC7373jp2 abstractC7373jp2) {
        if (bVar.c()) {
            int i = bVar.b;
            ((b) C9542sf.g(this.r1[i][bVar.c])).c(abstractC7373jp2);
        } else {
            boolean z = true;
            if (abstractC7373jp2.n() != 1) {
                z = false;
            }
            C9542sf.a(z);
            this.p1 = abstractC7373jp2;
        }
        P0();
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        if (((J6) C9542sf.g(this.q1)).Y > 0 && bVar.c()) {
            int i = bVar.b;
            int i2 = bVar.c;
            b[][] bVarArr = this.r1;
            b[] bVarArr2 = bVarArr[i];
            if (bVarArr2.length <= i2) {
                bVarArr[i] = (b[]) Arrays.copyOf(bVarArr2, i2 + 1);
            }
            b bVar2 = this.r1[i][i2];
            if (bVar2 == null) {
                bVar2 = new b(bVar);
                this.r1[i][i2] = bVar2;
                O0();
            }
            return bVar2.a(bVar, interfaceC10877y8, j);
        }
        J81 j81 = new J81(bVar, interfaceC10877y8, j);
        j81.y(this.f1);
        j81.b(bVar);
        return j81;
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.f1.k();
    }

    @Override // o.TI, o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        super.k0(interfaceC4261Sr2);
        final d dVar = new d();
        this.o1 = dVar;
        A0(s1, this.f1);
        this.m1.post(new Runnable() { // from class: o.A7
            @Override // java.lang.Runnable
            public final void run() {
                r0.i1.e(r0, r0.k1, r0.l1, C7.this.j1, dVar);
            }
        });
    }

    @Override // o.TI, o.AbstractC10541wl
    public void q0() {
        super.q0();
        final d dVar = (d) C9542sf.g(this.o1);
        this.o1 = null;
        dVar.e();
        this.p1 = null;
        this.q1 = null;
        this.r1 = new b[0];
        this.m1.post(new Runnable() { // from class: o.B7
            @Override // java.lang.Runnable
            public final void run() {
                r0.i1.a(C7.this, dVar);
            }
        });
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
        J81 j81 = (J81) interfaceC4410Ug1;
        InterfaceC7583kh1.b bVar = j81.X;
        if (bVar.c()) {
            b bVar2 = (b) C9542sf.g(this.r1[bVar.b][bVar.c]);
            bVar2.h(j81);
            if (bVar2.f()) {
                bVar2.g();
                this.r1[bVar.b][bVar.c] = null;
                return;
            }
            return;
        }
        j81.x();
    }
}
