package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbca;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzeax extends zzeay {
    public static final SparseArray h;
    public final Context c;
    public final zzcuw d;
    public final TelephonyManager e;
    public final zzeap f;
    public zzbca.zzq g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbca.zzaf.zzd.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbca.zzaf.zzd zzdVar = zzbca.zzaf.zzd.CONNECTING;
        sparseArray.put(ordinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbca.zzaf.zzd.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbca.zzaf.zzd zzdVar2 = zzbca.zzaf.zzd.DISCONNECTED;
        sparseArray.put(ordinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbca.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzeax(Context context, zzcuw zzcuwVar, zzeap zzeapVar, zzeal zzealVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzealVar, zzgVar);
        this.c = context;
        this.d = zzcuwVar;
        this.f = zzeapVar;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbca.zzab b(zzeax zzeaxVar, Bundle bundle) {
        zzbca.zzab.zzb zzbVar;
        zzbca.zzab.zza v2 = zzbca.zzab.v2();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzeaxVar.g = zzbca.zzq.ENUM_TRUE;
        } else {
            zzeaxVar.g = zzbca.zzq.ENUM_FALSE;
            if (i != 0) {
                if (i != 1) {
                    v2.b2(zzbca.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
                } else {
                    v2.b2(zzbca.zzab.zzc.WIFI);
                }
            } else {
                v2.b2(zzbca.zzab.zzc.CELL);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbca.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbca.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbca.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbca.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            v2.a2(zzbVar);
        }
        return v2.V1();
    }

    public static /* bridge */ /* synthetic */ zzbca.zzaf.zzd c(zzeax zzeaxVar, Bundle bundle) {
        return (zzbca.zzaf.zzd) h.get(zzfdd.a(zzfdd.a(bundle, "device"), "network").getInt("active_network_state", -1), zzbca.zzaf.zzd.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] f(zzeax zzeaxVar, boolean z, ArrayList arrayList, zzbca.zzab zzabVar, zzbca.zzaf.zzd zzdVar) {
        boolean z2;
        zzbca.zzaf.zza.C0106zza E3 = zzbca.zzaf.zza.E3();
        E3.r2(arrayList);
        Context context = zzeaxVar.c;
        boolean z3 = false;
        if (Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        E3.b2(g(z2));
        E3.c2(com.google.android.gms.ads.internal.zzv.w().f(context, zzeaxVar.e));
        zzeap zzeapVar = zzeaxVar.f;
        E3.m2(zzeapVar.e());
        E3.k2(zzeapVar.b());
        E3.e2(zzeapVar.a());
        E3.f2(zzdVar);
        E3.h2(zzabVar);
        E3.j2(zzeaxVar.g);
        E3.n2(g(z));
        E3.p2(zzeapVar.d());
        E3.o2(com.google.android.gms.ads.internal.zzv.d().a());
        if (Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0) {
            z3 = true;
        }
        E3.q2(g(z3));
        return E3.V1().b1();
    }

    public static final zzbca.zzq g(boolean z) {
        if (z) {
            return zzbca.zzq.ENUM_TRUE;
        }
        return zzbca.zzq.ENUM_FALSE;
    }

    public final void e(boolean z) {
        zzgcy.r(this.d.b(new Bundle()), new zzeaw(this, z), zzcaa.g);
    }
}
