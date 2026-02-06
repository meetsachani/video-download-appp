package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ck  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1429ck implements View.OnClickListener {
    public static String[] A01 = {"UbVTWMkCbiTkCH46K3jgevn4ZrjXJwTz", "QhkEmn79eJKUC441fbjRvFrP8rMFuK10", "M1y17FrLcKCq9CffRIAOFt9KL", "7BuiCs8qfizRNQQacuqpq", "NMEBAQB23JfGHe29j4ICw6", "tA", "w4e9O4TDm2cMnnpInxw7", "enarAElxAt9QJNN7p9xKH4Zm0Hlbhkd5"};
    public final /* synthetic */ C0836Ji A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC0925Mt abstractC0925Mt;
        AbstractC0925Mt abstractC0925Mt2;
        boolean z;
        C1350bT c1350bT;
        boolean z2;
        C1350bT c1350bT2;
        C1390c7 c1390c7;
        AbstractC1847jd abstractC1847jd;
        Handler handler;
        Runnable runnable;
        AbstractC1847jd abstractC1847jd2;
        C1390c7 c1390c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            abstractC0925Mt = this.A00.A0W;
            if (abstractC0925Mt == null) {
                return;
            }
            abstractC0925Mt2 = this.A00.A0W;
            Uri A0M = ((AnonymousClass85) abstractC0925Mt2).A0M();
            if (A0M == null) {
                return;
            }
            z = this.A00.A0D;
            if (!z) {
                this.A00.A0E = true;
                this.A00.A0m(A0M.toString());
                c1390c7 = this.A00.A0b;
                if (c1390c7.A0D() != null) {
                    c1390c72 = this.A00.A0b;
                    c1390c72.A0D().ACQ();
                }
                abstractC1847jd = this.A00.A0X;
                if (abstractC1847jd.A0q() >= 0) {
                    handler = this.A00.A0R;
                    runnable = this.A00.A0c;
                    abstractC1847jd2 = this.A00.A0X;
                    handler.postDelayed(runnable, abstractC1847jd2.A0q());
                }
            }
            c1350bT = this.A00.A09;
            if (c1350bT != null) {
                c1350bT2 = this.A00.A09;
                c1350bT2.A0B();
                this.A00.A09 = null;
            }
            C0836Ji c0836Ji = this.A00;
            z2 = this.A00.A0D;
            c0836Ji.A0q(z2 ? false : true);
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[6].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "NGdQEP5eIhe6T0Nr5s0Gdk";
            strArr2[5] = "GP";
            WU.A00(th, this);
        }
    }

    public View$OnClickListenerC1429ck(C0836Ji c0836Ji) {
        this.A00 = c0836Ji;
    }
}
