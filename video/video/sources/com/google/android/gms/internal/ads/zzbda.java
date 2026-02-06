package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import o.W12;

@InterfaceC5940dy1
@Deprecated
/* loaded from: classes2.dex */
public final class zzbda {
    @InterfaceC5056aJ2
    public String d;
    @InterfaceC5056aJ2
    public Context e;
    @InterfaceC5056aJ2
    public String f;
    public AtomicBoolean h;
    public File i;
    @InterfaceC5056aJ2
    public final BlockingQueue a = new ArrayBlockingQueue(100);
    @InterfaceC5056aJ2
    public final LinkedHashMap b = new LinkedHashMap();
    @InterfaceC5056aJ2
    public final Map c = new HashMap();
    public final HashSet g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(zzbda zzbdaVar) {
        while (true) {
            try {
                zzbdk zzbdkVar = (zzbdk) zzbdaVar.a.take();
                zzbdj a = zzbdkVar.a();
                if (!TextUtils.isEmpty(a.b())) {
                    zzbdaVar.g(zzbdaVar.b(zzbdaVar.b, zzbdkVar.b()), a);
                }
            } catch (InterruptedException e) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    public final zzbdg a(String str) {
        zzbdg zzbdgVar = (zzbdg) this.c.get(str);
        if (zzbdgVar != null) {
            return zzbdgVar;
        }
        return zzbdg.a;
    }

    public final Map b(Map map, @InterfaceC11300zs1 Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) linkedHashMap.get(str);
            linkedHashMap.put(str, a(str).a(str2, (String) entry.getValue()));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.h = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbeq.c.e()).booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(zzfqi.a(zzfqh.a(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.b.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcaa.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcz
            @Override // java.lang.Runnable
            public final void run() {
                zzbda.c(zzbda.this);
            }
        });
        Map map2 = this.c;
        zzbdg zzbdgVar = zzbdg.b;
        map2.put("action", zzbdgVar);
        map2.put(FirebaseAnalytics.Param.b, zzbdgVar);
        map2.put(W12.i, zzbdg.c);
    }

    public final void e(String str) {
        if (this.g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.e0, this.f);
        linkedHashMap.put("ue", str);
        g(b(this.b, linkedHashMap), null);
    }

    public final boolean f(zzbdk zzbdkVar) {
        return this.a.offer(zzbdkVar);
    }

    public final void g(Map map, zzbdj zzbdjVar) {
        Uri.Builder buildUpon = Uri.parse(this.d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbdjVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbdjVar.b())) {
                sb.append("&it=");
                sb.append(zzbdjVar.b());
            }
            if (!TextUtils.isEmpty(zzbdjVar.a())) {
                sb.append("&blat=");
                sb.append(zzbdjVar.a());
            }
            uri = sb.toString();
        }
        if (this.h.get()) {
            File file = this.i;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                        try {
                            fileOutputStream2.write(uri.getBytes());
                            fileOutputStream2.write(10);
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e) {
                                int i = com.google.android.gms.ads.internal.util.zze.b;
                                com.google.android.gms.ads.internal.util.client.zzo.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            int i2 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    com.google.android.gms.ads.internal.util.client.zzo.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e3);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e4) {
                                    int i3 = com.google.android.gms.ads.internal.util.zze.b;
                                    com.google.android.gms.ads.internal.util.client.zzo.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                int i4 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            }
        } else {
            com.google.android.gms.ads.internal.zzv.v();
            com.google.android.gms.ads.internal.util.zzs.m(this.e, this.f, uri);
        }
    }
}
