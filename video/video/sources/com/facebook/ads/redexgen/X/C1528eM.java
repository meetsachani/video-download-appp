package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.eM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1528eM {
    public View$OnClickListenerC0871Kr A00;
    public final NN A01;
    public final NY A02;
    public final C0934Nd A03;
    public final C0943Nm A04;
    public final C1673gi A05;
    public final VI A06;
    public static final int A09 = (int) (XX.A02 * 4.0f);
    public static final int A07 = (int) (XX.A02 * 72.0f);
    public static final int A08 = (int) (XX.A02 * 8.0f);

    public C1528eM(C1673gi c1673gi, VA va, AbstractC1847jd abstractC1847jd) {
        this.A05 = c1673gi;
        this.A06 = new VI(abstractC1847jd.A2E(), va);
        this.A01 = abstractC1847jd.A28();
        this.A02 = abstractC1847jd.A29().A0I();
        this.A04 = abstractC1847jd.A2C();
        this.A03 = abstractC1847jd.A29().A0K();
    }

    private View A00(View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr) {
        C1373bq c1373bq = new C1373bq(this.A05, this.A01.A01(), true, false, false);
        c1373bq.A04(this.A02.A0G(), this.A02.A04(), null, false, true);
        c1373bq.setAlignment(17);
        C1367bk c1367bk = new C1367bk(this.A05);
        YB.A0N(c1367bk, 0);
        c1367bk.setRadius(50);
        new LM(c1367bk, this.A05).A04().A07(this.A04.A01());
        LinearLayout linearLayout = new LinearLayout(this.A05);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(c1367bk, new LinearLayout.LayoutParams(A07, A07));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, A08, 0, A08);
        linearLayout.addView(c1373bq, layoutParams);
        if (view$OnClickListenerC0871Kr != null) {
            YB.A0J(view$OnClickListenerC0871Kr);
            linearLayout.addView(view$OnClickListenerC0871Kr, layoutParams);
            view$OnClickListenerC0871Kr.setPadding(XV.A0Z, 0, XV.A0Z, 0);
            if (TextUtils.isEmpty(view$OnClickListenerC0871Kr.getText())) {
                YB.A0H(view$OnClickListenerC0871Kr);
            }
        }
        return linearLayout;
    }

    private C7M A01() {
        C7M c7m = new C7M(this.A05);
        c7m.setLayoutManager(new C1743hr(this.A05, 0, false));
        c7m.setAdapter(new FH(this.A05, this.A03.A02(), A09, this.A00));
        return c7m;
    }

    private final EnumC1527eL A02() {
        if (!this.A03.A02().isEmpty()) {
            return EnumC1527eL.A03;
        }
        return EnumC1527eL.A02;
    }

    public final Pair<EnumC1527eL, View> A03(View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr) {
        View A01;
        this.A00 = view$OnClickListenerC0871Kr;
        EnumC1527eL A02 = A02();
        switch (A02.ordinal()) {
            case 0:
                A01 = A01();
                break;
            default:
                A01 = A00(this.A00);
                break;
        }
        VK.A04(A01, this.A06, VH.A0S);
        return new Pair<>(A02, A01);
    }
}
