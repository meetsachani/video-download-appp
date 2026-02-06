package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzpl {
    public boolean a;
    public boolean b;
    public boolean c;

    public final zzpl a(boolean z) {
        this.a = true;
        return this;
    }

    public final zzpl b(boolean z) {
        this.b = z;
        return this;
    }

    public final zzpl c(boolean z) {
        this.c = z;
        return this;
    }

    public final zzpn d() {
        if (!this.a && (this.b || this.c)) {
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }
        return new zzpn(this, null);
    }
}
