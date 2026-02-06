package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.4T  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4T extends PJ {
    public static byte[] A0D;
    public static String[] A0E = {"tW3Su6P8GZp1yTngpwFy2DF2GhDzXnf2", "3HQabaXZCQWVf5CedpF1izNpaoU6B", "XHPkWVuaRS230ZzCiYR7qtQACoZnYKM5", "gQNAwnCobdMDtnebLpL2jf4350QwOymE", "dRJ3n5TbirTJDeON6upQokchUTJmTtSu", "43KhzPf8qbqk0SZtfSmXLCVXJtKHuuuO", "kYCENHGiqRDWZvuV9M2TmYzxFqbu31T5", "7NDfQDtGKt0HcNI2moZZTs031QkqKmSX"};
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    public LinearLayout A02;
    public AbstractC1847jd A03;
    public C1079Sx A04;
    public C1J A05;
    public C1366bj A06;
    public C0749Fy A07;
    public AbstractC1617fo A08;
    public C1618fp A09;
    public String A0A;
    public List<C1511e5> A0B;
    public final Y2 A0C;

    public static String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 7);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0D = new byte[]{66, 71, 124, 71, 66, 87, 66, 124, 65, 86, 77, 71, 79, 70, C8077mf.u, 5, C8077mf.A, 1, C8077mf.u, 4, 5, 4, 54, 9, 4, 5, C8077mf.q, C3307Iz.V, 4, 36, 1, C8077mf.x, 1, 34, C8077mf.y, C8077mf.p, 4, C8077mf.n, 5, 118, 110, 108, 117};
    }

    static {
        A0G();
        A0G = (int) (XX.A02 * 48.0f);
        A0H = XV.A0v;
        A0I = (int) (XX.A02 * 8.0f);
        A0K = (int) (XX.A02 * 56.0f);
        A0F = (int) (XX.A02 * 48.0f);
        A0J = (int) (XX.A02 * 12.0f);
    }

    public C4T(C1673gi c1673gi, VA va, C1079Sx c1079Sx, InterfaceC1214Yh interfaceC1214Yh, AbstractC1847jd abstractC1847jd) {
        super(c1673gi, va, interfaceC1214Yh, abstractC1847jd);
        this.A0C = new Y2();
        if (abstractC1847jd instanceof C05457l) {
            super.A09 = true;
            super.A08 = new C1541ea(c1673gi, new MG(), this.A0D.A1G(), interfaceC1214Yh);
        }
        this.A04 = c1079Sx;
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private int A00() {
        return A0K + A0G + (A0H * 4) + (this.A0D.A2Q() ? A0F : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r4.A06() == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
        r3.A0p().getCtaActionHelper().A07(new com.facebook.ads.redexgen.X.C0731Ff(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
        if (r4.A06() == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EnumC0922Mq A02(String str) {
        EnumC0922Mq enumC0922Mq = EnumC0922Mq.A09;
        if (this.A05 == null) {
            return enumC0922Mq;
        }
        C1J c1j = this.A05;
        C1743hr layoutManager = this.A05.getLayoutManager();
        String[] strArr = A0E;
        if (strArr[5].charAt(30) != strArr[6].charAt(30)) {
            A0E[2] = "E32f1TaBN4dkj3FL0vDfikWnsbqL7SKY";
            FY fy = (FY) c1j.A1G(layoutManager.A25());
            if (fy != null && fy.A0p() != null) {
                enumC0922Mq = fy.A0p().A0E(str);
                C1352bV ctaActionHelper = fy.A0p().getCtaActionHelper();
                if (A0E[2].charAt(16) != '1') {
                    String[] strArr2 = A0E;
                    strArr2[5] = "i7TFLIHedh0buU6tWLTqbZ60SXZT8zmg";
                    strArr2[6] = "DCWE7AKb21kTTjPuFVubbU6pDlTglIBY";
                } else {
                    String[] strArr3 = A0E;
                    strArr3[7] = "dI26cUvsILIVYWhCptAOIe9hx0G02LwU";
                    strArr3[0] = "KP2PoUq36ksxZ0HlOf60WIRRhVJwRZXP";
                }
            }
            return enumC0922Mq;
        }
        throw new RuntimeException();
    }

    private AbstractC1847jd A03(Intent intent) {
        if (super.A09) {
            return (AbstractC1847jd) intent.getSerializableExtra(A0E(14, 25, 103));
        }
        return (AbstractC1847jd) intent.getSerializableExtra(A0E(0, 14, 36));
    }

    private final void A0H() {
        if (this.A02 != null) {
            this.A02.removeAllViews();
            if (A0E[3].charAt(5) != 'n') {
                throw new RuntimeException();
            }
            A0E[4] = "3JPxSaqJUpKyt95G35P4gQJAerHutmpA";
            this.A02 = null;
        }
        if (this.A05 != null) {
            this.A05.removeAllViews();
            this.A05.A1S();
            this.A05 = null;
        }
        if (this.A06 != null) {
            this.A06.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0I(int i, Bundle bundle) {
        int extraSpacing;
        int i2;
        int height;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i3 = XX.A04.widthPixels;
        int i4 = XX.A04.heightPixels;
        if (i == 1) {
            extraSpacing = Math.min(i3 - (A0H * 4), i4 / 2);
            i2 = (i3 - extraSpacing) / 8;
            height = i2 * 4;
        } else {
            extraSpacing = i4 - A00();
            i2 = A0H;
            height = i2 * 2;
        }
        this.A08 = new C0732Fg(this);
        this.A09 = new C1618fp(this, 1, new WeakReference(this.A08), this.A0E);
        this.A09.A0W(this.A00);
        this.A09.A0X(this.A01);
        this.A05 = new C1J(this.A0E);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C0749Fy(this.A05, i, this.A0B, this.A09, bundle);
        int extraSpacing2 = i2;
        int childSpacing = extraSpacing;
        this.A05.setAdapter(new C0740Fp(this.A0E, this.A0B, this.A03, this.A0F, this.A04, this.A09, this.A0C, getAudienceNetworkListener(), this.A0A, childSpacing, extraSpacing2, height, i, this.A07, this.A0H));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i == 1) {
            A0K(this.A07);
        }
        this.A02.addView(this.A05);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (C1123Up.A1z(this.A0E)) {
            this.A0E.A0B().AKn(this.A05, this.A0D.A2E(), false);
        }
        A0f(this.A02, false, i);
    }

    private void A0J(AbstractC1847jd abstractC1847jd) {
        this.A03 = abstractC1847jd;
        this.A0A = this.A03.A2E();
        this.A00 = this.A03.A0m();
        this.A01 = this.A03.A0n();
        List<NR> A2G = this.A03.A2G();
        List<AdInfo> adInfoList = new ArrayList<>(A2G.size());
        this.A0B = adInfoList;
        for (int i = 0; i < A2G.size(); i++) {
            List<C1511e5> list = this.A0B;
            int i2 = A2G.size();
            list.add(new C1511e5(i, i2, A2G.get(i)));
        }
    }

    private void A0K(C0749Fy c0749Fy) {
        new C7N().A0G(this.A05);
        c0749Fy.A0Y(new C0730Fe(this));
        this.A06 = new C1366bj(this.A0E, super.A07.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.PJ
    public final AbstractC1208Yb A0b() {
        return new FullScreenAdToolbar(this.A0E, getAudienceNetworkListener(), this.A0G, 0, this.A0D.A22(), false);
    }

    @Override // com.facebook.ads.redexgen.X.PJ
    public final void A0d() {
        EnumC0922Mq A02 = A02(A0E(39, 4, 2));
        if (this.A0D.A2N()) {
            return;
        }
        EnumC0922Mq actionOutcome = EnumC0922Mq.A09;
        if (A02 != actionOutcome) {
            EnumC0922Mq actionOutcome2 = EnumC0922Mq.A06;
            if (A02 != actionOutcome2) {
                A0m();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.PJ
    public final boolean A0l() {
        return false;
    }

    public final void A0m() {
        if (this.A0H.getToolbarActionMode() == 8) {
            this.A0H.setToolbarActionMode(2);
        }
        this.A0D.A2K(false);
        this.A0D.A29().A0M(-1);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AAu(Intent intent, Bundle bundle, C1035Re c1035Re) {
        AbstractC1847jd dataBundle = A03(intent);
        A0g(c1035Re);
        A0J(dataBundle);
        A0I(c1035Re.A05().getResources().getConfiguration().orientation, bundle);
        c1035Re.A0A(new C0729Fd(this, c1035Re));
        AbstractC1847jd dataBundle2 = this.A0D;
        int unskippableSec = dataBundle2.A29().A0H().A04();
        if (super.A09) {
            AbstractC1847jd dataBundle3 = this.A0D;
            unskippableSec = dataBundle3.A29().A0H().A03();
        }
        if (unskippableSec > 0) {
            A0e(unskippableSec);
        }
        AbstractC1847jd dataBundle4 = this.A0D;
        if (dataBundle4.A29().A0H().A02() >= 0) {
            this.A0H.setToolbarActionMode(8);
        }
        AbstractC1847jd dataBundle5 = this.A0D;
        if (dataBundle5.A2T()) {
            this.A0H.setOnClickListener(new View$OnClickListenerC1515e9(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.PJ, com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFA(boolean z) {
        super.AFA(z);
        if (this.A07 != null) {
            this.A07.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PJ, com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFi(boolean z) {
        super.AFi(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AIv(Bundle bundle) {
        if (this.A07 != null) {
            this.A07.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PJ
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AIv(bundle);
        A0H();
        A0I(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PJ, com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void onDestroy() {
        super.onDestroy();
        if (C1123Up.A1z(this.A0E)) {
            this.A0E.A0B().AKU(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            this.A0F.AB7(this.A0A, new C1330b9().A03(this.A09).A02(this.A0C).A05());
        }
        A0H();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0C.A06(this.A0E, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
