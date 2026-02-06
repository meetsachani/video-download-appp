package o;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import o.C3679Mt;
import o.C4278Sx;
import o.C4967Zx;
import o.InterfaceC3981Pw;
import o.InterfaceC5207ax;
import o.InterfaceC6986iD2;

/* renamed from: o.Yx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4860Yx {

    /* renamed from: o  reason: collision with root package name */
    public static final String f678o = "CameraX";
    public static final String p = "retry_token";
    public static final long q = 3000;
    public static final long r = 500;
    public static final Object s = new Object();
    public static final SparseArray<Integer> t = new SparseArray<>();
    public final C4967Zx c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public InterfaceC5207ax g;
    public InterfaceC3981Pw h;
    public InterfaceC6986iD2 i;
    public Context j;
    public final InterfaceFutureC8411o11<Void> k;
    public final Integer n;
    public final C2604Bx a = new C2604Bx();
    public final Object b = new Object();
    public b l = b.UNINITIALIZED;
    public InterfaceFutureC8411o11<Void> m = C7221jC0.h(null);

    /* renamed from: o.Yx$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.INITIALIZING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: o.Yx$b */
    /* loaded from: classes.dex */
    public enum b {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C4860Yx(Context context, C4967Zx.b bVar) {
        if (bVar != null) {
            this.c = bVar.getCameraXConfig();
        } else {
            C4967Zx.b j = j(context);
            if (j != null) {
                this.c = j.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor s0 = this.c.s0(null);
        Handler w0 = this.c.w0(null);
        this.d = s0 == null ? new ExecutorC4857Yw() : s0;
        if (w0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f = handlerThread;
            handlerThread.start();
            this.e = SF0.a(handlerThread.getLooper());
        } else {
            this.f = null;
            this.e = w0;
        }
        Integer num = (Integer) this.c.h(C4967Zx.Q, null);
        this.n = num;
        m(num);
        this.k = o(context);
    }

    public static /* synthetic */ void a(C4860Yx c4860Yx, C3679Mt.a aVar) {
        if (c4860Yx.f != null) {
            Executor executor = c4860Yx.d;
            if (executor instanceof ExecutorC4857Yw) {
                ((ExecutorC4857Yw) executor).d();
            }
            c4860Yx.f.quit();
        }
        aVar.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(final C4860Yx c4860Yx, Context context, final Executor executor, final C3679Mt.a aVar, final long j) {
        c4860Yx.getClass();
        try {
            Application b2 = CM.b(context);
            c4860Yx.j = b2;
            if (b2 == null) {
                c4860Yx.j = CM.a(context);
            }
            InterfaceC5207ax.a t0 = c4860Yx.c.t0(null);
            if (t0 != null) {
                AbstractC3497Kx a2 = AbstractC3497Kx.a(c4860Yx.d, c4860Yx.e);
                C2898Ex r0 = c4860Yx.c.r0(null);
                c4860Yx.g = t0.a(c4860Yx.j, a2, r0);
                InterfaceC3981Pw.a u0 = c4860Yx.c.u0(null);
                if (u0 != null) {
                    c4860Yx.h = u0.a(c4860Yx.j, c4860Yx.g.a(), c4860Yx.g.c());
                    InterfaceC6986iD2.c x0 = c4860Yx.c.x0(null);
                    if (x0 != null) {
                        c4860Yx.i = x0.a(c4860Yx.j);
                        if (executor instanceof ExecutorC4857Yw) {
                            ((ExecutorC4857Yw) executor).e(c4860Yx.g);
                        }
                        c4860Yx.a.g(c4860Yx.g);
                        C4278Sx.a(c4860Yx.j, c4860Yx.a, r0);
                        c4860Yx.q();
                        aVar.c(null);
                        return;
                    }
                    throw new FP0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new FP0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new FP0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (RuntimeException e) {
            e = e;
            Throwable th = e;
            if (SystemClock.elapsedRealtime() - j < View$OnLongClickListenerC9832tq2.g1) {
                C7433k41.q("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), th);
                SF0.d(c4860Yx.e, new Runnable() { // from class: o.Wx
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.n(executor, j, C4860Yx.this.j, aVar);
                    }
                }, p, 500L);
                return;
            }
            synchronized (c4860Yx.b) {
                c4860Yx.l = b.INITIALIZING_ERROR;
            }
            if (th instanceof C4278Sx.a) {
                C7433k41.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.c(null);
            } else if (th instanceof FP0) {
                aVar.f(th);
            } else {
                aVar.f(new FP0(th));
            }
        } catch (FP0 e2) {
            e = e2;
            Throwable th2 = e;
            if (SystemClock.elapsedRealtime() - j < View$OnLongClickListenerC9832tq2.g1) {
            }
        } catch (C4278Sx.a e3) {
            e = e3;
            Throwable th22 = e;
            if (SystemClock.elapsedRealtime() - j < View$OnLongClickListenerC9832tq2.g1) {
            }
        }
    }

    public static /* synthetic */ Object c(C4860Yx c4860Yx, Context context, C3679Mt.a aVar) {
        c4860Yx.n(c4860Yx.d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final C4860Yx c4860Yx, final C3679Mt.a aVar) {
        c4860Yx.a.c().h4(new Runnable() { // from class: o.Tx
            @Override // java.lang.Runnable
            public final void run() {
                C4860Yx.a(C4860Yx.this, aVar);
            }
        }, c4860Yx.d);
        return "CameraX shutdownInternal";
    }

    public static void f(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = t;
                int intValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C4967Zx.b j(Context context) {
        String str;
        Application b2 = CM.b(context);
        if (b2 instanceof C4967Zx.b) {
            return (C4967Zx.b) b2;
        }
        try {
            Context a2 = CM.a(context);
            Bundle bundle = a2.getPackageManager().getServiceInfo(new ComponentName(a2, MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                str = bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER");
            } else {
                str = null;
            }
            if (str == null) {
                C7433k41.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
                return null;
            }
            return (C4967Zx.b) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e2) {
            e = e2;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e3) {
            e = e3;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e4) {
            e = e4;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e5) {
            e = e5;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e6) {
            e = e6;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e7) {
            e = e7;
            C7433k41.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public static void m(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                C10907yF1.g(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = t;
                int i = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i = 1 + sparseArray.get(num.intValue()).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i));
                t();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t() {
        SparseArray<Integer> sparseArray = t;
        if (sparseArray.size() == 0) {
            C7433k41.m();
        } else if (sparseArray.get(3) != null) {
            C7433k41.n(3);
        } else if (sparseArray.get(4) != null) {
            C7433k41.n(4);
        } else if (sparseArray.get(5) != null) {
            C7433k41.n(5);
        } else if (sparseArray.get(6) != null) {
            C7433k41.n(6);
        }
    }

    public InterfaceC3981Pw g() {
        InterfaceC3981Pw interfaceC3981Pw = this.h;
        if (interfaceC3981Pw != null) {
            return interfaceC3981Pw;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public InterfaceC5207ax h() {
        InterfaceC5207ax interfaceC5207ax = this.g;
        if (interfaceC5207ax != null) {
            return interfaceC5207ax;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public C2604Bx i() {
        return this.a;
    }

    public InterfaceC6986iD2 k() {
        InterfaceC6986iD2 interfaceC6986iD2 = this.i;
        if (interfaceC6986iD2 != null) {
            return interfaceC6986iD2;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public InterfaceFutureC8411o11<Void> l() {
        return this.k;
    }

    public final void n(final Executor executor, final long j, final Context context, final C3679Mt.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: o.Xx
            @Override // java.lang.Runnable
            public final void run() {
                C4860Yx.b(C4860Yx.this, context, executor, aVar, j);
            }
        });
    }

    public final InterfaceFutureC8411o11<Void> o(final Context context) {
        boolean z;
        InterfaceFutureC8411o11<Void> a2;
        synchronized (this.b) {
            if (this.l == b.UNINITIALIZED) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "CameraX.initInternal() should only be called once per instance");
            this.l = b.INITIALIZING;
            a2 = C3679Mt.a(new C3679Mt.c() { // from class: o.Ux
                @Override // o.C3679Mt.c
                public final Object a(C3679Mt.a aVar) {
                    return C4860Yx.c(C4860Yx.this, context, aVar);
                }
            });
        }
        return a2;
    }

    public boolean p() {
        boolean z;
        synchronized (this.b) {
            if (this.l == b.INITIALIZED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void q() {
        synchronized (this.b) {
            this.l = b.INITIALIZED;
        }
    }

    public InterfaceFutureC8411o11<Void> r() {
        return s();
    }

    public final InterfaceFutureC8411o11<Void> s() {
        synchronized (this.b) {
            try {
                this.e.removeCallbacksAndMessages(p);
                int i = a.a[this.l.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 || i == 4) {
                            this.l = b.SHUTDOWN;
                            f(this.n);
                            this.m = C3679Mt.a(new C3679Mt.c() { // from class: o.Vx
                                @Override // o.C3679Mt.c
                                public final Object a(C3679Mt.a aVar) {
                                    return C4860Yx.d(C4860Yx.this, aVar);
                                }
                            });
                        }
                        return this.m;
                    }
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                this.l = b.SHUTDOWN;
                return C7221jC0.h(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
