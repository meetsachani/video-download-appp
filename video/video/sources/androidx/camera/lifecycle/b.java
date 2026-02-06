package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import o.AbstractC4078Qw;
import o.C10777xj0;
import o.C10907yF1;
import o.C2898Ex;
import o.C3679Mt;
import o.C3984Px;
import o.C4860Yx;
import o.C4967Zx;
import o.C5211ay;
import o.C5901do2;
import o.C7159ix;
import o.C7221jC0;
import o.C7713lD2;
import o.C8482oJ;
import o.CM;
import o.EZ0;
import o.InterfaceC2829Ef;
import o.InterfaceC3099Gv;
import o.InterfaceC5450bx;
import o.InterfaceC6420fx;
import o.InterfaceC6490gB0;
import o.InterfaceC7402jx;
import o.InterfaceC8388nw;
import o.InterfaceFutureC8411o11;
import o.KZ0;
import o.UH2;
import o.XB0;
import o.YB0;

/* loaded from: classes.dex */
public final class b implements EZ0 {
    public static final b h = new b();
    public InterfaceFutureC8411o11<C4860Yx> c;
    public C4860Yx f;
    public Context g;
    public final Object a = new Object();
    public C4967Zx.b b = null;
    public InterfaceFutureC8411o11<Void> d = C7221jC0.h(null);
    public final LifecycleCameraRepository e = new LifecycleCameraRepository();

    /* loaded from: classes.dex */
    public class a implements XB0<Void> {
        public final /* synthetic */ C3679Mt.a a;
        public final /* synthetic */ C4860Yx b;

        public a(C3679Mt.a aVar, C4860Yx c4860Yx) {
            this.a = aVar;
            this.b = c4860Yx;
        }

        @Override // o.XB0
        public void b(Throwable th) {
            this.a.f(th);
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r2) {
            this.a.c(this.b);
        }
    }

