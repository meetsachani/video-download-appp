package com.facebook.ads.androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.X.AbstractC04543y;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.HandlerThreadC0734Fi;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"ToLQMf4zVEPQ4KvEooDgfRDe7yK6oNRK", "K0o48H12GfZKMIt1wQk8mac7vZfrpMfZ", "E5u", "BRaMCvq", "l9UvErrzvq13nAT2kKu87XSUotDZHlU4", "KpcnqVP7VQEeHX003zJg7kklGvYVOXV6", "nWaipra9RnK7e6o7QCyQoP578AoonQfH", "y6ffzf1HkvdiGAu1g8uZUTsw8JywLKMO"};
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC0734Fi A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
            String[] strArr = A06;
            if (strArr[4].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            A06[6] = "JqkQNQrwLqX5JhphVyehfhpUDDUdSiIM";
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{C8077mf.z, C8077mf.x, 31, C8077mf.n, C8077mf.z, C8077mf.m, 7, C8077mf.n, 35, C3307Iz.V, 60, C3307Iz.Z, 54, 48, C3307Iz.Z, 54, 55, C8077mf.n, 48, 60, C4715Xk.i, C3307Iz.Z, 54, C4715Xk.i, C3307Iz.Z, 4, 6, 13, C8077mf.H, 10, 9, 19, C8077mf.H, 50, 52, 51, C3307Iz.Z, 32, 34, 36, C3307Iz.e0, 36, 50, 50, C8077mf.H, 34, C3307Iz.f0, 47, 53, 36, 57, 53, 32, C8077mf.E, 6, 0, 5, 5, C8077mf.D, 7, 1, C8077mf.r, 17, 85, 5, 7, 28, C8077mf.D, 7, 85, 1, C8077mf.D, 85, 52, C3307Iz.X, 60, 85, C8077mf.C, C8077mf.r, 3, C8077mf.r, C8077mf.C, 85, 68, 66, 101, 105, C8077mf.n, C8077mf.m, 8, 13, ED2.a, 48, 58, C3307Iz.d0, 49, 55, 58, 112, 54, ED2.a, C3307Iz.d0, 58, C3307Iz.a0, ED2.a, C3307Iz.d0, 59, 112, 40, C3307Iz.d0, 112, 54, 55, 57, 54, 1, C3307Iz.f0, 59, C3307Iz.d0, 56, 49, C3307Iz.d0, 51, ED2.a, 48, C4715Xk.i, 59, C8077mf.m, C8077mf.C, C8077mf.y, C8077mf.m, 13, C8077mf.z, 31};
        if (A06[6].charAt(20) == 'p') {
            throw new RuntimeException();
        }
        A06[0] = "LdigSr1cvkrlhyQY3m7v5wXMq9EFvMie";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A04) {
                A03 = C5C.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z = false;
            }
        }
        return z;
    }

    static {
        A04();
    }

    public DummySurface(HandlerThreadC0734Fi handlerThreadC0734Fi, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = handlerThreadC0734Fi;
        this.A01 = z;
    }

    public static int A00(Context context) {
        String eglQueryString;
        if (C5C.A02 >= 26 || !(A02(127, 7, 48).equals(C5C.A05) || A02(85, 6, 117).equals(C5C.A06))) {
            if ((C5C.A02 >= 26 || context.getPackageManager().hasSystemFeature(A02(91, 36, 22))) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(A02(0, 25, 27))) {
                if (eglQueryString.contains(A02(25, 27, 9))) {
                    return 1;
                }
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        AbstractC04543y.A08(!z || A05(context));
        return new HandlerThreadC0734Fi().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (C5C.A02 >= 17) {
            return;
        }
        throw new UnsupportedOperationException(A02(52, 33, 61));
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
