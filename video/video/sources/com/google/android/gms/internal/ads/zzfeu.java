package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfeu implements zzgcu {
    public final /* synthetic */ zzfex a;
    public final /* synthetic */ zzfey b;

    public zzfeu(zzfey zzfeyVar, zzfex zzfexVar) {
        this.a = zzfexVar;
        this.b = zzfeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzfey zzfeyVar = this.b;
        synchronized (zzfeyVar) {
            zzfeyVar.e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r3 = (Void) obj;
        zzfey zzfeyVar = this.b;
        synchronized (zzfeyVar) {
            try {
                zzfeyVar.e = null;
                arrayDeque = zzfeyVar.d;
                arrayDeque.addFirst(this.a);
                i = zzfeyVar.f;
                if (i == 1) {
                    zzfeyVar.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
