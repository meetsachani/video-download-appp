package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "AuthAccountResultCreator")
/* loaded from: classes3.dex */
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getConnectionResultCode", id = 2)
    public int Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getRawAuthResolutionIntent", id = 3)
    public Intent Z;

    public zaa() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status h() {
        if (this.Y == 0) {
            return Status.a1;
        }
        return Status.e1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.S(parcel, 3, this.Z, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 3) Intent intent) {
        this.X = i;
        this.Y = i2;
        this.Z = intent;
    }
}
