package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import o.MB;

/* loaded from: classes2.dex */
public final class zzejj {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final zzdpt b;

    public zzejj(zzdpt zzdptVar) {
        this.b = zzdptVar;
    }

    @MB
    public final zzbrk a(String str) {
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbrk) concurrentHashMap.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.a.put(str, this.b.b(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.l("Couldn't create RTB adapter : ", e);
        }
    }
}
