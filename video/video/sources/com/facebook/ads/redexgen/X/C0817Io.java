package com.facebook.ads.redexgen.X;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C4731Xo;
import o.C5588cW;
import o.C8077mf;
import o.C8206nB;
import o.ED2;
import o.VN2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.Io  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0817Io {
    public static byte[] A0p;
    public static String[] A0q = {"OEIbbTfz9Gy2QPZJ4z5Vw", "FnBQgCqHaiwiLpzppV61TScSRwvWWbyQ", "lhw151GRabUj4MWW", "UfmG6su3PUQ09WKpaYJZnWqY2jTnsIjF", "3xkcsKvZQCBLKFsErtBjnZACEf0cQH4k", "sFlP3vQMUMetLm2UJmahj", "kHqDQLP2yFWUZolGjug5L", "bkJ1oyWHbNg3F4t8gWvtnFc1AhojVjRe"};
    public int A0I;
    public int A0N;
    public int A0Q;
    public int A0R;
    public int A0V;
    public DrmInitData A0Z;
    public C0778Hb A0a;
    public InterfaceC0780Hd A0b;
    public C0781He A0c;
    public String A0d;
    public String A0e;
    public boolean A0g;
    public boolean A0i;
    public byte[] A0j;
    public byte[] A0k;
    public byte[] A0m;
    public int A0n;
    public int A0W = -1;
    public int A0M = -1;
    public int A0L = -1;
    public int A0J = -1;
    public int A0K = 0;
    public int A0S = -1;
    public float A0A = 0.0f;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public byte[] A0l = null;
    public int A0U = -1;
    public boolean A0h = false;
    public int A0G = -1;
    public int A0H = -1;
    public int A0F = -1;
    public int A0O = 1000;
    public int A0P = 200;
    public float A06 = -1.0f;
    public float A07 = -1.0f;
    public float A04 = -1.0f;
    public float A05 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A0B = -1.0f;
    public float A0C = -1.0f;
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public int A0E = 1;
    public int A0D = -1;
    public int A0T = 8000;
    public long A0X = 0;
    public long A0Y = 0;
    public boolean A0f = true;
    public String A0o = A03(1067, 3, 26);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<String, List<byte[]>> A02(C04774v c04774v) throws C3K {
        try {
            c04774v.A0g(16);
            long A0O = c04774v.A0O();
            if (A0O == 1482049860) {
                return new Pair<>(A03(1117, 10, 32), null);
            }
            if (A0O == 859189832) {
                return new Pair<>(A03(1088, 10, 2), null);
            }
            int i = (A0O > 826496599L ? 1 : (A0O == 826496599L ? 0 : -1));
            if (A0q[1].charAt(11) != 'i') {
                throw new RuntimeException();
            }
            A0q[2] = "JoNevXQ";
            if (i != 0) {
                AbstractC04624g.A07(A03(312, 17, 46), A03(492, 51, 65));
                return new Pair<>(A03(1189, 15, 45), null);
            }
            byte[] A0l = c04774v.A0l();
            for (int A09 = c04774v.A09() + 20; A09 < A0l.length - 4; A09++) {
                if (A0l[A09] == 0 && A0l[A09 + 1] == 0 && A0l[A09 + 2] == 1 && A0l[A09 + 3] == 15) {
                    return new Pair<>(A03(1179, 10, 80), Collections.singletonList(Arrays.copyOfRange(A0l, A09, A0l.length)));
                }
            }
            throw C3K.A01(A03(267, 45, 108), null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C3K.A01(A03(C10997yd1.t1, 33, 80), null);
        }
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 125);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0p = new byte[]{13, -1, 50, 68, 83, 83, 72, 77, 70, -1, 76, 72, 76, 68, 51, 88, 79, 68, -1, 83, 78, -1, -47, -17, -47, -47, -45, -43, -13, -43, -41, C2638Cg0.u7, -2, 28, 1, 17, C8077mf.r, 47, 77, 50, 66, 65, C8077mf.G, 51, 70, 62, 64, 51, 65, 65, -6, C8077mf.B, -3, 13, C8077mf.n, -24, 5, 8, C8077mf.n, C8077mf.n, 5, -2, C8077mf.n, C8077mf.n, 0, C8077mf.H, 4, 0, 2, -14, C8077mf.z, 52, C8077mf.E, C3307Iz.V, C8077mf.z, C8077mf.B, 9, C3307Iz.Z, C8077mf.y, C8077mf.B, 13, C8077mf.q, -9, C8077mf.x, -6, C2638Cg0.s7, -29, -47, -44, C2638Cg0.v7, C2638Cg0.x7, -77, -48, -73, 3, C3307Iz.V, C8077mf.q, C8077mf.y, -15, 3, 5, C8077mf.q, -13, 17, 1, 2, 7, 5, -18, C8077mf.n, -3, -16, -6, -36, -13, -7, -4, -18, 1, -36, -10, -14, -14, -14, 19, 49, 34, C8077mf.y, 31, 1, C8077mf.E, 32, C3307Iz.Y, 1, C8077mf.x, C8077mf.E, C8077mf.C, -34, -4, -19, -32, -22, -52, -26, -21, -15, -52, -23, -26, -15, 59, 89, 78, 76, 79, ED2.a, 66, 62, C8077mf.A, 53, C3307Iz.d0, C3307Iz.X, 40, C8077mf.B, 31, C3307Iz.a0, C8077mf.u, ED2.a, ED2.a, 60, ED2.a, -19, C4715Xk.i, C3307Iz.f0, ED2.a, 64, 54, 59, 52, -19, 19, 60, 66, ED2.a, C8077mf.r, C8077mf.r, -19, C4715Xk.i, ED2.a, 54, 67, C3307Iz.f0, 65, 50, -19, 49, C3307Iz.f0, 65, C3307Iz.f0, -4, C3307Iz.a0, C3307Iz.a0, C3307Iz.Y, C3307Iz.a0, -41, C3307Iz.Z, C8077mf.B, C3307Iz.a0, 42, 32, C3307Iz.X, C8077mf.H, -41, 4, 10, -26, -8, -6, 4, -41, C8077mf.D, C3307Iz.Y, C8077mf.E, 28, C8077mf.D, -41, C3307Iz.Z, C3307Iz.a0, 32, C3307Iz.e0, C8077mf.B, C3307Iz.c0, 28, -19, C8077mf.D, C8077mf.D, C8077mf.A, C8077mf.D, -56, C8077mf.B, 9, C8077mf.D, C8077mf.E, 17, C8077mf.z, C8077mf.q, -56, C8077mf.H, C8077mf.A, C8077mf.D, 10, 17, C8077mf.E, -56, C8077mf.m, C8077mf.A, C8077mf.n, 13, C8077mf.m, -56, C8077mf.B, C8077mf.D, 17, C8077mf.H, 9, 28, 13, 47, 74, 82, 85, 78, 77, 9, 93, 88, 9, 79, 82, 87, 77, 9, 47, 88, 94, 91, C3307Iz.d0, C3307Iz.d0, 9, ED2.a, C3307Iz.d0, C8077mf.D, 9, 82, 87, 82, 93, 82, 74, 85, 82, 99, 74, 93, 82, 88, 87, 9, 77, 74, 93, 74, -8, C8077mf.n, 31, C8077mf.G, C8077mf.D, C8077mf.H, C8077mf.z, C8077mf.n, -16, 35, 31, C8077mf.G, C8077mf.n, C8077mf.p, 31, C8077mf.D, C8077mf.G, C3307Iz.Z, 67, 77, 77, 67, 72, 65, -6, C8077mf.G, 73, 62, ED2.a, C4715Xk.i, 42, 76, 67, 80, 59, 78, ED2.a, -6, 64, 73, 76, -6, C4715Xk.i, 73, 62, ED2.a, C4715Xk.i, -6, -35, -2, -3, -68, -33, -46, -36, -81, -36, -30, -66, -48, -46, -36, -81, -8, 2, -81, 4, -3, 2, 4, -1, -1, -2, 1, 3, -12, -13, -67, -81, -30, -12, 3, 3, -8, -3, -10, -81, -4, -8, -4, -12, -29, 8, -1, -12, -81, 3, -2, -81, 3, C8077mf.q, -12, 6, -14, 3, 5, -14, 78, 90, 67, ED2.a, 72, 81, 42, 75, 66, 78, 36, 48, C3307Iz.X, C8077mf.z, C3307Iz.a0, C3307Iz.X, 0, C8077mf.u, 36, 36, 1, 13, 2, -13, 6, 2, -35, 3, 2, -12, -26, 53, 65, 54, C3307Iz.Z, 58, 54, 17, 57, C3307Iz.Z, 36, 56, 54, 54, 62, 74, 65, 58, C3307Iz.e0, 62, 64, C3307Iz.e0, C3307Iz.X, 62, 53, 72, 64, 53, 51, 68, 53, 52, -16, C8077mf.G, C8077mf.C, C8077mf.G, C8077mf.y, -16, 68, 73, 64, 53, -2, 19, C3307Iz.d0, C3307Iz.a0, C3307Iz.d0, C3307Iz.e0, 53, C3307Iz.d0, -34, 4, C3307Iz.e0, 51, 48, 1, 1, -20, -34, 17, 35, 50, 50, C3307Iz.Z, C3307Iz.d0, C3307Iz.X, -34, C3307Iz.c0, C3307Iz.Z, C3307Iz.c0, 35, C8077mf.u, 55, C3307Iz.f0, 35, -34, 50, C3307Iz.e0, -34, 52, C3307Iz.Z, 34, 35, C3307Iz.e0, -19, 54, -21, 51, C3307Iz.d0, C3307Iz.a0, C3307Iz.d0, C3307Iz.e0, 53, C3307Iz.d0, 4, C8077mf.G, C3307Iz.V, C8077mf.x, C8077mf.u, C8077mf.H, C8077mf.z, C8077mf.G, C8077mf.B, C3307Iz.a0, C8077mf.x, 19, C2638Cg0.A7, C8077mf.u, C8077mf.H, 19, C8077mf.x, C8077mf.u, C2638Cg0.A7, C8077mf.B, 19, C8077mf.x, C8077mf.G, 35, C8077mf.B, C8077mf.y, C8077mf.B, C8077mf.x, C3307Iz.V, -35, 78, 103, 108, 110, 105, 105, 104, 107, 109, 94, 93, C8077mf.C, 73, 60, 70, C8077mf.C, 91, 98, 109, C8077mf.C, 93, 94, 105, 109, 97, 51, C8077mf.C, 50, 75, 80, 82, 77, 77, 76, 79, 81, 66, 65, -3, ED2.a, 70, 68, -3, 66, 75, 65, 70, 62, 75, -3, C3307Iz.e0, 32, 42, -3, ED2.a, 70, 81, -3, 65, 66, 77, 81, 69, C8077mf.A, -3, -8, 17, C8077mf.z, C8077mf.B, 19, 19, C8077mf.u, C8077mf.y, C8077mf.A, 8, 7, C2638Cg0.r7, 9, C8077mf.q, C8077mf.u, 4, C8077mf.A, C8077mf.n, 17, 10, C2638Cg0.r7, 19, C8077mf.u, C8077mf.n, 17, C8077mf.A, C2638Cg0.r7, -13, -26, -16, C2638Cg0.r7, 5, C8077mf.n, C8077mf.A, C2638Cg0.r7, 7, 8, 19, C8077mf.A, C8077mf.m, -35, C2638Cg0.r7, 55, 80, 85, 87, 82, 82, 81, 84, 86, 71, 70, 2, 78, 75, 86, 86, 78, 71, 2, 71, 80, 70, 75, 67, 80, 2, 50, C3307Iz.X, 47, 2, 68, 75, 86, 2, 70, 71, 82, 86, 74, 28, 2, -22, -13, -43, -22, C2638Cg0.s7, -3, 6, -12, -9, -20, -18, C2638Cg0.E7, C8077mf.z, 31, 13, C8077mf.r, 5, 7, -12, -17, 9, 19, C8077mf.q, -17, 1, C8077mf.r, 34, C3307Iz.c0, C8077mf.C, 28, 17, 19, 0, -5, C8077mf.y, 31, C8077mf.E, -5, 13, 31, 28, -41, -32, C2638Cg0.z7, -47, C2638Cg0.t7, -56, -75, -80, C2638Cg0.w7, -44, -48, -80, C2638Cg0.q7, -41, -60, 10, 19, 1, 4, -7, -5, -24, -29, -3, 7, 3, -29, 7, 4, C8077mf.E, 36, C8077mf.u, C8077mf.y, 10, C8077mf.n, 13, -12, C8077mf.p, C8077mf.B, C8077mf.x, -12, 13, 10, C8077mf.E, 8, C4715Xk.i, 70, 52, 58, C8077mf.z, C4715Xk.i, C3307Iz.e0, 62, C8077mf.z, C3307Iz.e0, 54, 60, 57, 42, 42, 51, 60, 49, C3307Iz.X, 34, C3307Iz.d0, 47, C8077mf.H, C8077mf.n, C8077mf.y, C8077mf.n, 6, -18, 10, 19, 10, 4, -19, C8077mf.q, C8077mf.H, C8077mf.H, C8077mf.D, C8077mf.A, 17, C8077mf.q, 34, C8077mf.A, C8077mf.G, 28, -35, C8077mf.u, 36, C8077mf.r, C3307Iz.V, 35, C8077mf.r, C3307Iz.V, C3307Iz.e0, 60, 60, 56, 53, 47, C3307Iz.e0, 64, 53, 59, 58, -5, 60, 51, ED2.a, 4, 19, 19, C8077mf.q, C8077mf.n, 6, 4, C8077mf.A, C8077mf.n, C8077mf.u, 17, -46, C8077mf.C, C8077mf.u, 5, C8077mf.z, C8077mf.B, 5, 31, C3307Iz.f0, C3307Iz.f0, 42, C3307Iz.Z, C3307Iz.V, 31, 50, C3307Iz.Z, C3307Iz.e0, C3307Iz.d0, -19, 54, -21, 49, 51, 32, 48, C3307Iz.Z, C3307Iz.f0, 40, 60, C3307Iz.c0, 48, 54, -10, 40, 42, -6, 9, C8077mf.G, C8077mf.n, 17, C8077mf.A, -41, 13, 9, C8077mf.m, -37, C8077mf.r, 36, 19, C8077mf.B, C8077mf.H, -34, C8077mf.y, C8077mf.E, C8077mf.r, C8077mf.u, 75, 95, 78, 83, 89, C8077mf.C, 87, 90, C8077mf.H, 75, C8077mf.A, 86, 75, 94, 87, -3, 17, 0, 5, C8077mf.m, C2638Cg0.x7, 9, C8077mf.n, 1, 3, C8077mf.m, 31, C8077mf.p, 19, C8077mf.C, C2638Cg0.E7, C8077mf.A, C8077mf.D, C8077mf.q, 17, -41, -10, -36, -7, 13, -4, 1, 7, C2638Cg0.u7, 7, 8, 13, C8077mf.m, 70, 90, 73, 78, 84, C8077mf.x, 87, 70, 92, -17, 3, 
        -14, -9, -3, -67, 2, 0, 3, -13, -69, -10, -14, 76, 96, 79, 84, 90, C8077mf.D, 97, 89, 79, C8077mf.C, 79, 95, 94, 47, 67, 50, 55, C4715Xk.i, -3, 68, 60, 50, -4, 50, 66, 65, -4, 54, 50, C8077mf.u, C3307Iz.Y, C8077mf.y, C8077mf.D, 32, -32, C3307Iz.Z, 32, 35, 19, C8077mf.D, 36, C3307Iz.c0, ED2.a, C3307Iz.f0, 51, 57, -7, 66, -9, ED2.a, 56, 53, 56, 57, 65, 56, -4, 5, -2, 6, -9, 10, 6, C2638Cg0.p7, 8, 6, 6, 74, 59, 78, 74, 5, 78, 3, 73, 73, 55, -11, -24, -29, -28, -18, -82, -78, -26, -17, -17, 47, 34, C8077mf.G, C8077mf.H, 40, -24, C8077mf.D, 47, -23, -22, 66, 53, 48, 49, 59, -5, C3307Iz.e0, 66, 47, 19, 6, 1, 2, C8077mf.n, -52, 1, 6, 19, C8077mf.y, 17, 4, -1, 0, 10, C2638Cg0.w7, -1, 10, 7, -3, C8077mf.x, -56, 17, 4, C8077mf.p, 4, 10, 9, C8077mf.z, 9, 4, 5, C8077mf.q, C2638Cg0.A7, 8, 5, C8077mf.z, 3, C3307Iz.X, C8077mf.B, 19, C8077mf.x, C8077mf.H, -34, 28, 31, -29, C3307Iz.X, -36, C8077mf.x, 34, 98, 85, 80, 81, 91, C8077mf.E, 89, 92, 81, 83, C8077mf.H, 67, 54, 49, 50, 60, -4, 68, 67, 48, -2, 32, 19, C8077mf.p, C8077mf.q, C8077mf.C, C2638Cg0.E7, 34, -41, 31, C8077mf.B, C8077mf.y, C8077mf.B, C8077mf.C, C3307Iz.V, C8077mf.B, C3307Iz.c0, C8077mf.H, C8077mf.C, C8077mf.D, 36, -28, C3307Iz.e0, -30, C3307Iz.c0, 35, C8077mf.C, -29, 36, 35, -25, -29, C3307Iz.c0, C3307Iz.X, -19, 93, 80, 75, 76, 86, C8077mf.z, 95, C8077mf.x, 93, 85, 75, C8077mf.y, 86, 85, C8077mf.C, C8077mf.y, 93, 87, 32};
    }

    static {
        A07();
    }

    public static List<byte[]> A05(byte[] bArr) throws C3K {
        String A03 = A03(233, 34, 43);
        try {
            if (bArr[0] == 2) {
                int vorbisInfoLength = 1;
                int i = 0;
                while ((bArr[vorbisInfoLength] & 255) == 255) {
                    i += 255;
                    vorbisInfoLength++;
                }
                int i2 = vorbisInfoLength + 1;
                int i3 = i + (bArr[vorbisInfoLength] & 255);
                int offset = 0;
                while ((bArr[i2] & 255) == 255) {
                    offset += 255;
                    i2++;
                }
                int vorbisInfoLength2 = i2 + 1;
                int offset2 = offset + (bArr[i2] & 255);
                if (bArr[vorbisInfoLength2] == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, vorbisInfoLength2, bArr2, 0, i3);
                    int vorbisInfoLength3 = vorbisInfoLength2 + i3;
                    if (bArr[vorbisInfoLength3] == 3) {
                        int vorbisInfoLength4 = vorbisInfoLength3 + offset2;
                        if (bArr[vorbisInfoLength4] == 5) {
                            byte[] bArr3 = new byte[bArr.length - vorbisInfoLength4];
                            System.arraycopy(bArr, vorbisInfoLength4, bArr3, 0, bArr.length - vorbisInfoLength4);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw C3K.A01(A03, null);
                    }
                    throw C3K.A01(A03, null);
                }
                throw C3K.A01(A03, null);
            }
            throw C3K.A01(A03, null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C3K.A01(A03, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNull({"output"})
    public void A06() {
        AbstractC04543y.A01(this.A0b);
    }

    public static boolean A09(C04774v c04774v) throws C3K {
        try {
            int A0G = c04774v.A0G();
            if (A0G == 1) {
                return true;
            }
            if (A0G == 65534) {
                c04774v.A0f(24);
                int formatTag = (c04774v.A0P() > MatroskaExtractor.A08().getMostSignificantBits() ? 1 : (c04774v.A0P() == MatroskaExtractor.A08().getMostSignificantBits() ? 0 : -1));
                if (formatTag == 0) {
                    int formatTag2 = (c04774v.A0P() > MatroskaExtractor.A08().getLeastSignificantBits() ? 1 : (c04774v.A0P() == MatroskaExtractor.A08().getLeastSignificantBits() ? 0 : -1));
                    if (formatTag2 == 0) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C3K.A01(A03(199, 34, 58), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MetaExoPlayerCustomization("Removed opus check as it breaks some 360 files")
    public boolean A0B(boolean z) {
        return this.A0N > 0;
    }

    private byte[] A0C() {
        if (this.A06 != -1.0f) {
            int i = (this.A07 > (-1.0f) ? 1 : (this.A07 == (-1.0f) ? 0 : -1));
            if (A0q[2].length() != 25) {
                String[] strArr = A0q;
                strArr[6] = "HGnETyIhtjZXJxyU1T6j8";
                strArr[0] = "bCjehM63cEytRPEEQFxd2";
                if (i == 0 || this.A04 == -1.0f || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f) {
                    return null;
                }
                int i2 = (this.A0B > (-1.0f) ? 1 : (this.A0B == (-1.0f) ? 0 : -1));
                if (A0q[7].charAt(7) != '5') {
                    String[] strArr2 = A0q;
                    strArr2[6] = "JEOA6svQlcm533p1kymyr";
                    strArr2[0] = "xcQgG7qgeuJwHZcHlhioj";
                    if (i2 == 0) {
                        return null;
                    }
                } else {
                    A0q[2] = "jAXoTae2Kk";
                    if (i2 == 0) {
                        return null;
                    }
                }
                if (this.A0C == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
                    return null;
                }
                byte[] bArr = new byte[25];
                ByteBuffer hdrStaticInfo = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                hdrStaticInfo.put((byte) 0);
                hdrStaticInfo.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A0B * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) ((this.A0C * 50000.0f) + 0.5f));
                hdrStaticInfo.putShort((short) (this.A00 + 0.5f));
                hdrStaticInfo.putShort((short) (this.A01 + 0.5f));
                hdrStaticInfo.putShort((short) this.A0O);
                hdrStaticInfo.putShort((short) this.A0P);
                return bArr;
            }
            throw new RuntimeException();
        }
        return null;
    }

    @EnsuresNonNull({"codecPrivate"})
    private byte[] A0D(String str) throws C3K {
        if (this.A0j != null) {
            byte[] bArr = this.A0j;
            if (A0q[1].charAt(11) != 'i') {
                throw new RuntimeException();
            }
            A0q[2] = "piNmNCdUWkr";
            return bArr;
        }
        throw C3K.A01(A03(329, 31, 93) + str, null);
    }

    @RequiresNonNull({"output"})
    public final void A0E() {
        if (this.A0c != null) {
            C0781He c0781He = this.A0c;
            InterfaceC0780Hd interfaceC0780Hd = this.A0b;
            String[] strArr = A0q;
            if (strArr[6].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0q;
            strArr2[3] = "E7jv121Xgp0U6ziYD0QsnQRL0Byqc4aj";
            strArr2[4] = "tGwzWQC5dBvo0sMjKwRXnFk53sqcL924";
            c0781He.A05(interfaceC0780Hd, this.A0a);
        }
    }

    public final void A0F() {
        if (this.A0c != null) {
            this.A0c.A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0586, code lost:
        if (r11 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x058a, code lost:
        r0 = r19.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x05c9, code lost:
        if (r10.equals(r3) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x05d9, code lost:
        if (A03(1070, 8, 21).equals(r3) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x05e9, code lost:
        if (A03(874, 18, 38).equals(r3) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x05f9, code lost:
        if (A03(859, 15, 79).equals(r3) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0609, code lost:
        if (A03(840, 19, 49).equals(r3) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x061e, code lost:
        if (r10.equals(r3) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x08ee, code lost:
        throw com.facebook.ads.redexgen.X.C3K.A01(A03(471, 21, 83), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0434, code lost:
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0440, code lost:
        if (com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor.A07().containsKey(r19.A0e) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0442, code lost:
        r8.A0z(r19.A0e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0447, code lost:
        r1 = r8.A0g(r21).A11(r3).A0h(r5).A10(r19.A0o).A0n(r9).A12(r2).A0w(r4).A0u(r19.A0Z).A14();
        r19.A0b = r20.AKS(r19.A0R, r10);
        r19.A0b.A6e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0480, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0488, code lost:
        if (r11 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x04b3, code lost:
        if (r11 == (-1)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04b5, code lost:
        r0 = r19.A0M;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
    @EnsuresNonNull({"this.output"})
    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(HA ha, int i) throws C3K {
        char c;
        String A03;
        int i2;
        int i3;
        int i4;
        String str;
        int maxInputSize;
        H6 A00;
        int i5 = -1;
        int i6 = -1;
        List<byte[]> list = null;
        String codecs = null;
        String str2 = this.A0d;
        switch (str2.hashCode()) {
            case -2095576542:
                if (str2.equals(A03(733, 14, 67))) {
                    c = 6;
                    String A032 = A03(0, 22, 98);
                    String A033 = A03(312, 17, 46);
                    switch (c) {
                        case 0:
                            A03 = A03(1204, 19, 56);
                            break;
                        case 1:
                            A03 = A03(1223, 19, 106);
                            break;
                        case 2:
                            A03 = A03(1098, 10, 60);
                            break;
                        case 3:
                            A03 = A03(1168, 11, 111);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            A03 = A03(1155, 13, 50);
                            if (this.A0j != null) {
                                list = Collections.singletonList(this.A0j);
                                break;
                            } else {
                                list = null;
                                break;
                            }
                        case 7:
                            A03 = A03(1108, 9, 79);
                            C0772Gv A002 = C0772Gv.A00(new C04774v(A0D(this.A0d)));
                            list = A002.A05;
                            this.A0Q = A002.A02;
                            codecs = A002.A04;
                            break;
                        case '\b':
                            A03 = A03(1145, 10, 35);
                            HL A003 = HL.A00(new C04774v(A0D(this.A0d)));
                            list = A003.A08;
                            this.A0Q = A003.A05;
                            codecs = A003.A07;
                            break;
                        case '\t':
                            Pair<String, List<byte[]>> A02 = A02(new C04774v(A0D(this.A0d)));
                            A03 = (String) A02.first;
                            list = (List) A02.second;
                            break;
                        case '\n':
                            A03 = A03(1189, 15, 45);
                            break;
                        case 11:
                            A03 = A03(1040, 12, 52);
                            i5 = 8192;
                            list = A05(A0D(this.A0d));
                            break;
                        case '\f':
                            A03 = A03(979, 10, 27);
                            i5 = C10997yd1.W0;
                            list = new ArrayList<>(3);
                            list.add(A0D(this.A0d));
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0X).array());
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0Y).array());
                            break;
                        case '\r':
                            A03 = A03(941, 15, 109);
                            list = Collections.singletonList(A0D(this.A0d));
                            C0763Gm A034 = AbstractC0764Gn.A03(this.A0j);
                            this.A0T = A034.A01;
                            this.A0E = A034.A00;
                            codecs = A034.A02;
                            break;
                        case 14:
                            A03 = A03(966, 13, 45);
                            i5 = 4096;
                            break;
                        case 15:
                            A03 = A03(956, 10, 31);
                            i5 = 4096;
                            break;
                        case 16:
                            A03 = A03(912, 9, 74);
                            break;
                        case 17:
                            A03 = A03(921, 10, 43);
                            break;
                        case 18:
                            A03 = A03(998, 13, 17);
                            this.A0c = new C0781He();
                            break;
                        case 19:
                        case 20:
                            A03 = A03(1011, 13, 110);
                            break;
                        case 21:
                            A03 = A03(1024, 16, 81);
                            break;
                        case 22:
                            A03 = A03(931, 10, 50);
                            list = Collections.singletonList(A0D(this.A0d));
                            break;
                        case 23:
                            A03 = A03(989, 9, 104);
                            if (A09(new C04774v(A0D(this.A0d)))) {
                                i6 = C5C.A03(this.A0D);
                                if (i6 == 0) {
                                    i6 = -1;
                                    A03 = A03(1052, 15, 77);
                                    AbstractC04624g.A07(A033, A03(573, 27, 124) + this.A0D + A032 + A03);
                                    break;
                                }
                            } else {
                                A03 = A03(1052, 15, 77);
                                AbstractC04624g.A07(A033, A03(360, 51, 18) + A03);
                                break;
                            }
                            break;
                        case 24:
                            A03 = A03(989, 9, 104);
                            i6 = C5C.A03(this.A0D);
                            if (i6 == 0) {
                                i6 = -1;
                                A03 = A03(1052, 15, 77);
                                AbstractC04624g.A07(A033, A03(680, 41, 101) + this.A0D + A032 + A03);
                                break;
                            }
                            break;
                        case 25:
                            A03 = A03(989, 9, 104);
                            if (this.A0D == 8) {
                                i6 = 3;
                                break;
                            } else if (this.A0D == 16) {
                                i6 = 268435456;
                                break;
                            } else {
                                i6 = -1;
                                A03 = A03(1052, 15, 77);
                                AbstractC04624g.A07(A033, A03(600, 38, 96) + this.A0D + A032 + A03);
                                break;
                            }
                        case 26:
                            A03 = A03(989, 9, 104);
                            if (this.A0D == 32) {
                                i6 = 4;
                                break;
                            } else {
                                i6 = -1;
                                A03 = A03(1052, 15, 77);
                                AbstractC04624g.A07(A033, A03(638, 42, 38) + this.A0D + A032 + A03);
                                break;
                            }
                        case 27:
                            A03 = A03(892, 20, 65);
                            break;
                        case 28:
                            A03 = A03(1078, 10, 89);
                            list = C1840jW.A03(MatroskaExtractor.A0N(), A0D(this.A0d));
                            break;
                        case 29:
                            int maxInputSize2 = A0q[2].length();
                            if (maxInputSize2 != 25) {
                                A0q[2] = "DXVHiJQ";
                                A03 = A03(1070, 8, 21);
                                break;
                            }
                            throw new RuntimeException();
                        case 30:
                            A03 = A03(874, 18, 38);
                            list = C1840jW.A03(A0D(this.A0d));
                            break;
                        case 31:
                            A03 = A03(859, 15, 79);
                            break;
                        case ' ':
                            A03 = A03(840, 19, 49);
                            byte[] bArr = new byte[4];
                            System.arraycopy(A0D(this.A0d), 0, bArr, 0, 4);
                            list = C1840jW.A03(bArr);
                            break;
                        default:
                            throw C3K.A01(A03(543, 30, 50), null);
                    }
                    if (this.A0k != null && (A00 = H6.A00(new C04774v(this.A0k))) != null) {
                        codecs = A00.A02;
                        A03 = A03(1127, 18, 30);
                    }
                    int i7 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p = new C04212p();
                    if (C3J.A0C(A03)) {
                        i2 = 1;
                        c04212p.A0b(this.A0E).A0m(this.A0T).A0i(i6);
                    } else if (C3J.A0F(A03)) {
                        i2 = 2;
                        if (this.A0K == 0) {
                            if (this.A0L == -1) {
                                i3 = this.A0W;
                            } else {
                                i3 = this.A0L;
                            }
                            this.A0L = i3;
                            int i8 = this.A0J;
                            String[] strArr = A0q;
                            String str3 = strArr[6];
                            String str4 = strArr[0];
                            int maxInputSize3 = str3.length();
                            if (maxInputSize3 == str4.length()) {
                                String[] strArr2 = A0q;
                                strArr2[6] = "0fOwLIWZXoYdZ03NOI0PL";
                                strArr2[0] = "X0ylGKF789dugCDfRJBOw";
                                break;
                            }
                            this.A0J = i4;
                        }
                        float f = -1.0f;
                        if (this.A0L != -1 && this.A0J != -1) {
                            int maxInputSize4 = this.A0M;
                            float f2 = maxInputSize4 * this.A0L;
                            int maxInputSize5 = this.A0W;
                            f = f2 / (maxInputSize5 * this.A0J);
                        }
                        ColorInfo colorInfo = null;
                        if (this.A0h) {
                            byte[] A0C = A0C();
                            int i9 = this.A0G;
                            int maxInputSize6 = this.A0F;
                            colorInfo = new ColorInfo(i9, maxInputSize6, this.A0H, A0C);
                        }
                        int i10 = -1;
                        if (this.A0e != null && MatroskaExtractor.A07().containsKey(this.A0e)) {
                            i10 = ((Integer) MatroskaExtractor.A07().get(this.A0e)).intValue();
                        }
                        if (this.A0S == 0 && Float.compare(this.A0A, 0.0f) == 0 && Float.compare(this.A08, 0.0f) == 0) {
                            if (Float.compare(this.A09, 0.0f) == 0) {
                                i10 = 0;
                            } else if (Float.compare(this.A08, 90.0f) == 0) {
                                i10 = 90;
                            } else if (Float.compare(this.A08, -180.0f) == 0 || Float.compare(this.A08, 180.0f) == 0) {
                                i10 = 180;
                            } else if (Float.compare(this.A08, -90.0f) == 0) {
                                i10 = C4731Xo.d1;
                            }
                        }
                        c04212p.A0r(this.A0W).A0f(this.A0M).A0Y(f).A0l(i10).A13(this.A0l).A0o(this.A0U).A0t(colorInfo);
                    } else {
                        if (!A03(892, 20, 65).equals(A03)) {
                            String A035 = A03(1078, 10, 89);
                            int maxInputSize7 = A0q[2].length();
                            if (maxInputSize7 == 25) {
                                String[] strArr3 = A0q;
                                strArr3[3] = "uzACjMnIRDWkXmLtS6v7ngwgE1QfSENz";
                                strArr3[4] = "s3rMIZ4lTCXi8DcRU7rrn7aYp4jB1V6f";
                                break;
                            } else {
                                String[] strArr4 = A0q;
                                strArr4[6] = "OrIo36JggGcBMG1gQIgml";
                                strArr4[0] = "fZspUpTcTDNyw6GYW1xYu";
                                break;
                            }
                        }
                        i2 = 3;
                    }
                    String str5 = this.A0e;
                    String[] strArr5 = A0q;
                    String str6 = strArr5[3];
                    str = strArr5[4];
                    maxInputSize = str6.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                        A0q[5] = "geYInneqHCN24sLMYNtYBj6RIxMbJ8";
                        break;
                    }
                }
                c = 65535;
                String A0322 = A03(0, 22, 98);
                String A0332 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                    codecs = A00.A02;
                    A03 = A03(1127, 18, 30);
                }
                int i72 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52 = this.A0e;
                String[] strArr52 = A0q;
                String str62 = strArr52[3];
                str = strArr52[4];
                maxInputSize = str62.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -2095575984:
                if (str2.equals(A03(777, 14, 55))) {
                    c = 4;
                    String A03222 = A03(0, 22, 98);
                    String A03322 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522 = this.A0e;
                    String[] strArr522 = A0q;
                    String str622 = strArr522[3];
                    str = strArr522[4];
                    maxInputSize = str622.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222 = A03(0, 22, 98);
                String A033222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222 = this.A0e;
                String[] strArr5222 = A0q;
                String str6222 = strArr5222[3];
                str = strArr5222[4];
                maxInputSize = str6222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -1985379776:
                if (str2.equals(A03(94, 8, 69))) {
                    c = 23;
                    String A0322222 = A03(0, 22, 98);
                    String A0332222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222 = this.A0e;
                    String[] strArr52222 = A0q;
                    String str62222 = strArr52222[3];
                    str = strArr52222[4];
                    maxInputSize = str62222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222 = A03(0, 22, 98);
                String A03322222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222 = this.A0e;
                String[] strArr522222 = A0q;
                String str622222 = strArr522222[3];
                str = strArr522222[4];
                maxInputSize = str622222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -1784763192:
                if (str2.equals(A03(150, 8, 125))) {
                    c = 18;
                    String A032222222 = A03(0, 22, 98);
                    String A033222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222 = this.A0e;
                    String[] strArr5222222 = A0q;
                    String str6222222 = strArr5222222[3];
                    str = strArr5222222[4];
                    maxInputSize = str6222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222 = A03(0, 22, 98);
                String A0332222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222 = this.A0e;
                String[] strArr52222222 = A0q;
                String str62222222 = strArr52222222[3];
                str = strArr52222222[4];
                maxInputSize = str62222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -1730367663:
                if (str2.equals(A03(C3503Kz.r0, 8, 89))) {
                    c = 11;
                    String A03222222222 = A03(0, 22, 98);
                    String A03322222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222 = this.A0e;
                    String[] strArr522222222 = A0q;
                    String str622222222 = strArr522222222[3];
                    str = strArr522222222[4];
                    maxInputSize = str622222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222 = A03(0, 22, 98);
                String A033222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222 = this.A0e;
                String[] strArr5222222222 = A0q;
                String str6222222222 = strArr5222222222[3];
                str = strArr5222222222[4];
                maxInputSize = str6222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -1482641358:
                if (str2.equals(A03(76, 9, 75))) {
                    c = 14;
                    String A0322222222222 = A03(0, 22, 98);
                    String A0332222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222 = this.A0e;
                    String[] strArr52222222222 = A0q;
                    String str62222222222 = strArr52222222222[3];
                    str = strArr52222222222[4];
                    maxInputSize = str62222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222 = A03(0, 22, 98);
                String A03322222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222 = this.A0e;
                String[] strArr522222222222 = A0q;
                String str622222222222 = strArr522222222222[3];
                str = strArr522222222222[4];
                maxInputSize = str622222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -1482641357:
                if (str2.equals(A03(85, 9, 7))) {
                    c = 15;
                    String A032222222222222 = A03(0, 22, 98);
                    String A033222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222 = this.A0e;
                    String[] strArr5222222222222 = A0q;
                    String str6222222222222 = strArr5222222222222[3];
                    str = strArr5222222222222[4];
                    maxInputSize = str6222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222 = A03(0, 22, 98);
                String A0332222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222 = this.A0e;
                String[] strArr52222222222222 = A0q;
                String str62222222222222 = strArr52222222222222[3];
                str = strArr52222222222222[4];
                maxInputSize = str62222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -1373388978:
                if (str2.equals(A03(807, 15, 106))) {
                    c = '\t';
                    String A03222222222222222 = A03(0, 22, 98);
                    String A03322222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222 = this.A0e;
                    String[] strArr522222222222222 = A0q;
                    String str622222222222222 = strArr522222222222222[3];
                    str = strArr522222222222222[4];
                    maxInputSize = str622222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222 = A03(0, 22, 98);
                String A033222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222 = this.A0e;
                String[] strArr5222222222222222 = A0q;
                String str6222222222222222 = strArr5222222222222222[3];
                str = strArr5222222222222222[4];
                maxInputSize = str6222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -933872740:
                if (str2.equals(A03(411, 8, 51))) {
                    c = ' ';
                    String A0322222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222 = this.A0e;
                    String[] strArr52222222222222222 = A0q;
                    String str62222222222222222 = strArr52222222222222222[3];
                    str = strArr52222222222222222[4];
                    maxInputSize = str62222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222 = this.A0e;
                String[] strArr522222222222222222 = A0q;
                String str622222222222222222 = strArr522222222222222222[3];
                str = strArr522222222222222222[4];
                maxInputSize = str622222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -538363189:
                if (str2.equals(A03(747, 15, 79))) {
                    c = 5;
                    String A032222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222 = A0q;
                    String str6222222222222222222 = strArr5222222222222222222[3];
                    str = strArr5222222222222222222[4];
                    maxInputSize = str6222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222 = this.A0e;
                String[] strArr52222222222222222222 = A0q;
                String str62222222222222222222 = strArr52222222222222222222[3];
                str = strArr52222222222222222222[4];
                maxInputSize = str62222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -538363109:
                if (str2.equals(A03(762, 15, 4))) {
                    c = 7;
                    String A03222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222 = A0q;
                    String str622222222222222222222 = strArr522222222222222222222[3];
                    str = strArr522222222222222222222[4];
                    maxInputSize = str622222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222 = A0q;
                String str6222222222222222222222 = strArr5222222222222222222222[3];
                str = strArr5222222222222222222222[4];
                maxInputSize = str6222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -425012669:
                if (str2.equals(A03(463, 8, 110))) {
                    c = C5588cW.p;
                    String A0322222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222 = A0q;
                    String str62222222222222222222222 = strArr52222222222222222222222[3];
                    str = strArr52222222222222222222222[4];
                    maxInputSize = str62222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222 = A0q;
                String str622222222222222222222222 = strArr522222222222222222222222[3];
                str = strArr522222222222222222222222[4];
                maxInputSize = str622222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case -356037306:
                if (str2.equals(A03(50, 14, 60))) {
                    c = 21;
                    String A032222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222222222 = A0q;
                    String str6222222222222222222222222 = strArr5222222222222222222222222[3];
                    str = strArr5222222222222222222222222[4];
                    maxInputSize = str6222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222222222 = this.A0e;
                String[] strArr52222222222222222222222222 = A0q;
                String str62222222222222222222222222 = strArr52222222222222222222222222[3];
                str = strArr52222222222222222222222222[4];
                maxInputSize = str62222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 62923557:
                int maxInputSize8 = A0q[7].charAt(7);
                if (maxInputSize8 == 53) {
                    throw new RuntimeException();
                }
                A0q[2] = "PCK9YAvtQc91Ig7IWCjClF";
                if (str2.equals(A03(22, 5, 19))) {
                    c = C8206nB.d;
                    String A03222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222 = A0q;
                    String str622222222222222222222222222 = strArr522222222222222222222222222[3];
                    str = strArr522222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222 = A0q;
                String str6222222222222222222222222222 = strArr5222222222222222222222222222[3];
                str = strArr5222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 62923603:
                if (str2.equals(A03(27, 5, 23))) {
                    c = 16;
                    String A0322222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222 = strArr52222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222 = A0q;
                String str622222222222222222222222222222 = strArr522222222222222222222222222222[3];
                str = strArr522222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 62927045:
                if (str2.equals(A03(32, 5, 64))) {
                    c = 19;
                    String A032222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222222222222222 = A0q;
                    String str6222222222222222222222222222222 = strArr5222222222222222222222222222222[3];
                    str = strArr5222222222222222222222222222222[4];
                    maxInputSize = str6222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222222222222222 = this.A0e;
                String[] strArr52222222222222222222222222222222 = A0q;
                String str62222222222222222222222222222222 = strArr52222222222222222222222222222222[3];
                str = strArr52222222222222222222222222222222[4];
                maxInputSize = str62222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 82318131:
                if (str2.equals(A03(721, 5, 23))) {
                    c = 2;
                    String A03222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222222222 = A0q;
                    String str622222222222222222222222222222222 = strArr522222222222222222222222222222222[3];
                    str = strArr522222222222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222 = strArr5222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 82338133:
                if (str2.equals(A03(830, 5, 57))) {
                    c = 0;
                    String A0322222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222 = strArr52222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222222222 = A0q;
                String str622222222222222222222222222222222222 = strArr522222222222222222222222222222222222[3];
                str = strArr522222222222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 82338134:
                String[] strArr6 = A0q;
                String str7 = strArr6[3];
                String str8 = strArr6[4];
                int maxInputSize9 = str7.charAt(20);
                if (maxInputSize9 == str8.charAt(20)) {
                    String[] strArr7 = A0q;
                    strArr7[3] = "krBYiBibqX7TSfSwMYzjn9d2GuX0Mkor";
                    strArr7[4] = "P6vgcrj3R6TgPbwX53cZn6lBdQLCmynr";
                    if (str2.equals(A03(835, 5, 55))) {
                        c = 1;
                        String A032222222222222222222222222222222222222 = A03(0, 22, 98);
                        String A033222222222222222222222222222222222222 = A03(312, 17, 46);
                        switch (c) {
                        }
                        if (this.A0k != null) {
                        }
                        int i7222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                        C04212p c04212p222222222222222222222222222222222222 = new C04212p();
                        if (C3J.A0C(A03)) {
                        }
                        String str5222222222222222222222222222222222222 = this.A0e;
                        String[] strArr5222222222222222222222222222222222222 = A0q;
                        String str6222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222[3];
                        str = strArr5222222222222222222222222222222222222[4];
                        maxInputSize = str6222222222222222222222222222222222222.charAt(20);
                        if (maxInputSize == str.charAt(20)) {
                        }
                    }
                    c = 65535;
                    String A0322222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                throw new RuntimeException();
            case 99146302:
                if (str2.equals(A03(419, 10, 126))) {
                    c = VN2.b;
                    String A03222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222222222222222 = A0q;
                    String str622222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222[3];
                    str = strArr522222222222222222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 444813526:
                if (str2.equals(A03(822, 8, 96))) {
                    c = '\n';
                    String A0322222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222222222222222 = A0q;
                String str622222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222[3];
                str = strArr522222222222222222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 542569478:
                if (str2.equals(A03(37, 13, 113))) {
                    c = 20;
                    String A032222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222222222222222222222222222 = A0q;
                    String str6222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222[3];
                    str = strArr5222222222222222222222222222222222222222222[4];
                    maxInputSize = str6222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr52222222222222222222222222222222222222222222 = A0q;
                String str62222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222[3];
                str = strArr52222222222222222222222222222222222222222222[4];
                maxInputSize = str62222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 635596514:
                if (str2.equals(A03(108, 16, 48))) {
                    c = 26;
                    String A03222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222222222222222222222 = A0q;
                    String str622222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222[3];
                    str = strArr522222222222222222222222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 725948237:
                if (str2.equals(A03(124, 13, 85))) {
                    c = 25;
                    String A0322222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222222222222222222222 = A0q;
                String str622222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222[3];
                str = strArr522222222222222222222222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 725957860:
                if (str2.equals(A03(C3503Kz.a0, 13, 32))) {
                    c = 24;
                    String A032222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222222222222222222222222222222222 = A0q;
                    String str6222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222[3];
                    str = strArr5222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str6222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr52222222222222222222222222222222222222222222222222 = A0q;
                String str62222222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222222[3];
                str = strArr52222222222222222222222222222222222222222222222222[4];
                maxInputSize = str62222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 738597099:
                if (str2.equals(A03(ConfigFetchHandler.l, 10, 84))) {
                    c = C5588cW.n;
                    String A03222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222222222222222222222222222 = A0q;
                    String str622222222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222222[3];
                    str = strArr522222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 855502857:
                if (str2.equals(A03(791, 16, 72))) {
                    c = '\b';
                    String A0322222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222222222222222222222222222 = A0q;
                String str622222222222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222222222[3];
                str = strArr522222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 1045209816:
                if (str2.equals(A03(450, 13, 101))) {
                    c = C5588cW.f706o;
                    String A032222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222222222222222222222222222222222222222 = A0q;
                    String str6222222222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222222222[3];
                    str = strArr5222222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str6222222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr52222222222222222222222222222222222222222222222222222222 = A0q;
                String str62222222222222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222222222222[3];
                str = strArr52222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str62222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 1422270023:
                if (str2.equals(A03(439, 11, 49))) {
                    c = 27;
                    String A03222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222222222222222222222222222222222 = A0q;
                    String str622222222222222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222222222222[3];
                    str = strArr522222222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 1809237540:
                if (str2.equals(A03(726, 7, 42))) {
                    c = 3;
                    String A0322222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222222222222222222222222222222222 = A0q;
                String str622222222222222222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222222222222222[3];
                str = strArr522222222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 1950749482:
                if (str2.equals(A03(64, 6, 66))) {
                    c = 17;
                    String A032222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A033222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i7222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str5222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr5222222222222222222222222222222222222222222222222222222222222 = A0q;
                    String str6222222222222222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222222222222222[3];
                    str = strArr5222222222222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str6222222222222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A0322222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A0332222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i72222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p2222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str52222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr52222222222222222222222222222222222222222222222222222222222222 = A0q;
                String str62222222222222222222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222222222222222222[3];
                str = strArr52222222222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str62222222222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 1950789798:
                if (str2.equals(A03(70, 6, 88))) {
                    c = 22;
                    String A03222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A03322222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i722222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p22222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str522222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr522222222222222222222222222222222222222222222222222222222222222 = A0q;
                    String str622222222222222222222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222222222222222222[3];
                    str = strArr522222222222222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str622222222222222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A032222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            case 1951062397:
                if (str2.equals(A03(102, 6, 53))) {
                    c = '\f';
                    String A0322222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                    String A0332222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                    switch (c) {
                    }
                    if (this.A0k != null) {
                    }
                    int i72222222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                    C04212p c04212p2222222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                    if (C3J.A0C(A03)) {
                    }
                    String str52222222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                    String[] strArr52222222222222222222222222222222222222222222222222222222222222222 = A0q;
                    String str62222222222222222222222222222222222222222222222222222222222222222 = strArr52222222222222222222222222222222222222222222222222222222222222222[3];
                    str = strArr52222222222222222222222222222222222222222222222222222222222222222[4];
                    maxInputSize = str62222222222222222222222222222222222222222222222222222222222222222.charAt(20);
                    if (maxInputSize == str.charAt(20)) {
                    }
                }
                c = 65535;
                String A03222222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A03322222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i722222222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p22222222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str522222222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr522222222222222222222222222222222222222222222222222222222222222222 = A0q;
                String str622222222222222222222222222222222222222222222222222222222222222222 = strArr522222222222222222222222222222222222222222222222222222222222222222[3];
                str = strArr522222222222222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str622222222222222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
            default:
                c = 65535;
                String A032222222222222222222222222222222222222222222222222222222222222222222 = A03(0, 22, 98);
                String A033222222222222222222222222222222222222222222222222222222222222222222 = A03(312, 17, 46);
                switch (c) {
                }
                if (this.A0k != null) {
                }
                int i7222222222222222222222222222222222222222222222222222222222222222222 = 0 | (this.A0f ? 1 : 0) | (this.A0g ? 2 : 0);
                C04212p c04212p222222222222222222222222222222222222222222222222222222222222222222 = new C04212p();
                if (C3J.A0C(A03)) {
                }
                String str5222222222222222222222222222222222222222222222222222222222222222222 = this.A0e;
                String[] strArr5222222222222222222222222222222222222222222222222222222222222222222 = A0q;
                String str6222222222222222222222222222222222222222222222222222222222222222222 = strArr5222222222222222222222222222222222222222222222222222222222222222222[3];
                str = strArr5222222222222222222222222222222222222222222222222222222222222222222[4];
                maxInputSize = str6222222222222222222222222222222222222222222222222222222222222222222.charAt(20);
                if (maxInputSize == str.charAt(20)) {
                }
                break;
        }
    }
}
