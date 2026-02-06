package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.rG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2286rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2285rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, C3307Iz.a0, C8077mf.C, 56, 49, 60, 36};
    }

    public RunnableC2286rG(C2285rF c2285rF, int i, Exception exc) {
        this.A01 = c2285rF;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC1729hc interfaceC1729hc;
        Handler handler;
        Runnable runnable;
        boolean A0B;
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                z = this.A01.A01;
                if (z) {
                    if (C0612Ao.A07) {
                        A0B = this.A01.A0B();
                        if (A0B) {
                            this.A01.A0F();
                            return;
                        }
                    }
                    C2285rF c2285rF = this.A01;
                    interfaceC1729hc = this.A01.A05;
                    c2285rF.A08(interfaceC1729hc.ACf());
                    C2285rF.A03(this.A01);
                    if (0 == 0) {
                        int delay = this.A00;
                        handler = this.A01.A04;
                        runnable = this.A01.A0C;
                        handler.postDelayed(runnable, delay);
                        return;
                    }
                    C2285rF.A03(this.A01);
                    throw new NullPointerException(A00(0, 8, 12));
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
