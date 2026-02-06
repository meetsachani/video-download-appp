package o;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.C11306zu;
import o.C2598Bv;
import o.C3597Ly;
import o.C3679Mt;
import o.C3686Mv;
import o.C7151iv;

/* renamed from: o.iv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7151iv {
    public static final String h = "Camera2CapturePipeline";
    public static final Set<C3686Mv.c> i = Collections.unmodifiableSet(EnumSet.of(C3686Mv.c.PASSIVE_FOCUSED, C3686Mv.c.PASSIVE_NOT_FOCUSED, C3686Mv.c.LOCKED_FOCUSED, C3686Mv.c.LOCKED_NOT_FOCUSED));
    public static final Set<C3686Mv.d> j = Collections.unmodifiableSet(EnumSet.of(C3686Mv.d.CONVERGED, C3686Mv.d.UNKNOWN));
    public static final Set<C3686Mv.a> k;
    public static final Set<C3686Mv.a> l;
    public final C11306zu a;
    public final C8217nD2 b;
    public final boolean c;
    public final C10931yL1 d;
    public final Executor e;
    public final boolean f;
    public int g = 1;

    /* renamed from: o.iv$a */
    /* loaded from: classes.dex */
    public static class a implements d {
        public final C11306zu a;
        public final C7404jx1 b;
        public final int c;
        public boolean d = false;

        public a(C11306zu c11306zu, int i, C7404jx1 c7404jx1) {
            this.a = c11306zu;
            this.c = i;
            this.b = c7404jx1;
        }

        public static /* synthetic */ Object e(a aVar, C3679Mt.a aVar2) {
            aVar.a.J().M(aVar2);
            aVar.b.b();
            return "AePreCapture";
        }

        @Override // o.C7151iv.d
        public InterfaceFutureC8411o11<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (C7151iv.b(this.c, totalCaptureResult)) {
                C7433k41.a(C7151iv.h, "Trigger AE");
                this.d = true;
                return YB0.b(C3679Mt.a(new C3679Mt.c() { // from class: o.gv
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar) {
                        return C7151iv.a.e(C7151iv.a.this, aVar);
                    }
                })).e(new InterfaceC6490gB0() { // from class: o.hv
                    @Override // o.InterfaceC6490gB0
                    public final Object apply(Object obj) {
                        Boolean bool;
                        Void r1 = (Void) obj;
                        bool = Boolean.TRUE;
                        return bool;
                    }
                }, C5211ay.b());
            }
            return C7221jC0.h(Boolean.FALSE);
        }

        @Override // o.C7151iv.d
        public boolean b() {
            if (this.c == 0) {
                return true;
            }
            return false;
        }

        @Override // o.C7151iv.d
        public void c() {
            if (this.d) {
                C7433k41.a(C7151iv.h, "cancel TriggerAePreCapture");
                this.a.J().l(false, true);
                this.b.a();
            }
        }
    }

    /* renamed from: o.iv$b */
    /* loaded from: classes.dex */
    public static class b implements d {
        public final C11306zu a;
        public boolean b = false;

        public b(C11306zu c11306zu) {
            this.a = c11306zu;
        }

        @Override // o.C7151iv.d
        public InterfaceFutureC8411o11<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int intValue;
            InterfaceFutureC8411o11<Boolean> h = C7221jC0.h(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((intValue = num.intValue()) == 1 || intValue == 2)) {
                C7433k41.a(C7151iv.h, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C7433k41.a(C7151iv.h, "Trigger AF");
                    this.b = true;
                    this.a.J().N(null, false);
                }
            }
            return h;
        }

        @Override // o.C7151iv.d
        public boolean b() {
            return true;
        }

        @Override // o.C7151iv.d
        public void c() {
            if (this.b) {
                C7433k41.a(C7151iv.h, "cancel TriggerAF");
                this.a.J().l(true, false);
            }
        }
    }

    /* renamed from: o.iv$c */
    /* loaded from: classes.dex */
    public static class c {
        public static final long i;
        public static final long j;
        public final int a;
        public final Executor b;
        public final C11306zu c;
        public final C7404jx1 d;
        public final boolean e;
        public long f = i;
        public final List<d> g = new ArrayList();
        public final d h = new a();

        /* renamed from: o.iv$c$a */
        /* loaded from: classes.dex */
        public class a implements d {
            public a() {
            }

            @Override // o.C7151iv.d
            public InterfaceFutureC8411o11<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (d dVar : c.this.g) {
                    arrayList.add(dVar.a(totalCaptureResult));
                }
                return C7221jC0.n(C7221jC0.c(arrayList), new InterfaceC6490gB0() { // from class: o.pv
                    @Override // o.InterfaceC6490gB0
                    public final Object apply(Object obj) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                        return valueOf;
                    }
                }, C5211ay.b());
            }

            @Override // o.C7151iv.d
            public boolean b() {
                for (d dVar : c.this.g) {
                    if (dVar.b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // o.C7151iv.d
            public void c() {
                for (d dVar : c.this.g) {
                    dVar.c();
                }
            }
        }

        /* renamed from: o.iv$c$b */
        /* loaded from: classes.dex */
        public class b extends AbstractC3393Jv {
            public final /* synthetic */ C3679Mt.a a;

            public b(C3679Mt.a aVar) {
                this.a = aVar;
            }

            @Override // o.AbstractC3393Jv
            public void a() {
                this.a.f(new DM0(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // o.AbstractC3393Jv
            public void b(InterfaceC3784Nv interfaceC3784Nv) {
                this.a.c(null);
            }

            @Override // o.AbstractC3393Jv
            public void c(C3588Lv c3588Lv) {
                this.a.f(new DM0(2, "Capture request failed with reason " + c3588Lv.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i = timeUnit.toNanos(1L);
            j = timeUnit.toNanos(5L);
        }

        public c(int i2, Executor executor, C11306zu c11306zu, boolean z, C7404jx1 c7404jx1) {
            this.a = i2;
            this.b = executor;
            this.c = c11306zu;
            this.e = z;
            this.d = c7404jx1;
        }

        public static /* synthetic */ InterfaceFutureC8411o11 a(c cVar, int i2, TotalCaptureResult totalCaptureResult) {
            cVar.getClass();
            if (C7151iv.b(i2, totalCaptureResult)) {
                cVar.j(j);
            }
            return cVar.h.a(totalCaptureResult);
        }

        public static /* synthetic */ InterfaceFutureC8411o11 b(c cVar, Boolean bool) {
            cVar.getClass();
            if (Boolean.TRUE.equals(bool)) {
                return C7151iv.f(cVar.f, cVar.c, new e.a() { // from class: o.jv
                    @Override // o.C7151iv.e.a
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        boolean a2;
                        a2 = C7151iv.a(totalCaptureResult, false);
                        return a2;
                    }
                });
            }
            return C7221jC0.h(null);
        }

        public static /* synthetic */ Object d(c cVar, C3597Ly.a aVar, C3679Mt.a aVar2) {
            cVar.getClass();
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        public void f(d dVar) {
            this.g.add(dVar);
        }

        public final void g(C3597Ly.a aVar) {
            C2598Bv.a aVar2 = new C2598Bv.a();
            aVar2.g(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(aVar2.build());
        }

        public final void h(C3597Ly.a aVar, C3597Ly c3597Ly) {
            int i2;
            if (this.a == 3 && !this.e) {
                i2 = 4;
            } else if (c3597Ly.i() != -1 && c3597Ly.i() != 5) {
                i2 = -1;
            } else {
                i2 = 2;
            }
            if (i2 != -1) {
                aVar.w(i2);
            }
        }

        public InterfaceFutureC8411o11<List<Void>> i(final List<C3597Ly> list, final int i2) {
            InterfaceFutureC8411o11<TotalCaptureResult> h;
            InterfaceFutureC8411o11 h2 = C7221jC0.h(null);
            if (!this.g.isEmpty()) {
                if (this.h.b()) {
                    h = C7151iv.f(0L, this.c, null);
                } else {
                    h = C7221jC0.h(null);
                }
                h2 = YB0.b(h).f(new InterfaceC2829Ef() { // from class: o.lv
                    @Override // o.InterfaceC2829Ef
                    public final InterfaceFutureC8411o11 apply(Object obj) {
                        return C7151iv.c.a(C7151iv.c.this, i2, (TotalCaptureResult) obj);
                    }
                }, this.b).f(new InterfaceC2829Ef() { // from class: o.mv
                    @Override // o.InterfaceC2829Ef
                    public final InterfaceFutureC8411o11 apply(Object obj) {
                        return C7151iv.c.b(C7151iv.c.this, (Boolean) obj);
                    }
                }, this.b);
            }
            YB0 f = YB0.b(h2).f(new InterfaceC2829Ef() { // from class: o.nv
                @Override // o.InterfaceC2829Ef
                public final InterfaceFutureC8411o11 apply(Object obj) {
                    InterfaceFutureC8411o11 k;
                    TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                    k = C7151iv.c.this.k(list, i2);
                    return k;
                }
            }, this.b);
            final d dVar = this.h;
            Objects.requireNonNull(dVar);
            f.h4(new Runnable() { // from class: o.ov
                @Override // java.lang.Runnable
                public final void run() {
                    C7151iv.d.this.c();
                }
            }, this.b);
            return f;
        }

        public final void j(long j2) {
            this.f = j2;
        }

        public InterfaceFutureC8411o11<List<Void>> k(List<C3597Ly> list, int i2) {
            InterfaceC3784Nv interfaceC3784Nv;
            androidx.camera.core.g e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C3597Ly c3597Ly : list) {
                final C3597Ly.a k = C3597Ly.a.k(c3597Ly);
                if (c3597Ly.i() == 5 && !this.c.U().g() && !this.c.U().c() && (e = this.c.U().e()) != null && this.c.U().f(e)) {
                    interfaceC3784Nv = C3978Pv.a(e.I4());
                } else {
                    interfaceC3784Nv = null;
                }
                if (interfaceC3784Nv != null) {
                    k.t(interfaceC3784Nv);
                } else {
                    h(k, c3597Ly);
                }
                if (this.d.c(i2)) {
                    g(k);
                }
                arrayList.add(C3679Mt.a(new C3679Mt.c() { // from class: o.kv
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar) {
                        return C7151iv.c.d(C7151iv.c.this, k, aVar);
                    }
                }));
                arrayList2.add(k.h());
            }
            this.c.g0(arrayList2);
            return C7221jC0.c(arrayList);
        }
    }

    /* renamed from: o.iv$d */
    /* loaded from: classes.dex */
    public interface d {
        InterfaceFutureC8411o11<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* renamed from: o.iv$e */
    /* loaded from: classes.dex */
    public static class e implements C11306zu.c {
        public static final long f = 0;
        public C3679Mt.a<TotalCaptureResult> a;
        public final long c;
        public final a d;
        public final InterfaceFutureC8411o11<TotalCaptureResult> b = C3679Mt.a(new C3679Mt.c() { // from class: o.qv
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C7151iv.e.b(C7151iv.e.this, aVar);
            }
        });
        public volatile Long e = null;

        /* renamed from: o.iv$e$a */
        /* loaded from: classes.dex */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public e(long j, a aVar) {
            this.c = j;
            this.d = aVar;
        }

        public static /* synthetic */ Object b(e eVar, C3679Mt.a aVar) {
            eVar.a = aVar;
            return "waitFor3AResult";
        }

        @Override // o.C11306zu.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.e == null) {
                this.e = l;
            }
            Long l2 = this.e;
            if (0 != this.c && l2 != null && l != null && l.longValue() - l2.longValue() > this.c) {
                this.a.c(null);
                C7433k41.a(C7151iv.h, "Wait for capture result timeout, current:" + l + " first: " + l2);
                return true;
            }
            a aVar = this.d;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.a.c(totalCaptureResult);
            return true;
        }

        public InterfaceFutureC8411o11<TotalCaptureResult> c() {
            return this.b;
        }
    }

    /* renamed from: o.iv$f */
    /* loaded from: classes.dex */
    public static class f implements d {
        public static final long e = TimeUnit.SECONDS.toNanos(2);
        public final C11306zu a;
        public final int b;
        public boolean c = false;
        public final Executor d;

        public f(C11306zu c11306zu, int i, Executor executor) {
            this.a = c11306zu;
            this.b = i;
            this.d = executor;
        }

        public static /* synthetic */ Object e(f fVar, C3679Mt.a aVar) {
            fVar.a.R().e(aVar, true);
            return "TorchOn";
        }

        @Override // o.C7151iv.d
        public InterfaceFutureC8411o11<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (C7151iv.b(this.b, totalCaptureResult)) {
                if (this.a.Z()) {
                    C7433k41.a(C7151iv.h, "Torch already on, not turn on");
                } else {
                    C7433k41.a(C7151iv.h, "Turn on torch");
                    this.c = true;
                    return YB0.b(C3679Mt.a(new C3679Mt.c() { // from class: o.rv
                        @Override // o.C3679Mt.c
                        public final Object a(C3679Mt.a aVar) {
                            return C7151iv.f.e(C7151iv.f.this, aVar);
                        }
                    })).f(new InterfaceC2829Ef() { // from class: o.sv
                        @Override // o.InterfaceC2829Ef
                        public final InterfaceFutureC8411o11 apply(Object obj) {
                            InterfaceFutureC8411o11 f;
                            Void r2 = (Void) obj;
                            f = C7151iv.f(C7151iv.f.e, C7151iv.f.this.a, new C7151iv.e.a() { // from class: o.uv
                                @Override // o.C7151iv.e.a
                                public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                    boolean a;
                                    a = C7151iv.a(totalCaptureResult2, true);
                                    return a;
                                }
                            });
                            return f;
                        }
                    }, this.d).e(new InterfaceC6490gB0() { // from class: o.tv
                        @Override // o.InterfaceC6490gB0
                        public final Object apply(Object obj) {
                            Boolean bool;
                            TotalCaptureResult totalCaptureResult2 = (TotalCaptureResult) obj;
                            bool = Boolean.FALSE;
                            return bool;
                        }
                    }, C5211ay.b());
                }
            }
            return C7221jC0.h(Boolean.FALSE);
        }

        @Override // o.C7151iv.d
        public boolean b() {
            if (this.b == 0) {
                return true;
            }
            return false;
        }

        @Override // o.C7151iv.d
        public void c() {
            if (this.c) {
                this.a.R().e(null, false);
                C7433k41.a(C7151iv.h, "Turn off torch");
            }
        }
    }

    static {
        C3686Mv.a aVar = C3686Mv.a.CONVERGED;
        C3686Mv.a aVar2 = C3686Mv.a.FLASH_REQUIRED;
        C3686Mv.a aVar3 = C3686Mv.a.UNKNOWN;
        Set<C3686Mv.a> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(aVar, aVar2, aVar3));
        k = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(aVar2);
        copyOf.remove(aVar3);
        l = Collections.unmodifiableSet(copyOf);
    }

    public C7151iv(C11306zu c11306zu, C7641kw c7641kw, C10931yL1 c10931yL1, Executor executor) {
        boolean z = true;
        this.a = c11306zu;
        Integer num = (Integer) c7641kw.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f = (num == null || num.intValue() != 2) ? false : false;
        this.e = executor;
        this.d = c10931yL1;
        this.b = new C8217nD2(c10931yL1);
        this.c = C4367Tu0.a(new C5442bv(c7641kw));
    }

    public static boolean a(TotalCaptureResult totalCaptureResult, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (totalCaptureResult == null) {
            return false;
        }
        C5195au c5195au = new C5195au(totalCaptureResult);
        if (c5195au.h() != C3686Mv.b.OFF && c5195au.h() != C3686Mv.b.UNKNOWN && !i.contains(c5195au.f())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z ? !(z3 || k.contains(c5195au.i())) : !(z3 || l.contains(c5195au.i()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0 || j.contains(c5195au.g())) {
            z5 = true;
        } else {
            z5 = false;
        }
        C7433k41.a(h, "checkCaptureResult, AE=" + c5195au.i() + " AF =" + c5195au.f() + " AWB=" + c5195au.g());
        if (!z2 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    public static boolean b(int i2, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (i2 != 0) {
            if (i2 == 1) {
                return true;
            }
            if (i2 == 2) {
                return false;
            }
            throw new AssertionError(i2);
        }
        if (totalCaptureResult != null) {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    public static InterfaceFutureC8411o11<TotalCaptureResult> f(long j2, C11306zu c11306zu, e.a aVar) {
        e eVar = new e(j2, aVar);
        c11306zu.B(eVar);
        return eVar.c();
    }

    public final boolean c(int i2) {
        if (this.b.a() || this.g == 3 || i2 == 1) {
            return true;
        }
        return false;
    }

    public void d(int i2) {
        this.g = i2;
    }

    public InterfaceFutureC8411o11<List<Void>> e(List<C3597Ly> list, int i2, int i3, int i4) {
        C7404jx1 c7404jx1 = new C7404jx1(this.d);
        c cVar = new c(this.g, this.e, this.a, this.f, c7404jx1);
        if (i2 == 0) {
            cVar.f(new b(this.a));
        }
        if (this.c) {
            if (c(i4)) {
                cVar.f(new f(this.a, i3, this.e));
            } else {
                cVar.f(new a(this.a, i3, c7404jx1));
            }
        }
        return C7221jC0.i(cVar.i(list, i3));
    }
}
