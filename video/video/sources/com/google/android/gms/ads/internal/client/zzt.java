package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import o.InterfaceC5940dy1;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
@SafeParcelable.Class(creator = "AdValueParcelCreator")
/* loaded from: classes2.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new zzu();
    @SafeParcelable.Field(id = 1)
    public final int X;
    @SafeParcelable.Field(id = 2)
    public final int Y;
    @SafeParcelable.Field(id = 4)
    public final long Y0;
    @SafeParcelable.Field(id = 3)
    public final String Z;

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j) {
        this.X = i;
        this.Y = i2;
        this.Z = str;
        this.Y0 = j;
    }

    public static zzt m0(JSONObject jSONObject) throws JSONException {
        return new zzt(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(FirebaseAnalytics.Param.i), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.F(parcel, 1, i2);
        SafeParcelWriter.F(parcel, 2, this.Y);
        SafeParcelWriter.Y(parcel, 3, this.Z, false);
        SafeParcelWriter.K(parcel, 4, this.Y0);
        SafeParcelWriter.b(parcel, a);
    }
}
