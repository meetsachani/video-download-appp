package com.facebook.ads.redexgen.X;

import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ib  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1786ib extends N2 {
    public static byte[] A01;
    public final /* synthetic */ C1784iZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{9, C8077mf.B, 1, 36, 40, C3307Iz.a0, 51, 53, 40, C3307Iz.c0, C3307Iz.c0, 34, 53, 103, C3307Iz.f0, 52, 103, C3307Iz.a0, 50, C3307Iz.c0, C3307Iz.c0};
    }

    public C1786ib(C1784iZ c1784iZ) {
        this.A00 = c1784iZ;
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A02;
            SJ sj = (SJ) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A01;
            sj.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A02;
            rewardedVideoAd3.show(sj.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1768iI c1768iI;
        this.A00.A06.A0F().A3K();
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1768iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c1768iI.A6k());
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1768iI c1768iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1768iI = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c1768iI.A6k());
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0F(N1 n1) {
        C05347a c05347a;
        C1768iI c1768iI;
        C1768iI c1768iI2;
        C05347a c05347a2;
        NQ nq;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1768iI c1768iI3;
        NQ nq2;
        RewardedVideoAd rewardedVideoAd2;
        NQ nq3;
        C1768iI c1768iI4;
        RewardedVideoAd rewardedVideoAd3;
        NQ nq4;
        C1768iI c1768iI5;
        C1768iI c1768iI6;
        C1768iI c1768iI7;
        NQ nq5;
        C1768iI c1768iI8;
        c05347a = this.A00.A04;
        if (c05347a == null) {
            this.A00.A06.A08().ABC(A00(0, 3, 67), AbstractC1085Td.A0N, new C1086Te(A00(3, 18, 108)));
            return;
        }
        AbstractC1851jh abstractC1851jh = (AbstractC1851jh) n1;
        c1768iI = this.A00.A08;
        if (c1768iI.A03 != null) {
            c1768iI8 = this.A00.A08;
            abstractC1851jh.A02(c1768iI8.A03);
        }
        c1768iI2 = this.A00.A08;
        c1768iI2.A00 = abstractC1851jh.A0H();
        this.A00.A05 = true;
        C1784iZ c1784iZ = this.A00;
        c05347a2 = this.A00.A04;
        c1784iZ.A03 = c05347a2.A0I();
        nq = this.A00.A03;
        if (nq != null) {
            int i = 0;
            nq4 = this.A00.A03;
            if (!nq4.A1b()) {
                nq5 = this.A00.A03;
                i = ((AbstractC1847jd) nq5).A26();
            }
            if (i > 0) {
                XC xc = new XC();
                C1673gi c1673gi = this.A00.A06;
                c1768iI5 = this.A00.A08;
                if (xc.A09(c1673gi, c1768iI5.A06, i)) {
                    xc.A08(this.A00.A06, true);
                    C1784iZ c1784iZ2 = this.A00;
                    C1673gi c1673gi2 = this.A00.A06;
                    c1768iI6 = this.A00.A08;
                    String str = c1768iI6.A0D;
                    c1768iI7 = this.A00.A08;
                    c1784iZ2.A02 = xc.A07(c1673gi2, str, c1768iI7.A06);
                } else {
                    xc.A08(this.A00.A06, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A02;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A07;
            c1768iI3 = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c1768iI3.A6k());
            return;
        }
        nq2 = this.A00.A03;
        ((AbstractC1847jd) nq2).A2J(true);
        rewardedVideoAd2 = this.A00.A02;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        nq3 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(nq3.A0s());
        c1768iI4 = this.A00.A08;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c1768iI4.A02).withAdListener(new OI(this)).build();
        rewardedVideoAd3 = this.A00.A02;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.X.N2
    public final void A0G(C1145Vm c1145Vm) {
        C1768iI c1768iI;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1768iI c1768iI2;
        this.A00.A0D(true);
        c1768iI = this.A00.A08;
        InterfaceC0899Lt A0F = c1768iI.A0B.A0F();
        j = this.A00.A00;
        A0F.A3N(Y1.A01(j), c1145Vm.A03().getErrorCode(), c1145Vm.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A07;
        c1768iI2 = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onError(c1768iI2.A6k(), XE.A00(c1145Vm));
    }
}
