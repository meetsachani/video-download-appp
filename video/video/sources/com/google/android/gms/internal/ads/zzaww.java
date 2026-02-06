package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaww implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ zzawx a;

    public zzaww(zzawx zzawxVar) {
        this.a = zzawxVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            zzawx zzawxVar = this.a;
            zzawxVar.a = System.currentTimeMillis();
            zzawxVar.d = true;
            return;
        }
        zzawx zzawxVar2 = this.a;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzawxVar2.b;
        if (j > 0) {
            j2 = zzawxVar2.b;
            if (currentTimeMillis >= j2) {
                j3 = zzawxVar2.b;
                zzawxVar2.c = currentTimeMillis - j3;
            }
        }
        zzawxVar2.d = false;
    }
}
