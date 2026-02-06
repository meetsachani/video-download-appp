package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zax implements zabz {
    public final /* synthetic */ zaaa a;

    public /* synthetic */ zax(zaaa zaaaVar, zaw zawVar) {
        this.a = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void a(@InterfaceC11300zs1 Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.a.h1;
        lock.lock();
        try {
            zaaa.B(this.a, bundle);
            this.a.e1 = ConnectionResult.y1;
            zaaa.C(this.a);
        } finally {
            lock2 = this.a.h1;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void b(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabi zabiVar;
        lock = this.a.h1;
        lock.lock();
        try {
            zaaa zaaaVar = this.a;
            z2 = zaaaVar.g1;
            if (!z2) {
                connectionResult = zaaaVar.f1;
                if (connectionResult != null) {
                    connectionResult2 = zaaaVar.f1;
                    if (connectionResult2.H0()) {
                        this.a.g1 = true;
                        zabiVar = this.a.Z0;
                        zabiVar.g1(i);
                        lock3 = this.a.h1;
                        lock3.unlock();
                    }
                }
            }
            this.a.g1 = false;
            zaaa.A(this.a, i, z);
            lock3 = this.a.h1;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.a.h1;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void c(@InterfaceC5670cr1 ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.a.h1;
        lock.lock();
        try {
            this.a.e1 = connectionResult;
            zaaa.C(this.a);
        } finally {
            lock2 = this.a.h1;
            lock2.unlock();
        }
    }
}
