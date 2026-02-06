package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzdrl;
import com.google.android.gms.internal.ads.zzfrp;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzfru;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzb {
    public final Context a;
    public final zzd b;
    public final long c;
    public final ScheduledExecutorService d;
    @InterfaceC11300zs1
    public final PackageInfo e;

    public zzb(Context context, long j, @InterfaceC11300zs1 PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.c = j;
        this.e = packageInfo;
        this.b = zzdVar;
        this.d = scheduledExecutorService;
    }

    public static String b(@InterfaceC11300zs1 String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new String(charArray);
    }

    public static /* synthetic */ void c(zzb zzbVar, String str, zzau zzauVar, zzbyz zzbyzVar) {
        if (!zzbVar.b.j(str) && !zzbVar.e()) {
            zzauVar.E3(ObjectWrapper.V3(zzbVar.a), zzbyzVar, null);
        }
    }

    public static final void f(Bundle bundle, zzdrl zzdrlVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P7)).booleanValue()) {
            return;
        }
        bundle.putLong(zzdrlVar.e(), com.google.android.gms.ads.internal.zzv.d().a());
    }

    public static final void g(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:20|(2:21|22)|(1:24)(7:31|32|33|(1:35)|37|(1:42)(2:39|(1:41))|29)|25|26|28|29|18) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
        if (r12.a() > r10) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzbk a(zzbyz zzbyzVar, final zzau zzauVar, Bundle bundle) {
        zzbk zzbkVar;
        zzbk zzbkVar2;
        long j;
        f(bundle, zzdrl.SIGNAL_ON_DISK_VALIDATION_START);
        zzbk zzbkVar3 = null;
        if (com.google.android.gms.ads.internal.zzv.t().j().M()) {
            this.b.g();
            g(bundle, 7);
        } else {
            PackageInfo packageInfo = this.e;
            if (packageInfo == null) {
                this.b.g();
                g(bundle, 10);
            } else {
                zzd zzdVar = this.b;
                Context context = this.a;
                String e = zzdVar.e();
                int b = zzdVar.b();
                String d = zzdVar.d();
                int a = zzdVar.a();
                if (!TextUtils.equals(context.getApplicationInfo().packageName, e) || b != packageInfo.versionCode || !TextUtils.equals(Build.MODEL, d) || a != Build.VERSION.SDK_INT) {
                    zzbkVar = null;
                    zzdVar.g();
                    zzdVar.i(context.getApplicationInfo().packageName, packageInfo.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
                } else {
                    for (Map.Entry entry : zzdVar.f().entrySet()) {
                        try {
                            j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                        } catch (IOException | JSONException unused) {
                            zzbkVar2 = zzbkVar3;
                        }
                        if (com.google.android.gms.ads.internal.zzv.d().a() - j > ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N7)).longValue()) {
                            zzbkVar2 = zzbkVar3;
                        } else {
                            zzfrp i = zzfrt.k(context).i(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z3)).longValue(), com.google.android.gms.ads.internal.zzv.t().j().M());
                            zzbkVar2 = zzbkVar3;
                            zzfrp i2 = zzfru.j(context).i(((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A3)).longValue(), com.google.android.gms.ads.internal.zzv.t().j().M());
                            if (i.a() != -1) {
                            }
                            if (i2.a() != -1) {
                                if (i2.a() <= j) {
                                }
                            }
                            zzbkVar3 = zzbkVar2;
                        }
                        zzdVar.c((String) entry.getKey());
                        zzbkVar3 = zzbkVar2;
                    }
                    zzbkVar = zzbkVar3;
                }
                f(bundle, zzdrl.SIGNAL_ON_DISK_VALIDATION_END);
                if (com.google.android.gms.ads.internal.zzv.d().a() - this.c > ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K7)).longValue()) {
                    g(bundle, 2);
                    return zzbkVar;
                }
                f(bundle, zzdrl.SIGNAL_ON_DISK_CACHE_KEY_START);
                String str = zzbyzVar.X;
                String str2 = zzbyzVar.Y;
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyzVar.Y0;
                final String m = com.google.android.gms.ads.internal.util.client.zzf.m(str + str2 + zzmVar.i1.toString() + zzmVar.Z.toString() + zzmVar.d1 + zzmVar.k1 + String.valueOf(zzmVar.j1));
                if (TextUtils.isEmpty(m)) {
                    g(bundle, 3);
                    return zzbkVar;
                }
                f(bundle, zzdrl.SIGNAL_ON_DISK_CACHE_KEY_END);
                f(bundle, zzdrl.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
                String c = this.b.c(m);
                f(bundle, zzdrl.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
                if (!e()) {
                    final zzbyz zzbyzVar2 = new zzbyz(str, str2, zzbyzVar.Z, zzmVar, 2, m);
                    this.d.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzb.c(zzb.this, m, zzauVar, zzbyzVar2);
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M7)).longValue(), TimeUnit.MILLISECONDS);
                }
                if (TextUtils.isEmpty(c)) {
                    g(bundle, 4);
                    return zzbkVar;
                }
                f(bundle, zzdrl.SIGNAL_ON_DISK_DECODE_START);
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    String string = jSONObject.getString("sr");
                    if (TextUtils.isEmpty(string)) {
                        g(bundle, 8);
                        return zzbkVar;
                    }
                    String string2 = jSONObject.getString("rs");
                    if (TextUtils.isEmpty(string2)) {
                        g(bundle, 9);
                        return zzbkVar;
                    }
                    String b2 = b(new String(Base64.decode(string2, 10), StandardCharsets.UTF_8));
                    f(bundle, zzdrl.SIGNAL_ON_DISK_DECODE_END);
                    try {
                        zzbk zzbkVar4 = new zzbk(new JsonReader(new StringReader(string)), zzbkVar);
                        zzbkVar4.c = b2;
                        zzbkVar4.e = bundle;
                        bundle.putBoolean("sod_h", true);
                        return zzbkVar4;
                    } catch (IOException e2) {
                        g(bundle, 6);
                        com.google.android.gms.ads.internal.zzv.t().x(e2, "DiskCachingManager.getSignalResponse");
                        return null;
                    }
                } catch (JSONException e3) {
                    g(bundle, 5);
                    com.google.android.gms.ads.internal.zzv.t().x(e3, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 zzbk zzbkVar) {
        String jSONObject;
        String str2;
        if (!TextUtils.isEmpty(str) && !e()) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("params", zzbkVar.a);
                jSONObject3.put("signal_dictionary", com.google.android.gms.ads.internal.client.zzbb.b().o(zzbkVar.f));
                jSONObject2.put("sr", jSONObject3);
                str2 = zzbkVar.c;
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "DiskCachingManager.createStringToWrite");
            }
            if (TextUtils.isEmpty(str2)) {
                jSONObject = "";
                if (TextUtils.isEmpty(jSONObject)) {
                    this.b.h(str, jSONObject);
                    return;
                }
                return;
            }
            jSONObject2.put("rs", Base64.encodeToString(b(str2).getBytes(StandardCharsets.UTF_8), 10));
            jSONObject2.put("ts_ms", com.google.android.gms.ads.internal.zzv.d().a());
            jSONObject = jSONObject2.toString();
            if (TextUtils.isEmpty(jSONObject)) {
            }
        }
    }

    public final boolean e() {
        if (this.b.f().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O7)).intValue()) {
            return true;
        }
        return false;
    }
}
