package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.Class(creator = "SignInRequestCreator")
/* loaded from: classes3.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", id = 2)
    public final zat Y;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zat zatVar) {
        this.X = i;
        this.Y = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.S(parcel, 2, this.Y, i, false);
        SafeParcelWriter.b(parcel, a);
    }
}
