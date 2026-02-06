package com.facebook.ads.redexgen.X;

import android.text.Layout;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Jo */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0842Jo {
    public static final Comparator<C0842Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C0842Jo.A00((C0842Jo) obj, (C0842Jo) obj2);
        }
    };
    public final int A00;
    public final C2192pT A01;

    public C0842Jo(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        C04443o cueBuilder = new C04443o().A0G(charSequence).A0F(alignment).A07(f, i).A09(i2).A04(f2).A0A(i3).A06(f3);
        if (z) {
            cueBuilder.A0C(i4);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i5;
    }

    public static /* synthetic */ int A00(C0842Jo c0842Jo, C0842Jo c0842Jo2) {
        return Integer.compare(c0842Jo2.A00, c0842Jo.A00);
    }
}
