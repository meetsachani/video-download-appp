package o;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class DF {
    public static final float a = 0.33333334f;
    public static final float b = 0.6666667f;

    public static void a(@InterfaceC5670cr1 Application application, @InterfaceC5670cr1 EF ef) {
        if (!d()) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new a(ef));
    }

    public static void b(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 EF ef) {
        int c;
        if (d() && (c = c(activity, ef)) != 0) {
            C7851ln2.a(activity, c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(Context context, EF ef) {
        float contrast;
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (d() && uiModeManager != null) {
            contrast = uiModeManager.getContrast();
            int b2 = ef.b();
            int a2 = ef.a();
            if (contrast >= 0.6666667f) {
                if (a2 != 0) {
                    return a2;
                }
                return b2;
            } else if (contrast >= 0.33333334f) {
                if (b2 == 0) {
                }
            }
        }
        return 0;
    }

    @TB(api = 34)
    public static boolean d() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
    }

    @InterfaceC5670cr1
    public static Context e(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 EF ef) {
        int c;
        if (!d() || (c = c(context, ef)) == 0) {
            return context;
        }
        return new ContextThemeWrapper(context, c);
    }

    @ES1(34)
    /* loaded from: classes3.dex */
    public static class a implements Application.ActivityLifecycleCallbacks {
        public final Set<Activity> X = new LinkedHashSet();
        public final EF Y;
        @InterfaceC11300zs1
        public UiModeManager$ContrastChangeListener Z;

        /* renamed from: o.DF$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0172a implements UiModeManager$ContrastChangeListener {
            public C0172a() {
            }

            public void onContrastChanged(float f) {
                for (Activity activity : a.this.X) {
                    activity.recreate();
                }
            }
        }

        public a(EF ef) {
            this.Y = ef;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@InterfaceC5670cr1 Activity activity) {
            this.X.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.Z != null && this.X.isEmpty()) {
                uiModeManager.removeContrastChangeListener(this.Z);
                this.Z = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.X.isEmpty() && this.Z == null) {
                this.Z = new C0172a();
                uiModeManager.addContrastChangeListener(C10201vM.o(activity.getApplicationContext()), this.Z);
            }
            this.X.add(activity);
            if (uiModeManager != null) {
                DF.b(activity, this.Y);
            }
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
