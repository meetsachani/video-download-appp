package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.o3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2104o3 implements CJ {
    public static byte[] A02;
    public static final SparseArray<Constructor<? extends CH>> A03;
    public final C1898kT A00;
    public final Executor A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Constructor<? extends CH> A03(Class<?> cls) {
        try {
            return cls.asSubclass(CH.class).getConstructor(C2231q7.class, C1898kT.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(A02(0, 30, 5), e);
        }
    }

    public static void A04() {
        A02 = new byte[]{-66, -23, -15, -24, -26, -23, -37, -34, -33, -20, -102, -35, -23, -24, -19, -18, -20, -17, -35, -18, -23, -20, -102, -25, -29, -19, -19, -29, -24, C2638Cg0.C7, -10, 17, C8077mf.C, 28, C8077mf.y, C8077mf.x, -48, 36, 31, -48, C8077mf.C, C8077mf.H, 35, 36, 17, C8077mf.H, 36, C8077mf.C, 17, 36, C8077mf.y, -48, C8077mf.x, 31, C3307Iz.Z, C8077mf.H, 28, 31, 17, C8077mf.x, C8077mf.y, 34, -48, C8077mf.z, 31, 34, -48, 19, 31, C8077mf.H, 36, C8077mf.y, C8077mf.H, 36, -48, 36, C3307Iz.a0, 32, C8077mf.y, -48, 34, 68, 57, 74, 65, 58, -11, 66, 62, 72, 72, 62, 67, 60, -11, 59, 68, 71, -11, 56, 68, 67, 73, 58, 67, 73, -11, 73, 78, 69, 58, -11, -2, C8077mf.A, 28, C8077mf.H, C8077mf.C, C8077mf.C, C8077mf.B, C8077mf.E, C8077mf.G, C8077mf.p, 13, C2638Cg0.v7, C8077mf.G, 34, C8077mf.C, C8077mf.p, -29, C2638Cg0.v7, C3307Iz.f0, 58, 56, -7, 49, C3307Iz.d0, C3307Iz.f0, 48, C3307Iz.e0, 58, 58, 54, -7, C3307Iz.d0, 47, 62, -7, C3307Iz.d0, 57, 47, C4715Xk.i, 58, 52, 47, 67, -7, 56, 48, 47, 52, C3307Iz.d0, -2, -7, 48, 67, 58, 59, 55, C3307Iz.d0, 68, 48, C4715Xk.i, -7, 62, 58, 64, C4715Xk.i, C3307Iz.f0, 48, -7, 47, C3307Iz.d0, 62, 51, -7, 58, 49, 49, 55, 52, 57, 48, -7, C8077mf.q, C3307Iz.d0, 62, 51, C8077mf.q, 58, 66, 57, 55, 58, C3307Iz.d0, 47, 48, C4715Xk.i, 40, 52, 50, -13, C3307Iz.c0, C3307Iz.Y, 40, 42, C3307Iz.Z, 52, 52, 48, -13, C3307Iz.Y, C3307Iz.a0, 56, -13, C3307Iz.Y, 51, C3307Iz.a0, 55, 52, C3307Iz.f0, C3307Iz.a0, C4715Xk.i, -13, 50, 42, C3307Iz.a0, C3307Iz.f0, C3307Iz.Y, -8, -13, 42, C4715Xk.i, 52, 53, 49, C3307Iz.Y, 62, 42, 55, -13, 56, 52, 58, 55, 40, 42, -13, C3307Iz.e0, 49, 56, -13, 52, C3307Iz.c0, C3307Iz.c0, 49, C3307Iz.f0, 51, 42, -13, 13, 49, 56, 9, 52, 60, 51, 49, 52, C3307Iz.Y, C3307Iz.a0, 42, 55, 87, 99, 97, 34, 90, 85, 87, 89, 86, 99, 99, 95, 34, 85, 88, 103, 34, 85, 98, 88, 102, 99, 93, 88, 108, 34, 97, 89, 88, 93, 85, C3307Iz.Z, 34, 89, 108, 99, 100, 96, 85, 109, 89, 102, 34, 103, 99, 105, 102, 87, 89, 34, 103, 97, 99, 99, 104, 92, 103, 104, 102, 89, 85, 97, 93, 98, 91, 34, 99, 90, 90, 96, 93, 98, 89, 34, 71, 103, 56, 99, 107, 98, 96, 99, 85, 88, 89, 102};
    }

    static {
        A04();
        A03 = A00();
    }

    public C2104o3(C1898kT c1898kT, Executor executor) {
        this.A00 = (C1898kT) AbstractC04543y.A01(c1898kT);
        this.A01 = (Executor) AbstractC04543y.A01(executor);
    }

    public static SparseArray<Constructor<? extends CH>> A00() {
        SparseArray<Constructor<? extends CH>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, A03(Class.forName(A02(130, 77, 86))));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, A03(Class.forName(A02(207, 75, 80))));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, A03(Class.forName(A02(282, 86, 127))));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private CH A01(DownloadRequest downloadRequest, int i) {
        Constructor<? extends CH> constructor = A03.get(i);
        if (constructor != null) {
            try {
                return constructor.newInstance(new C04262u().A00(downloadRequest.A00).A04(downloadRequest.A04).A02(downloadRequest.A01).A05(), this.A00, this.A01);
            } catch (Exception e) {
                throw new IllegalStateException(A02(30, 50, 59) + i, e);
            }
        }
        throw new IllegalStateException(A02(80, 32, 96) + i);
    }

    @Override // com.facebook.ads.redexgen.X.CJ
    public final CH A5M(DownloadRequest downloadRequest) {
        int A0B = C5C.A0B(downloadRequest.A00, downloadRequest.A03);
        switch (A0B) {
            case 0:
            case 1:
            case 2:
                return A01(downloadRequest, A0B);
            case 3:
            default:
                throw new IllegalArgumentException(A02(112, 18, 52) + A0B);
            case 4:
                return new C2099nx(new C04262u().A00(downloadRequest.A00).A02(downloadRequest.A01).A05(), this.A00, this.A01);
        }
    }
}
