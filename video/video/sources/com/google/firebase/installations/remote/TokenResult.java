package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_TokenResult;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class TokenResult {

    @InterfaceC6615gi.a
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @InterfaceC5670cr1
        public abstract TokenResult a();

        @InterfaceC5670cr1
        public abstract Builder b(@InterfaceC5670cr1 ResponseCode responseCode);

        @InterfaceC5670cr1
        public abstract Builder c(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder d(long j);
    }

    /* loaded from: classes3.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @InterfaceC5670cr1
    public static Builder a() {
        return new AutoValue_TokenResult.Builder().d(0L);
    }

    @InterfaceC11300zs1
    public abstract ResponseCode b();

    @InterfaceC11300zs1
    public abstract String c();

    @InterfaceC5670cr1
    public abstract long d();

    @InterfaceC5670cr1
    public abstract Builder e();
}
