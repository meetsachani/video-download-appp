package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "NativeAdLayoutInfoParcelCreator")
/* loaded from: classes2.dex */
public final class zzbud extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbud> CREATOR = new zzbue();
    @SafeParcelable.Field(getter = "getAdViewAsBinder", id = 1, type = "android.os.IBinder")
    public final View X;
    @SafeParcelable.Field(getter = "getAssetViewMapAsBinder", id = 2, type = "android.os.IBinder")
    public final Map Y;

    @SafeParcelable.Constructor
    public zzbud(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2) {
        this.X = (View) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder));
        this.Y = (Map) ObjectWrapper.o1(IObjectWrapper.Stub.g1(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.B(parcel, 1, ObjectWrapper.V3(view).asBinder(), false);
        SafeParcelWriter.B(parcel, 2, ObjectWrapper.V3(this.Y).asBinder(), false);
        SafeParcelWriter.b(parcel, a);
    }
}
