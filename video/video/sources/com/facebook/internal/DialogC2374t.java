package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.q0;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.t  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC2374t extends q0 {
    @NotNull
    public static final a x1 = new a(null);
    public static final String y1 = DialogC2374t.class.getName();
    public static final int z1 = 1500;
    public boolean w1;

    /* renamed from: com.facebook.internal.t$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final DialogC2374t a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
            C6562gT0.p(context, "context");
            C6562gT0.p(str, "url");
            C6562gT0.p(str2, "expectedRedirectUrl");
            q0.b bVar = q0.h1;
            q0.v(context);
            return new DialogC2374t(context, str, str2, null);
        }

        public a() {
        }
    }

    public /* synthetic */ DialogC2374t(Context context, String str, String str2, C9516sY c9516sY) {
        this(context, str, str2);
    }

    public static final void M(DialogC2374t dialogC2374t) {
        C6562gT0.p(dialogC2374t, "this$0");
        super.cancel();
    }

    @InterfaceC9511sW0
    @NotNull
    public static final DialogC2374t N(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        return x1.a(context, str, str2);
    }

    @Override // com.facebook.internal.q0
    @NotNull
    public Bundle B(@Nullable String str) {
        Uri parse = Uri.parse(str);
        l0 l0Var = l0.a;
        Bundle r0 = l0.r0(parse.getQuery());
        String string = r0.getString("bridge_args");
        r0.remove("bridge_args");
        if (!l0.f0(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                C2360e c2360e = C2360e.a;
                r0.putBundle(Z.L, C2360e.a(jSONObject));
            } catch (JSONException e) {
                l0 l0Var2 = l0.a;
                l0.n0(y1, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = r0.getString(c0.X);
        r0.remove(c0.X);
        l0 l0Var3 = l0.a;
        if (!l0.f0(string2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(string2);
                C2360e c2360e2 = C2360e.a;
                r0.putBundle(Z.N, C2360e.a(jSONObject2));
            } catch (JSONException e2) {
                l0 l0Var4 = l0.a;
                l0.n0(y1, "Unable to parse bridge_args JSON", e2);
            }
        }
        r0.remove("version");
        Z z = Z.a;
        r0.putInt(Z.H, Z.y());
        return r0;
    }

    @Override // com.facebook.internal.q0, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView u = u();
        if (x() && !w() && u != null && u.isShown()) {
            if (this.w1) {
                return;
            }
            this.w1 = true;
            u.loadUrl(C6562gT0.C("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    DialogC2374t.M(DialogC2374t.this);
                }
            }, 1500L);
            return;
        }
        super.cancel();
    }

    public DialogC2374t(Context context, String str, String str2) {
        super(context, str);
        F(str2);
    }
}
