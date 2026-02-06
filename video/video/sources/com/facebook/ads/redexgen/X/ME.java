package com.facebook.ads.redexgen.X;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC1236Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C0963Og A01;
    public final C1673gi A02;

    public ME(C1673gi c1673gi, VA va, String str, C0943Nm c0943Nm, InterfaceC1215Yi interfaceC1215Yi, InterfaceC1214Yh interfaceC1214Yh) {
        super(c1673gi, va, str, c0943Nm, interfaceC1215Yi, interfaceC1214Yh);
        this.A02 = c1673gi;
        this.A01 = AbstractC0964Oh.A00(c1673gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C1123Up.A2b(c1673gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ME.this.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0O() {
        C0967Ok A0A = this.A01.A0A();
        C1251Zs c1251Zs = new C1251Zs(this.A02);
        c1251Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c1251Zs.setOnClickListener(new View$OnClickListenerC1242Zj(this));
        C0967Ok A0B = this.A01.A0B();
        C1251Zs c1251Zs2 = new C1251Zs(this.A02);
        c1251Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c1251Zs2.setOnClickListener(new View$OnClickListenerC1243Zk(this));
        C1251Zs c1251Zs3 = new C1251Zs(this.A02);
        c1251Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c1251Zs3.setOnClickListener(new View$OnClickListenerC1244Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c1251Zs, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c1251Zs2, itemParams);
        }
        linearLayout.addView(c1251Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0Q(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        String A0E;
        int i;
        String str;
        if (enumC0965Oi == EnumC0965Oi.A05) {
            return;
        }
        boolean z = enumC0965Oi == EnumC0965Oi.A06;
        C1233Za c1233Za = new C1233Za(this.A02, this.A0D);
        if (z) {
            C0963Og c0963Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c0963Og.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C1233Za A0D = c1233Za.A0H(A0E).A0G(this.A01.A0D()).A0E(c0967Ok.A04()).A0D(z ? YM.REPORT_AD : YM.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C1233Za A0C = A0D.A0C(i);
        if (this.A0C != null) {
            C0943Nm c0943Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                str = c0943Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c0943Nm.A01();
            }
        } else {
            str = "";
        }
        C1234Zb adHiddenView = A0C.A0F(str).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c0967Ok, enumC0965Oi);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final void A0R(C0967Ok c0967Ok, EnumC0965Oi enumC0965Oi) {
        String A0H;
        boolean z = enumC0965Oi == EnumC0965Oi.A06;
        C1673gi c1673gi = this.A02;
        InterfaceC1238Zf interfaceC1238Zf = this.A0D;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C1254Zv c1254Zv = new C1254Zv(c1673gi, c0967Ok, interfaceC1238Zf, A0H, z ? YM.REPORT_AD : YM.HIDE_AD);
        c1254Zv.setClickable(true);
        YB.A0N(c1254Zv, -1);
        c1254Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c1254Zv, A00(false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1236Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
