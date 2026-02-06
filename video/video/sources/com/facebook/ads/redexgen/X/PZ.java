package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import o.C10997yd1;
import o.C3307Iz;
import o.C4715Xk;
import o.C7834lj1;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public class PZ extends RelativeLayout implements InterfaceC1215Yi {
    public static byte[] A0G;
    public static final String A0H;
    public static final int A0I;
    public long A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;
    public boolean A05;
    public final InterfaceC1041Rk A06;
    public final LinearLayout A07;
    public final C1035Re A08;
    public final C1673gi A09;
    public final VA A0A;
    public final InterfaceC1214Yh A0B;
    public final C1302ah A0C;
    public final InterfaceC1311aq A0D;
    public final M3 A0E;
    public final InterfaceC1316av A0F;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0G = new byte[]{90, 112, 112, 125, 112, C8077mf.x, ED2.a, C4715Xk.i, 112, 19, ED2.a, 62, 36, 53, 62, 36, 112, 28, ED2.a, 49, 52, 53, 52, 112, 4, 57, C4715Xk.i, 53, 106, 112, 48, C8077mf.D, C8077mf.D, C8077mf.A, C8077mf.D, 118, 85, 91, 94, C8077mf.D, 124, 83, 84, 83, 73, 82, C8077mf.D, 110, 83, 87, 95, 0, C8077mf.D, 95, 117, 117, QC1.w, 117, C8077mf.C, 58, 52, 49, 117, 6, C3307Iz.V, 52, C3307Iz.Z, C3307Iz.V, 117, 1, 60, 56, 48, 111, 117, 117, 95, 95, 82, 95, C3307Iz.e0, C8077mf.D, C8077mf.n, C8077mf.q, C8077mf.r, 17, C8077mf.n, C8077mf.D, 95, 58, 17, C8077mf.E, 95, C3307Iz.c0, C8077mf.z, C8077mf.u, C8077mf.D, 69, 95, 109, 71, 71, 74, 71, 52, 4, C8077mf.y, 8, C8077mf.m, C8077mf.m, 71, 53, 2, 6, 3, C8077mf.H, 71, 51, C8077mf.p, 10, 2, 93, 71, 87, 125, 125, 112, 125, C8077mf.p, 56, C3307Iz.f0, C3307Iz.f0, 52, 50, 51, 125, C8077mf.E, 52, 51, 52, C3307Iz.f0, 53, 125, 9, 52, 48, 56, 103, 125, 42, C8077mf.D, 48, 48, C4715Xk.i, 48, 88, 113, 126, 116, 124, 117, 98, 48, 68, 121, 125, 117, 42, 48, 97, 81, 76, 84, 80, 70, 81, 3, 80, 70, 80, 80, 74, 76, 77, 3, 71, 66, 87, 66, 3, 79, 76, 68, 68, 70, 71, 3, 99, 3, 126, 125, 112, 106, 107, C3307Iz.X, 125, 115, 126, 113, 116, 67, 83, 78, 86, 82, 68, 83, 116, 115, 109, 85, 90, 95, 83, 88, 66, 98, 89, 93, 83, 88, C3307Iz.X, C3307Iz.d0, 35, C3307Iz.a0, C3307Iz.V, 40, ED2.a, C8077mf.C, 36, 32, 40};
    }

    static {
        A0E();
        A0H = PZ.class.getSimpleName();
        A0I = XV.A0A;
    }

    public PZ(C1035Re c1035Re, C1673gi c1673gi, VA va, InterfaceC1214Yh interfaceC1214Yh, boolean z) {
        super(c1673gi);
        M3 m3;
        this.A06 = new C0985Pc(this);
        this.A05 = true;
        this.A01 = -1L;
        this.A03 = true;
        this.A08 = c1035Re;
        this.A0A = va;
        this.A0B = interfaceC1214Yh;
        this.A09 = c1673gi;
        if (c1673gi.A0E() == null) {
            c1673gi.A0F().A9v();
        }
        this.A0D = A0F();
        if (AbstractC1124Uq.A02(c1673gi) || c1673gi.A0E() == null) {
            m3 = new M3(c1673gi, this.A0D);
        } else {
            m3 = new M3(c1673gi, c1673gi.A0E(), this.A0D);
        }
        this.A0E = m3;
        this.A0F = A0C(z);
        this.A07 = (LinearLayout) this.A0F;
        this.A07.setId(View.generateViewId());
        this.A0F.setListener(new C0984Pb(this));
        this.A0E.setBrowserNavigationListener(this.A0F.getBrowserNavigationListener());
        this.A0C = new C1302ah(c1673gi, null, 16842872);
        A0G();
        c1035Re.A0A(this.A06);
    }

    private InterfaceC1316av A0C(boolean z) {
        if (z) {
            return new M8(this.A09, this.A0E, false);
        }
        return new M6(this.A09, this.A0E);
    }

    public InterfaceC1311aq A0F() {
        return new C0983Pa(this);
    }

    public void A0G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A07.setPadding(XV.A0b, XV.A0b, XV.A0b, XV.A0b);
        this.A0B.A45(this.A07, layoutParams);
        RelativeLayout.LayoutParams webViewParams = new RelativeLayout.LayoutParams(-1, -2);
        webViewParams.addRule(3, this.A07.getId());
        webViewParams.addRule(12);
        this.A0B.A45(this.A0E, webViewParams);
        RelativeLayout.LayoutParams webViewParams2 = new RelativeLayout.LayoutParams(-1, A0I);
        webViewParams2.addRule(3, this.A07.getId());
        this.A0C.setProgress(0);
        this.A0B.A45(this.A0C, webViewParams2);
    }

    public void A0H() {
        this.A08.finish(1);
    }

    public void A0I(String str) {
    }

    public void AAu(Intent intent, Bundle bundle, C1035Re c1035Re) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String A0D = A0D(C10997yd1.n1, 11, 97);
        String A0D2 = A0D(220, 11, 26);
        String url = A0D(210, 10, 13);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(url);
            this.A04 = intent.getStringExtra(A0D2);
            this.A00 = intent.getLongExtra(A0D, -1L);
        } else {
            this.A02 = bundle.getString(url);
            this.A04 = bundle.getString(A0D2);
            this.A00 = bundle.getLong(A0D, -1L);
        }
        String A0D3 = this.A02 != null ? this.A02 : A0D(199, 11, 51);
        this.A0F.setUrl(A0D3);
        this.A0E.loadUrl(A0D3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFA(boolean z) {
        C1305ak A07;
        this.A0E.onPause();
        if (this.A03) {
            this.A03 = false;
            this.A0A.AB5(this.A04, new C1304aj(this.A0E.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0E.getResponseEndMs()).A00(this.A0E.getDomContentLoadedMs()).A05(this.A0E.getScrollReadyMs()).A02(this.A0E.getLoadFinishMs()).A06(System.currentTimeMillis()).A07().A02());
            if (BuildConfigApi.isDebug()) {
                String str = A0D(C7834lj1.G, 30, 15) + System.currentTimeMillis() + A0D(149, 20, 60) + A07.A01 + A0D(53, 22, 121) + A07.A03 + A0D(75, 24, 83) + A07.A04 + A0D(0, 30, 124) + A07.A00 + A0D(99, 24, 75) + A07.A05 + A0D(30, 23, 22) + A07.A02 + A0D(123, 26, 113) + A07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AFi(boolean z) {
        this.A0E.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final void AIv(Bundle bundle) {
        bundle.putString(A0D(210, 10, 13), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public String getCurrentClientToken() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1215Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A0B(this.A06);
        AbstractC1325b4.A03(this.A0E);
        this.A0E.destroy();
    }

    public void setListener(InterfaceC1214Yh interfaceC1214Yh) {
    }
}
