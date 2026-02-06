package o;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.bd  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5370bd {
    @NotNull
    public static final C5370bd a = new C5370bd();
    @NotNull
    public static final String b = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    @InterfaceC9511sW0
    @NotNull
    public static final String c(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b2 = bArr[i];
            i++;
            C8319ne2 c8319ne2 = C8319ne2.a;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1));
            C6562gT0.o(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        C6562gT0.o(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final String d() {
        com.facebook.M m = com.facebook.M.a;
        Context n = com.facebook.M.n();
        try {
            String str = n.getPackageManager().getPackageInfo(n.getPackageName(), 0).versionName;
            C6562gT0.o(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @InterfaceC9511sW0
    @Nullable
    public static final View e(@Nullable Activity activity) {
        if (SQ.e(C5370bd.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            SQ.c(th, C5370bd.class);
            return null;
        }
    }

    @InterfaceC9511sW0
    public static final boolean f() {
        String str = Build.FINGERPRINT;
        C6562gT0.o(str, "FINGERPRINT");
        if (!C9545sf2.J2(str, "generic", false, 2, null)) {
            C6562gT0.o(str, "FINGERPRINT");
            if (!C9545sf2.J2(str, "unknown", false, 2, null)) {
                String str2 = Build.MODEL;
                C6562gT0.o(str2, C8947qD2.g);
                if (!C10763xf2.n3(str2, "google_sdk", false, 2, null)) {
                    C6562gT0.o(str2, C8947qD2.g);
                    if (!C10763xf2.n3(str2, "Emulator", false, 2, null)) {
                        C6562gT0.o(str2, C8947qD2.g);
                        if (!C10763xf2.n3(str2, "Android SDK built for x86", false, 2, null)) {
                            String str3 = Build.MANUFACTURER;
                            C6562gT0.o(str3, "MANUFACTURER");
                            if (!C10763xf2.n3(str3, "Genymotion", false, 2, null)) {
                                String str4 = Build.BRAND;
                                C6562gT0.o(str4, "BRAND");
                                if (C9545sf2.J2(str4, "generic", false, 2, null)) {
                                    String str5 = Build.DEVICE;
                                    C6562gT0.o(str5, "DEVICE");
                                    if (C9545sf2.J2(str5, "generic", false, 2, null)) {
                                        return true;
                                    }
                                }
                                if (!C6562gT0.g("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @InterfaceC9511sW0
    public static final boolean g() {
        return C6562gT0.g(Looper.myLooper(), Looper.getMainLooper());
    }

    @InterfaceC9511sW0
    public static final double h(@Nullable String str) {
        try {
            Matcher matcher = Pattern.compile(b, 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            String group = matcher.group(0);
            com.facebook.internal.l0 l0Var = com.facebook.internal.l0.a;
            return NumberFormat.getNumberInstance(com.facebook.internal.l0.B()).parse(group).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    @InterfaceC9511sW0
    public static final void a() {
    }

    @InterfaceC9511sW0
    public static final void b() {
    }
}
