package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgu implements com.google.android.gms.internal.measurement.zzv {
    public final /* synthetic */ zzgp a;

    public zzgu(zzgp zzgpVar) {
        this.a = zzgpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzv
    public final void a(com.google.android.gms.internal.measurement.zzs zzsVar, String str, List<String> list, boolean z, boolean z2) {
        zzft F;
        int i = zzgw.a[zzsVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        F = this.a.j().J();
                    } else {
                        F = this.a.j().K();
                    }
                } else if (z) {
                    F = this.a.j().N();
                } else if (!z2) {
                    F = this.a.j().M();
                } else {
                    F = this.a.j().L();
                }
            } else if (z) {
                F = this.a.j().I();
            } else if (!z2) {
                F = this.a.j().H();
            } else {
                F = this.a.j().G();
            }
        } else {
            F = this.a.j().F();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    F.a(str);
                    return;
                } else {
                    F.d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            F.c(str, list.get(0), list.get(1));
            return;
        }
        F.b(str, list.get(0));
    }
}
