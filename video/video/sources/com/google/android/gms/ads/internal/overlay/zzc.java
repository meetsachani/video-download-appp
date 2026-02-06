package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@SafeParcelable.Class(creator = "AdLauncherIntentInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzb();
    @SafeParcelable.Field(id = 2)
    public final String X;
    @SafeParcelable.Field(id = 3)
    public final String Y;
    @SafeParcelable.Field(id = 5)
    public final String Y0;
    @SafeParcelable.Field(id = 4)
    public final String Z;
    @SafeParcelable.Field(id = 6)
    public final String Z0;
    @SafeParcelable.Field(id = 7)
    public final String a1;
    @SafeParcelable.Field(id = 8)
    public final String b1;
    @SafeParcelable.Field(id = 9)
    public final Intent c1;
    @SafeParcelable.Field(getter = "getLaunchIntentListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzaa d1;
    @SafeParcelable.Field(id = 11)
    public final boolean e1;

    public zzc(Intent intent, zzaa zzaaVar) {
        this(null, null, null, null, null, null, null, intent, ObjectWrapper.V3(zzaaVar).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, str, false);
        SafeParcelWriter.Y(parcel, 3, this.Y, false);
        SafeParcelWriter.Y(parcel, 4, this.Z, false);
        SafeParcelWriter.Y(parcel, 5, this.Y0, false);
        SafeParcelWriter.Y(parcel, 6, this.Z0, false);
        SafeParcelWriter.Y(parcel, 7, this.a1, false);
        SafeParcelWriter.Y(parcel, 8, this.b1, false);
        SafeParcelWriter.S(parcel, 9, this.c1, i, false);
        SafeParcelWriter.B(parcel, 10, ObjectWrapper.V3(this.d1).asBinder(), false);
        SafeParcelWriter.g(parcel, 11, this.e1);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) Intent intent, @SafeParcelable.Param(id = 10) IBinder iBinder, @SafeParcelable.Param(id = 11) boolean z) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.Y0 = str4;
        this.Z0 = str5;
        this.a1 = str6;
        this.b1 = str7;
        this.c1 = intent;
        this.d1 = (zzaa) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder));
        this.e1 = z;
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, zzaa zzaaVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, ObjectWrapper.V3(zzaaVar).asBinder(), false);
    }
}
