package o;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.C6960i70;
import o.InterfaceC3628Mg0;
import o.InterfaceC7201j70;
import o.InterfaceC8921q70;
import o.M11;

@ES1(18)
@Deprecated
/* loaded from: classes2.dex */
public class JY implements InterfaceC7201j70 {
    public static final String E = "DefaultDrmSession";
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 60;
    @InterfaceC11300zs1
    public byte[] A;
    public byte[] B;
    @InterfaceC11300zs1
    public InterfaceC3628Mg0.b C;
    @InterfaceC11300zs1
    public InterfaceC3628Mg0.h D;
    @InterfaceC11300zs1
    public final List<C6960i70.b> f;
    public final InterfaceC3628Mg0 g;
    public final a h;
    public final b i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final HashMap<String, String> m;
    public final OP<InterfaceC8921q70.a> n;

    /* renamed from: o  reason: collision with root package name */
    public final M11 f503o;
    public final ND1 p;
    public final InterfaceC7090if1 q;
    public final UUID r;
    public final Looper s;
    public final e t;
    public int u;
    public int v;
    @InterfaceC11300zs1
    public HandlerThread w;
    @InterfaceC11300zs1
    public c x;
    @InterfaceC11300zs1
    public InterfaceC7280jR y;
    @InterfaceC11300zs1
    public InterfaceC7201j70.a z;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Exception exc, boolean z);

        void b(JY jy);

        void c();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a(JY jy, int i);

        void b(JY jy, int i);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class c extends Handler {
        @InterfaceC8710pF0("this")
        public boolean a;

        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, C7332jf1 c7332jf1) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.b) {
                return false;
            }
            int i = dVar.e + 1;
            dVar.e = i;
            if (i > JY.this.f503o.a(3)) {
                return false;
            }
            N11 n11 = new N11(dVar.a, c7332jf1.X, c7332jf1.Y, c7332jf1.Z, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, c7332jf1.Y0);
            C10519wf1 c10519wf1 = new C10519wf1(3);
            if (c7332jf1.getCause() instanceof IOException) {
                fVar = (IOException) c7332jf1.getCause();
            } else {
                fVar = new f(c7332jf1.getCause());
            }
            long d = JY.this.f503o.d(new M11.d(n11, c10519wf1, fVar, dVar.e));
            if (d == C10323vs.b) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), d);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void b(int i, Object obj, boolean z) {
            obtainMessage(i, new d(N11.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        bArr = JY.this.q.a(JY.this.r, (InterfaceC3628Mg0.b) dVar.d);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    bArr = JY.this.q.b(JY.this.r, (InterfaceC3628Mg0.h) dVar.d);
                }
            } catch (C7332jf1 e) {
                boolean a = a(message, e);
                bArr = e;
                if (a) {
                    return;
                }
            } catch (Exception e2) {
                I31.o(JY.E, "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                bArr = e2;
            }
            JY.this.f503o.c(dVar.a);
            synchronized (this) {
                try {
                    if (!this.a) {
                        JY.this.t.obtainMessage(message.what, Pair.create(dVar.d, bArr)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                JY.this.E(obj, obj2);
            } else if (i == 1) {
                JY.this.y(obj, obj2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends IOException {
        public f(@InterfaceC11300zs1 Throwable th) {
            super(th);
        }
    }

    public JY(UUID uuid, InterfaceC3628Mg0 interfaceC3628Mg0, a aVar, b bVar, @InterfaceC11300zs1 List<C6960i70.b> list, int i, boolean z, boolean z2, @InterfaceC11300zs1 byte[] bArr, HashMap<String, String> hashMap, InterfaceC7090if1 interfaceC7090if1, Looper looper, M11 m11, ND1 nd1) {
        if (i == 1 || i == 3) {
            C9542sf.g(bArr);
        }
        this.r = uuid;
        this.h = aVar;
        this.i = bVar;
        this.g = interfaceC3628Mg0;
        this.j = i;
        this.k = z;
        this.l = z2;
        if (bArr != null) {
            this.B = bArr;
            this.f = null;
        } else {
            this.f = Collections.unmodifiableList((List) C9542sf.g(list));
        }
        this.m = hashMap;
        this.q = interfaceC7090if1;
        this.n = new OP<>();
        this.f503o = m11;
        this.p = nd1;
        this.u = 2;
        this.s = looper;
        this.t = new e(looper);
    }

    public final void A() {
        if (this.j == 0 && this.u == 4) {
            TD2.o(this.A);
            t(false);
        }
    }

    public void B(int i) {
        if (i != 2) {
            return;
        }
        A();
    }

    public void C() {
        if (F()) {
            t(true);
        }
    }

    public void D(Exception exc, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 3;
        }
        x(exc, i);
    }

    public final void E(Object obj, Object obj2) {
        if (obj == this.D) {
            if (this.u == 2 || w()) {
                this.D = null;
                if (obj2 instanceof Exception) {
                    this.h.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.g.l((byte[]) obj2);
                    this.h.c();
                } catch (Exception e2) {
                    this.h.a(e2, true);
                }
            }
        }
    }

    @InterfaceC8800pd0(expression = {"sessionId"}, result = true)
    public final boolean F() {
        if (w()) {
            return true;
        }
        try {
            byte[] i = this.g.i();
            this.A = i;
            this.g.q(i, this.p);
            this.y = this.g.p(this.A);
            this.u = 3;
            s(new InterfaceC10686xL() { // from class: o.EY
                @Override // o.InterfaceC10686xL
                public final void accept(Object obj) {
                    ((InterfaceC8921q70.a) obj).k(r1);
                }
            });
            C9542sf.g(this.A);
            return true;
        } catch (NotProvisionedException unused) {
            this.h.b(this);
            return false;
        } catch (Exception e2) {
            x(e2, 1);
            return false;
        }
    }

    public final void G(byte[] bArr, int i, boolean z) {
        try {
            this.C = this.g.v(bArr, this.f, i, this.m);
            ((c) TD2.o(this.x)).b(1, C9542sf.g(this.C), z);
        } catch (Exception e2) {
            z(e2, true);
        }
    }

    public void H() {
        this.D = this.g.h();
        ((c) TD2.o(this.x)).b(0, C9542sf.g(this.D), true);
    }

    @HS1({"sessionId", "offlineLicenseKeySetId"})
    public final boolean I() {
        try {
            this.g.j(this.A, this.B);
            return true;
        } catch (Exception e2) {
            x(e2, 1);
            return false;
        }
    }

    public final void J() {
        if (Thread.currentThread() != this.s.getThread()) {
            I31.o(E, "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.s.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // o.InterfaceC7201j70
    public final UUID a() {
        J();
        return this.r;
    }

    @Override // o.InterfaceC7201j70
    public boolean b() {
        J();
        return this.k;
    }

    @Override // o.InterfaceC7201j70
    @InterfaceC11300zs1
    public byte[] c() {
        J();
        return this.B;
    }

    @Override // o.InterfaceC7201j70
    @InterfaceC11300zs1
    public final InterfaceC7280jR d() {
        J();
        return this.y;
    }

    @Override // o.InterfaceC7201j70
    public void f(@InterfaceC11300zs1 InterfaceC8921q70.a aVar) {
        J();
        boolean z = false;
        if (this.v < 0) {
            I31.d(E, "Session reference count less than zero: " + this.v);
            this.v = 0;
        }
        if (aVar != null) {
            this.n.d(aVar);
        }
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            if (this.u == 2) {
                z = true;
            }
            C9542sf.i(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.w = handlerThread;
            handlerThread.start();
            this.x = new c(this.w.getLooper());
            if (F()) {
                t(true);
            }
        } else if (aVar != null && w() && this.n.w4(aVar) == 1) {
            aVar.k(this.u);
        }
        this.i.b(this, this.v);
    }

    @Override // o.InterfaceC7201j70
    @InterfaceC11300zs1
    public Map<String, String> g() {
        J();
        byte[] bArr = this.A;
        if (bArr == null) {
            return null;
        }
        return this.g.d(bArr);
    }

    @Override // o.InterfaceC7201j70
    public final int getState() {
        J();
        return this.u;
    }

    @Override // o.InterfaceC7201j70
    public void h(@InterfaceC11300zs1 InterfaceC8921q70.a aVar) {
        J();
        int i = this.v;
        if (i <= 0) {
            I31.d(E, "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.v = i2;
        if (i2 == 0) {
            this.u = 0;
            ((e) TD2.o(this.t)).removeCallbacksAndMessages(null);
            ((c) TD2.o(this.x)).c();
            this.x = null;
            ((HandlerThread) TD2.o(this.w)).quit();
            this.w = null;
            this.y = null;
            this.z = null;
            this.C = null;
            this.D = null;
            byte[] bArr = this.A;
            if (bArr != null) {
                this.g.s(bArr);
                this.A = null;
            }
        }
        if (aVar != null) {
            this.n.e(aVar);
            if (this.n.w4(aVar) == 0) {
                aVar.m();
            }
        }
        this.i.a(this, this.v);
    }

    @Override // o.InterfaceC7201j70
    @InterfaceC11300zs1
    public final InterfaceC7201j70.a i() {
        J();
        if (this.u == 1) {
            return this.z;
        }
        return null;
    }

    @Override // o.InterfaceC7201j70
    public boolean j(String str) {
        J();
        return this.g.r((byte[]) C9542sf.k(this.A), str);
    }

    public final void s(InterfaceC10686xL<InterfaceC8921q70.a> interfaceC10686xL) {
        for (InterfaceC8921q70.a aVar : this.n.n()) {
            interfaceC10686xL.accept(aVar);
        }
    }

    @HS1({"sessionId"})
    public final void t(boolean z) {
        if (!this.l) {
            byte[] bArr = (byte[]) TD2.o(this.A);
            int i = this.j;
            if (i != 0 && i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C9542sf.g(this.B);
                        C9542sf.g(this.A);
                        G(this.B, 3, z);
                    }
                } else if (this.B == null || I()) {
                    G(bArr, 2, z);
                }
            } else if (this.B == null) {
                G(bArr, 1, z);
            } else if (this.u != 4 && !I()) {
            } else {
                long u = u();
                if (this.j == 0 && u <= 60) {
                    I31.b(E, "Offline license has expired or will expire soon. Remaining seconds: " + u);
                    G(bArr, 2, z);
                } else if (u <= 0) {
                    x(new QX0(), 2);
                } else {
                    this.u = 4;
                    s(new InterfaceC10686xL() { // from class: o.FY
                        @Override // o.InterfaceC10686xL
                        public final void accept(Object obj) {
                            ((InterfaceC8921q70.a) obj).j();
                        }
                    });
                }
            }
        }
    }

    public final long u() {
        if (!C10323vs.g2.equals(this.r)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C9542sf.g(SK2.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean v(byte[] bArr) {
        J();
        return Arrays.equals(this.A, bArr);
    }

    @InterfaceC8800pd0(expression = {"sessionId"}, result = true)
    public final boolean w() {
        int i = this.u;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final void x(final Exception exc, int i) {
        this.z = new InterfaceC7201j70.a(exc, C9899u70.a(exc, i));
        I31.e(E, "DRM session error", exc);
        s(new InterfaceC10686xL() { // from class: o.GY
            @Override // o.InterfaceC10686xL
            public final void accept(Object obj) {
                ((InterfaceC8921q70.a) obj).l(exc);
            }
        });
        if (this.u != 4) {
            this.u = 1;
        }
    }

    public final void y(Object obj, Object obj2) {
        if (obj == this.C && w()) {
            this.C = null;
            if (obj2 instanceof Exception) {
                z((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.j == 3) {
                    this.g.u((byte[]) TD2.o(this.B), bArr);
                    s(new InterfaceC10686xL() { // from class: o.HY
                        @Override // o.InterfaceC10686xL
                        public final void accept(Object obj3) {
                            ((InterfaceC8921q70.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] u = this.g.u(this.A, bArr);
                int i = this.j;
                if ((i == 2 || (i == 0 && this.B != null)) && u != null && u.length != 0) {
                    this.B = u;
                }
                this.u = 4;
                s(new InterfaceC10686xL() { // from class: o.IY
                    @Override // o.InterfaceC10686xL
                    public final void accept(Object obj3) {
                        ((InterfaceC8921q70.a) obj3).h();
                    }
                });
            } catch (Exception e2) {
                z(e2, true);
            }
        }
    }

    public final void z(Exception exc, boolean z) {
        int i;
        if (exc instanceof NotProvisionedException) {
            this.h.b(this);
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        x(exc, i);
    }
}
