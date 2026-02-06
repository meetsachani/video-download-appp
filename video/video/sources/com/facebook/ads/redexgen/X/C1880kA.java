package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import o.C3307Iz;
import o.C8077mf;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.kA  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1880kA extends AbstractRunnableC1160Wc {
    public static byte[] A02;
    public final /* synthetic */ N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{36, 48, C3307Iz.Z, 51, 55, C3307Iz.Z, C3307Iz.d0, C3307Iz.V, 59, C8077mf.G, C3307Iz.V, 35, 50, 50, C3307Iz.c0, C3307Iz.d0, C3307Iz.X};
    }

    public C1880kA(N8 n8, String str) {
        this.A00 = n8;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        T8 t8;
        T8 t82;
        CountDownLatch countDownLatch;
        boolean A0J;
        N7 n7;
        N7 n72;
        N7 n73;
        String A00 = A00(0, 17, 81);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                n7 = this.A00.A02;
                ((C0936Nf) n7.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                n72 = this.A00.A02;
                n72.A07(this.A01);
                n73 = this.A00.A02;
                n73.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            t82 = this.A00.A03;
            t82.A08().ABC(A00, AbstractC1085Td.A1B, new C1086Te(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            t8 = this.A00.A03;
            t8.A08().ABC(A00, AbstractC1085Td.A1A, new C1086Te(e2));
        }
    }
}
