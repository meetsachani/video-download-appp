package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class YY implements View.OnClickListener {
    public final /* synthetic */ C0943Nm A00;
    public final /* synthetic */ VI A01;
    public final /* synthetic */ YZ A02;
    public final /* synthetic */ InterfaceC1214Yh A03;
    public final /* synthetic */ String A04;

    public YY(YZ yz, VI vi, InterfaceC1214Yh interfaceC1214Yh, String str, C0943Nm c0943Nm) {
        this.A02 = yz;
        this.A01 = vi;
        this.A03 = interfaceC1214Yh;
        this.A04 = str;
        this.A00 = c0943Nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0963Og c0963Og;
        C1673gi c1673gi;
        C1673gi c1673gi2;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A01.A04(VH.A0A, null);
            c0963Og = this.A02.A02;
            c1673gi = this.A02.A03;
            if (c0963Og.A0O(c1673gi.A02(), true)) {
                this.A03.AAo(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                X6 x6 = new X6();
                c1673gi2 = this.A02.A03;
                X6.A0O(x6, c1673gi2, XB.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
