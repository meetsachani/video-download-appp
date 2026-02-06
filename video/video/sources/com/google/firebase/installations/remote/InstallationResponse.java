package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.AutoValue_InstallationResponse;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class InstallationResponse {

    @InterfaceC6615gi.a
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @InterfaceC5670cr1
        public abstract InstallationResponse a();

        @InterfaceC5670cr1
        public abstract Builder b(@InterfaceC5670cr1 TokenResult tokenResult);

        @InterfaceC5670cr1
        public abstract Builder c(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder d(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder e(@InterfaceC5670cr1 ResponseCode responseCode);

        @InterfaceC5670cr1
        public abstract Builder f(@InterfaceC5670cr1 String str);
    }

    /* loaded from: classes3.dex */
    public enum ResponseCode {
        OK,
        BAD_CONFIG
    }

    @InterfaceC5670cr1
    public static Builder a() {
        return new AutoValue_InstallationResponse.Builder();
    }

    @InterfaceC11300zs1
    public abstract TokenResult b();

    @InterfaceC11300zs1
    public abstract String c();

    @InterfaceC11300zs1
    public abstract String d();

    @InterfaceC11300zs1
    public abstract ResponseCode e();

    @InterfaceC11300zs1
    public abstract String f();

    @InterfaceC5670cr1
    public abstract Builder g();
}
