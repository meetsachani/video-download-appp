package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbca;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfed implements zzfec {
    public final ConcurrentHashMap a;
    public final zzfej b;
    public final zzfef c = new zzfef();

    public zzfed(zzfej zzfejVar) {
        this.a = new ConcurrentHashMap(zzfejVar.a1);
        this.b = zzfejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final zzfej a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    @Deprecated
    public final zzfem b(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        zzfej zzfejVar = this.b;
        return new zzfen(zzmVar, str, new zzbvo(zzfejVar.Y).a().j, zzfejVar.c1, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final synchronized boolean c(zzfem zzfemVar) {
        zzfeb zzfebVar = (zzfeb) this.a.get(zzfemVar);
        if (zzfebVar == null) {
            return true;
        }
        zzfej zzfejVar = this.b;
        if (zzfebVar.b() < zzfejVar.a1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    public final synchronized boolean d(zzfem zzfemVar, zzfel zzfelVar) {
        boolean h;
        try {
            ConcurrentHashMap concurrentHashMap = this.a;
            zzfeb zzfebVar = (zzfeb) concurrentHashMap.get(zzfemVar);
            zzfelVar.d = com.google.android.gms.ads.internal.zzv.d().a();
            if (zzfebVar == null) {
                zzfej zzfejVar = this.b;
                zzfeb zzfebVar2 = new zzfeb(zzfejVar.a1, zzfejVar.b1 * 1000);
                if (concurrentHashMap.size() == zzfejVar.Z0) {
                    int i = zzfejVar.h1;
                    int i2 = i - 1;
                    zzfem zzfemVar2 = null;
                    if (i != 0) {
                        long j = Long.MAX_VALUE;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    int i3 = Integer.MAX_VALUE;
                                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                                        if (((zzfeb) entry.getValue()).a() < i3) {
                                            i3 = ((zzfeb) entry.getValue()).a();
                                            zzfemVar2 = (zzfem) entry.getKey();
                                        }
                                    }
                                    if (zzfemVar2 != null) {
                                        concurrentHashMap.remove(zzfemVar2);
                                    }
                                }
                            } else {
                                for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                                    if (((zzfeb) entry2.getValue()).d() < j) {
                                        j = ((zzfeb) entry2.getValue()).d();
                                        zzfemVar2 = (zzfem) entry2.getKey();
                                    }
                                }
                                if (zzfemVar2 != null) {
                                    concurrentHashMap.remove(zzfemVar2);
                                }
                            }
                        } else {
                            for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                                if (((zzfeb) entry3.getValue()).c() < j) {
                                    j = ((zzfeb) entry3.getValue()).c();
                                    zzfemVar2 = (zzfem) entry3.getKey();
                                }
                            }
                            if (zzfemVar2 != null) {
                                concurrentHashMap.remove(zzfemVar2);
                            }
                        }
                        this.c.g();
                    } else {
                        throw null;
                    }
                }
                concurrentHashMap.put(zzfemVar, zzfebVar2);
                this.c.d();
                zzfebVar = zzfebVar2;
            }
            h = zzfebVar.h(zzfelVar);
            zzfef zzfefVar = this.c;
            zzfefVar.c();
            zzfee a = zzfefVar.a();
            zzfez f = zzfebVar.f();
            zzbca.zzb.zzc D2 = zzbca.zzb.D2();
            zzbca.zzb.zza.C0107zza G2 = zzbca.zzb.zza.G2();
            G2.d2(zzbca.zzb.zzd.IN_MEMORY);
            zzbca.zzb.zzg.zza C2 = zzbca.zzb.zzg.C2();
            C2.b2(a.X);
            C2.c2(a.Y);
            C2.d2(f.Y);
            G2.g2(C2);
            D2.Z1(G2);
            zzfelVar.a.b().c().S(D2.V1());
            f();
        } catch (Throwable th) {
            throw th;
        }
        return h;
    }

    @Override // com.google.android.gms.internal.ads.zzfec
    @InterfaceC11300zs1
    public final synchronized zzfel e(zzfem zzfemVar) {
        zzfel zzfelVar;
        try {
            zzfeb zzfebVar = (zzfeb) this.a.get(zzfemVar);
            if (zzfebVar != null) {
                zzfelVar = zzfebVar.e();
                if (zzfelVar == null) {
                    this.c.e();
                }
                zzfez f = zzfebVar.f();
                if (zzfelVar != null) {
                    zzbca.zzb.zzc D2 = zzbca.zzb.D2();
                    zzbca.zzb.zza.C0107zza G2 = zzbca.zzb.zza.G2();
                    G2.d2(zzbca.zzb.zzd.IN_MEMORY);
                    zzbca.zzb.zze.zza w2 = zzbca.zzb.zze.w2();
                    w2.a2(f.X);
                    w2.b2(f.Y);
                    G2.e2(w2);
                    D2.Z1(G2);
                    zzfelVar.a.b().c().B(D2.V1());
                }
                f();
            } else {
                this.c.f();
                f();
                zzfelVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfelVar;
    }

    public final void f() {
        Parcelable.Creator<zzfej> creator = zzfej.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzfej zzfejVar = this.b;
            sb.append(zzfejVar.Y0);
            sb.append(" PoolCollection");
            sb.append(this.c.b());
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfem) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfeb) entry.getValue()).b(); i2++) {
                    sb.append("[O]");
                }
                for (int b = ((zzfeb) entry.getValue()).b(); b < zzfejVar.a1; b++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfeb) entry.getValue()).g());
                sb.append("\n");
            }
            while (i < zzfejVar.Z0) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.b(sb2);
        }
    }
}
