package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5670cr1;

@SafeParcelable.Class(creator = "GoogleSignInOptionsExtensionCreator")
/* loaded from: classes2.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getType", id = 2)
    public int Y;
    @SafeParcelable.Field(getter = "getBundle", id = 3)
    public Bundle Z;

    @SafeParcelable.Constructor
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Bundle bundle) {
        this.X = i;
        this.Y = i2;
        this.Z = bundle;
    }

    @KeepForSdk
    public int getType() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.F(parcel, 2, getType());
        SafeParcelWriter.k(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }

    public GoogleSignInOptionsExtensionParcelable(@InterfaceC5670cr1 GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        this(1, googleSignInOptionsExtension.f(), googleSignInOptionsExtension.e());
    }
}
