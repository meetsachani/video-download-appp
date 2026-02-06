package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import o.InterfaceC11300zs1;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryEntryCreator")
/* loaded from: classes2.dex */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new zap();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final String Y;
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 3)
    public final ArrayList<zam> Z;

    @SafeParcelable.Constructor
    public zal(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) ArrayList<zam> arrayList) {
        this.X = i;
        this.Y = str;
        this.Z = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.Y(parcel, 2, this.Y, false);
        SafeParcelWriter.d0(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.X = 1;
        this.Y = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, map.get(str2)));
            }
        }
        this.Z = arrayList;
    }
}
