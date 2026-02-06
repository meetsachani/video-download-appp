package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.video.DummySurface;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Fi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class HandlerThreadC0734Fi extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"6kuie4aYgPB75l0BZDCG97Ci8L2oTJru", "l6cPtwgabkjuGz5CGYDwVz25JELI4cH1", "ZWx6OKWQHSAUUpB5i", "EzrPiu1XHV7NearbxEmg0OLwBftw8IiR", "WDaMG3q3woavC04Kn8C74ndkvxFOsuJP", "mphQp1xRvmcoCppqdKDkA9aBwN9eJkVD", "Bip3dWfDJBluF0z6EYAQ2tUBnuWGs1iH", "Qe"};
    public Handler A00;
    public C4G A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A06;
            if (strArr[6].charAt(1) == strArr[4].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "ZYchz1gCfuPSGZN7lZw97cRKorp74rZl";
            strArr2[4] = "DndbQji8K3ZDCB5sBvfJw1HHxvL19lCS";
            copyOfRange[i4] = (byte) (i5 ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 60, 36, 36, 48, C8077mf.D, 60, 59, 47, 40, 42, C3307Iz.d0, 58, C8077mf.G, C8077mf.y, C8077mf.r, C8077mf.C, C8077mf.B, 92, 8, 19, 92, C8077mf.y, C8077mf.u, C8077mf.y, 8, C8077mf.y, C8077mf.G, C8077mf.r, C8077mf.y, 6, C8077mf.C, 92, C8077mf.B, 9, 17, 17, 5, 92, C8077mf.q, 9, C8077mf.p, C8077mf.D, C8077mf.G, 31, C8077mf.C, 94, 121, 113, 116, 125, 124, 56, 108, 119, 56, 106, 125, 116, 125, 121, 107, 125, 56, 124, 109, 117, 117, 97, 56, 107, 109, 106, 126, 121, 123, 125, 49, 32, 56, 56, C3307Iz.d0, 6, 32, C3307Iz.Z, 51, 52, 54, 48};
    }

    static {
        A02();
    }

    public HandlerThreadC0734Fi() {
        super(A00(77, 12, 62));
    }

    private void A01() {
        AbstractC04543y.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        AbstractC04543y.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new C4G(this.A00);
        boolean z = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) AbstractC04543y.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        AbstractC04543y.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e) {
                        AbstractC04624g.A08(A00(0, 12, 34), A00(12, 34, 23), e);
                        this.A03 = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e2) {
                        AbstractC04624g.A08(A00(0, 12, 34), A00(12, 34, 23), e2);
                        this.A04 = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
