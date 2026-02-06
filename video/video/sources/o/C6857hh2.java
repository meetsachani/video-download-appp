package o;

import android.app.Activity;
import com.facebook.internal.C2379y;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C9072qk1;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.hh2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6857hh2 {
    @NotNull
    public static final C6857hh2 a = new C6857hh2();
    @NotNull
    public static final AtomicBoolean b = new AtomicBoolean(false);
    @NotNull
    public static final Set<String> c = new LinkedHashSet();
    @NotNull
    public static final Set<String> d = new LinkedHashSet();
    @NotNull
    public static final String e = "production_events";
    @NotNull
    public static final String f = "eligible_for_prediction_events";

    @InterfaceC9511sW0
    public static final synchronized void b() {
        synchronized (C6857hh2.class) {
            if (SQ.e(C6857hh2.class)) {
                return;
            }
            com.facebook.M m = com.facebook.M.a;
            com.facebook.M.y().execute(new Runnable() { // from class: o.gh2
                @Override // java.lang.Runnable
                public final void run() {
                    C6857hh2.c();
                }
            });
        }
    }

    public static final void c() {
        if (!SQ.e(C6857hh2.class)) {
            try {
                AtomicBoolean atomicBoolean = b;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
                a.d();
            } catch (Throwable th) {
                SQ.c(th, C6857hh2.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final boolean e(@NotNull String str) {
        if (SQ.e(C6857hh2.class)) {
            return false;
        }
        try {
            C6562gT0.p(str, "event");
            return d.contains(str);
        } catch (Throwable th) {
            SQ.c(th, C6857hh2.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean f() {
        if (SQ.e(C6857hh2.class)) {
            return false;
        }
        try {
            return b.get();
        } catch (Throwable th) {
            SQ.c(th, C6857hh2.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final boolean g(@NotNull String str) {
        if (SQ.e(C6857hh2.class)) {
            return false;
        }
        try {
            C6562gT0.p(str, "event");
            return c.contains(str);
        } catch (Throwable th) {
            SQ.c(th, C6857hh2.class);
            return false;
        }
    }

    @InterfaceC9511sW0
    public static final void i(@NotNull Activity activity) {
        if (!SQ.e(C6857hh2.class)) {
            try {
                C6562gT0.p(activity, androidx.appcompat.widget.b.r);
                try {
                    if (b.get()) {
                        C3167Hn0 c3167Hn0 = C3167Hn0.a;
                        if (C3167Hn0.f()) {
                            if (c.isEmpty()) {
                                if (!d.isEmpty()) {
                                }
                            }
                            JH2.Y0.a(activity);
                            return;
                        }
                    }
                    JH2.Y0.b(activity);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                SQ.c(th, C6857hh2.class);
            }
        }
    }

    public final void d() {
        String x;
        if (!SQ.e(this)) {
            try {
                com.facebook.internal.C c2 = com.facebook.internal.C.a;
                com.facebook.M m = com.facebook.M.a;
                C2379y q = com.facebook.internal.C.q(com.facebook.M.o(), false);
                if (q != null && (x = q.x()) != null) {
                    h(x);
                    if (c.isEmpty() && d.isEmpty()) {
                        return;
                    }
                    C9072qk1 c9072qk1 = C9072qk1.a;
                    File l = C9072qk1.l(C9072qk1.a.MTML_APP_EVENT_PREDICTION);
                    if (l != null) {
                        C3167Hn0 c3167Hn0 = C3167Hn0.a;
                        C3167Hn0.d(l);
                        C8912q5 c8912q5 = C8912q5.a;
                        Activity l2 = C8912q5.l();
                        if (l2 != null) {
                            i(l2);
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }

    @InterfaceC5056aJ2(otherwise = 2)
    public final void h(@Nullable String str) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (!SQ.e(this)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = 0;
                if (jSONObject.has(e) && (length2 = (jSONArray2 = jSONObject.getJSONArray(e)).length()) > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        Set<String> set = c;
                        String string = jSONArray2.getString(i2);
                        C6562gT0.o(string, "jsonArray.getString(i)");
                        set.add(string);
                        if (i3 >= length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                if (!jSONObject.has(f) || (length = (jSONArray = jSONObject.getJSONArray(f)).length()) <= 0) {
                    return;
                }
                while (true) {
                    int i4 = i + 1;
                    Set<String> set2 = d;
                    String string2 = jSONArray.getString(i);
                    C6562gT0.o(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                    if (i4 < length) {
                        i = i4;
                    } else {
                        return;
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                SQ.c(th, this);
            }
        }
    }
}
