package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
final class zaal implements BaseGmsClient.ConnectionProgressReportCallbacks {
    public final WeakReference<zaaw> a;
    public final Api<?> b;
    public final boolean c;

    public zaal(zaaw zaawVar, Api<?> api, boolean z) {
        this.a = new WeakReference<>(zaawVar);
        this.b = api;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void a(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        zabi zabiVar;
        boolean z;
        Lock lock;
        Lock lock2;
        boolean o2;
        boolean p;
        Lock lock3;
        zaaw zaawVar = this.a.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabiVar = zaawVar.a;
        if (myLooper == zabiVar.i1.r()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.y(z, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.b;
        lock.lock();
        try {
            o2 = zaawVar.o(0);
            if (!o2) {
                lock3 = zaawVar.b;
            } else {
                if (!connectionResult.H0()) {
                    zaawVar.m(connectionResult, this.b, this.c);
                }
                p = zaawVar.p();
                if (p) {
                    zaawVar.n();
                }
                lock3 = zaawVar.b;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = zaawVar.b;
            lock2.unlock();
            throw th;
        }
    }
}
