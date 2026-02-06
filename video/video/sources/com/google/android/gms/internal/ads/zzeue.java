package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import o.InterfaceC10571ws1;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzeue implements zzetu {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    @InterfaceC10571ws1
    public final String j;
    @InterfaceC10571ws1
    public final String k;
    public final String l;
    public final boolean m;
    public final String n;

    /* renamed from: o  reason: collision with root package name */
    public final long f275o;
    public final boolean p;
    @InterfaceC10571ws1
    public final String q;
    public final int r;

    public zzeue(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, @InterfaceC10571ws1 String str3, @InterfaceC10571ws1 String str4, String str5, boolean z6, String str6, long j, boolean z7, @InterfaceC10571ws1 String str7, int i, String str8) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = str8;
        this.i = arrayList;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = z6;
        this.n = str6;
        this.f275o = j;
        this.p = z7;
        this.q = str7;
        this.r = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((zzcuv) obj).b;
        bundle.putBoolean("simulator", this.d);
        bundle.putInt("build_api_level", this.r);
        ArrayList<String> arrayList = this.i;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("submodel", this.n);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((zzcuv) obj).a;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putInt("build_api_level", this.r);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.qb)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ad)).booleanValue()) {
            bundle.putString("dlc", this.h);
        }
        ArrayList<String> arrayList = this.i;
        if (!arrayList.isEmpty()) {
            bundle.putStringArrayList("hl_list", arrayList);
        }
        bundle.putString("mv", this.j);
        bundle.putString("submodel", this.n);
        Bundle a = zzfdd.a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.l);
        a.putLong("remaining_data_partition_space", this.f275o);
        Bundle a2 = zzfdd.a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.m);
        String str = this.k;
        if (!TextUtils.isEmpty(str)) {
            Bundle a3 = zzfdd.a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", str);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Gb)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.p);
        }
        String str2 = this.q;
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("v_unity", str2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ab)).booleanValue()) {
            zzfdd.g(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.xb)).booleanValue());
            zzfdd.g(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.wb)).booleanValue());
        }
    }
}
