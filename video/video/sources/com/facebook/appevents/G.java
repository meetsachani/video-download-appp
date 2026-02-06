package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.facebook.appevents.K;
import com.facebook.b0;
import com.facebook.internal.V;
import java.util.Iterator;
import o.C6562gT0;
import o.C9516sY;
import o.SQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class G {
    @NotNull
    public static final a c = new a(null);
    public static final String d = G.class.getSimpleName();
    @NotNull
    public static final String e = "_fb_pixel_referral_id";
    @Nullable
    public final Context a;
    @NotNull
    public final String b = "fbmq-0.1";

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final String b() {
            return G.a();
        }

        public final Bundle c(String str) {
            try {
                return d(new JSONObject(str));
            } catch (JSONException unused) {
                return new Bundle();
            }
        }

        public final Bundle d(JSONObject jSONObject) throws JSONException {
            Bundle bundle = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            C6562gT0.o(keys, "jsonObject.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null) {
                    String str = next;
                    bundle.putString(str, jSONObject.getString(str));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            return bundle;
        }

        public a() {
        }
    }

    public G(@Nullable Context context) {
        this.a = context;
    }

    public static final /* synthetic */ String a() {
        if (SQ.e(G.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            SQ.c(th, G.class);
            return null;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getProtocol() {
        if (SQ.e(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    @JavascriptInterface
    public final void sendEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (SQ.e(this)) {
            return;
        }
        try {
            if (str == null) {
                V.a aVar = V.e;
                b0 b0Var = b0.DEVELOPER_ERRORS;
                String str4 = d;
                C6562gT0.o(str4, "TAG");
                aVar.d(b0Var, str4, "Can't bridge an event without a referral Pixel ID. Check your webview Pixel configuration");
                return;
            }
            K d2 = K.a.d(K.b, this.a, null, 2, null);
            Bundle c2 = c.c(str3);
            c2.putString(e, str);
            d2.j(str2, c2);
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
