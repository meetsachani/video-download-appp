package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.W12;

/* renamed from: com.facebook.ads.redexgen.X.jz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1869jz implements N1, InterfaceC0950Nt {
    public static byte[] A0B;
    public static String[] A0C = {"Tri2", "1D6RXHNY", "CY2J", "FG3HLf7FRck3Q4", "aTw9XxKg19aD2PWH35UjlgQd", "aN0Sboz7ddtAAnQUWG6qQ4oJRDDzSUBt", "pWs", W12.r};
    public long A00;
    public RewardData A01;
    public NC A02;
    public ND A03;
    public C0951Nu A04;
    public C1673gi A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 84);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0B = new byte[]{-37, -7, 6, -65, C8077mf.n, -72, C8077mf.m, C8077mf.n, -7, 10, C8077mf.n, -72, C2638Cg0.E7, 13, -4, 1, -3, 6, -5, -3, -26, -3, C8077mf.n, C8077mf.q, 7, 10, 3, C2638Cg0.E7, -5, C8077mf.n, 1, C8077mf.p, 1, C8077mf.n, 17, C2638Cg0.t7, -72, -27, -7, 3, -3, -72, C8077mf.m, 13, 10, -3, -72, C8077mf.n, 0, -7, C8077mf.n, -72, 1, C8077mf.n, -65, C8077mf.m, -72, 1, 6, -72, 17, 7, 13, 10, -72, C2638Cg0.E7, 6, -4, 10, 7, 1, -4, -27, -7, 6, 1, -2, -3, C8077mf.m, C8077mf.n, C2638Cg0.t7, C8077mf.r, 5, 4, -72, -2, 1, 4, -3, C2638Cg0.t7, -16, -20, -21, 31, C8077mf.p, 19, C8077mf.q, C8077mf.B, 13, C8077mf.q, -8, C8077mf.q, C8077mf.H, C3307Iz.V, C8077mf.C, 28, C8077mf.y, C2638Cg0.v7, -48, -35, C2638Cg0.z7, -48, -46, -29, C2638Cg0.n7, -27, C2638Cg0.n7, -29, -24, -1, -9, -10, -5, -13, 6, -5, 1, 0, -42, -13, 6, -13, C8077mf.r, C8077mf.n, 1, 3, 5, 13, 5, C8077mf.p, C8077mf.x, -23, 4, C2638Cg0.v7, C2638Cg0.x7, -66, -67, -66, -65, C2638Cg0.q7, C2638Cg0.u7, -66, -67, -88, C2638Cg0.x7, C2638Cg0.q7, -66, C2638Cg0.u7, C2638Cg0.y7, -70, C2638Cg0.y7, C2638Cg0.q7, -56, C2638Cg0.u7, -92, -66, -46, -7, -20, -8, -4, -20, -6, -5, -37, -16, -12, -20, -6, -13, -18, -10, -6, -22, C2638Cg0.z7, -23, 34, C8077mf.y, 17, 35, 0, C3307Iz.X, 28, 17, C8077mf.n, -2, 3, -7, 4, C8077mf.n};
    }

    static {
        A05();
    }

    private int A00() {
        WindowManager windowManager = (WindowManager) this.A05.getSystemService(A03(194, 6, 65));
        int rotation = windowManager.getDefaultDisplay().getRotation();
        EnumC1334bD A02 = A02();
        if (A02 == EnumC1334bD.A05) {
            String[] strArr = A0C;
            String str = strArr[4];
            String str2 = strArr[7];
            int rotation2 = str.length();
            if (rotation2 != str2.length()) {
                String[] strArr2 = A0C;
                strArr2[6] = "b7o";
                strArr2[3] = "Q7inAkPu5HYVeU";
                return -1;
            }
        } else if (A02 == EnumC1334bD.A03) {
            switch (rotation) {
                case 2:
                case 3:
                    int rotation3 = A0C[1].length();
                    if (rotation3 != 29) {
                        String[] strArr3 = A0C;
                        strArr3[6] = "bcp";
                        strArr3[3] = "BEZRNTMscmchpM";
                        return 8;
                    }
                    break;
                default:
                    return 0;
            }
        } else {
            switch (rotation) {
                case 2:
                    return 9;
                default:
                    String[] strArr4 = A0C;
                    String str3 = strArr4[4];
                    String str4 = strArr4[7];
                    int rotation4 = str3.length();
                    if (rotation4 != str4.length()) {
                        String[] strArr5 = A0C;
                        strArr5[0] = "VdY7";
                        strArr5[2] = "KFhl";
                        return 1;
                    }
                    throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }

    private final WK A01() {
        return this.A04.A0E();
    }

    private EnumC1334bD A02() {
        return this.A04.A0F();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        this.A04.A0I(intent, this.A01, C1541ea.A04(this.A01, this.A0A, this.A06));
    }

    private final void A07(C1673gi c1673gi, NC nc, O8 o8, EnumSet<CacheFlag> cacheFlags, String str) {
        C0951Nu c0951Nu = new C0951Nu(c1673gi, o8, this, str);
        NQ A0D = c0951Nu.A0D();
        if (C1123Up.A0v(c1673gi) && (A0D instanceof AbstractC1847jd) && AbstractC0929Mx.A06(this.A05, AbstractC0929Mx.A01(c1673gi, o8.A03(), ((AbstractC1847jd) A0D).A2E()), c1673gi.A0A())) {
            this.A05.A0F().A52();
            this.A02.AEG(this, AdError.NO_FILL);
            return;
        }
        this.A04 = c0951Nu;
        A08(c0951Nu.A0E());
        c0951Nu.A0J(c1673gi, cacheFlags);
    }

    private void A08(WK wk) {
        if (wk.equals(WK.A04)) {
            this.A05.A0F().AJt(M5.A05);
        } else if (wk.equals(WK.A0A)) {
            this.A05.A0F().AJt(M5.A04);
        } else if (wk.equals(WK.A0B)) {
            this.A05.A0F().AJt(M5.A0B);
        } else if (wk.equals(WK.A0D)) {
            this.A05.A0F().AJt(M5.A0D);
        } else if (wk.equals(WK.A0C)) {
            this.A05.A0F().AJt(M5.A0C);
        } else if (!wk.equals(WK.A06)) {
        } else {
            if (this.A04.A0K()) {
                this.A05.A0F().AJt(M5.A08);
            } else if ((A09() instanceof AbstractC1847jd) && this.A04.A0L((AbstractC1847jd) A09())) {
                InterfaceC0899Lt A0F = this.A05.A0F();
                if (A0C[1].length() == 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A0C;
                strArr[6] = "5zP";
                strArr[3] = "kcwn0HZtMTZNOx";
                A0F.AJt(M5.A0A);
            } else {
                this.A05.A0F().AJt(M5.A09);
            }
        }
    }

    public final NQ A09() {
        return this.A04.A0D();
    }

    public final void A0A(C1673gi c1673gi, NC nc, O8 o8, EnumSet<CacheFlag> enumSet, String str, String str2, RewardData rewardData) {
        this.A05 = c1673gi;
        this.A02 = nc;
        this.A08 = o8.A02();
        this.A06 = this.A08 != null ? this.A08.split(A03(107, 1, 22))[0] : A03(0, 0, 85);
        this.A00 = o8.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c1673gi, nc, o8, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            if (this.A02 != null) {
                this.A02.AEG(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A05 = C1177Wu.A05(this.A05);
        A05.putExtra(A03(C3503Kz.g0, 24, 5), A00());
        A05.putExtra(A03(178, 8, 49), this.A0A);
        A05.putExtra(A03(C3503Kz.V, 11, 76), this.A08);
        A05.putExtra(A03(167, 11, 51), this.A00);
        WK A01 = A01();
        A08(A01);
        A05.putExtra(A03(C10997yd1.Q1, 8, 88), A01);
        if (this.A07 != null) {
            A05.putExtra(A03(119, 13, 62), this.A07);
        }
        A06(A05);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            String[] strArr = A0C;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "Sc68";
            strArr2[2] = "wieN";
            A05.addFlags(268435456);
        }
        try {
            ActivityUtils.A03(this.A05);
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C1177Wu.A0I(this.A05, A05)) {
                    this.A05.A0F().AIC();
                    if (this.A02 != null) {
                        this.A02.AEG(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C1177Wu.A0B(this.A05, A05);
            return true;
        } catch (C1175Ws e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A05.A08().ABC(A03(108, 11, 27), AbstractC1085Td.A0D, new C1086Te(th));
            Log.e(A03(90, 17, 86), A03(0, 90, 68), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final String A7O() {
        return this.A04.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final AdPlacementType A8k() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void ACo(AdError adError) {
        if (this.A02 != null) {
            this.A02.AEG(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void ACp() {
        A04();
        this.A02.AEF(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void AHY() {
        this.A03 = new ND(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final boolean AKL() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0950Nt
    public final void AKX() {
        if (this.A03 != null) {
            ND nd = this.A03;
            String[] strArr = A0C;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[0] = "DiF0";
            strArr2[2] = "lQT3";
            nd.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.X.N1
    public final void onDestroy() {
        if (this.A04 != null) {
            this.A04.A0H();
        }
    }
}
