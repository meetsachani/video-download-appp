package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "AppSetIdRequestParamsCreator")
/* loaded from: classes2.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getVersion", id = 1)
    public final String X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getClientAppPackageName", id = 2)
    public final String Y;

    @SafeParcelable.Constructor
    public zza(@InterfaceC11300zs1 @SafeParcelable.Param(id = 1) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str2) {
        this.X = str;
        this.Y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, this.X, false);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }
}
