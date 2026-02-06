package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzegs implements zzgcu {
    public final /* synthetic */ long a;
    public final /* synthetic */ zzfbx b;
    public final /* synthetic */ zzfbu c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zzfjn e;
    public final /* synthetic */ zzfcg f;
    public final /* synthetic */ zzegu g;

    public zzegs(zzegu zzeguVar, long j, zzfbx zzfbxVar, zzfbu zzfbuVar, String str, zzfjn zzfjnVar, zzfcg zzfcgVar) {
        this.a = j;
        this.b = zzfbxVar;
        this.c = zzfbuVar;
        this.d = str;
        this.e = zzfjnVar;
        this.f = zzfcgVar;
        this.g = zzeguVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Throwable th) {
        Clock clock;
        int i;
        int i2;
        com.google.android.gms.ads.internal.client.zze b;
        Integer valueOf;
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzedk zzedkVar;
        zzfjr zzfjrVar;
        zzegw zzegwVar;
        zzegu zzeguVar = this.g;
        clock = zzeguVar.a;
        long b2 = clock.b() - this.a;
        zzedj zzedjVar = null;
        if (th instanceof TimeoutException) {
            i2 = 2;
        } else {
            if (th instanceof zzegc) {
                i = 3;
            } else if (th instanceof CancellationException) {
                i2 = 4;
            } else if (th instanceof zzfcw) {
                i2 = 5;
            } else if (th instanceof zzdwf) {
                if (zzfdq.a(th).X == 3) {
                    i2 = 1;
                } else {
                    i2 = 6;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O1)).booleanValue() && (th instanceof zzedj) && (b = ((zzedj) th).b()) != null) {
                    valueOf = Integer.valueOf(b.X);
                    i = i2;
                    synchronized (zzeguVar) {
                        try {
                            z = zzeguVar.e;
                            if (z) {
                                zzegwVar = zzeguVar.b;
                                zzfbx zzfbxVar = this.b;
                                zzfbu zzfbuVar = this.c;
                                if (th instanceof zzedj) {
                                    zzedjVar = (zzedj) th;
                                }
                                zzegwVar.a(zzfbxVar, zzfbuVar, i, zzedjVar, b2);
                                b2 = b2;
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F8)).booleanValue()) {
                                zzfjrVar = zzeguVar.c;
                                zzfjn zzfjnVar = this.e;
                                zzfcg zzfcgVar = this.f;
                                zzfbu zzfbuVar2 = this.c;
                                zzfjrVar.e(zzfjnVar.d(zzfcgVar, zzfbuVar2, zzfbuVar2.n), zzfbuVar2.x0);
                            }
                            z2 = zzeguVar.g;
                            if (!z2) {
                                linkedHashMap = zzeguVar.d;
                                zzfbu zzfbuVar3 = this.c;
                                linkedHashMap.put(zzfbuVar3, new zzegt(this.d, zzfbuVar3.f0, i, b2, valueOf));
                                com.google.android.gms.ads.internal.client.zze a = zzfdq.a(th);
                                int i3 = a.X;
                                if ((i3 == 3 || i3 == 0) && (zzeVar = a.Y0) != null && !zzeVar.Z.equals(MobileAds.a)) {
                                    a = zzfdq.a(new zzedj(13, a.Y0));
                                }
                                zzedkVar = zzeguVar.f;
                                zzedkVar.f(zzfbuVar3, b2, a);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } else {
                i = 6;
            }
            valueOf = null;
            synchronized (zzeguVar) {
            }
        }
        i = i2;
        valueOf = null;
        synchronized (zzeguVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void c(Object obj) {
        Clock clock;
        boolean z;
        long j;
        boolean z2;
        boolean q;
        LinkedHashMap linkedHashMap;
        zzedk zzedkVar;
        LinkedHashMap linkedHashMap2;
        zzegw zzegwVar;
        zzegu zzeguVar = this.g;
        clock = zzeguVar.a;
        long b = clock.b() - this.a;
        synchronized (zzeguVar) {
            try {
                z = zzeguVar.e;
                if (z) {
                    zzegwVar = zzeguVar.b;
                    j = b;
                    zzegwVar.a(this.b, this.c, 0, null, j);
                } else {
                    j = b;
                }
                z2 = zzeguVar.g;
                if (z2) {
                    return;
                }
                zzfbu zzfbuVar = this.c;
                q = zzeguVar.q(zzfbuVar);
                if (q) {
                    linkedHashMap2 = zzeguVar.d;
                    ((zzegt) linkedHashMap2.get(zzfbuVar)).d = j;
                } else {
                    linkedHashMap = zzeguVar.d;
                    long j2 = j;
                    j = j2;
                    linkedHashMap.put(zzfbuVar, new zzegt(this.d, zzfbuVar.f0, 0, j2, null));
                }
                zzedkVar = zzeguVar.f;
                zzedkVar.g(zzfbuVar, j, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
