package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class zzga extends ContentObserver {
    public final /* synthetic */ zzfy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzga(zzfy zzfyVar, Handler handler) {
        super(null);
        this.a = zzfyVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
