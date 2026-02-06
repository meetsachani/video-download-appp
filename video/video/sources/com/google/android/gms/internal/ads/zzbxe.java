package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "ServerSideVerificationOptionsParcelCreator")
/* loaded from: classes2.dex */
public final class zzbxe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxe> CREATOR = new zzbxf();
    @SafeParcelable.Field(id = 1)
    public final String X;
    @SafeParcelable.Field(id = 2)
    public final String Y;

    public zzbxe(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.b(), serverSideVerificationOptions.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzbxe(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2) {
        this.X = str;
        this.Y = str2;
    }
}
