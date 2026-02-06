package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@SafeParcelable.Class(creator = "ConverterWrapperCreator")
/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    @SafeParcelable.Field(getter = "getStringToIntConverter", id = 2)
    public final StringToIntConverter Y;

    @SafeParcelable.Constructor
    public zaa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) StringToIntConverter stringToIntConverter) {
        this.X = i;
        this.Y = stringToIntConverter;
    }

    public static zaa m0(FastJsonResponse.FieldConverter<?, ?> fieldConverter) {
        if (fieldConverter instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) fieldConverter);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FastJsonResponse.FieldConverter<?, ?> B0() {
        StringToIntConverter stringToIntConverter = this.Y;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        SafeParcelWriter.S(parcel, 2, this.Y, i, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.X = 1;
        this.Y = stringToIntConverter;
    }
}
