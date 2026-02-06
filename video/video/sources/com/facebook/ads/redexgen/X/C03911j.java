package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import o.AD1;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.CK1;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.1j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03911j extends AQ {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, 100, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, 113, 57, 48, 34, 113, 32, 36, 52, 35, 40, 113, 48, ED2.a, 53, 126, 62, 35, 113, 55, 35, 48, 54, 60, 52, ED2.a, C3307Iz.X, 125, 113, C3307Iz.Y, 57, 56, 50, 57, 113, 48, 35, 52, 113, ED2.a, 62, C3307Iz.X, 113, 34, 36, C3307Iz.V, C3307Iz.V, 62, 35, C3307Iz.X, 52, 53, Byte.MAX_VALUE, 113, C8077mf.y, 56, 53, 113, 40, 62, 36, 113, 50, 48, C4715Xk.i, C4715Xk.i, 113, 4, 35, 56, Byte.MAX_VALUE, C3307Iz.V, 48, 35, 34, 52, 121, QC1.w, 113, 62, ED2.a, 113, 48, 113, 34, C3307Iz.X, 35, 56, ED2.a, 54, 113, 50, 62, ED2.a, C3307Iz.X, 48, 56, ED2.a, 56, ED2.a, 54, 113, 118, 110, 118, 113, 62, 35, 113, 118, 114, 118, 110, 113, 4, 34, 52, 113, 4, 35, 56, Byte.MAX_VALUE, 55, 35, 62, 60, C8077mf.A, 56, C4715Xk.i, 52, 121, ED2.a, 52, C3307Iz.Y, 113, C8077mf.A, 56, C4715Xk.i, 52, 121, C3307Iz.V, 48, C3307Iz.X, 57, QC1.w, QC1.w, 113, C3307Iz.X, 62, 113, 48, C3307Iz.Z, 62, 56, 53, 113, C3307Iz.X, 57, 56, 34, Byte.MAX_VALUE, 113, C3307Iz.V, 48, C3307Iz.X, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, ED2.a, C3307Iz.X, 108, 116, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AGi(C04905i c04905i) throws C2173pA {
        AnonymousClass54.A02(A01(0, 15, 71));
        Uri uri = c04905i.A06;
        this.A01 = uri;
        A0G(c04905i);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(c04905i.A04);
                this.A00 = c04905i.A03 == -1 ? this.A02.length() - c04905i.A04 : c04905i.A03;
                AnonymousClass54.A00();
                if (this.A00 >= 0) {
                    this.A03 = true;
                    A0H(c04905i);
                    long j = this.A00;
                    if (A05[1].length() != 32) {
                        String[] strArr = A05;
                        strArr[0] = "xa7zJISj9";
                        strArr[2] = "YSvWE2PgVF009LXgrm";
                        return j;
                    }
                    throw new RuntimeException();
                }
                throw new C2173pA(null, null, 2008);
            } catch (IOException e) {
                throw new C2173pA(e, 2000);
            }
        } catch (Throwable th) {
            AnonymousClass54.A00();
            throw th;
        }
    }

    static {
        A02();
    }

    public C03911j() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        if (r0 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static RandomAccessFile A00(Uri uri) throws C2173pA {
        boolean A00;
        int i = 2006;
        try {
            return new RandomAccessFile((String) AbstractC04543y.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e) {
            boolean isEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (isEmpty && TextUtils.isEmpty(uri.getFragment())) {
                if (C5C.A02 >= 21) {
                    A00 = C04925k.A00(e.getCause());
                }
                i = AD1.h1;
                throw new C2173pA(e, i);
            }
            throw new C2173pA(String.format(A01(30, CK1.x, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new C2173pA(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C2173pA(e3, 2000);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final Uri A9P() {
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r6.A03 = false;
        A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r4 != false) goto L22;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws C2173pA {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                boolean z = this.A03;
                String[] strArr = A05;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[3] = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR";
                strArr2[7] = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt";
                if (z) {
                    this.A03 = false;
                    A0E();
                }
            } catch (IOException e) {
                throw new C2173pA(e, 2000);
            }
        } catch (Throwable th) {
            this.A02 = null;
            boolean z2 = this.A03;
            String[] strArr3 = A05;
            if (strArr3[3].charAt(29) != strArr3[7].charAt(29)) {
                String[] strArr4 = A05;
                strArr4[0] = "Vm3YcALUN";
                strArr4[2] = "c4edS4Kr4EVyTdnKAl";
            } else {
                String[] strArr5 = A05;
                strArr5[5] = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z";
                strArr5[4] = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P";
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i, int i2) throws C2173pA {
        if (i2 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                AnonymousClass54.A02(A01(15, 14, 75));
                int read = ((RandomAccessFile) C5C.A0f(this.A02)).read(bArr, i, (int) Math.min(this.A00, i2));
                if (read > 0) {
                    this.A00 -= read;
                    A0F(read);
                }
                return read;
            } catch (IOException e) {
                throw new C2173pA(e, 2000);
            }
        } finally {
            AnonymousClass54.A00();
        }
    }
}
