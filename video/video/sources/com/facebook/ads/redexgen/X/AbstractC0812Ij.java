package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Ij  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0812Ij extends RelativeLayout implements XQ {
    public static byte[] A0E;
    public static String[] A0F = {"uUMDphsbcltlMAasrXzhzXIIsD27sBrh", "kD4ASPr1mkkPPQg7686pKphnCznMXNdE", "3u4w9tHTXiQc09zCQQwrpogVyGpuea0B", "uLxjLzdSNqmjg5WlrsUTBNxe2IHJHDsH", "sowIyJkgs7pChNHWV216bYY5IvqkL5", "woZqrf3JBfr8DagdWcXdOyEt75sBOiDm", "mZPGIv6MosabarlDevuwzM4J02qRjqBR", "rZe00TaCIEKWr55DYJNI366SEGcMY1oV"};
    public static final int A0G;
    public String A00;
    public boolean A01;
    public final int A02;
    public final AbstractC1617fo A03;
    public final boolean A04;
    public final boolean A05;
    public final AbstractC1847jd A06;
    public final C1673gi A07;
    public final VA A08;
    public final XS A09;
    public final Y2 A0A;
    public final InterfaceC1214Yh A0B;
    public final ZU A0C;
    public final C1618fp A0D;

    public static String A19(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A1A() {
        A0E = new byte[]{95, C8077mf.r, C8077mf.C, 95, 5, 32, 100};
        if (A0F[4].length() == 22) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[2] = "lGg0879wdsNhw7V1Qtd20OQ8gEXobd5O";
        strArr[0] = "a2lydBkKvgM6UKG9QoQR6B5cBx9Kev1F";
    }

    public abstract EnumC0922Mq A1D(String str);

    public abstract void A1G();

    public abstract void A1H();

    public abstract void A1J(boolean z);

    public abstract void A1K(boolean z);

    public abstract boolean A1L();

    public abstract boolean A1M();

    public abstract boolean A1N();

    public abstract C1491dk getFullScreenAdStyle();

    static {
        A1A();
        A0G = (int) (XX.A02 * 80.0f);
    }

    public AbstractC0812Ij(C1673gi c1673gi, ZU zu, VA va, AbstractC1847jd abstractC1847jd, int i, boolean z, boolean z2, InterfaceC1214Yh interfaceC1214Yh, int i2) {
        super(c1673gi);
        this.A0A = new Y2();
        this.A01 = false;
        this.A00 = A19(0, 0, 48);
        this.A03 = new C0816In(this);
        this.A02 = i;
        this.A07 = c1673gi;
        this.A05 = z;
        this.A04 = z2;
        this.A0B = interfaceC1214Yh;
        this.A0C = zu;
        this.A06 = abstractC1847jd;
        this.A08 = va;
        this.A0D = new C1618fp(this, 1, new WeakReference(this.A03), c1673gi);
        this.A0D.A0W(abstractC1847jd.A0m());
        this.A0D.A0X(abstractC1847jd.A0n());
        this.A09 = XS.A00(this.A07, this.A06, this);
        if (this.A06.A1c()) {
            this.A00 = A18(this.A02, i2);
        }
    }

    public static String A18(int i, int i2) {
        return A19(4, 3, 9) + (i + 1) + A19(0, 4, 50) + i2;
    }

    public void A1E() {
        this.A09.A03();
    }

    public final void A1F() {
        if (!this.A01) {
            this.A0D.A0U();
            this.A01 = true;
        }
    }

    public void A1I(boolean z) {
    }

    public AbstractC1847jd getAdDataBundle() {
        return this.A06;
    }

    public C1618fp getAdViewabilityChecker() {
        return this.A0D;
    }

    public Y2 getTouchDataRecorder() {
        return this.A0A;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
