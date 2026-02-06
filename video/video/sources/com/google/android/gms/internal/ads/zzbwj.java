package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import o.InterfaceC11300zs1;
import org.json.JSONArray;
import org.json.JSONException;

@SafeParcelable.Class(creator = "RewardItemParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbwj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwj> CREATOR = new zzbwk();
    @SafeParcelable.Field(id = 2)
    public final String X;
    @SafeParcelable.Field(id = 3)
    public final int Y;

    @SafeParcelable.Constructor
    public zzbwj(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.X = str;
        this.Y = i;
    }

    @InterfaceC11300zs1
    public static zzbwj m0(JSONArray jSONArray) throws JSONException {
        if (jSONArray != null && jSONArray.length() != 0) {
            return new zzbwj(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbwj)) {
            zzbwj zzbwjVar = (zzbwj) obj;
            if (Objects.b(this.X, zzbwjVar.X)) {
                if (Objects.b(Integer.valueOf(this.Y), Integer.valueOf(zzbwjVar.Y))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.c(this.X, Integer.valueOf(this.Y));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, str, false);
        SafeParcelWriter.F(parcel, 3, this.Y);
        SafeParcelWriter.b(parcel, a);
    }
}
