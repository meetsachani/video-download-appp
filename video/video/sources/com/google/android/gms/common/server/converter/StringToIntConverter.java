package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
/* loaded from: classes2.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.FieldConverter<String, Integer> {
    @InterfaceC5670cr1
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new zad();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    public final HashMap<String, Integer> Y;
    public final SparseArray<String> Z;

    @KeepForSdk
    public StringToIntConverter() {
        this.X = 1;
        this.Y = new HashMap<>();
        this.Z = new SparseArray<>();
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ Integer a0(@InterfaceC5670cr1 String str) {
        Integer num = this.Y.get(str);
        if (num == null) {
            return this.Y.get("gms_unknown");
        }
        return num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int d() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int f() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    @InterfaceC5670cr1
    public final /* bridge */ /* synthetic */ String k(@InterfaceC5670cr1 Integer num) {
        String str = this.Z.get(num.intValue());
        if (str == null && this.Y.containsKey("gms_unknown")) {
            return "gms_unknown";
        }
        return str;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public StringToIntConverter m0(@InterfaceC5670cr1 String str, int i) {
        this.Y.put(str, Integer.valueOf(i));
        this.Z.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        ArrayList arrayList = new ArrayList();
        for (String str : this.Y.keySet()) {
            arrayList.add(new zac(str, this.Y.get(str).intValue()));
        }
        SafeParcelWriter.d0(parcel, 2, arrayList, false);
        SafeParcelWriter.b(parcel, a);
    }

    @SafeParcelable.Constructor
    public StringToIntConverter(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zac> arrayList) {
        this.X = i;
        this.Y = new HashMap<>();
        this.Z = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zacVar = arrayList.get(i2);
            m0(zacVar.Y, zacVar.Z);
        }
    }
}
