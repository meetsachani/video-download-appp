package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Yt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1226Yt extends AdNativeComponentView {
    public static final int A01 = (int) (XX.A02 * 1.0f);
    public final ImageView A00;

    public C1226Yt(C1673gi c1673gi) {
        super(c1673gi);
        this.A00 = new ZI(c1673gi);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC1183Xc.A04(this.A00, EnumC1183Xc.A0B);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        YB.A0N(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
