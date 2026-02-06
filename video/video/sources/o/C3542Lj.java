package o;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.C2326p;
import com.facebook.appevents.C2327q;
import com.facebook.internal.C2378x;
import com.facebook.internal.C2379y;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import o.HT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@HT1({HT1.a.Y})
/* renamed from: o.Lj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3542Lj {
    @NotNull
    public static final C3542Lj a = new C3542Lj();
    public static final String b = C3542Lj.class.getCanonicalName();
    @NotNull
    public static final String c = "app_events_if_auto_log_subs";
    @NotNull
    public static final com.facebook.appevents.K d;

    /* renamed from: o.Lj$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @NotNull
        public BigDecimal a;
        @NotNull
        public Currency b;
        @NotNull
        public Bundle c;

        public a(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @NotNull Bundle bundle) {
            C6562gT0.p(bigDecimal, "purchaseAmount");
            C6562gT0.p(currency, FirebaseAnalytics.Param.i);
            C6562gT0.p(bundle, "param");
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }

        @NotNull
        public final Currency a() {
            return this.b;
        }

        @NotNull
        public final Bundle b() {
            return this.c;
        }

        @NotNull
        public final BigDecimal c() {
            return this.a;
        }

        public final void d(@NotNull Currency currency) {
            C6562gT0.p(currency, "<set-?>");
            this.b = currency;
        }

        public final void e(@NotNull Bundle bundle) {
            C6562gT0.p(bundle, "<set-?>");
            this.c = bundle;
        }

        public final void f(@NotNull BigDecimal bigDecimal) {
            C6562gT0.p(bigDecimal, "<set-?>");
            this.a = bigDecimal;
        }
    }

    static {
        com.facebook.M m = com.facebook.M.a;
        d = new com.facebook.appevents.K(com.facebook.M.n());
    }

    @InterfaceC9511sW0
    public static final boolean c() {
        com.facebook.M m = com.facebook.M.a;
        String o2 = com.facebook.M.o();
        com.facebook.internal.C c2 = com.facebook.internal.C.a;
        C2379y f = com.facebook.internal.C.f(o2);
        if (f != null && com.facebook.M.s() && f.h()) {
            return true;
        }
        return false;
    }

    @InterfaceC9511sW0
    public static final void d() {
        com.facebook.M m = com.facebook.M.a;
        Context n = com.facebook.M.n();
        String o2 = com.facebook.M.o();
        if (com.facebook.M.s()) {
            if (n instanceof Application) {
                C2327q.b.b((Application) n, o2);
            } else {
                Log.w(b, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    @InterfaceC9511sW0
    public static final void e(@Nullable String str, long j) {
        com.facebook.M m = com.facebook.M.a;
        Context n = com.facebook.M.n();
        String o2 = com.facebook.M.o();
        com.facebook.internal.C c2 = com.facebook.internal.C.a;
        C2379y q = com.facebook.internal.C.q(o2, false);
        if (q != null && q.a() && j > 0) {
            com.facebook.appevents.K k = new com.facebook.appevents.K(n);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(FK.f, str);
            k.i(FK.e, j, bundle);
        }
    }

    @InterfaceC9511sW0
    public static final void f(@NotNull String str, @NotNull String str2, boolean z) {
        a a2;
        String str3;
        C6562gT0.p(str, FirebaseAnalytics.Event.D);
        C6562gT0.p(str2, "skuDetails");
        if (!c() || (a2 = a.a(str, str2)) == null) {
            return;
        }
        if (z) {
            C2378x c2378x = C2378x.a;
            com.facebook.M m = com.facebook.M.a;
            if (C2378x.d(c, com.facebook.M.o(), false)) {
                if (SO0.a.m(str2)) {
                    str3 = C2326p.y;
                } else {
                    str3 = C2326p.A;
                }
                d.o(str3, a2.c(), a2.a(), a2.b());
                return;
            }
        }
        d.p(a2.c(), a2.a(), a2.b());
    }

    public final a a(String str, String str2) {
        return b(str, str2, new HashMap());
    }

    public final a b(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(FK.g, jSONObject.getString(RO0.z));
            bundle.putCharSequence(FK.h, jSONObject.getString(UO0.e));
            bundle.putCharSequence(FK.i, jSONObject.getString(C9998uW1.j));
            bundle.putCharSequence(FK.m, jSONObject.optString("packageName"));
            bundle.putCharSequence(FK.k, jSONObject2.optString("title"));
            bundle.putCharSequence(FK.l, jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence(FK.j, optString);
            if (C6562gT0.g(optString, SO0.f)) {
                bundle.putCharSequence(FK.n, Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence(FK.f454o, jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence(FK.p, jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                C6562gT0.o(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    bundle.putCharSequence(FK.q, jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence(FK.r, optString2);
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putCharSequence(entry.getKey(), entry.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject2.getLong("price_amount_micros") / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            C6562gT0.o(currency, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new a(bigDecimal, currency, bundle);
        } catch (JSONException e) {
            Log.e(b, "Error parsing in-app subscription data.", e);
            return null;
        }
    }
}
