package o;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o.C2598Bv;
import o.C3588Lv;
import o.C4475Uy;
import o.C6762hI1;
import o.D10;
import o.HJ;
import o.InterfaceC3784Nv;
import o.InterfaceC4988a22;
import o.T12;

/* renamed from: o.hI1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6762hI1 implements InterfaceC4970Zy {
    public static final String q = "ProcessingCaptureSession";
    public static final long r = 5000;
    public static List<D10> s = new ArrayList();
    public static int t = 0;
    public final InterfaceC4988a22 a;
    public final C5926dv b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final C4863Yy e;
    public T12 g;
    public C2794Dv h;
    public T12 i;
    public int p;
    public List<D10> f = new ArrayList();
    public volatile List<C3597Ly> k = null;
    public volatile boolean l = false;
    public C4475Uy n = new C4475Uy.a().build();

    /* renamed from: o  reason: collision with root package name */
    public C4475Uy f757o = new C4475Uy.a().build();
    public e j = e.UNINITIALIZED;
    public final f m = new f();

    /* renamed from: o.hI1$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC4988a22.a {
        public final /* synthetic */ C3597Ly a;

        public b(C3597Ly c3597Ly) {
            this.a = c3597Ly;
        }

        public static /* synthetic */ void g(C3597Ly c3597Ly) {
            for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                abstractC3393Jv.b(new InterfaceC3784Nv.a());
            }
        }

        public static /* synthetic */ void h(C3597Ly c3597Ly) {
            for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                abstractC3393Jv.c(new C3588Lv(C3588Lv.a.ERROR));
            }
        }

        @Override // o.InterfaceC4988a22.a
        public void b(int i) {
            Executor executor = C6762hI1.this.c;
            final C3597Ly c3597Ly = this.a;
            executor.execute(new Runnable() { // from class: o.iI1
                @Override // java.lang.Runnable
                public final void run() {
                    C6762hI1.b.g(C3597Ly.this);
                }
            });
        }

        @Override // o.InterfaceC4988a22.a
        public void c(int i) {
            Executor executor = C6762hI1.this.c;
            final C3597Ly c3597Ly = this.a;
            executor.execute(new Runnable() { // from class: o.jI1
                @Override // java.lang.Runnable
                public final void run() {
                    C6762hI1.b.h(C3597Ly.this);
                }
            });
        }
    }

    /* renamed from: o.hI1$c */
    /* loaded from: classes.dex */
    public class c implements InterfaceC4988a22.a {
        public final /* synthetic */ C3597Ly a;

        public c(C3597Ly c3597Ly) {
            this.a = c3597Ly;
        }

        public static /* synthetic */ void g(C3597Ly c3597Ly) {
            for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                abstractC3393Jv.b(new InterfaceC3784Nv.a());
            }
        }

        public static /* synthetic */ void h(C3597Ly c3597Ly) {
            for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                abstractC3393Jv.c(new C3588Lv(C3588Lv.a.ERROR));
            }
        }

        @Override // o.InterfaceC4988a22.a
        public void b(int i) {
            Executor executor = C6762hI1.this.c;
            final C3597Ly c3597Ly = this.a;
            executor.execute(new Runnable() { // from class: o.kI1
                @Override // java.lang.Runnable
                public final void run() {
                    C6762hI1.c.g(C3597Ly.this);
                }
            });
        }

        @Override // o.InterfaceC4988a22.a
        public void c(int i) {
            Executor executor = C6762hI1.this.c;
            final C3597Ly c3597Ly = this.a;
            executor.execute(new Runnable() { // from class: o.lI1
                @Override // java.lang.Runnable
                public final void run() {
                    C6762hI1.c.h(C3597Ly.this);
                }
            });
        }
    }

    /* renamed from: o.hI1$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            try {
                iArr[e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.hI1$e */
    /* loaded from: classes.dex */
    public enum e {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public C6762hI1(InterfaceC4988a22 interfaceC4988a22, C5926dv c5926dv, V80 v80, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.p = 0;
        this.e = new C4863Yy(v80);
        this.a = interfaceC4988a22;
        this.b = c5926dv;
        this.c = executor;
        this.d = scheduledExecutorService;
        int i = t;
        t = i + 1;
        this.p = i;
        C7433k41.a(q, "New ProcessingCaptureSession (id=" + this.p + C9811tl1.d);
    }

    public static /* synthetic */ Void i(C6762hI1 c6762hI1, Void r1) {
        c6762hI1.s(c6762hI1.e);
        return null;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 k(final C6762hI1 c6762hI1, T12 t12, CameraDevice cameraDevice, C3153Hj2 c3153Hj2, List list) {
        c6762hI1.getClass();
        C7433k41.a(q, "-- getSurfaces done, start init (id=" + c6762hI1.p + C9811tl1.d);
        if (c6762hI1.j == e.DE_INITIALIZED) {
            return C7221jC0.f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC6179ex1 abstractC6179ex1 = null;
        if (list.contains(null)) {
            return C7221jC0.f(new D10.a("Surface closed", t12.l().get(list.indexOf(null))));
        }
        AbstractC6179ex1 abstractC6179ex12 = null;
        AbstractC6179ex1 abstractC6179ex13 = null;
        for (int i = 0; i < t12.l().size(); i++) {
            D10 d10 = t12.l().get(i);
            if (Objects.equals(d10.g(), androidx.camera.core.k.class)) {
                abstractC6179ex1 = AbstractC6179ex1.a(d10.j().get(), new Size(d10.h().getWidth(), d10.h().getHeight()), d10.i());
            } else if (Objects.equals(d10.g(), androidx.camera.core.f.class)) {
                abstractC6179ex12 = AbstractC6179ex1.a(d10.j().get(), new Size(d10.h().getWidth(), d10.h().getHeight()), d10.i());
            } else if (Objects.equals(d10.g(), androidx.camera.core.c.class)) {
                abstractC6179ex13 = AbstractC6179ex1.a(d10.j().get(), new Size(d10.h().getWidth(), d10.h().getHeight()), d10.i());
            }
        }
        c6762hI1.j = e.SESSION_INITIALIZED;
        try {
            I10.f(c6762hI1.f);
            C7433k41.p(q, "== initSession (id=" + c6762hI1.p + C9811tl1.d);
            try {
                T12 f2 = c6762hI1.a.f(c6762hI1.b, abstractC6179ex1, abstractC6179ex12, abstractC6179ex13);
                c6762hI1.i = f2;
                f2.l().get(0).k().h4(new Runnable() { // from class: o.cI1
                    @Override // java.lang.Runnable
                    public final void run() {
                        I10.e(C6762hI1.this.f);
                    }
                }, C5211ay.b());
                for (final D10 d102 : c6762hI1.i.l()) {
                    s.add(d102);
                    d102.k().h4(new Runnable() { // from class: o.dI1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6762hI1.s.remove(D10.this);
                        }
                    }, c6762hI1.c);
                }
                T12.g gVar = new T12.g();
                gVar.a(t12);
                gVar.d();
                gVar.a(c6762hI1.i);
                C10907yF1.b(gVar.f(), "Cannot transform the SessionConfig");
                InterfaceFutureC8411o11<Void> d2 = c6762hI1.e.d(gVar.c(), (CameraDevice) C10907yF1.l(cameraDevice), c3153Hj2);
                C7221jC0.b(d2, new a(), c6762hI1.c);
                return d2;
            } catch (Throwable th) {
                I10.e(c6762hI1.f);
                throw th;
            }
        } catch (D10.a e2) {
            return C7221jC0.f(e2);
        }
    }

    public static /* synthetic */ void m(C6762hI1 c6762hI1) {
        c6762hI1.getClass();
        C7433k41.a(q, "== deInitSession (id=" + c6762hI1.p + C9811tl1.d);
        c6762hI1.a.e();
    }

    public static void n(List<C3597Ly> list) {
        for (C3597Ly c3597Ly : list) {
            for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                abstractC3393Jv.a();
            }
        }
    }

    public static List<C5231b22> o(List<D10> list) {
        ArrayList arrayList = new ArrayList();
        for (D10 d10 : list) {
            C10907yF1.b(d10 instanceof C5231b22, "Surface must be SessionProcessorSurface");
            arrayList.add((C5231b22) d10);
        }
        return arrayList;
    }

    @Override // o.InterfaceC4970Zy
    public void a(List<C3597Ly> list) {
        if (!list.isEmpty()) {
            C7433k41.a(q, "issueCaptureRequests (id=" + this.p + ") + state =" + this.j);
            int i = d.a[this.j.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4 || i == 5) {
                        C7433k41.a(q, "Run issueCaptureRequests in wrong state, state = " + this.j);
                        n(list);
                        return;
                    }
                    return;
                }
                for (C3597Ly c3597Ly : list) {
                    if (c3597Ly.i() == 2) {
                        q(c3597Ly);
                    } else {
                        r(c3597Ly);
                    }
                }
                return;
            }
            this.k = list;
        }
    }

    @Override // o.InterfaceC4970Zy
    public void b() {
        C7433k41.a(q, "cancelIssuedCaptureRequests (id=" + this.p + C9811tl1.d);
        if (this.k != null) {
            for (C3597Ly c3597Ly : this.k) {
                for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                    abstractC3393Jv.a();
                }
            }
            this.k = null;
        }
    }

    @Override // o.InterfaceC4970Zy
    public T12 c() {
        return this.g;
    }

    @Override // o.InterfaceC4970Zy
    public void close() {
        C7433k41.a(q, "close (id=" + this.p + ") state=" + this.j);
        if (this.j == e.ON_CAPTURE_SESSION_STARTED) {
            C7433k41.a(q, "== onCaptureSessionEnd (id = " + this.p + C9811tl1.d);
            this.a.d();
            C2794Dv c2794Dv = this.h;
            if (c2794Dv != null) {
                c2794Dv.g();
            }
            this.j = e.ON_CAPTURE_SESSION_ENDED;
        }
        this.e.close();
    }

    @Override // o.InterfaceC4970Zy
    public InterfaceFutureC8411o11<Void> d(final T12 t12, final CameraDevice cameraDevice, final C3153Hj2 c3153Hj2) {
        boolean z;
        if (this.j == e.UNINITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Invalid state state:" + this.j);
        C10907yF1.b(t12.l().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C7433k41.a(q, "open (id=" + this.p + C9811tl1.d);
        List<D10> l = t12.l();
        this.f = l;
        return YB0.b(I10.g(l, false, 5000L, this.c, this.d)).f(new InterfaceC2829Ef() { // from class: o.eI1
            @Override // o.InterfaceC2829Ef
            public final InterfaceFutureC8411o11 apply(Object obj) {
                return C6762hI1.k(C6762hI1.this, t12, cameraDevice, c3153Hj2, (List) obj);
            }
        }, this.c).e(new InterfaceC6490gB0() { // from class: o.fI1
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return C6762hI1.i(C6762hI1.this, (Void) obj);
            }
        }, this.c);
    }

    @Override // o.InterfaceC4970Zy
    public InterfaceFutureC8411o11<Void> e(boolean z) {
        C7433k41.a(q, "release (id=" + this.p + ") mProcessorState=" + this.j);
        InterfaceFutureC8411o11<Void> e2 = this.e.e(z);
        int i = d.a[this.j.ordinal()];
        if (i == 2 || i == 4) {
            e2.h4(new Runnable() { // from class: o.gI1
                @Override // java.lang.Runnable
                public final void run() {
                    C6762hI1.m(C6762hI1.this);
                }
            }, C5211ay.b());
        }
        this.j = e.DE_INITIALIZED;
        return e2;
    }

    @Override // o.InterfaceC4970Zy
    public List<C3597Ly> f() {
        if (this.k != null) {
            return this.k;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // o.InterfaceC4970Zy
    public void g(T12 t12) {
        C7433k41.a(q, "setSessionConfig (id=" + this.p + C9811tl1.d);
        this.g = t12;
        if (t12 != null) {
            C2794Dv c2794Dv = this.h;
            if (c2794Dv != null) {
                c2794Dv.k(t12);
            }
            if (this.j == e.ON_CAPTURE_SESSION_STARTED) {
                C4475Uy build = C4475Uy.a.h(t12.e()).build();
                this.n = build;
                t(build, this.f757o);
                if (!p(t12.i())) {
                    this.a.a();
                } else {
                    this.a.h(this.m);
                }
            }
        }
    }

    public final boolean p(C3597Ly c3597Ly) {
        for (D10 d10 : c3597Ly.g()) {
            if (Objects.equals(d10.g(), androidx.camera.core.k.class)) {
                return true;
            }
        }
        return false;
    }

    public void q(C3597Ly c3597Ly) {
        C4475Uy.a h = C4475Uy.a.h(c3597Ly.f());
        HJ f2 = c3597Ly.f();
        HJ.a<Integer> aVar = C3597Ly.j;
        if (f2.g(aVar)) {
            h.k(CaptureRequest.JPEG_ORIENTATION, (Integer) c3597Ly.f().j(aVar));
        }
        HJ f3 = c3597Ly.f();
        HJ.a<Integer> aVar2 = C3597Ly.k;
        if (f3.g(aVar2)) {
            h.k(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c3597Ly.f().j(aVar2)).byteValue()));
        }
        C4475Uy build = h.build();
        this.f757o = build;
        t(this.n, build);
        this.a.c(new c(c3597Ly));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(C3597Ly c3597Ly) {
        C7433k41.a(q, "issueTriggerRequest");
        C4475Uy build = C4475Uy.a.h(c3597Ly.f()).build();
        for (HJ.a<?> aVar : build.f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) aVar.d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.a.i(build, new b(c3597Ly));
                return;
            }
            while (r1.hasNext()) {
            }
        }
        n(Arrays.asList(c3597Ly));
    }

    public void s(C4863Yy c4863Yy) {
        boolean z;
        if (this.j == e.SESSION_INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        C10907yF1.b(z, "Invalid state state:" + this.j);
        this.h = new C2794Dv(c4863Yy, o(this.i.l()));
        C7433k41.a(q, "== onCaptureSessinStarted (id = " + this.p + C9811tl1.d);
        this.a.l(this.h);
        this.j = e.ON_CAPTURE_SESSION_STARTED;
        T12 t12 = this.g;
        if (t12 != null) {
            g(t12);
        }
        if (this.k != null) {
            a(this.k);
            this.k = null;
        }
    }

    public final void t(C4475Uy c4475Uy, C4475Uy c4475Uy2) {
        C2598Bv.a aVar = new C2598Bv.a();
        aVar.f(c4475Uy);
        aVar.f(c4475Uy2);
        this.a.k(aVar.build());
    }

    /* renamed from: o.hI1$a */
    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public a() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            C7433k41.d(C6762hI1.q, "open session failed ", th);
            C6762hI1.this.close();
            C6762hI1.this.e(false);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }

    /* renamed from: o.hI1$f */
    /* loaded from: classes.dex */
    public static class f implements InterfaceC4988a22.a {
        @Override // o.InterfaceC4988a22.a
        public void a(int i) {
        }

        @Override // o.InterfaceC4988a22.a
        public void b(int i) {
        }

        @Override // o.InterfaceC4988a22.a
        public void c(int i) {
        }

        @Override // o.InterfaceC4988a22.a
        public void e(int i) {
        }

        @Override // o.InterfaceC4988a22.a
        public void d(int i, long j) {
        }

        @Override // o.InterfaceC4988a22.a
        public void f(long j, int i, Map<CaptureResult.Key, Object> map) {
        }
    }

    @Override // o.InterfaceC4970Zy
    public void h(Map<D10, Long> map) {
    }
}
