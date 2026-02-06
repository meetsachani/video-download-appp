package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Wc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractRunnableC1160Wc implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<WS> A04;
    public final WQ A00;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{C3307Iz.d0, C8077mf.m, C8077mf.r, C8077mf.r, 31, 28, C8077mf.u, C8077mf.E, 94, C8077mf.G, C8077mf.n, C8077mf.E, 31, 10, C8077mf.E, C8077mf.D, 80, 94, 42, C8077mf.z, C8077mf.n, C8077mf.E, 31, C8077mf.D, 68, 94};
    }

    public abstract void A07();

    static {
        A03();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public AbstractRunnableC1160Wc() {
        if (A03.get()) {
            this.A00 = C1165Wh.A01(new C1164Wg(A02(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A04(boolean z) {
        A03.set(z);
    }

    public static void A05(boolean z, WS ws) {
        A02.set(z);
        A04.set(ws);
    }

    public final WQ A06() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C1165Wh.A03(this);
            }
            A07();
            if (A03.get()) {
                C1165Wh.A04(this);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
