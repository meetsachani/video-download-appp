package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcwg;
import com.google.android.gms.internal.ads.zzddy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzo();
    public static final AtomicLong t1 = new AtomicLong(0);
    public static final ConcurrentHashMap u1 = new ConcurrentHashMap();
    @SafeParcelable.Field(id = 2)
    public final zzc X;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza Y;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcfb Y0;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzr Z;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbio Z0;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 7)
    public final String a1;
    @SafeParcelable.Field(id = 8)
    public final boolean b1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 9)
    public final String c1;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzad d1;
    @SafeParcelable.Field(id = 11)
    public final int e1;
    @SafeParcelable.Field(id = 12)
    public final int f1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 13)
    public final String g1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 14)
    public final VersionInfoParcel h1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 16)
    public final String i1;
    @SafeParcelable.Field(id = 17)
    public final com.google.android.gms.ads.internal.zzl j1;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbim k1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 19)
    public final String l1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 24)
    public final String m1;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 25)
    public final String n1;
    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzcwg o1;
    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzddy p1;
    @SafeParcelable.Field(getter = "getOfflineUtilsAsBinder", id = 28, type = "android.os.IBinder")
    public final zzbte q1;
    @SafeParcelable.Field(id = 29)
    public final boolean r1;
    @SafeParcelable.Field(id = 30)
    public final long s1;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbim zzbimVar, zzbio zzbioVar, zzad zzadVar, zzcfb zzcfbVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, zzddy zzddyVar, zzbte zzbteVar, boolean z2) {
        this.X = null;
        this.Y = zzaVar;
        this.Z = zzrVar;
        this.Y0 = zzcfbVar;
        this.k1 = zzbimVar;
        this.Z0 = zzbioVar;
        this.a1 = null;
        this.b1 = z;
        this.c1 = null;
        this.d1 = zzadVar;
        this.e1 = i;
        this.f1 = 3;
        this.g1 = str;
        this.h1 = versionInfoParcel;
        this.i1 = null;
        this.j1 = null;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = zzddyVar;
        this.q1 = zzbteVar;
        this.r1 = z2;
        this.s1 = t1.getAndIncrement();
    }

    @InterfaceC11300zs1
    public static final IBinder E0(Object obj) {
        if (((Boolean) zzbd.c().b(zzbcv.gd)).booleanValue()) {
            return null;
        }
        return ObjectWrapper.V3(obj).asBinder();
    }

    @InterfaceC11300zs1
    public static AdOverlayInfoParcel m0(@InterfaceC5670cr1 Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            if (((Boolean) zzbd.c().b(zzbcv.gd)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.t().x(e, "AdOverlayInfoParcel.getFromIntent");
                return null;
            }
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.S(parcel, 2, this.X, i, false);
        com.google.android.gms.ads.internal.client.zza zzaVar = this.Y;
        SafeParcelWriter.B(parcel, 3, E0(zzaVar), false);
        zzr zzrVar = this.Z;
        SafeParcelWriter.B(parcel, 4, E0(zzrVar), false);
        zzcfb zzcfbVar = this.Y0;
        SafeParcelWriter.B(parcel, 5, E0(zzcfbVar), false);
        zzbio zzbioVar = this.Z0;
        SafeParcelWriter.B(parcel, 6, E0(zzbioVar), false);
        SafeParcelWriter.Y(parcel, 7, this.a1, false);
        SafeParcelWriter.g(parcel, 8, this.b1);
        SafeParcelWriter.Y(parcel, 9, this.c1, false);
        zzad zzadVar = this.d1;
        SafeParcelWriter.B(parcel, 10, E0(zzadVar), false);
        SafeParcelWriter.F(parcel, 11, this.e1);
        SafeParcelWriter.F(parcel, 12, this.f1);
        SafeParcelWriter.Y(parcel, 13, this.g1, false);
        SafeParcelWriter.S(parcel, 14, this.h1, i, false);
        SafeParcelWriter.Y(parcel, 16, this.i1, false);
        SafeParcelWriter.S(parcel, 17, this.j1, i, false);
        zzbim zzbimVar = this.k1;
        SafeParcelWriter.B(parcel, 18, E0(zzbimVar), false);
        SafeParcelWriter.Y(parcel, 19, this.l1, false);
        SafeParcelWriter.Y(parcel, 24, this.m1, false);
        SafeParcelWriter.Y(parcel, 25, this.n1, false);
        zzcwg zzcwgVar = this.o1;
        SafeParcelWriter.B(parcel, 26, E0(zzcwgVar), false);
        zzddy zzddyVar = this.p1;
        SafeParcelWriter.B(parcel, 27, E0(zzddyVar), false);
        zzbte zzbteVar = this.q1;
        SafeParcelWriter.B(parcel, 28, E0(zzbteVar), false);
        SafeParcelWriter.g(parcel, 29, this.r1);
        long j = this.s1;
        SafeParcelWriter.K(parcel, 30, j);
        SafeParcelWriter.b(parcel, a);
        if (((Boolean) zzbd.c().b(zzbcv.gd)).booleanValue()) {
            u1.put(Long.valueOf(j), new zzp(zzaVar, zzrVar, zzcfbVar, zzbimVar, zzbioVar, zzadVar, zzcwgVar, zzddyVar, zzbteVar, zzcaa.d.schedule(new zzq(j), ((Integer) zzbd.c().b(zzbcv.id)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzbim zzbimVar, zzbio zzbioVar, zzad zzadVar, zzcfb zzcfbVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzddy zzddyVar, zzbte zzbteVar) {
        this.X = null;
        this.Y = zzaVar;
        this.Z = zzrVar;
        this.Y0 = zzcfbVar;
        this.k1 = zzbimVar;
        this.Z0 = zzbioVar;
        this.a1 = str2;
        this.b1 = z;
        this.c1 = str;
        this.d1 = zzadVar;
        this.e1 = i;
        this.f1 = 3;
        this.g1 = null;
        this.h1 = versionInfoParcel;
        this.i1 = null;
        this.j1 = null;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = zzddyVar;
        this.q1 = zzbteVar;
        this.r1 = false;
        this.s1 = t1.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzcfb zzcfbVar, int i, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.zzl zzlVar, String str2, String str3, String str4, zzcwg zzcwgVar, zzbte zzbteVar, String str5) {
        this.X = null;
        this.Y = null;
        this.Z = zzrVar;
        this.Y0 = zzcfbVar;
        this.k1 = null;
        this.Z0 = null;
        this.b1 = false;
        if (((Boolean) zzbd.c().b(zzbcv.X0)).booleanValue()) {
            this.a1 = null;
            this.c1 = null;
        } else {
            this.a1 = str2;
            this.c1 = str3;
        }
        this.d1 = null;
        this.e1 = i;
        this.f1 = 1;
        this.g1 = null;
        this.h1 = versionInfoParcel;
        this.i1 = str;
        this.j1 = zzlVar;
        this.l1 = str5;
        this.m1 = null;
        this.n1 = str4;
        this.o1 = zzcwgVar;
        this.p1 = null;
        this.q1 = zzbteVar;
        this.r1 = false;
        this.s1 = t1.getAndIncrement();
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, zzcfb zzcfbVar, boolean z, int i, VersionInfoParcel versionInfoParcel, zzddy zzddyVar, zzbte zzbteVar) {
        this.X = null;
        this.Y = zzaVar;
        this.Z = zzrVar;
        this.Y0 = zzcfbVar;
        this.k1 = null;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = z;
        this.c1 = null;
        this.d1 = zzadVar;
        this.e1 = i;
        this.f1 = 2;
        this.g1 = null;
        this.h1 = versionInfoParcel;
        this.i1 = null;
        this.j1 = null;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = zzddyVar;
        this.q1 = zzbteVar;
        this.r1 = false;
        this.s1 = t1.getAndIncrement();
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzcVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i, @SafeParcelable.Param(id = 12) int i2, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzl zzlVar, @SafeParcelable.Param(id = 18) IBinder iBinder6, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) IBinder iBinder7, @SafeParcelable.Param(id = 27) IBinder iBinder8, @SafeParcelable.Param(id = 28) IBinder iBinder9, @SafeParcelable.Param(id = 29) boolean z2, @SafeParcelable.Param(id = 30) long j) {
        this.X = zzcVar;
        this.a1 = str;
        this.b1 = z;
        this.c1 = str2;
        this.e1 = i;
        this.f1 = i2;
        this.g1 = str3;
        this.h1 = versionInfoParcel;
        this.i1 = str4;
        this.j1 = zzlVar;
        this.l1 = str5;
        this.m1 = str6;
        this.n1 = str7;
        this.r1 = z2;
        this.s1 = j;
        if (((Boolean) zzbd.c().b(zzbcv.gd)).booleanValue()) {
            zzp zzpVar = (zzp) u1.remove(Long.valueOf(j));
            if (zzpVar != null) {
                this.Y = zzp.a(zzpVar);
                this.Z = zzp.e(zzpVar);
                this.Y0 = zzp.g(zzpVar);
                this.k1 = zzp.b(zzpVar);
                this.Z0 = zzp.c(zzpVar);
                this.o1 = zzp.h(zzpVar);
                this.p1 = zzp.i(zzpVar);
                this.q1 = zzp.d(zzpVar);
                this.d1 = zzp.f(zzpVar);
                zzp.j(zzpVar).cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.Y = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder));
        this.Z = (zzr) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder2));
        this.Y0 = (zzcfb) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder3));
        this.k1 = (zzbim) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder6));
        this.Z0 = (zzbio) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder4));
        this.d1 = (zzad) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder5));
        this.o1 = (zzcwg) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder7));
        this.p1 = (zzddy) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder8));
        this.q1 = (zzbte) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder9));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzr zzrVar, zzad zzadVar, VersionInfoParcel versionInfoParcel, zzcfb zzcfbVar, zzddy zzddyVar, String str) {
        this.X = zzcVar;
        this.Y = zzaVar;
        this.Z = zzrVar;
        this.Y0 = zzcfbVar;
        this.k1 = null;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = false;
        this.c1 = null;
        this.d1 = zzadVar;
        this.e1 = -1;
        this.f1 = 4;
        this.g1 = null;
        this.h1 = versionInfoParcel;
        this.i1 = null;
        this.j1 = null;
        this.l1 = str;
        this.m1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = zzddyVar;
        this.q1 = null;
        this.r1 = false;
        this.s1 = t1.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzr zzrVar, zzcfb zzcfbVar, int i, VersionInfoParcel versionInfoParcel) {
        this.Z = zzrVar;
        this.Y0 = zzcfbVar;
        this.e1 = 1;
        this.h1 = versionInfoParcel;
        this.X = null;
        this.Y = null;
        this.k1 = null;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = false;
        this.c1 = null;
        this.d1 = null;
        this.f1 = 1;
        this.g1 = null;
        this.i1 = null;
        this.j1 = null;
        this.l1 = null;
        this.m1 = null;
        this.n1 = null;
        this.o1 = null;
        this.p1 = null;
        this.q1 = null;
        this.r1 = false;
        this.s1 = t1.getAndIncrement();
    }

    public AdOverlayInfoParcel(zzcfb zzcfbVar, VersionInfoParcel versionInfoParcel, String str, String str2, int i, zzbte zzbteVar) {
        this.X = null;
        this.Y = null;
        this.Z = null;
        this.Y0 = zzcfbVar;
        this.k1 = null;
        this.Z0 = null;
        this.a1 = null;
        this.b1 = false;
        this.c1 = null;
        this.d1 = null;
        this.e1 = 14;
        this.f1 = 5;
        this.g1 = null;
        this.h1 = versionInfoParcel;
        this.i1 = null;
        this.j1 = null;
        this.l1 = str;
        this.m1 = str2;
        this.n1 = null;
        this.o1 = null;
        this.p1 = null;
        this.q1 = zzbteVar;
        this.r1 = false;
        this.s1 = t1.getAndIncrement();
    }
}
