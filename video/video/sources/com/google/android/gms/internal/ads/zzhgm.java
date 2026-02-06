package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;
import o.AbstractServiceConnectionC10961yT;
import o.C9743tT;

/* loaded from: classes2.dex */
public final class zzhgm extends AbstractServiceConnectionC10961yT {
    public final WeakReference Y;

    public zzhgm(zzbdw zzbdwVar) {
        this.Y = new WeakReference(zzbdwVar);
    }

    @Override // o.AbstractServiceConnectionC10961yT
    public final void b(ComponentName componentName, C9743tT c9743tT) {
        zzbdw zzbdwVar = (zzbdw) this.Y.get();
        if (zzbdwVar != null) {
            zzbdwVar.c(c9743tT);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdw zzbdwVar = (zzbdw) this.Y.get();
        if (zzbdwVar != null) {
            zzbdwVar.d();
        }
    }
}
