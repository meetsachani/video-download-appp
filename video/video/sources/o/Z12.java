package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.C2326p;
import com.facebook.appevents.C2327q;
import com.facebook.appevents.K;
import com.facebook.internal.V;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class Z12 {
    @NotNull
    public static final String b = "PCKGCHKSUM";
    @NotNull
    public static final Z12 a = new Z12();
    public static final String c = Z12.class.getCanonicalName();
    @NotNull
    public static final long[] d = {300000, DC1.g, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    @InterfaceC9511sW0
    public static final int b(long j) {
        if (SQ.e(Z12.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = d;
                if (i >= jArr.length || jArr[i] >= j) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                SQ.c(th, Z12.class);
                return 0;
            }
        }
        return i;
    }

    @InterfaceC9511sW0
    public static final void c(@NotNull String str, @Nullable C7313ja2 c7313ja2, @Nullable String str2, @NotNull Context context) {
        String c7313ja22;
        if (!SQ.e(Z12.class)) {
            try {
                C6562gT0.p(str, "activityName");
                C6562gT0.p(context, "context");
                String str3 = "Unclassified";
                if (c7313ja2 != null && (c7313ja22 = c7313ja2.toString()) != null) {
                    str3 = c7313ja22;
                }
                Bundle bundle = new Bundle();
                bundle.putString(C2326p.Z, str3);
                bundle.putString(C2326p.a0, a.a(context));
                C4184Rz c4184Rz = C4184Rz.a;
                bundle.putString(C2326p.b0, C4184Rz.a(context));
                K.a aVar = com.facebook.appevents.K.b;
                com.facebook.appevents.K c2 = aVar.c(str, str2, null);
                c2.j(C2326p.b, bundle);
                if (aVar.f() != C2327q.b.EXPLICIT_ONLY) {
                    c2.d();
                }
            } catch (Throwable th) {
                SQ.c(th, Z12.class);
            }
        }
    }

    @InterfaceC9511sW0
    public static final void e(@NotNull String str, @Nullable X12 x12, @Nullable String str2) {
        long longValue;
        String c7313ja2;
        long longValue2;
        if (!SQ.e(Z12.class)) {
            try {
                C6562gT0.p(str, "activityName");
                if (x12 == null) {
                    return;
                }
                Long c2 = x12.c();
                long j = 0;
                if (c2 == null) {
                    Long f = x12.f();
                    if (f == null) {
                        longValue2 = 0;
                    } else {
                        longValue2 = f.longValue();
                    }
                    longValue = 0 - longValue2;
                } else {
                    longValue = c2.longValue();
                }
                if (longValue < 0) {
                    a.d();
                    longValue = 0;
                }
                long g = x12.g();
                if (g < 0) {
                    a.d();
                    g = 0;
                }
                Bundle bundle = new Bundle();
                bundle.putInt(C2326p.d, x12.d());
                C8319ne2 c8319ne2 = C8319ne2.a;
                String format = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(longValue))}, 1));
                C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString(C2326p.e, format);
                C7313ja2 i = x12.i();
                String str3 = "Unclassified";
                if (i != null && (c7313ja2 = i.toString()) != null) {
                    str3 = c7313ja2;
                }
                bundle.putString(C2326p.Z, str3);
                Long f2 = x12.f();
                if (f2 != null) {
                    j = f2.longValue();
                }
                bundle.putLong(FK.b, j / 1000);
                com.facebook.appevents.K.b.c(str, str2, null).i(C2326p.c, g / 1000, bundle);
            } catch (Throwable th) {
                SQ.c(th, Z12.class);
            }
        }
    }

    public final String a(Context context) {
        if (SQ.e(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String C = C6562gT0.C("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(C, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            C10910yG0 c10910yG0 = C10910yG0.a;
            String c2 = C10910yG0.c(context, null);
            if (c2 == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                C6562gT0.o(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                c2 = C10910yG0.b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(C, c2).apply();
            return c2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            SQ.c(th, this);
            return null;
        }
    }

    public final void d() {
        if (SQ.e(this)) {
            return;
        }
        try {
            V.a aVar = com.facebook.internal.V.e;
            com.facebook.b0 b0Var = com.facebook.b0.APP_EVENTS;
            String str = c;
            C6562gT0.m(str);
            aVar.d(b0Var, str, "Clock skew detected");
        } catch (Throwable th) {
            SQ.c(th, this);
        }
    }
}
