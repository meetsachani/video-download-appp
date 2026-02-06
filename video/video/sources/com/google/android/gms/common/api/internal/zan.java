package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes2.dex */
final class zan extends zabw {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ zao b;

    public zan(zao zaoVar, Dialog dialog) {
        this.b = zaoVar;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        this.b.Y.p();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
