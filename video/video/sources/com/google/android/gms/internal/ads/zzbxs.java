package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "SafeBrowsingConfigParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbxs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbxs> CREATOR = new zzbxt();
    @SafeParcelable.Field(id = 2)
    public final String X;
    @SafeParcelable.Field(id = 3)
    public final String Y;
    @SafeParcelable.Field(id = 5)
    public final boolean Y0;
    @SafeParcelable.Field(id = 4)
    public final boolean Z;
    @SafeParcelable.Field(id = 6)
    public final List Z0;
    @SafeParcelable.Field(id = 7)
    public final boolean a1;
    @SafeParcelable.Field(id = 8)
    public final boolean b1;
    @SafeParcelable.Field(id = 9)
    public final List c1;

    @SafeParcelable.Constructor
    public zzbxs(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) boolean z2, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) boolean z3, @SafeParcelable.Param(id = 8) boolean z4, @SafeParcelable.Param(id = 9) List list2) {
        this.X = str;
        this.Y = str2;
        this.Z = z;
        this.Y0 = z2;
        this.Z0 = list;
        this.a1 = z3;
        this.b1 = z4;
        this.c1 = list2 == null ? new ArrayList() : list2;
    }

    @InterfaceC11300zs1
    public static zzbxs m0(JSONObject jSONObject) throws JSONException {
        return new zzbxs(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbs.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), com.google.android.gms.ads.internal.util.zzbs.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, str, false);
        SafeParcelWriter.Y(parcel, 3, this.Y, false);
        SafeParcelWriter.g(parcel, 4, this.Z);
        SafeParcelWriter.g(parcel, 5, this.Y0);
        SafeParcelWriter.a0(parcel, 6, this.Z0, false);
        SafeParcelWriter.g(parcel, 7, this.a1);
        SafeParcelWriter.g(parcel, 8, this.b1);
        SafeParcelWriter.a0(parcel, 9, this.c1, false);
        SafeParcelWriter.b(parcel, a);
    }
}
