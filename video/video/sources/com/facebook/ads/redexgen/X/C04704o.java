package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.facebook.ads.redexgen.X.4o */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04704o extends BroadcastReceiver {
    public final /* synthetic */ C04714p A00;

    public C04704o(C04714p c04714p) {
        this.A00 = c04714p;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int A00;
        A00 = C04714p.A00(context);
        if (C5C.A02 >= 31 && A00 == 5) {
            C04684m.A02(context, this.A00);
        } else {
            this.A00.A07(A00);
        }
    }
}
