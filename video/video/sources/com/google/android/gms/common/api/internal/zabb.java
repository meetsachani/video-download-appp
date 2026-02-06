package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zabb implements ResultCallback<Status> {
    public final /* synthetic */ StatusPendingResult a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ GoogleApiClient c;
    public final /* synthetic */ zabe d;

    public zabb(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.d = zabeVar;
        this.a = statusPendingResult;
        this.b = z;
        this.c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void a(@InterfaceC5670cr1 Status status) {
        Context context;
        Status status2 = status;
        context = this.d.i;
        Storage.b(context).i();
        if (status2.S0() && this.d.u()) {
            zabe zabeVar = this.d;
            zabeVar.i();
            zabeVar.g();
        }
        this.a.o(status2);
        if (this.b) {
            this.c.i();
        }
    }
}
