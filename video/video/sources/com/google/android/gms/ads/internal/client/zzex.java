package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
/* loaded from: classes2.dex */
public final class zzex extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzex> CREATOR = new zzey();
    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getSdkVersionLite", id = 2)
    public final int Y;
    @SafeParcelable.Field(getter = "getGranularVersion", id = 3)
    public final String Z;

    public zzex() {
        this(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.3.0");
    }

    public final String B0() {
        return this.Z;
    }

    public final int m0() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzex(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str) {
        this.X = i;
        this.Y = i2;
        this.Z = str;
    }
}
