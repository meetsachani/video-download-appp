package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import o.InterfaceC8223nF0;

/* loaded from: classes2.dex */
final class zaan extends zabg {
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaan(zaao zaaoVar, zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.b = connectionProgressReportCallbacks;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    @InterfaceC8223nF0("mLock")
    public final void a() {
        this.b.a(new ConnectionResult(16, null));
    }
}
