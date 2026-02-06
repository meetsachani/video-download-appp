package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class ApiKey<O extends Api.ApiOptions> {
    public final int a;
    public final Api<O> b;
    @InterfaceC11300zs1
    public final O c;
    @InterfaceC11300zs1
    public final String d;

    public ApiKey(Api<O> api, @InterfaceC11300zs1 O o2, @InterfaceC11300zs1 String str) {
        this.b = api;
        this.c = o2;
        this.d = str;
        this.a = Objects.c(api, o2, str);
    }

    @InterfaceC5670cr1
    public static <O extends Api.ApiOptions> ApiKey<O> a(@InterfaceC5670cr1 Api<O> api, @InterfaceC11300zs1 O o2, @InterfaceC11300zs1 String str) {
        return new ApiKey<>(api, o2, str);
    }

    @InterfaceC5670cr1
    public final String b() {
        return this.b.d();
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        if (!Objects.b(this.b, apiKey.b) || !Objects.b(this.c, apiKey.c) || !Objects.b(this.d, apiKey.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}
