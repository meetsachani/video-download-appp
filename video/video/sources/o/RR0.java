package o;

import com.facebook.internal.C2378x;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import java.util.List;
import java.util.Map;
import o.C9072qk1;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class RR0 {
    @NotNull
    public static final RR0 a = new RR0();
    @NotNull
    public static final String b = "none";
    @NotNull
    public static final String c = "address";
    @NotNull
    public static final String d = "health";
    @NotNull
    public static final String e = "_onDeviceParams";
    public static boolean f;
    public static boolean g;

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(RR0.class)) {
            return;
        }
        try {
            f = true;
            C2378x c2378x = C2378x.a;
            com.facebook.M m = com.facebook.M.a;
            g = C2378x.d("FBSDKFeatureIntegritySample", com.facebook.M.o(), false);
        } catch (Throwable th) {
            SQ.c(th, RR0.class);
        }
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull Map<String, String> map) {
        if (!SQ.e(RR0.class)) {
            try {
                C6562gT0.p(map, BreadcrumbAnalyticsEventReceiver.c);
                if (f && !map.isEmpty()) {
                    try {
                        List<String> Y5 = C10662xF.Y5(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : Y5) {
                            String str2 = map.get(str);
                            if (str2 != null) {
                                String str3 = str2;
                                RR0 rr0 = a;
                                if (!rr0.d(str) && !rr0.d(str3)) {
                                }
                                map.remove(str);
                                if (!g) {
                                    str3 = "";
                                }
                                jSONObject.put(str, str3);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        if (jSONObject.length() != 0) {
                            String jSONObject2 = jSONObject.toString();
                            C6562gT0.o(jSONObject2, "restrictiveParamJson.toString()");
                            map.put(e, jSONObject2);
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                SQ.c(th, RR0.class);
            }
        }
    }

    public final String b(String str) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            C9072qk1 c9072qk1 = C9072qk1.a;
            String[] q = C9072qk1.q(C9072qk1.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q == null) {
                return "none";
            }
            String str2 = q[0];
            if (str2 == null) {
                return "none";
            }
            return str2;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final boolean d(String str) {
        if (SQ.e(this)) {
            return false;
        }
        try {
            return !C6562gT0.g("none", b(str));
        } catch (Throwable th) {
            SQ.c(th, this);
            return false;
        }
    }
}
