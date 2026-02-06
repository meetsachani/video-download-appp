package com.google.android.gms.internal.ads;

import android.os.Build;
import com.facebook.internal.l0;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.InterfaceC5056aJ2;
import o.QC1;

/* loaded from: classes2.dex */
public final class zzfns {
    @InterfaceC5056aJ2
    public static final byte[] c = {C4715Xk.i, 122, C8077mf.u, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, C2638Cg0.o7, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, C2638Cg0.q7, ED2.a, 50, 108, -113, -103, 74};
    @InterfaceC5056aJ2
    public static final byte[] d = {-110, -13, -34, 70, -83, C3307Iz.c0, 97, C8077mf.y, -44, C8077mf.r, C2638Cg0.w7, -125, -28, C2638Cg0.u7, -125, -127, -7, 17, 102, -69, 116, -121, -79, C3307Iz.c0, -13, QC1.w, 58, 55, -29, -108, 95, 83};
    public final byte[] a = d;
    public final byte[] b = c;

    public final boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] a = zzapa.a(file.getAbsolutePath());
            if (a.length == 1) {
                byte[] digest = MessageDigest.getInstance(l0.e).digest(a[0][0].getEncoded());
                if (Arrays.equals(this.b, digest)) {
                    return true;
                }
                if (!"user".equals(Build.TYPE) && Arrays.equals(this.a, digest)) {
                    return true;
                }
                return false;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzaow e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
