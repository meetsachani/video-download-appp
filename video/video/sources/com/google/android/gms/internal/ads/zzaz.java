package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C4500Ve2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzaz extends IOException {
    public final boolean X;
    public final int Y;

    public zzaz(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, boolean z, int i) {
        super(str, th);
        this.X = z;
        this.Y = i;
    }

    public static zzaz a(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        return new zzaz(str, th, true, 1);
    }

    public static zzaz b(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th) {
        return new zzaz(str, th, true, 0);
    }

    public static zzaz c(@InterfaceC11300zs1 String str) {
        return new zzaz(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String message = super.getMessage();
        if (message != null) {
            str = message.concat(C4500Ve2.b);
        } else {
            str = "";
        }
        boolean z = this.X;
        int i = this.Y;
        return str + "{contentIsMalformed=" + z + ", dataType=" + i + "}";
    }
}
