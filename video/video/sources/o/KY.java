package o;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import o.C6960i70;
import o.InterfaceC3628Mg0;
import o.InterfaceC7201j70;
import o.InterfaceC8921q70;
import o.InterfaceC9170r70;
import o.JY;
import o.KY;

@ES1(18)
@Deprecated
/* loaded from: classes2.dex */
public class KY implements InterfaceC9170r70 {
    public static final String A = "PRCustomData";
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 3;
    public static final long G = 300000;
    public static final String H = "DefaultDrmSessionMgr";
    public final UUID c;
    public final InterfaceC3628Mg0.g d;
    public final InterfaceC7090if1 e;
    public final HashMap<String, String> f;
    public final boolean g;
    public final int[] h;
    public final boolean i;
    public final h j;
    public final M11 k;
    public final i l;
    public final long m;
    public final List<JY> n;

    /* renamed from: o  reason: collision with root package name */
    public final Set<g> f516o;
    public final Set<JY> p;
    public int q;
    @InterfaceC11300zs1
    public InterfaceC3628Mg0 r;
    @InterfaceC11300zs1
    public JY s;
    @InterfaceC11300zs1
    public JY t;
    public Looper u;
    public Handler v;
    public int w;
    @InterfaceC11300zs1
    public byte[] x;
    public ND1 y;
    @InterfaceC11300zs1
    public volatile d z;

    /* loaded from: classes2.dex */
    public static final class b {
        public boolean d;
        public boolean f;
        public final HashMap<String, String> a = new HashMap<>();
        public UUID b = C10323vs.g2;
        public InterfaceC3628Mg0.g c = C5988eA0.k;
        public M11 g = new C11223zZ();
        public int[] e = new int[0];
        public long h = 300000;

        public KY a(InterfaceC7090if1 interfaceC7090if1) {
            return new KY(this.b, this.c, interfaceC7090if1, this.a, this.d, this.e, this.f, this.g, this.h);
        }

        @InterfaceC6181ey
        public b b(@InterfaceC11300zs1 Map<String, String> map) {
            this.a.clear();
            if (map != null) {
                this.a.putAll(map);
            }
            return this;
        }

        @InterfaceC6181ey
        public b c(M11 m11) {
            this.g = (M11) C9542sf.g(m11);
            return this;
        }

        @InterfaceC6181ey
        public b d(boolean z) {
            this.d = z;
            return this;
        }

        @InterfaceC6181ey
        public b e(boolean z) {
            this.f = z;
            return this;
        }

        @InterfaceC6181ey
        public b f(long j) {
            boolean z;
            if (j <= 0 && j != C10323vs.b) {
                z = false;
            } else {
                z = true;
            }
            C9542sf.a(z);
            this.h = j;
            return this;
        }

