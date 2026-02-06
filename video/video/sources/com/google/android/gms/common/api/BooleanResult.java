package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class BooleanResult implements Result {
    public final Status X;
    public final boolean Y;

    @ShowFirstParty
    @KeepForSdk
    public BooleanResult(@InterfaceC5670cr1 Status status, boolean z) {
        this.X = (Status) Preconditions.s(status, "Status must not be null");
        this.Y = z;
    }

    @KeepForSdk
    public boolean a() {
        return this.Y;
    }

    @KeepForSdk
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        BooleanResult booleanResult = (BooleanResult) obj;
        if (!this.X.equals(booleanResult.X) || this.Y != booleanResult.Y) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.Result
    @InterfaceC5670cr1
    @KeepForSdk
    public Status h() {
        return this.X;
    }

    @KeepForSdk
    public final int hashCode() {
        return ((this.X.hashCode() + 527) * 31) + (this.Y ? 1 : 0);
    }
}
