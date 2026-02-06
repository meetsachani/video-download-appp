package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public abstract class zza {
    @InterfaceC8710pF0("AppComponent.class")
    public static zza a;

    public static zza a(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            try {
                if (a == null) {
                    zzai zzaiVar = new zzai(null);
                    zzaiVar.b((Application) context.getApplicationContext());
                    a = zzaiVar.a();
                }
                zzaVar = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzaVar;
    }

    public abstract zzj b();

    public abstract zzbo c();
}
