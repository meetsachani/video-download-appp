package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzdrx;
import com.google.android.gms.internal.ads.zzdsi;
import com.google.android.gms.internal.ads.zzfcg;
import com.google.android.gms.internal.ads.zzfcp;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.firebase.ktx.BuildConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C2638Cg0;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzaa {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfhs a(Bundle bundle) {
        char c;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfhs.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return zzfhs.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzfhs.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzfhs.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzfhs.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzfhs.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzfhs.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzfhs.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzfhs.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzfhs.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfhs.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String b(@InterfaceC11300zs1 String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.d;
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return C2638Cg0.Y4;
            case 3:
                return C2638Cg0.Z4;
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    @InterfaceC11300zs1
    public static String c(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        if (zzmVar != null && (bundle = zzmVar.Z) != null) {
            return bundle.getString("query_info_type");
        }
        return BuildConfig.d;
    }

    public static void d(final zzdsi zzdsiVar, @InterfaceC11300zs1 zzdrx zzdrxVar, final String str, final Pair... pairArr) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d7)).booleanValue()) {
            return;
        }
        zzcaa.a.execute(new Runnable(null, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
            public final /* synthetic */ String Y;
            public final /* synthetic */ Pair[] Z;

            {
                this.Y = str;
                this.Z = pairArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzaa.e(zzdsi.this, null, this.Y, this.Z);
            }
        });
    }

    @InterfaceC5056aJ2
    public static void e(zzdsi zzdsiVar, @InterfaceC11300zs1 zzdrx zzdrxVar, String str, Pair... pairArr) {
        ConcurrentHashMap c = zzdsiVar.c();
        h(c, "action", str);
        for (Pair pair : pairArr) {
            h(c, (String) pair.first, (String) pair.second);
        }
        zzdsiVar.g(c);
    }

    public static boolean f(zzfcg zzfcgVar) {
        return g(zzfcgVar.a.a) != 1;
    }

    public static int g(zzfcp zzfcpVar) {
        if (zzfcpVar.r) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcpVar.d;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.n1;
        if (zzcVar == null && zzmVar.s1 == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.s1 == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    public static void h(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }
}
