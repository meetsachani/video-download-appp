package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbca;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeaw implements zzgcu {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ zzeax b;

    public zzeaw(zzeax zzeaxVar, boolean z) {
        this.a = z;
        this.b = zzeaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    @Override // com.google.android.gms.internal.ads.zzgcu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        List<String> list;
        List asList;
        char c;
        zzbca.zzd.zza zzaVar;
        zzeax zzeaxVar = this.b;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (zzeaxVar.a()) {
            return;
        }
        Bundle bundle = zzcuvVar.a;
        Object obj2 = bundle.get("ad_types");
        if (obj2 instanceof List) {
            asList = (List) obj2;
        } else if (obj2 instanceof String[]) {
            asList = Arrays.asList((String[]) obj2);
        } else {
            list = Collections.EMPTY_LIST;
            final ArrayList arrayList = new ArrayList();
            for (String str : list) {
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                zzaVar = zzbca.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                            } else {
                                zzaVar = zzbca.zzd.zza.REWARD_BASED_VIDEO_AD;
                            }
                        } else {
                            zzaVar = zzbca.zzd.zza.NATIVE_APP_INSTALL;
                        }
                    } else {
                        zzaVar = zzbca.zzd.zza.INTERSTITIAL;
                    }
                } else {
                    zzaVar = zzbca.zzd.zza.BANNER;
                }
                arrayList.add(zzaVar);
            }
            final zzbca.zzaf.zzd c2 = zzeax.c(zzeaxVar, bundle);
            final zzbca.zzab b = zzeax.b(zzeaxVar, bundle);
            final boolean z = this.a;
            zzeaxVar.b.a(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeav
                @Override // com.google.android.gms.internal.ads.zzffx
                public final Object b(Object obj3) {
                    zzeap zzeapVar;
                    zzeax zzeaxVar2 = zzeaw.this.b;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (!zzeaxVar2.a()) {
                        zzbca.zzaf.zzd zzdVar = c2;
                        zzbca.zzab zzabVar = b;
                        ArrayList arrayList2 = arrayList;
                        boolean z2 = z;
                        byte[] f = zzeax.f(zzeaxVar2, z2, arrayList2, zzabVar, zzdVar);
                        zzeba.f(sQLiteDatabase, z2, true);
                        zzeapVar = zzeaxVar2.f;
                        zzeba.c(sQLiteDatabase, zzeapVar.d(), f);
                        return null;
                    }
                    return null;
                }
            });
        }
        ArrayList arrayList2 = new ArrayList(asList.size());
        for (Object obj3 : asList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        list = Collections.unmodifiableList(arrayList2);
        final ArrayList arrayList3 = new ArrayList();
        while (r1.hasNext()) {
        }
        final zzbca.zzaf.zzd c22 = zzeax.c(zzeaxVar, bundle);
        final zzbca.zzab b2 = zzeax.b(zzeaxVar, bundle);
        final boolean z2 = this.a;
        zzeaxVar.b.a(new zzffx() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj32) {
                zzeap zzeapVar;
                zzeax zzeaxVar2 = zzeaw.this.b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj32;
                if (!zzeaxVar2.a()) {
                    zzbca.zzaf.zzd zzdVar = c22;
                    zzbca.zzab zzabVar = b2;
                    ArrayList arrayList22 = arrayList3;
                    boolean z22 = z2;
                    byte[] f = zzeax.f(zzeaxVar2, z22, arrayList22, zzabVar, zzdVar);
                    zzeba.f(sQLiteDatabase, z22, true);
                    zzeapVar = zzeaxVar2.f;
                    zzeba.c(sQLiteDatabase, zzeapVar.d(), f);
                    return null;
                }
                return null;
            }
        });
    }
}
