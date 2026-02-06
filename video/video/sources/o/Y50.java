package o;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import o.BS1;
import o.C6161et;
import o.FU;
import o.InterfaceC8187n60;

@Deprecated
/* loaded from: classes2.dex */
public final class Y50 {
    public static final int A = 4;
    public static final int B = 5;
    public static final int C = 6;
    public static final int D = 7;
    public static final int E = 8;
    public static final int F = 9;
    public static final int G = 10;
    public static final int H = 11;
    public static final int I = 12;
    public static final String J = "DownloadManager";
    public static final int q = 3;
    public static final int r = 5;
    public static final AS1 s = new AS1(1);
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 0;
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = 3;
    public final Context a;
    public final LN2 b;
    public final Handler c;
    public final c d;
    public final BS1.c e;
    public final CopyOnWriteArraySet<d> f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public List<G50> f667o;
    public BS1 p;

    /* loaded from: classes2.dex */
    public static final class b {
        public final G50 a;
        public final boolean b;
        public final List<G50> c;
        @InterfaceC11300zs1
        public final Exception d;

        public b(G50 g50, boolean z, List<G50> list, @InterfaceC11300zs1 Exception exc) {
            this.a = g50;
            this.b = z;
            this.c = list;
            this.d = exc;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends Handler {
        public static final int n = 5000;
        public boolean a;
        public final HandlerThread b;
        public final LN2 c;
        public final InterfaceC8430o60 d;
        public final Handler e;
        public final ArrayList<G50> f;
        public final HashMap<String, e> g;
        public int h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public boolean m;

        public c(HandlerThread handlerThread, LN2 ln2, InterfaceC8430o60 interfaceC8430o60, Handler handler, int i, int i2, boolean z) {
            super(handlerThread.getLooper());
            this.b = handlerThread;
            this.c = ln2;
            this.d = interfaceC8430o60;
            this.e = handler;
            this.j = i;
            this.k = i2;
            this.i = z;
            this.f = new ArrayList<>();
            this.g = new HashMap<>();
        }

        public static int d(G50 g50, G50 g502) {
            return TD2.u(g50.c, g502.c);
        }

        public static G50 e(G50 g50, int i, int i2) {
            return new G50(g50.a, i, g50.c, System.currentTimeMillis(), g50.e, i2, 0, g50.h);
        }

        public final void A(@InterfaceC11300zs1 e eVar) {
            if (eVar != null) {
                C9542sf.i(!eVar.Y0);
                eVar.f(false);
            }
        }

        public final void B() {
            int i = 0;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                G50 g50 = this.f.get(i2);
                e eVar = this.g.get(g50.a.X);
                int i3 = g50.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 5 && i3 != 7) {
                                throw new IllegalStateException();
                            }
                            z(eVar, g50);
                        } else {
                            C9542sf.g(eVar);
                            x(eVar, g50, i);
                        }
                    } else {
                        A(eVar);
                    }
                } else {
                    eVar = y(eVar, g50);
                }
                if (eVar != null && !eVar.Y0) {
                    i++;
                }
            }
        }

        public final void C() {
            for (int i = 0; i < this.f.size(); i++) {
                G50 g50 = this.f.get(i);
                if (g50.b == 2) {
                    try {
                        this.c.h(g50);
                    } catch (IOException e) {
                        I31.e(Y50.J, "Failed to update index.", e);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        public final void b(C5972e60 c5972e60, int i) {
            int i2 = 1;
            G50 f = f(c5972e60.X, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (f != null) {
                m(Y50.r(f, c5972e60, i, currentTimeMillis));
            } else {
                if (i == 0) {
                    i2 = 0;
                }
                m(new G50(c5972e60, i2, currentTimeMillis, currentTimeMillis, -1L, i, 0));
            }
            B();
        }

        public final boolean c() {
            if (!this.i && this.h == 0) {
                return true;
            }
            return false;
        }

        @InterfaceC11300zs1
        public final G50 f(String str, boolean z) {
            int g = g(str);
            if (g != -1) {
                return this.f.get(g);
            }
            if (z) {
                try {
                    return this.c.g(str);
                } catch (IOException e) {
                    I31.e(Y50.J, "Failed to load download: " + str, e);
                    return null;
                }
            }
            return null;
        }

        public final int g(String str) {
            for (int i = 0; i < this.f.size(); i++) {
                if (this.f.get(i).a.X.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public final void h(int i) {
            this.h = i;
            I50 i50 = null;
            try {
                try {
                    this.c.f();
                    i50 = this.c.d(0, 1, 2, 5, 7);
                    while (i50.moveToNext()) {
                        this.f.add(i50.v2());
                    }
                } catch (IOException e) {
                    I31.e(Y50.J, "Failed to load index.", e);
                    this.f.clear();
                }
                this.e.obtainMessage(0, new ArrayList(this.f)).sendToTarget();
                B();
            } finally {
                TD2.t(i50);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z = false;
            int i = 0;
            switch (message.what) {
                case 0:
                    h(message.arg1);
                    i = 1;
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    r(z);
                    i = 1;
                    break;
                case 2:
                    u(message.arg1);
                    i = 1;
                    break;
                case 3:
                    v((String) message.obj, message.arg1);
                    i = 1;
                    break;
                case 4:
                    s(message.arg1);
                    i = 1;
                    break;
                case 5:
                    t(message.arg1);
                    i = 1;
                    break;
                case 6:
                    b((C5972e60) message.obj, message.arg1);
                    i = 1;
                    break;
                case 7:
                    q((String) message.obj);
                    i = 1;
                    break;
                case 8:
                    p();
                    i = 1;
                    break;
                case 9:
                    l((e) message.obj);
                    break;
                case 10:
                    i((e) message.obj, TD2.X1(message.arg1, message.arg2));
                    return;
                case 11:
                    C();
                    return;
                case 12:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
            this.e.obtainMessage(1, i, this.g.size()).sendToTarget();
        }

        public final void i(e eVar, long j) {
            G50 g50 = (G50) C9542sf.g(f(eVar.X.X, false));
            if (j != g50.e && j != -1) {
                m(new G50(g50.a, g50.b, g50.c, System.currentTimeMillis(), j, g50.f, g50.g, g50.h));
            }
        }

        public final void j(G50 g50, @InterfaceC11300zs1 Exception exc) {
            int i;
            int i2;
            C5972e60 c5972e60 = g50.a;
            if (exc == null) {
                i = 3;
            } else {
                i = 4;
            }
            long j = g50.c;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = g50.e;
            int i3 = g50.f;
            if (exc == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            G50 g502 = new G50(c5972e60, i, j, currentTimeMillis, j2, i3, i2, g50.h);
            this.f.remove(g(g502.a.X));
            try {
                this.c.h(g502);
            } catch (IOException e) {
                I31.e(Y50.J, "Failed to update index.", e);
            }
            this.e.obtainMessage(2, new b(g502, false, new ArrayList(this.f), exc)).sendToTarget();
        }

        public final void k(G50 g50) {
            int i = 1;
            if (g50.b == 7) {
                int i2 = g50.f;
                if (i2 == 0) {
                    i = 0;
                }
                n(g50, i, i2);
                B();
                return;
            }
            this.f.remove(g(g50.a.X));
            try {
                this.c.b(g50.a.X);
            } catch (IOException unused) {
                I31.d(Y50.J, "Failed to remove from database");
            }
            this.e.obtainMessage(2, new b(g50, true, new ArrayList(this.f), null)).sendToTarget();
        }

        public final void l(e eVar) {
            String str = eVar.X.X;
            this.g.remove(str);
            boolean z = eVar.Y0;
            if (z) {
                this.m = false;
            } else {
                int i = this.l - 1;
                this.l = i;
                if (i == 0) {
                    removeMessages(11);
                }
            }
            if (!eVar.b1) {
                Exception exc = eVar.c1;
                if (exc != null) {
                    I31.e(Y50.J, "Task failed: " + eVar.X + C6566gU0.h + z, exc);
                }
                G50 g50 = (G50) C9542sf.g(f(str, false));
                int i2 = g50.b;
                if (i2 != 2) {
                    if (i2 != 5 && i2 != 7) {
                        throw new IllegalStateException();
                    }
                    C9542sf.i(z);
                    k(g50);
                } else {
                    C9542sf.i(!z);
                    j(g50, exc);
                }
                B();
                return;
            }
            B();
        }

        public final G50 m(G50 g50) {
            boolean z;
            int i = g50.b;
            boolean z2 = true;
            if (i != 3 && i != 4) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            int g = g(g50.a.X);
            if (g == -1) {
                this.f.add(g50);
                Collections.sort(this.f, new Z50());
            } else {
                if (g50.c == this.f.get(g).c) {
                    z2 = false;
                }
                this.f.set(g, g50);
                if (z2) {
                    Collections.sort(this.f, new Z50());
                }
            }
            try {
                this.c.h(g50);
            } catch (IOException e) {
                I31.e(Y50.J, "Failed to update index.", e);
            }
            this.e.obtainMessage(2, new b(g50, false, new ArrayList(this.f), null)).sendToTarget();
            return g50;
        }

        public final G50 n(G50 g50, int i, int i2) {
            boolean z;
            if (i != 3 && i != 4) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            return m(e(g50, i, i2));
        }

        public final void o() {
            for (e eVar : this.g.values()) {
                eVar.f(true);
            }
            try {
                this.c.f();
            } catch (IOException e) {
                I31.e(Y50.J, "Failed to update index.", e);
            }
            this.f.clear();
            this.b.quit();
            synchronized (this) {
                this.a = true;
                notifyAll();
            }
        }

        public final void p() {
            ArrayList arrayList = new ArrayList();
            try {
                I50 d = this.c.d(3, 4);
                while (d.moveToNext()) {
                    arrayList.add(d.v2());
                }
                d.close();
            } catch (IOException unused) {
                I31.d(Y50.J, "Failed to load downloads.");
            }
            for (int i = 0; i < this.f.size(); i++) {
                ArrayList<G50> arrayList2 = this.f;
                arrayList2.set(i, e(arrayList2.get(i), 5, 0));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.f.add(e((G50) arrayList.get(i2), 5, 0));
            }
            Collections.sort(this.f, new Z50());
            try {
                this.c.e();
            } catch (IOException e) {
                I31.e(Y50.J, "Failed to update index.", e);
            }
            ArrayList arrayList3 = new ArrayList(this.f);
            for (int i3 = 0; i3 < this.f.size(); i3++) {
                this.e.obtainMessage(2, new b(this.f.get(i3), false, arrayList3, null)).sendToTarget();
            }
            B();
        }

        public final void q(String str) {
            G50 f = f(str, true);
            if (f == null) {
                I31.d(Y50.J, "Failed to remove nonexistent download: " + str);
                return;
            }
            n(f, 5, 0);
            B();
        }

        public final void r(boolean z) {
            this.i = z;
            B();
        }

        public final void s(int i) {
            this.j = i;
            B();
        }

        public final void t(int i) {
            this.k = i;
        }

        public final void u(int i) {
            this.h = i;
            B();
        }

        public final void v(@InterfaceC11300zs1 String str, int i) {
            if (str == null) {
                for (int i2 = 0; i2 < this.f.size(); i2++) {
                    w(this.f.get(i2), i);
                }
                try {
                    this.c.c(i);
                } catch (IOException e) {
                    I31.e(Y50.J, "Failed to set manual stop reason", e);
                }
            } else {
                G50 f = f(str, false);
                if (f != null) {
                    w(f, i);
                } else {
                    try {
                        this.c.a(str, i);
                    } catch (IOException e2) {
                        I31.e(Y50.J, "Failed to set manual stop reason: " + str, e2);
                    }
                }
            }
            B();
        }

        public final void w(G50 g50, int i) {
            if (i == 0) {
                if (g50.b == 1) {
                    n(g50, 0, 0);
                }
            } else if (i != g50.f) {
                int i2 = g50.b;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                m(new G50(g50.a, i2, g50.c, System.currentTimeMillis(), g50.e, i, 0, g50.h));
            }
        }

        public final void x(e eVar, G50 g50, int i) {
            C9542sf.i(!eVar.Y0);
            if (c() && i < this.j) {
                return;
            }
            n(g50, 0, 0);
            eVar.f(false);
        }

        @InterfaceC11300zs1
        @OB
        public final e y(@InterfaceC11300zs1 e eVar, G50 g50) {
            if (eVar != null) {
                C9542sf.i(!eVar.Y0);
                eVar.f(false);
                return eVar;
            } else if (c() && this.l < this.j) {
                G50 n2 = n(g50, 2, 0);
                e eVar2 = new e(n2.a, this.d.a(n2.a), n2.h, false, this.k, this);
                this.g.put(n2.a.X, eVar2);
                int i = this.l;
                this.l = i + 1;
                if (i == 0) {
                    sendEmptyMessageDelayed(11, 5000L);
                }
                eVar2.start();
                return eVar2;
            } else {
                return null;
            }
        }

        public final void z(@InterfaceC11300zs1 e eVar, G50 g50) {
            if (eVar != null) {
                if (!eVar.Y0) {
                    eVar.f(false);
                }
            } else if (this.m) {
            } else {
                e eVar2 = new e(g50.a, this.d.a(g50.a), g50.h, true, this.k, this);
                this.g.put(g50.a.X, eVar2);
                this.m = true;
                eVar2.start();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends Thread implements InterfaceC8187n60.a {
        public final C5972e60 X;
        public final InterfaceC8187n60 Y;
        public final boolean Y0;
        public final C5487c60 Z;
        public final int Z0;
        @InterfaceC11300zs1
        public volatile c a1;
        public volatile boolean b1;
        @InterfaceC11300zs1
        public Exception c1;
        public long d1;

        public static int g(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }

        @Override // o.InterfaceC8187n60.a
        public void a(long j, long j2, float f) {
            this.Z.a = j2;
            this.Z.b = f;
            if (j != this.d1) {
                this.d1 = j;
                c cVar = this.a1;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        public void f(boolean z) {
            if (z) {
                this.a1 = null;
            }
            if (!this.b1) {
                this.b1 = true;
                this.Y.cancel();
                interrupt();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.Y0) {
                    this.Y.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.b1) {
                        try {
                            this.Y.a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.b1) {
                                long j2 = this.Z.a;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                i++;
                                if (i <= this.Z0) {
                                    Thread.sleep(g(i));
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.c1 = e2;
            }
            c cVar = this.a1;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }

        public e(C5972e60 c5972e60, InterfaceC8187n60 interfaceC8187n60, C5487c60 c5487c60, boolean z, int i, c cVar) {
            this.X = c5972e60;
            this.Y = interfaceC8187n60;
            this.Z = c5487c60;
            this.Y0 = z;
            this.Z0 = i;
            this.a1 = cVar;
            this.d1 = -1L;
        }
    }

    public Y50(Context context, InterfaceC5100aV interfaceC5100aV, InterfaceC4844Ys interfaceC4844Ys, FU.a aVar, Executor executor) {
        this(context, new CY(interfaceC5100aV), new DY(new C6161et.d().j(interfaceC4844Ys).p(aVar), executor));
    }

    public static G50 r(G50 g50, C5972e60 c5972e60, int i, long j) {
        long j2;
        int i2 = g50.b;
        if (i2 != 5 && !g50.c()) {
            j2 = g50.c;
        } else {
            j2 = j;
        }
        int i3 = 7;
        if (i2 != 5 && i2 != 7) {
            i3 = i != 0 ? 1 : 0;
        }
        return new G50(g50.a.c(c5972e60), i3, j2, j, -1L, i, 0);
    }

    public void A(String str) {
        this.g++;
        this.d.obtainMessage(7, str).sendToTarget();
    }

    public void B(d dVar) {
        this.f.remove(dVar);
    }

    public void C() {
        D(false);
    }

    public final void D(boolean z2) {
        if (this.j != z2) {
            this.j = z2;
            this.g++;
            this.d.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
            boolean I2 = I();
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().g(this, z2);
            }
            if (I2) {
                s();
            }
        }
    }

    public void E(@BR0(from = 1) int i) {
        boolean z2;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        if (this.k == i) {
            return;
        }
        this.k = i;
        this.g++;
        this.d.obtainMessage(4, i, 0).sendToTarget();
    }

    public void F(int i) {
        boolean z2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        if (this.l == i) {
            return;
        }
        this.l = i;
        this.g++;
        this.d.obtainMessage(5, i, 0).sendToTarget();
    }

    public void G(AS1 as1) {
        if (as1.equals(this.p.f())) {
            return;
        }
        this.p.j();
        BS1 bs1 = new BS1(this.a, this.e, as1);
        this.p = bs1;
        w(this.p, bs1.i());
    }

    public void H(@InterfaceC11300zs1 String str, int i) {
        this.g++;
        this.d.obtainMessage(3, i, 0, str).sendToTarget();
    }

    public final boolean I() {
        boolean z2;
        boolean z3 = true;
        if (!this.j && this.m != 0) {
            for (int i = 0; i < this.f667o.size(); i++) {
                if (this.f667o.get(i).b == 0) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (this.n == z2) {
            z3 = false;
        }
        this.n = z2;
        return z3;
    }

    public void c(C5972e60 c5972e60) {
        d(c5972e60, 0);
    }

    public void d(C5972e60 c5972e60, int i) {
        this.g++;
        this.d.obtainMessage(6, i, 0, c5972e60).sendToTarget();
    }

    public void e(d dVar) {
        C9542sf.g(dVar);
        this.f.add(dVar);
    }

    public Looper f() {
        return this.c.getLooper();
    }

    public List<G50> g() {
        return this.f667o;
    }

    public V50 h() {
        return this.b;
    }

    public boolean i() {
        return this.j;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        return this.l;
    }

    public int l() {
        return this.m;
    }

    public AS1 m() {
        return this.p.f();
    }

    public final boolean n(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    t((b) message.obj);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                v(message.arg1, message.arg2);
            }
        } else {
            u((List) message.obj);
        }
        return true;
    }

    public boolean o() {
        if (this.h == 0 && this.g == 0) {
            return true;
        }
        return false;
    }

    public boolean p() {
        return this.i;
    }

    public boolean q() {
        return this.n;
    }

    public final void s() {
        Iterator<d> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().c(this, this.n);
        }
    }

    public final void t(b bVar) {
        this.f667o = Collections.unmodifiableList(bVar.c);
        G50 g50 = bVar.a;
        boolean I2 = I();
        if (bVar.b) {
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().e(this, g50);
            }
        } else {
            Iterator<d> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, g50, bVar.d);
            }
        }
        if (I2) {
            s();
        }
    }

    public final void u(List<G50> list) {
        this.i = true;
        this.f667o = Collections.unmodifiableList(list);
        boolean I2 = I();
        Iterator<d> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        if (I2) {
            s();
        }
    }

    public final void v(int i, int i2) {
        this.g -= i;
        this.h = i2;
        if (o()) {
            Iterator<d> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    public final void w(BS1 bs1, int i) {
        AS1 f = bs1.f();
        if (this.m != i) {
            this.m = i;
            this.g++;
            this.d.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean I2 = I();
        Iterator<d> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().f(this, f, i);
        }
        if (I2) {
            s();
        }
    }

    public void x() {
        D(true);
    }

    public void y() {
        synchronized (this.d) {
            try {
                c cVar = this.d;
                if (cVar.a) {
                    return;
                }
                cVar.sendEmptyMessage(12);
                boolean z2 = false;
                while (true) {
                    c cVar2 = this.d;
                    if (cVar2.a) {
                        break;
                    }
                    try {
                        cVar2.wait();
                    } catch (InterruptedException unused) {
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                this.c.removeCallbacksAndMessages(null);
                this.p.j();
                this.f667o = Collections.EMPTY_LIST;
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = 0;
                this.n = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void z() {
        this.g++;
        this.d.obtainMessage(8).sendToTarget();
    }

    public Y50(Context context, LN2 ln2, InterfaceC8430o60 interfaceC8430o60) {
        this.a = context.getApplicationContext();
        this.b = ln2;
        this.k = 3;
        this.l = 5;
        this.j = true;
        this.f667o = Collections.EMPTY_LIST;
        this.f = new CopyOnWriteArraySet<>();
        Handler F2 = TD2.F(new Handler.Callback() { // from class: o.W50
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean n;
                n = Y50.this.n(message);
                return n;
            }
        });
        this.c = F2;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, ln2, interfaceC8430o60, F2, this.k, this.l, this.j);
        this.d = cVar;
        BS1.c cVar2 = new BS1.c() { // from class: o.X50
            @Override // o.BS1.c
            public final void a(BS1 bs1, int i) {
                Y50.this.w(bs1, i);
            }
        };
        this.e = cVar2;
        BS1 bs1 = new BS1(context, cVar2, s);
        this.p = bs1;
        int i = bs1.i();
        this.m = i;
        this.g = 1;
        cVar.obtainMessage(0, i, 0).sendToTarget();
    }

    /* loaded from: classes2.dex */
    public interface d {
        default void b(Y50 y50) {
        }

        default void d(Y50 y50) {
        }

        default void c(Y50 y50, boolean z) {
        }

        default void e(Y50 y50, G50 g50) {
        }

        default void g(Y50 y50, boolean z) {
        }

        default void a(Y50 y50, G50 g50, @InterfaceC11300zs1 Exception exc) {
        }

        default void f(Y50 y50, AS1 as1, int i) {
        }
    }
}
