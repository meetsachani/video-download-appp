package o;

import android.net.Uri;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Zq2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4946Zq2 {
    @NotNull
    public static final C4946Zq2 a = new C4946Zq2();

    public static /* synthetic */ Bundle c(C4946Zq2 c4946Zq2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c4946Zq2.b(str, str2, str3);
    }

    public static /* synthetic */ Uri e(C4946Zq2 c4946Zq2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4946Zq2.d(str, str2);
    }

    public final Uri.Builder a() {
        Uri.Builder scheme = new Uri.Builder().scheme("https");
        com.facebook.M m = com.facebook.M.a;
        Uri.Builder appendPath = scheme.authority(com.facebook.M.A()).appendPath("dialog").appendPath(com.facebook.gamingservices.J.q);
        C6562gT0.o(appendPath, "Builder()\n                .scheme(\"https\")\n                .authority(FacebookSdk.getFacebookGamingDomain())\n                .appendPath(\"dialog\")\n                .appendPath(\"join_tournament\")");
        return appendPath;
    }

    @NotNull
    public final Bundle b(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        C6562gT0.p(str, C9998uW1.f886o);
        Bundle bundle = new Bundle();
        bundle.putString(C9998uW1.o0, C9998uW1.n0);
        bundle.putString("app_id", str);
        if (str2 != null) {
            bundle.putString("tournament_id", str2);
        }
        if (str3 == null) {
            return bundle;
        }
        bundle.putString("payload", str3);
        return bundle;
    }

    @NotNull
    public final Uri d(@Nullable String str, @Nullable String str2) {
        Uri.Builder a2 = a();
        if (str != null) {
            a2.appendQueryParameter("tournament_id", str);
        }
        if (str2 != null) {
            a2.appendQueryParameter("payload", str2);
        }
        Uri build = a2.build();
        C6562gT0.o(build, "builder.build()");
        return build;
    }
}
