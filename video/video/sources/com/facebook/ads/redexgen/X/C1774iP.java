package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdSettings;
import java.util.Arrays;
import java.util.Set;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.iP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1774iP implements U3 {
    public static byte[] A03;
    public final Bundle A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 11);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{83, 94, 94, 93, 78, 84, 73, 65, 93, 88, 82, 88, 69, 78, 69, 84, 66, 69, 78, 92, 94, 85, 84, 78, 90, 84, 72, 67, 78, 78, 77, 94, 72, 82, 94, 84, 79, 72, 85, 88, C8077mf.n, 1, 1, 2, 17, 3, 7, C8077mf.z, C8077mf.m, 10, 17, C8077mf.q, C8077mf.E, 10, 7, C8077mf.m, 0, 13, C8077mf.m, 17, 5, C8077mf.m, C8077mf.A, 32, C3307Iz.X, 48, C3307Iz.X, 59, 52, 54, C3307Iz.c0, C3307Iz.Z, C3307Iz.V, 55, 55, C3307Iz.e0, 42, 35, 59, C3307Iz.c0, 52, 48, C3307Iz.e0, C3307Iz.c0, 42, 55, 59, C3307Iz.Z, C3307Iz.c0, 49, 42, 48, 54, C4715Xk.i, 59, 47, C3307Iz.V, C4715Xk.i, 54, 51, C3307Iz.Y, 51, C3307Iz.e0, 34, 32, C4715Xk.i, 49, 55, C3307Iz.V, C3307Iz.V, 59, 60, 53, C3307Iz.e0, C4715Xk.i, 34, C3307Iz.Y, 59, C4715Xk.i, 60, C3307Iz.V, C3307Iz.e0, 57, 55, C3307Iz.c0, 7, 2, C8077mf.A, 2, 28, 19, 17, C8077mf.n, 0, 6, C8077mf.r, C8077mf.r, 10, 13, 4, 28, C8077mf.n, 19, C8077mf.A, 10, C8077mf.n, 13, C8077mf.r, 28, C8077mf.r, C8077mf.A, 2, C8077mf.A, 6, 28, 8, 6, C8077mf.D, 94, 89, 95, 82, 76, 73, 82, 89, 72, 94, 89, 82, 89, 84, 93, 72, 82, 70, 72, 84, 84, 83, 85, 88, 74, 66, 67, 78, 70, 83, 78, 72, 73, 88, 84, 66, 85, 81, 78, 68, 66, 88, 76, 66, 94};
    }

    public C1774iP(String str, String str2, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bundle;
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final String A79() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final String A7N() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final TM A7m(T8 t8) {
        String[] stringArray = this.A00.getStringArray(A00(98, 27, 121));
        Integer valueOf = Integer.valueOf(this.A00.getInt(A00(63, 35, 111), -1));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        Integer country = Integer.valueOf(this.A00.getInt(A00(125, 33, 72), -1));
        if (country.intValue() == -1) {
            country = null;
        }
        return new TM(stringArray, valueOf, country);
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final String A8W() {
        return this.A00.getString(A00(178, 25, 12));
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final String A9G() {
        AdSettings.TestAdType[] values;
        String string = this.A00.getString(A00(C3503Kz.r0, 20, 6));
        String adTestTypeStr = AdSettings.TestAdType.DEFAULT.getAdTypeString();
        if (adTestTypeStr.equals(string)) {
            return null;
        }
        for (AdSettings.TestAdType testAdType : AdSettings.TestAdType.values()) {
            String adTestTypeStr2 = testAdType.getAdTypeString();
            if (adTestTypeStr2.equals(string)) {
                String adTestTypeStr3 = testAdType.getAdTypeString();
                return adTestTypeStr3;
            }
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final boolean AAa() {
        return this.A00.getBoolean(A00(40, 23, 69));
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final boolean AAg() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final Boolean AAk() {
        Set<String> keySet = this.A00.keySet();
        String A00 = A00(27, 13, 10);
        if (keySet.contains(A00)) {
            return Boolean.valueOf(this.A00.getBoolean(A00));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.U3
    public final boolean isTestMode(Context context) {
        return this.A00.getBoolean(A00(0, 27, 26)) || AdSettings.isTestMode(context);
    }
}
