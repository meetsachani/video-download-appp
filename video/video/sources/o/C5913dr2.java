package o;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.time.Instant;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.dr2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5913dr2 {
    @NotNull
    public static final C5913dr2 a = new C5913dr2();
    @NotNull
    public static final String b = "https";
    @NotNull
    public static final String c = "fb.gg";
    @NotNull
    public static final String d = "me";
    @NotNull
    public static final String e = "instant_tournament";

    @NotNull
    public final Bundle a(@NotNull com.facebook.gamingservices.E e2, @NotNull Number number, @NotNull String str) {
        Instant a2;
        long epochSecond;
        C6562gT0.p(e2, "config");
        C6562gT0.p(number, "score");
        C6562gT0.p(str, C9998uW1.f886o);
        Bundle bundle = new Bundle();
        bundle.putString(C9998uW1.o0, C9998uW1.n0);
        bundle.putString("app_id", str);
        bundle.putString("score", number.toString());
        EnumC6156er2 e3 = e2.e();
        if (e3 != null) {
            bundle.putString(C9998uW1.r0, e3.toString());
        }
        EnumC5186ar2 d2 = e2.d();
        if (d2 != null) {
            bundle.putString(C9998uW1.s0, d2.toString());
        }
        String f = e2.f();
        if (f != null) {
            bundle.putString(C9998uW1.u0, f.toString());
        }
        String c2 = e2.c();
        if (c2 != null) {
            bundle.putString(C9998uW1.v0, c2.toString());
        }
        if (Build.VERSION.SDK_INT >= 26 && (a2 = e2.a()) != null) {
            epochSecond = a2.getEpochSecond();
            bundle.putString(C9998uW1.t0, String.valueOf((int) epochSecond));
        }
        return bundle;
    }

    @NotNull
    public final Bundle b(@NotNull String str, @NotNull Number number, @NotNull String str2) {
        C6562gT0.p(str, "tournamentID");
        C6562gT0.p(number, "score");
        C6562gT0.p(str2, C9998uW1.f886o);
        Bundle bundle = new Bundle();
        bundle.putString(C9998uW1.o0, C9998uW1.n0);
        bundle.putString("app_id", str2);
        bundle.putString("score", number.toString());
        bundle.putString("tournament_id", str);
        return bundle;
    }

    @NotNull
    public final Uri c(@NotNull com.facebook.gamingservices.E e2, @NotNull Number number, @NotNull String str) {
        String instant;
        C6562gT0.p(e2, "config");
        C6562gT0.p(number, "score");
        C6562gT0.p(str, C9998uW1.f886o);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("fb.gg").appendPath("me").appendPath(e).appendPath(str).appendQueryParameter("score", number.toString());
        Instant a2 = e2.a();
        if (a2 != null) {
            instant = a2.toString();
            appendQueryParameter.appendQueryParameter(C9998uW1.t0, instant);
        }
        EnumC6156er2 e3 = e2.e();
        if (e3 != null) {
            appendQueryParameter.appendQueryParameter(C9998uW1.r0, e3.toString());
        }
        EnumC5186ar2 d2 = e2.d();
        if (d2 != null) {
            appendQueryParameter.appendQueryParameter(C9998uW1.s0, d2.toString());
        }
        String f = e2.f();
        if (f != null) {
            appendQueryParameter.appendQueryParameter(C9998uW1.u0, f);
        }
        String c2 = e2.c();
        if (c2 != null) {
            appendQueryParameter.appendQueryParameter(C9998uW1.v0, c2);
        }
        Uri build = appendQueryParameter.build();
        C6562gT0.o(build, "builder.build()");
        return build;
    }

    @NotNull
    public final Uri d(@NotNull String str, @NotNull Number number, @NotNull String str2) {
        C6562gT0.p(str, "tournamentID");
        C6562gT0.p(number, "score");
        C6562gT0.p(str2, C9998uW1.f886o);
        Uri build = new Uri.Builder().scheme("https").authority("fb.gg").appendPath("me").appendPath(e).appendPath(str2).appendQueryParameter("tournament_id", str).appendQueryParameter("score", number.toString()).build();
        C6562gT0.o(build, "Builder()\n        .scheme(scheme)\n        .authority(authority)\n        .appendPath(me)\n        .appendPath(tournament)\n        .appendPath(appID)\n        .appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID)\n        .appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE, score.toString())\n        .build()");
        return build;
    }
}
