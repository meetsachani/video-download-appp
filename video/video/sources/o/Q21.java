package o;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import o.AbstractC6988iE0;
import o.Q21;

/* loaded from: classes.dex */
public final class Q21 {
    public static final long a = 30000;
    public static final long b = 10000;
    public static final long c = 5;
    public static Field d;
    public static Class<?> e;
    public static Method f;
    public static Method g;
    public static final WeakHashMap<l, WeakReference<m>> h = new WeakHashMap<>();

    /* loaded from: classes.dex */
    public static class a {
        public static Class<?> a;
        public static Method b;

        public static boolean a(LocationManager locationManager, String str, C7672l31 c7672l31, M21 m21, Looper looper) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                if (b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, LocationListener.class, Looper.class);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = c7672l31.i(str);
                if (i != null) {
                    b.invoke(locationManager, i, m21, looper);
                    return true;
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }

        public static boolean b(LocationManager locationManager, String str, C7672l31 c7672l31, m mVar) {
            try {
                if (a == null) {
                    a = Class.forName("android.location.LocationRequest");
                }
                if (b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, LocationListener.class, Looper.class);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest i = c7672l31.i(str);
                if (i != null) {
                    synchronized (Q21.h) {
                        b.invoke(locationManager, i, mVar, Looper.getMainLooper());
                        Q21.o(locationManager, mVar);
                    }
                    return true;
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(callback);
        }

        public static boolean b(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        public static boolean c(LocationManager locationManager, Handler handler, Executor executor, AbstractC6988iE0.a aVar) {
            boolean z;
            if (handler != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.a(z);
            C9654t62<Object, Object> c9654t62 = g.a;
            synchronized (c9654t62) {
                try {
                    n nVar = (n) c9654t62.get(aVar);
                    if (nVar == null) {
                        nVar = new n(aVar);
                    } else {
                        nVar.f();
                    }
                    nVar.e(executor);
                    if (!locationManager.registerGnssStatusCallback(nVar, handler)) {
                        return false;
                    }
                    c9654t62.put(aVar, nVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static void d(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            locationManager.unregisterGnssMeasurementsCallback(callback);
        }

        public static void e(LocationManager locationManager, Object obj) {
            if (obj instanceof n) {
                ((n) obj).f();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        public static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        public static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Class<?> a;
        public static Method b;

        public static void a(LocationManager locationManager, String str, CancellationSignal cancellationSignal, Executor executor, final InterfaceC10929yL<Location> interfaceC10929yL) {
            Objects.requireNonNull(interfaceC10929yL);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: o.R21
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    InterfaceC10929yL.this.accept((Location) obj);
                }
            });
        }

        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, AbstractC6988iE0.a aVar) {
            C9654t62<Object, Object> c9654t62 = g.a;
            synchronized (c9654t62) {
                try {
                    i iVar = (i) c9654t62.get(aVar);
                    if (iVar == null) {
                        iVar = new i(aVar);
                    }
                    if (locationManager.registerGnssStatusCallback(executor, iVar)) {
                        c9654t62.put(aVar, iVar);
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean c(LocationManager locationManager, String str, C7672l31 c7672l31, Executor executor, M21 m21) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (a == null) {
                        a = Class.forName("android.location.LocationRequest");
                    }
                    if (b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", a, Executor.class, LocationListener.class);
                        b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest i = c7672l31.i(str);
                    if (i != null) {
                        b.invoke(locationManager, i, executor, m21);
                        return true;
                    }
                    return false;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static boolean a(LocationManager locationManager, String str) {
            return locationManager.hasProvider(str);
        }

        public static boolean b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        public static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static final C9654t62<Object, Object> a = new C9654t62<>();
        public static final C9654t62<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> b = new C9654t62<>();
    }

    /* loaded from: classes.dex */
    public static class h extends GnssMeasurementsEvent.Callback {
        public final GnssMeasurementsEvent.Callback a;
        public volatile Executor b;

        public h(GnssMeasurementsEvent.Callback callback, Executor executor) {
            this.a = callback;
            this.b = executor;
        }

        public static /* synthetic */ void a(h hVar, Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            if (hVar.b != executor) {
                return;
            }
            hVar.a.onGnssMeasurementsReceived(gnssMeasurementsEvent);
        }

        public static /* synthetic */ void b(h hVar, Executor executor, int i) {
            if (hVar.b != executor) {
                return;
            }
            hVar.a.onStatusChanged(i);
        }

        public void c() {
            this.b = null;
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o.U21
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.h.a(Q21.h.this, executor, gnssMeasurementsEvent);
                }
            });
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i) {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o.V21
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.h.b(Q21.h.this, executor, i);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class i extends GnssStatus.Callback {
        public final AbstractC6988iE0.a a;

        public i(AbstractC6988iE0.a aVar) {
            boolean z;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "invalid null callback");
            this.a = aVar;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            this.a.a(i);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.a.b(AbstractC6988iE0.n(gnssStatus));
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            this.a.c();
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            this.a.d();
        }
    }

    /* loaded from: classes.dex */
    public static class j implements GpsStatus.Listener {
        public final LocationManager a;
        public final AbstractC6988iE0.a b;
        public volatile Executor c;

        public j(LocationManager locationManager, AbstractC6988iE0.a aVar) {
            boolean z;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "invalid null callback");
            this.a = locationManager;
            this.b = aVar;
        }

        public static /* synthetic */ void a(j jVar, Executor executor) {
            if (jVar.c != executor) {
                return;
            }
            jVar.b.d();
        }

        public static /* synthetic */ void b(j jVar, Executor executor) {
            if (jVar.c != executor) {
                return;
            }
            jVar.b.c();
        }

        public static /* synthetic */ void c(j jVar, Executor executor, int i) {
            if (jVar.c != executor) {
                return;
            }
            jVar.b.a(i);
        }

        public static /* synthetic */ void d(j jVar, Executor executor, AbstractC6988iE0 abstractC6988iE0) {
            if (jVar.c != executor) {
                return;
            }
            jVar.b.b(abstractC6988iE0);
        }

        public void e(Executor executor) {
            boolean z;
            if (this.c == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.n(z);
            this.c = executor;
        }

        public void f() {
            this.c = null;
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            final Executor executor = this.c;
            if (executor != null) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && (gpsStatus = this.a.getGpsStatus(null)) != null) {
                                final AbstractC6988iE0 o2 = AbstractC6988iE0.o(gpsStatus);
                                executor.execute(new Runnable() { // from class: o.Z21
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Q21.j.d(Q21.j.this, executor, o2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        GpsStatus gpsStatus2 = this.a.getGpsStatus(null);
                        if (gpsStatus2 != null) {
                            final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                            executor.execute(new Runnable() { // from class: o.Y21
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Q21.j.c(Q21.j.this, executor, timeToFirstFix);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    executor.execute(new Runnable() { // from class: o.X21
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q21.j.a(Q21.j.this, executor);
                        }
                    });
                    return;
                }
                executor.execute(new Runnable() { // from class: o.W21
                    @Override // java.lang.Runnable
                    public final void run() {
                        Q21.j.b(Q21.j.this, executor);
                    }
                });
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class k implements Executor {
        public final Handler X;

        public k(Handler handler) {
            this.X = (Handler) C10907yF1.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (Looper.myLooper() == this.X.getLooper()) {
                runnable.run();
            } else if (this.X.post((Runnable) C10907yF1.l(runnable))) {
            } else {
                throw new RejectedExecutionException(this.X + " is shutting down");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public final String a;
        public final M21 b;

        public l(String str, M21 m21) {
            this.a = (String) C2691Ct1.e(str, "invalid null provider");
            this.b = (M21) C2691Ct1.e(m21, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (!this.a.equals(lVar.a) || !this.b.equals(lVar.b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C2691Ct1.b(this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class n extends GnssStatus.Callback {
        public final AbstractC6988iE0.a a;
        public volatile Executor b;

        public n(AbstractC6988iE0.a aVar) {
            boolean z;
            if (aVar != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "invalid null callback");
            this.a = aVar;
        }

        public static /* synthetic */ void a(n nVar, Executor executor) {
            if (nVar.b != executor) {
                return;
            }
            nVar.a.d();
        }

        public static /* synthetic */ void b(n nVar, Executor executor, int i) {
            if (nVar.b != executor) {
                return;
            }
            nVar.a.a(i);
        }

        public static /* synthetic */ void c(n nVar, Executor executor) {
            if (nVar.b != executor) {
                return;
            }
            nVar.a.c();
        }

        public static /* synthetic */ void d(n nVar, Executor executor, GnssStatus gnssStatus) {
            if (nVar.b != executor) {
                return;
            }
            nVar.a.b(AbstractC6988iE0.n(gnssStatus));
        }

        public void e(Executor executor) {
            boolean z;
            boolean z2 = false;
            if (executor != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "invalid null executor");
            if (this.b == null) {
                z2 = true;
            }
            C10907yF1.n(z2);
            this.b = executor;
        }

        public void f() {
            this.b = null;
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o.g31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.n.b(Q21.n.this, executor, i);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o.h31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.n.d(Q21.n.this, executor, gnssStatus);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o.j31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.n.c(Q21.n.this, executor);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            final Executor executor = this.b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: o.i31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.n.a(Q21.n.this, executor);
                }
            });
        }
    }

    public static void c(LocationManager locationManager, String str, CancellationSignal cancellationSignal, Executor executor, final InterfaceC10929yL<Location> interfaceC10929yL) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, cancellationSignal, executor, interfaceC10929yL);
            return;
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - K21.c(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: o.N21
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC10929yL.this.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar = new f(locationManager, executor, interfaceC10929yL);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar, Looper.getMainLooper());
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: o.O21
                @Override // android.os.CancellationSignal.OnCancelListener
                public final void onCancel() {
                    Q21.f.this.c();
                }
            });
        }
        fVar.e(30000L);
    }

    @Deprecated
    public static void d(LocationManager locationManager, String str, C10593wy c10593wy, Executor executor, InterfaceC10929yL<Location> interfaceC10929yL) {
        CancellationSignal cancellationSignal;
        if (c10593wy != null) {
            cancellationSignal = (CancellationSignal) c10593wy.b();
        } else {
            cancellationSignal = null;
        }
        c(locationManager, str, cancellationSignal, executor, interfaceC10929yL);
    }

    public static String e(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int f(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean g(LocationManager locationManager, String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        if (locationManager.getProvider(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean h(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.c(locationManager);
        }
        if (!locationManager.isProviderEnabled("network") && !locationManager.isProviderEnabled("gps")) {
            return false;
        }
        return true;
    }

    public static boolean i(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 30) {
            return b.b(locationManager, callback, handler);
        }
        if (i2 == 30) {
            return k(locationManager, C6851hg0.a(handler), callback);
        }
        C9654t62<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> c9654t62 = g.b;
        synchronized (c9654t62) {
            try {
                s(locationManager, callback);
                if (b.b(locationManager, callback, handler)) {
                    c9654t62.put(callback, callback);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean j(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 30) {
            return e.b(locationManager, executor, callback);
        }
        if (i2 == 30) {
            return k(locationManager, executor, callback);
        }
        C9654t62<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> c9654t62 = g.b;
        synchronized (c9654t62) {
            try {
                h hVar = new h(callback, executor);
                s(locationManager, callback);
                if (b.a(locationManager, hVar)) {
                    c9654t62.put(callback, hVar);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean k(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (e == null) {
                    e = Class.forName("android.location.GnssRequest$Builder");
                }
                if (f == null) {
                    Method declaredMethod = e.getDeclaredMethod("build", null);
                    f = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (g == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent.Callback.class);
                    g = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = g.invoke(locationManager, f.invoke(e.getDeclaredConstructor(null).newInstance(null), null), executor, callback);
                if (invoke != null) {
                    if (((Boolean) invoke).booleanValue()) {
                        return true;
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
            return false;
        }
        throw new IllegalStateException();
    }

    public static boolean l(LocationManager locationManager, Handler handler, Executor executor, AbstractC6988iE0.a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return d.b(locationManager, handler, executor, aVar);
        }
        return b.c(locationManager, handler, executor, aVar);
    }

    public static boolean m(LocationManager locationManager, Executor executor, AbstractC6988iE0.a aVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return l(locationManager, null, executor, aVar);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return l(locationManager, new Handler(myLooper), executor, aVar);
    }

    public static boolean n(LocationManager locationManager, AbstractC6988iE0.a aVar, Handler handler) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m(locationManager, C6851hg0.a(handler), aVar);
        }
        return m(locationManager, new k(handler), aVar);
    }

    public static void o(LocationManager locationManager, m mVar) {
        m mVar2;
        WeakReference<m> put = h.put(mVar.g(), new WeakReference<>(mVar));
        if (put != null) {
            mVar2 = put.get();
        } else {
            mVar2 = null;
        }
        if (mVar2 != null) {
            mVar2.h();
            locationManager.removeUpdates(mVar2);
        }
    }

    public static void p(LocationManager locationManager, M21 m21) {
        WeakHashMap<l, WeakReference<m>> weakHashMap = h;
        synchronized (weakHashMap) {
            try {
                ArrayList arrayList = null;
                for (WeakReference<m> weakReference : weakHashMap.values()) {
                    m mVar = weakReference.get();
                    if (mVar != null) {
                        l g2 = mVar.g();
                        if (g2.b == m21) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(g2);
                            mVar.h();
                            locationManager.removeUpdates(mVar);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.remove((l) it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(m21);
    }

    public static void q(LocationManager locationManager, String str, C7672l31 c7672l31, Executor executor, M21 m21) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            e.c(locationManager, str, c7672l31.h(), executor, m21);
        } else if (i2 < 30 || !d.c(locationManager, str, c7672l31, executor, m21)) {
            m mVar = new m(new l(str, m21), executor);
            if (a.b(locationManager, str, c7672l31, mVar)) {
                return;
            }
            synchronized (h) {
                locationManager.requestLocationUpdates(str, c7672l31.b(), c7672l31.e(), mVar, Looper.getMainLooper());
                o(locationManager, mVar);
            }
        }
    }

    public static void r(LocationManager locationManager, String str, C7672l31 c7672l31, M21 m21, Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(locationManager, str, c7672l31.h(), C6851hg0.a(new Handler(looper)), m21);
        } else if (a.a(locationManager, str, c7672l31, m21, looper)) {
        } else {
            locationManager.requestLocationUpdates(str, c7672l31.b(), c7672l31.e(), m21, looper);
        }
    }

    public static void s(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.d(locationManager, callback);
            return;
        }
        C9654t62<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> c9654t62 = g.b;
        synchronized (c9654t62) {
            try {
                GnssMeasurementsEvent.Callback remove = c9654t62.remove(callback);
                if (remove != null) {
                    if (remove instanceof h) {
                        ((h) remove).c();
                    }
                    b.d(locationManager, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t(LocationManager locationManager, AbstractC6988iE0.a aVar) {
        C9654t62<Object, Object> c9654t62 = g.a;
        synchronized (c9654t62) {
            try {
                Object remove = c9654t62.remove(aVar);
                if (remove != null) {
                    b.e(locationManager, remove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class m implements LocationListener {
        public volatile l a;
        public final Executor b;

        public m(l lVar, Executor executor) {
            this.a = lVar;
            this.b = executor;
        }

        public static /* synthetic */ void a(m mVar, String str) {
            l lVar = mVar.a;
            if (lVar == null) {
                return;
            }
            lVar.b.onProviderEnabled(str);
        }

        public static /* synthetic */ void b(m mVar, String str, int i, Bundle bundle) {
            l lVar = mVar.a;
            if (lVar == null) {
                return;
            }
            lVar.b.onStatusChanged(str, i, bundle);
        }

        public static /* synthetic */ void c(m mVar, Location location) {
            l lVar = mVar.a;
            if (lVar == null) {
                return;
            }
            lVar.b.onLocationChanged(location);
        }

        public static /* synthetic */ void d(m mVar, List list) {
            l lVar = mVar.a;
            if (lVar == null) {
                return;
            }
            lVar.b.onLocationChanged(list);
        }

        public static /* synthetic */ void e(m mVar, String str) {
            l lVar = mVar.a;
            if (lVar == null) {
                return;
            }
            lVar.b.onProviderDisabled(str);
        }

        public static /* synthetic */ void f(m mVar, int i) {
            l lVar = mVar.a;
            if (lVar == null) {
                return;
            }
            lVar.b.onFlushComplete(i);
        }

        public l g() {
            return (l) C2691Ct1.d(this.a);
        }

        public void h() {
            this.a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: o.e31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.m.f(Q21.m.this, i);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: o.d31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.m.c(Q21.m.this, location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: o.b31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.m.e(Q21.m.this, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: o.a31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.m.a(Q21.m.this, str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: o.f31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.m.b(Q21.m.this, str, i, bundle);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List<Location> list) {
            if (this.a == null) {
                return;
            }
            this.b.execute(new Runnable() { // from class: o.c31
                @Override // java.lang.Runnable
                public final void run() {
                    Q21.m.d(Q21.m.this, list);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements LocationListener {
        public final LocationManager a;
        public final Executor b;
        public final Handler c = new Handler(Looper.getMainLooper());
        public InterfaceC10929yL<Location> d;
        public boolean e;
        public Runnable f;

        public f(LocationManager locationManager, Executor executor, InterfaceC10929yL<Location> interfaceC10929yL) {
            this.a = locationManager;
            this.b = executor;
            this.d = interfaceC10929yL;
        }

        public static /* synthetic */ void a(f fVar) {
            fVar.f = null;
            fVar.onLocationChanged((Location) null);
        }

        public void c() {
            synchronized (this) {
                try {
                    if (this.e) {
                        return;
                    }
                    this.e = true;
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void d() {
            this.d = null;
            this.a.removeUpdates(this);
            Runnable runnable = this.f;
            if (runnable != null) {
                this.c.removeCallbacks(runnable);
                this.f = null;
            }
        }

        public void e(long j) {
            synchronized (this) {
                try {
                    if (this.e) {
                        return;
                    }
                    Runnable runnable = new Runnable() { // from class: o.S21
                        @Override // java.lang.Runnable
                        public final void run() {
                            Q21.f.a(Q21.f.this);
                        }
                    };
                    this.f = runnable;
                    this.c.postDelayed(runnable, j);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            synchronized (this) {
                try {
                    if (this.e) {
                        return;
                    }
                    this.e = true;
                    final InterfaceC10929yL<Location> interfaceC10929yL = this.d;
                    this.b.execute(new Runnable() { // from class: o.T21
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC10929yL.this.accept(location);
                        }
                    });
                    d();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    }
}
