package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "SignInButtonConfigCreator")
/* loaded from: classes2.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new zay();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getButtonSize", id = 2)
    public final int Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getScopes", id = 4)
    @Deprecated
    public final Scope[] Y0;
    @SafeParcelable.Field(getter = "getColorScheme", id = 3)
    public final int Z;

    @SafeParcelable.Constructor
    public zax(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @InterfaceC11300zs1 @SafeParcelable.Param(id = 4) Scope[] scopeArr) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.c0(parcel, 4, this.Y0, i, false);
        SafeParcelWriter.b(parcel, a);
    }
}
