package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Log;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.C3307Iz;
import o.C4715Xk;
import o.C6161et;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.8B  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8B implements InterfaceC2178pF {
    public static byte[] A0M;
    public static String[] A0N = {"gtbAICrdQ5OiLd8QtlGJkysA4GOuQAyl", "NB4BeTTq5ijHDPStUBIG2cd4hjVw3Rms", "uuMr3aWTfRr6VJnGuPPVK2CIrmsp3XMP", "Eb6am5ksZvZ5Hz0HFQHbX0NWivmHdCO7", "qnDH", "QayiUw4ouBPhcoxDO7fR8OixzHh3DuJf", "V84YazX1IDZHbq2m95FMlzDl0u9g04ST", "S22pIk311xlkEmMZRooVtOw4dNPxaWRF"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public InterfaceC2178pF A06;
    public C04905i A07;
    public C04905i A08;
    @MetaExoPlayerCustomization
    public ML A09;
    public MZ A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC2178pF A0D;
    public final InterfaceC2178pF A0E;
    public final InterfaceC2178pF A0F;
    public final MP A0G;
    public final MS A0H;
    public final MY A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0N[4].length() == 12) {
                throw new RuntimeException();
            }
            A0N[4] = "VXYuEglycDYgl";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0M = new byte[]{C8077mf.C, 59, 57, 50, ED2.a, C8077mf.H, 59, C3307Iz.f0, 59, 9, 53, 47, 40, 57, ED2.a, C8077mf.z, 58, 32, 57, 49, 59, 114, C3307Iz.V, 117, 32, C3307Iz.X, 49, 52, C3307Iz.V, 48, 117, C3307Iz.Z, 48, 49, 60, C3307Iz.Z, 48, 54, C3307Iz.V, 48, 49, 117, 0, 7, 28, 123, 117, 1, C4715Xk.i, 60, C3307Iz.Y, 117, 56, 60, 50, C4715Xk.i, C3307Iz.V, 117, 54, 52, 32, C3307Iz.Y, 48, 117, C3307Iz.Z, 48, 57, 52, C3307Iz.V, 60, 35, 48, 117, 0, 7, 28, C3307Iz.Y, 117, 50, 48, C3307Iz.V, 117, C3307Iz.Z, 48, C3307Iz.Y, 58, 57, 35, 48, 49, 117, 60, 59, 54, 58, C3307Iz.Z, C3307Iz.Z, 48, 54, C3307Iz.V, 57, C3307Iz.d0, 123, 95, 94, 115, 81, 83, 88, 85, 84, 114, 73, 68, 85, 67, 98, 85, 81, 84};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    @MetaExoPlayerCustomization("usage of fbDataSpecExtension and the check for isInitSegment")
    public final long AGi(C04905i c04905i) throws IOException {
        try {
            String A4l = this.A0I.A4l(c04905i);
            C04905i A09 = c04905i.A04().A08(A4l).A09();
            this.A08 = A09;
            this.A05 = A01(this.A0G, A4l, A09.A06);
            this.A03 = c04905i.A04;
            this.A09 = new ML(c04905i.A07);
            boolean z = true;
            this.A0B = A00(c04905i) != -1;
            boolean z2 = this.A0B;
            if (this.A0B) {
                this.A00 = -1L;
            } else {
                this.A00 = AbstractC0915Mj.A00(this.A0G.A7S(A4l));
                if (this.A00 != -1) {
                    this.A00 -= c04905i.A04;
                    if (this.A00 < 0) {
                        throw new C04835b(2008);
                    }
                }
            }
            z = (c04905i.A07.A08 > 0 || c04905i.A07.A07 > 0) ? false : false;
            if (c04905i.A03 != -1) {
                this.A00 = this.A00 == -1 ? c04905i.A03 : Math.min(this.A00, c04905i.A03);
            }
            if (this.A00 > 0 || this.A00 == -1) {
                A06(A09, false, z);
            }
            return c04905i.A03 != -1 ? c04905i.A03 : this.A00;
        } catch (Throwable th) {
            A09(th);
            throw th;
        }
    }

    static {
        A05();
    }

    public C8B(MP mp, InterfaceC2178pF interfaceC2178pF, InterfaceC2178pF interfaceC2178pF2, C5W c5w, MY my, int i, AbstractC04353d abstractC04353d, int i2, MS ms) {
        this.A0G = mp;
        this.A0D = interfaceC2178pF2;
        this.A0I = my == null ? MY.A00 : my;
        this.A0J = (i & 1) != 0;
        this.A0L = (i & 2) != 0;
        this.A0K = (i & 4) != 0;
        if (interfaceC2178pF != null) {
            interfaceC2178pF = abstractC04353d != null ? new AH(interfaceC2178pF, abstractC04353d, i2) : interfaceC2178pF;
            this.A0F = interfaceC2178pF;
            this.A0E = c5w != null ? new AF(interfaceC2178pF, c5w) : null;
        } else {
            this.A0F = AI.A02;
            this.A0E = null;
        }
        this.A0H = ms;
    }

    private int A00(C04905i c04905i) {
        if (this.A0L && this.A0C) {
            return 0;
        }
        if (this.A0K && c04905i.A03 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(MP mp, String str, Uri redirectedUri) {
        Uri redirectedUri2 = AbstractC0915Mj.A01(mp.A7S(str));
        return redirectedUri2 != null ? redirectedUri2 : redirectedUri;
    }

    private void A03() throws IOException {
        if (this.A06 == null) {
            return;
        }
        try {
            this.A06.close();
            this.A07 = null;
            this.A06 = null;
            if (A0N[5].charAt(3) == 'i') {
                String[] strArr = A0N;
                strArr[2] = "vHGwoIowQcJHPzt2zHibHrQYTuNv4ZzT";
                strArr[1] = "k7MJrtNgTHKuOTKhmFADSg5K1rHaIFar";
                if (this.A0A != null) {
                    MP mp = this.A0G;
                    if (A0N[6].charAt(29) == '4') {
                        String[] strArr2 = A0N;
                        strArr2[2] = "npCyc8crYVBLSlKGvChDlZdzdxvHOR7S";
                        strArr2[1] = "yWpl1AKn1flVHx0rOJ2JJIdMQnxjFkRn";
                        mp.AHg(this.A0A);
                        this.A0A = null;
                        return;
                    }
                } else {
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            this.A07 = null;
            this.A06 = null;
            if (this.A0A != null) {
                this.A0G.AHg(this.A0A);
                this.A0A = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A7A();
            throw new NullPointerException(A02(103, 17, 44));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
        if (r8 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
        r21.A00 = r2;
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00de, code lost:
        if (com.facebook.ads.redexgen.X.C8B.A0N[5].charAt(3) == 'i') goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
        if (r8 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
        com.facebook.ads.redexgen.X.C8B.A0N[3] = "iUSWGyHOgLgD9ZjfpDxtLA9tGfi2lrY2";
        com.facebook.ads.redexgen.X.C0917Ml.A00(r5, r2);
     */
    @MetaExoPlayerCustomization("Parameter isInitSegment and all ot is usages. Setting mFbDataSpecExtension in nextDataSpec. Call to maybeUpdateRedirectedUriMetadata at the end")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(C04905i c04905i, boolean z, boolean z2) throws IOException {
        MZ AKA;
        long j;
        C04905i A09;
        InterfaceC2178pF interfaceC2178pF;
        long j2;
        Uri uri;
        String str = (String) C5C.A0f(c04905i.A08);
        MN mn = z2 ? MN.A03 : MN.A06;
        if (this.A0B) {
            AKA = null;
        } else if (this.A0J) {
            try {
                AKA = this.A0G.AKA(str, this.A03, this.A00, mn);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            str = str;
            AKA = this.A0G.AKB(str, this.A03, this.A00, mn);
        }
        if (AKA == null) {
            interfaceC2178pF = this.A0F;
            A09 = c04905i.A04().A04(this.A03).A03(this.A00).A07(this.A09).A09();
        } else {
            boolean z3 = AKA.A05;
            String[] strArr = A0N;
            if (strArr[0].charAt(4) == strArr[7].charAt(4)) {
                A0N[5] = "u32inRltH66jjh9yXIb3cYFcwSkjtAHW";
                if (z3) {
                    Uri fromFile = Uri.fromFile((File) C5C.A0f(AKA.A03));
                    long j3 = AKA.A02;
                    long j4 = this.A03 - j3;
                    long j5 = AKA.A01 - j4;
                    if (this.A00 != -1) {
                        j5 = Math.min(j5, this.A00);
                    }
                    A09 = c04905i.A04().A06(fromFile).A05(j3).A04(j4).A03(j5).A07(this.A09).A09();
                    interfaceC2178pF = this.A0D;
                } else {
                    if (AKA.A04()) {
                        j = this.A00;
                    } else {
                        j = AKA.A01;
                        if (this.A00 != -1) {
                            j = Math.min(j, this.A00);
                        }
                    }
                    A09 = c04905i.A04().A04(this.A03).A03(j).A07(this.A09).A09();
                    if (this.A0E != null) {
                        interfaceC2178pF = this.A0E;
                    } else {
                        interfaceC2178pF = this.A0F;
                        this.A0G.AHg(AKA);
                        AKA = null;
                    }
                }
            }
            throw new RuntimeException();
        }
        boolean z4 = this.A0B;
        if (A0N[5].charAt(3) == 'i') {
            String[] strArr2 = A0N;
            strArr2[0] = "KvC0Ia1A4x1eGi9X8aRBDgkMlzCJszIJ";
            strArr2[7] = "nNrFIIpUFsn1fqvNydhqNDEn907tEQAg";
            if (!z4 && interfaceC2178pF == this.A0F) {
                j2 = this.A03 + C6161et.C;
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.A01 = j2;
            if (z) {
                AbstractC04543y.A08(A0A());
                InterfaceC2178pF interfaceC2178pF2 = this.A0F;
                if (A0N[3].charAt(26) == 'u') {
                    Throwable e = new RuntimeException();
                    throw e;
                }
                A0N[5] = "8XoiTPgLcR8ApVu7jrAIE2ygde6TsOz1";
                if (interfaceC2178pF == interfaceC2178pF2) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th) {
                    if (((MZ) C5C.A0f(AKA)).A03()) {
                        this.A0G.AHg(AKA);
                    }
                    throw th;
                }
            }
            if (AKA != null && AKA.A03()) {
                this.A0A = AKA;
            }
            this.A06 = interfaceC2178pF;
            this.A07 = A09;
            this.A02 = 0L;
            long AGi = interfaceC2178pF.AGi(A09);
            C0917Ml c0917Ml = new C0917Ml();
            if (A09.A03 == -1) {
                int i = (AGi > (-1L) ? 1 : (AGi == (-1L) ? 0 : -1));
                if (A0N[4].length() != 12) {
                    A0N[3] = "AihO48tXyqmUqd3oId9EAGnNfKcJ6kuS";
                }
            }
            if (A0C()) {
                this.A05 = interfaceC2178pF.A9P();
                boolean isRedirected = !c04905i.A06.equals(this.A05);
                if (A0N[4].length() != 12) {
                    A0N[4] = "aty3owKlrPhsH";
                    if (isRedirected) {
                        uri = this.A05;
                    } else {
                        uri = null;
                    }
                    C0917Ml.A01(c0917Ml, uri);
                }
            }
            if (A0D()) {
                this.A0G.A4E(str, c0917Ml);
            }
            A08(str, this.A05);
            return;
        }
        throw new RuntimeException();
    }

    private void A07(String str) throws IOException {
        this.A00 = 0L;
        if (A0D()) {
            C0917Ml c0917Ml = new C0917Ml();
            C0917Ml.A00(c0917Ml, this.A03);
            this.A0G.A4E(str, c0917Ml);
        }
    }

    @MetaExoPlayerCustomization
    private void A08(String str, Uri uri) {
        if (!A0D()) {
            return;
        }
        C0917Ml c0917Ml = new C0917Ml();
        if (!uri.equals(this.A05)) {
            Uri uri2 = this.A05;
            if (A0N[6].charAt(29) != '4') {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "HwBuIJEC6JIKumxqgSDJ0pUKIwQFYzQv";
            strArr[7] = "1FgFIXgVQckXZ73NbznNhujKeCbi6Slt";
            C0917Ml.A01(c0917Ml, uri2);
        } else {
            C0917Ml.A01(c0917Ml, null);
        }
        try {
            this.A0G.A4E(str, c0917Ml);
        } catch (MM e) {
            String message = A02(15, 88, 73);
            Log.w(A02(0, 15, 70), message, e);
        }
    }

    private void A09(Throwable th) {
        if (A0B() || (th instanceof MM)) {
            this.A0C = true;
        }
    }

    private boolean A0A() {
        return this.A06 == this.A0F;
    }

    private boolean A0B() {
        return this.A06 == this.A0D;
    }

    private boolean A0C() {
        return !A0B();
    }

    private boolean A0D() {
        return this.A06 == this.A0E;
    }

    public final MP A0E() {
        return this.A0G;
    }

    public final MY A0F() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final void A43(InterfaceC05015t interfaceC05015t) {
        AbstractC04543y.A01(interfaceC05015t);
        this.A0D.A43(interfaceC05015t);
        this.A0F.A43(interfaceC05015t);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final Map<String, List<String>> A8t() {
        if (A0C()) {
            return this.A0F.A8t();
        }
        return Collections.emptyMap();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final Uri A9P() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2178pF
    public final void close() throws IOException {
        this.A08 = null;
        this.A05 = null;
        this.A03 = 0L;
        A04();
        try {
            A03();
        } catch (Throwable e) {
            A09(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04102c
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            return -1;
        }
        C04905i currentDataSpec = (C04905i) AbstractC04543y.A01(this.A08);
        C04905i c04905i = (C04905i) AbstractC04543y.A01(this.A07);
        try {
            if (this.A03 >= this.A01) {
                A06(currentDataSpec, true, false);
            }
        } catch (Throwable th) {
            e = th;
        }
        try {
            int bytesRead = ((InterfaceC2178pF) AbstractC04543y.A01(this.A06)).read(bArr, i, i2);
            if (bytesRead != -1) {
                if (A0B()) {
                    this.A04 += bytesRead;
                }
                this.A03 += bytesRead;
                this.A02 += bytesRead;
                if (this.A00 != -1) {
                    this.A00 -= bytesRead;
                }
            } else if (A0C() && (c04905i.A03 == -1 || this.A02 < c04905i.A03)) {
                A07((String) C5C.A0f(currentDataSpec.A08));
            } else if (this.A00 > 0 || this.A00 == -1) {
                A03();
                A06(currentDataSpec, false, false);
                return read(bArr, i, i2);
            }
            return bytesRead;
        } catch (Throwable th2) {
            e = th2;
            A09(e);
            throw e;
        }
    }
}
