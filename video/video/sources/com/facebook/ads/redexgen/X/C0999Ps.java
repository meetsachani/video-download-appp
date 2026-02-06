package com.facebook.ads.redexgen.X;

import android.database.DataSetObserver;

/* renamed from: com.facebook.ads.redexgen.X.Ps  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0999Ps extends DataSetObserver {
    public final /* synthetic */ Pv A00;

    public C0999Ps(Pv pv) {
        this.A00 = pv;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.A00.A0e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.A00.A0e();
    }
}
