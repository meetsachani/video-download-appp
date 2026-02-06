package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZT extends View {
    @Nullable
    public ZS A00;

    public ZT(C1673gi c1673gi, ZS zs) {
        super(c1673gi);
        this.A00 = zs;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        ZS zs = this.A00;
    }
}
