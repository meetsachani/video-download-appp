package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "ClientIdentityCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes2.dex */
public class ClientIdentity extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new zaa();
    @KeepForSdk
    @SafeParcelable.Field(defaultValueUnchecked = "0", id = 1)
    public final int X;
    @InterfaceC11300zs1
    @KeepForSdk
    @SafeParcelable.Field(defaultValueUnchecked = "null", id = 2)
    public final String Y;

    @SafeParcelable.Constructor
    public ClientIdentity(@SafeParcelable.Param(id = 1) int i, @InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str) {
        this.X = i;
        this.Y = str;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        if (clientIdentity.X == this.X && Objects.b(clientIdentity.Y, this.Y)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.X;
    }

    @InterfaceC5670cr1
    public final String toString() {
        int i = this.X;
        String str = this.Y;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }
}
