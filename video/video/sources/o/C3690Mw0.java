package o;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.C11306zu;
import o.C2598Bv;
import o.C3597Ly;
import o.C3679Mt;
import o.InterfaceC9367rw;
import o.InterfaceC9610sw;

/* renamed from: o.Mw0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3690Mw0 {
    public static final long v = 5000;
    public static final MeteringRectangle[] w = new MeteringRectangle[0];
    public final C11306zu a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final C9068qj1 f;
    public ScheduledFuture<?> i;
    public ScheduledFuture<?> j;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public MeteringRectangle[] s;
    public C3679Mt.a<C3788Nw0> t;
    public C3679Mt.a<Void> u;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public C11306zu.c f548o = null;
    public C11306zu.c p = null;

    /* renamed from: o.Mw0$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC3393Jv {
        public final /* synthetic */ C3679Mt.a a;

        public a(C3679Mt.a aVar) {
            this.a = aVar;
        }

        @Override // o.AbstractC3393Jv
        public void a() {
            C3679Mt.a aVar = this.a;
            if (aVar != null) {
                aVar.f(new InterfaceC9367rw.a("Camera is closed"));
            }
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            C3679Mt.a aVar = this.a;
            if (aVar != null) {
                aVar.c(interfaceC3784Nv);
            }
        }

        @Override // o.AbstractC3393Jv
        public void c(C3588Lv c3588Lv) {
            C3679Mt.a aVar = this.a;
            if (aVar != null) {
                aVar.f(new InterfaceC9610sw.b(c3588Lv));
            }
        }
    }

    /* renamed from: o.Mw0$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC3393Jv {
        public final /* synthetic */ C3679Mt.a a;

        public b(C3679Mt.a aVar) {
            this.a = aVar;
        }

        @Override // o.AbstractC3393Jv
        public void a() {
            C3679Mt.a aVar = this.a;
            if (aVar != null) {
                aVar.f(new InterfaceC9367rw.a("Camera is closed"));
            }
        }

        @Override // o.AbstractC3393Jv
        public void b(InterfaceC3784Nv interfaceC3784Nv) {
            C3679Mt.a aVar = this.a;
            if (aVar != null) {
                aVar.c(null);
            }
        }

        @Override // o.AbstractC3393Jv
        public void c(C3588Lv c3588Lv) {
            C3679Mt.a aVar = this.a;
            if (aVar != null) {
                aVar.f(new InterfaceC9610sw.b(c3588Lv));
            }
        }
    }

    public C3690Mw0(C11306zu c11306zu, ScheduledExecutorService scheduledExecutorService, Executor executor, C10931yL1 c10931yL1) {
        MeteringRectangle[] meteringRectangleArr = w;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.t = null;
        this.u = null;
        this.a = c11306zu;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.f = new C9068qj1(c10931yL1);
    }

    public static boolean D(C8582oj1 c8582oj1) {
        if (c8582oj1.c() >= 0.0f && c8582oj1.c() <= 1.0f && c8582oj1.d() >= 0.0f && c8582oj1.d() <= 1.0f) {
            return true;
        }
        return false;
    }

    public static int E(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    public static /* synthetic */ boolean a(C3690Mw0 c3690Mw0, boolean z, long j, TotalCaptureResult totalCaptureResult) {
        c3690Mw0.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (c3690Mw0.I()) {
            if (z && num != null) {
                if (c3690Mw0.h.intValue() == 3) {
                    if (num.intValue() == 4) {
                        c3690Mw0.m = true;
                        c3690Mw0.l = true;
                    } else if (num.intValue() == 5) {
                        c3690Mw0.m = false;
                        c3690Mw0.l = true;
                    }
                }
            } else {
                c3690Mw0.m = true;
                c3690Mw0.l = true;
            }
        }
        if (c3690Mw0.l && C11306zu.Y(totalCaptureResult, j)) {
            c3690Mw0.q(c3690Mw0.m);
            return true;
        }
        if (!c3690Mw0.h.equals(num) && num != null) {
            c3690Mw0.h = num;
        }
        return false;
    }

    public static /* synthetic */ Object b(final C3690Mw0 c3690Mw0, final C2602Bw0 c2602Bw0, final long j, final C3679Mt.a aVar) {
        c3690Mw0.b.execute(new Runnable() { // from class: o.Cw0
            @Override // java.lang.Runnable
            public final void run() {
                C3690Mw0.this.L(aVar, c2602Bw0, j);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ boolean c(C3690Mw0 c3690Mw0, int i, long j, TotalCaptureResult totalCaptureResult) {
        c3690Mw0.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i && C11306zu.Y(totalCaptureResult, j)) {
            c3690Mw0.r();
            return true;
        }
        return false;
    }

    public static /* synthetic */ void e(C3690Mw0 c3690Mw0, long j) {
        if (j == c3690Mw0.k) {
            c3690Mw0.o();
        }
    }

    public static /* synthetic */ void g(C3690Mw0 c3690Mw0, long j) {
        if (j == c3690Mw0.k) {
            c3690Mw0.m = false;
            c3690Mw0.q(false);
        }
    }

    public static /* synthetic */ Object h(final C3690Mw0 c3690Mw0, final C3679Mt.a aVar) {
        c3690Mw0.b.execute(new Runnable() { // from class: o.Ew0
            @Override // java.lang.Runnable
            public final void run() {
                C3690Mw0.this.n(aVar);
            }
        });
        return "cancelFocusAndMetering";
    }

    public static PointF y(C8582oj1 c8582oj1, Rational rational, Rational rational2, int i, C9068qj1 c9068qj1) {
        if (c8582oj1.b() != null) {
            rational2 = c8582oj1.b();
        }
        PointF a2 = c9068qj1.a(c8582oj1, i);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                a2.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + a2.y) * (1.0f / doubleValue);
                return a2;
            }
            float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            a2.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + a2.x) * (1.0f / doubleValue2);
        }
        return a2;
    }

    public static MeteringRectangle z(C8582oj1 c8582oj1, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int a2 = ((int) (c8582oj1.a() * rect.width())) / 2;
        int a3 = ((int) (c8582oj1.a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - a2, height - a3, width + a2, height + a3);
        rect2.left = E(rect2.left, rect.right, rect.left);
        rect2.right = E(rect2.right, rect.right, rect.left);
        rect2.top = E(rect2.top, rect.bottom, rect.top);
        rect2.bottom = E(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    public final List<MeteringRectangle> A(List<C8582oj1> list, int i, Rational rational, Rect rect, int i2) {
        if (!list.isEmpty() && i != 0) {
            ArrayList arrayList = new ArrayList();
            Rational rational2 = new Rational(rect.width(), rect.height());
            for (C8582oj1 c8582oj1 : list) {
                if (arrayList.size() == i) {
                    break;
                } else if (D(c8582oj1)) {
                    MeteringRectangle z = z(c8582oj1, y(c8582oj1, rational2, rational, i2, this.f), rect);
                    if (z.getWidth() != 0 && z.getHeight() != 0) {
                        arrayList.add(z);
                    }
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public final boolean B() {
        if (this.a.P(1) == 1) {
            return true;
        }
        return false;
    }

    public boolean C(C2602Bw0 c2602Bw0) {
        Rect G = this.a.G();
        Rational x = x();
        List<MeteringRectangle> A = A(c2602Bw0.c(), this.a.L(), x, G, 1);
        List<MeteringRectangle> A2 = A(c2602Bw0.b(), this.a.K(), x, G, 2);
        List<MeteringRectangle> A3 = A(c2602Bw0.d(), this.a.M(), x, G, 4);
        if (A.isEmpty() && A2.isEmpty() && A3.isEmpty()) {
            return false;
        }
        return true;
    }

    public void F(boolean z) {
        if (z != this.d) {
            this.d = z;
            if (!this.d) {
                o();
            }
        }
    }

    public void G(Rational rational) {
        this.e = rational;
    }

    public void H(int i) {
        this.n = i;
    }

    public final boolean I() {
        if (this.q.length > 0) {
            return true;
        }
        return false;
    }

    public InterfaceFutureC8411o11<C3788Nw0> J(C2602Bw0 c2602Bw0) {
        return K(c2602Bw0, 5000L);
    }

    public InterfaceFutureC8411o11<C3788Nw0> K(final C2602Bw0 c2602Bw0, final long j) {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.Dw0
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C3690Mw0.b(C3690Mw0.this, c2602Bw0, j, aVar);
            }
        });
    }

    public void L(C3679Mt.a<C3788Nw0> aVar, C2602Bw0 c2602Bw0, long j) {
        if (!this.d) {
            aVar.f(new InterfaceC9367rw.a("Camera is not active."));
            return;
        }
        Rect G = this.a.G();
        Rational x = x();
        List<MeteringRectangle> A = A(c2602Bw0.c(), this.a.L(), x, G, 1);
        List<MeteringRectangle> A2 = A(c2602Bw0.b(), this.a.K(), x, G, 2);
        List<MeteringRectangle> A3 = A(c2602Bw0.d(), this.a.M(), x, G, 4);
        if (A.isEmpty() && A2.isEmpty() && A3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        u("Cancelled by another startFocusAndMetering()");
        v("Cancelled by another startFocusAndMetering()");
        s();
        this.t = aVar;
        MeteringRectangle[] meteringRectangleArr = w;
        t((MeteringRectangle[]) A.toArray(meteringRectangleArr), (MeteringRectangle[]) A2.toArray(meteringRectangleArr), (MeteringRectangle[]) A3.toArray(meteringRectangleArr), c2602Bw0, j);
    }

    public void M(C3679Mt.a<Void> aVar) {
        if (!this.d) {
            if (aVar != null) {
                aVar.f(new InterfaceC9367rw.a("Camera is not active."));
                return;
            }
            return;
        }
        C3597Ly.a aVar2 = new C3597Ly.a();
        aVar2.w(this.n);
        aVar2.x(true);
        C2598Bv.a aVar3 = new C2598Bv.a();
        aVar3.g(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(aVar3.build());
        aVar2.c(new b(aVar));
        this.a.g0(Collections.singletonList(aVar2.h()));
    }

    public void N(C3679Mt.a<InterfaceC3784Nv> aVar, boolean z) {
        if (!this.d) {
            if (aVar != null) {
                aVar.f(new InterfaceC9367rw.a("Camera is not active."));
                return;
            }
            return;
        }
        C3597Ly.a aVar2 = new C3597Ly.a();
        aVar2.w(this.n);
        aVar2.x(true);
        C2598Bv.a aVar3 = new C2598Bv.a();
        aVar3.g(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z) {
            aVar3.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.a.O(1)));
        }
        aVar2.e(aVar3.build());
        aVar2.c(new a(aVar));
        this.a.g0(Collections.singletonList(aVar2.h()));
    }

    public void k(C2598Bv.a aVar) {
        int w2;
        if (this.g) {
            w2 = 1;
        } else {
            w2 = w();
        }
        aVar.g(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.a.P(w2)));
        MeteringRectangle[] meteringRectangleArr = this.q;
        if (meteringRectangleArr.length != 0) {
            aVar.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.r;
        if (meteringRectangleArr2.length != 0) {
            aVar.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.s;
        if (meteringRectangleArr3.length != 0) {
            aVar.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    public void l(boolean z, boolean z2) {
        if (!this.d) {
            return;
        }
        C3597Ly.a aVar = new C3597Ly.a();
        aVar.x(true);
        aVar.w(this.n);
        C2598Bv.a aVar2 = new C2598Bv.a();
        if (z) {
            aVar2.g(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (z2) {
            aVar2.g(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        aVar.e(aVar2.build());
        this.a.g0(Collections.singletonList(aVar.h()));
    }

    public InterfaceFutureC8411o11<Void> m() {
        return C3679Mt.a(new C3679Mt.c() { // from class: o.Kw0
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C3690Mw0.h(C3690Mw0.this, aVar);
            }
        });
    }

    public void n(C3679Mt.a<Void> aVar) {
        v("Cancelled by another cancelFocusAndMetering()");
        u("Cancelled by cancelFocusAndMetering()");
        this.u = aVar;
        s();
        p();
        if (I()) {
            l(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = w;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.g = false;
        final long j0 = this.a.j0();
        if (this.u != null) {
            final int P = this.a.P(w());
            C11306zu.c cVar = new C11306zu.c() { // from class: o.Fw0
                @Override // o.C11306zu.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C3690Mw0.c(C3690Mw0.this, P, j0, totalCaptureResult);
                }
            };
            this.p = cVar;
            this.a.B(cVar);
        }
    }

    public void o() {
        n(null);
    }

    public final void p() {
        ScheduledFuture<?> scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.j = null;
        }
    }

    public void q(boolean z) {
        p();
        C3679Mt.a<C3788Nw0> aVar = this.t;
        if (aVar != null) {
            aVar.c(C3788Nw0.a(z));
            this.t = null;
        }
    }

    public final void r() {
        C3679Mt.a<Void> aVar = this.u;
        if (aVar != null) {
            aVar.c(null);
            this.u = null;
        }
    }

    public final void s() {
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
    }

    public final void t(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C2602Bw0 c2602Bw0, long j) {
        final long j0;
        this.a.a0(this.f548o);
        s();
        p();
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr2;
        this.s = meteringRectangleArr3;
        if (I()) {
            this.g = true;
            this.l = false;
            this.m = false;
            j0 = this.a.j0();
            N(null, true);
        } else {
            this.g = false;
            this.l = true;
            this.m = false;
            j0 = this.a.j0();
        }
        this.h = 0;
        final boolean B = B();
        C11306zu.c cVar = new C11306zu.c() { // from class: o.Gw0
            @Override // o.C11306zu.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C3690Mw0.a(C3690Mw0.this, B, j0, totalCaptureResult);
            }
        };
        this.f548o = cVar;
        this.a.B(cVar);
        final long j2 = this.k + 1;
        this.k = j2;
        Runnable runnable = new Runnable() { // from class: o.Hw0
            @Override // java.lang.Runnable
            public final void run() {
                r0.b.execute(new Runnable() { // from class: o.Lw0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3690Mw0.g(C3690Mw0.this, r2);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.j = scheduledExecutorService.schedule(runnable, j, timeUnit);
        if (c2602Bw0.e()) {
            this.i = this.c.schedule(new Runnable() { // from class: o.Iw0
                @Override // java.lang.Runnable
                public final void run() {
                    r0.b.execute(new Runnable() { // from class: o.Jw0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3690Mw0.e(C3690Mw0.this, r2);
                        }
                    });
                }
            }, c2602Bw0.a(), timeUnit);
        }
    }

    public final void u(String str) {
        this.a.a0(this.f548o);
        C3679Mt.a<C3788Nw0> aVar = this.t;
        if (aVar != null) {
            aVar.f(new InterfaceC9367rw.a(str));
            this.t = null;
        }
    }

    public final void v(String str) {
        this.a.a0(this.p);
        C3679Mt.a<Void> aVar = this.u;
        if (aVar != null) {
            aVar.f(new InterfaceC9367rw.a(str));
            this.u = null;
        }
    }

    public int w() {
        if (this.n == 3) {
            return 3;
        }
        return 4;
    }

    public final Rational x() {
        if (this.e != null) {
            return this.e;
        }
        Rect G = this.a.G();
        return new Rational(G.width(), G.height());
    }
}
