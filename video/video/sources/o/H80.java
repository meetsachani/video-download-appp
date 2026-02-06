package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C7025iN1;
import o.I80;

/* loaded from: classes3.dex */
public class H80 {
    public static final int[] a = {C7025iN1.c.dynamicColorThemeOverlay};
    public static final c b;
    @SuppressLint({"PrivateApi"})
    public static final c c;
    public static final Map<String, c> d;
    public static final Map<String, c> e;
    public static final int f = 0;
    public static final String g;

    /* loaded from: classes3.dex */
    public class a implements c {
        @Override // o.H80.c
        public boolean isSupported() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements c {
        public Long a;

        @Override // o.H80.c
        public boolean isSupported() {
            if (this.a == null) {
                try {
                    Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                    declaredMethod.setAccessible(true);
                    Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                    l.longValue();
                    this.a = l;
                } catch (Exception unused) {
                    this.a = -1L;
                }
            }
            if (this.a.longValue() >= 40100) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        boolean isSupported();
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(@InterfaceC5670cr1 Activity activity);
    }

    /* loaded from: classes3.dex */
    public interface f {
        boolean a(@InterfaceC5670cr1 Activity activity, @InterfaceC4698Xf2 int i);
    }

    static {
        a aVar = new a();
        b = aVar;
        b bVar = new b();
        c = bVar;
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", aVar);
        hashMap.put("google", aVar);
        hashMap.put("hmd global", aVar);
        hashMap.put("infinix", aVar);
        hashMap.put("infinix mobility limited", aVar);
        hashMap.put("itel", aVar);
        hashMap.put("kyocera", aVar);
        hashMap.put("lenovo", aVar);
        hashMap.put(D71.a, aVar);
        hashMap.put(D71.c, aVar);
        hashMap.put("motorola", aVar);
        hashMap.put("nothing", aVar);
        hashMap.put("oneplus", aVar);
        hashMap.put("oppo", aVar);
        hashMap.put("realme", aVar);
        hashMap.put("robolectric", aVar);
        hashMap.put(D71.b, bVar);
        hashMap.put("sharp", aVar);
        hashMap.put("shift", aVar);
        hashMap.put("sony", aVar);
        hashMap.put("tcl", aVar);
        hashMap.put("tecno", aVar);
        hashMap.put("tecno mobile limited", aVar);
        hashMap.put("vivo", aVar);
        hashMap.put("wingtech", aVar);
        hashMap.put("xiaomi", aVar);
        d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", aVar);
        hashMap2.put("jio", aVar);
        e = Collections.unmodifiableMap(hashMap2);
        g = H80.class.getSimpleName();
    }

    @Deprecated
    public static void a(@InterfaceC5670cr1 Activity activity) {
        i(activity);
    }

    @Deprecated
    public static void b(@InterfaceC5670cr1 Activity activity, @InterfaceC4698Xf2 int i) {
        j(activity, new I80.c().k(i).f());
    }

    @Deprecated
    public static void c(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 f fVar) {
        j(activity, new I80.c().j(fVar).f());
    }

    public static void d(@InterfaceC5670cr1 Application application) {
        h(application, new I80.c().f());
    }

    @Deprecated
    public static void e(@InterfaceC5670cr1 Application application, @InterfaceC4698Xf2 int i) {
        h(application, new I80.c().k(i).f());
    }

    @Deprecated
    public static void f(@InterfaceC5670cr1 Application application, @InterfaceC4698Xf2 int i, @InterfaceC5670cr1 f fVar) {
        h(application, new I80.c().k(i).j(fVar).f());
    }

    @Deprecated
    public static void g(@InterfaceC5670cr1 Application application, @InterfaceC5670cr1 f fVar) {
        h(application, new I80.c().j(fVar).f());
    }

    public static void h(@InterfaceC5670cr1 Application application, @InterfaceC5670cr1 I80 i80) {
        application.registerActivityLifecycleCallbacks(new d(i80));
    }

    public static void i(@InterfaceC5670cr1 Activity activity) {
        j(activity, new I80.c().f());
    }

    public static void j(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 I80 i80) {
        int i;
        if (m()) {
            if (i80.d() == null) {
                if (i80.g() == 0) {
                    i = k(activity, a);
                } else {
                    i = i80.g();
                }
            } else {
                i = 0;
            }
            if (i80.f().a(activity, i)) {
                if (i80.d() != null) {
                    BY1 by1 = new BY1(JG0.b(i80.d().intValue()), !C9179r91.r(activity), l(activity));
                    InterfaceC8226nG a2 = InterfaceC8226nG.a();
                    if (a2 == null || !a2.c(activity, C8930q91.a(by1))) {
                        return;
                    }
                } else {
                    C7851ln2.a(activity, i);
                }
                i80.e().a(activity);
            }
        }
    }

    public static int k(@InterfaceC5670cr1 Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static float l(Context context) {
        float contrast;
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && Build.VERSION.SDK_INT >= 34) {
            contrast = uiModeManager.getContrast();
            return contrast;
        }
        return 0.0f;
    }

    @TB(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean m() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (C2775Dq.m()) {
            return true;
        }
        Map<String, c> map = d;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        c cVar = map.get(str.toLowerCase(locale));
        if (cVar == null) {
            cVar = e.get(Build.BRAND.toLowerCase(locale));
        }
        if (cVar == null || !cVar.isSupported()) {
            return false;
        }
        return true;
    }

    @InterfaceC5670cr1
    public static Context n(@InterfaceC5670cr1 Context context) {
        return o(context, 0);
    }

    @InterfaceC5670cr1
    public static Context o(@InterfaceC5670cr1 Context context, @InterfaceC4698Xf2 int i) {
        return p(context, new I80.c().k(i).f());
    }

    @InterfaceC5670cr1
    public static Context p(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 I80 i80) {
        if (m()) {
            int g2 = i80.g();
            if (g2 == 0) {
                g2 = k(context, a);
            }
            if (g2 != 0) {
                if (i80.d() != null) {
                    BY1 by1 = new BY1(JG0.b(i80.d().intValue()), !C9179r91.r(context), l(context));
                    InterfaceC8226nG a2 = InterfaceC8226nG.a();
                    if (a2 != null) {
                        return a2.b(context, C8930q91.a(by1));
                    }
                }
                return new ContextThemeWrapper(context, g2);
            }
        }
        return context;
    }

    /* loaded from: classes3.dex */
    public static class d implements Application.ActivityLifecycleCallbacks {
        public final I80 X;

        public d(@InterfaceC5670cr1 I80 i80) {
            this.X = i80;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 Bundle bundle) {
            H80.j(activity, this.X);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@InterfaceC5670cr1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@InterfaceC5670cr1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@InterfaceC5670cr1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@InterfaceC5670cr1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@InterfaceC5670cr1 Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 Bundle bundle) {
        }
    }
}
