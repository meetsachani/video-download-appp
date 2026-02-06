package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomizations;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.AD1;
import o.AbstractC3914Pe1;
import o.C10323vs;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.InterfaceC8148mw2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.1g  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC03881g extends AE {
    public static byte[] A11;
    public static String[] A12 = {"nx3Y", "ySV9u0UlUifM8l7YXQ9XliwCignJM927", "I56UD3cYRclrpAgGGb6MtOKCjcs9cL2j", "Sm2NURaNWtDVUJWNcAo7ERDS0hDt7", "bHPfo4AgOQoRvyPk4FB0ks", "XoiyS7TBeS4mt", "Z3oSrtXzlmftA", "iDWmG7Cddc7JoXPcHC9pChUfA3XnAJjW"};
    public static final byte[] A13;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public MediaFormat A0C;
    public InterfaceC05969s A0D;
    public InterfaceC05969s A0E;
    public B0 A0F;
    public B3 A0G;
    public BA A0H;
    public BC A0I;
    public String A0J;
    public ByteBuffer A0K;
    public ArrayDeque<B3> A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    @MetaExoPlayerCustomization("Potentially can be removed. Added in D36797879")
    public long A0f;
    public C2242qI A0g;
    public C6I A0h;
    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D57514060: Do not added Dav1dMediaCodecInfo to the list of MediaCodecInfos if it's already added, can be cleaned up after launch")
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final int A0l;
    public final int A0m;
    public final MediaCodec.BufferInfo A0n;
    public final C2163p0 A0o;
    public final C2163p0 A0p;
    public final C05336z A0q;
    public final A6 A0r;
    public final BT A0s;
    public final ArrayDeque<BC> A0t;
    public final List<Long> A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final C1833jN A0y;
    public final C1836jQ A0z;
    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")
    public final boolean A10;

    public static String A0x(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A11, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A15() {
        A11 = new byte[]{-74, -86, -20, -1, -2, -86, -8, -7, -86, -3, -17, -19, -1, -4, -17, -86, -18, -17, -19, -7, -18, -17, -4, -86, -21, 0, -21, -13, -10, -21, -20, -10, -17, -72, -86, -34, -4, 3, -13, -8, -15, -86, -2, -7, -86, -6, -4, -7, -19, -17, -17, -18, -86, 1, -13, -2, -14, -86, -110, -120, -87, -89, -77, -88, -87, -74, 100, -83, -78, -83, -72, -83, -91, -80, -83, -66, -91, -72, -83, -77, -78, 100, -86, -91, -83, -80, -87, -88, 112, 100, -74, -87, -72, -74, -67, -25, 8, C8077mf.x, C8077mf.B, 8, C8077mf.B, 8, C2638Cg0.r7, 9, 4, C8077mf.n, C8077mf.q, 8, 7, C2638Cg0.A7, C2638Cg0.r7, C8077mf.y, 8, C8077mf.A, C8077mf.y, 28, -22, C8077mf.B, 19, C2638Cg0.t7, C8077mf.C, C8077mf.m, C8077mf.C, C8077mf.C, C8077mf.q, C8077mf.y, C8077mf.x, C2638Cg0.t7, C8077mf.B, C8077mf.m, C8077mf.A, C8077mf.E, C8077mf.q, C8077mf.B, C8077mf.m, C8077mf.C, C2638Cg0.t7, C8077mf.C, C8077mf.m, 9, C8077mf.E, C8077mf.B, C8077mf.m, C2638Cg0.t7, 10, C8077mf.m, 9, C8077mf.y, 10, C8077mf.m, C8077mf.B, C2638Cg0.t7, C8077mf.n, C8077mf.y, C8077mf.B, C2638Cg0.t7, -103, -76, -68, -65, -72, -73, 115, C2638Cg0.u7, C2638Cg0.q7, 115, -68, C2638Cg0.p7, -68, C2638Cg0.u7, -68, -76, -65, -68, C2638Cg0.y7, -72, 115, -73, -72, -74, C2638Cg0.q7, -73, -72, C2638Cg0.s7, -115, 115, -113, -89, -90, -85, -93, 98, -76, -89, -77, -73, -85, -76, -89, -75, 98, -93, 98, -122, -76, -81, -107, -89, -75, -75, -85, -79, -80, -113, -93, -80, -93, -87, -89, -76, -47, -23, -24, -19, -27, C2638Cg0.u7, -13, -24, -23, -25, -42, -23, -14, -24, -23, -10, -23, -10, -78, -80, -69, -111, -88, -37, -36, -47, -46, -42, -111, -60, C2638Cg0.E7, C2638Cg0.t7, -111, C2638Cg0.u7, -56, C2638Cg0.t7, -23, -25, -14, -56, -33, C8077mf.u, 19, 8, 9, 13, -56, -5, C8077mf.r, -3, -56, -2, -1, -3, -56, 13, -1, -3, C8077mf.q, C8077mf.n, -1, -79, -81, -70, -112, -81, -74, -83, -112, -93, -73, -90, -85, -79, -112, -90, -89, -91, -79, -90, -89, -76, -112, -81, -78, -107, -90, -92, -81, -123, -92, -85, -94, -123, -83, -96, -101, -100, -90, -123, -101, -100, -102, -90, -101, -100, -87, -123, -104, -83, -102, -83, -85, -74, -116, -84, -44, C2638Cg0.u7, C2638Cg0.q7, C2638Cg0.u7, -65, -116, C2638Cg0.t7, -112, -108, -110, -116, C2638Cg0.q7, C2638Cg0.r7, C2638Cg0.p7, C2638Cg0.y7, C2638Cg0.q7, C2638Cg0.r7, -103, -105, -94, QC1.w, -104, C2638Cg0.o7, -77, -82, -77, -85, QC1.w, -78, 124, Byte.MIN_VALUE, 126, QC1.w, -82, -81, -83, -71, -82, -81, QC1.w, -67, -81, -83, -65, -68, -81, -44, -46, -35, -77, C2638Cg0.n7, C2638Cg0.w7, -56, -77, -26, -5, -24, -77, -23, -22, -24, -35, -37, -26, -68, C2638Cg0.C7, -45, -47, -68, -17, 4, -15, -68, -14, -13, -15, -68, 1, -13, -15, 3, 0, -13, -56, C2638Cg0.t7, -47, -89, C2638Cg0.B7, -27, -27, -16, -30, -25, -25, -34, -21, -89, -17, -30, -35, -34, -24, -89, -35, -34, -36, -24, -35, -34, -21, -89, C2638Cg0.B7, -17, -36, C2638Cg0.x7, C2638Cg0.v7, -44, -86, -35, -23, -24, -21, -29, -27, -33, -86, -35, -14, -33, -86, -32, C2638Cg0.C7, -33, -21, -32, C2638Cg0.C7, -18, -86, -35, -13, C2638Cg0.C7, -17, -21, -23, C2638Cg0.C7, 13, C8077mf.m, C8077mf.z, -20, 31, C3307Iz.c0, 42, C3307Iz.e0, C3307Iz.X, C3307Iz.Z, C3307Iz.V, -20, 31, 52, C3307Iz.V, -20, 34, 35, C3307Iz.V, C3307Iz.e0, 34, 35, 48, -20, 31, 53, 35, 49, C3307Iz.e0, C3307Iz.c0, 35, -20, 49, 35, C3307Iz.V, 51, 48, 35, -71, -73, C2638Cg0.q7, -104, -47, C2638Cg0.E7, C2638Cg0.E7, -47, -42, C2638Cg0.A7, -104, C2638Cg0.x7, C2638Cg0.x7, C2638Cg0.y7, -104, C2638Cg0.z7, C2638Cg0.A7, C2638Cg0.y7, C2638Cg0.E7, C2638Cg0.z7, C2638Cg0.A7, -36, 4, 2, 13, -29, 28, 36, 36, 28, C3307Iz.V, C8077mf.D, -29, C3307Iz.c0, 36, C3307Iz.Z, C8077mf.A, C8077mf.H, 40, -29, C8077mf.C, C8077mf.D, C8077mf.B, 36, C8077mf.C, C8077mf.D, C3307Iz.Z, C8077mf.q, 13, C8077mf.B, -18, 50, C3307Iz.c0, -18, 54, C3307Iz.a0, 36, C3307Iz.X, 47, 31, 36, C3307Iz.X, 35, 47, 36, C3307Iz.X, 50, -18, C3307Iz.V, 54, 35, -73, C2638Cg0.E7, -52, C2638Cg0.y7, -52, C2638Cg0.E7, C2638Cg0.E7, -52, C2638Cg0.x7, -121, C2638Cg0.x7, -52, C2638Cg0.w7, -42, C2638Cg0.x7, -52, C2638Cg0.E7, -121, -48, -43, C2638Cg0.B7, -37, -56, -43, -37, -48, -56, -37, -48, -42, -43, -121, C2638Cg0.y7, -56, -48, -45, -52, C2638Cg0.x7, -107, -121, -70, -45, -52, -52, -41, -48, -43, C2638Cg0.z7, -121, -37, C2638Cg0.A7, -52, -43, -121, C2638Cg0.E7, -52, -37, C2638Cg0.E7, -32, -48, -43, C2638Cg0.z7, -107, 7, 1, C2638Cg0.C7, -11, -23, -27, -28, C8077mf.q, 9, -23, -3, -15, -18, -20, C8077mf.r, 10, -22, 4, -11, -19, -19, -104, -110, 114, -113, 124, 117, 117, 0, -6, C2638Cg0.B7, 1, -30, -27, -30, -79, -74, -81, -68, -68, -77, -70, 123, -79, -67, C2638Cg0.r7, -68, C2638Cg0.q7, -76, C2638Cg0.o7, -65, -73, -70, -72, C2638Cg0.t7, C2638Cg0.r7, -74, -108, C2638Cg0.o7, -75, -74, -76, -44, -29, -42, -46, -27, -42, -76, -32, -43, -42, -44, -85, -75, C2638Cg0.r7, -78, -70, -65, -110, -65, -75, -105, -74, -74, -75, -82, -76, -73, -67, -74, -84, -83, -70, -13, -7, -4, 2, -5, -15, -14, -1, -20, -7, 1, -14, C2638Cg0.A7, C2638Cg0.y7, -36, -65, C2638Cg0.B7, C2638Cg0.v7, C2638Cg0.n7, C2638Cg0.n7, C2638Cg0.y7, -52, -75, C2638Cg0.y7, -52, -47, C2638Cg0.v7, -85, C2638Cg0.B7, C2638Cg0.C7, C2638Cg0.n7, -36, -41, C2638Cg0.A7, C2638Cg0.B7, -41, -35, C2638Cg0.n7, C2638Cg0.y7, C2638Cg0.B7, C8077mf.q, 9, C2638Cg0.E7, -41, -41, -41, -16, -19, -15, -17, -16, -4, C2638Cg0.p7, -71, -56, -75, -126, -72, -75, C2638Cg0.w7, -123, -72, -126, -75, C2638Cg0.w7, -123, -126, -72, -71, -73, C2638Cg0.r7, -72, -71, C2638Cg0.t7, C3307Iz.Y, C3307Iz.Z, C8077mf.x, C3307Iz.X, C3307Iz.Z, -10, 34, C8077mf.A, C8077mf.B, C8077mf.z, -42, C2638Cg0.x7, C2638Cg0.z7, C2638Cg0.r7, -46, C2638Cg0.x7, C2638Cg0.r7, C8077mf.r, 3, -2, -1, 9, C2638Cg0.v7, -5, C8077mf.r, C2638Cg0.w7, C2638Cg0.x7, C8077mf.G, C8077mf.r, C8077mf.m, C8077mf.n, C8077mf.z, -42, C8077mf.m, C8077mf.z, 19, 9, 32, -44, C8077mf.G, C8077mf.r, C8077mf.D, C8077mf.r, C8077mf.z, C8077mf.y, 9, -5, -10, 6, -6};
    }

    public abstract int A1g(B0 b0, B3 b3, C2242qI c2242qI, C2242qI c2242qI2);

    public abstract int A1h(BT bt, A6 a6, C2242qI c2242qI) throws BX;

    public abstract List<B3> A1l(BT bt, C2242qI c2242qI, boolean z) throws BX;

    public abstract void A1u(C2163p0 c2163p0);

    public abstract void A1v(@MetaExoPlayerCustomization B0 b0, MediaFormat mediaFormat) throws AD;

    public abstract void A1w(B3 b3, B0 b0, C2242qI c2242qI, MediaCrypto mediaCrypto) throws BX;

    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public abstract void A1x(String str);

    public abstract void A1y(String str, long j, long j2);

    public abstract boolean A22();

    public abstract boolean A23(long j, long j2, B0 b0, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2) throws AD;

    static {
        A15();
        A13 = new byte[]{0, 0, 1, 103, 66, C2638Cg0.o7, C8077mf.m, C2638Cg0.B7, C3307Iz.X, -112, 0, 0, 1, 104, C2638Cg0.z7, C8077mf.q, 19, 32, 0, 0, 1, 101, -120, -124, 13, C2638Cg0.z7, 113, C8077mf.B, -96, 0, 47, -65, 28, 49, C2638Cg0.r7, C3307Iz.Z, 93, QC1.w};
    }

    public AbstractC03881g(int i, C1836jQ c1836jQ, C1833jN c1833jN, BT bt, A6 a6, boolean z, boolean z2, int i2, int i3) {
        super(i);
        this.A09 = C10323vs.b;
        this.A08 = C10323vs.b;
        this.A0k = false;
        this.A0i = false;
        AbstractC04543y.A08(C5C.A02 >= 16);
        this.A0z = (C1836jQ) AbstractC04543y.A01(c1836jQ);
        this.A0y = (C1833jN) AbstractC04543y.A01(c1833jN);
        this.A0s = (BT) AbstractC04543y.A01(bt);
        this.A0r = a6;
        this.A0x = z;
        this.A0v = z2;
        this.A0m = i2;
        this.A0l = i3;
        this.A0o = new C2163p0(0);
        this.A0p = C2163p0.A02();
        this.A0q = new C05336z();
        this.A0u = new ArrayList();
        this.A0n = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0t = new ArrayDeque<>();
        A18(BC.A04);
        this.A03 = 0;
        this.A04 = 0;
        this.A0A = C10323vs.b;
        this.A0B = C10323vs.b;
        this.A0w = C1844ja.A03(EnumC1841jX.A1v);
        this.A10 = C1844ja.A03(EnumC1841jX.A1g);
    }

    private int A0w(String str) {
        if (C5C.A02 <= 25) {
            String A0x = A0x(256, 25, 89);
            if (A12[0].length() == 4) {
                String[] strArr = A12;
                strArr[6] = "h0JLQRwistZ4R";
                strArr[5] = "YRyjkg8cOEuM6";
                if (A0x.equals(str) && (C5C.A06.startsWith(A0x(681, 7, 108)) || C5C.A06.startsWith(A0x(653, 7, 115)) || C5C.A06.startsWith(A0x(660, 7, 123)) || C5C.A06.startsWith(A0x(674, 7, 4)))) {
                    return 2;
                }
            }
            throw new RuntimeException();
        }
        if (C5C.A02 < 24) {
            if (A0x(331, 22, 29).equals(str) || A0x(353, 29, 9).equals(str)) {
                String str2 = C5C.A03;
                String[] strArr2 = A12;
                if (strArr2[4].length() != strArr2[3].length()) {
                    String[] strArr3 = A12;
                    strArr3[4] = "Grbv6CKWzSbyHFrZua5Jwu";
                    strArr3[3] = "PMUv1GSkzI9tSaBJkI706oVY9TsOb";
                    if (!A0x(739, 8, 7).equals(str2)) {
                        if (!A0x(747, 12, 76).equals(C5C.A03)) {
                            if (!A0x(780, 7, 39).equals(C5C.A03)) {
                                if (!A0x(831, 7, 33).equals(C5C.A03)) {
                                    return 0;
                                }
                            }
                        }
                    }
                    String[] strArr4 = A12;
                    if (strArr4[6].length() == strArr4[5].length()) {
                        String[] strArr5 = A12;
                        strArr5[6] = "FCPESGyqb3ntu";
                        strArr5[5] = "UMDsUUTIxH2ng";
                        return 1;
                    }
                }
                throw new RuntimeException();
            }
            return 0;
        }
        return 0;
    }

    private ByteBuffer A0y(int i) {
        return this.A0F.A8J(i);
    }

    private ByteBuffer A0z(int i) {
        return this.A0F.A8e(i);
    }

    private List<B3> A10(boolean z) throws BX {
        String alternativeMimeType;
        List<B3> A1l = A1l(this.A0s, this.A0g, z);
        if (A1l.isEmpty() && z) {
            A1l = A1l(this.A0s, this.A0g, false);
            if (!A1l.isEmpty()) {
                AbstractC04624g.A07(A0x(220, 18, 67), A0x(116, 40, 101) + this.A0g.A0W + A0x(0, 58, 73) + A1l + A0x(58, 1, 35));
            }
        }
        if (A1l.isEmpty() && this.A0j && (alternativeMimeType = C0624Ba.A0P(this.A0g)) != null) {
            List<B3> A7o = this.A0s.A7o(alternativeMimeType, false, false);
            if (C5C.A02 >= 26) {
                if (A0x(848, 18, 102).equals(this.A0g.A0W) && !A7o.isEmpty()) {
                    return A7o;
                }
                return A1l;
            }
            return A1l;
        }
        return A1l;
    }

    private void A11() throws AD {
        if (this.A04 == 2) {
            A1n();
            A1p();
        } else if (A12[0].length() != 4) {
            throw new RuntimeException();
        } else {
            String[] strArr = A12;
            strArr[4] = "s3YfZmdbCJrJCYfdnx93Y1";
            strArr[3] = "Or76pnfNSBivOkp3C019O1267DCns";
            this.A0a = true;
            A1o();
        }
    }

    private void A12() throws AD {
        MediaFormat A8f = this.A0F.A8f();
        if (this.A02 != 0 && A8f.getInteger(A0x(866, 5, 81)) == 32 && A8f.getInteger(A0x(793, 6, 71)) == 32) {
            this.A0b = true;
            return;
        }
        if (this.A0S) {
            A8f.setInteger(A0x(688, 13, 13), 1);
        }
        this.A0C = A8f;
        this.A0T = true;
        A1v(this.A0F, A8f);
    }

    private void A13() {
        this.A05 = -1;
        this.A0o.A02 = null;
    }

    private void A14() {
        this.A06 = -1;
        this.A0K = null;
    }

    @MetaExoPlayerCustomizations({@MetaExoPlayerCustomization("Call to 'forceDisableAsynchronous'"), @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging"), @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "D60404164: Merge init calls in the renderer")})
    private void A16(B3 b3, MediaCrypto mediaCrypto) throws Exception {
        B0 b0 = null;
        String str = b3.A03;
        try {
            if (this.A10) {
                A1z(str, this.A0g);
            } else {
                A1t(this.A0g);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!this.A10) {
                A1x(str);
            }
            AnonymousClass54.A02(A0x(715, 12, 48) + str);
            new C2113oC().A00();
            b0 = B7.A02().A0K(A22(), this.A0z, this.A0y.A00(), EnumC1831jL.A05, str);
            try {
                this.A0J = str;
                AnonymousClass54.A00();
                AnonymousClass54.A02(A0x(InterfaceC8148mw2.h.k, 14, 16));
            } catch (Exception e) {
                e = e;
            }
            try {
                A1w(b3, b0, this.A0g, mediaCrypto);
                AnonymousClass54.A00();
                AnonymousClass54.A02(A0x(821, 10, 114));
                b0.start();
                AnonymousClass54.A00();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.A0F = b0;
                this.A0G = b3;
                A1y(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            } catch (Exception e2) {
                e = e2;
                if (b0 != null) {
                    b0.AHb();
                }
                throw e;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D53064452: Add decoder init time failure thread sleep")
    private void A17(B3 b3, B3 b32, MediaCrypto mediaCrypto) throws Exception {
        int A00 = C1844ja.A00(EnumC1842jY.A06);
        if (A00 >= 0) {
            try {
                A16(b32, mediaCrypto);
                return;
            } catch (Exception e) {
                if (b32 == b3) {
                    AbstractC04624g.A07(A0x(220, 18, 67), A0x(590, 63, 38));
                    Thread.sleep(A00);
                    A16(b32, mediaCrypto);
                    return;
                }
                throw e;
            }
        }
        A16(b32, mediaCrypto);
    }

    private void A18(BC bc) {
        this.A0I = bc;
        if (bc.A02 != C10323vs.b) {
            this.A0Z = true;
        }
    }

    private boolean A19() {
        boolean z = false;
        if (this.A0l <= 0) {
            return false;
        }
        z = (this.A08 == C10323vs.b || System.currentTimeMillis() - this.A08 <= ((long) this.A0l)) ? true : true;
        if (this.A08 == C10323vs.b) {
            AbstractC04624g.A07(A0x(220, 18, 67), A0x(95, 21, 98));
            try {
                this.A0L = null;
                A1n();
            } catch (IllegalStateException unused) {
            }
            this.A08 = System.currentTimeMillis();
        }
        return z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D70661541: Skip the sample if sample is too large")
    private boolean A1A() throws AD {
        int result;
        if (this.A0F == null || this.A04 == 2 || this.A0X) {
            return false;
        }
        if (this.A05 < 0) {
            this.A05 = this.A0F.A5s();
            if (this.A05 < 0) {
                return false;
            }
            this.A0o.A02 = A0y(this.A05);
            this.A0o.A0A();
        }
        if (this.A04 == 1) {
            if (!this.A0Q) {
                this.A0V = true;
                this.A0F.AHI(this.A05, 0, 0, 0L, 4);
                A13();
            }
            this.A04 = 2;
            return false;
        } else if (this.A0M) {
            this.A0M = false;
            this.A0o.A02.put(A13);
            this.A0F.AHI(this.A05, 0, A13.length, 0L, 0);
            A13();
            this.A0U = true;
            String[] strArr = A12;
            if (strArr[4].length() != strArr[3].length()) {
                String[] strArr2 = A12;
                strArr2[7] = "TQo31YhCROQVY4YgWOUT3bWhQ8E3XWwr";
                strArr2[1] = "W5PRMN9OPETbxvbbJic4GeLECMZHBr0G";
                return true;
            }
            throw new RuntimeException();
        } else {
            int i = 0;
            if (this.A0e) {
                result = -4;
            } else {
                if (this.A03 == 1) {
                    for (int i2 = 0; i2 < this.A0g.A0X.size(); i2++) {
                        this.A0o.A02.put(this.A0g.A0X.get(i2));
                    }
                    this.A03 = 2;
                }
                i = this.A0o.A02.position();
                boolean A03 = C1844ja.A03(EnumC1841jX.A0z);
                if (A12[2].charAt(29) == 'f') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A12;
                strArr3[6] = "tFzAjqlOyn071";
                strArr3[5] = "66mU3uAl0xlMl";
                if (A03) {
                    try {
                        result = A1R(this.A0q, this.A0o, 0);
                    } catch (AnonymousClass63 unused) {
                        A1C(0);
                        A1m();
                        return true;
                    }
                } else {
                    result = A1R(this.A0q, this.A0o, 0);
                }
            }
            if (A9p() || this.A0o.A08()) {
                this.A0B = this.A0A;
            }
            if (result == -3) {
                return false;
            }
            if (result == -5) {
                if (this.A03 == 2) {
                    this.A0o.A0A();
                    this.A03 = 1;
                }
                A1s(this.A0q.A00);
                return true;
            } else if (this.A0o.A05()) {
                if (this.A03 == 2) {
                    this.A0o.A0A();
                    this.A03 = 1;
                }
                this.A0X = true;
                if (!this.A0U) {
                    A11();
                    return false;
                }
                try {
                    if (!this.A0Q) {
                        this.A0V = true;
                        this.A0F.AHI(this.A05, 0, 0, 0L, 4);
                        A13();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    C2242qI c2242qI = this.A0g;
                    int adaptiveReconfigurationBytes = e.getErrorCode();
                    throw A1S(e, c2242qI, C5C.A02(adaptiveReconfigurationBytes));
                }
            } else if (this.A0d && !this.A0o.A07()) {
                this.A0o.A0A();
                if (this.A03 == 2) {
                    this.A03 = 1;
                }
                return true;
            } else {
                this.A0d = false;
                boolean skipIfSampleTooLarge = this.A0o.A0E();
                boolean bufferEncrypted = this.A0y.A01();
                if (bufferEncrypted && skipIfSampleTooLarge) {
                    this.A0o.A05.A01(i);
                }
                boolean bufferEncrypted2 = A1N(skipIfSampleTooLarge);
                this.A0e = bufferEncrypted2;
                boolean bufferEncrypted3 = this.A0e;
                if (bufferEncrypted3) {
                    return false;
                }
                boolean bufferEncrypted4 = this.A0N;
                if (bufferEncrypted4 && !skipIfSampleTooLarge) {
                    HS.A0G(this.A0o.A02);
                    if (this.A0o.A02.position() == 0) {
                        return true;
                    }
                    this.A0N = false;
                }
                try {
                    long j = this.A0o.A01;
                    boolean bufferEncrypted5 = this.A0o.A04();
                    if (bufferEncrypted5) {
                        this.A0u.add(Long.valueOf(j));
                    }
                    this.A0A = Math.max(this.A0A, j);
                    this.A0o.A0B();
                    A1u(this.A0o);
                    if (skipIfSampleTooLarge) {
                        this.A0F.AHK(this.A05, 0, this.A0o.A05, j, 0);
                    } else {
                        this.A0F.AHI(this.A05, 0, this.A0o.A02.limit(), j, 0);
                    }
                    A13();
                    this.A0U = true;
                    this.A03 = 0;
                    this.A0h.A08++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    C2242qI c2242qI2 = this.A0g;
                    int adaptiveReconfigurationBytes2 = e2.getErrorCode();
                    throw A1S(e2, c2242qI2, C5C.A02(adaptiveReconfigurationBytes2));
                }
            }
        }
    }

    private boolean A1B() {
        return this.A06 >= 0;
    }

    private boolean A1C(int i) throws AD {
        C05336z A1U = A1U();
        this.A0p.A0A();
        int A1R = A1R(A1U, this.A0p, i | 4);
        if (A1R == -5) {
            A1s(A1U.A00);
            return true;
        }
        if (A1R == -4 && this.A0p.A05()) {
            this.A0X = true;
            A11();
        }
        int result = A12[2].charAt(29);
        if (result != 102) {
            String[] strArr = A12;
            strArr[4] = "I6wAGrX36WnyTLz4kIu2A0";
            strArr[3] = "sKJkcvNhIyFX1pRFROyyBnawIxNqa";
            return false;
        }
        throw new RuntimeException();
    }

    private boolean A1D(long j) {
        int size = this.A0u.size();
        for (int i = 0; i < size; i++) {
            int size2 = (this.A0u.get(i).longValue() > j ? 1 : (this.A0u.get(i).longValue() == j ? 0 : -1));
            if (size2 == 0) {
                this.A0u.remove(i);
                return true;
            }
        }
        String[] strArr = A12;
        String str = strArr[4];
        String str2 = strArr[3];
        int length = str.length();
        int size3 = str2.length();
        if (length != size3) {
            String[] strArr2 = A12;
            strArr2[4] = "k0VQHwP22phbTrXBZc8FuM";
            strArr2[3] = "DsxaarEsX3gZUO5CYPDgS2koeov7n";
            return false;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
        if (r20.A0K != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
        r20.A0K.position(r20.A0n.offset);
        r20.A0K.limit(r20.A0n.offset + r20.A0n.size);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
        r20.A0c = A1D(r20.A0n.presentationTimeUs);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
        if (r20.A0B != r20.A0n.presentationTimeUs) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
        r20.A0Y = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0156, code lost:
        if (r20.A0K != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A1E(long j, long j2) throws AD {
        boolean z;
        boolean processedOutputBuffer;
        int A5u;
        if (!A1B()) {
            boolean z2 = this.A0P;
            String[] strArr = A12;
            if (strArr[6].length() == strArr[5].length()) {
                String[] strArr2 = A12;
                strArr2[4] = "3Zz5yYcdEnea2Q2Ufvkja4";
                strArr2[3] = "iabR8Vve1dDezsMpvwSmTE3MhP0dx";
                if (z2) {
                    boolean z3 = this.A0V;
                    String[] strArr3 = A12;
                    if (strArr3[6].length() != strArr3[5].length()) {
                        throw new RuntimeException();
                    }
                    A12[0] = "OUdi";
                    if (z3) {
                        try {
                            A5u = this.A0F.A5u(this.A0n);
                            if (A5u < 0) {
                                if (this.A0b) {
                                    this.A0b = false;
                                    B0 b0 = this.A0F;
                                    if (A12[2].charAt(29) == 'f') {
                                        b0.AHi(A5u, false);
                                        return true;
                                    }
                                    String[] strArr4 = A12;
                                    strArr4[6] = "Sxw7BJ5DCdkMn";
                                    strArr4[5] = "uR5ffcKC2c0Qe";
                                    b0.AHi(A5u, false);
                                    return true;
                                } else if (this.A0n.size == 0 && (this.A0n.flags & 4) != 0) {
                                    A11();
                                    return false;
                                } else {
                                    this.A06 = A5u;
                                    ByteBuffer A0z = A0z(A5u);
                                    if (A12[2].charAt(29) != 'f') {
                                        A12[0] = "bTu1";
                                        this.A0K = A0z;
                                    } else {
                                        A12[2] = "jn7zZa5Ao9aeuRKBiubAI8gr9vrzbXZe";
                                        this.A0K = A0z;
                                    }
                                }
                            } else if (A5u == -2) {
                                A12();
                                String[] strArr5 = A12;
                                String str = strArr5[6];
                                String str2 = strArr5[5];
                                int length = str.length();
                                int outputIndex = str2.length();
                                if (length == outputIndex) {
                                    String[] strArr6 = A12;
                                    strArr6[7] = "7r6cHUpNxW9OyUOBJtqRlgz4yWKhxuS5";
                                    strArr6[1] = "dTVs3H4w0ZVIwZf9Hv7c5Sb2vArQM5gg";
                                    return true;
                                }
                            } else if (A5u == -3) {
                                return true;
                            } else {
                                if (this.A0Q && (this.A0X || this.A04 == 2)) {
                                    A11();
                                }
                                return false;
                            }
                        } catch (IllegalStateException unused) {
                            A11();
                            if (this.A0a) {
                                A1n();
                            }
                            return false;
                        }
                    }
                }
                A5u = this.A0F.A5u(this.A0n);
                if (A5u < 0) {
                }
            }
            throw new RuntimeException();
        }
        if (this.A0P && this.A0V) {
            try {
                z = false;
                try {
                    processedOutputBuffer = A23(j, j2, this.A0F, this.A0K, this.A06, this.A0n.flags, this.A0n.presentationTimeUs, this.A0c, this.A0Y);
                } catch (IllegalStateException unused2) {
                    A11();
                    if (this.A0a) {
                        A1n();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            processedOutputBuffer = A23(j, j2, this.A0F, this.A0K, this.A06, this.A0n.flags, this.A0n.presentationTimeUs, this.A0c, this.A0Y);
        }
        if (processedOutputBuffer) {
            A1q(this.A0n.presentationTimeUs);
            boolean processedOutputBuffer2 = (this.A0n.flags & 4) != 0;
            A14();
            if (!processedOutputBuffer2) {
                return true;
            }
            A11();
        }
        return z;
    }

    private boolean A1F(MediaCrypto mediaCrypto, boolean z) throws BA {
        BA A00;
        if (this.A0L == null) {
            try {
                List<B3> A10 = A10(z);
                if (this.A0v) {
                    this.A0L = new ArrayDeque<>(A10);
                } else {
                    this.A0L = new ArrayDeque<>(Collections.singletonList(A10.get(0)));
                }
                this.A0H = null;
            } catch (BX e) {
                throw new BA(this.A0g, e, z, (int) AbstractC3914Pe1.b.c1);
            }
        }
        if (!this.A0i && A21()) {
            this.A0L.addFirst(B3.A02(A0x(799, 22, 19), this.A0g.A0W, this.A0g.A0W, null, false, true, false, false, false));
        }
        if (!this.A0L.isEmpty()) {
            B3 peekFirst = this.A0L.peekFirst();
            do {
                B3 peekFirst2 = this.A0L.peekFirst();
                if (!A25(peekFirst2)) {
                    return false;
                }
                try {
                    A17(peekFirst, peekFirst2, mediaCrypto);
                    return true;
                } catch (Exception e2) {
                    AbstractC04624g.A0A(A0x(220, 18, 67), A0x(C3503Kz.p0, 30, 18) + peekFirst2, e2);
                    this.A0L.removeFirst();
                    BA ba = new BA(this.A0g, e2, z, peekFirst2);
                    if (this.A0H == null) {
                        this.A0H = ba;
                    } else {
                        A00 = this.A0H.A00(ba);
                        this.A0H = A00;
                    }
                    if (this.A0L.isEmpty()) {
                        throw this.A0H;
                    }
                }
            } while (this.A0L.isEmpty());
            throw this.A0H;
        }
        throw new BA(this.A0g, (Throwable) null, z, (int) AbstractC3914Pe1.b.b1);
    }

    public static boolean A1G(C2242qI c2242qI) {
        return c2242qI.A07 == 0 || c2242qI.A07 == 2;
    }

    public static boolean A1H(B3 b3) {
        String str = b3.A03;
        if (C5C.A02 <= 17) {
            String name = A0x(566, 24, 127);
            if (!name.equals(str)) {
                String name2 = A0x(419, 31, 56);
                if (name2.equals(str)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (A0x(450, 31, 59).equals(r6) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
        if (A0x(481, 38, 125).equals(r6) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0093, code lost:
        if (A0x(450, 31, 59).equals(r6) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (A0x(541, 25, 116).equals(r6) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A1I(String str) {
        if (C5C.A02 <= 23) {
            String[] strArr = A12;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A12;
            strArr2[4] = "BtOe3nAvRfSweps9KMSbQL";
            strArr2[3] = "8BFXWDNhFQQqbiuKKB32KUMMZhTUo";
        }
        if (C5C.A02 <= 19) {
            if (A0x(787, 6, 102).equals(C5C.A03)) {
                String[] strArr3 = A12;
                if (strArr3[6].length() == strArr3[5].length()) {
                    String[] strArr4 = A12;
                    strArr4[7] = "lQUGM0gwxiouwODu2Sf00uvqO0zTfr3c";
                    strArr4[1] = "xcBcqPxRh43dKrs9lyzAmVul0JtIaCtf";
                }
            }
        }
        return false;
    }

    public static boolean A1J(String str) {
        return C5C.A02 == 21 && A0x(519, 22, 41).equals(str);
    }

    public static boolean A1K(String str) {
        if (C5C.A02 >= 18 && (C5C.A02 != 18 || (!A0x(382, 15, 68).equals(str) && !A0x(397, 22, 77).equals(str)))) {
            if (C5C.A02 == 19 && C5C.A06.startsWith(A0x(667, 7, 124))) {
                if (!A0x(C10997yd1.u1, 18, 34).equals(str)) {
                    if (A12[0].length() != 4) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A12;
                    strArr[6] = "NlNH7MPHVQXxq";
                    strArr[5] = "FDVIIX4T9j7Ji";
                    if (A0x(256, 25, 89).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A1L(String str, C2242qI c2242qI) {
        return C5C.A02 < 21 && c2242qI.A0X.isEmpty() && A0x(306, 25, 22).equals(str);
    }

    public static boolean A1M(String str, C2242qI c2242qI) {
        return C5C.A02 <= 18 && c2242qI.A06 == 1 && A0x(281, 25, 33).equals(str);
    }

    private boolean A1N(boolean z) throws AD {
        if (this.A0D == null || (!z && this.A0x)) {
            return false;
        }
        int A9A = this.A0D.A9A();
        if (A9A != 1) {
            return A9A != 4;
        }
        C05949q A80 = this.A0D.A80();
        C2242qI c2242qI = this.A0g;
        int drmSessionState = ((C05949q) AbstractC04543y.A01(this.A0D.A80())).A00;
        throw A1S(A80, c2242qI, drmSessionState);
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public void A1X() {
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public void A1Y() {
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public void A1Z() {
        this.A0g = null;
        A18(BC.A04);
        this.A0t.clear();
        this.A0L = null;
        try {
            A1n();
            try {
                if (this.A0D != null) {
                    this.A0D.AHc(null);
                }
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A0D != null) {
                    this.A0D.AHc(null);
                }
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A0E != null && this.A0E != this.A0D) {
                        this.A0E.AHc(null);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public void A1a(long j, boolean z) throws AD {
        this.A0X = false;
        this.A0a = false;
        if (this.A0F != null) {
            A1m();
        }
        this.A0I.A03.A01();
        this.A0t.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AE
    @MetaExoPlayerCustomization("D36797879: Adding implementation for calculating avg render time")
    public void A1b(boolean z, boolean z2) throws AD {
        this.A0h = new C6I();
        this.A0f = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.AE
    public void A1c(C2242qI[] c2242qIArr, long j, long j2) throws AD {
    }

    public final float A1f() {
        return this.A00;
    }

    public final long A1i() {
        return this.A0I.A02;
    }

    public final B0 A1j() {
        return this.A0F;
    }

    public final B3 A1k() {
        return this.A0G;
    }

    public void A1m() throws AD {
        this.A07 = C10323vs.b;
        A13();
        A14();
        this.A0d = true;
        this.A0e = false;
        this.A0c = false;
        this.A0u.clear();
        this.A0M = false;
        this.A0b = false;
        this.A0Y = false;
        this.A0B = C10323vs.b;
        if (!this.A0R) {
            boolean z = this.A0O;
            String[] strArr = A12;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A12[0] = "8Nzt";
            if ((!z || !this.A0V) && !A20()) {
                if (this.A04 != 0) {
                    A1n();
                    A1p();
                } else {
                    this.A0F.flush();
                    this.A0U = false;
                }
                if (!this.A0W && this.A0g != null) {
                    this.A03 = 1;
                    return;
                }
            }
        }
        A1n();
        A1p();
        if (!this.A0W) {
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.redexgen.X.9s, java.lang.String] */
    public void A1n() {
        this.A07 = C10323vs.b;
        this.A09 = C10323vs.b;
        this.A08 = C10323vs.b;
        A13();
        A14();
        this.A0C = null;
        this.A0T = false;
        this.A0e = false;
        this.A0c = false;
        this.A0u.clear();
        this.A0G = null;
        this.A0W = false;
        this.A0U = false;
        this.A0N = false;
        this.A0R = false;
        this.A02 = 0;
        this.A0Q = false;
        this.A0O = false;
        this.A0S = false;
        this.A0M = false;
        this.A0b = false;
        this.A0V = false;
        this.A03 = 0;
        this.A04 = 0;
        if (this.A0F != null) {
            this.A0h.A03++;
            try {
                B7.A02().A0L(A22(), this.A0z, this.A0y.A00(), EnumC1831jL.A05, this.A0J, this.A0F);
                this.A0F = null;
                InterfaceC05969s interfaceC05969s = this.A0D;
                String[] strArr = A12;
                if (strArr[6].length() == strArr[5].length()) {
                    String[] strArr2 = A12;
                    strArr2[7] = "JSCNcek9dAkyOPO1KkbpJsRj9JD6rmzz";
                    strArr2[1] = "RONQ7IAwO8Bcbv1Krrdz5fvlVLwlovmm";
                    if (interfaceC05969s != null && this.A0E != this.A0D) {
                        try {
                            this.A0D.AHc(null);
                            return;
                        } finally {
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                this.A0F = null;
                String[] strArr3 = A12;
                if (strArr3[7].charAt(2) != strArr3[1].charAt(2)) {
                    A12[2] = "iwo0woIVvHFpnZaxaWQfv32BCS9fYlqT";
                    if (this.A0D != null && this.A0E != this.A0D) {
                        try {
                            this.A0D.AHc(null);
                        } finally {
                        }
                    }
                    throw th;
                }
            }
            throw new RuntimeException();
        }
    }

    public void A1o() throws AD {
    }

    public final void A1p() throws AD {
        long j;
        if (this.A0F != null || this.A0g == null) {
            return;
        }
        this.A0D = this.A0E;
        if (this.A0D != null) {
            this.A0D.A7V();
            if (0 == 0) {
                if (this.A0D.A80() == null) {
                    return;
                }
            } else {
                throw new NullPointerException(A0x(759, 21, 39));
            }
        }
        try {
            if (!A1F(null, false)) {
                return;
            }
            String str = this.A0G.A03;
            this.A02 = A0w(str);
            this.A0N = A1L(str, this.A0g);
            this.A0R = A1K(str);
            this.A0Q = A1H(this.A0G);
            this.A0O = A1I(str);
            this.A0P = A1J(str);
            this.A0S = A1M(str, this.A0g);
            if (A9A() == 2) {
                j = SystemClock.elapsedRealtime() + 1000;
            } else {
                j = -9223372036854775807L;
            }
            this.A07 = j;
            A13();
            A14();
            this.A09 = C10323vs.b;
            this.A0d = true;
            this.A0h.A02++;
        } catch (BA e) {
            String mimeType = A12[0];
            if (mimeType.length() != 4) {
                throw new RuntimeException();
            }
            String[] strArr = A12;
            strArr[4] = "htoDBH0u2SWwWLv1LDVpoG";
            strArr[3] = "VZtqtU1mGbN1CVtxZAbUMauSXb3bc";
            if (this.A0m > 0 && (this.A09 == C10323vs.b || System.currentTimeMillis() - this.A09 <= this.A0m)) {
                if (this.A09 == C10323vs.b) {
                    String A0x = A0x(220, 18, 67);
                    String mimeType2 = A0x(59, 36, 3);
                    AbstractC04624g.A07(A0x, mimeType2);
                    this.A09 = System.currentTimeMillis();
                }
                if (this.A0L != null && this.A0L.isEmpty()) {
                    this.A0L = null;
                    return;
                }
                return;
            }
            throw A1S(e, this.A0g, AD1.p1);
        }
    }

    public void A1q(long j) {
    }

    @MetaExoPlayerCustomization("Needed for sr video effects")
    public void A1r(C2242qI c2242qI) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
        r2 = r8.A0F;
        r1 = r8.A0G;
        r0 = r8.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
        switch(A1g(r2, r1, r4, r0)) {
            case 0: goto L46;
            case 1: goto L44;
            case 2: goto L31;
            case 3: goto L33;
            default: goto L31;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        r7 = true;
        r8.A0W = true;
        r8.A03 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
        if (r8.A02 == 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
        if (r8.A02 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
        r0 = r8.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
        if (r0.A0L != r4.A0L) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        r0 = r8.A0g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
        if (r0.A0A != r4.A0A) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
        r8.A0M = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A1s(C2242qI c2242qI) throws AD {
        DrmInitData drmInitData;
        A1r(c2242qI);
        C2242qI c2242qI2 = this.A0g;
        this.A0g = c2242qI;
        C2242qI oldFormat = this.A0g;
        DrmInitData drmInitData2 = oldFormat.A0O;
        if (c2242qI2 == null) {
            drmInitData = null;
        } else {
            drmInitData = c2242qI2.A0O;
        }
        if (!C5C.A1E(drmInitData2, drmInitData)) {
            C2242qI oldFormat2 = this.A0g;
            if (oldFormat2.A0O != null) {
                if (this.A0r != null) {
                    A6 a6 = this.A0r;
                    C2242qI oldFormat3 = this.A0g;
                    this.A0E = a6.A3C(null, oldFormat3);
                    String[] strArr = A12;
                    if (strArr[7].charAt(2) != strArr[1].charAt(2)) {
                        String[] strArr2 = A12;
                        strArr2[4] = "XpQaMzaYCeQHSX1wHIt01O";
                        strArr2[3] = "hhT7VitQ1539e1hJWaIaN1DiIME5w";
                        if (this.A0E == this.A0D) {
                            InterfaceC05969s interfaceC05969s = this.A0E;
                            String[] strArr3 = A12;
                            if (strArr3[7].charAt(2) != strArr3[1].charAt(2)) {
                                A12[2] = "mOmb8wihr9xQYP3CL5DV18o0OoEn6eG9";
                                interfaceC05969s.AHc(null);
                            }
                        }
                    }
                    throw new RuntimeException();
                }
                throw A1S(new AnonymousClass70(A0x(C10997yd1.Q1, 34, 1)), this.A0g, AD1.t1);
            }
            this.A0E = null;
        }
        boolean z = false;
        if (this.A0E == this.A0D) {
            B0 b0 = this.A0F;
            String[] strArr4 = A12;
            if (strArr4[4].length() != strArr4[3].length()) {
                A12[2] = "hgu32AMElELcnmKjNvgDCLPWqu1wVZzY";
            }
        }
        if (!z) {
            this.A0L = null;
            if (this.A0U) {
                this.A04 = 1;
                return;
            }
            A1n();
            String[] strArr5 = A12;
            if (strArr5[4].length() == strArr5[3].length()) {
                String[] strArr6 = A12;
                strArr6[4] = "dwUbabJ3IwMscliKIocfEp";
                strArr6[3] = "JfvGwuyJKwyqA9Lq7c7l5Q2QpU3EJ";
                A1p();
                return;
            }
            String[] strArr7 = A12;
            strArr7[7] = "gISXyGsiclUqTl6XD9kKbrjQIkSYs6OI";
            strArr7[1] = "jfDUbzltiW2K1dT11OQ1e62SyOqvP2px";
            A1p();
        }
    }

    public void A1t(C2242qI c2242qI) throws AD {
    }

    public void A1z(String str, C2242qI c2242qI) throws AD {
        A1t(c2242qI);
    }

    public boolean A20() {
        return false;
    }

    public final boolean A21() {
        return A24(this.A0g);
    }

    public final boolean A24(C2242qI c2242qI) {
        if (c2242qI == null || !this.A0k || !A0x(838, 10, 89).equalsIgnoreCase(c2242qI.A0W)) {
            return false;
        }
        return true;
    }

    public boolean A25(B3 b3) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2151oo
    public boolean AAP() {
        return this.A0a;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2151oo
    @MetaExoPlayerCustomization("D18870411: Adding start stall debug reason")
    public boolean AAe() {
        if (this.A0g == null) {
            super.A0B = EnumC1801ir.A07;
        } else if (this.A0e) {
            super.A0B = EnumC1801ir.A0A;
        } else if (!A1d() && !A1B()) {
            super.A0B = EnumC1801ir.A06;
        }
        if (this.A0g != null) {
            boolean z = this.A0e;
            if (A12[2].charAt(29) == 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A12;
            strArr[7] = "joohYCoWTVCMZ7ZK6VknoEQ3356Yke9R";
            strArr[1] = "gcfLSJm2tOx4UzvBIoCvVtFxExIT9beD";
            if (!z && (A1d() || A1B() || (this.A07 != C10323vs.b && SystemClock.elapsedRealtime() < this.A07))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2151oo
    public void AIX(long j, long j2) throws AD {
        if (this.A0a) {
            A1o();
        } else if (this.A0g == null && !A1C(2)) {
        } else {
            A1p();
            if (this.A0F != null) {
                try {
                    try {
                        AnonymousClass54.A02(A0x(727, 12, 16));
                        while (A1E(j, j2)) {
                        }
                        while (A1A()) {
                        }
                        this.A08 = C10323vs.b;
                    } catch (IllegalStateException e) {
                        if (!A19()) {
                            throw A1S(e, this.A0g, AD1.r1);
                        }
                    }
                } finally {
                    AnonymousClass54.A00();
                }
            } else {
                this.A0h.A0A += A1Q(j);
                A1C(1);
            }
            this.A0h.A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC05497p
    public final int AKM(C2242qI c2242qI) throws AD {
        try {
            return A1h(this.A0s, this.A0r, c2242qI);
        } catch (BX e) {
            throw A1S(e, c2242qI, AD1.q1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AE, com.facebook.ads.redexgen.X.InterfaceC05497p
    public final int AKO() {
        return 8;
    }
}
