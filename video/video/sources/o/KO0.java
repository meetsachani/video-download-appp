package o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.KO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class KO0 {
    @NotNull
    public static final String c = "com.android.vending.billing.IInAppBillingService$Stub";
    @NotNull
    public static final String d = "com.android.billingclient.api.ProxyBillingActivity";
    @Nullable
    public static Boolean f;
    @Nullable
    public static Boolean g;
    public static ServiceConnection h;
    public static Application.ActivityLifecycleCallbacks i;
    public static Intent j;
    @Nullable
    public static Object k;
    @NotNull
    public static final KO0 a = new KO0();
    public static final String b = KO0.class.getCanonicalName();
    @NotNull
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public static final class a implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
            C6562gT0.p(componentName, "name");
            C6562gT0.p(iBinder, C3771Nr1.Q0);
            KO0 ko0 = KO0.a;
            SO0 so0 = SO0.a;
            com.facebook.M m = com.facebook.M.a;
            KO0.k = SO0.a(com.facebook.M.n(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName componentName) {
            C6562gT0.p(componentName, "name");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static final void c() {
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            SO0 so0 = SO0.a;
            ArrayList<String> i = SO0.i(n, KO0.k);
            KO0 ko0 = KO0.a;
            ko0.f(n, i, false);
            ko0.f(n, SO0.j(n, KO0.k), true);
        }

        public static final void d() {
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            SO0 so0 = SO0.a;
            ArrayList<String> i = SO0.i(n, KO0.k);
            if (i.isEmpty()) {
                i = SO0.g(n, KO0.k);
            }
            KO0.a.f(n, i, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            try {
                com.facebook.M m = com.facebook.M.a;
                com.facebook.M.y().execute(new Runnable() { // from class: o.MO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        KO0.b.c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            C6562gT0.p(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            try {
                if (C6562gT0.g(KO0.g, Boolean.TRUE) && C6562gT0.g(activity.getLocalClassName(), KO0.d)) {
                    com.facebook.M m = com.facebook.M.a;
                    com.facebook.M.y().execute(new Runnable() { // from class: o.LO0
                        @Override // java.lang.Runnable
                        public final void run() {
                            KO0.b.d();
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    @InterfaceC9511sW0
    public static final void g() {
        KO0 ko0 = a;
        ko0.e();
        if (!C6562gT0.g(f, Boolean.FALSE)) {
            C3542Lj c3542Lj = C3542Lj.a;
            if (C3542Lj.c()) {
                ko0.h();
            }
        }
    }

    public final void e() {
        boolean z;
        if (f == null) {
            XO0 xo0 = XO0.a;
            boolean z2 = false;
            if (XO0.a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f = valueOf;
            if (C6562gT0.g(valueOf, Boolean.FALSE)) {
                return;
            }
            if (XO0.a(d) != null) {
                z2 = true;
            }
            g = Boolean.valueOf(z2);
            SO0 so0 = SO0.a;
            SO0.b();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
            C6562gT0.o(intent, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
            j = intent;
            h = new a();
            i = new b();
        }
    }

    public final void f(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString(RO0.z);
                    C6562gT0.o(string, "sku");
                    C6562gT0.o(next, FirebaseAnalytics.Event.D);
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException e2) {
                    Log.e(b, "Error parsing in-app purchase data.", e2);
                }
            }
            SO0 so0 = SO0.a;
            for (Map.Entry<String, String> entry : SO0.k(context, arrayList2, k, z).entrySet()) {
                String value = entry.getValue();
                String str = (String) hashMap.get(entry.getKey());
                if (str != null) {
                    C3542Lj c3542Lj = C3542Lj.a;
                    C3542Lj.f(str, value, z);
                }
            }
        }
    }

    public final void h() {
        if (e.compareAndSet(false, true)) {
            com.facebook.M m = com.facebook.M.a;
            Context n = com.facebook.M.n();
            if (n instanceof Application) {
                Application application = (Application) n;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = i;
                if (activityLifecycleCallbacks != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                    Intent intent = j;
                    if (intent != null) {
                        ServiceConnection serviceConnection = h;
                        if (serviceConnection != null) {
                            n.bindService(intent, serviceConnection, 1);
                            return;
                        } else {
                            C6562gT0.S("serviceConnection");
                            throw null;
                        }
                    }
                    C6562gT0.S(C9998uW1.R);
                    throw null;
                }
                C6562gT0.S("callbacks");
                throw null;
            }
        }
    }
}
