package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjp implements zznf {
    public final /* synthetic */ zziq a;

    public zzjp(zziq zziqVar) {
        this.a = zziqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznf
    public final void b(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.a.Z("auto", str2, bundle, str);
        } else {
            this.a.z0("auto", str2, bundle);
        }
    }
}
