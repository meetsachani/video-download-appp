package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Yx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1230Yx implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ C05226o A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, 13, C8077mf.y, C8077mf.p, 13, C8077mf.q, 7, C3307Iz.a0, C8077mf.H, C8077mf.H, 3, C8077mf.H};
    }

    static {
        A01();
    }

    public RunnableC1230Yx(C05226o c05226o) {
        this.A00 = c05226o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0710Ek c0710Ek;
        if (WU.A02(this)) {
            return;
        }
        try {
            c0710Ek = this.A00.A00.A06;
            c0710Ek.A0b(10);
            ((AbstractC0973Oq) this.A00.A00).A08.A0F().A3a(A00(0, 18, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
