package com.google.android.gms.common.api;

import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public class ApiException extends Exception {
    @InterfaceC5670cr1
    @Deprecated
    public final Status X;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(@InterfaceC5670cr1 Status status) {
        super(r0 + ": " + r1);
        String str;
        int E0 = status.E0();
        if (status.G0() != null) {
            str = status.G0();
        } else {
            str = "";
        }
        this.X = status;
    }

    @InterfaceC5670cr1
    public Status a() {
        return this.X;
    }

    public int b() {
        return this.X.E0();
    }

    @InterfaceC11300zs1
    @Deprecated
    public String c() {
        return this.X.G0();
    }
}
