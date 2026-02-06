package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class H5 {
    public static byte[] A03;
    public final H4 A00;
    public final Constructor<? extends H9> A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{55, 0, 0, C8077mf.G, 0, 82, C8077mf.E, 28, 1, 6, 19, 28, 6, C8077mf.E, 19, 6, C8077mf.E, 28, C8077mf.y, 82, C8077mf.A, 10, 6, C8077mf.A, 28, 1, C8077mf.E, C8077mf.G, 28, C3307Iz.X, C8077mf.H, C8077mf.y, 8, 0, C8077mf.y, 19, 4, C8077mf.y, C8077mf.x, 80, C8077mf.y, 2, 2, 31, 2, 80, 19, 2, C8077mf.y, 17, 4, C8077mf.C, C8077mf.H, C8077mf.A, 80, C8077mf.y, 8, 4, 2, 17, 19, 4, 31, 2};
    }

    public H5(H4 h4) {
        this.A00 = h4;
    }

    private Constructor<? extends H9> A01() {
        synchronized (this.A02) {
            if (this.A02.get()) {
                return this.A01;
            }
            try {
                return this.A00.A7R();
            } catch (ClassNotFoundException unused) {
                this.A02.set(true);
                return this.A01;
            } catch (Exception e) {
                throw new RuntimeException(A00(0, 29, 124), e);
            }
        }
    }

    public final H9 A03(Object... objArr) {
        Constructor<? extends H9> A01 = A01();
        if (A01 == null) {
            return null;
        }
        try {
            return A01.newInstance(objArr);
        } catch (Exception e) {
            throw new IllegalStateException(A00(29, 35, 126), e);
        }
    }
}
