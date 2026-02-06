package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import o.C9755tW1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzbzo {
    @InterfaceC5056aJ2
    public final String g;
    public final com.google.android.gms.ads.internal.util.zzg h;
    @InterfaceC5056aJ2
    public long a = -1;
    @InterfaceC5056aJ2
    public long b = -1;
    @InterfaceC5056aJ2
    public int c = -1;
    @InterfaceC5056aJ2
    public int d = -1;
    @InterfaceC5056aJ2
    public long e = 0;
    public final Object f = new Object();
    @InterfaceC5056aJ2
    public int i = 0;
    @InterfaceC5056aJ2
    public int j = 0;
    @InterfaceC5056aJ2
    public int k = 0;

    public zzbzo(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.g = str;
        this.h = zzgVar;
    }

    public final int a() {
        int i;
        synchronized (this.f) {
            i = this.k;
        }
        return i;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                bundle = new Bundle();
                if (!this.h.M()) {
                    bundle.putString(C9755tW1.p, this.g);
                }
                bundle.putLong("basets", this.b);
                bundle.putLong("currts", this.a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.c);
                bundle.putInt("preqs_in_session", this.d);
                bundle.putLong("time_in_session", this.e);
                bundle.putInt("pclick", this.i);
                bundle.putInt("pimp", this.j);
                Context a = zzbvv.a(context);
                int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), AdActivity.Y), 0).theme) {
                            z = true;
                        } else {
                            int i2 = com.google.android.gms.ads.internal.util.zze.b;
                            com.google.android.gms.ads.internal.util.client.zzo.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzo.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f) {
            this.i++;
        }
    }

    public final void d() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }

    public final void g(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.h;
                long f = zzgVar.f();
                long a = com.google.android.gms.ads.internal.zzv.d().a();
                if (this.b == -1) {
                    if (a - f > ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h1)).longValue()) {
                        this.d = -1;
                    } else {
                        this.d = zzgVar.c();
                    }
                    this.b = j;
                    this.a = j;
                } else {
                    this.a = j;
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S3)).booleanValue() && (bundle = zzmVar.Z) != null && bundle.getInt("gw", 2) == 1) {
                    return;
                }
                this.c++;
                int i = this.d + 1;
                this.d = i;
                if (i == 0) {
                    this.e = 0L;
                    zzgVar.b0(a);
                } else {
                    this.e = a - zzgVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f) {
            this.k++;
        }
    }

    public final void i() {
        if (((Boolean) zzbfc.a.e()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}
