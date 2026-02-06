package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public final class F7 extends LinearLayout implements InterfaceC1545ee {
    public final NativeBannerAd A00;
    public final C1673gi A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (XX.A02 * 42.0f);
    public static final int A03 = (int) (XX.A02 * 48.0f);
    public static final int A05 = (int) (XX.A02 * 54.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);
    public static final int A06 = (int) (XX.A02 * 8.0f);

    public F7(C1673gi c1673gi, NativeBannerAd nativeBannerAd, C1137Vd c1137Vd, EnumC1138Ve enumC1138Ve, MediaView mediaView, AdOptionsView adOptionsView, C1264a5 c1264a5) {
        super(c1673gi);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams commonLayoutParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c1673gi;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC1138Ve);
        C1368bl c1368bl = new C1368bl(this.A01);
        c1368bl.setFullCircleCorners(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(A00, A00);
        c1368bl.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        relativeLayout.addView(c1368bl, layoutParams2);
        if (c1264a5 != null) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(10);
            layoutParams4.setMargins(XV.A0A, XV.A0A, XV.A00, XV.A00);
            relativeLayout.addView(c1264a5, layoutParams4);
        }
        linearLayout.addView(relativeLayout, layoutParams3);
        View c1542eb = new C1542eb(c1673gi, this.A00, enumC1138Ve, c1137Vd, adOptionsView);
        c1542eb.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 16;
        linearLayout.addView(c1542eb, layoutParams5);
        if (enumC1138Ve == EnumC1138Ve.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            commonLayoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            commonLayoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setPadding(A06, A07, A06, A07);
        c1137Vd.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, commonLayoutParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC1138Ve enumC1138Ve) {
        switch (enumC1138Ve) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1545ee
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1545ee
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1545ee
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
