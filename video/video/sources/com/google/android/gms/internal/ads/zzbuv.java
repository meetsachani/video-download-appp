package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "DecagonRequestParcelCreator")
/* loaded from: classes2.dex */
public final class zzbuv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuv> CREATOR = new zzbuw();
    @SafeParcelable.Field(id = 1)
    public final String X;

    @SafeParcelable.Constructor
    public zzbuv(@SafeParcelable.Param(id = 1) String str) {
        this.X = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.b(parcel, a);
    }
}
