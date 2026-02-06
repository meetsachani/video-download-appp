package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzblt implements zzapn {
    public volatile zzblg a;
    public final Context b;

    public zzblt(Context context) {
        this.b = context;
    }

    public static /* bridge */ /* synthetic */ void c(zzblt zzbltVar) {
        if (zzbltVar.a == null) {
            return;
        }
        zzbltVar.a.c();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    @InterfaceC11300zs1
    public final zzapq a(zzapu zzapuVar) throws zzaqd {
        Parcelable.Creator<zzblh> creator = zzblh.CREATOR;
        Map q = zzapuVar.q();
        int size = q.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry entry : q.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        zzblh zzblhVar = new zzblh(zzapuVar.p(), strArr, strArr2);
        long b = com.google.android.gms.ads.internal.zzv.d().b();
        try {
            zzcaf zzcafVar = new zzcaf();
            this.a = new zzblg(this.b, com.google.android.gms.ads.internal.zzv.z().b(), new zzblr(this, zzcafVar), new zzbls(this, zzcafVar));
            this.a.x();
            zzblp zzblpVar = new zzblp(this, zzblhVar);
            zzgdj zzgdjVar = zzcaa.a;
            InterfaceFutureC8411o11 o2 = zzgcy.o(zzgcy.n(zzcafVar, zzblpVar, zzgdjVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I4)).intValue(), TimeUnit.MILLISECONDS, zzcaa.d);
            o2.h4(new zzblq(this), zzgdjVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) o2.get();
            com.google.android.gms.ads.internal.util.zze.k("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.d().b() - b) + "ms");
            zzblj zzbljVar = (zzblj) new zzbvj(parcelFileDescriptor).m0(zzblj.CREATOR);
            if (zzbljVar == null) {
                return null;
            }
            if (!zzbljVar.X) {
                String[] strArr3 = zzbljVar.Z0;
                String[] strArr4 = zzbljVar.a1;
                if (strArr3.length != strArr4.length) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < strArr3.length; i2++) {
                    hashMap.put(strArr3[i2], strArr4[i2]);
                }
                return new zzapq(zzbljVar.Z, zzbljVar.Y0, hashMap, zzbljVar.b1, zzbljVar.c1);
            }
            throw new zzaqd(zzbljVar.Y);
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.k("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.d().b() - b) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.k("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzv.d().b() - b) + "ms");
            throw th;
        }
    }
}
