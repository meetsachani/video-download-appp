package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "ResolveAccountResponseCreator")
/* loaded from: classes2.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new zaw();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 2)
    public final IBinder Y;
    @SafeParcelable.Field(getter = "getSaveDefaultAccount", id = 4)
    public final boolean Y0;
    @SafeParcelable.Field(getter = "getConnectionResult", id = 3)
    public final ConnectionResult Z;
    @SafeParcelable.Field(getter = "isFromCrossClientAuth", id = 5)
    public final boolean Z0;

    @SafeParcelable.Constructor
    public zav(@SafeParcelable.Param(id = 1) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) ConnectionResult connectionResult, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2) {
        this.X = i;
        this.Y = iBinder;
        this.Z = connectionResult;
        this.Y0 = z;
        this.Z0 = z2;
    }

    @InterfaceC11300zs1
    public final IAccountAccessor B0() {
        IBinder iBinder = this.Y;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.g1(iBinder);
    }

    public final boolean E0() {
        return this.Y0;
    }

    public final boolean G0() {
        return this.Z0;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        if (!this.Z.equals(zavVar.Z) || !Objects.b(B0(), zavVar.B0())) {
            return false;
        }
        return true;
    }

    public final ConnectionResult m0() {
        return this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.B(parcel, 2, this.Y, false);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.g(parcel, 4, this.Y0);
        SafeParcelWriter.g(parcel, 5, this.Z0);
        SafeParcelWriter.b(parcel, a);
    }
}
