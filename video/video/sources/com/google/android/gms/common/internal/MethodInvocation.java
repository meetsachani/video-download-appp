package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* loaded from: classes2.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field(getter = "getMethodKey", id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getResultStatusCode", id = 2)
    public final int Y;
    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 4)
    public final long Y0;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", id = 3)
    public final int Z;
    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 5)
    public final long Z0;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getCallingModuleId", id = 6)
    public final String a1;
    @InterfaceC11300zs1
    @SafeParcelable.Field(getter = "getCallingEntryPoint", id = 7)
    public final String b1;
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", id = 8)
    public final int c1;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", id = 9)
    public final int d1;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.F(parcel, 3, this.Z);
        SafeParcelWriter.K(parcel, 4, this.Y0);
        SafeParcelWriter.K(parcel, 5, this.Z0);
        SafeParcelWriter.Y(parcel, 6, this.a1, false);
        SafeParcelWriter.Y(parcel, 7, this.b1, false);
        SafeParcelWriter.F(parcel, 8, this.c1);
        SafeParcelWriter.F(parcel, 9, this.d1);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) long j2, @InterfaceC11300zs1 @SafeParcelable.Param(id = 6) String str, @InterfaceC11300zs1 @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) int i4, @SafeParcelable.Param(id = 9) int i5) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        this.Y0 = j;
        this.Z0 = j2;
        this.a1 = str;
        this.b1 = str2;
        this.c1 = i4;
        this.d1 = i5;
    }
}
