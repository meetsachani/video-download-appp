package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import o.C10323vs;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.pj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2207pj implements AnonymousClass24 {
    public static byte[] A0H;
    public static String[] A0I = {"AtN4gZlBq", "c6vG0ZoB350sNCwGTcbmyQxG", "GzjisXMF7MeBETThzgY0McLZmUxvZEHG", "X6Q", "OR9IAwpAbXPQPDykEqLOHO0nD", "OJOMvHQBuYweGyqOlvOJ7Ft7l3L2", "Cgb", "Ei80eZ3oJ"};
    public static final AnonymousClass23<C2207pj> A0J;
    public static final Object A0K;
    public static final C2231q7 A0L;
    public static final Object A0M;
    public static final String A0N;
    public static final String A0O;
    public static final String A0P;
    public static final String A0Q;
    public static final String A0R;
    public static final String A0S;
    public static final String A0T;
    public static final String A0U;
    public static final String A0V;
    public static final String A0W;
    public static final String A0X;
    public static final String A0Y;
    public static final String A0Z;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C2234qA A08;
    public Object A0A;
    @Deprecated
    public Object A0B;
    public boolean A0D;
    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public Object A0C = A0K;
    public C2231q7 A09 = A0L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C2207pj A00(Bundle bundle) {
        C2234qA c2234qA;
        Bundle bundle2 = bundle.getBundle(A0W);
        C2231q7 A6f = bundle2 != null ? C2231q7.A08.A6f(bundle2) : C2231q7.A09;
        long j = bundle.getLong(A0Y, C10323vs.b);
        long j2 = bundle.getLong(A0Z, C10323vs.b);
        long j3 = bundle.getLong(A0P, C10323vs.b);
        boolean z = bundle.getBoolean(A0T, false);
        boolean z2 = bundle.getBoolean(A0R, false);
        Bundle bundle3 = bundle.getBundle(A0V);
        if (bundle3 != null) {
            c2234qA = C2234qA.A06.A6f(bundle3);
        } else {
            c2234qA = null;
            if (A0I[2].charAt(1) != 'z') {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[6] = "auZ";
            strArr[3] = "aKQ";
        }
        boolean z3 = bundle.getBoolean(A0S, false);
        long j4 = bundle.getLong(A0N, 0L);
        long j5 = bundle.getLong(A0O, C10323vs.b);
        int i = bundle.getInt(A0Q, 0);
        int i2 = bundle.getInt(A0U, 0);
        long j6 = bundle.getLong(A0X, 0L);
        C2207pj c2207pj = new C2207pj();
        c2207pj.A07(A0M, A6f, null, j, j2, j3, z, z2, c2234qA, j4, j5, i, i2, j6);
        c2207pj.A0F = z3;
        return c2207pj;
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{6, 10, 8, 75, 3, 4, 6, 0, 7, 10, 10, C8077mf.p, 75, 4, 1, C8077mf.z, 75, 4, C8077mf.m, 1, C8077mf.A, 10, C8077mf.n, 1, C8077mf.G, 75, 8, 0, 1, C8077mf.n, 4, 86, 75, 6, 10, 8, 8, 10, C8077mf.m, 75, 49, C8077mf.n, 8, 0, 9, C8077mf.n, C8077mf.m, 0};
    }

    static {
        A03();
        A0K = new Object();
        A0M = new Object();
        A0L = new C04262u().A03(A02(0, 48, 107)).A00(Uri.EMPTY).A05();
        A0W = C5C.A0h(1);
        A0Y = C5C.A0h(2);
        A0Z = C5C.A0h(3);
        A0P = C5C.A0h(4);
        A0T = C5C.A0h(5);
        A0R = C5C.A0h(6);
        A0V = C5C.A0h(7);
        A0S = C5C.A0h(8);
        A0N = C5C.A0h(9);
        A0O = C5C.A0h(10);
        A0Q = C5C.A0h(11);
        A0U = C5C.A0h(12);
        A0X = C5C.A0h(13);
        A0J = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pk
            @Override // com.facebook.ads.redexgen.X.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                C2207pj A00;
                A00 = C2207pj.A00(bundle);
                return A00;
            }
        };
    }

    public final long A04() {
        return C5C.A0P(this.A02);
    }

    public final long A05() {
        return this.A02;
    }

    public final long A06() {
        return C5C.A0P(this.A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        r0 = r7.A03.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r4 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2207pj A07(Object obj, C2231q7 c2231q7, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C2234qA c2234qA, long j4, long j5, int i, int i2, long j6) {
        this.A0C = obj;
        this.A09 = c2231q7 != null ? c2231q7 : A0L;
        if (A0I[2].charAt(1) != 'z') {
            throw new RuntimeException();
        }
        A0I[5] = "sHLAwqiYlmMVa087WjDP7yFYW";
        if (c2231q7 != null) {
            AnonymousClass32 anonymousClass32 = c2231q7.A03;
            if (A0I[2].charAt(1) != 'z') {
                A0I[2] = "JzGzHC0FwGnnWhMzWBrJaCXM29VIx9g1";
            } else {
                A0I[5] = "IGwZtC";
            }
            this.A0B = r0;
            this.A0A = obj2;
            this.A06 = j;
            this.A07 = j2;
            this.A04 = j3;
            this.A0G = z;
            this.A0D = z2;
            this.A0E = c2234qA == null;
            this.A08 = c2234qA;
            this.A02 = j4;
            this.A03 = j5;
            this.A00 = i;
            this.A01 = i2;
            this.A05 = j6;
            this.A0F = false;
            return this;
        }
        Object obj3 = null;
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        this.A0E = c2234qA == null;
        this.A08 = c2234qA;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = j6;
        this.A0F = false;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C2207pj c2207pj = (C2207pj) obj;
        if (C5C.A1E(this.A0C, c2207pj.A0C) && C5C.A1E(this.A09, c2207pj.A09) && C5C.A1E(this.A0A, c2207pj.A0A) && C5C.A1E(this.A08, c2207pj.A08) && this.A06 == c2207pj.A06 && this.A07 == c2207pj.A07 && this.A04 == c2207pj.A04 && this.A0G == c2207pj.A0G && this.A0D == c2207pj.A0D && this.A0F == c2207pj.A0F && this.A02 == c2207pj.A02 && this.A03 == c2207pj.A03 && this.A00 == c2207pj.A00 && this.A01 == c2207pj.A01) {
            long j = this.A05;
            long j2 = c2207pj.A05;
            String[] strArr = A0I;
            if (strArr[6].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[6] = "Zdu";
            strArr2[3] = "ITW";
            if (j == j2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A0C.hashCode();
        int result2 = ((((7 * 31) + result) * 31) + this.A09.hashCode()) * 31;
        int result3 = this.A0A == null ? 0 : this.A0A.hashCode();
        int result4 = (result2 + result3) * 31;
        int hashCode = this.A08 != null ? this.A08.hashCode() : 0;
        int result5 = (int) (this.A06 ^ (this.A06 >>> 32));
        int result6 = (int) (this.A04 ^ (this.A04 >>> 32));
        int i = ((((((((result4 + hashCode) * 31) + result5) * 31) + ((int) (this.A07 ^ (this.A07 >>> 32)))) * 31) + result6) * 31) + (this.A0G ? 1 : 0);
        int result7 = A0I[2].charAt(1);
        if (result7 != 122) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "6VN";
        strArr[3] = "iNJ";
        int result8 = this.A0D ? 1 : 0;
        int result9 = (int) (this.A02 ^ (this.A02 >>> 32));
        int result10 = ((((((((i * 31) + result8) * 31) + (this.A0F ? 1 : 0)) * 31) + result9) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result11 = this.A00;
        int result12 = (int) (this.A05 ^ (this.A05 >>> 32));
        return ((((result10 + result11) * 31) + this.A01) * 31) + result12;
    }
}
