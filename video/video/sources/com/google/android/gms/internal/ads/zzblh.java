package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "HttpRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzblh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblh> CREATOR = new zzbli();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final String[] Y;
    @SafeParcelable.Field(id = 3)
    public final String[] Z;

    @SafeParcelable.Constructor
    public zzblh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) String[] strArr2) {
        this.X = str;
        this.Y = strArr;
        this.Z = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.Z(parcel, 2, this.Y, false);
        SafeParcelWriter.Z(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }
}
