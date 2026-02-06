package o;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import o.C11306zu;
import o.C2598Bv;
import o.C3597Ly;
import o.C3679Mt;
import o.C4475Uy;
import o.HJ;
import o.InterfaceC9367rw;
import o.InterfaceC9610sw;
import o.T12;

/* renamed from: o.zu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C11306zu implements InterfaceC9610sw {
    public static final String A = "CameraControlSessionUpdateId";
    public static final String y = "Camera2CameraControlImp";
    public static final int z = 1;
    public final b b;
    public final Executor c;
    public final Object d;
    public final C7641kw e;
    public final InterfaceC9610sw.c f;
    public final T12.b g;
    public final C3690Mw0 h;
    public final C9240rO2 i;
    public final C4354Tq2 j;
    public final C9559sj0 k;
    public InterfaceC9969uO2 l;
    public final C7633ku m;
    public final C7151iv n;

    /* renamed from: o  reason: collision with root package name */
    public int f930o;
    public volatile boolean p;
    public volatile int q;
    public final N7 r;
    public final C4703Xh s;
    public final AtomicLong t;
    public volatile InterfaceFutureC8411o11<Void> u;
    public int v;
    public long w;
    public final a x;

    /* renamed from: o.zu$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3393Jv {
        public Set<AbstractC3393Jv> a = new HashSet();
        public Map<AbstractC3393Jv, Executor> b = new ArrayMap();

        @Override // o.AbstractC3393Jv
        public void a() {
            for (final AbstractC3393Jv abstractC3393Jv : this.a) {
                try {
                    this.b.get(abstractC3393Jv).execute(new Runnable() { // from class: o.yu
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC3393Jv.this.a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C7433k41.d(C11306zu.y, "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // o.AbstractC3393Jv
        public void b(final InterfaceC3784Nv interfaceC3784Nv) {
            for (final AbstractC3393Jv abstractC3393Jv : this.a) {
                try {
                    this.b.get(abstractC3393Jv).execute(new Runnable() { // from class: o.wu
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC3393Jv.this.b(interfaceC3784Nv);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C7433k41.d(C11306zu.y, "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // o.AbstractC3393Jv
        public void c(final C3588Lv c3588Lv) {
            for (final AbstractC3393Jv abstractC3393Jv : this.a) {
                try {
                    this.b.get(abstractC3393Jv).execute(new Runnable() { // from class: o.xu
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC3393Jv.this.c(c3588Lv);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C7433k41.d(C11306zu.y, "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        public void g(Executor executor, AbstractC3393Jv abstractC3393Jv) {
            this.a.add(abstractC3393Jv);
            this.b.put(abstractC3393Jv, executor);
        }

        public void h(AbstractC3393Jv abstractC3393Jv) {
            this.a.remove(abstractC3393Jv);
            this.b.remove(abstractC3393Jv);
        }
    }

    /* renamed from: o.zu$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {
        public final Set<c> a = new HashSet();
        public final Executor b;

        public b(Executor executor) {
            this.b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (!hashSet.isEmpty()) {
                bVar.a.removeAll(hashSet);
            }
        }

        public void b(c cVar) {
            this.a.add(cVar);
        }

        public void c(c cVar) {
            this.a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: o.Au
                @Override // java.lang.Runnable
                public final void run() {
                    C11306zu.b.a(C11306zu.b.this, totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: o.zu$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public C11306zu(C7641kw c7641kw, ScheduledExecutorService scheduledExecutorService, Executor executor, InterfaceC9610sw.c cVar) {
        this(c7641kw, scheduledExecutorService, executor, cVar, new C10931yL1(new ArrayList()));
    }

    public static boolean Y(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof C4133Rk2) || (l = (Long) ((C4133Rk2) tag).d(A)) == null || l.longValue() < j) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object r(C11306zu c11306zu, final long j, final C3679Mt.a aVar) {
        c11306zu.getClass();
        c11306zu.B(new c() { // from class: o.ru
            @Override // o.C11306zu.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C11306zu.v(j, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ boolean v(long j, C3679Mt.a aVar, TotalCaptureResult totalCaptureResult) {
        if (Y(totalCaptureResult, j)) {
            aVar.c(null);
            return true;
        }
        return false;
    }

    public static /* synthetic */ void x() {
    }

    public static /* synthetic */ Object y(final C11306zu c11306zu, final C3679Mt.a aVar) {
        c11306zu.c.execute(new Runnable() { // from class: o.lu
            @Override // java.lang.Runnable
            public final void run() {
                C7221jC0.j(r0.k0(C11306zu.this.j0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public void B(c cVar) {
        this.b.b(cVar);
    }

    public void C(final Executor executor, final AbstractC3393Jv abstractC3393Jv) {
        this.c.execute(new Runnable() { // from class: o.ou
            @Override // java.lang.Runnable
            public final void run() {
                C11306zu.this.x.g(executor, abstractC3393Jv);
            }
        });
    }

    public void D() {
        synchronized (this.d) {
            try {
                int i = this.f930o;
                if (i != 0) {
                    this.f930o = i - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E(boolean z2) {
        this.p = z2;
        if (!z2) {
            C3597Ly.a aVar = new C3597Ly.a();
            aVar.w(this.v);
            aVar.x(true);
            C2598Bv.a aVar2 = new C2598Bv.a();
            aVar2.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(1)));
            aVar2.g(CaptureRequest.FLASH_MODE, 0);
            aVar.e(aVar2.build());
            g0(Collections.singletonList(aVar.h()));
        }
        j0();
    }

    public C7633ku F() {
        return this.m;
    }

    public Rect G() {
        return this.i.g();
    }

    public long H() {
        return this.w;
    }

    public C9559sj0 I() {
        return this.k;
    }

    public C3690Mw0 J() {
        return this.h;
    }

    public int K() {
        Integer num = (Integer) this.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int L() {
        Integer num = (Integer) this.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int M() {
        Integer num = (Integer) this.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[LOOP:0: B:12:0x006a->B:14:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HJ N() {
        int a2;
        C2598Bv.a aVar = new C2598Bv.a();
        aVar.g(CaptureRequest.CONTROL_MODE, 1);
        this.h.k(aVar);
        this.r.a(aVar);
        this.i.e(aVar);
        if (this.p) {
            aVar.g(CaptureRequest.FLASH_MODE, 2);
        } else {
            int i = this.q;
            if (i != 0) {
                if (i == 1) {
                    a2 = 3;
                }
            } else {
                a2 = this.s.a(2);
            }
            aVar.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(a2)));
            aVar.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(Q(1)));
            this.k.h(aVar);
            C2598Bv n = this.m.n();
            for (HJ.a<?> aVar2 : n.f()) {
                aVar.e().M(aVar2, HJ.c.ALWAYS_OVERRIDE, n.j(aVar2));
            }
            return aVar.build();
        }
        a2 = 1;
        aVar.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(O(a2)));
        aVar.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(Q(1)));
        this.k.h(aVar);
        C2598Bv n2 = this.m.n();
        while (r2.hasNext()) {
        }
        return aVar.build();
    }

    public int O(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (X(i, iArr)) {
            return i;
        }
        if (!X(1, iArr)) {
            return 0;
        }
        return 1;
    }

    public int P(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (X(i, iArr)) {
            return i;
        }
        if (X(4, iArr)) {
            return 4;
        }
        if (!X(1, iArr)) {
            return 0;
        }
        return 1;
    }

    public final int Q(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (X(i, iArr)) {
            return i;
        }
        if (!X(1, iArr)) {
            return 0;
        }
        return 1;
    }

    public C4354Tq2 R() {
        return this.j;
    }

    public int S() {
        int i;
        synchronized (this.d) {
            i = this.f930o;
        }
        return i;
    }

    public C9240rO2 T() {
        return this.i;
    }

    public InterfaceC9969uO2 U() {
        return this.l;
    }

    public void V() {
        synchronized (this.d) {
            this.f930o++;
        }
    }

    public final boolean W() {
        if (S() > 0) {
            return true;
        }
        return false;
    }

    public final boolean X(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean Z() {
        return this.p;
    }

    @Override // o.InterfaceC9610sw
    public void a(boolean z2) {
        this.l.a(z2);
    }

    public void a0(c cVar) {
        this.b.c(cVar);
    }

    @Override // o.InterfaceC9610sw
    public void b(T12.b bVar) {
        this.l.b(bVar);
    }

    public void b0(final AbstractC3393Jv abstractC3393Jv) {
        this.c.execute(new Runnable() { // from class: o.su
            @Override // java.lang.Runnable
            public final void run() {
                C11306zu.this.x.h(abstractC3393Jv);
            }
        });
    }

    @Override // o.InterfaceC9610sw
    public T12 c() {
        this.g.z(this.v);
        this.g.x(N());
        Object w0 = this.m.n().w0(null);
        if (w0 != null && (w0 instanceof Integer)) {
            this.g.p(C7633ku.i, w0);
        }
        this.g.p(A, Long.valueOf(this.w));
        return this.g.q();
    }

    public void c0() {
        f0(1);
    }

    @Override // o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> d(float f) {
        if (!W()) {
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        return C7221jC0.i(this.i.m(f));
    }

    public void d0(boolean z2) {
        this.h.F(z2);
        this.i.l(z2);
        this.j.g(z2);
        this.k.g(z2);
        this.m.q(z2);
    }

    @Override // o.InterfaceC9610sw
    public InterfaceFutureC8411o11<List<Void>> e(final List<C3597Ly> list, final int i, final int i2) {
        if (!W()) {
            C7433k41.p(y, "Camera is not active.");
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        final int p = p();
        return YB0.b(C7221jC0.i(this.u)).f(new InterfaceC2829Ef() { // from class: o.nu
            @Override // o.InterfaceC2829Ef
            public final InterfaceFutureC8411o11 apply(Object obj) {
                InterfaceFutureC8411o11 e;
                Void r5 = (Void) obj;
                e = C11306zu.this.n.e(list, i, p, i2);
                return e;
            }
        }, this.c);
    }

    public void e0(Rational rational) {
        this.h.G(rational);
    }

    @Override // o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> f() {
        if (!W()) {
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        return C7221jC0.i(this.h.m());
    }

    public void f0(int i) {
        this.v = i;
        this.h.H(i);
        this.n.d(this.v);
    }

    @Override // o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> g(float f) {
        if (!W()) {
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        return C7221jC0.i(this.i.n(f));
    }

    public void g0(List<C3597Ly> list) {
        this.f.b(list);
    }

    @Override // o.InterfaceC9610sw
    public Rect h() {
        return (Rect) C10907yF1.l((Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public void h0() {
        this.c.execute(new Runnable() { // from class: o.uu
            @Override // java.lang.Runnable
            public final void run() {
                C11306zu.this.j0();
            }
        });
    }

    @Override // o.InterfaceC9610sw
    public void i(int i) {
        if (!W()) {
            C7433k41.p(y, "Camera is not active.");
            return;
        }
        this.q = i;
        InterfaceC9969uO2 interfaceC9969uO2 = this.l;
        boolean z2 = true;
        if (this.q != 1 && this.q != 0) {
            z2 = false;
        }
        interfaceC9969uO2.d(z2);
        this.u = i0();
    }

    public InterfaceFutureC8411o11<Void> i0() {
        return C7221jC0.i(C3679Mt.a(new C3679Mt.c() { // from class: o.tu
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C11306zu.y(C11306zu.this, aVar);
            }
        }));
    }

    @Override // o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Void> j(boolean z2) {
        if (!W()) {
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        return C7221jC0.i(this.j.d(z2));
    }

    public long j0() {
        this.w = this.t.getAndIncrement();
        this.f.a();
        return this.w;
    }

    @Override // o.InterfaceC9610sw
    public HJ k() {
        return this.m.n();
    }

    public final InterfaceFutureC8411o11<Void> k0(final long j) {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.qu
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C11306zu.r(C11306zu.this, j, aVar);
            }
        });
    }

    @Override // o.InterfaceC9610sw
    public void l(HJ hj) {
        this.m.i(C4475Uy.a.h(hj).build()).h4(new Runnable() { // from class: o.pu
            @Override // java.lang.Runnable
            public final void run() {
                C11306zu.u();
            }
        }, C5211ay.b());
    }

    @Override // o.InterfaceC9367rw
    public InterfaceFutureC8411o11<C3788Nw0> m(C2602Bw0 c2602Bw0) {
        if (!W()) {
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        return C7221jC0.i(this.h.J(c2602Bw0));
    }

    @Override // o.InterfaceC9610sw
    public boolean n() {
        return this.l.c();
    }

    @Override // o.InterfaceC9367rw
    public InterfaceFutureC8411o11<Integer> o(int i) {
        if (!W()) {
            return C7221jC0.f(new InterfaceC9367rw.a("Camera is not active."));
        }
        return this.k.i(i);
    }

    @Override // o.InterfaceC9610sw
    public int p() {
        return this.q;
    }

    @Override // o.InterfaceC9610sw
    public void q() {
        this.m.k().h4(new Runnable() { // from class: o.vu
            @Override // java.lang.Runnable
            public final void run() {
                C11306zu.x();
            }
        }, C5211ay.b());
    }

    public C11306zu(C7641kw c7641kw, ScheduledExecutorService scheduledExecutorService, Executor executor, InterfaceC9610sw.c cVar, C10931yL1 c10931yL1) {
        this.d = new Object();
        T12.b bVar = new T12.b();
        this.g = bVar;
        this.f930o = 0;
        this.p = false;
        this.q = 2;
        this.t = new AtomicLong(0L);
        this.u = C7221jC0.h(null);
        this.v = 1;
        this.w = 0L;
        a aVar = new a();
        this.x = aVar;
        this.e = c7641kw;
        this.f = cVar;
        this.c = executor;
        b bVar2 = new b(executor);
        this.b = bVar2;
        bVar.z(this.v);
        bVar.l(C3402Jy.d(bVar2));
        bVar.l(aVar);
        this.k = new C9559sj0(this, c7641kw, executor);
        this.h = new C3690Mw0(this, scheduledExecutorService, executor, c10931yL1);
        this.i = new C9240rO2(this, c7641kw, executor);
        this.j = new C4354Tq2(this, c7641kw, executor);
        this.l = new C10944yO2(c7641kw);
        this.r = new N7(c10931yL1);
        this.s = new C4703Xh(c10931yL1);
        this.m = new C7633ku(this, executor);
        this.n = new C7151iv(this, c7641kw, c10931yL1, executor);
        executor.execute(new Runnable() { // from class: o.mu
            @Override // java.lang.Runnable
            public final void run() {
                r0.B(C11306zu.this.m.o());
            }
        });
    }
}
