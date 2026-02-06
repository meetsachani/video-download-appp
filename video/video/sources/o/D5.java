package o;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public final class D5 {
    public static final String a = "ActivityRecreator";
    public static final Class<?> b;
    public static final Field c;
    public static final Field d;
    public static final Method e;
    public static final Method f;
    public static final Method g;
    public static final Handler h = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ d X;
        public final /* synthetic */ Object Y;

        public a(d dVar, Object obj) {
            this.X = dVar;
            this.Y = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.X = this.Y;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ Application X;
        public final /* synthetic */ d Y;

        public b(Application application, d dVar) {
            this.X = application;
            this.Y = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.unregisterActivityLifecycleCallbacks(this.Y);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ Object X;
        public final /* synthetic */ Object Y;

        public c(Object obj, Object obj2) {
            this.X = obj;
            this.Y = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = D5.e;
                if (method != null) {
                    method.invoke(this.X, this.Y, Boolean.FALSE, "AppCompat recreation");
                } else {
                    D5.f.invoke(this.X, this.Y, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e(D5.a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    static {
        Class<?> a2 = a();
        b = a2;
        c = b();
        d = f();
        e = d(a2);
        f = c(a2);
        g = e(a2);
    }

    public static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        if (i != 26 && i != 27) {
            return false;
        }
        return true;
    }

    public static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = d.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                h.postAtFrontOfQueue(new c(c.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(a, "Exception while fetching field values", th);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && g == null) {
            return false;
        } else {
            if (f == null && e == null) {
                return false;
            }
            try {
                Object obj2 = d.get(activity);
                if (obj2 == null || (obj = c.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = h;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = g;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        public Object X;
        public Activity Y;
        public final int Z;
        public boolean Y0 = false;
        public boolean Z0 = false;
        public boolean a1 = false;

        public d(Activity activity) {
            this.Y = activity;
            this.Z = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.Y == activity) {
                this.Y = null;
                this.Z0 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.Z0 && !this.a1 && !this.Y0 && D5.h(this.X, this.Z, activity)) {
                this.a1 = true;
                this.X = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.Y == activity) {
                this.Y0 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
