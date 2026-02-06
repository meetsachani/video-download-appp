package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import o.InterfaceC11300zs1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcdj implements zzbjw {
    @InterfaceC11300zs1
    public static final Integer b(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = "Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str));
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(str2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // com.google.android.gms.internal.ads.zzbjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        zzcdi zzcdiVar;
        int i;
        zzcbw zzcbwVar = (zzcbw) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.b("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdb a = com.google.android.gms.ads.internal.zzv.a();
        if (map.containsKey("abort")) {
            if (!a.h(zzcbwVar)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Precache abort but no precache task running.");
                return;
            }
            return;
        }
        String str = (String) map.get("src");
        Integer b = b(map, "periodicReportIntervalMs");
        Integer b2 = b(map, "exoPlayerRenderingIntervalMs");
        Integer b3 = b(map, "exoPlayerIdleIntervalMs");
        zzcbv zzcbvVar = new zzcbv((String) map.get("flags"));
        boolean z = zzcbvVar.k;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzcda zzcdaVar = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            strArr2[i2] = jSONArray.getString(i2);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.g("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                            if (strArr == null) {
                            }
                            if (!z) {
                            }
                            if (zzcdaVar == null) {
                            }
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (!z) {
                Iterator it = a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zzcda zzcdaVar2 = (zzcda) it.next();
                    if (zzcdaVar2.c == zzcbwVar && str.equals(zzcdaVar2.e())) {
                        zzcdaVar = zzcdaVar2;
                        break;
                    }
                }
            } else {
                zzcdaVar = a.d(zzcbwVar);
            }
            if (zzcdaVar == null) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Precache task is already running.");
                return;
            } else if (zzcbwVar.j() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Precache requires a dependency provider.");
                return;
            } else {
                Integer b4 = b(map, "player");
                if (b4 == null) {
                    b4 = Integer.valueOf(i);
                }
                if (b != null) {
                    zzcbwVar.Q(b.intValue());
                }
                if (b2 != null) {
                    zzcbwVar.C0(b2.intValue());
                }
                if (b3 != null) {
                    zzcbwVar.y0(b3.intValue());
                }
                int intValue = b4.intValue();
                zzcct zzcctVar = zzcbwVar.j().b;
                if (intValue > 0) {
                    int i3 = zzcbvVar.g;
                    int Q = zzcbn.Q();
                    if (Q < i3) {
                        zzcdiVar = new zzcdr(zzcbwVar, zzcbvVar);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f223o)).booleanValue()) {
                            Q = zzcdo.z();
                        }
                        if (Q < zzcbvVar.b) {
                            zzcdiVar = new zzcdo(zzcbwVar, zzcbvVar);
                        } else {
                            zzcdiVar = new zzcdm(zzcbwVar);
                        }
                    }
                } else {
                    zzcdiVar = new zzcdl(zzcbwVar);
                }
                new zzcda(zzcbwVar, zzcdiVar, str, strArr).b();
            }
        } else {
            zzcda d = a.d(zzcbwVar);
            if (d != null) {
                zzcdiVar = d.d;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.g("Precache must specify a source.");
                return;
            }
        }
        Integer b5 = b(map, "minBufferMs");
        if (b5 != null) {
            zzcdiVar.v(b5.intValue());
        }
        Integer b6 = b(map, "maxBufferMs");
        if (b6 != null) {
            zzcdiVar.u(b6.intValue());
        }
        Integer b7 = b(map, "bufferForPlaybackMs");
        if (b7 != null) {
            zzcdiVar.s(b7.intValue());
        }
        Integer b8 = b(map, "bufferForPlaybackAfterRebufferMs");
        if (b8 != null) {
            zzcdiVar.t(b8.intValue());
        }
    }
}
