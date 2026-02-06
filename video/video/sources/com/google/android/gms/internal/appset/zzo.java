package com.google.android.gms.internal.appset;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzo extends zze {
    public final /* synthetic */ TaskCompletionSource X;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.X = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void g3(Status status, @InterfaceC11300zs1 com.google.android.gms.appset.zzc zzcVar) {
        AppSetIdInfo appSetIdInfo;
        if (zzcVar != null) {
            appSetIdInfo = new AppSetIdInfo(zzcVar.B0(), zzcVar.m0());
        } else {
            appSetIdInfo = null;
        }
        TaskUtil.b(status, appSetIdInfo, this.X);
    }
}
