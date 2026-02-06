package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfqe extends zzfqm {
    public String a;
    public byte b;
    public int c;
    public int d;

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final zzfqm a(boolean z) {
        this.b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final zzfqn b() {
        if (this.b == 1 && this.a != null && this.c != 0 && this.d != 0) {
            return new zzfqg(this.a, false, this.c, null, null, this.d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final zzfqm c(int i) {
        this.c = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final zzfqm d(int i) {
        this.d = 1;
        return this;
    }

    public final zzfqm e(String str) {
        this.a = "";
        return this;
    }
}
