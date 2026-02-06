package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.k2  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1872k2 implements InterfaceC1446d1 {
    public final /* synthetic */ AnonymousClass81 A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1446d1
    public final void AAn() {
        C05487o c05487o;
        AnonymousClass76 anonymousClass76;
        c05487o = this.A00.A03;
        String A00 = c05487o.A2C().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        X6 x6 = new X6();
        anonymousClass76 = this.A00.A04;
        X6.A0O(x6, anonymousClass76, XB.A00(A00), this.A00.A7O());
    }

    public C1872k2(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1446d1
    public final void ADm(AnonymousClass62 anonymousClass62) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1873k3(this, anonymousClass62), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1446d1
    public final void AE2() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1446d1
    public final void AGC(View view, MotionEvent motionEvent) {
    }
}
