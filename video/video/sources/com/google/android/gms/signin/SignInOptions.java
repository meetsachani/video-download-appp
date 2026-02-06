package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {
    @InterfaceC5670cr1
    public static final SignInOptions e1 = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
    public final boolean X = false;
    public final boolean Y = false;
    @InterfaceC11300zs1
    public final String Z = null;
    public final boolean Y0 = false;
    public final boolean b1 = false;
    @InterfaceC11300zs1
    public final String Z0 = null;
    @InterfaceC11300zs1
    public final String a1 = null;
    @InterfaceC11300zs1
    public final Long c1 = null;
    @InterfaceC11300zs1
    public final Long d1 = null;

    public /* synthetic */ SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l, Long l2, zaf zafVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        boolean z = ((SignInOptions) obj).X;
        if (Objects.b(null, null) && Objects.b(null, null) && Objects.b(null, null) && Objects.b(null, null) && Objects.b(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.c(bool, bool, null, bool, bool, null, null, null, null);
    }
}
