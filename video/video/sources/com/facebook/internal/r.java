package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;
import o.B22;
import o.C10662xF;
import o.C6562gT0;
import o.C9545sf2;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class r {
    @NotNull
    public static final r a = new r();
    @NotNull
    public static final String d = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
    @NotNull
    public static final String e = "cc2751449a350f668590264ed76692694a80308a";
    @NotNull
    public static final String b = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
    @NotNull
    public static final String c = "df6b721c8b4d3b6eb44c861d4415007e5a35fc95";
    @NotNull
    public static final String f = "9b8f518b086098de3d77736f9458a3d2f6f95a37";
    @NotNull
    public static final String g = "2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3";
    @NotNull
    public static final String h = "c56fb7d591ba6704df047fd98f535372fea00211";
    @NotNull
    public static final HashSet<String> i = B22.m(d, e, b, c, f, g, h);

    @InterfaceC9511sW0
    public static final boolean a(@NotNull Context context, @NotNull String str) {
        C6562gT0.p(context, "context");
        C6562gT0.p(str, "packageName");
        String str2 = Build.BRAND;
        int i2 = context.getApplicationInfo().flags;
        C6562gT0.o(str2, "brand");
        if (C9545sf2.J2(str2, "generic", false, 2, null) && (i2 & 2) != 0) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                C6562gT0.o(signatureArr, "packageInfo.signatures");
                if (signatureArr.length != 0) {
                    Signature[] signatureArr2 = packageInfo.signatures;
                    C6562gT0.o(signatureArr2, "packageInfo.signatures");
                    for (Signature signature : signatureArr2) {
                        HashSet<String> hashSet = i;
                        l0 l0Var = l0.a;
                        byte[] byteArray = signature.toByteArray();
                        C6562gT0.o(byteArray, "it.toByteArray()");
                        if (!C10662xF.Y1(hashSet, l0.Q0(byteArray))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