        @InterfaceC6181ey
        public b g(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                C9542sf.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        @InterfaceC6181ey
        public b h(UUID uuid, InterfaceC3628Mg0.g gVar) {
            this.b = (UUID) C9542sf.g(uuid);
            this.c = (InterfaceC3628Mg0.g) C9542sf.g(gVar);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements InterfaceC3628Mg0.d {
        public c() {
        }

        @Override // o.InterfaceC3628Mg0.d
        public void a(InterfaceC3628Mg0 interfaceC3628Mg0, @InterfaceC11300zs1 byte[] bArr, int i, int i2, @InterfaceC11300zs1 byte[] bArr2) {
            ((d) C9542sf.g(KY.this.z)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (JY jy : KY.this.n) {
                    if (jy.v(bArr)) {
                        jy.B(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface f {
    }

    /* loaded from: classes2.dex */
    public class g implements InterfaceC9170r70.b {
        @InterfaceC11300zs1
        public final InterfaceC8921q70.a b;
        @InterfaceC11300zs1
        public InterfaceC7201j70 c;
        public boolean d;

        public g(@InterfaceC11300zs1 InterfaceC8921q70.a aVar) {
            this.b = aVar;
        }

        public static /* synthetic */ void b(g gVar, C10833xx0 c10833xx0) {
            if (KY.this.q != 0 && !gVar.d) {
                KY ky = KY.this;
                gVar.c = ky.u((Looper) C9542sf.g(ky.u), gVar.b, c10833xx0, false);
                KY.this.f516o.add(gVar);
            }
        }

        public static /* synthetic */ void c(g gVar) {
            if (gVar.d) {
                return;
            }
            InterfaceC7201j70 interfaceC7201j70 = gVar.c;
            if (interfaceC7201j70 != null) {
                interfaceC7201j70.h(gVar.b);
            }
            KY.this.f516o.remove(gVar);
            gVar.d = true;
        }

        public void d(final C10833xx0 c10833xx0) {
            ((Handler) C9542sf.g(KY.this.v)).post(new Runnable() { // from class: o.LY
                @Override // java.lang.Runnable
                public final void run() {
                    KY.g.b(KY.g.this, c10833xx0);
                }
            });
        }

        @Override // o.InterfaceC9170r70.b
        public void g() {
            TD2.u1((Handler) C9542sf.g(KY.this.v), new Runnable() { // from class: o.MY
                @Override // java.lang.Runnable
                public final void run() {
                    KY.g.c(KY.g.this);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public class h implements JY.a {
        public final Set<JY> a = new HashSet();
        @InterfaceC11300zs1
        public JY b;

        public h() {
        }

        @Override // o.JY.a
        public void a(Exception exc, boolean z) {
            this.b = null;
            AbstractC5317bO0 F = AbstractC5317bO0.F(this.a);
            this.a.clear();
            AbstractC6237fB2 it = F.iterator();
            while (it.hasNext()) {
                ((JY) it.next()).D(exc, z);
            }
        }

        @Override // o.JY.a
        public void b(JY jy) {
            this.a.add(jy);
            if (this.b != null) {
                return;
            }
            this.b = jy;
            jy.H();
        }

        @Override // o.JY.a
        public void c() {
            this.b = null;
            AbstractC5317bO0 F = AbstractC5317bO0.F(this.a);
            this.a.clear();
            AbstractC6237fB2 it = F.iterator();
            while (it.hasNext()) {
                ((JY) it.next()).C();
            }
        }

        public void d(JY jy) {
            this.a.remove(jy);
            if (this.b == jy) {
                this.b = null;
                if (!this.a.isEmpty()) {
                    JY next = this.a.iterator().next();
                    this.b = next;
                    next.H();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class i implements JY.b {
        public i() {
        }

        @Override // o.JY.b
        public void a(final JY jy, int i) {
            if (i == 1 && KY.this.q > 0 && KY.this.m != C10323vs.b) {
                KY.this.p.add(jy);
                ((Handler) C9542sf.g(KY.this.v)).postAtTime(new Runnable() { // from class: o.NY
                    @Override // java.lang.Runnable
                    public final void run() {
                        JY.this.h(null);
                    }
                }, jy, SystemClock.uptimeMillis() + KY.this.m);
            } else if (i == 0) {
                KY.this.n.remove(jy);
                if (KY.this.s == jy) {
                    KY.this.s = null;
                }
                if (KY.this.t == jy) {
                    KY.this.t = null;
                }
                KY.this.j.d(jy);
                if (KY.this.m != C10323vs.b) {
                    ((Handler) C9542sf.g(KY.this.v)).removeCallbacksAndMessages(jy);
                    KY.this.p.remove(jy);
                }
            }
            KY.this.D();
        }

        @Override // o.JY.b
        public void b(JY jy, int i) {
            if (KY.this.m != C10323vs.b) {
                KY.this.p.remove(jy);
                ((Handler) C9542sf.g(KY.this.v)).removeCallbacksAndMessages(jy);
            }
        }
    }

    public static boolean v(InterfaceC7201j70 interfaceC7201j70) {
        if (interfaceC7201j70.getState() == 1) {
            if (TD2.a < 19 || (((InterfaceC7201j70.a) C9542sf.g(interfaceC7201j70.i())).getCause() instanceof ResourceBusyException)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static List<C6960i70.b> z(C6960i70 c6960i70, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(c6960i70.Y0);
        for (int i2 = 0; i2 < c6960i70.Y0; i2++) {
            C6960i70.b e2 = c6960i70.e(i2);
            if ((e2.d(uuid) || (C10323vs.f2.equals(uuid) && e2.d(C10323vs.e2))) && (e2.Z0 != null || z)) {
                arrayList.add(e2);
            }
        }
        return arrayList;
    }

    @InterfaceC8557od0({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void A(Looper looper) {
        boolean z;
        try {
            Looper looper2 = this.u;
            if (looper2 == null) {
                this.u = looper;
                this.v = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z = true;
                } else {
                    z = false;
                }
                C9542sf.i(z);
                C9542sf.g(this.v);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC11300zs1
    public final InterfaceC7201j70 B(int i2, boolean z) {
        InterfaceC3628Mg0 interfaceC3628Mg0 = (InterfaceC3628Mg0) C9542sf.g(this.r);
        if ((interfaceC3628Mg0.m() == 2 && C4479Uz0.d) || TD2.a1(this.h, i2) == -1 || interfaceC3628Mg0.m() == 1) {
            return null;
        }
        JY jy = this.s;
        if (jy == null) {
            JY y = y(AbstractC5317bO0.L(), true, null, z);
            this.n.add(y);
            this.s = y;
        } else {
            jy.f(null);
        }
        return this.s;
    }

    public final void C(Looper looper) {
        if (this.z == null) {
            this.z = new d(looper);
        }
    }

    public final void D() {
        if (this.r != null && this.q == 0 && this.n.isEmpty() && this.f516o.isEmpty()) {
            ((InterfaceC3628Mg0) C9542sf.g(this.r)).g();
            this.r = null;
        }
    }

    public final void E() {
        AbstractC6237fB2 it = AbstractC9481sO0.G(this.p).iterator();
        while (it.hasNext()) {
            ((InterfaceC7201j70) it.next()).h(null);
        }
    }

    public final void F() {
        AbstractC6237fB2 it = AbstractC9481sO0.G(this.f516o).iterator();
        while (it.hasNext()) {
            ((g) it.next()).g();
        }
    }

    public void G(int i2, @InterfaceC11300zs1 byte[] bArr) {
        C9542sf.i(this.n.isEmpty());
        if (i2 == 1 || i2 == 3) {
            C9542sf.g(bArr);
        }
        this.w = i2;
        this.x = bArr;
    }

    public final void H(InterfaceC7201j70 interfaceC7201j70, @InterfaceC11300zs1 InterfaceC8921q70.a aVar) {
        interfaceC7201j70.h(aVar);
        if (this.m != C10323vs.b) {
            interfaceC7201j70.h(null);
        }
    }

    public final void I(boolean z) {
        if (z && this.u == null) {
            I31.o(H, "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
        } else if (Thread.currentThread() != ((Looper) C9542sf.g(this.u)).getThread()) {
            I31.o(H, "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.u.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // o.InterfaceC9170r70
    @InterfaceC11300zs1
    public InterfaceC7201j70 a(@InterfaceC11300zs1 InterfaceC8921q70.a aVar, C10833xx0 c10833xx0) {
        boolean z = false;
        I(false);
        if (this.q > 0) {
            z = true;
        }
        C9542sf.i(z);
        C9542sf.k(this.u);
        return u(this.u, aVar, c10833xx0, true);
    }

    @Override // o.InterfaceC9170r70
    public InterfaceC9170r70.b b(@InterfaceC11300zs1 InterfaceC8921q70.a aVar, C10833xx0 c10833xx0) {
        boolean z;
        if (this.q > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        C9542sf.k(this.u);
        g gVar = new g(aVar);
        gVar.d(c10833xx0);
        return gVar;
    }

    @Override // o.InterfaceC9170r70
    public int d(C10833xx0 c10833xx0) {
        I(false);
        int m = ((InterfaceC3628Mg0) C9542sf.g(this.r)).m();
        C6960i70 c6960i70 = c10833xx0.j1;
        if (c6960i70 == null) {
            if (TD2.a1(this.h, C4128Rj1.l(c10833xx0.g1)) == -1) {
                return 0;
            }
        } else if (!w(c6960i70)) {
            return 1;
        }
        return m;
    }

    @Override // o.InterfaceC9170r70
    public void e(Looper looper, ND1 nd1) {
        A(looper);
        this.y = nd1;
    }

    @Override // o.InterfaceC9170r70
    public final void g() {
        I(true);
        int i2 = this.q - 1;
        this.q = i2;
        if (i2 != 0) {
            return;
        }
        if (this.m != C10323vs.b) {
            ArrayList arrayList = new ArrayList(this.n);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((JY) arrayList.get(i3)).h(null);
            }
        }
        F();
        D();
    }

    @Override // o.InterfaceC9170r70
    public final void m0() {
        I(true);
        int i2 = this.q;
        this.q = i2 + 1;
        if (i2 == 0) {
            if (this.r == null) {
                InterfaceC3628Mg0 a2 = this.d.a(this.c);
                this.r = a2;
                a2.c(new c());
            } else if (this.m != C10323vs.b) {
                for (int i3 = 0; i3 < this.n.size(); i3++) {
                    this.n.get(i3).f(null);
                }
            }
        }
    }

    @InterfaceC11300zs1
    public final InterfaceC7201j70 u(Looper looper, @InterfaceC11300zs1 InterfaceC8921q70.a aVar, C10833xx0 c10833xx0, boolean z) {
        List<C6960i70.b> list;
        C(looper);
        C6960i70 c6960i70 = c10833xx0.j1;
        if (c6960i70 == null) {
            return B(C4128Rj1.l(c10833xx0.g1), z);
        }
        JY jy = null;
        if (this.x == null) {
            list = z((C6960i70) C9542sf.g(c6960i70), this.c, false);
            if (list.isEmpty()) {
                e eVar = new e(this.c);
                I31.e(H, "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new C10025ue0(new InterfaceC7201j70.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (!this.g) {
            jy = this.t;
        } else {
            Iterator<JY> it = this.n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JY next = it.next();
                if (TD2.g(next.f, list)) {
                    jy = next;
                    break;
                }
            }
        }
        if (jy == null) {
            JY y = y(list, false, aVar, z);
            if (!this.g) {
                this.t = y;
            }
            this.n.add(y);
            return y;
        }
        jy.f(aVar);
        return jy;
    }

    public final boolean w(C6960i70 c6960i70) {
        if (this.x != null) {
            return true;
        }
        if (z(c6960i70, this.c, true).isEmpty()) {
            if (c6960i70.Y0 != 1 || !c6960i70.e(0).d(C10323vs.e2)) {
                return false;
            }
            I31.n(H, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.c);
        }
        String str = c6960i70.Z;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (C10323vs.c2.equals(str)) {
            if (TD2.a >= 25) {
                return true;
            }
            return false;
        } else if (!C10323vs.a2.equals(str) && !C10323vs.b2.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public final JY x(@InterfaceC11300zs1 List<C6960i70.b> list, boolean z, @InterfaceC11300zs1 InterfaceC8921q70.a aVar) {
        C9542sf.g(this.r);
        JY jy = new JY(this.c, this.r, this.j, this.l, list, this.w, this.i | z, z, this.x, this.f, this.e, (Looper) C9542sf.g(this.u), this.k, (ND1) C9542sf.g(this.y));
        jy.f(aVar);
        if (this.m != C10323vs.b) {
            jy.f(null);
        }
        return jy;
    }

    public final JY y(@InterfaceC11300zs1 List<C6960i70.b> list, boolean z, @InterfaceC11300zs1 InterfaceC8921q70.a aVar, boolean z2) {
        JY x = x(list, z, aVar);
        if (v(x) && !this.p.isEmpty()) {
            E();
            H(x, aVar);
            x = x(list, z, aVar);
        }
        if (v(x) && z2 && !this.f516o.isEmpty()) {
            F();
            if (!this.p.isEmpty()) {
                E();
            }
            H(x, aVar);
            return x(list, z, aVar);
        }
        return x;
    }

    public KY(UUID uuid, InterfaceC3628Mg0.g gVar, InterfaceC7090if1 interfaceC7090if1, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, M11 m11, long j) {
        C9542sf.g(uuid);
        C9542sf.b(!C10323vs.e2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = gVar;
        this.e = interfaceC7090if1;
        this.f = hashMap;
        this.g = z;
        this.h = iArr;
        this.i = z2;
        this.k = m11;
        this.j = new h();
        this.l = new i();
        this.w = 0;
        this.n = new ArrayList();
        this.f516o = C10856y22.z();
        this.p = C10856y22.z();
        this.m = j;
    }
}
