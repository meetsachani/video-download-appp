package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzebs implements zzgcu {
    public final /* synthetic */ zzffx a;

    public zzebs(zzebt zzebtVar, zzffx zzffxVar) {
        this.a = zzffxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.d("Failed to get offline buffered ping database: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            this.a.b((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Error executing function on offline buffered ping database: ".concat(valueOf));
        }
    }
}
