package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnx implements zzcaj {
    public final /* synthetic */ zzbny a;

    public zzbnx(zzbny zzbnyVar) {
        this.a = zzbnyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final zzbmu zzbmuVar = (zzbmu) obj;
        zzcaa.f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnw
            @Override // java.lang.Runnable
            public final void run() {
                zzbmu zzbmuVar2 = zzbmuVar;
                zzbmuVar2.v("/result", zzbjv.f226o);
                zzbmuVar2.c();
            }
        });
    }
}
