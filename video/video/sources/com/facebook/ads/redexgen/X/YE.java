package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class YE implements ThreadFactory {
    public static byte[] A02;
    public final AtomicLong A01 = new AtomicLong();
    public int A00 = Thread.currentThread().getPriority();

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 92);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{C8077mf.C, C8077mf.y, C8077mf.A, 84, 28, C8077mf.E, C8077mf.C, 31, C8077mf.B, C8077mf.y, C8077mf.y, 17, 84, C8077mf.E, C8077mf.H, 9, 90, C8077mf.p, C8077mf.u, 8, 31, C8077mf.E, C8077mf.H, 87, 95, C8077mf.H, 90, 95, C8077mf.p, 60, 90, 95, 70, C8077mf.p, C3307Iz.f0, 5, C8077mf.C, 3, C8077mf.x, C8077mf.r, C8077mf.y, 2, C3307Iz.f0, C8077mf.u, C8077mf.H, 4, 31, 5, C8077mf.x, 3, C3307Iz.f0, 2, C8077mf.y, C8077mf.D, C3307Iz.f0, C8077mf.A, C8077mf.r, C8077mf.u, 5, C8077mf.H, 3, 8};
    }

    private final String A00() {
        return String.format(Locale.US, A01(0, 35, 38), Long.valueOf(this.A01.incrementAndGet()), Long.valueOf(System.currentTimeMillis()));
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AbstractC1091Tj.A00(A01(35, 27, 45));
        Thread thread = new Thread(null, runnable, A00(), 0L);
        thread.setPriority(this.A00);
        return thread;
    }
}
