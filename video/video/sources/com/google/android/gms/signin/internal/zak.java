package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "SignInResponseCreator")
/* loaded from: classes3.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new zal();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 2)
    public final ConnectionResult Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getResolveAccountResponse", id = 3)
    public final zav Z;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ConnectionResult connectionResult, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) zav zavVar) {
        this.X = i;
        this.Y = connectionResult;
        this.Z = zavVar;
    }

    @InterfaceC11300zs1
    public final zav B0() {
        return this.Z;
    }

    public final ConnectionResult m0() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.S(parcel, 2, this.Y, i, false);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.b(parcel, a);
    }
}
