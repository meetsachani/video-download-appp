package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @InterfaceC11300zs1
    @VisibleForTesting
    public Object e(@InterfaceC5670cr1 String str) {
        return null;
    }

    @KeepForSdk
    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field<?, ?> field : c().values()) {
            if (f(field)) {
                if (!fastJsonResponse.f(field) || !Objects.b(d(field), fastJsonResponse.d(field))) {
                    return false;
                }
            } else if (fastJsonResponse.f(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    @VisibleForTesting
    public boolean g(@InterfaceC5670cr1 String str) {
        return false;
    }

    @KeepForSdk
    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field<?, ?> field : c().values()) {
            if (f(field)) {
                i = (i * 31) + Preconditions.r(d(field)).hashCode();
            }
        }
        return i;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public byte[] i0() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
