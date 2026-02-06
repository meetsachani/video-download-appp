package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzavl;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzq implements Callable {
    public final /* synthetic */ zzu a;

    public zzq(zzu zzuVar) {
        this.a = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        VersionInfoParcel versionInfoParcel;
        Context context;
        zzu zzuVar = this.a;
        versionInfoParcel = zzuVar.X;
        String str = versionInfoParcel.X;
        context = zzuVar.Y0;
        int i = zzavk.C1;
        return new zzavl(zzavk.x(context, new zzavi(str, false)));
    }
}
