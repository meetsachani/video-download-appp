package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.C4128Rj1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbxq implements zzbxv {
    public static final List l = Collections.synchronizedList(new ArrayList());
    public static final /* synthetic */ int m = 0;
    public final zzhcr a;
    public final LinkedHashMap b;
    public final Context e;
    @InterfaceC5056aJ2
    public boolean f;
    public final zzbxs g;
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final Object h = new Object();
    public HashSet i = new HashSet();
    public boolean j = false;
    public boolean k = false;

    public zzbxq(Context context, VersionInfoParcel versionInfoParcel, zzbxs zzbxsVar, @InterfaceC11300zs1 String str, zzbxr zzbxrVar) {
        Preconditions.s(zzbxsVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = new LinkedHashMap();
        this.g = zzbxsVar;
        for (String str2 : zzbxsVar.Z0) {
            this.i.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.i.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhcr s2 = zzheq.s2();
        s2.n2(9);
        if (str != null) {
            s2.h2(str);
            s2.f2(str);
        }
        zzhcs s22 = zzhct.s2();
        String str3 = this.g.X;
        if (str3 != null) {
            s22.Y1(str3);
        }
        s2.e2((zzhct) s22.V1());
        zzheh s23 = zzhei.s2();
        s23.a2(Wrappers.a(this.e).g());
        String str4 = versionInfoParcel.X;
        if (str4 != null) {
            s23.Y1(str4);
        }
        long b = GoogleApiAvailabilityLight.i().b(this.e);
        if (b > 0) {
            s23.Z1(b);
        }
        s2.d2((zzhei) s23.V1());
        this.a = s2;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 d(zzbxq zzbxqVar, Map map) {
        int length;
        zzhef zzhefVar;
        InterfaceFutureC8411o11 m2;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = zzbxqVar.h;
                        synchronized (obj) {
                            length = optJSONArray.length();
                            synchronized (obj) {
                                zzhefVar = (zzhef) zzbxqVar.b.get(str);
                            }
                        }
                        if (zzhefVar == null) {
                            zzbxu.a("Cannot find the corresponding resource object for " + str);
                        } else {
                            boolean z = false;
                            for (int i = 0; i < length; i++) {
                                zzhefVar.Y1(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            boolean z2 = zzbxqVar.f;
                            if (length > 0) {
                                z = true;
                            }
                            zzbxqVar.f = z | z2;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbfd.a.e()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.c("Failed to get SafeBrowsing metadata", e);
                }
                return zzgcy.g(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (zzbxqVar.f) {
            synchronized (zzbxqVar.h) {
                zzbxqVar.a.n2(10);
            }
        }
        boolean z3 = zzbxqVar.f;
        if ((z3 && zzbxqVar.g.b1) || ((zzbxqVar.k && zzbxqVar.g.a1) || (!z3 && zzbxqVar.g.Y0))) {
            synchronized (zzbxqVar.h) {
                for (zzhef zzhefVar2 : zzbxqVar.b.values()) {
                    zzbxqVar.a.a2((zzheg) zzhefVar2.V1());
                }
                zzhcr zzhcrVar = zzbxqVar.a;
                zzhcrVar.Y1(zzbxqVar.c);
                zzhcrVar.Z1(zzbxqVar.d);
                if (zzbxu.b()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzhcrVar.k2() + "\n  clickUrl: " + zzhcrVar.j2() + "\n  resources: \n");
                    for (zzheg zzhegVar : zzhcrVar.m2()) {
                        sb.append("    [");
                        sb.append(zzhegVar.c());
                        sb.append("] ");
                        sb.append(zzhegVar.u2());
                    }
                    zzbxu.a(sb.toString());
                }
                InterfaceFutureC8411o11 b = new com.google.android.gms.ads.internal.util.zzbo(zzbxqVar.e).b(1, zzbxqVar.g.Y, null, ((zzheq) zzhcrVar.V1()).b1());
                if (zzbxu.b()) {
                    b.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxn
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = zzbxq.m;
                            zzbxu.a("Pinged SB successfully.");
                        }
                    }, zzcaa.a);
                }
                m2 = zzgcy.m(b, new zzfur() { // from class: com.google.android.gms.internal.ads.zzbxo
                    @Override // com.google.android.gms.internal.ads.zzfur
                    public final Object apply(Object obj2) {
                        String str2 = (String) obj2;
                        int i3 = zzbxq.m;
                        return null;
                    }
                }, zzcaa.g);
            }
            return m2;
        }
        return zzgcy.h(null);
    }

    public static /* synthetic */ void g(zzbxq zzbxqVar, Bitmap bitmap) {
        zzgxi M = zzgxk.M();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, M);
        synchronized (zzbxqVar.h) {
            zzhcr zzhcrVar = zzbxqVar.a;
            zzhdz s2 = zzheb.s2();
            s2.Y1(M.d());
            s2.Z1(C4128Rj1.P0);
            s2.a2(2);
            zzhcrVar.g2((zzheb) s2.V1());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final zzbxs a() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void b(String str, Map map, int i) {
        String str2;
        String str3;
        synchronized (this.h) {
            if (i == 3) {
                try {
                    this.k = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.b;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzhef) linkedHashMap.get(str)).c2(4);
                }
                return;
            }
            zzhef s2 = zzheg.s2();
            int a = zzhee.a(i);
            if (a != 0) {
                s2.c2(a);
            }
            s2.Z1(linkedHashMap.size());
            s2.b2(str);
            zzhde s22 = zzhdh.s2();
            if (!this.i.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getKey() != null) {
                        str2 = (String) entry.getKey();
                    } else {
                        str2 = "";
                    }
                    if (entry.getValue() != null) {
                        str3 = (String) entry.getValue();
                    } else {
                        str3 = "";
                    }
                    if (this.i.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhdc s23 = zzhdd.s2();
                        s23.Y1(zzgxk.V(str2));
                        s23.Z1(zzgxk.V(str3));
                        s22.Y1((zzhdd) s23.V1());
                    }
                }
            }
            s2.a2((zzhdh) s22.V1());
            linkedHashMap.put(str, s2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbxv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view) {
        Bitmap bitmap;
        if (this.g.Z && !this.j) {
            com.google.android.gms.ads.internal.zzv.v();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    if (drawingCache != null) {
                        bitmap = Bitmap.createBitmap(drawingCache);
                    } else {
                        bitmap = null;
                    }
                    try {
                        view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Fail to capture the web view", e);
                        if (bitmap != null) {
                        }
                        if (bitmap2 != null) {
                        }
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmap = null;
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i2 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.e("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzbxu.a("Failed to capture the webview bitmap.");
                return;
            }
            this.j = true;
            com.google.android.gms.ads.internal.util.zzs.N(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxm
                @Override // java.lang.Runnable
                public final void run() {
                    zzbxq.g(zzbxq.this, bitmap2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void e() {
        synchronized (this.h) {
            this.b.keySet();
            InterfaceFutureC8411o11 h = zzgcy.h(Collections.EMPTY_MAP);
            zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzbxl
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    return zzbxq.d(zzbxq.this, (Map) obj);
                }
            };
            zzgdj zzgdjVar = zzcaa.g;
            InterfaceFutureC8411o11 n = zzgcy.n(h, zzgcfVar, zzgdjVar);
            InterfaceFutureC8411o11 o2 = zzgcy.o(n, 10L, TimeUnit.SECONDS, zzcaa.d);
            zzgcy.r(n, new zzbxp(this, o2), zzgdjVar);
            l.add(o2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final boolean i() {
        if (PlatformVersion.h() && this.g.Z && !this.j) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void r0(String str) {
        synchronized (this.h) {
            try {
                if (str == null) {
                    this.a.b2();
                } else {
                    this.a.c2(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
