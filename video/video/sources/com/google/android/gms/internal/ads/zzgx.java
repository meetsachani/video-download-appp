package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzgx extends zzgh {
    public final int Y;

    public zzgx(zzgl zzglVar, int i, int i2) {
        super(b(2008, 1));
        this.Y = 1;
    }

    public static zzgx a(IOException iOException, zzgl zzglVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && zzfui.a(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new zzgw(iOException, zzglVar);
        }
        return new zzgx(iOException, zzglVar, i2, i);
    }

    public static int b(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzgx(IOException iOException, zzgl zzglVar, int i, int i2) {
        super(iOException, b(i, i2));
        this.Y = i2;
    }

    public zzgx(String str, zzgl zzglVar, int i, int i2) {
        super(str, b(i, i2));
        this.Y = i2;
    }

    public zzgx(String str, @InterfaceC11300zs1 IOException iOException, zzgl zzglVar, int i, int i2) {
        super(str, iOException, b(i, i2));
        this.Y = i2;
    }
}
