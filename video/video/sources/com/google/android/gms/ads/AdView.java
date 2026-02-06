package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class AdView extends BaseAdView {
    public AdView(@InterfaceC5670cr1 Context context) {
        super(context, 0);
        Preconditions.s(context, "Context cannot be null");
    }

    @InterfaceC5670cr1
    public final VideoController g() {
        return this.Y0.k();
    }

    public AdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public AdView(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
