package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.bF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1336bF extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1673gi A07;
    public final View$OnClickListenerC0871Kr A08;
    public final C1367bk A09;

    public static String A0h(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static void A0i() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0l(int i);

    static {
        A0i();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public AbstractC1336bF(C1673gi c1673gi, View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr, int i, C0931Na c0931Na, boolean z, String str, VA va, InterfaceC1214Yh interfaceC1214Yh, C1618fp c1618fp, Y2 y2, C0937Ng c0937Ng, boolean z2, String str2) {
        super(c1673gi);
        this.A02 = A0h(0, 0, 37);
        YB.A0K(this);
        this.A07 = c1673gi;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C1367bk(c1673gi);
        YB.A0N(this.A09, 0);
        YB.A0K(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c1673gi);
            this.A01 = new TextView(c1673gi);
            YB.A0K(this.A01);
        }
        if (view$OnClickListenerC0871Kr == null) {
            this.A08 = new View$OnClickListenerC0871Kr(c1673gi, str, c0931Na, z, va, interfaceC1214Yh, c1618fp, y2, c0937Ng);
        } else {
            this.A08 = view$OnClickListenerC0871Kr;
        }
        YB.A0G(1001, this.A08);
        this.A05 = AbstractC1377bu.A03(this.A08, A0h(0, 9, 52));
        this.A06 = new RelativeLayout(c1673gi);
        this.A06.setLayoutParams(A0B);
        YB.A0K(this.A06);
    }

    public void A0j() {
    }

    public void A0k() {
        this.A09.setOnClickListener(this.A05);
    }

    public void A0m(boolean z) {
    }

    public final View$OnClickListenerC0871Kr getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(NY ny, C0933Nc c0933Nc, String str, String str2, InterfaceC1188Xh interfaceC1188Xh, InterfaceC1351bU interfaceC1351bU) {
        this.A08.setCta(c0933Nc, str, new HashMap(), interfaceC1188Xh, interfaceC1351bU);
        new LM(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
