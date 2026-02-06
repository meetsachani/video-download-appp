package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbca;

/* loaded from: classes2.dex */
public final class zzebb implements zzfgu {
    public final zzeap X;
    public final zzeat Y;

    public zzebb(zzeap zzeapVar, zzeat zzeatVar) {
        this.X = zzeapVar;
        this.Y = zzeatVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void g(zzfgn zzfgnVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue()) {
            if (zzfgn.RENDERER == zzfgnVar) {
                this.X.g(com.google.android.gms.ads.internal.zzv.d().b());
            } else if (zzfgn.PRELOADED_LOADER != zzfgnVar && zzfgn.SERVER_TRANSACTION != zzfgnVar) {
            } else {
                zzeap zzeapVar = this.X;
                zzeapVar.h(com.google.android.gms.ads.internal.zzv.d().b());
                final zzeat zzeatVar = this.Y;
                final long d = zzeapVar.d();
                zzeatVar.b.a(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeas
                    @Override // com.google.android.gms.internal.ads.zzffx
                    public final Object b(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (!zzeat.this.a()) {
                            long j = d;
                            zzbca.zzaf.zza.C0106zza E3 = zzbca.zzaf.zza.E3();
                            E3.p2(j);
                            byte[] b1 = E3.V1().b1();
                            zzeba.f(sQLiteDatabase, false, false);
                            zzeba.c(sQLiteDatabase, j, b1);
                            return null;
                        }
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void h(zzfgn zzfgnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void n(zzfgn zzfgnVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue() && zzfgn.RENDERER == zzfgnVar) {
            zzeap zzeapVar = this.X;
            if (zzeapVar.c() != 0) {
                zzeapVar.f(com.google.android.gms.ads.internal.zzv.d().b() - zzeapVar.c());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final void q(zzfgn zzfgnVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s6)).booleanValue() && zzfgn.RENDERER == zzfgnVar) {
            zzeap zzeapVar = this.X;
            if (zzeapVar.c() != 0) {
                zzeapVar.f(com.google.android.gms.ads.internal.zzv.d().b() - zzeapVar.c());
            }
        }
    }
}
