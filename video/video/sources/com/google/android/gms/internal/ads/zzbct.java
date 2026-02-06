package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbct implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    @InterfaceC5056aJ2
    public volatile boolean d = false;
    @InterfaceC11300zs1
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();
    public boolean i = false;
    public boolean j = false;

    public final Object b(final zzbcm zzbcmVar) {
        if (!this.b.block(5000L)) {
            synchronized (this.a) {
                try {
                    if (!this.d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.c || this.e == null || this.j) {
            synchronized (this.a) {
                if (this.c && this.e != null && !this.j) {
                }
                return zzbcmVar.k();
            }
        }
        if (zzbcmVar.e() == 2) {
            Bundle bundle = this.f;
            if (bundle == null) {
                return zzbcmVar.k();
            }
            return zzbcmVar.b(bundle);
        } else if (zzbcmVar.e() == 1 && this.h.has(zzbcmVar.l())) {
            return zzbcmVar.a(this.h);
        } else {
            return zzbcx.a(new zzfvu() { // from class: com.google.android.gms.internal.ads.zzbcr
                @Override // com.google.android.gms.internal.ads.zzfvu
                public final Object a() {
                    Object c;
                    c = zzbcmVar.c(zzbct.this.e);
                    return c;
                }
            });
        }
    }

    public final Object c(zzbcm zzbcmVar) {
        if (!this.c && !this.d) {
            return zzbcmVar.k();
        }
        return b(zzbcmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbcx.a(new com.google.android.gms.internal.ads.zzbcp(r3))).optBoolean("local_flags_enabled") != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:74:0x014f, B:75:0x0156, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:87:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a A[Catch: all -> 0x0058, TRY_ENTER, TryCatch #3 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:42:0x009f, B:43:0x00a6, B:52:0x00d6, B:66:0x0121, B:74:0x014f, B:75:0x0156, B:22:0x0046, B:25:0x0050, B:31:0x005d, B:34:0x0068, B:35:0x0070, B:37:0x0076, B:39:0x0086, B:41:0x009b, B:45:0x00a9, B:47:0x00ad, B:49:0x00bd, B:51:0x00d2, B:54:0x00de, B:64:0x011d, B:68:0x012a, B:70:0x0141, B:72:0x0145, B:73:0x0148, B:57:0x00ef, B:59:0x00fd, B:61:0x0105, B:62:0x0110), top: B:87:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Context context) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (this.c) {
                        return;
                    }
                    if (!this.d) {
                        this.d = true;
                    }
                    this.i = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    this.g = context;
                    try {
                        this.f = Wrappers.a(context).c(this.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    Context context2 = this.g;
                    Context i = GooglePlayServicesUtilLight.i(context2);
                    if (i != null || context2 == null || (i = context2.getApplicationContext()) != null) {
                        context2 = i;
                    }
                    if (context2 != null) {
                        com.google.android.gms.ads.internal.client.zzbd.b();
                        sharedPreferences = zzbco.a(context2);
                    } else {
                        sharedPreferences = null;
                    }
                    if (sharedPreferences != null) {
                        zzbfm.c(new zzbcs(this, sharedPreferences));
                    }
                    if (!this.i) {
                        zzbef zzbefVar = zzben.d;
                        if (((Long) zzbefVar.e()).longValue() > 0 && zzbcf.a(this.g) >= ((Long) zzbefVar.e()).longValue()) {
                            this.j = true;
                            this.c = true;
                            this.d = false;
                            this.b.open();
                            return;
                        }
                    }
                    if (!this.i) {
                        zzbef zzbefVar2 = zzben.f;
                        if (((Long) zzbefVar2.e()).longValue() > 0 && zzbcf.b(this.g) >= ((Long) zzbefVar2.e()).longValue()) {
                            this.j = true;
                            this.c = true;
                            this.d = false;
                            this.b.open();
                            return;
                        }
                    }
                    Context context3 = this.g;
                    if (!((Boolean) zzbev.g.e()).booleanValue()) {
                        if (((Boolean) zzbev.h.e()).booleanValue() && (r3 = context3.getSharedPreferences("admob", 0)) != null) {
                        }
                        if (context2 != null) {
                            this.d = false;
                            this.b.open();
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzbd.b();
                        this.e = zzbco.a(context2);
                        if (!((Boolean) zzbev.a.e()).booleanValue() && (sharedPreferences2 = this.e) != null) {
                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                        }
                        g(this.e);
                        this.c = true;
                        this.d = false;
                        this.b.open();
                        return;
                    }
                    context2 = this.g;
                    if (context2 != null) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean e() {
        return this.j;
    }

    public final boolean f() {
        return this.i;
    }

    public final void g(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.h = new JSONObject((String) zzbcx.a(new zzfvu() { // from class: com.google.android.gms.internal.ads.zzbcq
                    @Override // com.google.android.gms.internal.ads.zzfvu
                    public final Object a() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            g(sharedPreferences);
        }
    }
}
