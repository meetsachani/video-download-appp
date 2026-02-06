package com.google.firebase.installations;

import com.google.firebase.installations.AutoValue_InstallationTokenResult;
import o.InterfaceC5670cr1;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class InstallationTokenResult {

    @InterfaceC6615gi.a
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @InterfaceC5670cr1
        public abstract InstallationTokenResult a();

        @InterfaceC5670cr1
        public abstract Builder b(@InterfaceC5670cr1 String str);

        @InterfaceC5670cr1
        public abstract Builder c(long j);

        @InterfaceC5670cr1
        public abstract Builder d(long j);
    }

    @InterfaceC5670cr1
    public static Builder a() {
        return new AutoValue_InstallationTokenResult.Builder();
    }

    @InterfaceC5670cr1
    public abstract String b();

    @InterfaceC5670cr1
    public abstract long c();

    @InterfaceC5670cr1
    public abstract long d();

    @InterfaceC5670cr1
    public abstract Builder e();
}
