package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import o.C2638Cg0;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdxu {
    public static final Pattern q = Pattern.compile("\\?");
    public final zzchb a;
    public final Context b;
    public final VersionInfoParcel c;
    public final zzfcp d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final zzfhn h;
    public final zzdrx i;
    public final zzfjr j;
    public final zzcyt k;
    public final Object l = new Object();
    public String m;
    public List n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public Bundle f274o;
    public final zzbvt p;

    public zzdxu(zzchb zzchbVar, Context context, VersionInfoParcel versionInfoParcel, zzfcp zzfcpVar, Executor executor, String str, zzfhn zzfhnVar, zzdrx zzdrxVar, zzbvt zzbvtVar, zzdzz zzdzzVar, ScheduledExecutorService scheduledExecutorService, zzfjr zzfjrVar, zzcyt zzcytVar) {
        this.a = zzchbVar;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = zzfcpVar;
        this.e = executor;
        this.g = str;
        this.h = zzfhnVar;
        zzchbVar.A();
        this.i = zzdrxVar;
        this.p = zzbvtVar;
        this.f = scheduledExecutorService;
        this.j = zzfjrVar;
        this.k = zzcytVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzdxu zzdxuVar, List list, Exception exc) {
        String message;
        zzegy zzegyVar;
        String message2;
        com.google.android.gms.ads.internal.zzv.t().w(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzegyVar = new zzegy(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzegy) {
            zzegyVar = (zzegy) exc;
        } else {
            if (exc.getMessage() == null) {
                message = "Fetch failed.";
            } else {
                message = exc.getMessage();
            }
            zzegyVar = new zzegy(1, message);
        }
        if (zzegyVar.getMessage() == null) {
            message2 = "";
        } else {
            message2 = zzegyVar.getMessage();
        }
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message2)) {
                if (message2.contains("Timed out waiting for ad response.")) {
                    message2 = "timeout";
                    str = "0.2.0.0";
                } else if (message2.contains("Received HTTP error code from ad server:")) {
                    List f = zzfvr.b(zzfun.c(':')).f(message2);
                    if (f.size() == 2) {
                        message2 = (String) f.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfjn.c(zzfjn.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message2));
            }
            zzdxuVar.j.e(arrayList, null);
        }
        return zzgcy.g(zzegyVar);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(zzdxu zzdxuVar, JSONObject jSONObject) {
        zzfcd zzfcdVar = new zzfcd(zzdxuVar.d);
        String jSONObject2 = jSONObject.toString();
        return zzgcy.h(new zzfcg(zzfcdVar, zzfcf.a(new StringReader(jSONObject2), zzdxuVar.f274o)));
    }

    public static /* synthetic */ InterfaceFutureC8411o11 d(zzdxu zzdxuVar, zzbod zzbodVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            zzdxuVar.i.a().putLong(zzdrl.SCAR_PRELOADER_PROCESSING_DONE.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        return zzbodVar.c(jSONObject);
    }

    public static /* synthetic */ String f(zzdxu zzdxuVar, zzdzw zzdzwVar) {
        String message;
        zzdxuVar.i(zzdrl.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.p7)).intValue()) {
                    zzdzx b = new zzdzy(zzdxuVar.b, zzdxuVar.c.X, zzdxuVar.p, Binder.getCallingUid()).b(zzdzwVar);
                    int i3 = b.a;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q7)).booleanValue()) {
                        zzdxuVar.i.d("fr", String.valueOf(i));
                    }
                    if (i3 == 200) {
                        zzdxuVar.i(zzdrl.RENDERING_ADSTRING_TYPE2_FETCH_END);
                        return b.c;
                    }
                    i++;
                    i2 = i3;
                } else {
                    throw new zzegy(1, "Received HTTP error code from ad server:" + i2);
                }
            } catch (Exception e) {
                if (e.getMessage() == null) {
                    message = "Fetch failed.";
                } else {
                    message = e.getMessage();
                }
                throw new zzegy(1, message, e);
            }
        }
    }

    public static final String j(String str) {
        try {
            return new JSONObject(str).optString(C9755tW1.f875o, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fc, code lost:
        if (r2.optString("is_gbid").equals("true") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022b, code lost:
        if (r5.g(r1, r2, r4) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9 A[Catch: all -> 0x00ed, TryCatch #6 {all -> 0x00ed, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00bb, B:29:0x00c3, B:37:0x0100, B:39:0x0108, B:41:0x010e, B:45:0x0117, B:56:0x0151, B:48:0x0129, B:55:0x013a, B:58:0x0156, B:34:0x00f0, B:59:0x016c, B:66:0x0185, B:69:0x018d, B:73:0x01b1, B:75:0x01c6, B:79:0x01e9, B:81:0x01fe, B:84:0x0212, B:86:0x0218, B:87:0x0225, B:89:0x0227, B:92:0x0230, B:91:0x022d, B:80:0x01f3, B:76:0x01d9, B:72:0x019b, B:63:0x0175, B:64:0x017a), top: B:125:0x0080, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3 A[Catch: all -> 0x00ed, TryCatch #6 {all -> 0x00ed, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00bb, B:29:0x00c3, B:37:0x0100, B:39:0x0108, B:41:0x010e, B:45:0x0117, B:56:0x0151, B:48:0x0129, B:55:0x013a, B:58:0x0156, B:34:0x00f0, B:59:0x016c, B:66:0x0185, B:69:0x018d, B:73:0x01b1, B:75:0x01c6, B:79:0x01e9, B:81:0x01fe, B:84:0x0212, B:86:0x0218, B:87:0x0225, B:89:0x0227, B:92:0x0230, B:91:0x022d, B:80:0x01f3, B:76:0x01d9, B:72:0x019b, B:63:0x0175, B:64:0x017a), top: B:125:0x0080, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0218 A[Catch: all -> 0x00ed, TryCatch #6 {all -> 0x00ed, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00bb, B:29:0x00c3, B:37:0x0100, B:39:0x0108, B:41:0x010e, B:45:0x0117, B:56:0x0151, B:48:0x0129, B:55:0x013a, B:58:0x0156, B:34:0x00f0, B:59:0x016c, B:66:0x0185, B:69:0x018d, B:73:0x01b1, B:75:0x01c6, B:79:0x01e9, B:81:0x01fe, B:84:0x0212, B:86:0x0218, B:87:0x0225, B:89:0x0227, B:92:0x0230, B:91:0x022d, B:80:0x01f3, B:76:0x01d9, B:72:0x019b, B:63:0x0175, B:64:0x017a), top: B:125:0x0080, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227 A[Catch: all -> 0x00ed, TryCatch #6 {all -> 0x00ed, blocks: (B:21:0x0080, B:23:0x009e, B:25:0x00a4, B:27:0x00bb, B:29:0x00c3, B:37:0x0100, B:39:0x0108, B:41:0x010e, B:45:0x0117, B:56:0x0151, B:48:0x0129, B:55:0x013a, B:58:0x0156, B:34:0x00f0, B:59:0x016c, B:66:0x0185, B:69:0x018d, B:73:0x01b1, B:75:0x01c6, B:79:0x01e9, B:81:0x01fe, B:84:0x0212, B:86:0x0218, B:87:0x0225, B:89:0x0227, B:92:0x0230, B:91:0x022d, B:80:0x01f3, B:76:0x01d9, B:72:0x019b, B:63:0x0175, B:64:0x017a), top: B:125:0x0080, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceFutureC8411o11 e() {
        String str;
        int i;
        Pair pair;
        String str2;
        String str3;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            this.f274o = this.d.s;
            this.i.a().putLong(zzdrl.SCAR_PRELOADER_READY.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        String str4 = this.d.d.s1;
        if (!TextUtils.isEmpty(str4)) {
            String j = j(str4);
            zzbcm zzbcmVar = zzbcv.i7;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && j.isEmpty()) {
                int lastIndexOf = str4.lastIndexOf("&request_id=");
                j = lastIndexOf != -1 ? str4.substring(lastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(j)) {
                return zzgcy.g(new zzegy(15, "Invalid ad string."));
            }
            synchronized (this.l) {
                try {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv s = this.a.s();
                    zzdrx zzdrxVar = this.i;
                    String b = s.b(j, zzdrxVar);
                    String str5 = null;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue() && !TextUtils.isEmpty(b)) {
                        try {
                            JSONObject jSONObject = new JSONObject(b);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j7)).booleanValue()) {
                                JSONObject optJSONObject = jSONObject.optJSONObject("extras");
                                if (optJSONObject != null) {
                                    if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k7)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.b(optJSONObject.optString("query_info_type", "")))) {
                                    }
                                }
                            }
                            int lastIndexOf2 = str4.lastIndexOf("&");
                            if (lastIndexOf2 != -1) {
                                str3 = str4.substring(0, lastIndexOf2);
                            } else {
                                str3 = null;
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                try {
                                    byte[] decode = Base64.decode(str3, 11);
                                    byte[] bytes = j.getBytes("UTF-8");
                                    if (!TextUtils.isEmpty(b)) {
                                        try {
                                            string = new JSONObject(b).getString("arek");
                                        } catch (JSONException e) {
                                            com.google.android.gms.ads.internal.util.zze.k("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            com.google.android.gms.ads.internal.zzv.t().x(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                        }
                                        str4 = zzfde.b(decode, bytes, string, zzdrxVar);
                                    }
                                    string = null;
                                    str4 = zzfde.b(decode, bytes, string, zzdrxVar);
                                } catch (UnsupportedEncodingException | IllegalArgumentException e2) {
                                    com.google.android.gms.ads.internal.util.zze.k("Failed to decode the adResponse. ".concat(e2.toString()));
                                    com.google.android.gms.ads.internal.zzv.t().x(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    if (TextUtils.isEmpty(str4)) {
                        str = "";
                    } else {
                        try {
                            str = new JSONObject(str4).optString("render_id", "");
                        } catch (JSONException unused2) {
                            str = "";
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String str6 = "";
                        try {
                            str6 = new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
                        } catch (IllegalArgumentException e3) {
                            com.google.android.gms.ads.internal.util.zze.k("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(str)));
                            com.google.android.gms.ads.internal.zzv.t().x(e3, "PreloadedLoader.decodeRenderId");
                        }
                        List f = zzfvr.b(zzfun.c(':')).f(str6);
                        if (f.size() == 2) {
                            str5 = (String) f.get(0);
                            i = Integer.parseInt((String) f.get(1));
                            if (str5 == null) {
                                pair = new Pair(str5, Integer.valueOf(i));
                            } else {
                                pair = new Pair("", 0);
                            }
                            str2 = (String) pair.first;
                            int intValue = ((Integer) pair.second).intValue();
                            if (!TextUtils.isEmpty(str2) && intValue > 0) {
                                if (!s.h(j, str2)) {
                                    return zzgcy.g(new zzegy(10, "The ad has already been shown."));
                                }
                            }
                            s.f(j);
                            if (!TextUtils.isEmpty(b)) {
                                return g(str4, h(b));
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.zze.k("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(str)));
                        }
                    }
                    i = 0;
                    if (str5 == null) {
                    }
                    str2 = (String) pair.first;
                    int intValue2 = ((Integer) pair.second).intValue();
                    if (!TextUtils.isEmpty(str2)) {
                        if (!s.h(j, str2)) {
                        }
                    }
                    s.f(j);
                    if (!TextUtils.isEmpty(b)) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.d.d.n1;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a7)).booleanValue()) {
                String str7 = zzcVar.X;
                String str8 = zzcVar.Y;
                String j2 = j(str7);
                String j3 = j(str8);
                if (!TextUtils.isEmpty(j3) && j2.equals(j3)) {
                    this.a.s().f(j2);
                    this.i.b().put(C9755tW1.f875o, j2);
                } else {
                    this.i.b().put("ridmm", "true");
                }
            }
            return g(zzcVar.X, h(zzcVar.Y));
        }
        return zzgcy.g(new zzegy(14, "Mismatch request IDs."));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceFutureC8411o11 g(@InterfaceC11300zs1 String str, final String str2) {
        InterfaceFutureC8411o11 h;
        String str3;
        String str4;
        String str5 = "";
        if (TextUtils.isEmpty(str)) {
            return zzgcy.g(new zzegy(15, "Invalid ad string."));
        }
        Context context = this.b;
        zzfhc a = zzfhb.a(context, 11);
        a.i();
        zzbon a2 = com.google.android.gms.ads.internal.zzv.k().a(context, this.c, this.a.C());
        zzboh zzbohVar = zzbok.b;
        final zzbod a3 = a2.a("google.afma.response.normalize", zzbohVar, zzbohVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l7)).booleanValue()) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.m = jSONObject.optString("fetch_url", "");
                    this.n = com.google.android.gms.ads.internal.util.zzbs.c(new JSONObject(jSONObject.optString(RemoteConfigComponent.f388o, "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Invalid ad response.");
                    str4 = this.m;
                    final List list = this.n;
                    if (TextUtils.isEmpty(str4)) {
                    }
                    zzgcf zzgcfVar = new zzgcf(this) { // from class: com.google.android.gms.internal.ads.zzdxo
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            String str6 = (String) obj;
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            String str7 = str2;
                            try {
                                jSONObject4.put("headers", new JSONObject());
                                jSONObject4.put("body", str6);
                                jSONObject3.put("base_url", "");
                                jSONObject3.put("signals", new JSONObject(str7));
                                jSONObject2.put("request", jSONObject3);
                                jSONObject2.put("response", jSONObject4);
                                jSONObject2.put("flags", new JSONObject());
                                return zzgcy.h(jSONObject2);
                            } catch (JSONException e) {
                                throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                            }
                        }
                    };
                    Executor executor = this.e;
                    InterfaceFutureC8411o11 n = zzgcy.n(zzgcy.n(zzgcy.n(h, zzgcfVar, executor), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxp
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            return zzdxu.d(zzdxu.this, a3, (JSONObject) obj);
                        }
                    }, executor), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxq
                        @Override // com.google.android.gms.internal.ads.zzgcf
                        public final InterfaceFutureC8411o11 b(Object obj) {
                            return zzdxu.c(zzdxu.this, (JSONObject) obj);
                        }
                    }, executor);
                    zzfhm.a(n, this.h, a);
                    zzgcy.r(n, new zzdxt(this), zzcaa.g);
                    return n;
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            str4 = this.m;
            final List list2 = this.n;
            if (TextUtils.isEmpty(str4)) {
                this.i.d("sst", C2638Cg0.Y4);
                String str6 = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n7);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.m7)).booleanValue()) {
                    List f = zzfvr.c(q).f(str4);
                    if (f.size() < 2) {
                        h = zzgcy.g(new zzegy(1, "Invalid fetch URL."));
                    } else {
                        str5 = (String) f.get(1);
                        com.google.android.gms.ads.internal.zzv.v();
                        str4 = Uri.parse(str4).buildUpon().query(null).build().toString();
                    }
                }
                final zzdzw zzdzwVar = new zzdzw(str4, 60000, new HashMap(), str5.getBytes(StandardCharsets.UTF_8), str6, false);
                zzgcp A = zzgcp.A(zzcaa.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxr
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdxu.f(zzdxu.this, zzdzwVar);
                    }
                }));
                zzbcm zzbcmVar = zzbcv.o7;
                h = (zzgcp) zzgcy.f((zzgcp) zzgcy.o(A, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.MILLISECONDS, this.f), Exception.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxs
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        return zzdxu.b(zzdxu.this, list2, (Exception) obj);
                    }
                }, this.e);
            } else {
                h = zzgcy.h(str3);
                this.i.d("sst", "1");
            }
        } else {
            h = zzgcy.h(str);
            this.i.d("sst", "1");
        }
        zzgcf zzgcfVar2 = new zzgcf(this) { // from class: com.google.android.gms.internal.ads.zzdxo
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                String str62 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str62);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzgcy.h(jSONObject2);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        };
        Executor executor2 = this.e;
        InterfaceFutureC8411o11 n2 = zzgcy.n(zzgcy.n(zzgcy.n(h, zzgcfVar2, executor2), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxp
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdxu.d(zzdxu.this, a3, (JSONObject) obj);
            }
        }, executor2), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxq
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdxu.c(zzdxu.this, (JSONObject) obj);
            }
        }, executor2);
        zzfhm.a(n2, this.h, a);
        zzgcy.r(n2, new zzdxt(this), zzcaa.g);
        return n2;
    }

    public final String h(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.g));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g(concat);
            return str;
        }
    }

    public final void i(zzdrl zzdrlVar) {
        Bundle a = this.i.a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q7)).booleanValue()) {
            a.putLong(zzdrlVar.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
    }
}
