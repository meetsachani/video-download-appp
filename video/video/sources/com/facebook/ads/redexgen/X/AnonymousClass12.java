package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.internal.C2372q;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.AD1;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C6118ei0;
import o.C8077mf;
import o.Xu2;

/* renamed from: com.facebook.ads.redexgen.X.12 */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass12 extends AbstractC03881g implements AnonymousClass78 {
    public static byte[] A0J;
    public static String[] A0K = {"77C8vP87Fd7b4BP9SQRJBzWPVk4TewQg", "oQ2qsKrmaNuyaLFB2ph9zkmGtpzAonXt", "MDqZPLCoXCzEQwxPxYtAKuxbh2tAcx1k", "aWPkhw6gWy0BTxYknUchyjQmABWF", "ais5GYfL5LR1KEYd6HRi1BBd2kmjCeGs", "pdewp8MC9mt7vaqV0Zkeu3U5mw150Zm9", "qv2CVs2gAdpJ8ZKBYAbfHfBiBdoePlCI", "lcPZgHPLbCISPmjsMn5qIGSBsvlpomMq"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public MediaFormat A06;
    public C2242qI A07;
    public InterfaceC05417h A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C05738o A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final InterfaceC05818z A0I;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            if (A0K[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[4] = "GcWDzLLiTAl0tD46XyRRBcNodd92JrSP";
            strArr[0] = "GhxldHXMoVDog6OAV5RKTarDpyl0kviC";
            copyOfRange[i4] = (byte) ((b - i3) - 65);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0J = new byte[]{-103, -79, -80, -75, -83, -113, -69, -80, -79, -81, -115, C2638Cg0.p7, -80, -75, -69, -98, -79, -70, -80, -79, -66, -79, -66, -77, -79, -68, -110, -73, -87, -89, -110, C2638Cg0.s7, C2638Cg0.s7, C2638Cg0.u7, -110, -56, C2638Cg0.v7, C2638Cg0.u7, -36, C2638Cg0.B7, -27, -69, -12, -4, -4, -12, -7, -14, -69, -1, -18, 4, -69, -15, -14, -16, -4, -15, -14, -1, -17, -17, -15, -69, -14, 0, -15, -69, -13, -12, -12, -13, -15, 2, -69, 2, 7, -2, -13, C2638Cg0.y7, C2638Cg0.y7, C2638Cg0.A7, -103, -32, C2638Cg0.y7, -34, -45, -47, -32, -103, -34, -47, -46, -103, C2638Cg0.n7, -47, -30, -47, C2638Cg0.n7, 7, C8077mf.E, 10, C8077mf.q, C8077mf.y, -43, C8077mf.B, 7, C8077mf.G, C8077mf.x, C8077mf.C, C8077mf.u, 31, 31, C8077mf.z, C8077mf.G, -34, C8077mf.x, 32, C3307Iz.Y, 31, C3307Iz.X, -85, -88, -75, -78, -81, -73, -88, C2638Cg0.C7, -34, -21, -24, -22, -27, -19, -34, C2638Cg0.w7, -66, -43, -118, C2638Cg0.t7, C2638Cg0.x7, C2638Cg0.y7, -46, -47, -118, -48, C2638Cg0.t7, -41, C2638Cg0.q7, C2638Cg0.E7, -43, C2638Cg0.E7, -47, -68, -65, -125, -80, 125, -125, Byte.MAX_VALUE, 125, -125, -127, C2638Cg0.o7, C2638Cg0.q7, -71, -65, C2638Cg0.q7, -71, -60, C2638Cg0.v7, -65, -83, -71, -68, -72, -79, 121, -66, -83, C2638Cg0.o7, -79, -27, -45, -33, -27, -25, -32, C2638Cg0.E7, -47, -68, C2638Cg0.v7, C2638Cg0.t7, -67, C2638Cg0.r7, C2638Cg0.x7, -68};
    }

    static {
        A09();
    }

    public AnonymousClass12(Context context, C1836jQ c1836jQ, C1833jN c1833jN, BT bt, A6 a6, boolean z, boolean z2, boolean z3, Handler handler, InterfaceC05748p interfaceC05748p, C8R c8r, InterfaceC04403k... interfaceC04403kArr) {
        this(context, c1836jQ, c1833jN, bt, a6, z, z2, z3, handler, interfaceC05748p, new C2123oM(c8r, interfaceC04403kArr));
    }

    public AnonymousClass12(Context context, C1836jQ c1836jQ, C1833jN c1833jN, BT bt, A6 a6, boolean z, boolean z2, boolean z3, Handler handler, InterfaceC05748p interfaceC05748p, InterfaceC05818z interfaceC05818z) {
        super(1, c1836jQ, c1833jN, bt, a6, z, false, 0, 0);
        this.A01 = 0;
        this.A02 = 0;
        this.A05 = 0L;
        this.A0E = context.getApplicationContext();
        this.A0I = interfaceC05818z;
        this.A0G = z2;
        this.A0H = z3;
        this.A0F = new C05738o(handler, interfaceC05748p);
        interfaceC05818z.AJV(new C2121oK(this));
        interfaceC05818z.AJQ(c1836jQ.A0D);
    }

    @MetaExoPlayerCustomization("Added in D36293647 for DRC")
    private int A00() {
        int i = this.A0z.A09;
        if (this.A0z.A0F) {
            int i2 = this.A0z.A03;
            int i3 = this.A0z.A04;
            int xHEAACEffectType = this.A0z.A05;
            return C1787ic.A00(i2, i3, xHEAACEffectType);
        }
        return i;
    }

    public static int A01(C2242qI c2242qI) {
        if (A07(99, 9, 101).equals(c2242qI.A0W)) {
            return c2242qI.A0C;
        }
        return 2;
    }

    private int A02(B3 b3, C2242qI c2242qI) {
        if (A07(38, 22, 76).equals(b3.A03) && C5C.A02 < 24) {
            int i = C5C.A02;
            String[] strArr = A0K;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "s8yZpZp8nIrL7EQY3mPJ1kqCekDwsY6i";
            strArr2[7] = "yd2Z0BEEocl53iuZqAxtcOKT0DXRknsH";
            if (i != 23 || !C5C.A18(this.A0E)) {
                String[] strArr3 = A0K;
                if (strArr3[4].charAt(18) != strArr3[0].charAt(18)) {
                    throw new RuntimeException();
                }
                A0K[3] = "9QHOUbokymVnxuZO6z7rLJCC2XoG";
                return -1;
            }
        }
        int i2 = c2242qI.A0B;
        String[] strArr4 = A0K;
        if (strArr4[2].charAt(3) != strArr4[7].charAt(3)) {
            return i2;
        }
        String[] strArr5 = A0K;
        strArr5[2] = "bWiZaXhFQHkoAXZnJ4ncaGOlncM6vz1V";
        strArr5[7] = "kg6ZwO8ePPrkJPsuoAADu0ZS0U6OWo96";
        return i2;
    }

    private final int A03(B3 b3, C2242qI c2242qI, C2242qI[] c2242qIArr) {
        int maxInputSize = A02(b3, c2242qI);
        return maxInputSize;
    }

    private final MediaFormat A04(C2242qI c2242qI, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A07(150, 4, 43), str);
        mediaFormat.setInteger(A07(108, 13, 112), c2242qI.A06);
        mediaFormat.setInteger(A07(Xu2.K, 11, 11), c2242qI.A0G);
        AbstractC04644i.A06(mediaFormat, c2242qI.A0X);
        AbstractC04644i.A04(mediaFormat, A07(136, 14, 28), i);
        if (C5C.A02 >= 23) {
            String A07 = A07(164, 8, 15);
            String[] strArr = A0K;
            if (strArr[4].charAt(18) != strArr[0].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[1] = "w8gjBPJzE632nZpBrlzwe1tLIvq8CsOY";
            strArr2[6] = "ag3DPBWcd6fSOrmBwunkDpt77Nl4HY4l";
            mediaFormat.setInteger(A07, 0);
        }
        if (c2242qI.A0R != null && c2242qI.A0R.equals(A07(C3503Kz.n0, 10, 14)) && this.A0z.A0G) {
            mediaFormat.setInteger(A07(60, 19, 77), A00());
            mediaFormat.setInteger(A07(79, 20, 43), this.A0z.A0A);
        }
        return mediaFormat;
    }

    public static /* synthetic */ InterfaceC05417h A05(AnonymousClass12 anonymousClass12) {
        return null;
    }

    private void A08() {
        long A7f = this.A0I.A7f(AAP());
        if (A7f != Long.MIN_VALUE) {
            if (!this.A0A) {
                long j = this.A04;
                String[] strArr = A0K;
                if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0K;
                strArr2[4] = "nIJcPeFAtvuDBzBlXMRw0HpU2OMpTIMr";
                strArr2[0] = "dapTBdH8hqStbvnLCARUyCc0T0ChI3T8";
                A7f = Math.max(j, A7f);
            }
            this.A04 = A7f;
            this.A0A = false;
        }
    }

    private boolean A0A(C2242qI c2242qI) {
        String str = c2242qI.A0W;
        String mimeType = A07(99, 9, 101);
        if (mimeType.equals(str)) {
            String[] strArr = A0K;
            if (strArr[2].charAt(3) != strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "mDVewdn3RvQYeqn2qaR7zJPFTyK9zqzw";
            strArr2[0] = "a0e3mP5dmYOn07QMhHRhkP7lbfukdIg9";
            return false;
        }
        return this.A0I.AKN(c2242qI);
    }

    public static boolean A0B(String str) {
        if (C5C.A02 < 24 && A07(23, 15, 35).equals(str)) {
            if (A07(C10997yd1.n2, 7, 49).equals(C5C.A05) && (C5C.A03.startsWith(A07(C2372q.m, 8, 22)) || C5C.A03.startsWith(A07(121, 7, 2)) || C5C.A03.startsWith(A07(128, 8, 56)))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.AE
    public final void A1X() {
        super.A1X();
        this.A0I.AH0();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.AE
    public final void A1Y() {
        A08();
        this.A0I.pause();
        super.A1Y();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.AE
    public final void A1Z() {
        try {
            this.A0I.flush();
            try {
                super.A1Z();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A1Z();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.AE
    public final void A1a(long j, boolean z) throws AD {
        super.A1a(j, z);
        if (this.A0C) {
            this.A0I.A6T();
        } else {
            this.A0I.flush();
        }
        this.A04 = j;
        this.A09 = true;
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.AE
    public final void A1b(boolean z, boolean z2) throws AD {
        super.A1b(z, z2);
        this.A0F.A08(this.A0h);
        if (A1V().A00) {
            this.A0I.A6M();
        } else {
            this.A0I.A5z();
        }
        this.A0I.AJg(A1W());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final int A1g(B0 b0, B3 b3, C2242qI c2242qI, C2242qI c2242qI2) {
        if (this.A0z.A0O && A02(b3, c2242qI2) <= this.A00 && b3.A0U(c2242qI, c2242qI2, true) && c2242qI.A08 == 0 && c2242qI.A09 == 0 && c2242qI2.A08 == 0 && c2242qI2.A09 == 0) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0046, code lost:
        if (r2.AKP(r1, r12.A0C) != false) goto L21;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A1h(BT bt, A6 a6, C2242qI c2242qI) throws BX {
        int i;
        String str = c2242qI.A0W;
        int adaptiveSupport = 0;
        if (C3J.A0C(str)) {
            int i2 = C5C.A02 >= 21 ? 32 : 0;
            boolean A1G = AbstractC03881g.A1G(c2242qI);
            int i3 = 4;
            if (A1G && A0A(c2242qI) && C0624Ba.A0I() != null) {
                return i2 | 8 | 4;
            }
            String mimeType = A07(99, 9, 101);
            if (mimeType.equals(str)) {
                InterfaceC05818z interfaceC05818z = this.A0I;
                int tunnelingSupport = c2242qI.A06;
            }
            if (this.A0I.AKP(c2242qI.A06, 2)) {
                List<B3> A1l = A1l(bt, c2242qI, false);
                if (A1l.isEmpty()) {
                    return AbstractC05427i.A00(1);
                }
                if (!A1G) {
                    return AbstractC05427i.A00(2);
                }
                B3 b3 = A1l.get(0);
                int tunnelingSupport2 = A0K[5].charAt(0);
                if (tunnelingSupport2 != 112) {
                    throw new RuntimeException();
                }
                String[] strArr = A0K;
                strArr[4] = "n12bmxDOOVBzqYYOQBRjqp0moJyAYtSu";
                strArr[0] = "BaglFChNOdaklTSyUQRitIBwXJJTR14H";
                B3 b32 = b3;
                if (C5C.A02 < 21 || ((c2242qI.A0G == -1 || b32.A0Q(c2242qI.A0G)) && (c2242qI.A06 == -1 || b32.A0P(c2242qI.A06)))) {
                    adaptiveSupport = 1;
                }
                if (adaptiveSupport != 0 && b32.A0T(c2242qI)) {
                    i = 16;
                } else {
                    i = 8;
                }
                if (adaptiveSupport == 0) {
                    i3 = 3;
                }
                return i | i2 | i3;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final List<B3> A1l(BT bt, C2242qI c2242qI, boolean z) throws BX {
        B3 A0I;
        String mimeType = c2242qI.A0W;
        if (mimeType == null) {
            return Collections.emptyList();
        }
        if (A0A(c2242qI) && (A0I = C0624Ba.A0I()) != null) {
            List<B3> singletonList = Collections.singletonList(A0I);
            String[] strArr = A0K;
            if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[4] = "VH1rG9jH3WXhHTxnLXRxhYBKNNIMNlpD";
            strArr2[0] = "4dJInhYjvnfEcXSyIbRNEiIfORerumv3";
            return singletonList;
        }
        return Collections.unmodifiableList(bt.A7o(c2242qI.A0W, z, false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final void A1o() throws AD {
        try {
            this.A0I.AH2();
        } catch (C05808y e) {
            throw A1T(e, e.A01, e.A02, AD1.v1);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final void A1s(C2242qI c2242qI) throws AD {
        super.A1s(c2242qI);
        this.A07 = c2242qI;
        this.A0F.A05(this.A07, null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final void A1u(C2163p0 c2163p0) {
        if (this.A09 && !c2163p0.A04()) {
            if (Math.abs(c2163p0.A01 - this.A04) > C6118ei0.r2) {
                this.A04 = c2163p0.A01;
            }
            this.A09 = false;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:56:0x0099 */
    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1v(B0 b0, MediaFormat mediaFormat) throws AD {
        int sampleRate;
        MediaFormat mediaFormat2;
        int[] channelMap;
        if (this.A06 != null) {
            sampleRate = C3J.A00(this.A06.getString(A07(150, 4, 43)));
            mediaFormat2 = this.A06;
        } else {
            sampleRate = A01(this.A07);
            mediaFormat2 = mediaFormat;
        }
        String A07 = A07(108, 13, 112);
        int integer = mediaFormat2.getInteger(A07);
        String A072 = A07(Xu2.K, 11, 11);
        if (A0K[5].charAt(0) != 'p') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[1] = "oVYorWwiJ9QuTT6BmhgOhsdn4ih9katO";
        strArr[6] = "s4BjQ2RFQmOrQGZBZgzfkwBc6WQlVCBr";
        int encoding = mediaFormat2.getInteger(A072);
        this.A03 = encoding * integer;
        try {
            if (this.A0B) {
                String[] strArr2 = A0K;
                String str = strArr2[1];
                String str2 = strArr2[6];
                int charAt = str.charAt(15);
                int encoding2 = str2.charAt(15);
                if (charAt != encoding2) {
                    throw new RuntimeException();
                }
                A0K[5] = "pG08ZDLF1Nwa7YWNReZn10nEeTPXXDD5";
                if (integer == 6) {
                    int encoding3 = this.A07.A06;
                    if (encoding3 < 6) {
                        int encoding4 = this.A07.A06;
                        channelMap = new int[encoding4];
                        for (int i = 0; i < encoding; i++) {
                            channelMap[i] = i;
                        }
                        C04212p A0i = new C04212p().A11(A07(99, 9, 101)).A0i(sampleRate);
                        int encoding5 = mediaFormat.getInteger(A07);
                        C04212p A0b = A0i.A0b(encoding5);
                        int encoding6 = mediaFormat.getInteger(A072);
                        C2242qI audioSinkInputFormat = A0b.A0m(encoding6).A14();
                        this.A0I.A59(audioSinkInputFormat, 0, channelMap);
                        return;
                    }
                }
            }
            this.A0I.A59(audioSinkInputFormat, 0, channelMap);
            return;
        } catch (C05768s e) {
            throw A1S(e, e.A00, AD1.u1);
        }
        channelMap = null;
        C04212p A0i2 = new C04212p().A11(A07(99, 9, 101)).A0i(sampleRate);
        int encoding52 = mediaFormat.getInteger(A07);
        C04212p A0b2 = A0i2.A0b(encoding52);
        int encoding62 = mediaFormat.getInteger(A072);
        C2242qI audioSinkInputFormat2 = A0b2.A0m(encoding62).A14();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final void A1w(B3 b3, B0 b0, C2242qI c2242qI, MediaCrypto mediaCrypto) {
        this.A00 = A03(b3, c2242qI, A1e());
        this.A0B = A0B(b3.A03);
        String str = b3.A02;
        String A07 = A07(99, 9, 101);
        this.A0D = A07.equals(str) && !A07.equals(c2242qI.A0W);
        MediaFormat A04 = A04(c2242qI, b3.A01, this.A00);
        b0.A58(A04, null, mediaCrypto, 0, null);
        if (this.A0D) {
            this.A06 = A04;
            this.A06.setString(A07(150, 4, 43), c2242qI.A0W);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    @MetaExoPlayerCustomization("D45988204: [FBLite][Video] Add Codec Hooks for Logging")
    public final void A1x(String str) {
        this.A0F.A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final void A1y(String str, long j, long j2) {
        this.A0F.A0G(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    @MetaExoPlayerCustomization("Added in D6142814")
    public final boolean A22() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g
    public final boolean A23(long j, long j2, B0 b0, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2) throws AD {
        if (this.A0D) {
            int i3 = i2 & 2;
            if (A0K[3].length() != 28) {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[2] = "qFTZlqBsfbROWjHKIBaS9ttrRfnfHc6a";
            strArr[7] = "sZoZRvagNjZKK9rko7XS8oWwcuS8hqha";
            if (i3 != 0) {
                b0.AHi(i, false);
                return true;
            }
        }
        if (z) {
            b0.AHi(i, false);
            if (A0K[5].charAt(0) != 'p') {
                String[] strArr2 = A0K;
                strArr2[4] = "i4U0xdeb2kJYTtTzacReJ5RV5axgIdhD";
                strArr2[0] = "rrPeATHc6C5SnSGUS9RZuIpTT0sGFjMh";
                this.A0h.A0B++;
                this.A0I.A9h();
                return true;
            }
            String[] strArr3 = A0K;
            strArr3[1] = "GzmR5b8Z6T6If0UBPoEMKvf6QjFSlvzk";
            strArr3[6] = "qLQdQ1juS6S8x5RB3mUlKTK412OZk0qd";
            this.A0h.A0B++;
            this.A0I.A9h();
            return true;
        }
        if (this.A0H && A01(this.A07) == 2 && i2 == 0 && this.A03 > 0 && byteBuffer.limit() - byteBuffer.position() >= 12) {
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            byteBuffer.position(10);
            short s = byteBuffer.getShort();
            byteBuffer.position(position);
            byteBuffer.limit(limit);
            int i4 = this.A01;
            int limit2 = byteBuffer.limit();
            int originalPosition = byteBuffer.position();
            this.A01 = i4 + (limit2 - originalPosition);
            int i5 = this.A02;
            String[] strArr4 = A0K;
            String str = strArr4[4];
            String str2 = strArr4[0];
            int charAt = str.charAt(18);
            int originalPosition2 = str2.charAt(18);
            if (charAt != originalPosition2) {
                throw new RuntimeException();
            }
            String[] strArr5 = A0K;
            strArr5[1] = "MwudhWWmLfAHxFUBWVuNAQ0R1ppnonhu";
            strArr5[6] = "h4oByFchRKdWl7IBcc7CSq20vr2fgRzF";
            this.A02 = i5 + 1;
            long j4 = this.A05;
            int originalPosition3 = Math.abs((int) s);
            this.A05 = j4 + originalPosition3;
            int i6 = this.A01;
            int originalPosition4 = this.A03;
            if (i6 >= originalPosition4 * 2) {
                this.A0F.A00((int) (this.A05 / this.A02));
                this.A01 = 0;
                this.A02 = 0;
                this.A05 = 0L;
            }
        }
        if (this.A0G) {
            int limit3 = byteBuffer.limit();
            int originalPosition5 = byteBuffer.position();
            if (limit3 > originalPosition5) {
                int position2 = byteBuffer.position();
                int limit4 = byteBuffer.limit();
                int originalPosition6 = limit4 - position2;
                ByteBuffer allocate = ByteBuffer.allocate(originalPosition6);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position2);
                byteBuffer.limit(limit4);
                this.A0F.A0K(allocate.array(), j3 / 1000);
            }
        }
        try {
            if (this.A0I.A9e(byteBuffer, j3, 1)) {
                b0.AHi(i, false);
                this.A0h.A09++;
                return true;
            }
            return false;
        } catch (C05778t e) {
            throw A1T(e, this.A07, e.A02, AD1.u1);
        } catch (C05808y e2) {
            throw A1T(e2, this.A0g, e2.A02, AD1.v1);
        }
    }

    public final void A26() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.AE, com.facebook.ads.redexgen.X.InterfaceC2151oo
    public final AnonymousClass78 A8T() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass78
    public final C2221px A8m() {
        return this.A0I.A8m();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass78
    public final long A8p() {
        if (A9A() == 2) {
            A08();
        }
        long j = this.A04;
        String[] strArr = A0K;
        if (strArr[1].charAt(15) != strArr[6].charAt(15)) {
            throw new RuntimeException();
        }
        A0K[5] = "p6YKYNxicnjzLIFANgsfPKErY7h8fvSp";
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.AE, com.facebook.ads.redexgen.X.InterfaceC05367c
    public final void A9i(int i, Object obj) throws AD {
        switch (i) {
            case 2:
                this.A0I.setVolume(((Float) obj).floatValue());
                return;
            case 3:
                this.A0I.AJG((C2248qQ) obj);
                return;
            case 4:
            case 5:
            case 7:
            case 8:
            default:
                super.A9i(i, obj);
                return;
            case 6:
                this.A0I.AJI((AnonymousClass21) obj);
                return;
            case 9:
                this.A0I.AJo(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.A0I.AJH(((Integer) obj).intValue());
                return;
            case 11:
                this.A08 = null;
                return;
            case 12:
                if (C5C.A02 < 23) {
                    return;
                }
                InterfaceC05818z interfaceC05818z = this.A0I;
                if (A0K[3].length() != 28) {
                    throw new RuntimeException();
                }
                A0K[3] = "XCf3J2AEJJ1Zd2j3qAi6tezJ2mG7";
                C9S.A00(interfaceC05818z, obj);
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.InterfaceC2151oo
    public final boolean AAP() {
        return super.AAP() && this.A0I.AAP();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03881g, com.facebook.ads.redexgen.X.InterfaceC2151oo
    public final boolean AAe() {
        if (!this.A0I.A9o()) {
            boolean AAe = super.AAe();
            if (A0K[5].charAt(0) != 'p') {
                throw new RuntimeException();
            }
            A0K[3] = "YZui0KIXZR8KzjI1EkPC1GaIUT4y";
            if (!AAe) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass78
    public final void AJd(C2221px c2221px) {
        this.A0I.AJd(c2221px);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2151oo, com.facebook.ads.redexgen.X.InterfaceC05497p
    public final String getName() {
        return A07(0, 23, 11);
    }
}
