package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zad {
    public final Uri a;

    public zad(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        return Objects.b(((zad) obj).a, this.a);
    }

    public final int hashCode() {
        return Objects.c(this.a);
    }
}
