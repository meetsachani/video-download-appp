package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10323vs;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1948lJ implements InterfaceC0875Kv {
    public static byte[] A0E;
    public static String[] A0F = {"InS58bT42EZESXm9qvWYUvire34TyqEd", "0QsKXE5Mty2kdKkFlxzakLoeZj9v1JPl", "NRhrqdNeBR4CDjsc7Q9NAC", "KBnn09jRwf0uKhIPK3OJ0VUHuR4AgDGD", "Nq6SUzmzwDzIZ8w7Fc8GQLnhk8OKIhKk", "EhougHeDeIMt7rS1ZxwR1ONoVKreOkGZ", "d5GlJf2nLv2o9PLs5SG9FlMqVuWi5Y0h", "iroqlmoe0TAfPMqOpys1zY2UwesgA9Cl"};
    public long A01;
    public InterfaceC0780Hd A02;
    public L3 A03;
    public String A04;
    public boolean A05;
    public final L9 A0C;
    public final boolean[] A0D = new boolean[3];
    public final L4 A0B = new L4(32, 128);
    public final L4 A09 = new L4(33, 128);
    public final L4 A07 = new L4(34, 128);
    public final L4 A08 = new L4(39, 128);
    public final L4 A0A = new L4(40, 128);
    public long A00 = C10323vs.b;
    public final C04774v A06 = new C04774v();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0E = new byte[]{7, 125, 121, 122, C8077mf.G, 42, C3307Iz.f0, C3307Iz.c0, 42, C4715Xk.i, 93, 102, 109, 112, QC1.w, 109, 107, 124, 109, 108, 40, 105, 123, QC1.w, 109, 107, 124, 87, 122, 105, 124, 97, 103, 87, 97, 108, 107, 40, 126, 105, 100, 125, 109, 50, 40, ED2.a, 32, C3307Iz.e0, C3307Iz.d0, C3307Iz.Y, 102, C3307Iz.V, C3307Iz.d0, ED2.a, 42};
    }

    static {
        A03();
    }

    public C1948lJ(L9 l9) {
        this.A0C = l9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x029c, code lost:
        return new com.facebook.ads.redexgen.X.C04212p().A0y(r22).A11(A01(45, 10, 58)).A0w(com.facebook.ads.redexgen.X.AnonymousClass46.A03(r16, r17, r18, r19, r0, r21)).A0r(r4).A0f(r1).A0Y(r6).A12(java.util.Collections.singletonList(r10)).A14();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02a0, code lost:
        if (r5 >= com.facebook.ads.redexgen.X.HS.A04.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02a2, code lost:
        r6 = com.facebook.ads.redexgen.X.HS.A04[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a7, code lost:
        com.facebook.ads.redexgen.X.AbstractC04624g.A07(A01(0, 10, 60), A01(10, 35, 123) + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0189, code lost:
        if (r8.A0A() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x018f, code lost:
        if (r8.A0A() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0191, code lost:
        A06(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0194, code lost:
        r8.A07(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019b, code lost:
        if (r8.A0A() == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019d, code lost:
        r8.A07(8);
        r8.A04();
        r8.A04();
        r8.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a9, code lost:
        A07(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01b0, code lost:
        if (r8.A0A() == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01b2, code lost:
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b7, code lost:
        if (r3 >= r8.A04()) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01b9, code lost:
        r8.A07((r12 + 4) + 1);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d6, code lost:
        if (r8.A0A() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
        r8.A07(2);
        r6 = 1.0f;
        r7 = r8.A0A();
        r5 = com.facebook.ads.redexgen.X.C1948lJ.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f5, code lost:
        if (r5[3].charAt(26) == r5[0].charAt(26)) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01fd, code lost:
        r5 = com.facebook.ads.redexgen.X.C1948lJ.A0F;
        r5[1] = "Qhh03oXiZoC3MQNHpV44xa4z9JOwBySi";
        r5[5] = "nsJWuxtHUvrlBy67rSbmxe3xvaeZTSox";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0209, code lost:
        if (r7 == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x020f, code lost:
        if (r8.A0A() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0211, code lost:
        r5 = r8.A05(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0219, code lost:
        if (r5 != 255) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021b, code lost:
        r3 = r8.A05(16);
        r2 = r8.A05(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0225, code lost:
        if (r3 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0227, code lost:
        if (r2 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0229, code lost:
        r6 = r3 / r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0230, code lost:
        if (r8.A0A() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0232, code lost:
        r8.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0239, code lost:
        if (r8.A0A() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x023b, code lost:
        r8.A07(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0243, code lost:
        if (r8.A0A() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0245, code lost:
        r8.A07(24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x024e, code lost:
        if (r8.A0A() == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0250, code lost:
        r8.A04();
        r8.A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0256, code lost:
        r8.A06();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x025d, code lost:
        if (r8.A0A() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025f, code lost:
        r1 = r1 * 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2242qI A00(String str, L4 l4, L4 l42, L4 l43) {
        byte[] bArr = new byte[l4.A00 + l42.A00 + l43.A00];
        System.arraycopy(l4.A01, 0, bArr, 0, l4.A00);
        System.arraycopy(l42.A01, 0, bArr, l4.A00, l42.A00);
        System.arraycopy(l43.A01, 0, bArr, l4.A00 + l42.A00, l43.A00);
        HU hu = new HU(l42.A01, 0, l42.A00);
        hu.A07(44);
        int maxSubLayersMinus1 = hu.A05(3);
        hu.A06();
        int A05 = hu.A05(2);
        boolean A0A = hu.A0A();
        int generalProfileCompatibilityFlags = hu.A05(5);
        int generalLevelIdc = 0;
        int i = 0;
        while (true) {
            if (i < 32) {
                boolean A0A2 = hu.A0A();
                String[] strArr = A0F;
                if (strArr[1].charAt(22) == strArr[5].charAt(22)) {
                    break;
                }
                String[] strArr2 = A0F;
                strArr2[4] = "ikltzL6qI9vduPGnQ2PfcHBicoSlJtZK";
                strArr2[6] = "dtFG8mkM92kb76Motxy98XM75Kybvtjp";
                if (A0A2) {
                    generalLevelIdc |= 1 << i;
                }
                i++;
            } else {
                String[] strArr3 = A0F;
                if (strArr3[3].charAt(26) != strArr3[0].charAt(26)) {
                    throw new RuntimeException();
                }
                A0F[7] = "KUK36SaeRyaSjOylRKRM5Zy9KuAImCCo";
                int[] iArr = new int[6];
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = hu.A05(8);
                }
                int toSkip = hu.A05(8);
                int i3 = 0;
                for (int i4 = 0; i4 < maxSubLayersMinus1; i4++) {
                    if (hu.A0A()) {
                        i3 += 89;
                    }
                    if (hu.A0A()) {
                        i3 += 8;
                    }
                }
                hu.A07(i3);
                if (maxSubLayersMinus1 > 0) {
                    hu.A07((8 - maxSubLayersMinus1) * 2);
                }
                hu.A04();
                int A04 = hu.A04();
                if (A04 == 3) {
                    hu.A06();
                }
                int A042 = hu.A04();
                int chromaFormatIdc = hu.A04();
                if (hu.A0A()) {
                    int generalProfileSpace = hu.A04();
                    int A043 = hu.A04();
                    int toSkip2 = hu.A04();
                    int A044 = hu.A04();
                    int subHeightC = (A04 == 1 || A04 == 2) ? 2 : 1;
                    A042 -= (generalProfileSpace + A043) * subHeightC;
                    chromaFormatIdc -= (toSkip2 + A044) * (A04 == 1 ? 2 : 1);
                }
                hu.A04();
                hu.A04();
                int A045 = hu.A04();
                int picHeightInLumaSamples = hu.A0A() ? 0 : maxSubLayersMinus1;
                while (picHeightInLumaSamples <= maxSubLayersMinus1) {
                    hu.A04();
                    hu.A04();
                    String[] strArr4 = A0F;
                    if (strArr4[4].charAt(1) != strArr4[6].charAt(1)) {
                        String[] strArr5 = A0F;
                        strArr5[4] = "fwNj3DlAlR0ZRIXGIjbE9kdq2ymmau9c";
                        strArr5[6] = "Cn1Ujy3ajzEe008QMYirASp4B4RzqpC3";
                        hu.A04();
                        picHeightInLumaSamples++;
                    } else {
                        hu.A04();
                        picHeightInLumaSamples++;
                    }
                }
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                hu.A04();
                if (A0F[7].charAt(7) != 'e') {
                    A0F[2] = "36O4TNRZJCi";
                    hu.A04();
                } else {
                    String[] strArr6 = A0F;
                    strArr6[1] = "kgp7PzaRA7bebGNLV6O0LLC564MCujGY";
                    strArr6[5] = "FSYBvyZkCpJq4xL9y4GBHyTimpUH7OJt";
                    hu.A04();
                }
            }
        }
        throw new RuntimeException();
    }

    @EnsuresNonNull({"output", "sampleReader"})
    private void A02() {
        AbstractC04543y.A02(this.A02);
    }

    @RequiresNonNull({"output", "sampleReader"})
    private void A04(long j, int i, int i2, long j2) {
        this.A03.A05(j, i, this.A05);
        if (!this.A05) {
            this.A0B.A04(i2);
            this.A09.A04(i2);
            this.A07.A04(i2);
            if (this.A0B.A03() && this.A09.A03() && this.A07.A03()) {
                this.A02.A6e(A00(this.A04, this.A0B, this.A09, this.A07));
                this.A05 = true;
            }
        }
        L4 l4 = this.A08;
        if (A0F[2].length() == 29) {
            throw new RuntimeException();
        }
        A0F[7] = "vr6kqTkennNRVlA9BYLGssdVYhiLrcAb";
        if (l4.A04(i2)) {
            this.A06.A0j(this.A08.A01, HS.A02(this.A08.A01, this.A08.A00));
            this.A06.A0g(5);
            this.A0C.A02(j2, this.A06);
        }
        if (this.A0A.A04(i2)) {
            this.A06.A0j(this.A0A.A01, HS.A02(this.A0A.A01, this.A0A.A00));
            this.A06.A0g(5);
            this.A0C.A02(j2, this.A06);
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A05(long j, int i, int i2, long j2) {
        this.A03.A04(j, i, i2, j2, this.A05);
        if (!this.A05) {
            this.A0B.A01(i2);
            this.A09.A01(i2);
            this.A07.A01(i2);
        }
        this.A08.A01(i2);
        String[] strArr = A0F;
        if (strArr[4].charAt(1) == strArr[6].charAt(1)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[3] = "1KFxNiiYNj5YwxcZPXf7qOLOZg48Utfw";
        strArr2[0] = "AJhXWbHH6DfoOyxWmdhumfQDrV4Rkjlm";
        this.A0A.A01(i2);
    }

    public static void A06(HU hu) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (!hu.A0A()) {
                    hu.A04();
                } else {
                    int sizeId = i << 1;
                    int min = Math.min(64, 1 << (sizeId + 4));
                    if (i > 1) {
                        hu.A03();
                    }
                    for (int coefNum = 0; coefNum < min; coefNum++) {
                        hu.A03();
                        String[] strArr = A0F;
                        String str = strArr[1];
                        String str2 = strArr[5];
                        int charAt = str.charAt(22);
                        int sizeId2 = str2.charAt(22);
                        if (charAt == sizeId2) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0F;
                        strArr2[1] = "RIQaKQF3d2DPjAKRmkcEP1Qw2m8MXhOp";
                        strArr2[5] = "Zvlj8YgWRgjcS6ffkQSgKy13bXSJEEo8";
                    }
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void A07(HU hu) {
        int A04 = hu.A04();
        boolean z = false;
        int numNegativePics = 0;
        for (int stRpsIdx = 0; stRpsIdx < A04; stRpsIdx++) {
            if (stRpsIdx != 0) {
                z = hu.A0A();
            }
            if (z) {
                hu.A06();
                hu.A04();
                for (int i = 0; i <= numNegativePics; i++) {
                    if (hu.A0A()) {
                        hu.A06();
                    }
                }
            } else {
                int previousNumDeltaPocs = hu.A04();
                int A042 = hu.A04();
                numNegativePics = previousNumDeltaPocs + A042;
                for (int numShortTermRefPicSets = 0; numShortTermRefPicSets < previousNumDeltaPocs; numShortTermRefPicSets++) {
                    hu.A04();
                    hu.A06();
                }
                for (int numShortTermRefPicSets2 = 0; numShortTermRefPicSets2 < A042; numShortTermRefPicSets2++) {
                    hu.A04();
                    hu.A06();
                }
            }
        }
    }

    @RequiresNonNull({"sampleReader"})
    private void A08(byte[] bArr, int i, int i2) {
        this.A03.A06(bArr, i, i2);
        if (!this.A05) {
            this.A0B.A02(bArr, i, i2);
            this.A09.A02(bArr, i, i2);
            this.A07.A02(bArr, i, i2);
        }
        this.A08.A02(bArr, i, i2);
        this.A0A.A02(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5A(C04774v c04774v) {
        A02();
        while (c04774v.A07() > 0) {
            int limit = c04774v.A09();
            int A0A = c04774v.A0A();
            byte[] A0l = c04774v.A0l();
            long j = this.A01;
            int offset = c04774v.A07();
            this.A01 = j + offset;
            InterfaceC0780Hd interfaceC0780Hd = this.A02;
            int offset2 = c04774v.A07();
            interfaceC0780Hd.AIr(c04774v, offset2);
            while (limit < A0A) {
                int A04 = HS.A04(A0l, limit, A0A, this.A0D);
                if (A04 == A0A) {
                    A08(A0l, limit, A0A);
                    return;
                }
                int bytesWrittenPastPosition = HS.A00(A0l, A04);
                int i = A04 - limit;
                if (A0F[7].charAt(7) != 'e') {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[1] = "NnhvxMiSCkNhwXkURhMspTAR6cceqM1j";
                strArr[5] = "7ARxjazDMsknrtTfPy5OOEp3py29nWBE";
                if (i > 0) {
                    A08(A0l, limit, A04);
                }
                int lengthToNalUnit = A0A - A04;
                long j2 = this.A01 - lengthToNalUnit;
                int offset3 = i < 0 ? -i : 0;
                A04(j2, lengthToNalUnit, offset3, this.A00);
                long absolutePosition = this.A00;
                A05(j2, lengthToNalUnit, bytesWrittenPastPosition, absolutePosition);
                limit = A04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void A5c(HA ha, LG lg) {
        lg.A05();
        this.A04 = lg.A04();
        this.A02 = ha.AKS(lg.A03(), 2);
        this.A03 = new L3(this.A02);
        this.A0C.A03(ha, lg);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGp() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AGq(long j, int i) {
        if (j != C10323vs.b) {
            this.A00 = j;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0875Kv
    public final void AJ5() {
        this.A01 = 0L;
        this.A00 = C10323vs.b;
        HS.A0H(this.A0D);
        this.A0B.A00();
        this.A09.A00();
        this.A07.A00();
        this.A08.A00();
        this.A0A.A00();
        if (this.A03 != null) {
            this.A03.A03();
        }
    }
}
