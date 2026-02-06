package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.81  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass81<NativeViewabilityLogger> implements InterfaceC1878k8 {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public N9 A00;
    public NA A01;
    public C1855jl A02;
    public C05487o A03;
    public AnonymousClass76 A04;
    public VA A05;
    public EnumC1147Vp A06;
    public InterfaceC1322b1 A07;
    public LV A08;
    public AnonymousClass62 A09;
    public AbstractC1617fo A0A;
    public C1618fp A0B;
    public String A0D;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final Y2 A0H = new Y2();
    public Boolean A0C = false;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{28, 40, C3307Iz.Y, -25, 31, C8077mf.D, 28, C8077mf.H, C8077mf.E, 40, 40, 36, -25, C8077mf.D, C8077mf.G, C3307Iz.d0, -25, C8077mf.E, C8077mf.D, C3307Iz.Z, C3307Iz.Z, C8077mf.H, C3307Iz.c0, -25, 28, C3307Iz.X, 34, 28, 36, C8077mf.H, C8077mf.G, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = AnonymousClass81.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A09 != null && this.A03 != null && this.A03.A1g()) {
            this.A00.ADD(this, this.A09);
        }
        if (this.A00 != null) {
            boolean z = this.A0E;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z && (this.A0F || !this.A0G)) {
                N9 n9 = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    n9.ADD(this, this.A08);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    n9.ADD(this, this.A08);
                }
            }
        }
        this.A04.A0F().A4O(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i, C1105Tx c1105Tx) {
        C1872k2 c1872k2 = new C1872k2(this);
        this.A09 = new AnonymousClass62(this.A04, this.A05, c1872k2, this.A03, A08(0, 31, 79), 2, this.A0H);
        this.A0A = new C1871k1(this);
        this.A0B = new C1618fp(this.A09, c1105Tx.A04(), c1105Tx.A09(), true, new WeakReference(this.A0A), this.A04);
        this.A0B.A0W(this.A03.A0m());
        this.A0B.A0X(this.A03.A0n());
        this.A09.setVisibility(0);
        this.A04.getResources();
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A09.AKD();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C1105Tx c1105Tx, JSONObject jSONObject, EnumC1147Vp enumC1147Vp) {
        this.A0F = false;
        final C1857jn A00 = C1857jn.A00(this.A04, jSONObject);
        this.A0D = A00.A7O();
        if (AbstractC0929Mx.A06(this.A04, A00, this.A05)) {
            this.A04.A0F().A52();
            this.A00.AEN(this, C1145Vm.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A07 = new AbstractC0895Lp() { // from class: com.facebook.ads.redexgen.X.82
            public static byte[] A02;
            public static String[] A03 = {"dvnbyrX9L5Wlup6c2JnWkpTYBAz3QIun", "ITj", "KqeTcLSx6Zay5vtxcnHqZ", "bGeXa7nDz1byFpBCq22utpLnb", "UYph9iPsD3jee8BOLuPQ6r57rjKJpmVb", "DfaYbRSw6X21pxGApii0qweOJ64z1eNB", "52vckdype7aS5lLwU46sLHF0XTMQAze7", "uuBWL9In1wjj"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 105);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A02 = new byte[]{67, 116, 116, 105, 116, C3307Iz.Y, 99, 126, 99, 101, 115, 114, 111, 104, 97, C3307Iz.Y, 103, 101, 114, 111, 105, 104, 119, 117, QC1.w, QC1.w, 113, 102, 64, 109, 100, 113, 116, 112, 115, 118, 81, 74, 77, 85, 81, 65, 109, 64};
            }

            static {
                A01();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1322b1
            public final void ACz() {
                boolean z;
                AnonymousClass81.this.A0F = true;
                z = AnonymousClass81.this.A0G;
                if (z) {
                    AnonymousClass81.this.A0A();
                }
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0895Lp, com.facebook.ads.redexgen.X.InterfaceC1322b1
            public final void ADN(String str, Map<String, String> map) {
                AnonymousClass76 anonymousClass76;
                String str2;
                AnonymousClass76 anonymousClass762;
                VA va;
                C05487o c05487o;
                C05487o c05487o2;
                C0937Ng A2A;
                String str3;
                AnonymousClass76 anonymousClass763;
                N9 n9;
                N9 n92;
                anonymousClass76 = AnonymousClass81.this.A04;
                anonymousClass76.A0F().A4P();
                Uri A002 = XB.A00(str);
                map.put(A00(22, 10, 125), AdPlacementType.BANNER.name());
                str2 = AnonymousClass81.this.A0I;
                map.put(A00(36, 8, 77), str2);
                anonymousClass762 = AnonymousClass81.this.A04;
                va = AnonymousClass81.this.A05;
                String A7O = A00.A7O();
                c05487o = AnonymousClass81.this.A03;
                if (c05487o == null) {
                    A2A = null;
                } else {
                    AnonymousClass81 anonymousClass81 = AnonymousClass81.this;
                    if (A03[7].length() == 4) {
                        throw new RuntimeException();
                    }
                    A03[2] = "7FoTEC4l3Pv3ceMVIqf";
                    c05487o2 = anonymousClass81.A03;
                    A2A = c05487o2.A2A();
                }
                AbstractC0925Mt adAction = C0926Mu.A00(anonymousClass762, va, A7O, A002, map, A2A);
                EnumC0922Mq enumC0922Mq = EnumC0922Mq.A09;
                if (adAction != null) {
                    try {
                        anonymousClass763 = AnonymousClass81.this.A04;
                        anonymousClass763.A0F().A4M();
                        enumC0922Mq = adAction.A0G(null);
                    } catch (Exception e) {
                        str3 = AnonymousClass81.A0L;
                        Log.e(str3, A00(0, 22, 111), e);
                    }
                }
                if (A00(32, 4, 123).equals(A002.getScheme()) && C0926Mu.A04(A002.getAuthority())) {
                    n9 = AnonymousClass81.this.A00;
                    if (n9 != null && enumC0922Mq != EnumC0922Mq.A06) {
                        n92 = AnonymousClass81.this.A00;
                        n92.ADC(AnonymousClass81.this);
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1322b1
            public final void AEA() {
                AnonymousClass76 anonymousClass76;
                C1855jl c1855jl;
                C1855jl c1855jl2;
                C1855jl c1855jl3;
                anonymousClass76 = AnonymousClass81.this.A04;
                InterfaceC1909kf A0F = anonymousClass76.A0F();
                c1855jl = AnonymousClass81.this.A02;
                A0F.A4Q(c1855jl != null);
                c1855jl2 = AnonymousClass81.this.A02;
                if (c1855jl2 != null) {
                    c1855jl3 = AnonymousClass81.this.A02;
                    c1855jl3.A03();
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1322b1
            public final void AF8() {
                AnonymousClass76 anonymousClass76;
                C1855jl c1855jl;
                anonymousClass76 = AnonymousClass81.this.A04;
                anonymousClass76.A0F().A4S();
                c1855jl = AnonymousClass81.this.A02;
                c1855jl.A09();
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1322b1
            public final void AGg() {
            }
        };
        this.A08 = new LV(this.A04, new WeakReference(this.A07), c1105Tx.A04(), A7O());
        this.A08.A0L(c1105Tx.A07(), c1105Tx.A08());
        N4 impressionHelper = new C1870k0(this);
        this.A02 = new C1855jl(this.A04, this.A05, this.A08, this.A08.getViewabilityChecker(), impressionHelper, enumC1147Vp);
        this.A02.A0A(A00);
        this.A08.loadDataWithBaseURL(AbstractC1325b4.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0E = true;
        A0A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
        if (com.facebook.ads.redexgen.X.C1123Up.A2H(r10.A04) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (com.facebook.ads.redexgen.X.SN.A0A(r10.A03.A1H()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (com.facebook.ads.redexgen.X.C1123Up.A2H(r10.A04) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        r0 = 0;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0G(EnumC1147Vp enumC1147Vp, C1105Tx c1105Tx) {
        int i;
        int bannerHeight;
        if (this.A03 != null) {
            VA va = this.A05;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj";
            strArr[4] = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS";
            if (va == null) {
                return;
            }
            int A03 = enumC1147Vp.A03();
            if (A0K[3].charAt(25) != 'G') {
                A0K[5] = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z";
                i = (int) (A03 * Resources.getSystem().getDisplayMetrics().density);
            } else {
                i = (int) (A03 * Resources.getSystem().getDisplayMetrics().density);
            }
            if (bannerHeight == 0) {
                A0C(i, c1105Tx);
            } else {
                new SN(new C1079Sx(this.A04), this.A03.A1H(), this.A03.A10(), this.A03.A1D(), true, new C1874k4(this, i, c1105Tx, this)).A0B();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.N1
    public final String A7O() {
        return this.A0D;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.N1
    public final AdPlacementType A8k() {
        if (C1123Up.A1A(this.A04)) {
            EnumC1147Vp enumC1147Vp = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC1147Vp != null && this.A06 == EnumC1147Vp.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1878k8
    public final void AAt(AnonymousClass76 anonymousClass76, VA va, EnumC1147Vp enumC1147Vp, N9 n9, JSONObject jSONObject, C1105Tx c1105Tx) {
        anonymousClass76.A0F().A4N();
        this.A04 = anonymousClass76;
        this.A05 = va;
        this.A00 = n9;
        this.A06 = enumC1147Vp;
        this.A0G = C1123Up.A1o(this.A04.getApplicationContext());
        this.A03 = C05487o.A00(jSONObject, this.A04);
        if (this.A03.A1g()) {
            A0G(enumC1147Vp, c1105Tx);
        } else {
            A0F(c1105Tx, jSONObject, enumC1147Vp);
        }
        this.A01 = new NA(this.A04, this.A0I, this, n9);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.N1
    public final boolean AKL() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.81 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.N1
    public final void onDestroy() {
        this.A04.A0F().A4L(this.A08 != null);
        if (this.A08 != null) {
            this.A08.destroy();
            this.A08 = null;
            this.A07 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
