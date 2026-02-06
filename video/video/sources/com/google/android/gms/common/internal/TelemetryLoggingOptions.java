package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    @InterfaceC5670cr1
    public static final TelemetryLoggingOptions Y = a().a();
    @InterfaceC11300zs1
    public final String X;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public static class Builder {
        @InterfaceC11300zs1
        public String a;

        private Builder() {
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public TelemetryLoggingOptions a() {
            return new TelemetryLoggingOptions(this.a, null);
        }

        @InterfaceC5670cr1
        @KeepForSdk
        public Builder b(@InterfaceC11300zs1 String str) {
            this.a = str;
            return this;
        }

        public /* synthetic */ Builder(zaac zaacVar) {
        }
    }

    public /* synthetic */ TelemetryLoggingOptions(String str, zaad zaadVar) {
        this.X = str;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Builder a() {
        return new Builder(null);
    }

    @InterfaceC5670cr1
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.X;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TelemetryLoggingOptions)) {
            return false;
        }
        return Objects.b(this.X, ((TelemetryLoggingOptions) obj).X);
    }

    public final int hashCode() {
        return Objects.c(this.X);
    }
}
