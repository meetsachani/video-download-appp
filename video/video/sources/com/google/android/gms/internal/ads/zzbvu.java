package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzbvu extends zzbvw {
    public final String X;
    public final int Y;

    public zzbvu(String str, int i) {
        this.X = str;
        this.Y = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final int b() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final String c() {
        return this.X;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvu)) {
            zzbvu zzbvuVar = (zzbvu) obj;
            if (Objects.b(this.X, zzbvuVar.X)) {
                if (Objects.b(Integer.valueOf(this.Y), Integer.valueOf(zzbvuVar.Y))) {
                    return true;
                }
            }
        }
        return false;
    }
}
