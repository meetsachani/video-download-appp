package o;

import android.content.Context;
import com.facebook.appevents.C2327q;
import com.facebook.internal.C2358c;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.id  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7081id {
    @NotNull
    public static final C7081id a = new C7081id();
    @NotNull
    public static final Map<a, String> b = C8926q81.M(C6670gv2.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), C6670gv2.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* renamed from: o.id$a */
    /* loaded from: classes2.dex */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    @InterfaceC9511sW0
    @NotNull
    public static final JSONObject a(@NotNull a aVar, @Nullable C2358c c2358c, @Nullable String str, boolean z, @NotNull Context context) throws JSONException {
        C6562gT0.p(aVar, "activityType");
        C6562gT0.p(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", b.get(aVar));
        String i = C2327q.b.i();
        if (i != null) {
            jSONObject.put("app_user_id", i);
        }
        com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
        com.facebook.internal.l0.I0(jSONObject, c2358c, str, z, context);
        try {
            com.facebook.internal.l0.J0(jSONObject, context);
        } catch (Exception e) {
            com.facebook.internal.V.e.e(com.facebook.b0.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        com.facebook.internal.l0 l0Var2 = com.facebook.internal.l0.a;
        JSONObject D = com.facebook.internal.l0.D();
        if (D != null) {
            Iterator<String> keys = D.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, D.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
