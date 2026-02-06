package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import o.C3855Oo;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
/* loaded from: classes2.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field(getter = "getCallingPackage", id = 1)
    public final String X;
    @SafeParcelable.Field(getter = "getAllowTestKeys", id = 2)
    public final boolean Y;
    @SafeParcelable.Field(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    public final Context Y0;
    @SafeParcelable.Field(defaultValue = C3855Oo.a, getter = "getIgnoreTestKeysOverride", id = 3)
    public final boolean Z;
    @SafeParcelable.Field(getter = "getIsChimeraPackage", id = 5)
    public final boolean Z0;
    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", id = 6)
    public final boolean a1;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z2, @SafeParcelable.Param(id = 4) IBinder iBinder, @SafeParcelable.Param(id = 5) boolean z3, @SafeParcelable.Param(id = 6) boolean z4) {
        this.X = str;
        this.Y = z;
        this.Z = z2;
        this.Y0 = (Context) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder));
        this.Z0 = z3;
        this.a1 = z4;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 1, str, false);
        SafeParcelWriter.g(parcel, 2, this.Y);
        SafeParcelWriter.g(parcel, 3, this.Z);
        SafeParcelWriter.B(parcel, 4, ObjectWrapper.V3(this.Y0), false);
        SafeParcelWriter.g(parcel, 5, this.Z0);
        SafeParcelWriter.g(parcel, 6, this.a1);
        SafeParcelWriter.b(parcel, a);
    }
}
