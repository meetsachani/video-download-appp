package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class WN {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-1, -5, -6, C8077mf.G, 9, C3307Iz.c0, C8077mf.H, 31, C3307Iz.d0};
    }

    public static SharedPreferences A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 9, 67), context), 0);
    }
}
