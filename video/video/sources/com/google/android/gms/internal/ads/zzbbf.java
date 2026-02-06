package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import o.InterfaceC11300zs1;

@SafeParcelable.Class(creator = "CacheOfferingCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzbbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbbf> CREATOR = new zzbbg();
    @InterfaceC11300zs1
    @SafeParcelable.Field(id = 2)
    public final String X;
    @SafeParcelable.Field(id = 3)
    public final long Y;
    @SafeParcelable.Field(id = 5)
    public final String Y0;
    @SafeParcelable.Field(id = 4)
    public final String Z;
    @SafeParcelable.Field(id = 6)
    public final String Z0;
    @SafeParcelable.Field(id = 7)
    public final Bundle a1;
    @SafeParcelable.Field(id = 8)
    public final boolean b1;
    @SafeParcelable.Field(id = 9)
    public long c1;
    @SafeParcelable.Field(id = 10)
    public String d1;
    @SafeParcelable.Field(id = 11)
    public int e1;

    @SafeParcelable.Constructor
    public zzbbf(@InterfaceC11300zs1 @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) String str4, @SafeParcelable.Param(id = 7) Bundle bundle, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j2, @SafeParcelable.Param(id = 10) String str5, @SafeParcelable.Param(id = 11) int i) {
        this.X = str;
        this.Y = j;
        this.Z = str2 == null ? "" : str2;
        this.Y0 = str3 == null ? "" : str3;
        this.Z0 = str4 == null ? "" : str4;
        this.a1 = bundle == null ? new Bundle() : bundle;
        this.b1 = z;
        this.c1 = j2;
        this.d1 = str5;
        this.e1 = i;
    }

    @InterfaceC11300zs1
    public static zzbbf m0(Uri uri) {
        long parseLong;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j = parseLong;
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbbf(queryParameter, j, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            int i22 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.X;
        int a = SafeParcelWriter.a(parcel);
        SafeParcelWriter.Y(parcel, 2, str, false);
        SafeParcelWriter.K(parcel, 3, this.Y);
        SafeParcelWriter.Y(parcel, 4, this.Z, false);
        SafeParcelWriter.Y(parcel, 5, this.Y0, false);
        SafeParcelWriter.Y(parcel, 6, this.Z0, false);
        SafeParcelWriter.k(parcel, 7, this.a1, false);
        SafeParcelWriter.g(parcel, 8, this.b1);
        SafeParcelWriter.K(parcel, 9, this.c1);
        SafeParcelWriter.Y(parcel, 10, this.d1, false);
        SafeParcelWriter.F(parcel, 11, this.e1);
        SafeParcelWriter.b(parcel, a);
    }
}
