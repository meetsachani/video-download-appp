package com.google.android.gms.internal.ads;

import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.S;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzemk implements zzetu {
    public final com.google.android.gms.ads.internal.client.zzr a;
    @InterfaceC11300zs1
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    @InterfaceC11300zs1
    public final String h;
    public final boolean i;
    @InterfaceC11300zs1
    public final Insets j;

    public zzemk(com.google.android.gms.ads.internal.client.zzr zzrVar, @InterfaceC11300zs1 String str, boolean z, String str2, float f, int i, int i2, @InterfaceC11300zs1 String str3, boolean z2, @InterfaceC11300zs1 Insets insets) {
        Preconditions.s(zzrVar, "the adSize must not be null");
        this.a = zzrVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = z2;
        this.j = insets;
    }

    public final void a(Bundle bundle) {
        boolean z;
        boolean z2;
        String str;
        Insets insets;
        int i;
        int i2;
        int i3;
        int i4;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.a;
        int i5 = zzrVar.Z0;
        if (i5 == -1) {
            z = true;
        } else {
            z = false;
        }
        zzfdd.f(bundle, "smart_w", "full", z);
        int i6 = zzrVar.Y;
        if (i6 == -2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzfdd.f(bundle, "smart_h", "auto", z2);
        zzfdd.g(bundle, "ene", true, zzrVar.e1);
        zzfdd.f(bundle, "rafmt", "102", zzrVar.h1);
        zzfdd.f(bundle, "rafmt", "103", zzrVar.i1);
        zzfdd.f(bundle, "rafmt", "105", zzrVar.j1);
        zzfdd.g(bundle, "inline_adaptive_slot", true, this.i);
        zzfdd.g(bundle, "interscroller_slot", true, zzrVar.j1);
        zzfdd.c(bundle, S.A, this.b);
        zzfdd.f(bundle, "fluid", "height", this.c);
        zzfdd.f(bundle, "sz", this.d, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt("sh", this.g);
        String str2 = this.h;
        zzfdd.f(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.zd)).booleanValue() && Build.VERSION.SDK_INT >= 35 && (insets = this.j) != null) {
            i = insets.top;
            bundle.putInt("sam_t", i);
            i2 = insets.bottom;
            bundle.putInt("sam_b", i2);
            i3 = insets.left;
            bundle.putInt("sam_l", i3);
            i4 = insets.right;
            bundle.putInt("sam_r", i4);
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.b1;
        if (zzrVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", i6);
            bundle2.putInt("width", i5);
            bundle2.putBoolean("is_fluid_height", zzrVar.d1);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzrVar2.d1);
                bundle3.putInt("height", zzrVar2.Y);
                bundle3.putInt("width", zzrVar2.Z0);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
        a(((zzcuv) obj).b);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void c(Object obj) {
        a(((zzcuv) obj).a);
    }
}
