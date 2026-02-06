package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.C6566gU0;
import org.json.JSONObject;
import org.jsoup.helper.CookieUtil;

/* loaded from: classes2.dex */
public final class zzeab implements zzffx {
    public static final Pattern d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    public final String a;
    public final zzfhc b;
    public final zzfhn c;

    public zzeab(String str, zzfhn zzfhnVar, zzfhc zzfhcVar) {
        this.a = str;
        this.c = zzfhnVar;
        this.b = zzfhcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r0 = r12.a;
     */
    @Override // com.google.android.gms.internal.ads.zzffx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ Object b(Object obj) throws Exception {
        JSONObject jSONObject;
        zzbvn zzbvnVar;
        zzdwf zzdwfVar;
        zzbvn zzbvnVar2;
        zzbvn zzbvnVar3;
        zzbvn zzbvnVar4;
        zzbvn zzbvnVar5;
        zzbvn zzbvnVar6;
        zzbvn zzbvnVar7;
        zzbvn zzbvnVar8;
        JSONObject jSONObject2;
        String str;
        zzeaa zzeaaVar = (zzeaa) obj;
        jSONObject = zzeaaVar.a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        zzbvnVar = zzeaaVar.b;
        String str2 = "";
        if (zzbvnVar.a() == -2) {
            HashMap hashMap = new HashMap();
            zzbvnVar2 = zzeaaVar.b;
            if (zzbvnVar2.j()) {
                String str3 = this.a;
                if (!TextUtils.isEmpty(str3)) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.d1)).booleanValue()) {
                        if (TextUtils.isEmpty(str3)) {
                            str = "";
                        } else {
                            Matcher matcher = d.matcher(str3);
                            str = "";
                            while (matcher.find()) {
                                String group = matcher.group(1);
                                if (group != null) {
                                    Locale locale = Locale.ROOT;
                                    if (group.toLowerCase(locale).startsWith("id=") || group.toLowerCase(locale).startsWith("ide=")) {
                                        if (!TextUtils.isEmpty(str)) {
                                            str = str.concat(CookieUtil.b);
                                        }
                                        str = str.concat(group);
                                    }
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("Cookie", str);
                        }
                    } else {
                        hashMap.put("Cookie", str3);
                    }
                }
            }
            zzbvnVar3 = zzeaaVar.b;
            if (zzbvnVar3.k() && jSONObject2 != null) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
                    }
                } else {
                    com.google.android.gms.ads.internal.util.zze.k("DSID signal does not exist.");
                }
            }
            zzbvnVar4 = zzeaaVar.b;
            if (zzbvnVar4 != null) {
                zzbvnVar7 = zzeaaVar.b;
                if (!TextUtils.isEmpty(zzbvnVar7.f())) {
                    zzbvnVar8 = zzeaaVar.b;
                    str2 = zzbvnVar8.f();
                }
            }
            zzfhn zzfhnVar = this.c;
            zzfhc zzfhcVar = this.b;
            zzfhcVar.c(true);
            zzfhnVar.a(zzfhcVar);
            zzbvnVar5 = zzeaaVar.b;
            String g = zzbvnVar5.g();
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            zzbvnVar6 = zzeaaVar.b;
            return new zzdzw(g, optInt, hashMap, bytes, "", zzbvnVar6.k());
        }
        if (zzbvnVar.a() == 1) {
            if (zzbvnVar.h() != null) {
                str2 = TextUtils.join(C6566gU0.h, zzbvnVar.h());
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d(str2);
            }
            zzdwfVar = new zzdwf(2, "Error building request URL: ".concat(String.valueOf(str2)));
        } else {
            zzdwfVar = new zzdwf(1);
        }
        zzfhn zzfhnVar2 = this.c;
        zzfhc zzfhcVar2 = this.b;
        zzfhcVar2.f(zzdwfVar);
        zzfhcVar2.c(false);
        zzfhnVar2.a(zzfhcVar2);
        throw zzdwfVar;
    }
}
