package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbjv {
    public static final zzbjw a = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbit
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void a(Object obj, Map map) {
            String str;
            zzcgi zzcgiVar = (zzcgi) obj;
            zzbjw zzbjwVar = zzbjv.a;
            String str2 = (String) map.get("urls");
            if (TextUtils.isEmpty(str2)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str2.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcgiVar.getContext().getPackageManager();
            for (String str3 : split) {
                String[] split2 = str3.split(";", 2);
                String trim = split2[0].trim();
                boolean z2 = true;
                if (split2.length > 1) {
                    str = split2[1].trim();
                } else {
                    str = "android.intent.action.VIEW";
                }
                if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), 65536) == null) {
                    z2 = false;
                }
                Boolean valueOf = Boolean.valueOf(z2);
                hashMap.put(str3, valueOf);
                com.google.android.gms.ads.internal.util.zze.k("/canOpenURLs;" + str3 + ";" + valueOf);
            }
            ((zzbmr) zzcgiVar).q("openableURLs", hashMap);
        }
    };
    public static final zzbjw b = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiv
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void a(Object obj, Map map) {
            boolean z2;
            zzcgi zzcgiVar = (zzcgi) obj;
            zzbjw zzbjwVar = zzbjv.a;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z8)).booleanValue()) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (zzcgiVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            Boolean valueOf = Boolean.valueOf(z2);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.k("/canOpenApp;" + str + ";" + valueOf);
            ((zzbmr) zzcgiVar).q("openableApp", hashMap);
        }
    };
    public static final zzbjw c = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiy
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void a(Object obj, Map map) {
            zzbjv.b((zzcgi) obj, map);
        }
    };
    public static final zzbjw d = new zzbjn();
    public static final zzbjw e = new zzbjo();
    public static final zzbjw f = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiz
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void a(Object obj, Map map) {
            com.google.android.gms.ads.internal.util.client.zzv zzvVar;
            zzcgi zzcgiVar = (zzcgi) obj;
            zzbjw zzbjwVar = zzbjv.a;
            String str = (String) map.get("u");
            if (str == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("URL missing from httpTrack GMSG.");
                return;
            }
            zzces zzcesVar = (zzces) zzcgiVar;
            if (zzcesVar.F() != null) {
                zzvVar = zzcesVar.F().x0;
            } else {
                zzvVar = null;
            }
            new com.google.android.gms.ads.internal.util.zzbw(zzcgiVar.getContext(), ((zzcgp) zzcgiVar).m().X, str, null, zzvVar).b();
        }
    };
    public static final zzbjw g = new zzbjp();
    public static final zzbjw h = new zzbjq();
    public static final zzbjw i = new zzbjw() { // from class: com.google.android.gms.internal.ads.zzbiw
        @Override // com.google.android.gms.internal.ads.zzbjw
        public final void a(Object obj, Map map) {
            zzcgo zzcgoVar = (zzcgo) obj;
            zzbjw zzbjwVar = zzbjv.a;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzavl D = zzcgoVar.D();
                if (D != null) {
                    D.c().d(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbjw j = new zzbjr();
    public static final zzbjw k = new zzbjs();
    public static final zzbjw l = new zzccw();
    public static final zzbjw m = new zzccx();
    public static final zzbjw n = new zzbip();

    /* renamed from: o  reason: collision with root package name */
    public static final zzbkm f226o = new zzbkm();
    public static final zzbjw p = new zzbjt();
    public static final zzbjw q = new zzbju();
    public static final zzbjw r = new zzbja();
    public static final zzbjw s = new zzbjb();
    public static final zzbjw t = new zzbjc();
    public static final zzbjw u = new zzbjd();
    public static final zzbjw v = new zzbje();
    public static final zzbjw w = new zzbjf();
    public static final zzbjw x = new zzbjg();
    public static final zzbjw y = new zzbjh();
    public static final zzbjw z = new zzbji();
    public static final zzbjw A = new zzbjj();
    public static final zzbjw B = new zzbjl();
    public static final zzbjw C = new zzbjm();

    public static InterfaceFutureC8411o11 a(zzcfb zzcfbVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzavl D = zzcfbVar.D();
            zzfct s0 = zzcfbVar.s0();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.nc)).booleanValue() && s0 != null) {
                if (D != null && D.f(parse)) {
                    parse = s0.a(parse, zzcfbVar.getContext(), zzcfbVar.U(), zzcfbVar.i());
                }
            } else if (D != null && D.f(parse)) {
                parse = D.a(parse, zzcfbVar.getContext(), zzcfbVar.U(), zzcfbVar.i());
            }
        } catch (zzavm unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(concat);
        }
        Map hashMap = new HashMap();
        if (zzcfbVar.F() != null) {
            hashMap = zzcfbVar.F().w0;
        }
        final String b2 = zzbyl.b(parse, zzcfbVar.getContext(), hashMap);
        long longValue = ((Long) zzbeu.e.e()).longValue();
        if (longValue > 0 && longValue <= 251815200) {
            zzgcp A2 = zzgcp.A(zzcfbVar.u0());
            zzfur zzfurVar = new zzfur() { // from class: com.google.android.gms.internal.ads.zzbiq
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbjw zzbjwVar = zzbjv.a;
                    if (((Boolean) zzbeu.i.e()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.t().x(th, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzgdj zzgdjVar = zzcaa.g;
            return (zzgcp) zzgcy.e((zzgcp) zzgcy.m((zzgcp) zzgcy.e(A2, Throwable.class, zzfurVar, zzgdjVar), new zzfur() { // from class: com.google.android.gms.internal.ads.zzbir
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    zzbjw zzbjwVar = zzbjv.a;
                    String str3 = b2;
                    if (str2 != null) {
                        if (((Boolean) zzbeu.f.e()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str3).getHost();
                            for (int i3 = 0; i3 < 3; i3++) {
                                if (!host.endsWith(strArr[i3])) {
                                }
                            }
                        }
                        String str4 = (String) zzbeu.a.e();
                        String str5 = (String) zzbeu.b.e();
                        if (!TextUtils.isEmpty(str4)) {
                            str3 = str3.replace(str4, str2);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str3);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                            }
                        }
                    }
                    return str3;
                }
            }, zzgdjVar), Throwable.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzbis
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbjw zzbjwVar = zzbjv.a;
                    if (((Boolean) zzbeu.i.e()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.t().x(th, "prepareClickUrl.attestation2");
                    }
                    return b2;
                }
            }, zzgdjVar);
        }
        return zzgcy.h(b2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
        com.google.android.gms.ads.internal.zzv.t().x(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r7 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.e("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(zzcgi zzcgiVar, Map map) {
        String optString;
        String optString2;
        String optString3;
        String optString4;
        String optString5;
        String optString6;
        String optString7;
        ResolveInfo resolveInfo;
        Intent parseUri;
        PackageManager packageManager = zzcgiVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        optString = jSONObject2.optString("id");
                        optString2 = jSONObject2.optString("u");
                        optString3 = jSONObject2.optString("i");
                        optString4 = jSONObject2.optString("m");
                        optString5 = jSONObject2.optString("p");
                        optString6 = jSONObject2.optString("c");
                        optString7 = jSONObject2.optString("intent_url");
                        resolveInfo = null;
                    } catch (JSONException e2) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Error parsing the intent data.", e2);
                    }
                    if (!TextUtils.isEmpty(optString7)) {
                        try {
                            parseUri = Intent.parseUri(optString7, 0);
                        } catch (URISyntaxException e3) {
                            String valueOf = String.valueOf(optString7);
                            int i4 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.e("Error parsing the url: ".concat(valueOf), e3);
                        }
                        boolean z2 = true;
                        if (parseUri == null) {
                            parseUri = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                parseUri.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                parseUri.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                parseUri.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                parseUri.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split(RemoteSettings.i, 2);
                                if (split.length == 2) {
                                    parseUri.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        Intent intent = parseUri;
                        resolveInfo = packageManager.resolveActivity(intent, 65536);
                        if (resolveInfo == null) {
                            z2 = false;
                        }
                        jSONObject.put(optString, z2);
                    }
                    parseUri = null;
                    boolean z22 = true;
                    if (parseUri == null) {
                    }
                    Intent intent2 = parseUri;
                    resolveInfo = packageManager.resolveActivity(intent2, 65536);
                    if (resolveInfo == null) {
                    }
                    jSONObject.put(optString, z22);
                }
                ((zzbmr) zzcgiVar).a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbmr) zzcgiVar).a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbmr) zzcgiVar).a("openableIntents", new JSONObject());
        }
    }

    public static void c(Map map, zzddy zzddyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ab)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddyVar != null) {
            zzddyVar.X0();
        }
    }
}
