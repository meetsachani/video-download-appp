package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzeyz {
    public static void a(AtomicReference atomicReference, zzeyy zzeyyVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeyyVar.b(obj);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
