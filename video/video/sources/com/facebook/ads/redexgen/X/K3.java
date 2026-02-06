package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public class K3 implements InterfaceC1329b8 {
    public final /* synthetic */ C0836Ji A00;

    public K3(C0836Ji c0836Ji) {
        this.A00 = c0836Ji;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1329b8
    public final void AE7(C1328b7 c1328b7) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c1328b7.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c1328b7.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
