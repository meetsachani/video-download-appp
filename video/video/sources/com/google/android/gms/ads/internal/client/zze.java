package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "AdErrorParcelCreator")
/* loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 4)
    public zze Y0;
    @SafeParcelable.Field(id = 3)
    public final String Z;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 5, type = "android.os.IBinder")
    public IBinder Z0;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) zze zzeVar, @InterfaceC11300zs1 @SafeParcelable.Param(id = 5) IBinder iBinder) {
        this.X = i;
        this.Y = str;
        this.Z = str2;
        this.Y0 = zzeVar;
        this.Z0 = iBinder;
    }

    public final LoadAdError B0() {
        AdError adError;
        zze zzeVar = this.Y0;
        zzdx zzdxVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.X, zzeVar.Y, zzeVar.Z);
        }
        int i = this.X;
        String str = this.Y;
        String str2 = this.Z;
        IBinder iBinder = this.Z0;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzdx) {
                zzdxVar = (zzdx) queryLocalInterface;
            } else {
                zzdxVar = new zzdv(iBinder);
            }
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.f(zzdxVar));
    }

    public final AdError m0() {
        AdError adError;
        zze zzeVar = this.Y0;
        if (zzeVar == null) {
            adError = null;
        } else {
            String str = zzeVar.Z;
            adError = new AdError(zzeVar.X, zzeVar.Y, str);
        }
        return new AdError(this.X, this.Y, this.Z, adError);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.S(parcel, 4, this.Y0, i, false);
        SafeParcelWriter.B(parcel, 5, this.Z0, false);
        SafeParcelWriter.b(parcel, a);
    }
}
