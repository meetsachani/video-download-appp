package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Dh */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0681Dh implements InterfaceC1561eu {
    public View A00;
    public C0710Ek A01;
    public EnumC1576f9 A02;
    public boolean A03;
    public final Handler A04;
    public final EA A05;
    public final E4 A06;
    public final E2 A07;
    public final AbstractC0693Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C0681Dh(View view, EnumC1576f9 enumC1576f9, boolean z) {
        this(view, enumC1576f9, z, false);
    }

    public C0681Dh(View view, EnumC1576f9 enumC1576f9, boolean z, boolean z2) {
        this.A06 = new E4() { // from class: com.facebook.ads.redexgen.X.3p
            {
                C0681Dh.this = this;
            }

            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4B c4b) {
                C0681Dh.A0A(C0681Dh.this, 1, 0);
            }
        };
        this.A07 = new E2() { // from class: com.facebook.ads.redexgen.X.3n
            {
                C0681Dh.this = this;
            }

            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(E3 e3) {
                if (!C0681Dh.A0C(C0681Dh.this)) {
                    return;
                }
                if (C0681Dh.A03(C0681Dh.this) == EnumC1576f9.A02 || C0681Dh.A0D(C0681Dh.this)) {
                    C0681Dh.A04(C0681Dh.this, null);
                    C0681Dh.A09(C0681Dh.this);
                    return;
                }
                C0681Dh.A0A(C0681Dh.this, 0, 8);
            }
        };
        this.A05 = new EA() { // from class: com.facebook.ads.redexgen.X.3e
            {
                C0681Dh.this = this;
            }

            @Override // com.facebook.ads.redexgen.X.UN
            /* renamed from: A00 */
            public final void A03(C4K c4k) {
                if (C0681Dh.A03(C0681Dh.this) != EnumC1576f9.A03) {
                    C0681Dh.A01(C0681Dh.this).setAlpha(1.0f);
                    C0681Dh.A01(C0681Dh.this).setVisibility(0);
                }
            }
        };
        this.A08 = new C04343c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC1576f9);
    }

    public static /* synthetic */ View A01(C0681Dh c0681Dh) {
        return c0681Dh.A00;
    }

    public static /* synthetic */ EnumC1576f9 A03(C0681Dh c0681Dh) {
        return c0681Dh.A02;
    }

    public static /* synthetic */ EnumC1576f9 A04(C0681Dh c0681Dh, EnumC1576f9 enumC1576f9) {
        c0681Dh.A02 = enumC1576f9;
        return enumC1576f9;
    }

    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C1575f8(this));
    }

    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC1576f9 enumC1576f9) {
        this.A02 = enumC1576f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC1576f9 == EnumC1576f9.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    public static /* synthetic */ void A09(C0681Dh c0681Dh) {
        c0681Dh.A05();
    }

    public static /* synthetic */ void A0A(C0681Dh c0681Dh, int i, int i2) {
        c0681Dh.A06(i, i2);
    }

    public static /* synthetic */ boolean A0C(C0681Dh c0681Dh) {
        return c0681Dh.A03;
    }

    public static /* synthetic */ boolean A0D(C0681Dh c0681Dh) {
        return c0681Dh.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AAv(C0710Ek c0710Ek) {
        this.A01 = c0710Ek;
        c0710Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AKV(C0710Ek c0710Ek) {
        A06(1, 0);
        c0710Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
