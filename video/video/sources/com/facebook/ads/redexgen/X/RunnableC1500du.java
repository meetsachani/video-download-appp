package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.du  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1500du implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C04604e A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.z, C3307Iz.a0, 36, C3307Iz.X, 47, C8077mf.r, C3307Iz.d0, C3307Iz.V, 57, 34, C3307Iz.V, 35, C3307Iz.c0, 5, 50, 50, 47, 50};
    }

    public RunnableC1500du(C04604e c04604e) {
        this.A00 = c04604e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0Q(A00(0, 18, 81));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
