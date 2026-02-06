package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "FavaDiagnosticsEntityCreator")
/* loaded from: classes2.dex */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new zaa();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @InterfaceC5670cr1
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @SafeParcelable.Field(id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public FavaDiagnosticsEntity(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @InterfaceC5670cr1 String str, @SafeParcelable.Param(id = 3) int i2) {
        this.X = i;
        this.Y = str;
        this.Z = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.b(parcel, a);
    }

    @KeepForSdk
    public FavaDiagnosticsEntity(@InterfaceC5670cr1 String str, int i) {
        this.X = 1;
        this.Y = str;
        this.Z = i;
    }
}
