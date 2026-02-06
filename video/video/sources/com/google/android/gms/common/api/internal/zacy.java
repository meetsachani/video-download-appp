package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import o.InterfaceC10697xN2;

/* loaded from: classes2.dex */
final class zacy implements Runnable {
    public final /* synthetic */ Result X;
    public final /* synthetic */ zada Y;

    public zacy(zada zadaVar, Result result) {
        this.Y = zadaVar;
        this.X = result;
    }

    @Override // java.lang.Runnable
    @InterfaceC10697xN2
    public final void run() {
        WeakReference weakReference;
        zacz zaczVar;
        zacz zaczVar2;
        WeakReference weakReference2;
        GoogleApiClient googleApiClient;
        ResultTransform resultTransform;
        zacz zaczVar3;
        zacz zaczVar4;
        WeakReference weakReference3;
        try {
            try {
                ThreadLocal<Boolean> threadLocal = BasePendingResult.p;
                threadLocal.set(Boolean.TRUE);
                resultTransform = this.Y.a;
                PendingResult c = ((ResultTransform) Preconditions.r(resultTransform)).c(this.X);
                zada zadaVar = this.Y;
                zaczVar3 = zadaVar.h;
                zaczVar4 = zadaVar.h;
                zaczVar3.sendMessage(zaczVar4.obtainMessage(0, c));
                threadLocal.set(Boolean.FALSE);
                zada zadaVar2 = this.Y;
                zada.q(this.X);
                weakReference3 = this.Y.g;
                googleApiClient = (GoogleApiClient) weakReference3.get();
                if (googleApiClient == null) {
                    return;
                }
            } catch (RuntimeException e) {
                zada zadaVar3 = this.Y;
                zaczVar = zadaVar3.h;
                zaczVar2 = zadaVar3.h;
                zaczVar.sendMessage(zaczVar2.obtainMessage(1, e));
                BasePendingResult.p.set(Boolean.FALSE);
                zada zadaVar4 = this.Y;
                zada.q(this.X);
                weakReference2 = this.Y.g;
                googleApiClient = (GoogleApiClient) weakReference2.get();
                if (googleApiClient == null) {
                    return;
                }
            }
            googleApiClient.I(this.Y);
        } catch (Throwable th) {
            BasePendingResult.p.set(Boolean.FALSE);
            zada zadaVar5 = this.Y;
            zada.q(this.X);
            weakReference = this.Y.g;
            GoogleApiClient googleApiClient2 = (GoogleApiClient) weakReference.get();
            if (googleApiClient2 != null) {
                googleApiClient2.I(this.Y);
            }
            throw th;
        }
    }
}
