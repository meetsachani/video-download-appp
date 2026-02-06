package o;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import o.C3251Ij2;
import o.C3295Iv;
import o.C3597Ly;
import o.C3679Mt;
import o.HJ;
import o.InterfaceC10290vj2;
import o.T12;

/* renamed from: o.Yy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4863Yy implements InterfaceC4970Zy {
    public static final String s = "CaptureSession";
    public static final long t = 5000;
    public C3153Hj2 e;
    public InterfaceC10290vj2 f;
    public T12 g;
    public e l;
    public InterfaceFutureC8411o11<Void> m;
    public C3679Mt.a<Void> n;
    public final V80 r;
    public final Object a = new Object();
    public final List<C3597Ly> b = new ArrayList();
    public final CameraCaptureSession.CaptureCallback c = new a();
    public HJ h = C5932dw1.s0();
    public C4663Ww i = C4663Ww.e();
    public final Map<D10, Surface> j = new HashMap();
    public List<D10> k = Collections.EMPTY_LIST;

    /* renamed from: o  reason: collision with root package name */
    public Map<D10, Long> f679o = new HashMap();
    public final C4783Yc2 p = new C4783Yc2();
    public final C4645Wq2 q = new C4645Wq2();
    public final f d = new f();

    /* renamed from: o.Yy$c */
    /* loaded from: classes.dex */
    public class c extends CameraCaptureSession.CaptureCallback {
        public c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C4863Yy.this.a) {
                try {
                    T12 t12 = C4863Yy.this.g;
                    if (t12 == null) {
                        return;
                    }
                    C3597Ly i = t12.i();
                    C7433k41.a(C4863Yy.s, "Submit FLASH_MODE_OFF request");
                    C4863Yy c4863Yy = C4863Yy.this;
                    c4863Yy.a(Collections.singletonList(c4863Yy.q.a(i)));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: o.Yy$d */
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
                a[e.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[e.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: o.Yy$e */
    /* loaded from: classes.dex */
    public enum e {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: o.Yy$f */
    /* loaded from: classes.dex */
    public final class f extends InterfaceC10290vj2.a {
        public f() {
        }

        @Override // o.InterfaceC10290vj2.a
        public void A(InterfaceC10290vj2 interfaceC10290vj2) {
            synchronized (C4863Yy.this.a) {
                try {
                    if (C4863Yy.this.l != e.UNINITIALIZED) {
                        C7433k41.a(C4863Yy.s, "onSessionFinished()");
                        C4863Yy.this.n();
                    } else {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C4863Yy.this.l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.InterfaceC10290vj2.a
        public void x(InterfaceC10290vj2 interfaceC10290vj2) {
            synchronized (C4863Yy.this.a) {
                try {
                    switch (d.a[C4863Yy.this.l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C4863Yy.this.l);
                        case 4:
                        case 6:
                        case 7:
                            C4863Yy.this.n();
                            break;
                        case 8:
                            C7433k41.a(C4863Yy.s, "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    C7433k41.c(C4863Yy.s, "CameraCaptureSession.onConfigureFailed() " + C4863Yy.this.l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.InterfaceC10290vj2.a
        public void y(InterfaceC10290vj2 interfaceC10290vj2) {
            synchronized (C4863Yy.this.a) {
                try {
                    switch (d.a[C4863Yy.this.l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C4863Yy.this.l);
                        case 4:
                            C4863Yy c4863Yy = C4863Yy.this;
                            c4863Yy.l = e.OPENED;
                            c4863Yy.f = interfaceC10290vj2;
                            if (c4863Yy.g != null) {
                                List<C3597Ly> d = c4863Yy.i.d().d();
                                if (!d.isEmpty()) {
                                    C4863Yy c4863Yy2 = C4863Yy.this;
                                    c4863Yy2.r(c4863Yy2.w(d));
                                }
                            }
                            C7433k41.a(C4863Yy.s, "Attempting to send capture request onConfigured");
                            C4863Yy c4863Yy3 = C4863Yy.this;
                            c4863Yy3.t(c4863Yy3.g);
                            C4863Yy.this.s();
                            break;
                        case 6:
                            C4863Yy.this.f = interfaceC10290vj2;
                            break;
                        case 7:
                            interfaceC10290vj2.close();
                            break;
                    }
                    C7433k41.a(C4863Yy.s, "CameraCaptureSession.onConfigured() mState=" + C4863Yy.this.l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o.InterfaceC10290vj2.a
        public void z(InterfaceC10290vj2 interfaceC10290vj2) {
            synchronized (C4863Yy.this.a) {
                try {
                    if (d.a[C4863Yy.this.l.ordinal()] != 1) {
                        C7433k41.a(C4863Yy.s, "CameraCaptureSession.onReady() " + C4863Yy.this.l);
                    } else {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C4863Yy.this.l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C4863Yy(V80 v80) {
        this.l = e.UNINITIALIZED;
        this.l = e.INITIALIZED;
        this.r = v80;
    }

    public static /* synthetic */ Object i(C4863Yy c4863Yy, C3679Mt.a aVar) {
        boolean z;
        String str;
        synchronized (c4863Yy.a) {
            if (c4863Yy.n == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "Release completer expected to be null");
            c4863Yy.n = aVar;
            str = "Release[session=" + c4863Yy + C6566gU0.g;
        }
        return str;
    }

    public static /* synthetic */ void j(C4863Yy c4863Yy, CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (c4863Yy.a) {
            try {
                if (c4863Yy.l == e.OPENED) {
                    c4863Yy.t(c4863Yy.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static HJ u(List<C3597Ly> list) {
        C2569Bn1 u0 = C2569Bn1.u0();
        for (C3597Ly c3597Ly : list) {
            HJ f2 = c3597Ly.f();
            for (HJ.a<?> aVar : f2.f()) {
                Object h = f2.h(aVar, null);
                if (u0.g(aVar)) {
                    Object h2 = u0.h(aVar, null);
                    if (!Objects.equals(h2, h)) {
                        C7433k41.a(s, "Detect conflicting option " + aVar.c() + " : " + h + " != " + h2);
                    }
                } else {
                    u0.h0(aVar, h);
                }
            }
        }
        return u0;
    }

    @Override // o.InterfaceC4970Zy
    public void a(List<C3597Ly> list) {
        synchronized (this.a) {
            try {
                switch (d.a[this.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.l);
                    case 2:
                    case 3:
                    case 4:
                        this.b.addAll(list);
                        break;
                    case 5:
                        this.b.addAll(list);
                        s();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // o.InterfaceC4970Zy
    public void b() {
        ArrayList<C3597Ly> arrayList;
        synchronized (this.a) {
            try {
                if (!this.b.isEmpty()) {
                    arrayList = new ArrayList(this.b);
                    this.b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (C3597Ly c3597Ly : arrayList) {
                for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                    abstractC3393Jv.a();
                }
            }
        }
    }

    @Override // o.InterfaceC4970Zy
    public T12 c() {
        T12 t12;
        synchronized (this.a) {
            t12 = this.g;
        }
        return t12;
    }

    @Override // o.InterfaceC4970Zy
    public void close() {
        synchronized (this.a) {
            int i = d.a[this.l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.g != null) {
                                    List<C3597Ly> c2 = this.i.d().c();
                                    if (!c2.isEmpty()) {
                                        try {
                                            a(w(c2));
                                        } catch (IllegalStateException e2) {
                                            C7433k41.d(s, "Unable to issue the request before close the capture session", e2);
                                        }
                                    }
                                }
                            }
                        }
                        C3153Hj2 c3153Hj2 = this.e;
                        C10907yF1.m(c3153Hj2, "The Opener shouldn't null in state:" + this.l);
                        this.e.e();
                        this.l = e.CLOSED;
                        this.g = null;
                    } else {
                        C3153Hj2 c3153Hj22 = this.e;
                        C10907yF1.m(c3153Hj22, "The Opener shouldn't null in state:" + this.l);
                        this.e.e();
                    }
                }
                this.l = e.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.l);
            }
        }
    }

    @Override // o.InterfaceC4970Zy
    public InterfaceFutureC8411o11<Void> d(final T12 t12, final CameraDevice cameraDevice, C3153Hj2 c3153Hj2) {
        synchronized (this.a) {
            try {
                if (d.a[this.l.ordinal()] != 2) {
                    C7433k41.c(s, "Open not allowed in state: " + this.l);
                    return C7221jC0.f(new IllegalStateException("open() should not allow the state: " + this.l));
                }
                this.l = e.GET_SURFACE;
                ArrayList arrayList = new ArrayList(t12.l());
                this.k = arrayList;
                this.e = c3153Hj2;
                YB0 f2 = YB0.b(c3153Hj2.d(arrayList, 5000L)).f(new InterfaceC2829Ef() { // from class: o.Xy
                    @Override // o.InterfaceC2829Ef
                    public final InterfaceFutureC8411o11 apply(Object obj) {
                        InterfaceFutureC8411o11 v;
                        v = C4863Yy.this.v((List) obj, t12, cameraDevice);
                        return v;
                    }
                }, this.e.b());
                C7221jC0.b(f2, new b(), this.e.b());
                return C7221jC0.i(f2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x001c, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:28:0x0091, B:7:0x0012, B:10:0x0018, B:16:0x0027, B:15:0x0020, B:17:0x002c, B:19:0x0059, B:20:0x005d, B:22:0x0061, B:23:0x006c, B:24:0x006e, B:26:0x0070, B:27:0x008d, B:31:0x0098, B:32:0x00b0), top: B:37:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[Catch: all -> 0x001c, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:28:0x0091, B:7:0x0012, B:10:0x0018, B:16:0x0027, B:15:0x0020, B:17:0x002c, B:19:0x0059, B:20:0x005d, B:22:0x0061, B:23:0x006c, B:24:0x006e, B:26:0x0070, B:27:0x008d, B:31:0x0098, B:32:0x00b0), top: B:37:0x0003, inners: #0 }] */
    @Override // o.InterfaceC4970Zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceFutureC8411o11<Void> e(boolean z) {
        synchronized (this.a) {
            switch (d.a[this.l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("release() should not be possible in state: " + this.l);
                case 2:
                    this.l = e.RELEASED;
                    return C7221jC0.h(null);
                case 3:
                    C3153Hj2 c3153Hj2 = this.e;
                    C10907yF1.m(c3153Hj2, "The Opener shouldn't null in state:" + this.l);
                    this.e.e();
                    this.l = e.RELEASED;
                    return C7221jC0.h(null);
                case 4:
                    this.i.d().b();
                    this.l = e.RELEASING;
                    C3153Hj2 c3153Hj22 = this.e;
                    C10907yF1.m(c3153Hj22, "The Opener shouldn't null in state:" + this.l);
                    if (this.e.e()) {
                        n();
                        return C7221jC0.h(null);
                    }
                    if (this.m == null) {
                        this.m = C3679Mt.a(new C3679Mt.c() { // from class: o.Wy
                            @Override // o.C3679Mt.c
                            public final Object a(C3679Mt.a aVar) {
                                return C4863Yy.i(C4863Yy.this, aVar);
                            }
                        });
                    }
                    return this.m;
                case 5:
                case 6:
                    InterfaceC10290vj2 interfaceC10290vj2 = this.f;
                    if (interfaceC10290vj2 != null) {
                        if (z) {
                            try {
                                interfaceC10290vj2.b();
                            } catch (CameraAccessException e2) {
                                C7433k41.d(s, "Unable to abort captures.", e2);
                            }
                        }
                        this.f.close();
                    }
                    this.i.d().b();
                    this.l = e.RELEASING;
                    C3153Hj2 c3153Hj222 = this.e;
                    C10907yF1.m(c3153Hj222, "The Opener shouldn't null in state:" + this.l);
                    if (this.e.e()) {
                    }
                    if (this.m == null) {
                    }
                    return this.m;
                case 7:
                    if (this.m == null) {
                    }
                    return this.m;
                default:
                    return C7221jC0.h(null);
            }
        }
    }

    @Override // o.InterfaceC4970Zy
    public List<C3597Ly> f() {
        List<C3597Ly> unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = Collections.unmodifiableList(this.b);
        }
        return unmodifiableList;
    }

    @Override // o.InterfaceC4970Zy
    public void g(T12 t12) {
        synchronized (this.a) {
            try {
                switch (d.a[this.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.l);
                    case 2:
                    case 3:
                    case 4:
                        this.g = t12;
                        break;
                    case 5:
                        this.g = t12;
                        if (t12 == null) {
                            return;
                        }
                        if (!this.j.keySet().containsAll(t12.l())) {
                            C7433k41.c(s, "Does not have the proper configured lists");
                            return;
                        }
                        C7433k41.a(s, "Attempting to submit CaptureRequest after setting");
                        t(this.g);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    @Override // o.InterfaceC4970Zy
    public void h(Map<D10, Long> map) {
        synchronized (this.a) {
            this.f679o = map;
        }
    }

    public void l() {
        synchronized (this.a) {
            if (this.l != e.OPENED) {
                C7433k41.c(s, "Unable to abort captures. Incorrect state:" + this.l);
                return;
            }
            try {
                this.f.b();
            } catch (CameraAccessException e2) {
                C7433k41.d(s, "Unable to abort captures.", e2);
            }
        }
    }

    public final CameraCaptureSession.CaptureCallback m(List<AbstractC3393Jv> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (AbstractC3393Jv abstractC3393Jv : list) {
            arrayList.add(C3500Ky.a(abstractC3393Jv));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return C6169ev.a(arrayList);
    }

    public void n() {
        e eVar = this.l;
        e eVar2 = e.RELEASED;
        if (eVar == eVar2) {
            C7433k41.a(s, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.l = eVar2;
        this.f = null;
        C3679Mt.a<Void> aVar = this.n;
        if (aVar != null) {
            aVar.c(null);
            this.n = null;
        }
    }

    public final C3006Fw1 o(T12.e eVar, Map<D10, Surface> map, String str) {
        long j;
        DynamicRangeProfiles e2;
        Surface surface = map.get(eVar.e());
        C10907yF1.m(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C3006Fw1 c3006Fw1 = new C3006Fw1(eVar.f(), surface);
        if (str != null) {
            c3006Fw1.l(str);
        } else {
            c3006Fw1.l(eVar.c());
        }
        if (!eVar.d().isEmpty()) {
            c3006Fw1.b();
            for (D10 d10 : eVar.d()) {
                Surface surface2 = map.get(d10);
                C10907yF1.m(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c3006Fw1.a(surface2);
            }
        }
        if (Build.VERSION.SDK_INT >= 33 && (e2 = this.r.e()) != null) {
            N80 b2 = eVar.b();
            Long a2 = P80.a(b2, e2);
            if (a2 == null) {
                C7433k41.c(s, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + b2);
            } else {
                j = a2.longValue();
                c3006Fw1.k(j);
                return c3006Fw1;
            }
        }
        j = 1;
        c3006Fw1.k(j);
        return c3006Fw1;
    }

    public e p() {
        e eVar;
        synchronized (this.a) {
            eVar = this.l;
        }
        return eVar;
    }

    public final List<C3006Fw1> q(List<C3006Fw1> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C3006Fw1 c3006Fw1 : list) {
            if (!arrayList.contains(c3006Fw1.g())) {
                arrayList.add(c3006Fw1.g());
                arrayList2.add(c3006Fw1);
            }
        }
        return arrayList2;
    }

    public int r(List<C3597Ly> list) {
        C3295Iv c3295Iv;
        ArrayList arrayList;
        boolean z;
        synchronized (this.a) {
            try {
                if (this.l != e.OPENED) {
                    C7433k41.a(s, "Skipping issueBurstCaptureRequest due to session closed");
                    return -1;
                } else if (list.isEmpty()) {
                    return -1;
                } else {
                    try {
                        c3295Iv = new C3295Iv();
                        arrayList = new ArrayList();
                        C7433k41.a(s, "Issuing capture request.");
                        z = false;
                        for (C3597Ly c3597Ly : list) {
                            if (c3597Ly.g().isEmpty()) {
                                C7433k41.a(s, "Skipping issuing empty capture request.");
                            } else {
                                Iterator<D10> it = c3597Ly.g().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        D10 next = it.next();
                                        if (!this.j.containsKey(next)) {
                                            C7433k41.a(s, "Skipping capture request with invalid surface: " + next);
                                            break;
                                        }
                                    } else {
                                        if (c3597Ly.i() == 2) {
                                            z = true;
                                        }
                                        C3597Ly.a k = C3597Ly.a.k(c3597Ly);
                                        if (c3597Ly.i() == 5 && c3597Ly.d() != null) {
                                            k.t(c3597Ly.d());
                                        }
                                        T12 t12 = this.g;
                                        if (t12 != null) {
                                            k.e(t12.i().f());
                                        }
                                        k.e(this.h);
                                        k.e(c3597Ly.f());
                                        CaptureRequest c2 = C10338vv.c(k.h(), this.f.l(), this.j);
                                        if (c2 == null) {
                                            C7433k41.a(s, "Skipping issuing request without surface.");
                                            return -1;
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        for (AbstractC3393Jv abstractC3393Jv : c3597Ly.c()) {
                                            C3500Ky.b(abstractC3393Jv, arrayList2);
                                        }
                                        c3295Iv.a(c2, arrayList2);
                                        arrayList.add(c2);
                                    }
                                }
                            }
                        }
                    } catch (CameraAccessException e2) {
                        C7433k41.c(s, "Unable to access camera: " + e2.getMessage());
                        Thread.dumpStack();
                    }
                    if (!arrayList.isEmpty()) {
                        if (this.p.a(arrayList, z)) {
                            this.f.a();
                            c3295Iv.c(new C3295Iv.a() { // from class: o.Vy
                                @Override // o.C3295Iv.a
                                public final void a(CameraCaptureSession cameraCaptureSession, int i, boolean z2) {
                                    C4863Yy.j(C4863Yy.this, cameraCaptureSession, i, z2);
                                }
                            });
                        }
                        if (this.q.b(arrayList, z)) {
                            c3295Iv.a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new c()));
                        }
                        return this.f.q(arrayList, c3295Iv);
                    }
                    C7433k41.a(s, "Skipping issuing burst request due to no valid request elements");
                    return -1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s() {
        if (this.b.isEmpty()) {
            return;
        }
        try {
            r(this.b);
        } finally {
            this.b.clear();
        }
    }

    public int t(T12 t12) {
        synchronized (this.a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (t12 == null) {
                C7433k41.a(s, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            } else if (this.l != e.OPENED) {
                C7433k41.a(s, "Skipping issueRepeatingCaptureRequests due to session closed");
                return -1;
            } else {
                C3597Ly i = t12.i();
                if (i.g().isEmpty()) {
                    C7433k41.a(s, "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f.a();
                    } catch (CameraAccessException e2) {
                        C7433k41.c(s, "Unable to access camera: " + e2.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    C7433k41.a(s, "Issuing request for session.");
                    C3597Ly.a k = C3597Ly.a.k(i);
                    HJ u = u(this.i.d().f());
                    this.h = u;
                    k.e(u);
                    CaptureRequest c2 = C10338vv.c(k.h(), this.f.l(), this.j);
                    if (c2 == null) {
                        C7433k41.a(s, "Skipping issuing empty request for session.");
                        return -1;
                    }
                    return this.f.m(c2, m(i.c(), this.c));
                } catch (CameraAccessException e3) {
                    C7433k41.c(s, "Unable to access camera: " + e3.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            }
        }
    }

    public final InterfaceFutureC8411o11<Void> v(List<Surface> list, T12 t12, CameraDevice cameraDevice) {
        synchronized (this.a) {
            try {
                int i = d.a[this.l.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return C7221jC0.f(new CancellationException("openCaptureSession() not execute in state: " + this.l));
                        }
                    } else {
                        this.j.clear();
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            this.j.put(this.k.get(i2), list.get(i2));
                        }
                        this.l = e.OPENING;
                        C7433k41.a(s, "Opening capture session.");
                        InterfaceC10290vj2.a C = C3251Ij2.C(this.d, new C3251Ij2.a(t12.j()));
                        C2598Bv c2598Bv = new C2598Bv(t12.e());
                        C4663Ww u0 = c2598Bv.u0(C4663Ww.e());
                        this.i = u0;
                        List<C3597Ly> e2 = u0.d().e();
                        C3597Ly.a k = C3597Ly.a.k(t12.i());
                        for (C3597Ly c3597Ly : e2) {
                            k.e(c3597Ly.f());
                        }
                        ArrayList arrayList = new ArrayList();
                        String z0 = c2598Bv.z0(null);
                        for (T12.e eVar : t12.g()) {
                            C3006Fw1 o2 = o(eVar, this.j, z0);
                            if (this.f679o.containsKey(eVar.e())) {
                                o2.m(this.f679o.get(eVar.e()).longValue());
                            }
                            arrayList.add(o2);
                        }
                        U12 a2 = this.e.a(0, q(arrayList), C);
                        if (t12.m() == 5 && t12.f() != null) {
                            a2.g(C5567cQ0.f(t12.f()));
                        }
                        try {
                            CaptureRequest d2 = C10338vv.d(k.h(), cameraDevice);
                            if (d2 != null) {
                                a2.h(d2);
                            }
                            return this.e.c(cameraDevice, a2, this.k);
                        } catch (CameraAccessException e3) {
                            return C7221jC0.f(e3);
                        }
                    }
                }
                return C7221jC0.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List<C3597Ly> w(List<C3597Ly> list) {
        ArrayList arrayList = new ArrayList();
        for (C3597Ly c3597Ly : list) {
            C3597Ly.a k = C3597Ly.a.k(c3597Ly);
            k.w(1);
            for (D10 d10 : this.g.i().g()) {
                k.f(d10);
            }
            arrayList.add(k.h());
        }
        return arrayList;
    }

    public void x() {
        synchronized (this.a) {
            if (this.l != e.OPENED) {
                C7433k41.c(s, "Unable to stop repeating. Incorrect state:" + this.l);
                return;
            }
            try {
                this.f.a();
            } catch (CameraAccessException e2) {
                C7433k41.d(s, "Unable to stop repeating.", e2);
            }
        }
    }

    /* renamed from: o.Yy$b */
    /* loaded from: classes.dex */
    public class b implements XB0<Void> {
        public b() {
        }

        @Override // o.XB0
        public void b(Throwable th) {
            synchronized (C4863Yy.this.a) {
                try {
                    C4863Yy.this.e.e();
                    int i = d.a[C4863Yy.this.l.ordinal()];
                    if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                        C7433k41.q(C4863Yy.s, "Opening session with fail " + C4863Yy.this.l, th);
                        C4863Yy.this.n();
                    }
                } finally {
                }
            }
        }

        @Override // o.XB0
        /* renamed from: c */
        public void a(Void r1) {
        }
    }

    /* renamed from: o.Yy$a */
    /* loaded from: classes.dex */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }
}
