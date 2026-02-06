package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzave implements Runnable {
    public final /* synthetic */ zzavf X;

    public zzave(zzavf zzavfVar) {
        this.X = zzavfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzawo zzawoVar;
        ConditionVariable conditionVariable2;
        zzavf zzavfVar = this.X;
        if (zzavfVar.b == null) {
            conditionVariable = zzavf.c;
            synchronized (conditionVariable) {
                if (zzavfVar.b != null) {
                    return;
                }
                boolean z2 = false;
                try {
                    z = ((Boolean) zzbcv.O2.e()).booleanValue();
                } catch (IllegalStateException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        zzawoVar = this.X.a;
                        zzavf.d = zzfpx.b(zzawoVar.a, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z2 = z;
                this.X.b = Boolean.valueOf(z2);
                conditionVariable2 = zzavf.c;
                conditionVariable2.open();
            }
        }
    }
}
