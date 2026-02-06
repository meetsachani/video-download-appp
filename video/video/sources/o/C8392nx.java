package o;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import o.C3016Ga;
import o.C8392nx;

/* renamed from: o.nx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8392nx {
    public final b a;
    public final Map<String, C7641kw> b = new ArrayMap(4);

    /* renamed from: o.nx$a */
    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {
        public final Executor a;
        public final CameraManager.AvailabilityCallback b;
        public final Object c = new Object();
        public boolean d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.a = executor;
            this.b = availabilityCallback;
        }

        public void d() {
            synchronized (this.c) {
                this.d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.a.execute(new Runnable() { // from class: o.lx
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3016Ga.e.a(C8392nx.a.this.b);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.a.execute(new Runnable() { // from class: o.kx
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8392nx.a.this.b.onCameraAvailable(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.c) {
                try {
                    if (!this.d) {
                        this.a.execute(new Runnable() { // from class: o.mx
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8392nx.a.this.b.onCameraUnavailable(str);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: o.nx$b */
    /* loaded from: classes.dex */
    public interface b {
        static b h(Context context, Handler handler) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return new C9129qx(context);
            }
            if (i >= 29) {
                return new C8879px(context);
            }
            if (i >= 28) {
                return C8636ox.j(context);
            }
            return C9371rx.i(context, handler);
        }

        CameraManager a();

        void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics c(String str) throws C3197Hv;

        Set<Set<String>> d() throws C3197Hv;

        void e(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3197Hv;

        String[] f() throws C3197Hv;

        void g(CameraManager.AvailabilityCallback availabilityCallback);
    }

    public C8392nx(b bVar) {
        this.a = bVar;
    }

    public static C8392nx a(Context context) {
        return b(context, C10632x71.a());
    }

    public static C8392nx b(Context context, Handler handler) {
        return new C8392nx(b.h(context, handler));
    }

    public static C8392nx c(b bVar) {
        return new C8392nx(bVar);
    }

    public C7641kw d(String str) throws C3197Hv {
        C7641kw c7641kw;
        synchronized (this.b) {
            c7641kw = this.b.get(str);
            if (c7641kw == null) {
                try {
                    c7641kw = C7641kw.f(this.a.c(str), str);
                    this.b.put(str, c7641kw);
                } catch (AssertionError e) {
                    throw new C3197Hv(C3197Hv.f1, e.getMessage(), e);
                }
            }
        }
        return c7641kw;
    }

    public String[] e() throws C3197Hv {
        return this.a.f();
    }

    public Set<Set<String>> f() throws C3197Hv {
        return this.a.d();
    }

    public void g(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C3197Hv {
        this.a.e(str, executor, stateCallback);
    }

    public void h(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.a.b(executor, availabilityCallback);
    }

    public void i(CameraManager.AvailabilityCallback availabilityCallback) {
        this.a.g(availabilityCallback);
    }

    public CameraManager j() {
        return this.a.a();
    }
}
