package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfua implements ServiceConnection {
    public final /* synthetic */ zzfuc X;

    public /* synthetic */ zzfua(zzfuc zzfucVar, zzfub zzfubVar) {
        this.X = zzfucVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfuc zzfucVar = this.X;
        zzfuc.d(zzfucVar).c("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfuc.l(zzfucVar, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfty
            @Override // java.lang.Runnable
            public final void run() {
                IInterface b;
                zzfsc W7 = zzfsb.W7(iBinder);
                zzfua zzfuaVar = zzfua.this;
                zzfuc zzfucVar2 = zzfuaVar.X;
                zzfuc.k(zzfucVar2, W7);
                zzfuc.d(zzfucVar2).c("linkToDeath", new Object[0]);
                try {
                    b = zzfuc.b(zzfucVar2);
                } catch (RemoteException e) {
                    zzfuc.d(zzfuaVar.X).b(e, "linkToDeath failed", new Object[0]);
                }
                if (b != null) {
                    b.asBinder().linkToDeath(zzfuc.a(zzfucVar2), 0);
                    zzfuc zzfucVar3 = zzfuaVar.X;
                    zzfuc.j(zzfucVar3, false);
                    synchronized (zzfuc.e(zzfucVar3)) {
                        try {
                            for (Runnable runnable : zzfuc.e(zzfucVar3)) {
                                runnable.run();
                            }
                            zzfuc.e(zzfucVar3).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                throw null;
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfuc zzfucVar = this.X;
        zzfuc.d(zzfucVar).c("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfuc.l(zzfucVar, new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
            @Override // java.lang.Runnable
            public final void run() {
                zzfuc zzfucVar2 = zzfua.this.X;
                zzfuc.d(zzfucVar2).c("unlinkToDeath", new Object[0]);
                IInterface b = zzfuc.b(zzfucVar2);
                b.getClass();
                b.asBinder().unlinkToDeath(zzfuc.a(zzfucVar2), 0);
                zzfuc.k(zzfucVar2, null);
                zzfuc.j(zzfucVar2, false);
            }
        });
    }
}