    public static /* synthetic */ Object f(b bVar, final C4860Yx c4860Yx, C3679Mt.a aVar) {
        synchronized (bVar.a) {
            C7221jC0.b(YB0.b(bVar.d).f(new InterfaceC2829Ef() { // from class: o.RH1
                @Override // o.InterfaceC2829Ef
                public final InterfaceFutureC8411o11 apply(Object obj) {
                    InterfaceFutureC8411o11 l;
                    Void r2 = (Void) obj;
                    l = C4860Yx.this.l();
                    return l;
                }
            }, C5211ay.b()), new a(aVar, c4860Yx), C5211ay.b());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    public static /* synthetic */ C4967Zx h(C4967Zx c4967Zx) {
        return c4967Zx;
    }

    public static /* synthetic */ void i(b bVar) {
        bVar.a();
        bVar.e.b();
    }

    public static /* synthetic */ b j(Context context, C4860Yx c4860Yx) {
        b bVar = h;
        bVar.z(c4860Yx);
        bVar.A(CM.a(context));
        return bVar;
    }

    public static void o(C4967Zx c4967Zx) {
        h.p(c4967Zx);
    }

    public static InterfaceFutureC8411o11<b> u(final Context context) {
        C10907yF1.l(context);
        return C7221jC0.n(h.v(context), new InterfaceC6490gB0() { // from class: o.QH1
            @Override // o.InterfaceC6490gB0
            public final Object apply(Object obj) {
                return androidx.camera.lifecycle.b.j(context, (C4860Yx) obj);
            }
        }, C5211ay.b());
    }

    public final void A(Context context) {
        this.g = context;
    }

    public InterfaceFutureC8411o11<Void> B() {
        InterfaceFutureC8411o11<Void> h2;
        C5901do2.h(new Runnable() { // from class: o.PH1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.lifecycle.b.i(androidx.camera.lifecycle.b.this);
            }
        });
        C4860Yx c4860Yx = this.f;
        if (c4860Yx != null) {
            c4860Yx.h().d().shutdown();
        }
        C4860Yx c4860Yx2 = this.f;
        if (c4860Yx2 != null) {
            h2 = c4860Yx2.r();
        } else {
            h2 = C7221jC0.h(null);
        }
        synchronized (this.a) {
            this.b = null;
            this.c = null;
            this.d = h2;
        }
        this.f = null;
        this.g = null;
        return h2;
    }

    @Override // o.EZ0
    public void a() {
        C5901do2.c();
        y(0);
        this.e.m();
    }

    @Override // o.EZ0
    public void b(m... mVarArr) {
        C5901do2.c();
        if (t() != 2) {
            this.e.l(Arrays.asList(mVarArr));
            return;
        }
        throw new UnsupportedOperationException("unbind usecase is not supported in concurrent camera mode, call unbindAll() first");
    }

    @Override // o.InterfaceC10832xx
    public boolean c(C2898Ex c2898Ex) throws C7159ix {
        try {
            c2898Ex.e(this.f.i().f());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // o.EZ0
    public boolean d(m mVar) {
        for (LifecycleCamera lifecycleCamera : this.e.f()) {
            if (lifecycleCamera.w(mVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC10832xx
    public List<InterfaceC6420fx> e() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7402jx interfaceC7402jx : this.f.i().f()) {
            arrayList.add(interfaceC7402jx.c());
        }
        return arrayList;
    }

    public InterfaceC3099Gv k(KZ0 kz0, C2898Ex c2898Ex, C7713lD2 c7713lD2) {
        if (t() != 2) {
            y(1);
            return l(kz0, c2898Ex, c7713lD2.c(), c7713lD2.a(), (m[]) c7713lD2.b().toArray(new m[0]));
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    public InterfaceC3099Gv l(KZ0 kz0, C2898Ex c2898Ex, UH2 uh2, List<AbstractC4078Qw> list, m... mVarArr) {
        InterfaceC8388nw interfaceC8388nw;
        InterfaceC8388nw a2;
        C5901do2.c();
        C2898Ex.a c = C2898Ex.a.c(c2898Ex);
        int length = mVarArr.length;
        int i = 0;
        while (true) {
            interfaceC8388nw = null;
            if (i >= length) {
                break;
            }
            C2898Ex F = mVarArr[i].j().F(null);
            if (F != null) {
                Iterator<InterfaceC5450bx> it = F.c().iterator();
                while (it.hasNext()) {
                    c.a(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<InterfaceC7402jx> a3 = c.b().a(this.f.i().f());
        if (!a3.isEmpty()) {
            LifecycleCamera d = this.e.d(kz0, C3984Px.C(a3));
            Collection<LifecycleCamera> f = this.e.f();
            for (m mVar : mVarArr) {
                for (LifecycleCamera lifecycleCamera : f) {
                    if (lifecycleCamera.w(mVar) && lifecycleCamera != d) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", mVar));
                    }
                }
            }
            if (d == null) {
                d = this.e.c(kz0, new C3984Px(a3, this.f.h().d(), this.f.g(), this.f.k()));
            }
            LifecycleCamera lifecycleCamera2 = d;
            Iterator<InterfaceC5450bx> it2 = c2898Ex.c().iterator();
            while (it2.hasNext()) {
                InterfaceC5450bx next = it2.next();
                if (next.a() != InterfaceC5450bx.a && (a2 = C10777xj0.c(next.a()).a(lifecycleCamera2.c(), this.g)) != null) {
                    if (interfaceC8388nw == null) {
                        interfaceC8388nw = a2;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            lifecycleCamera2.d(interfaceC8388nw);
            if (mVarArr.length == 0) {
                return lifecycleCamera2;
            }
            this.e.a(lifecycleCamera2, uh2, list, Arrays.asList(mVarArr), this.f.h().d());
            return lifecycleCamera2;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    public InterfaceC3099Gv m(KZ0 kz0, C2898Ex c2898Ex, m... mVarArr) {
        if (t() != 2) {
            y(1);
            return l(kz0, c2898Ex, null, Collections.EMPTY_LIST, mVarArr);
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    public C8482oJ n(List<C8482oJ.a> list) {
        if (this.g.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent")) {
            if (t() != 1) {
                if (list.size() >= 2) {
                    if (list.size() <= 2) {
                        ArrayList arrayList = new ArrayList();
                        List<InterfaceC6420fx> e = e();
                        InterfaceC6420fx s = s(list.get(0).a(), e);
                        InterfaceC6420fx s2 = s(list.get(1).a(), e);
                        if (s != null && s2 != null) {
                            arrayList.add(s);
                            arrayList.add(s2);
                            if (!q().isEmpty() && !arrayList.equals(q())) {
                                throw new UnsupportedOperationException("Cameras are already running, call unbindAll() before binding more cameras");
                            }
                            y(2);
                            ArrayList arrayList2 = new ArrayList();
                            for (C8482oJ.a aVar : list) {
                                arrayList2.add(l(aVar.b(), aVar.a(), aVar.c().c(), aVar.c().a(), (m[]) aVar.c().b().toArray(new m[0])));
                            }
                            x(arrayList);
                            return new C8482oJ(arrayList2);
                        }
                        throw new IllegalArgumentException("Invalid camera selectors in camera configs");
                    }
                    throw new IllegalArgumentException("Concurrent camera is only supporting two  cameras at maximum.");
                }
                throw new IllegalArgumentException("Concurrent camera needs two camera configs");
            }
            throw new UnsupportedOperationException("Camera is already running, call unbindAll() before binding more cameras");
        }
        throw new UnsupportedOperationException("Concurrent camera is not supported on the device");
    }

    public final void p(final C4967Zx c4967Zx) {
        boolean z;
        synchronized (this.a) {
            C10907yF1.l(c4967Zx);
            if (this.b == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.b = new C4967Zx.b() { // from class: o.OH1
                @Override // o.C4967Zx.b
                public final C4967Zx getCameraXConfig() {
                    return androidx.camera.lifecycle.b.h(C4967Zx.this);
                }
            };
        }
    }

    public final List<InterfaceC6420fx> q() {
        C4860Yx c4860Yx = this.f;
        if (c4860Yx == null) {
            return new ArrayList();
        }
        return c4860Yx.h().d().g();
    }

    public List<List<InterfaceC6420fx>> r() {
        Objects.requireNonNull(this.f);
        Objects.requireNonNull(this.f.h().d());
        List<List<C2898Ex>> a2 = this.f.h().d().a();
        List<InterfaceC6420fx> e = e();
        ArrayList arrayList = new ArrayList();
        for (List<C2898Ex> list : a2) {
            ArrayList arrayList2 = new ArrayList();
            for (C2898Ex c2898Ex : list) {
                InterfaceC6420fx s = s(c2898Ex, e);
                if (s != null) {
                    arrayList2.add(s);
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final InterfaceC6420fx s(C2898Ex c2898Ex, List<InterfaceC6420fx> list) {
        List<InterfaceC6420fx> b = c2898Ex.b(list);
        if (b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    public final int t() {
        C4860Yx c4860Yx = this.f;
        if (c4860Yx == null) {
            return 0;
        }
        return c4860Yx.h().d().e();
    }

    public final InterfaceFutureC8411o11<C4860Yx> v(Context context) {
        synchronized (this.a) {
            try {
                InterfaceFutureC8411o11<C4860Yx> interfaceFutureC8411o11 = this.c;
                if (interfaceFutureC8411o11 != null) {
                    return interfaceFutureC8411o11;
                }
                final C4860Yx c4860Yx = new C4860Yx(context, this.b);
                InterfaceFutureC8411o11<C4860Yx> a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.NH1
                    @Override // o.C3679Mt.c
                    public final Object a(C3679Mt.a aVar) {
                        return androidx.camera.lifecycle.b.f(androidx.camera.lifecycle.b.this, c4860Yx, aVar);
                    }
                });
                this.c = a2;
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean w() {
        if (t() == 2) {
            return true;
        }
        return false;
    }

    public final void x(List<InterfaceC6420fx> list) {
        C4860Yx c4860Yx = this.f;
        if (c4860Yx == null) {
            return;
        }
        c4860Yx.h().d().b(list);
    }

    public final void y(int i) {
        C4860Yx c4860Yx = this.f;
        if (c4860Yx == null) {
            return;
        }
        c4860Yx.h().d().h(i);
    }

    public final void z(C4860Yx c4860Yx) {
        this.f = c4860Yx;
    }
}
