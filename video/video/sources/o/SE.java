package o;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.S;
import com.facebook.internal.C2358c;
import com.facebook.internal.C2379y;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C10916yH2;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class SE {
    @Nullable
    public static SensorManager c;
    @Nullable
    public static C10673xH2 d;
    @Nullable
    public static String e;
    public static volatile boolean h;
    @NotNull
    public static final SE a = new SE();
    @NotNull
    public static final C10916yH2 b = new C10916yH2();
    @NotNull
    public static final AtomicBoolean f = new AtomicBoolean(true);
    @NotNull
    public static final AtomicBoolean g = new AtomicBoolean(false);

    public static final void d(String str) {
        String h2;
        String str2 = "0";
        if (SQ.e(SE.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            com.facebook.M m = com.facebook.M.a;
            C2358c f2 = C2358c.f.f(com.facebook.M.n());
            JSONArray jSONArray = new JSONArray();
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = "";
            }
            jSONArray.put(str3);
            if (f2 == null) {
                h2 = null;
            } else {
                h2 = f2.h();
            }
            if (h2 != null) {
                jSONArray.put(f2.h());
            } else {
                jSONArray.put("");
            }
            jSONArray.put("0");
            C5370bd c5370bd = C5370bd.a;
            if (C5370bd.f()) {
                str2 = "1";
            }
            jSONArray.put(str2);
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            Locale B = com.facebook.internal.l0.B();
            jSONArray.put(B.getLanguage() + '_' + ((Object) B.getCountry()));
            String jSONArray2 = jSONArray.toString();
            C6562gT0.o(jSONArray2, "extInfoArray.toString()");
            bundle.putString(EK.j, g());
            bundle.putString(EK.k, jSONArray2);
            S.c cVar = com.facebook.S.n;
            C8319ne2 c8319ne2 = C8319ne2.a;
            boolean z = true;
            String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
            C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
            JSONObject i = cVar.O(null, format, bundle, null).l().i();
            AtomicBoolean atomicBoolean = g;
            if (i == null || !i.optBoolean(EK.i, false)) {
                z = false;
            }
            atomicBoolean.set(z);
            if (!atomicBoolean.get()) {
                e = null;
            } else {
                C10673xH2 c10673xH2 = d;
                if (c10673xH2 != null) {
                    c10673xH2.j();
                }
            }
            h = false;
        } catch (Throwable th) {
            SQ.c(th, SE.class);
        }
    }

    @InterfaceC9511sW0
    public static final void e() {
        if (SQ.e(SE.class)) {
            return;
        }
        try {
            f.set(false);
        } catch (Throwable th) {
            SQ.c(th, SE.class);
        }
    }

    @InterfaceC9511sW0
    public static final void f() {
        if (SQ.e(SE.class)) {
            return;
        }
        try {
            f.set(true);
        } catch (Throwable th) {
            SQ.c(th, SE.class);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String g() {
        if (SQ.e(SE.class)) {
            return null;
        }
        try {
            if (e == null) {
                e = UUID.randomUUID().toString();
            }
            String str = e;
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Throwable th) {
            SQ.c(th, SE.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final boolean h() {
        if (SQ.e(SE.class)) {
            return false;
        }
        try {
            return g.get();
        } catch (Throwable th) {
            SQ.c(th, SE.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void j(@NotNull Activity activity) {
        if (SQ.e(SE.class)) {
            return;
        }
        try {
            C6562gT0.p(activity, androidx.appcompat.widget.b.r);
            UE.f.a().f(activity);
        } catch (Throwable th) {
            SQ.c(th, SE.class);
        }
    }

    @InterfaceC9511sW0
    public static final void k(@NotNull Activity activity) {
        if (!SQ.e(SE.class)) {
            try {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                if (f.get()) {
                    UE.f.a().j(activity);
                    C10673xH2 c10673xH2 = d;
                    if (c10673xH2 != null) {
                        c10673xH2.o();
                    }
                    SensorManager sensorManager = c;
                    if (sensorManager == null) {
                        return;
                    }
                    sensorManager.unregisterListener(b);
                }
            } catch (Throwable th) {
                SQ.c(th, SE.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void l(@NotNull Activity activity) {
        Boolean valueOf;
        SE se;
        if (!SQ.e(SE.class)) {
            try {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                if (f.get()) {
                    UE.f.a().e(activity);
                    Context applicationContext = activity.getApplicationContext();
                    com.facebook.M m = com.facebook.M.a;
                    final String o2 = com.facebook.M.o();
                    com.facebook.internal.C c2 = com.facebook.internal.C.a;
                    final C2379y f2 = com.facebook.internal.C.f(o2);
                    if (f2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(f2.c());
                    }
                    if (!C6562gT0.g(valueOf, Boolean.TRUE)) {
                        if (a.i()) {
                        }
                        se = a;
                        if (!se.i() && !g.get()) {
                            se.c(o2);
                            return;
                        }
                    }
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    if (sensorManager != null) {
                        c = sensorManager;
                        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                        C10673xH2 c10673xH2 = new C10673xH2(activity);
                        d = c10673xH2;
                        C10916yH2 c10916yH2 = b;
                        c10916yH2.a(new C10916yH2.b() { // from class: o.QE
                            @Override // o.C10916yH2.b
                            public final void a() {
                                SE.m(C2379y.this, o2);
                            }
                        });
                        sensorManager.registerListener(c10916yH2, defaultSensor, 2);
                        if (f2 != null && f2.c()) {
                            c10673xH2.j();
                        }
                        se = a;
                        if (!se.i()) {
                        }
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, SE.class);
            }
        }
    }

    public static final void m(C2379y c2379y, String str) {
        boolean z;
        if (!SQ.e(SE.class)) {
            try {
                C6562gT0.p(str, "$appId");
                if (c2379y != null && c2379y.c()) {
                    z = true;
                } else {
                    z = false;
                }
                com.facebook.M m = com.facebook.M.a;
                boolean x = com.facebook.M.x();
                if (z && x) {
                    a.c(str);
                }
            } catch (Throwable th) {
                SQ.c(th, SE.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void n(boolean z) {
        if (SQ.e(SE.class)) {
            return;
        }
        try {
            g.set(z);
        } catch (Throwable th) {
            SQ.c(th, SE.class);
        }
    }

    public final void c(final String str) {
        if (!SQ.e(this)) {
            try {
                if (h) {
                    return;
                }
                h = true;
                com.facebook.M m = com.facebook.M.a;
                com.facebook.M.y().execute(new Runnable() { // from class: o.RE
                    @Override // java.lang.Runnable
                    public final void run() {
                        SE.d(str);
                    }
                });
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    public final boolean i() {
        SQ.e(this);
        return false;
    }
}
