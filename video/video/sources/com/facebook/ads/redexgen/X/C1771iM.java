package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;
import java.util.Arrays;
import o.AD1;
import o.C3307Iz;
import o.C8077mf;
import o.FF0;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.iM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1771iM implements OQ {
    public static byte[] A06;
    public static String[] A07 = {"hwQkg6wydYZbPmHd9ra1rendlmZDH9o", "EZChF1CYxmcTUt5XULmCX0u1P", "cTSi58RkvxQZRZutX5Kpp639urCcNivT", "ILotitRaBN9o4fzRERLTj8sSXBTWlTTb", "JZvxvLc", "wZ48NZZ1KfL4Szkg73ZSFlGgbHtYLjcz", "R8pWvTFrbs0CFqCxyNRNjvJ5bjwX3", "qzEf3MAjBvJJtqQXUiJPrqpPaexFktRV"};
    public boolean A00;
    public final AbstractC1794ik A01;
    public final OE A02;
    public final OL A03;
    public final C1768iI A04;
    public final C1673gi A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{87, 114, 54, 121, 116, 124, 115, 117, 98, 54, Byte.MAX_VALUE, 101, 54, QC1.w, 99, 122, 122, 3, C8077mf.x, C8077mf.q, 5, 13, 4, C8077mf.H, 4, C8077mf.C, C8077mf.y, 19, 0, C8077mf.u, C8077mf.H, 10, 4, C8077mf.B, 65, 69, 70, 114, 99, 110, 98, 105, 100, 98, 73, 98, 115, 112, 104, 117, 108, 94, 89, 67, 72, 82, 69, 69, 88, 69, 72, 84, 88, 83, 82, 72, 92, 82, 78, 96, 103, 125, 118, 123, Byte.MAX_VALUE, 118, Byte.MAX_VALUE, 96, 109, 108, 102, 118, 109, 124, 123, 104, 125, 96, 102, 103, 118, 98, 108, 112, 67, 64, 65, 72, 80, 70, 65, 89, 78, 67, 70, 75, 78, 91, 70, 64, 65, 80, 91, 70, 66, 74, 80, 68, 74, 86, 34, 10, 28, 28, C8077mf.p, 8, 10, 85, 79, Byte.MAX_VALUE, 91, 65, 65, 91, 92, 85, C8077mf.u, 80, 71, 92, 86, 94, 87, C8077mf.u, 84, 93, 64, C8077mf.u, 95, 87, 65, 65, 83, 85, 87, 9, C3307Iz.e0, 55, 55, C3307Iz.e0, 42, 35, 100, C3307Iz.Y, 49, 42, 32, 40, C3307Iz.V, 100, 34, C3307Iz.c0, 54, 100, C3307Iz.a0, C3307Iz.V, 55, 55, C3307Iz.X, 35, C3307Iz.V, 106, 54, 49, 55, 58, 32, 55, 55, 42, 55, 58, 40, 32, 54, 54, 36, 34, 32, 58, C3307Iz.f0, 32, 60, 5, C8077mf.x, 13};
    }

    static {
        A01();
    }

    public C1771iM(C1673gi c1673gi, C1768iI c1768iI, OE oe, AbstractC1794ik abstractC1794ik, OL ol) {
        this.A05 = c1673gi;
        this.A04 = c1768iI;
        this.A02 = oe;
        this.A01 = abstractC1794ik;
        this.A03 = ol;
    }

    @Override // com.facebook.ads.redexgen.X.OQ
    public final Bundle A5R(String str) {
        return OX.A03(str, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.OQ
    public final void A5v() {
        this.A03.A0F(2002, null);
        this.A03.A0C();
        this.A04.A02(null);
    }

    @Override // com.facebook.ads.redexgen.X.OQ
    public final int A8P() {
        return 2000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014a, code lost:
        if (r4 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014c, code lost:
        r9.A04.A04.onAdLoaded(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0153, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015b, code lost:
        if (r4 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015e, code lost:
        r9.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    @Override // com.facebook.ads.redexgen.X.OQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A9j(Message message) {
        com.facebook.ads.Ad A6k = this.A04.A6k();
        String A00 = A00(203, 3, 38);
        if (A6k == null) {
            this.A05.A08().ABC(A00, AbstractC1085Td.A0K, new C1086Te(A00(0, 17, 84)));
            return;
        }
        int i = message.what;
        String A002 = A00(120, 9, 45);
        String A003 = A00(17, 17, 3);
        switch (i) {
            case 10:
            case 2103:
                Bundle bundle = message.getData().getBundle(A003);
                if (bundle != null) {
                    int i2 = bundle.getInt(A00(51, 18, 85));
                    String string = bundle.getString(A00(FF0.q, 21, 39));
                    AdError adError = new AdError(i2, string);
                    this.A02.AJR(adError);
                    if (this.A04.A04 != null) {
                        this.A04.A04.onError(A6k, adError);
                    } else {
                        Log.e(A00(34, 17, 69), string);
                    }
                } else {
                    this.A02.AJM(OD.A04);
                    String errorMessage = A002 + message;
                    this.A05.A08().ABC(A00, AbstractC1085Td.A0V, new C1086Te(A00(155, 27, 6), errorMessage));
                }
                this.A04.A02(null);
                return;
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                this.A02.AJW();
                Bundle bundle2 = message.getData().getBundle(A003);
                if (bundle2 != null) {
                    this.A04.A01 = bundle2.getLong(A00(94, 26, 77));
                    this.A04.A00 = bundle2.getInt(A00(69, 25, 107));
                } else {
                    this.A05.A08().ABC(A00, AbstractC1085Td.A0V, new C1086Te(A00(129, 26, 112), A002 + message));
                }
                C1768iI c1768iI = this.A04;
                if (A07[0].length() == 31) {
                    A07[4] = "nZDiJI4iz";
                    c1768iI.A02(null);
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 2106:
                this.A04.A02(null);
                break;
            case 2110:
                this.A02.AJm();
                break;
        }
        if (this.A04.A04 == null) {
            return;
        }
        switch (message.what) {
            case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                boolean z = this.A00;
                if (A07[7].charAt(6) == 'M') {
                    A07[3] = "qK0IooEpc5XoMFwfzvHEQuTBU9uHuwow";
                    break;
                } else {
                    A07[4] = "TwWthT4PMcqNyudS0vukG";
                    break;
                }
            case 2104:
                this.A04.A04.onAdClicked(A6k);
                return;
            case 2105:
                this.A04.A04.onLoggingImpression(A6k);
                return;
            case 2106:
                if (this.A04.A04 instanceof RewardedVideoAdExtendedListener) {
                    ((RewardedVideoAdExtendedListener) this.A04.A04).onRewardedVideoActivityDestroyed();
                    return;
                }
                return;
            case 2110:
                this.A04.A04.onRewardedVideoClosed();
                return;
            case 3000:
                this.A04.A04.onRewardedVideoCompleted();
                return;
            case 3001:
                if (this.A04.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A04.A04).onRewardServerSuccess();
                    return;
                }
                return;
            case AD1.m1 /* 3002 */:
                if (this.A04.A04 instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) this.A04.A04).onRewardServerFailed();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OQ
    public final void AJn(boolean z) {
        this.A00 = z;
    }
}
