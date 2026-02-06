package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* loaded from: classes2.dex */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @InterfaceC5670cr1
        public final /* bridge */ /* synthetic */ Builder f() {
            return this;
        }

        @InterfaceC5670cr1
        public Builder p(@InterfaceC5670cr1 String str) {
            this.a.r(str);
            return this;
        }

        @InterfaceC5670cr1
        public AdManagerAdRequest q() {
            return new AdManagerAdRequest(this, null);
        }

        @InterfaceC5670cr1
        public Builder r() {
            return this;
        }

        @InterfaceC5670cr1
        public Builder s(@InterfaceC5670cr1 String str) {
            this.a.a(str);
            return this;
        }
    }

    public /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    @InterfaceC5670cr1
    public Bundle d() {
        return this.a.e();
    }

    @InterfaceC5670cr1
    public String k() {
        return this.a.j();
    }
}
