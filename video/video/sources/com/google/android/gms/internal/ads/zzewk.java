package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzewk implements zzhfv {
    public static zzety a(Context context, zzbzb zzbzbVar, zzbzc zzbzcVar, Object obj, zzevb zzevbVar, zzevv zzevvVar, zzhfp zzhfpVar, zzhfp zzhfpVar2, zzhfp zzhfpVar3, zzhfp zzhfpVar4, zzhfp zzhfpVar5, zzhfp zzhfpVar6, zzhfp zzhfpVar7, Executor executor, zzfhn zzfhnVar, zzdsd zzdsdVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzevo) obj);
        hashSet.add(zzevbVar);
        hashSet.add(zzevvVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y5)).booleanValue()) {
            hashSet.add((zzetv) zzhfpVar.b());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z5)).booleanValue()) {
            hashSet.add((zzetv) zzhfpVar2.b());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b6)).booleanValue()) {
            hashSet.add((zzetv) zzhfpVar4.b());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c6)).booleanValue()) {
            hashSet.add((zzetv) zzhfpVar5.b());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n3)).booleanValue()) {
            hashSet.add((zzetv) zzhfpVar7.b());
        }
        return new zzety(context, executor, hashSet, zzfhnVar, zzdsdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
