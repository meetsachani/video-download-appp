package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzelb implements zzelg {
    public final /* synthetic */ zzelc a;

    public zzelb(zzelc zzelcVar) {
        this.a = zzelcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void a() {
        synchronized (this.a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzcqx zzcqxVar = (zzcqx) obj;
        zzelc zzelcVar = this.a;
        synchronized (zzelcVar) {
            zzelcVar.c = zzcqxVar.c();
            zzcqxVar.b();
        }
    }
}
