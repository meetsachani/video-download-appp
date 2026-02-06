package com.facebook.ads.androidx.media3.extractor.mkv;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.ColorInfo;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import com.facebook.ads.redexgen.X.AbstractC04543y;
import com.facebook.ads.redexgen.X.AbstractC04624g;
import com.facebook.ads.redexgen.X.C04634h;
import com.facebook.ads.redexgen.X.C04774v;
import com.facebook.ads.redexgen.X.C0778Hb;
import com.facebook.ads.redexgen.X.C0817Io;
import com.facebook.ads.redexgen.X.C0818Ip;
import com.facebook.ads.redexgen.X.C0819Iq;
import com.facebook.ads.redexgen.X.C2010mK;
import com.facebook.ads.redexgen.X.C2012mM;
import com.facebook.ads.redexgen.X.C2028mn;
import com.facebook.ads.redexgen.X.C2038my;
import com.facebook.ads.redexgen.X.C2Y;
import com.facebook.ads.redexgen.X.C3K;
import com.facebook.ads.redexgen.X.C5C;
import com.facebook.ads.redexgen.X.H9;
import com.facebook.ads.redexgen.X.HA;
import com.facebook.ads.redexgen.X.HD;
import com.facebook.ads.redexgen.X.HS;
import com.facebook.ads.redexgen.X.HV;
import com.facebook.ads.redexgen.X.HY;
import com.facebook.ads.redexgen.X.InterfaceC0780Hd;
import com.facebook.ads.redexgen.X.InterfaceC0814Il;
import com.facebook.ads.redexgen.X.InterfaceC2033ms;
import com.facebook.internal.q0;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o.C10323vs;
import o.C10997yd1;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C4731Xo;
import o.C5588cW;
import o.C8077mf;
import o.C8206nB;
import o.CK1;
import o.ED2;
import o.QC1;
import o.VN2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: assets/audience_network/classes2.dex */
public final class MatroskaExtractor implements H9 {
    public static byte[] A0t;
    public static String[] A0u = {"tBqjpPNwSsfRjGbhoSofYeEQJAfxpzeJ", "SQ32k5yHiSqu0tF5bV2mYZI8q27OK2Wk", "Ew8EcvFtYPYsbuW", "MeCkyRYcfoGShRSoQHq7qyLBTkTGcoSQ", "UyV8GtaWyEclMV8OhG", "yLkQb0Xo1O", "PFhexnCJ0GZtqtRWjlJ7uY4w9", "UodjFtXG6f6h7NmMQ857"};
    public static final HD A0v;
    public static final Map<String, Integer> A0w;
    public static final UUID A0x;
    public static final byte[] A0y;
    public static final byte[] A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    @MetaExoPlayerCustomization("Removed the final from the member variable")
    public SparseArray<C0817Io> A0P;
    public C04634h A0Q;
    public C04634h A0R;
    public HA A0S;
    public C0817Io A0T;
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "AR/VC customizations")
    public String A0U;
    public ByteBuffer A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public int[] A0f;
    public final C04774v A0g;
    public final C04774v A0h;
    public final C04774v A0i;
    public final C04774v A0j;
    public final C04774v A0k;
    public final C04774v A0l;
    public final C04774v A0m;
    public final C04774v A0n;
    public final C04774v A0o;
    public final C04774v A0p;
    public final InterfaceC0814Il A0q;
    public final C0819Iq A0r;
    public final boolean A0s;

    /* JADX WARN: Code restructure failed: missing block: B:177:0x00fe, code lost:
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0100, code lost:
        r0[0] = (byte) (r2 | 8);
        r12.A0l.A0f(0);
        r3.AIs(r12.A0l, 1, 1);
        r12.A09++;
        r12.A0g.A0f(0);
        r3.AIs(r12.A0g, 8, 1);
        r12.A09 += 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0209, code lost:
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x020d, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03fd, code lost:
        if (r5.equals(r6) != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03ff, code lost:
        r12.A0p.A0f(0);
        r3.AIr(r12.A0p, 4);
        r12.A09 += 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0414, code lost:
        return A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0425, code lost:
        if (r5.equals(r6) != false) goto L112;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0415  */
    @RequiresNonNull({"#2.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int A02(InterfaceC2033ms interfaceC2033ms, C0817Io c0817Io, int i, boolean z) throws IOException {
        String[] strArr;
        boolean A0B;
        byte[] A0l;
        if (A06(1012, 11, 56).equals(c0817Io.A0d)) {
            A0F(interfaceC2033ms, A10, i);
            return A00();
        }
        String[] strArr2 = A0u;
        if (strArr2[5].length() != strArr2[6].length()) {
            A0u[3] = "Q42iXR6evmRi7JQ7PxfR7toxYIITwFkY";
            if (A06(1002, 10, 101).equals(c0817Io.A0d)) {
                A0F(interfaceC2033ms, A0z, i);
                return A00();
            } else if (A06(1023, 13, 32).equals(c0817Io.A0d)) {
                A0F(interfaceC2033ms, A11, i);
                return A00();
            } else {
                InterfaceC0780Hd interfaceC0780Hd = c0817Io.A0b;
                if (!this.A0Y) {
                    if (c0817Io.A0i) {
                        this.A02 &= -1073741825;
                        int i2 = 128;
                        if (!this.A0b) {
                            interfaceC2033ms.readFully(this.A0l.A0l(), 0, 1);
                            this.A08++;
                            if ((this.A0l.A0l()[0] & 128) == 128) {
                                throw C3K.A01(A06(694, 35, 14), null);
                            }
                            this.A00 = this.A0l.A0l()[0];
                            this.A0b = true;
                        }
                        if ((this.A00 & 1) == 1) {
                            boolean z2 = (this.A00 & 2) == 2;
                            this.A02 |= 1073741824;
                            if (!this.A0Z) {
                                byte[] A0l2 = this.A0g.A0l();
                                String[] strArr3 = A0u;
                                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                                    String[] strArr4 = A0u;
                                    strArr4[5] = "0YZVfaON5K";
                                    strArr4[6] = "Vpm73VVBoM5AMHA6BL8GPMDLM";
                                    interfaceC2033ms.readFully(A0l2, 0, 8);
                                    this.A08 += 8;
                                    this.A0Z = true;
                                    A0l = this.A0l.A0l();
                                } else {
                                    interfaceC2033ms.readFully(A0l2, 0, 8);
                                    this.A08 += 8;
                                    this.A0Z = true;
                                    A0l = this.A0l.A0l();
                                }
                            }
                            if (z2) {
                                boolean z3 = this.A0a;
                                String[] strArr5 = A0u;
                                if (strArr5[5].length() == strArr5[6].length()) {
                                    throw new RuntimeException();
                                }
                                A0u[3] = "IbloDRbaqkSTIb2EEG1BJ7I1x09YBoFC";
                                if (!z3) {
                                    interfaceC2033ms.readFully(this.A0l.A0l(), 0, 1);
                                    this.A08++;
                                    this.A0l.A0f(0);
                                    this.A0B = this.A0l.A0I();
                                    this.A0a = true;
                                }
                                int i3 = this.A0B * 4;
                                this.A0l.A0d(i3);
                                interfaceC2033ms.readFully(this.A0l.A0l(), 0, i3);
                                this.A08 += i3;
                                short s = (short) ((this.A0B / 2) + 1);
                                int i4 = (s * 6) + 2;
                                if (this.A0V == null || this.A0V.capacity() < i4) {
                                    this.A0V = ByteBuffer.allocate(i4);
                                }
                                this.A0V.position(0);
                                this.A0V.putShort(s);
                                int i5 = 0;
                                for (int i6 = 0; i6 < this.A0B; i6++) {
                                    int i7 = i5;
                                    i5 = this.A0l.A0L();
                                    if (i6 % 2 != 0) {
                                        ByteBuffer byteBuffer = this.A0V;
                                        String[] strArr6 = A0u;
                                        if (strArr6[2].length() == strArr6[4].length()) {
                                            break;
                                        }
                                        String[] strArr7 = A0u;
                                        strArr7[2] = "aiG4mSAFtmR28a0";
                                        strArr7[4] = "af0fkPAZLGHpLmON09";
                                        byteBuffer.putInt(i5 - i7);
                                    } else {
                                        ByteBuffer byteBuffer2 = this.A0V;
                                        short s2 = (short) (i5 - i7);
                                        String[] strArr8 = A0u;
                                        if (strArr8[5].length() == strArr8[6].length()) {
                                            throw new RuntimeException();
                                        }
                                        String[] strArr9 = A0u;
                                        strArr9[5] = "ft008TAv7G";
                                        strArr9[6] = "haHnc3qulCtaE6iMk670OeuEn";
                                        byteBuffer2.putShort(s2);
                                    }
                                }
                                int i8 = (i - this.A08) - i5;
                                if (this.A0B % 2 == 1) {
                                    this.A0V.putInt(i8);
                                } else {
                                    this.A0V.putShort((short) i8);
                                    this.A0V.putInt(0);
                                }
                                this.A0h.A0j(this.A0V.array(), i4);
                                interfaceC0780Hd.AIs(this.A0h, i4, 1);
                                this.A09 += i4;
                            }
                        }
                    } else if (c0817Io.A0m != null) {
                        this.A0k.A0j(c0817Io.A0m, c0817Io.A0m.length);
                    }
                    A0B = c0817Io.A0B(z);
                    if (A0B) {
                        this.A02 |= 268435456;
                        this.A0o.A0d(0);
                        int A0A = (this.A0k.A0A() + i) - this.A08;
                        this.A0l.A0d(4);
                        this.A0l.A0l()[0] = (byte) ((A0A >> 24) & 255);
                        this.A0l.A0l()[1] = (byte) ((A0A >> 16) & 255);
                        this.A0l.A0l()[2] = (byte) ((A0A >> 8) & 255);
                        this.A0l.A0l()[3] = (byte) (A0A & 255);
                        interfaceC0780Hd.AIs(this.A0l, 4, 2);
                        this.A09 += 4;
                    }
                    this.A0Y = true;
                }
                int A0A2 = i + this.A0k.A0A();
                if (!A06(1207, 15, 14).equals(c0817Io.A0d)) {
                    String[] strArr10 = A0u;
                    if (strArr10[2].length() != strArr10[4].length()) {
                        A0u[3] = "azLjDRwnDORtAkbJr5UmBWWcvu9WrjdT";
                        if (!A06(1236, 16, 47).equals(c0817Io.A0d)) {
                            if (c0817Io.A0c != null) {
                                AbstractC04543y.A08(this.A0k.A0A() == 0);
                                c0817Io.A0c.A03(interfaceC2033ms);
                            }
                            while (this.A08 < A0A2) {
                                int A01 = A01(interfaceC2033ms, interfaceC0780Hd, A0A2 - this.A08);
                                this.A08 += A01;
                                this.A09 += A01;
                            }
                            String A06 = A06(271, 8, 117);
                            String str = c0817Io.A0d;
                            strArr = A0u;
                            if (strArr[1].charAt(1) == strArr[0].charAt(1)) {
                                A0u[3] = "L5Y1ZRMfFWOxp58RZlemSr0Ie3cKRoNn";
                            } else {
                                String[] strArr11 = A0u;
                                strArr11[2] = "6h0vzYYIjFmBqGs";
                                strArr11[4] = "2CBNjdNTCI84kXMqqr";
                            }
                        }
                    }
                }
                byte[] A0l3 = this.A0i.A0l();
                A0l3[0] = 0;
                A0l3[1] = 0;
                A0l3[2] = 0;
                int i9 = c0817Io.A0Q;
                int i10 = 4 - c0817Io.A0Q;
                while (this.A08 < A0A2) {
                    if (this.A0A == 0) {
                        A0G(interfaceC2033ms, A0l3, i10, i9);
                        this.A08 += i9;
                        this.A0i.A0f(0);
                        this.A0A = this.A0i.A0L();
                        this.A0j.A0f(0);
                        interfaceC0780Hd.AIr(this.A0j, 4);
                        String[] strArr12 = A0u;
                        if (strArr12[1].charAt(1) != strArr12[0].charAt(1)) {
                            String[] strArr13 = A0u;
                            strArr13[5] = "fro1mi6zSK";
                            strArr13[6] = "qDDF1oBUoQgRey5lTLsLsLE8f";
                            this.A09 += 4;
                        } else {
                            A0u[7] = "9yo0tJuahVLQaubMcBBhp2wjVELgngje";
                            this.A09 += 4;
                        }
                    } else {
                        int A012 = A01(interfaceC2033ms, interfaceC0780Hd, this.A0A);
                        this.A08 += A012;
                        this.A09 += A012;
                        this.A0A -= A012;
                    }
                }
                String A062 = A06(271, 8, 117);
                String str2 = c0817Io.A0d;
                strArr = A0u;
                if (strArr[1].charAt(1) == strArr[0].charAt(1)) {
                }
            }
        }
        throw new RuntimeException();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0t, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0t = new byte[]{90, C8077mf.A, C8077mf.q, 9, C8077mf.p, 90, C8077mf.B, 31, 90, 19, C8077mf.x, 90, C8077mf.E, 90, 57, C8077mf.q, 31, 9, 96, C3307Iz.e0, 53, 51, 52, 96, 34, C3307Iz.X, 96, C3307Iz.a0, C3307Iz.f0, 96, C3307Iz.V, 96, C8077mf.x, 50, C3307Iz.V, 35, C3307Iz.c0, 5, C3307Iz.f0, 52, 50, 57, 19, 93, 92, 71, 19, 64, 70, 67, 67, 92, 65, 71, 86, 87, 111, 122, 123, C3307Iz.f0, 112, 111, 122, QC1.w, C3307Iz.f0, 112, 111, 122, QC1.w, C3307Iz.f0, 112, 111, 122, QC1.w, C3307Iz.f0, C8077mf.z, 3, 1, 87, 9, C8077mf.z, 3, 1, 87, 9, C8077mf.z, 3, 1, 87, 31, C8077mf.z, 3, 0, 87, 19, 6, 4, 82, C8077mf.n, 19, 6, 4, 82, C8077mf.n, 19, 6, 4, 82, C8077mf.B, 19, 6, 5, 82, 0, 4, C8077mf.u, C8077mf.u, 36, 53, 53, 40, 47, C3307Iz.Y, 50, 2, 40, 49, C3307Iz.a0, 36, 51, C8077mf.n, C3307Iz.f0, C3307Iz.X, 36, 97, 94, 64, 94, 94, 92, C8077mf.A, 9, C8077mf.A, C8077mf.y, 101, 58, 36, ED2.a, 47, 40, 58, 36, ED2.a, 47, 40, 84, 62, 35, C3307Iz.c0, C3307Iz.a0, 62, 40, 40, 80, 78, 85, 69, 66, 62, 93, 94, 66, 66, 93, 84, 66, 66, QC1.w, 102, 124, QC1.w, 122, 10, 110, 112, 105, 99, 110, 108, C3307Iz.V, ED2.a, C3307Iz.e0, 48, C3307Iz.X, C3307Iz.Z, 79, C3307Iz.d0, 82, 2, 28, C8077mf.p, 19, 6, 4, 108, C8077mf.q, 112, C3307Iz.V, ED2.a, C3307Iz.e0, 51, 79, C3307Iz.V, 35, C3307Iz.e0, 31, 1, 17, C8077mf.p, C8077mf.m, 13, 82, 76, 67, 80, 94, 60, 85, 95, 92, 82, 71, 60, 90, 86, 86, 86, 82, 76, 67, 80, 94, 60, 90, 93, 71, 60, 81, 90, 84, C8077mf.n, C8077mf.u, C8077mf.G, C8077mf.p, 0, 98, 4, 3, C8077mf.C, 98, 1, 4, C8077mf.C, 116, 106, 97, 103, 96, 112, 125, 113, 56, C3307Iz.Y, 47, 54, C3307Iz.c0, 59, 48, 42, 105, 75, 68, 13, 94, 10, 89, 73, 75, 70, 79, 10, 94, 67, 71, 79, 73, 69, 78, 79, 10, 90, 88, 67, 69, 88, 10, 94, 69, 10, 94, 67, 71, 79, 73, 69, 78, 79, 121, 73, 75, 70, 79, 10, 72, 79, 67, 68, 77, 10, 89, 79, 94, 4, 5, C3307Iz.a0, 34, 35, C3307Iz.X, C8077mf.q, 34, 102, 47, 53, 102, C3307Iz.c0, 47, 53, 53, 47, 40, C3307Iz.V, 102, 47, 40, 102, C8077mf.u, 52, C3307Iz.Z, C3307Iz.X, C3307Iz.e0, 3, 40, 50, 52, ED2.a, 102, 35, 42, 35, C3307Iz.c0, 35, 40, 50, 117, 89, 91, 84, 95, 88, 95, 88, 81, C8077mf.z, 83, 88, 85, 68, 79, 70, 66, 95, 89, 88, C8077mf.z, 87, 88, 82, C8077mf.z, 85, 89, 91, 70, 68, 83, 69, 69, 95, 89, 88, C8077mf.z, 95, 69, C8077mf.z, 88, 89, 66, C8077mf.z, 69, 67, 70, 70, 89, 68, 66, 83, 82, 86, 122, 123, 97, 112, 123, 97, 86, 122, QC1.w, 101, 84, 121, 114, 122, 53, 107, 71, 70, 92, 77, 70, 92, 109, 70, 75, 105, 68, 79, 71, 8, 82, 126, Byte.MAX_VALUE, 101, 116, Byte.MAX_VALUE, 101, 84, Byte.MAX_VALUE, 114, 126, 117, QC1.w, Byte.MAX_VALUE, 118, 94, 99, 117, 116, 99, 49, 95, 115, 114, 104, 121, 114, 104, 89, 114, Byte.MAX_VALUE, 115, QC1.w, 117, 114, 123, 79, Byte.MAX_VALUE, 115, 108, 121, 60, 110, 67, 89, 73, 75, 88, 78, 67, 68, 77, 10, 70, 75, 89, 94, 10, 73, 95, 79, 10, 90, 69, 67, 68, 94, 10, 93, 67, 94, 66, 10, 95, 68, 79, 82, 90, 79, 73, 94, 79, 78, 10, 78, 95, 88, 75, 94, 67, 69, 68, C8077mf.r, 10, 13, C3307Iz.Y, 42, C8077mf.G, 48, 57, C3307Iz.d0, 105, 83, QC1.w, 116, 67, 110, 103, 114, 69, 114, 118, 115, 65, 114, 101, 100, 126, QC1.w, 121, 55, 71, 64, 79, 78, 34, 110, 99, 97, 107, 108, 101, 34, 113, 99, 111, 114, 110, 103, 34, 113, 107, QC1.w, 103, 34, 109, 119, 118, 34, 109, 100, 34, 112, 99, 108, 101, 103, C3307Iz.d0, 51, 52, 59, 58, 36, 19, C8077mf.A, C8077mf.u, 32, 19, 4, 5, 31, C8077mf.C, C8077mf.B, 86, 1, 40, C3307Iz.V, C3307Iz.a0, C3307Iz.V, 42, 48, 100, 119, 92, 81, 64, 75, 66, 70, 87, 86, C8077mf.u, 102, 64, 83, 81, 89, C8077mf.u, 84, 93, 71, 92, 86, C8077mf.u, 80, 71, 70, C8077mf.u, 113, 93, 92, 70, 87, 92, 70, 119, 92, 81, 121, 87, 75, 123, 118, C8077mf.u, 69, 83, 65, C8077mf.u, 92, 93, 70, C8077mf.u, 84, 93, 71, 92, 86, 71, 122, 118, 103, 108, 113, 107, 109, 108, 34, 96, 107, 118, 34, 107, 113, 34, 113, 103, 118, 34, 107, 108, 34, 113, 107, 101, 108, 99, 110, 34, 96, 123, 118, 103, 108, 69, 88, 71, 75, 94, C8077mf.r, 10, 121, 94, 75, 88, 94, 6, 10, 111, 68, 78, 6, 10, QC1.w, 79, 75, 78, 101, 88, 78, 79, 88, 6, 10, 102, 75, 83, 79, 88, 6, 10, 121, 94, 83, 70, 79, 6, 10, 100, 75, 71, 79, 6, 10, 103, 75, 88, 77, 67, 68, 102, 6, 10, 103, 75, 88, 77, 67, 68, QC1.w, 6, 10, 103, 75, 88, 77, 67, 68, 124, 6, 10, 111, 76, 76, 79, 73, 94, 6, 10, 126, 79, 82, 94, 56, C8077mf.x, C8077mf.E, 17, C8077mf.x, 1, C8077mf.D, 7, C8077mf.n, 85, C8077mf.r, C8077mf.C, C8077mf.r, C8077mf.B, C8077mf.r, C8077mf.E, 1, 85, C3307Iz.Y, C8077mf.r, C8077mf.r, C8077mf.H, 60, 49, 85, C8077mf.D, 7, 85, C3307Iz.Y, C8077mf.r, C8077mf.r, C8077mf.H, C3307Iz.X, C8077mf.D, 6, 28, 1, 28, C8077mf.D, C8077mf.E, 85, C8077mf.E, C8077mf.D, 1, 85, 19, C8077mf.D, 0, C8077mf.E, 17, C8077mf.p, 34, 55, 49, C3307Iz.d0, 48, 40, 34, 6, 59, 55, 49, 34, 32, 55, C3307Iz.d0, 49, 54, C8077mf.p, C8077mf.A, C8077mf.q, C8077mf.u, C8077mf.m, C8077mf.A, C8077mf.H, 91, 40, C8077mf.H, 28, C8077mf.z, C8077mf.H, C8077mf.y, C8077mf.q, 91, C8077mf.H, C8077mf.A, C8077mf.H, C8077mf.z, C8077mf.H, C8077mf.y, C8077mf.q, 8, 91, C8077mf.y, C8077mf.x, C8077mf.q, 91, 8, C8077mf.p, C8077mf.m, C8077mf.m, C8077mf.x, 9, C8077mf.q, C8077mf.H, 31, 32, 1, 78, C8077mf.B, C8077mf.q, 2, 7, 10, 78, C8077mf.D, 28, C8077mf.q, 13, 5, C8077mf.G, 78, C8077mf.C, C8077mf.m, 28, C8077mf.m, 78, 8, 1, C8077mf.E, 0, 10, 91, 122, 53, 99, 116, 121, 124, 113, 53, 99, 116, 103, 124, 123, 97, 53, 121, 112, 123, 114, 97, 125, 53, QC1.w, 116, 102, 126, 53, 115, 122, 96, 123, 113, C4715Xk.i, 49, 42, 56, C3307Iz.d0, C4715Xk.i, 59, C3307Iz.d0, 105, 101, 114, 126, 119, 108, C8077mf.y, 106, 
        125, 105, 58, 54, C4715Xk.i, C3307Iz.d0, 49, C4715Xk.i, 70, 40, 58, 58, 103, 107, 96, 113, 108, 96, C8077mf.E, 97, 96, 114, C8077mf.n, Byte.MAX_VALUE, 115, QC1.w, 105, 116, QC1.w, 3, 123, 105, 110, 122, QC1.w, QC1.w, 65, 77, 68, 93, 80, 65, 71, 80, 35, C8077mf.E, C8077mf.C, 0, 0, C8077mf.C, C8077mf.H, C8077mf.A, 80, 3, 5, C8077mf.u, 4, C8077mf.C, 4, 28, C8077mf.y, 80, 3, 17, C8077mf.G, 0, 28, C8077mf.y, 80, C8077mf.C, C8077mf.H, 80, 28, 17, 19, C8077mf.y, C8077mf.x, 80, C8077mf.u, 28, 31, 19, C8077mf.E, 94, 64, QC1.w, 122, 99, 99, 122, 125, 116, 51, 96, 102, 113, 103, 122, 103, Byte.MAX_VALUE, 118, 51, 96, 114, 126, 99, Byte.MAX_VALUE, 118, 51, 100, 122, 103, 123, 51, 125, 124, 51, 119, 102, 97, 114, 103, 122, 124, 125, C4715Xk.i, 81, 106, 97, 124, 116, 97, 103, 112, 97, 96, 36, 109, 96, 62, 36, 9, 50, 57, 36, C3307Iz.d0, 57, ED2.a, 40, 57, 56, 124, 48, C4715Xk.i, ED2.a, 53, 50, 59, 124, 42, C4715Xk.i, 48, C3307Iz.a0, 57, 102, 124, C3307Iz.e0, 36, 58, C3307Iz.e0, 74, 62, 55, C3307Iz.X, 56, C3307Iz.e0, 47, 90, 122, 115, 97, 124, 105, 107, C8077mf.B, 3, 101, Byte.MAX_VALUE, 99, 3, 109, 124, 102, 111, 125, 96, 117, 119, 4, 31, 121, 99, Byte.MAX_VALUE, 31, 113, 99, 96, 84, 93, 79, 82, 71, 69, 54, C3307Iz.e0, 75, 81, 77, C3307Iz.e0, 67, 84, 65, 60, 53, C3307Iz.Z, 58, 47, C3307Iz.e0, 94, 69, 35, 57, C3307Iz.X, 69, 57, 58, 117, 124, 110, 115, 102, 100, 107, C8077mf.n, 106, 112, 108, C8077mf.n, 107, 102, 117, 96, 76, 69, 87, 73, 53, 76, 92, 77, 53, 92, 85, 79, 72, 89, 89, 69, 76, 71, 91, 86, 92, 65, 82, C8077mf.u, C8077mf.E, C8077mf.u, C8077mf.x, 124, 2, C8077mf.m, 2, 4, 109, 79, 83, 68, QC1.w, 81, 78, 67, 66, 72, QC1.w, 85, 72, 83, 102, 10, C8077mf.A, C8077mf.A, C8077mf.A, 52, 40, ED2.a, 3, 42, 53, 56, 57, 51, 3, C3307Iz.f0, 51, 40, C8077mf.G, 113, 108, 101, 108, 56, 36, 51, C8077mf.q, C3307Iz.Y, 57, 52, 53, ED2.a, C8077mf.q, 34, ED2.a, 36, 17, 125, 97, 104, 96, 93, 65, 86, 106, 67, 92, 81, 80, 90, 106, 71, 90, 65, 116, C8077mf.B, 7, 2, 5, 34, C3307Iz.f0, 59, C4715Xk.i, 32, 60, 36, C3307Iz.f0, 56, C3307Iz.Z, 42, C3307Iz.c0, C3307Iz.V, 97, 57, C3307Iz.c0, C3307Iz.d0, 35, C8077mf.y, 7, 0, C8077mf.q};
    }

    static {
        A0B();
        A0v = new HD() { // from class: com.facebook.ads.redexgen.X.mL
            @Override // com.facebook.ads.redexgen.X.HD
            public final H9[] A5N() {
                return MatroskaExtractor.A0Q();
            }

            @Override // com.facebook.ads.redexgen.X.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A10 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 48, 48, 32, C3307Iz.e0, C3307Iz.e0, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 48, 48, 10};
        A0y = C5C.A1G(A06(729, 90, 38));
        A0z = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.d0};
        A11 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.f0, 48, 48, 48, 32, C3307Iz.e0, C3307Iz.e0, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, C3307Iz.f0, 48, 48, 48, 10};
        A0x = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put(A06(1285, 18, 43), 0);
        hashMap.put(A06(1303, 18, 80), 90);
        hashMap.put(A06(1321, 18, 92), 180);
        hashMap.put(A06(1339, 18, 57), Integer.valueOf((int) C4731Xo.d1));
        Map<String, Integer> trackNameToRotationDegrees = Collections.unmodifiableMap(hashMap);
        A0w = trackNameToRotationDegrees;
    }

    public MatroskaExtractor() {
        this(0);
    }

    public MatroskaExtractor(int i) {
        this(new C2012mM(), i);
    }

    public MatroskaExtractor(InterfaceC0814Il interfaceC0814Il, int i) {
        this.A0M = -1L;
        this.A0O = C10323vs.b;
        this.A0I = C10323vs.b;
        this.A0J = C10323vs.b;
        this.A0H = -1L;
        this.A0L = -1L;
        this.A0G = C10323vs.b;
        this.A0q = interfaceC0814Il;
        this.A0q.AAD(new C2010mK(this));
        this.A0s = (i & 1) == 0;
        this.A0r = new C0819Iq();
        this.A0P = new SparseArray<>();
        this.A0l = new C04774v(4);
        this.A0p = new C04774v(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0m = new C04774v(4);
        this.A0j = new C04774v(HS.A03);
        this.A0i = new C04774v(4);
        this.A0k = new C04774v();
        this.A0n = new C04774v();
        this.A0g = new C04774v(8);
        this.A0h = new C04774v();
        this.A0o = new C04774v();
        this.A0f = new int[1];
    }

    private int A00() {
        int sampleSize = this.A09;
        A0A();
        return sampleSize;
    }

    private int A01(InterfaceC2033ms interfaceC2033ms, InterfaceC0780Hd interfaceC0780Hd, int i) throws IOException {
        int strippedBytesLeft = this.A0k.A07();
        if (strippedBytesLeft > 0) {
            int bytesWritten = Math.min(i, strippedBytesLeft);
            interfaceC0780Hd.AIr(this.A0k, bytesWritten);
            return bytesWritten;
        }
        return interfaceC0780Hd.AIp(interfaceC2033ms, i, false);
    }

    private long A03(long j) throws C3K {
        if (this.A0O != C10323vs.b) {
            return C5C.A0U(j, this.A0O, 1000L);
        }
        throw C3K.A01(A06(279, 54, 38), null);
    }

    /* JADX WARN: Incorrect condition in loop: B:52:0x0053 */
    @MetaExoPlayerCustomization("Adding support AR/VR eventListener")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private HY A04(C04634h c04634h, C04634h c04634h2) {
        if (this.A0M == -1 || this.A0J == C10323vs.b || c04634h == null || c04634h.A02() == 0 || c04634h2 == null || c04634h2.A02() != c04634h.A02()) {
            return new C2028mn(this.A0J);
        }
        int A02 = c04634h.A02();
        int[] iArr = new int[A02];
        long[] timesUs = new long[A02];
        long[] durationsUs = new long[A02];
        long[] offsets = new long[A02];
        for (int i = 0; i < A02; i++) {
            offsets[i] = c04634h.A03(i);
            timesUs[i] = this.A0M + c04634h2.A03(i);
        }
        for (int i2 = 0; i2 < cuePointsSize; i2++) {
            int cuePointsSize = i2 + 1;
            iArr[i2] = (int) (timesUs[cuePointsSize] - timesUs[i2]);
            int i3 = i2 + 1;
            if (A0u[7].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0u;
            strArr[1] = "EcqUdVdOszDxTX1GLg4Sg6FEnSFxXYEO";
            strArr[0] = "f3IXvdxpqPdXnJQYi44axyFnZVKpD9LT";
            durationsUs[i2] = offsets[i3] - offsets[i2];
        }
        iArr[A02 - 1] = (int) ((this.A0M + this.A0N) - timesUs[A02 - 1]);
        durationsUs[A02 - 1] = this.A0J - offsets[A02 - 1];
        int cuePointsSize2 = A02 - 1;
        long j = durationsUs[cuePointsSize2];
        if (j <= 0) {
            AbstractC04624g.A07(A06(869, 17, 79), A06(499, 52, 38) + j);
            int cuePointsSize3 = iArr.length;
            iArr = Arrays.copyOf(iArr, cuePointsSize3 - 1);
            int cuePointsSize4 = timesUs.length;
            timesUs = Arrays.copyOf(timesUs, cuePointsSize4 - 1);
            int cuePointsSize5 = durationsUs.length;
            durationsUs = Arrays.copyOf(durationsUs, cuePointsSize5 - 1);
            int cuePointsSize6 = offsets.length;
            offsets = Arrays.copyOf(offsets, cuePointsSize6 - 1);
        }
        return new C2038my(iArr, timesUs, durationsUs, offsets);
    }

    private final C0817Io A05(int i) throws C3K {
        A0D(i);
        return this.A0T;
    }

    @EnsuresNonNull({"extractorOutput"})
    private void A09() {
        AbstractC04543y.A02(this.A0S);
    }

    private void A0A() {
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0Y = false;
        this.A0b = false;
        this.A0a = false;
        this.A0B = 0;
        this.A00 = (byte) 0;
        this.A0Z = false;
        this.A0k.A0d(0);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private void A0C(int i) throws C3K {
        if (this.A0R != null && this.A0Q != null) {
            return;
        }
        throw C3K.A01(A06(631, 8, 72) + i + A06(0, 18, 118), null);
    }

    @EnsuresNonNull({"currentTrack"})
    private void A0D(int i) throws C3K {
        if (this.A0T != null) {
            return;
        }
        throw C3K.A01(A06(631, 8, 72) + i + A06(18, 24, 76), null);
    }

    private void A0E(InterfaceC2033ms interfaceC2033ms, int i) throws IOException {
        if (this.A0l.A0A() >= i) {
            return;
        }
        if (this.A0l.A08() < i) {
            this.A0l.A0c(Math.max(this.A0l.A08() * 2, i));
        }
        interfaceC2033ms.readFully(this.A0l.A0l(), this.A0l.A0A(), i - this.A0l.A0A());
        this.A0l.A0e(i);
    }

    private void A0F(InterfaceC2033ms interfaceC2033ms, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        int sizeWithPrefix = this.A0n.A08();
        if (sizeWithPrefix < length) {
            int sizeWithPrefix2 = length + i;
            this.A0n.A0i(Arrays.copyOf(bArr, sizeWithPrefix2));
        } else {
            byte[] A0l = this.A0n.A0l();
            int sizeWithPrefix3 = bArr.length;
            System.arraycopy(bArr, 0, A0l, 0, sizeWithPrefix3);
        }
        byte[] A0l2 = this.A0n.A0l();
        int sizeWithPrefix4 = bArr.length;
        interfaceC2033ms.readFully(A0l2, sizeWithPrefix4, i);
        this.A0n.A0f(0);
        this.A0n.A0e(length);
    }

    private void A0G(InterfaceC2033ms interfaceC2033ms, byte[] bArr, int i, int i2) throws IOException {
        int min = Math.min(i2, this.A0k.A07());
        int pendingStrippedBytes = i + min;
        interfaceC2033ms.readFully(bArr, pendingStrippedBytes, i2 - min);
        if (min > 0) {
            this.A0k.A0k(bArr, i, min);
        }
    }

    private final void A0H(C0817Io c0817Io, int i, InterfaceC2033ms interfaceC2033ms, int i2) throws IOException {
        if (i == 4) {
            if (A06(q0.q1, 5, 88).equals(c0817Io.A0d)) {
                this.A0o.A0d(i2);
                interfaceC2033ms.readFully(this.A0o.A0l(), 0, i2);
                return;
            }
        }
        interfaceC2033ms.AK3(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0067, code lost:
        if (A06(1023, 13, 32).equals(r15.A0d) != false) goto L30;
     */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0I(C0817Io c0817Io, long j, int i, int i2, int i3) {
        int i4 = i2;
        if (c0817Io.A0c != null) {
            c0817Io.A0c.A04(c0817Io.A0b, j, i, i4, i3, c0817Io.A0a);
        } else {
            if (!A06(1012, 11, 56).equals(c0817Io.A0d)) {
                boolean equals = A06(1002, 10, 101).equals(c0817Io.A0d);
                if (A0u[7].length() == 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0u;
                strArr[2] = "WUIRLQPYspP06jV";
                strArr[4] = "IKED97K2catgdGs9C7";
                if (!equals) {
                }
            }
            int i5 = this.A03;
            String A06 = A06(869, 17, 79);
            if (i5 > 1) {
                AbstractC04624g.A07(A06, A06(1044, 40, 124));
            } else {
                int supplementalDataSize = (this.A0D > C10323vs.b ? 1 : (this.A0D == C10323vs.b ? 0 : -1));
                if (supplementalDataSize == 0) {
                    AbstractC04624g.A07(A06, A06(1084, 42, 31));
                } else {
                    A0K(c0817Io.A0d, this.A0D, this.A0n.A0l());
                    int A09 = this.A0n.A09();
                    while (true) {
                        if (A09 >= this.A0n.A0A()) {
                            break;
                        } else if (this.A0n.A0l()[A09] == 0) {
                            this.A0n.A0e(A09);
                            break;
                        } else {
                            A09++;
                        }
                    }
                    c0817Io.A0b.AIr(this.A0n, this.A0n.A0A());
                    i4 += this.A0n.A0A();
                }
            }
            if ((268435456 & i) != 0) {
                if (this.A03 > 1) {
                    C04774v c04774v = this.A0o;
                    String[] strArr2 = A0u;
                    if (strArr2[5].length() != strArr2[6].length()) {
                        String[] strArr3 = A0u;
                        strArr3[1] = "YYsRZc3YFjjR6whUDZFnD2lR7qwR3xQu";
                        strArr3[0] = "iPCTe70V3RVZDGWrxpNWfBz9u5oW1N1r";
                        c04774v.A0d(0);
                    } else {
                        A0u[3] = "dzMIMRhm8kdQoNm85GuPxt1OFbbjzRAM";
                        c04774v.A0d(0);
                    }
                } else {
                    int A0A = this.A0o.A0A();
                    c0817Io.A0b.AIs(this.A0o, A0A, 2);
                    i4 += A0A;
                }
            }
            InterfaceC0780Hd interfaceC0780Hd = c0817Io.A0b;
            C0778Hb c0778Hb = c0817Io.A0a;
            String[] strArr4 = A0u;
            if (strArr4[5].length() != strArr4[6].length()) {
                String[] strArr5 = A0u;
                strArr5[1] = "aEC8Q2NERZhQKbY6SRlQy9B7oXJI5nDv";
                strArr5[0] = "M5BYDTb0V4PW6b5ziiSZklpOYuXfea8a";
                interfaceC0780Hd.AIu(j, i, i4, i3, c0778Hb);
            } else {
                interfaceC0780Hd.AIu(j, i, i4, i3, c0778Hb);
            }
        }
        this.A0X = true;
    }

    private final void A0J(C0817Io c0817Io, InterfaceC2033ms interfaceC2033ms, int i) throws IOException {
        int i2;
        int i3;
        i2 = c0817Io.A0n;
        if (i2 != 1685485123) {
            i3 = c0817Io.A0n;
            String[] strArr = A0u;
            if (strArr[5].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[2] = "z7J25JPdzWy80Kd";
            strArr2[4] = "xEqpvZ1X3IvVWW9v69";
            if (i3 != 1685480259) {
                interfaceC2033ms.AK3(i);
                return;
            }
        }
        c0817Io.A0k = new byte[i];
        interfaceC2033ms.readFully(c0817Io.A0k, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A0K(String str, long j, byte[] bArr) {
        char c;
        String[] strArr;
        byte[] A0O;
        int i;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    c = 1;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        String[] strArr2 = A0u;
                        strArr2[1] = "3I7Szd6Jo4OcbWqNbOfUGxKnAqqsYD1t";
                        strArr2[0] = "pL7tYzN7WsijDsV9dRV4eebVOXyQpiyb";
                        switch (c) {
                            case 0:
                                A0O = A0O(j, A06(75, 19, 63), 1000L);
                                i = 19;
                                break;
                            case 1:
                                A0O = A0O(j, A06(56, 19, 70), 10000L);
                                i = 21;
                                break;
                            case 2:
                                A0O = A0O(j, A06(94, 19, 58), 1000L);
                                i = 25;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(A0O, 0, bArr, i, A0O.length);
                        return;
                    }
                    throw new RuntimeException();
                }
                c = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
            case 1045209816:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) != strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "hOu1CB2frr";
                    strArr4[6] = "vZrPTqET3LPV3435yPIFppSrF";
                    if (str.equals(A06(1023, 13, 32))) {
                        c = 2;
                        strArr = A0u;
                        if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                        }
                    }
                    c = 65535;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    }
                }
                throw new RuntimeException();
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    c = 0;
                    strArr = A0u;
                    if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    }
                    throw new RuntimeException();
                }
                c = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
            default:
                c = 65535;
                strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                }
                throw new RuntimeException();
        }
    }

    private boolean A0L(HV hv, long j) {
        if (this.A0c) {
            this.A0L = j;
            hv.A00 = this.A0H;
            this.A0c = false;
            return true;
        } else if (!this.A0e || this.A0L == -1) {
            return false;
        } else {
            hv.A00 = this.A0L;
            this.A0L = -1L;
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0126, code lost:
        if (r8.equals(A06(221, 16, 31)) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0128, code lost:
        r0 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0140, code lost:
        if (r8.equals(A06(221, 16, 31)) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01b7, code lost:
        if (r3 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01b9, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01c8, code lost:
        if (r3 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x02fe, code lost:
        if (r3 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0300, code lost:
        r0 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0304, code lost:
        if (r3 != false) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0M(String str) {
        char c;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A06(1178, 14, 32))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals(A06(1222, 14, 102))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                boolean equals = str.equals(A06(207, 8, 108));
                if (A0u[7].length() != 16) {
                    A0u[3] = "TzGfoRLFuVo7UwCT9UC1nsicdZWWDAlG";
                    break;
                }
                break;
            case -1784763192:
                if (str.equals(A06(263, 8, 57))) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals(A06(271, 8, 117))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals(A06(CK1.w, 9, 108))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals(A06(198, 9, 79))) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals(A06(1252, 15, 22))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals(A06(984, 8, 98))) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals(A06(1192, 15, 60))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals(A06(1207, 15, 14))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals(A06(1036, 8, 30))) {
                    c = C5588cW.p;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals(A06(C10997yd1.o1, 14, 29))) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals(A06(135, 5, 19))) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals(A06(C3503Kz.d0, 5, 90))) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals(A06(C3503Kz.i0, 5, 119))) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str.equals(A06(1166, 5, 119))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                boolean equals2 = str.equals(A06(1275, 5, 72));
                if (A0u[7].length() == 16) {
                    String[] strArr = A0u;
                    strArr[1] = "SKDMUFdFJPMXubKSzq5KjaXHZATq3OUF";
                    strArr[0] = "Ghj8mYRv51e2wMnC9FEKaN4eHBhVqIAQ";
                    break;
                } else {
                    String[] strArr2 = A0u;
                    strArr2[5] = "F8wfBLRr4t";
                    strArr2[6] = "m6KkyOOVg8X0ndZUQG2mgE6hH";
                    break;
                }
            case 82338134:
                if (str.equals(A06(q0.q1, 5, 88))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals(A06(992, 10, 54))) {
                    c = VN2.b;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals(A06(1267, 8, 31))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals(A06(150, 13, 119))) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                String[] strArr3 = A0u;
                if (strArr3[1].charAt(1) == strArr3[0].charAt(1)) {
                    String[] strArr4 = A0u;
                    strArr4[5] = "W6YXr1xbPB";
                    strArr4[6] = "Gbq52SJwNi9qAu2AjciLJePWO";
                    break;
                } else {
                    A0u[3] = "7MRDpRiWazQnh7KPJAJl4vRwzLx1BKGb";
                    break;
                }
            case 725948237:
                boolean equals3 = str.equals(A06(237, 13, 31));
                if (A0u[7].length() != 16) {
                    A0u[7] = "zUYiT8JvqtzTusXd0wwrN";
                    if (equals3) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 725957860:
                if (str.equals(A06(250, 13, 65))) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str.equals(A06(1002, 10, 101))) {
                    c = C5588cW.n;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str.equals(A06(1236, 16, 47))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                String[] strArr5 = A0u;
                if (strArr5[2].length() != strArr5[4].length()) {
                    String[] strArr6 = A0u;
                    strArr6[1] = "l6rfMqL6uO4vJf2wQ9BlcS80aS9RAxdU";
                    strArr6[0] = "kDo3bZmmggKJDtMwpBeZtATIDXYPDXog";
                    if (str.equals(A06(1023, 13, 32))) {
                        c = C5588cW.f706o;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            case 1422270023:
                if (str.equals(A06(1012, 11, 56))) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals(A06(1171, 7, 100))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals(A06(177, 6, 53))) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals(A06(C10997yd1.n2, 6, 35))) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals(A06(C10997yd1.z1, 6, 82))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
                return true;
            default:
                return false;
        }
    }

    public static byte[] A0O(long j, String str, long j2) {
        AbstractC04543y.A07(j != C10323vs.b);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        int minutes = (int) ((j4 - (i3 * 1000000)) / j2);
        return C5C.A1G(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(minutes)));
    }

    public static int[] A0P(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public static /* synthetic */ H9[] A0Q() {
        return new H9[]{new MatroskaExtractor()};
    }

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "Adding support for AR/VR TAGs")
    public final int A0R(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case C10997yd1.Q1 /* 186 */:
            case C10997yd1.z1 /* 215 */:
            case C10997yd1.n1 /* 231 */:
            case C10997yd1.u1 /* 238 */:
            case C10997yd1.o2 /* 241 */:
            case C10997yd1.w1 /* 251 */:
            case C10997yd1.G1 /* 16871 */:
            case C10997yd1.d2 /* 16980 */:
            case C10997yd1.c1 /* 17029 */:
            case C10997yd1.a1 /* 17143 */:
            case C10997yd1.g2 /* 18401 */:
            case C10997yd1.j2 /* 18408 */:
            case C10997yd1.a2 /* 20529 */:
            case C10997yd1.b2 /* 20530 */:
            case C10997yd1.i1 /* 21420 */:
            case C10997yd1.w2 /* 21432 */:
            case C10997yd1.R1 /* 21680 */:
            case C10997yd1.T1 /* 21682 */:
            case C10997yd1.S1 /* 21690 */:
            case C10997yd1.C1 /* 21930 */:
            case C10997yd1.y2 /* 21945 */:
            case C10997yd1.z2 /* 21946 */:
            case C10997yd1.A2 /* 21947 */:
            case C10997yd1.B2 /* 21948 */:
            case C10997yd1.C2 /* 21949 */:
            case C10997yd1.E1 /* 21998 */:
            case C10997yd1.L1 /* 22186 */:
            case C10997yd1.M1 /* 22203 */:
            case C10997yd1.W1 /* 25188 */:
            case C10997yd1.N1 /* 30114 */:
            case C10997yd1.r2 /* 30321 */:
            case C10997yd1.D1 /* 2352003 */:
            case C10997yd1.k1 /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case C10997yd1.I1 /* 21358 */:
            case C10997yd1.p2 /* 2274716 */:
                return 3;
            case 160:
            case C10997yd1.t1 /* 166 */:
            case C10997yd1.y1 /* 174 */:
            case C10997yd1.n2 /* 183 */:
            case C10997yd1.l2 /* 187 */:
            case 224:
            case 225:
            case C10997yd1.F1 /* 16868 */:
            case C10997yd1.i2 /* 18407 */:
            case C10997yd1.g1 /* 19899 */:
            case C10997yd1.c2 /* 20532 */:
            case C10997yd1.f2 /* 20533 */:
            case C10997yd1.x2 /* 21936 */:
            case C10997yd1.D2 /* 21968 */:
            case C10997yd1.Z1 /* 25152 */:
            case 26568:
            case C10997yd1.Y1 /* 28032 */:
            case 29555:
            case C10997yd1.s1 /* 30113 */:
            case C10997yd1.q2 /* 30320 */:
            case C10997yd1.f1 /* 290298740 */:
            case 307544935:
            case 357149030:
            case C10997yd1.x1 /* 374648427 */:
            case C10997yd1.d1 /* 408125543 */:
            case 440786851:
            case C10997yd1.k2 /* 475249515 */:
            case C10997yd1.m1 /* 524531317 */:
                return 1;
            case C10997yd1.q1 /* 161 */:
            case C10997yd1.o1 /* 163 */:
            case C10997yd1.v1 /* 165 */:
            case C10997yd1.H1 /* 16877 */:
            case C10997yd1.e2 /* 16981 */:
            case C10997yd1.h2 /* 18402 */:
            case C10997yd1.h1 /* 21419 */:
            case C10997yd1.K1 /* 25506 */:
            case C10997yd1.s2 /* 30322 */:
                String[] strArr = A0u;
                if (strArr[2].length() != strArr[4].length()) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "HyhNlEIHHjvGo8KvAMWihGCcOuKz7U7o";
                    strArr2[0] = "rV4cPIzb4RrvL4U1RF1zVSCUyrwoic3K";
                    return 4;
                }
                throw new RuntimeException();
            case 181:
            case C10997yd1.l1 /* 17545 */:
            case C10997yd1.E2 /* 21969 */:
            case C10997yd1.F2 /* 21970 */:
            case C10997yd1.G2 /* 21971 */:
            case C10997yd1.H2 /* 21972 */:
            case C10997yd1.I2 /* 21973 */:
            case C10997yd1.J2 /* 21974 */:
            case C10997yd1.K2 /* 21975 */:
            case C10997yd1.L2 /* 21976 */:
            case C10997yd1.M2 /* 21977 */:
            case C10997yd1.N2 /* 21978 */:
            case C10997yd1.t2 /* 30323 */:
            case C10997yd1.u2 /* 30324 */:
            case C10997yd1.v2 /* 30325 */:
                return 5;
            case 17543:
            case 17827:
                return 6;
            default:
                return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x00cd, code lost:
        if (r5 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00d5, code lost:
        if (r14.A0K == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00dc, code lost:
        if (r14.A0C != 475249515) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00de, code lost:
        r14.A0H = r14.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00f1, code lost:
        if (r5 != (-1)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01eb, code lost:
        throw com.facebook.ads.redexgen.X.C3K.A01(A06(819, 50, 121), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:?, code lost:
        return;
     */
    /* JADX WARN: Incorrect condition in loop: B:165:0x017e */
    /* JADX WARN: Incorrect condition in loop: B:169:0x018b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0S(int i) throws C3K {
        A09();
        switch (i) {
            case 160:
                if (this.A05 == 2) {
                    C0817Io c0817Io = this.A0P.get(this.A06);
                    c0817Io.A06();
                    if (this.A0E > 0 && A06(C10997yd1.z1, 6, 82).equals(c0817Io.A0d)) {
                        this.A0o.A0i(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.A0E).array());
                    }
                    int sampleFlags = 0;
                    if (A0u[7].length() != 16) {
                        String[] strArr = A0u;
                        strArr[5] = "BDPY36VwNm";
                        strArr[6] = "7hC1KMOm7DpnqonjeX0jtoaYt";
                        for (int sampleOffset = 0; sampleOffset < i; sampleOffset++) {
                            int i2 = this.A0f[sampleOffset];
                            sampleFlags += i2;
                        }
                        for (int i3 = 0; i3 < sampleOffset; i3++) {
                            long j = this.A0F;
                            int sampleOffset2 = c0817Io.A0I;
                            long j2 = j + ((sampleOffset2 * i3) / 1000);
                            int i4 = this.A02;
                            if (i3 == 0 && !this.A0W) {
                                i4 |= 1;
                            }
                            int i5 = this.A0f[i3];
                            sampleFlags -= i5;
                            A0I(c0817Io, j2, i4, i5, sampleFlags);
                        }
                        this.A05 = 0;
                        return;
                    }
                    throw new RuntimeException();
                }
                return;
            case C10997yd1.y1 /* 174 */:
                C0817Io c0817Io2 = (C0817Io) AbstractC04543y.A02(this.A0T);
                if (c0817Io2.A0d != null) {
                    if (A0M(c0817Io2.A0d)) {
                        c0817Io2.A0G(this.A0S, c0817Io2.A0R);
                        this.A0P.put(c0817Io2.A0R, c0817Io2);
                    }
                    this.A0T = null;
                    return;
                }
                throw C3K.A01(A06(333, 40, 74), null);
            case C10997yd1.g1 /* 19899 */:
                int i6 = this.A0C;
                String[] strArr2 = A0u;
                if (strArr2[1].charAt(1) != strArr2[0].charAt(1)) {
                    A0u[7] = "tg6sq0stTi0cIlF7Upi0qsQ5QklGxJF";
                    break;
                } else {
                    String[] strArr3 = A0u;
                    strArr3[2] = "yLIpCO5kJmqKflO";
                    strArr3[4] = "mFIbnXIm9TTTynra4E";
                    break;
                }
            case C10997yd1.Z1 /* 25152 */:
                A0D(i);
                if (!this.A0T.A0i) {
                    return;
                }
                if (this.A0T.A0a != null) {
                    this.A0T.A0Z = new DrmInitData(new DrmInitData.SchemeData(C2Y.A03, A06(1365, 10, 66), this.A0T.A0a.A03));
                    return;
                }
                throw C3K.A01(A06(639, 55, 62), null);
            case C10997yd1.Y1 /* 28032 */:
                A0D(i);
                if (!this.A0T.A0i || this.A0T.A0m == null) {
                    return;
                }
                throw C3K.A01(A06(373, 53, 58), null);
            case 357149030:
                int i7 = (this.A0O > C10323vs.b ? 1 : (this.A0O == C10323vs.b ? 0 : -1));
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "WZACEI803UG8FVl";
                if (i7 == 0) {
                    this.A0O = 1000000L;
                }
                if (this.A0I != C10323vs.b) {
                    this.A0J = A03(this.A0I);
                    return;
                }
                return;
            case C10997yd1.x1 /* 374648427 */:
                if (this.A0P.size() != 0) {
                    this.A0S.A6O();
                    return;
                }
                throw C3K.A01(A06(925, 26, 98), null);
            case C10997yd1.k2 /* 475249515 */:
                if (!this.A0e) {
                    this.A0S.AJ7(A04(this.A0R, this.A0Q));
                    this.A0e = true;
                }
                this.A0R = null;
                this.A0Q = null;
                return;
            default:
                return;
        }
    }

    public final void A0T(int i, double d) throws C3K {
        switch (i) {
            case 181:
                C0817Io A05 = A05(i);
                int i2 = (int) d;
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[7] = "mnSBpt4UIloiGRhCy1GZQUK3TYQANP";
                A05.A0T = i2;
                return;
            case C10997yd1.l1 /* 17545 */:
                this.A0I = (long) d;
                return;
            case C10997yd1.E2 /* 21969 */:
                A05(i).A06 = (float) d;
                return;
            case C10997yd1.F2 /* 21970 */:
                C0817Io A052 = A05(i);
                if (A0u[7].length() != 16) {
                    A0u[7] = "bgRhYiIqKVlSmtLlUnVbMuj";
                    A052.A07 = (float) d;
                    return;
                }
                A052.A07 = (float) d;
                return;
            case C10997yd1.G2 /* 21971 */:
                A05(i).A04 = (float) d;
                return;
            case C10997yd1.H2 /* 21972 */:
                A05(i).A05 = (float) d;
                return;
            case C10997yd1.I2 /* 21973 */:
                A05(i).A02 = (float) d;
                return;
            case C10997yd1.J2 /* 21974 */:
                A05(i).A03 = (float) d;
                return;
            case C10997yd1.K2 /* 21975 */:
                A05(i).A0B = (float) d;
                return;
            case C10997yd1.L2 /* 21976 */:
                C0817Io A053 = A05(i);
                float f = (float) d;
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    A0u[7] = "0K";
                    A053.A0C = f;
                    return;
                }
                throw new RuntimeException();
            case C10997yd1.M2 /* 21977 */:
                A05(i).A00 = (float) d;
                return;
            case C10997yd1.N2 /* 21978 */:
                A05(i).A01 = (float) d;
                return;
            case C10997yd1.t2 /* 30323 */:
                A05(i).A0A = (float) d;
                return;
            case C10997yd1.u2 /* 30324 */:
                A05(i).A08 = (float) d;
                return;
            case C10997yd1.v2 /* 30325 */:
                A05(i).A09 = (float) d;
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x01bc, code lost:
        if ((r4[2] & 128) == 128) goto L57;
     */
    /* JADX WARN: Incorrect condition in loop: B:201:0x01d2 */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x033a A[LOOP:4: B:242:0x0338->B:243:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0265 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0U(int i, int i2, InterfaceC2033ms interfaceC2033ms) throws IOException {
        int i3;
        int charAt;
        int totalSamplesSize;
        int timecode;
        int totalSamplesSize2 = 0;
        int i4 = 1;
        switch (i) {
            case C10997yd1.q1 /* 161 */:
            case C10997yd1.o1 /* 163 */:
                if (this.A05 == 0) {
                    this.A06 = (int) this.A0r.A05(interfaceC2033ms, false, true, 8);
                    this.A07 = this.A0r.A04();
                    String[] strArr = A0u;
                    if (strArr[5].length() == strArr[6].length()) {
                        this.A0D = C10323vs.b;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    } else {
                        String[] strArr2 = A0u;
                        strArr2[1] = "LCHoyUIFh4JbWXc3a57uog3rKRFOb5wV";
                        strArr2[0] = "47gJribS0awN4nsHBZkjm7XOEmPrRfLr";
                        this.A0D = C10323vs.b;
                        this.A05 = 1;
                        this.A0l.A0d(0);
                    }
                }
                C0817Io c0817Io = this.A0P.get(this.A06);
                if (c0817Io != null) {
                    c0817Io.A06();
                    if (this.A05 == 1) {
                        A0E(interfaceC2033ms, 3);
                        int byteValue = (this.A0l.A0l()[2] & 6) >> 1;
                        int i5 = 255;
                        if (byteValue != 0) {
                            A0E(interfaceC2033ms, 4);
                            int timecode2 = this.A0l.A0l()[3];
                            this.A03 = (timecode2 & 255) + 1;
                            int[] iArr = this.A0f;
                            int timecode3 = this.A03;
                            this.A0f = A0P(iArr, timecode3);
                            if (byteValue == 2) {
                                int timecode4 = this.A07;
                                int timecode5 = this.A03;
                                int i6 = ((i2 - timecode4) - 4) / timecode5;
                                int[] iArr2 = this.A0f;
                                int blockLacingSampleSize = this.A03;
                                Arrays.fill(iArr2, 0, blockLacingSampleSize, i6);
                            } else if (byteValue != 1) {
                                if (byteValue == 3) {
                                    int i7 = 0;
                                    int sampleIndex = 4;
                                    int i8 = 0;
                                    while (i8 < this.A03 - i4) {
                                        this.A0f[i8] = totalSamplesSize2;
                                        sampleIndex++;
                                        A0E(interfaceC2033ms, sampleIndex);
                                        C04774v c04774v = this.A0l;
                                        if (A0u[7].length() == 16) {
                                            break;
                                        } else {
                                            A0u[7] = "lQQ4f1MYxOwR1g4uON0whOI";
                                            if (c04774v.A0l()[sampleIndex - 1] != 0) {
                                                long j = 0;
                                                int i9 = 0;
                                                while (i9 < 8) {
                                                    int i10 = i4 << (7 - i9);
                                                    C04774v c04774v2 = this.A0l;
                                                    String[] strArr3 = A0u;
                                                    String str = strArr3[1];
                                                    String str2 = strArr3[0];
                                                    int charAt2 = str.charAt(1);
                                                    int lengthMask = str2.charAt(1);
                                                    if (charAt2 != lengthMask) {
                                                        A0u[3] = "6gmtIRdzQjg9uolj5CgbNQmEFE2eXosQ";
                                                        if ((c04774v2.A0l()[sampleIndex - 1] & i10) != 0) {
                                                            int totalSamplesSize3 = sampleIndex - 1;
                                                            sampleIndex += i9;
                                                            A0E(interfaceC2033ms, sampleIndex);
                                                            byte[] A0l = this.A0l.A0l();
                                                            i3 = totalSamplesSize3 + 1;
                                                            int lengthMask2 = ~i10;
                                                            j = A0l[totalSamplesSize3] & i5 & lengthMask2;
                                                            while (i3 < sampleIndex) {
                                                                int readPosition = i3 + 1;
                                                                j = (j << 8) | (this.A0l.A0l()[i3] & i5);
                                                                i3 = readPosition;
                                                            }
                                                            if (i8 > 0) {
                                                                j -= (1 << ((i9 * 7) + 6)) - 1;
                                                            }
                                                        } else {
                                                            i9++;
                                                            i4 = 1;
                                                        }
                                                    } else if ((c04774v2.A0l()[sampleIndex - 1] & i10) != 0) {
                                                        int totalSamplesSize32 = sampleIndex - 1;
                                                        sampleIndex += i9;
                                                        A0E(interfaceC2033ms, sampleIndex);
                                                        byte[] A0l2 = this.A0l.A0l();
                                                        i3 = totalSamplesSize32 + 1;
                                                        int lengthMask22 = ~i10;
                                                        j = A0l2[totalSamplesSize32] & i5 & lengthMask22;
                                                        while (i3 < sampleIndex) {
                                                        }
                                                        if (i8 > 0) {
                                                        }
                                                    } else {
                                                        i9++;
                                                        i4 = 1;
                                                    }
                                                    if (j < -2147483648L && j <= 2147483647L) {
                                                        int i11 = (int) j;
                                                        int[] iArr3 = this.A0f;
                                                        if (i8 != 0) {
                                                            i11 += this.A0f[i8 - 1];
                                                        }
                                                        iArr3[i8] = i11;
                                                        i7 += this.A0f[i8];
                                                        i8++;
                                                        i5 = 255;
                                                        totalSamplesSize2 = 0;
                                                        i4 = 1;
                                                    } else {
                                                        throw C3K.A01(A06(578, 37, 14), null);
                                                    }
                                                }
                                                if (j < -2147483648L) {
                                                }
                                                throw C3K.A01(A06(578, 37, 14), null);
                                            }
                                            throw C3K.A01(A06(951, 33, 25), null);
                                        }
                                    }
                                    this.A0f[this.A03 - 1] = ((i2 - this.A07) - sampleIndex) - i7;
                                } else {
                                    throw C3K.A01(A06(1141, 25, 80) + byteValue, null);
                                }
                            } else {
                                int i12 = 0;
                                int i13 = 4;
                                int i14 = 0;
                                while (true) {
                                    int i15 = this.A03;
                                    if (A0u[3].charAt(5) != 'R') {
                                        if (i14 >= i15 - 1) {
                                        }
                                        this.A0f[i14] = 0;
                                        while (true) {
                                            i13++;
                                            A0E(interfaceC2033ms, i13);
                                            byte[] A0l3 = this.A0l.A0l();
                                            String[] strArr4 = A0u;
                                            String str3 = strArr4[1];
                                            String str4 = strArr4[0];
                                            charAt = str3.charAt(1);
                                            totalSamplesSize = str4.charAt(1);
                                            if (charAt == totalSamplesSize) {
                                                String[] strArr5 = A0u;
                                                strArr5[1] = "QqySTVYSyUdR3w6zpaSbgPrcegDpRTeR";
                                                strArr5[0] = "gT3bwZtYi7wT97ycLVgitbKLuY9aoVNS";
                                                int totalSamplesSize4 = i13 - 1;
                                                int i16 = A0l3[totalSamplesSize4] & 255;
                                                int[] iArr4 = this.A0f;
                                                int totalSamplesSize5 = iArr4[i14];
                                                iArr4[i14] = totalSamplesSize5 + i16;
                                                if (i16 != 255) {
                                                    break;
                                                }
                                            } else {
                                                A0u[7] = "opIzPavLvAV6dvwDrp1";
                                                int totalSamplesSize6 = i13 - 1;
                                                int i17 = A0l3[totalSamplesSize6] & 255;
                                                int[] iArr5 = this.A0f;
                                                int totalSamplesSize7 = iArr5[i14];
                                                iArr5[i14] = totalSamplesSize7 + i17;
                                                if (i17 != 255) {
                                                    break;
                                                }
                                            }
                                        }
                                        int totalSamplesSize8 = this.A0f[i14];
                                        i12 += totalSamplesSize8;
                                        i14++;
                                    } else {
                                        String[] strArr6 = A0u;
                                        strArr6[1] = "uG7prxZBXLM0QG5e8GSw94nYMCP7upCE";
                                        strArr6[0] = "tV31aGArCsXy4K1N5Jjs7nQ9FZDzw28J";
                                        if (i14 >= i15 - 1) {
                                        }
                                        this.A0f[i14] = 0;
                                        while (true) {
                                            i13++;
                                            A0E(interfaceC2033ms, i13);
                                            byte[] A0l32 = this.A0l.A0l();
                                            String[] strArr42 = A0u;
                                            String str32 = strArr42[1];
                                            String str42 = strArr42[0];
                                            charAt = str32.charAt(1);
                                            totalSamplesSize = str42.charAt(1);
                                            if (charAt == totalSamplesSize) {
                                            }
                                        }
                                        int totalSamplesSize82 = this.A0f[i14];
                                        i12 += totalSamplesSize82;
                                        i14++;
                                    }
                                }
                                int totalSamplesSize9 = this.A07;
                                this.A0f[this.A03 - 1] = ((i2 - totalSamplesSize9) - i13) - i12;
                            }
                        } else {
                            this.A03 = 1;
                            this.A0f = A0P(this.A0f, 1);
                            this.A0f[0] = (i2 - this.A07) - 3;
                        }
                        int lacing = this.A0l.A0l()[0];
                        this.A0F = this.A0G + A03((lacing << 8) | (this.A0l.A0l()[1] & 255));
                        int timecode6 = c0817Io.A0V;
                        if (timecode6 != 2) {
                            if (i == 163) {
                                byte[] A0l4 = this.A0l.A0l();
                                String[] strArr7 = A0u;
                                String str5 = strArr7[1];
                                String str6 = strArr7[0];
                                int charAt3 = str5.charAt(1);
                                int timecode7 = str6.charAt(1);
                                if (charAt3 == timecode7) {
                                    throw new RuntimeException();
                                }
                                String[] strArr8 = A0u;
                                strArr8[1] = "Vc6YaXBr4sE6Z9Kledba3u83scjXoejR";
                                strArr8[0] = "GPxnjQ5uiYxzVhoi9JJVxDxAifN9s8px";
                                break;
                            }
                            timecode = 0;
                            int timecode8 = timecode == 0 ? 1 : 0;
                            this.A02 = timecode8;
                            this.A05 = 2;
                            this.A04 = 0;
                        }
                        timecode = 1;
                        if (timecode == 0) {
                        }
                        this.A02 = timecode8;
                        this.A05 = 2;
                        this.A04 = 0;
                    }
                    if (i == 163) {
                        while (r1 < timecode) {
                            int[] iArr6 = this.A0f;
                            int timecode9 = this.A04;
                            int A02 = A02(interfaceC2033ms, c0817Io, iArr6[timecode9], false);
                            c0817Io = c0817Io;
                            A0I(c0817Io, this.A0F + ((this.A04 * c0817Io.A0I) / 1000), this.A02, A02, 0);
                            this.A04++;
                        }
                        this.A05 = 0;
                        return;
                    }
                    while (this.A04 < this.A03) {
                        this.A0f[this.A04] = A02(interfaceC2033ms, c0817Io, this.A0f[this.A04], true);
                        this.A04++;
                    }
                    return;
                }
                interfaceC2033ms.AK3(i2 - this.A07);
                this.A05 = 0;
                return;
            case C10997yd1.v1 /* 165 */:
                if (this.A05 != 2) {
                    return;
                }
                A0H(this.A0P.get(this.A06), this.A01, interfaceC2033ms, i2);
                return;
            case C10997yd1.H1 /* 16877 */:
                A0J(A05(i), interfaceC2033ms, i2);
                return;
            case C10997yd1.e2 /* 16981 */:
                A0D(i);
                this.A0T.A0m = new byte[i2];
                interfaceC2033ms.readFully(this.A0T.A0m, 0, i2);
                return;
            case C10997yd1.h2 /* 18402 */:
                byte[] bArr = new byte[i2];
                interfaceC2033ms.readFully(bArr, 0, i2);
                A05(i).A0a = new C0778Hb(1, bArr, 0, 0);
                return;
            case C10997yd1.h1 /* 21419 */:
                Arrays.fill(this.A0m.A0l(), (byte) 0);
                interfaceC2033ms.readFully(this.A0m.A0l(), 4 - i2, i2);
                this.A0m.A0f(0);
                this.A0C = (int) this.A0m.A0Q();
                return;
            case C10997yd1.K1 /* 25506 */:
                A0D(i);
                String[] strArr9 = A0u;
                if (strArr9[1].charAt(1) != strArr9[0].charAt(1)) {
                    A0u[3] = "vSk1rRCvXwYs114cFInjW7yvt4gWKzzv";
                    this.A0T.A0j = new byte[i2];
                    interfaceC2033ms.readFully(this.A0T.A0j, 0, i2);
                    return;
                }
                break;
            case C10997yd1.s2 /* 30322 */:
                A0D(i);
                this.A0T.A0l = new byte[i2];
                interfaceC2033ms.readFully(this.A0T.A0l, 0, i2);
                return;
            default:
                throw C3K.A01(A06(1126, 15, 8) + i, null);
        }
        throw new RuntimeException();
    }

    public final void A0V(int i, long j) throws C3K {
        String A06 = A06(42, 14, 63);
        switch (i) {
            case 131:
                A05(i).A0V = (int) j;
                return;
            case 136:
                A05(i).A0f = j == 1;
                return;
            case 155:
                this.A0D = A03(j);
                return;
            case 159:
                A05(i).A0E = (int) j;
                return;
            case 176:
                A05(i).A0W = (int) j;
                return;
            case 179:
                A0C(i);
                this.A0R.A04(A03(j));
                return;
            case C10997yd1.Q1 /* 186 */:
                A05(i).A0M = (int) j;
                return;
            case C10997yd1.z1 /* 215 */:
                A05(i).A0R = (int) j;
                return;
            case C10997yd1.n1 /* 231 */:
                this.A0G = A03(j);
                return;
            case C10997yd1.u1 /* 238 */:
                this.A01 = (int) j;
                return;
            case C10997yd1.o2 /* 241 */:
                if (this.A0d) {
                    return;
                }
                A0C(i);
                this.A0Q.A04(j);
                this.A0d = true;
                return;
            case C10997yd1.w1 /* 251 */:
                this.A0W = true;
                return;
            case C10997yd1.G1 /* 16871 */:
                A05(i).A0n = (int) j;
                return;
            case C10997yd1.d2 /* 16980 */:
                String[] strArr = A0u;
                if (strArr[1].charAt(1) != strArr[0].charAt(1)) {
                    String[] strArr2 = A0u;
                    strArr2[1] = "siSTSWWHFDsKrirn3iU8fidRJrb4DuSX";
                    strArr2[0] = "o7Su23MSMUKyfq0AiKXYGeUTl03UpruG";
                    if (j == 3) {
                        return;
                    }
                } else {
                    String[] strArr3 = A0u;
                    strArr3[5] = "wDyyIq2mnN";
                    strArr3[6] = "u9jmr3hENDVfo4ybwkpsevoxR";
                    if (j == 3) {
                        return;
                    }
                }
                throw C3K.A01(A06(426, 16, 25) + j + A06, null);
            case C10997yd1.c1 /* 17029 */:
                if (j >= 1 && j <= 2) {
                    return;
                }
                throw C3K.A01(A06(559, 19, 27) + j + A06, null);
            case C10997yd1.a1 /* 17143 */:
                if (j == 1) {
                    return;
                }
                throw C3K.A01(A06(615, 16, 122) + j + A06, null);
            case C10997yd1.g2 /* 18401 */:
                if (j == 5) {
                    return;
                }
                throw C3K.A01(A06(CK1.p, 15, 36) + j + A06, null);
            case C10997yd1.j2 /* 18408 */:
                if (j == 1) {
                    return;
                }
                throw C3K.A01(A06(113, 22, 77) + j + A06, null);
            case C10997yd1.a2 /* 20529 */:
                if (j == 0) {
                    return;
                }
                throw C3K.A01(A06(457, 21, 29) + j + A06, null);
            case C10997yd1.b2 /* 20530 */:
                if (j == 1) {
                    return;
                }
                throw C3K.A01(A06(478, 21, 16) + j + A06, null);
            case C10997yd1.i1 /* 21420 */:
                this.A0K = this.A0M + j;
                return;
            case C10997yd1.w2 /* 21432 */:
                int i2 = (int) j;
                A0D(i);
                switch (i2) {
                    case 0:
                        this.A0T.A0U = 0;
                        return;
                    case 1:
                        this.A0T.A0U = 2;
                        return;
                    case 3:
                        this.A0T.A0U = 1;
                        return;
                    case 15:
                        this.A0T.A0U = 3;
                        return;
                    default:
                        return;
                }
            case C10997yd1.R1 /* 21680 */:
                A05(i).A0L = (int) j;
                return;
            case C10997yd1.T1 /* 21682 */:
                A05(i).A0K = (int) j;
                return;
            case C10997yd1.S1 /* 21690 */:
                A05(i).A0J = (int) j;
                return;
            case C10997yd1.C1 /* 21930 */:
                A05(i).A0g = j == 1;
                return;
            case C10997yd1.y2 /* 21945 */:
                A0D(i);
                switch ((int) j) {
                    case 1:
                        C0817Io c0817Io = this.A0T;
                        if (A0u[7].length() != 16) {
                            String[] strArr4 = A0u;
                            strArr4[1] = "46IydxS7gy6otlVQjCqCZWblmnAwVrZG";
                            strArr4[0] = "ABdhU4etfaEDzGqzhVxfZNO7CdkZTY0J";
                            c0817Io.A0F = 2;
                            return;
                        }
                        c0817Io.A0F = 2;
                        return;
                    case 2:
                        this.A0T.A0F = 1;
                        return;
                    default:
                        return;
                }
            case C10997yd1.z2 /* 21946 */:
                A0D(i);
                int A01 = ColorInfo.A01((int) j);
                if (A01 == -1) {
                    return;
                }
                this.A0T.A0H = A01;
                return;
            case C10997yd1.A2 /* 21947 */:
                A0D(i);
                this.A0T.A0h = true;
                int A00 = ColorInfo.A00((int) j);
                if (A00 == -1) {
                    return;
                }
                this.A0T.A0G = A00;
                return;
            case C10997yd1.B2 /* 21948 */:
                A05(i).A0O = (int) j;
                return;
            case C10997yd1.C2 /* 21949 */:
                A05(i).A0P = (int) j;
                return;
            case C10997yd1.E1 /* 21998 */:
                A05(i).A0N = (int) j;
                return;
            case C10997yd1.L1 /* 22186 */:
                A05(i).A0X = j;
                return;
            case C10997yd1.M1 /* 22203 */:
                A05(i).A0Y = j;
                return;
            case C10997yd1.W1 /* 25188 */:
                A05(i).A0D = (int) j;
                return;
            case C10997yd1.N1 /* 30114 */:
                this.A0E = j;
                return;
            case C10997yd1.r2 /* 30321 */:
                A0D(i);
                switch ((int) j) {
                    case 0:
                        this.A0T.A0S = 0;
                        return;
                    case 1:
                        this.A0T.A0S = 1;
                        return;
                    case 2:
                        this.A0T.A0S = 2;
                        return;
                    case 3:
                        this.A0T.A0S = 3;
                        return;
                    default:
                        return;
                }
            case C10997yd1.D1 /* 2352003 */:
                C0817Io A05 = A05(i);
                if (A0u[3].charAt(5) != 'R') {
                    throw new RuntimeException();
                }
                A0u[3] = "17DkRR24xbcR08jR5ve3iaIolPHvV07P";
                A05.A0I = (int) j;
                return;
            case C10997yd1.k1 /* 2807729 */:
                this.A0O = j;
                return;
            default:
                return;
        }
    }

    public final void A0W(int i, long j, long j2) throws C3K {
        A09();
        switch (i) {
            case 160:
                this.A0W = false;
                this.A0E = 0L;
                return;
            case C10997yd1.y1 /* 174 */:
                this.A0T = new C0817Io();
                return;
            case C10997yd1.l2 /* 187 */:
                this.A0d = false;
                return;
            case C10997yd1.g1 /* 19899 */:
                this.A0C = -1;
                this.A0K = -1L;
                return;
            case C10997yd1.f2 /* 20533 */:
                A05(i).A0i = true;
                return;
            case C10997yd1.D2 /* 21968 */:
                A05(i).A0h = true;
                return;
            case C10997yd1.Z1 /* 25152 */:
            default:
                return;
            case C10997yd1.d1 /* 408125543 */:
                if (this.A0M == -1 || this.A0M == j) {
                    this.A0M = j;
                    this.A0N = j2;
                    return;
                }
                throw C3K.A01(A06(886, 39, 119), null);
            case C10997yd1.k2 /* 475249515 */:
                this.A0R = new C04634h();
                this.A0Q = new C04634h();
                return;
            case C10997yd1.m1 /* 524531317 */:
                if (this.A0e) {
                    return;
                }
                if (this.A0s && this.A0H != -1) {
                    this.A0c = true;
                    return;
                }
                this.A0S.AJ7(new C2028mn(this.A0J));
                this.A0e = true;
                return;
        }
    }

    @MetaExoPlayerCustomization("Adding support for AR/VR TAGs")
    public final void A0X(int i, String str) throws C3K {
        switch (i) {
            case 134:
                A05(i).A0d = str;
                return;
            case 17026:
                if (!A06(1375, 4, 110).equals(str) && !A06(1357, 8, 67).equals(str)) {
                    throw C3K.A01(A06(551, 8, 69) + str + A06(42, 14, 63), null);
                }
                return;
            case 17827:
                this.A0U = str;
                return;
            case C10997yd1.I1 /* 21358 */:
                C0817Io A05 = A05(i);
                if (A0u[7].length() != 16) {
                    String[] strArr = A0u;
                    strArr[1] = "fMu5gmFUMMjyE5zZcj2yfEtnORci9Tka";
                    strArr[0] = "H9jO6y53WPcXDhmRgvdqczqosoX1IojD";
                    A05.A0e = str;
                    return;
                }
                throw new RuntimeException();
            case C10997yd1.p2 /* 2274716 */:
                A05(i).A0o = str;
                return;
            default:
                return;
        }
    }

    public final boolean A0Y(int i) {
        if (i != 357149030 && i != 524531317) {
            String[] strArr = A0u;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0u;
            strArr2[5] = "AFdTkHzIX2";
            strArr2[6] = "QjCHXWDM6RodCI1HM4Zn3pBBf";
            if (i != 475249515 && i != 374648427) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AAC(HA ha) {
        this.A0S = ha;
    }

    /* JADX WARN: Incorrect condition in loop: B:43:0x0027 */
    @Override // com.facebook.ads.redexgen.X.H9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AHL(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        this.A0X = false;
        boolean z = true;
        while (z && !this.A0X) {
            z = this.A0q.AHO(interfaceC2033ms);
            if (z && A0L(hv, interfaceC2033ms.A8n())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < i; i++) {
            C0817Io valueAt = this.A0P.valueAt(i);
            valueAt.A06();
            valueAt.A0E();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AHb() {
    }

    /* JADX WARN: Incorrect condition in loop: B:12:0x001e */
    @Override // com.facebook.ads.redexgen.X.H9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AJ6(long j, long j2) {
        this.A0G = C10323vs.b;
        this.A05 = 0;
        this.A0q.reset();
        this.A0r.A06();
        A0A();
        for (int i = 0; i < i; i++) {
            this.A0P.valueAt(i).A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final boolean AK5(InterfaceC2033ms interfaceC2033ms) throws IOException {
        return new C0818Ip().A01(interfaceC2033ms);
    }
}
