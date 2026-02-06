package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "VideoOptionsParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzfw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfx();
    @SafeParcelable.Field(id = 2)
    public final boolean X;
    @SafeParcelable.Field(id = 3)
    public final boolean Y;
    @SafeParcelable.Field(id = 4)
    public final boolean Z;

    public zzfw(VideoOptions videoOptions) {
        this(videoOptions.c(), videoOptions.b(), videoOptions.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.g(parcel, 2, z);
        SafeParcelWriter.g(parcel, 3, this.Y);
        SafeParcelWriter.g(parcel, 4, this.Z);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzfw(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) boolean z3) {
        this.X = z;
        this.Y = z2;
        this.Z = z3;
    }
}
