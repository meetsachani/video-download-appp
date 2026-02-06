package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzegd implements zzgcu {
    public final /* synthetic */ zzfbu a;
    public final /* synthetic */ zzege b;

    public zzegd(zzege zzegeVar, zzfbu zzfbuVar) {
        this.a = zzfbuVar;
        this.b = zzegeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzegf zzegfVar;
        zzegf zzegfVar2;
        zzegf zzegfVar3;
        zzege zzegeVar = this.b;
        synchronized (zzegeVar) {
            try {
                zzegfVar = zzegeVar.h;
                zzfbu zzfbuVar = this.a;
                zzegfVar.b(th, zzfbuVar);
                zzegfVar2 = zzegeVar.h;
                zzfbu a = zzegfVar2.a();
                if (zzfbuVar.v0) {
                    while (a != null) {
                        zzegeVar.e(a);
                        zzegfVar3 = zzegeVar.h;
                        a = zzegfVar3.a();
                    }
                } else if (a != null) {
                    zzegeVar.e(a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzegf zzegfVar;
        zzegf zzegfVar2;
        zzege zzegeVar = this.b;
        zzegv zzegvVar = (zzegv) obj;
        synchronized (zzegeVar) {
            try {
                zzegfVar = zzegeVar.h;
                zzegfVar.c(zzegvVar, this.a);
                zzegfVar2 = zzegeVar.h;
                zzfbu a = zzegfVar2.a();
                if (a != null) {
                    zzegeVar.e(a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
