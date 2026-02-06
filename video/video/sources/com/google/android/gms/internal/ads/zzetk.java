package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzetk implements zzetu {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    @InterfaceC11300zs1
    public final String h;

    public zzetk(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, @InterfaceC11300zs1 String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((zzcuv) obj).b;
        bundle.putString("js", this.c);
        bundle.putInt("target_api", this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z3));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.f6)).booleanValue()) {
            String str = this.h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle a = zzfdd.a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) zzbev.c.e()).booleanValue());
        a.putBoolean("instant_app", this.a);
        a.putBoolean("lite", this.b);
        a.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = zzfdd.a(a, "build_meta");
        a2.putString("cl", "756340629");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
