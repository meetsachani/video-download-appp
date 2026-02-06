package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC10571ws1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "TelemetryDataCreator")
/* loaded from: classes2.dex */
public class TelemetryData extends AbstractSafeParcelable {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<TelemetryData> CREATOR = new zaab();
    @SafeParcelable.Field(getter = "getTelemetryConfigVersion", id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getMethodInvocations", id = 2)
    @InterfaceC10571ws1
    public List<MethodInvocation> Y;

    @SafeParcelable.Constructor
    public TelemetryData(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) @InterfaceC10571ws1 List<MethodInvocation> list) {
        this.X = i;
        this.Y = list;
    }

    public final void B0(@InterfaceC5670cr1 MethodInvocation methodInvocation) {
        if (this.Y == null) {
            this.Y = new ArrayList();
        }
        this.Y.add(methodInvocation);
    }

    public final int d() {
        return this.X;
    }

    @InterfaceC11300zs1
    public final List<MethodInvocation> m0() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.d0(parcel, 2, this.Y, false);
        SafeParcelWriter.b(parcel, a);
    }
}
