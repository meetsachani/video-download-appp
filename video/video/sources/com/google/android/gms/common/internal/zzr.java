package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzr implements Handler.Callback {
    public final /* synthetic */ zzs X;

    public /* synthetic */ zzr(zzs zzsVar, zzq zzqVar) {
        this.X = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.X.f;
            synchronized (hashMap) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    hashMap2 = this.X.f;
                    zzp zzpVar = (zzp) hashMap2.get(zzoVar);
                    if (zzpVar != null && zzpVar.i()) {
                        if (zzpVar.j()) {
                            zzpVar.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.X.f;
                        hashMap3.remove(zzoVar);
                    }
                } finally {
                }
            }
            return true;
        } else if (i == 1) {
            hashMap4 = this.X.f;
            synchronized (hashMap4) {
                try {
                    zzo zzoVar2 = (zzo) message.obj;
                    hashMap5 = this.X.f;
                    zzp zzpVar2 = (zzp) hashMap5.get(zzoVar2);
                    if (zzpVar2 != null && zzpVar2.a() == 3) {
                        String valueOf = String.valueOf(zzoVar2);
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                        ComponentName b = zzpVar2.b();
                        if (b == null) {
                            b = zzoVar2.a();
                        }
                        if (b == null) {
                            String c = zzoVar2.c();
                            Preconditions.r(c);
                            b = new ComponentName(c, "unknown");
                        }
                        zzpVar2.onServiceDisconnected(b);
                    }
                } finally {
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
