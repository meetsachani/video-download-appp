package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC10571ws1;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes2.dex */
public final class zzfej extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfej> CREATOR = new zzfek();
    public final zzfeg[] X;
    @InterfaceC10571ws1
    public final Context Y;
    public final zzfeg Y0;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    public final int Z;
    @SafeParcelable.Field(id = 2)
    public final int Z0;
    @SafeParcelable.Field(id = 3)
    public final int a1;
    @SafeParcelable.Field(id = 4)
    public final int b1;
    @SafeParcelable.Field(id = 5)
    public final String c1;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    public final int d1;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    public final int e1;
    public final int[] f1;
    public final int[] g1;
    public final int h1;

    @SafeParcelable.Constructor
    public zzfej(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) int i6) {
        zzfeg[] values = zzfeg.values();
        this.X = values;
        int[] a = zzfeh.a();
        this.f1 = a;
        int[] a2 = zzfei.a();
        this.g1 = a2;
        this.Y = null;
        this.Z = i;
        this.Y0 = values[i];
        this.Z0 = i2;
        this.a1 = i3;
        this.b1 = i4;
        this.c1 = str;
        this.d1 = i5;
        this.h1 = a[i5];
        this.e1 = i6;
        int i7 = a2[i6];
    }

    @InterfaceC10571ws1
    public static zzfej m0(zzfeg zzfegVar, Context context) {
        if (zzfegVar == zzfeg.Rewarded) {
            return new zzfej(context, zzfegVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z6)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.F6)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H6)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.J6), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B6), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D6));
        } else if (zzfegVar == zzfeg.Interstitial) {
            return new zzfej(context, zzfegVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A6)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G6)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.I6)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.K6), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C6), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E6));
        } else if (zzfegVar == zzfeg.AppOpen) {
            return new zzfej(context, zzfegVar, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.N6)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P6)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Q6)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.L6), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.M6), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O6));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.Z;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.F(parcel, 2, this.Z0);
        SafeParcelWriter.F(parcel, 3, this.a1);
        SafeParcelWriter.F(parcel, 4, this.b1);
        SafeParcelWriter.Y(parcel, 5, this.c1, false);
        SafeParcelWriter.F(parcel, 6, this.d1);
        SafeParcelWriter.F(parcel, 7, this.e1);
        SafeParcelWriter.b(parcel, a);
    }

    public zzfej(@InterfaceC10571ws1 Context context, zzfeg zzfegVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.X = zzfeg.values();
        this.f1 = zzfeh.a();
        this.g1 = zzfei.a();
        this.Y = context;
        this.Z = zzfegVar.ordinal();
        this.Y0 = zzfegVar;
        this.Z0 = i;
        this.a1 = i2;
        this.b1 = i3;
        this.c1 = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.h1 = i4;
        this.d1 = i4 - 1;
        "onAdClosed".equals(str3);
        this.e1 = 0;
    }
}
