package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzq extends zzr {
    public zzq(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzr
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzs(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzr
    public final boolean b() {
        return true;
    }
}
