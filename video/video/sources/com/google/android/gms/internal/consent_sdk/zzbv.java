package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Objects;
import o.C9811tl1;
import o.InterfaceC6184ey2;

@InterfaceC6184ey2
/* loaded from: classes3.dex */
public final class zzbv extends WebView {
    public final Handler Y0;
    public final zzcb Z0;
    public boolean a1;

    public zzbv(zzbx zzbxVar, Handler handler, zzcb zzcbVar) {
        super(zzbxVar);
        this.a1 = false;
        this.Y0 = handler;
        this.Z0 = zzcbVar;
    }

    public static /* bridge */ /* synthetic */ boolean f(zzbv zzbvVar, String str) {
        if (str != null && str.startsWith("consent://")) {
            return true;
        }
        return false;
    }

    public final void c() {
        final zzcb zzcbVar = this.Z0;
        Objects.requireNonNull(zzcbVar);
        this.Y0.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcb.this.d();
            }
        });
    }

    public final void d(String str, String str2) {
        final String str3 = str + C9811tl1.c + str2 + ");";
        this.Y0.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbr
            @Override // java.lang.Runnable
            public final void run() {
                zzct.a(zzbv.this, str3);
            }
        });
    }
}
