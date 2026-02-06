package com.google.android.gms.internal.ads;

import o.C8077mf;

/* loaded from: classes2.dex */
final class zzfob extends zzfny {
    public String a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public byte f;

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny a(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny b(boolean z) {
        this.f = (byte) (this.f | C8077mf.r);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny c(boolean z) {
        this.f = (byte) (this.f | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny d(boolean z) {
        this.c = true;
        this.f = (byte) (this.f | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny e(long j) {
        this.e = 300L;
        this.f = (byte) (this.f | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny f(long j) {
        this.d = 100L;
        this.f = (byte) (this.f | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfny g(boolean z) {
        this.b = z;
        this.f = (byte) (this.f | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfny
    public final zzfnz h() {
        String str;
        if (this.f == 63 && (str = this.a) != null) {
            return new zzfod(str, this.b, this.c, false, this.d, false, this.e, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.f & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.f & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.f & C8077mf.r) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.f & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
