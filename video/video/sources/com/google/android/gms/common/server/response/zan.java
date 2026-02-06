package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.TD0;

@ShowFirstParty
@SafeParcelable.Class(creator = "FieldMappingDictionaryCreator")
/* loaded from: classes2.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new zao();
    @SafeParcelable.VersionField(id = 1)
    public final int X;
    public final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> Y;
    @SafeParcelable.Field(getter = "getRootClassName", id = 3)
    public final String Z;

    @SafeParcelable.Constructor
    public zan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) ArrayList<zal> arrayList, @SafeParcelable.Param(id = 3) String str) {
        this.X = i;
        HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zalVar = arrayList.get(i2);
            String str2 = zalVar.Y;
            HashMap hashMap2 = new HashMap();
            int size2 = ((ArrayList) Preconditions.r(zalVar.Z)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zamVar = zalVar.Z.get(i3);
                hashMap2.put(zamVar.Y, zamVar.Z);
            }
            hashMap.put(str2, hashMap2);
        }
        this.Y = hashMap;
        this.Z = (String) Preconditions.r(str);
        G0();
    }

    @InterfaceC11300zs1
    public final Map<String, FastJsonResponse.Field<?, ?>> B0(String str) {
        return this.Y.get(str);
    }

    public final void E0() {
        for (String str : this.Y.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.Y.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, map.get(str2).M1());
            }
            this.Y.put(str, hashMap);
        }
    }

    public final void G0() {
        for (String str : this.Y.keySet()) {
            Map<String, FastJsonResponse.Field<?, ?>> map = this.Y.get(str);
            for (String str2 : map.keySet()) {
                map.get(str2).P2(this);
            }
        }
    }

    public final void H0(Class<? extends FastJsonResponse> cls, Map<String, FastJsonResponse.Field<?, ?>> map) {
        this.Y.put((String) Preconditions.r(cls.getCanonicalName()), map);
    }

    public final boolean I0(Class<? extends FastJsonResponse> cls) {
        return this.Y.containsKey(Preconditions.r(cls.getCanonicalName()));
    }

    public final String m0() {
        return this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.Y.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map<String, FastJsonResponse.Field<?, ?>> map = this.Y.get(str);
            for (String str2 : map.keySet()) {
                sb.append(TD0.a.Y0);
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, this.X);
        ArrayList arrayList = new ArrayList();
        for (String str : this.Y.keySet()) {
            arrayList.add(new zal(str, this.Y.get(str)));
        }
        SafeParcelWriter.d0(parcel, 2, arrayList, false);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.b(parcel, a);
    }

    public zan(Class<? extends FastJsonResponse> cls) {
        this.X = 1;
        this.Y = new HashMap<>();
        this.Z = (String) Preconditions.r(cls.getCanonicalName());
    }
}
