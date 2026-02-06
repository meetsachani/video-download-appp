package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzfyj extends zzfwd {
    public final /* synthetic */ zzfvd Y0;
    public final /* synthetic */ Iterator Z;

    public zzfyj(Iterator it, zzfvd zzfvdVar) {
        this.Z = it;
        this.Y0 = zzfvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    public final Object b() {
        zzfvd zzfvdVar;
        Object next;
        do {
            Iterator it = this.Z;
            if (it.hasNext()) {
                zzfvdVar = this.Y0;
                next = it.next();
            } else {
                c();
                return null;
            }
        } while (!zzfvdVar.b(next));
        return next;
    }
}
