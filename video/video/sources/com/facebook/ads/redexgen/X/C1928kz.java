package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.ED2;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.kz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1928kz implements H9 {
    public static byte[] A07;
    public static String[] A08 = {"DwCwNe", "sWjhkz5Jk0aFlWxF8RAhYepliqmDVBH5", "fJB4aZ6fjAPSNUZta8hrgw0qJ7r8hoM5", "QGFmFhkJVom57VKObFa8uqUV9", "rnOb7nHa90E2wPIfOCxC", "at6D0iA1D4bxl", "SWjjSn0lfORi", "B3tBBFyQt38AAQleoY5s"};
    public static final HD A09;
    public HA A04;
    public InterfaceC0780Hd A05;
    public LL A06;
    public int A01 = 0;
    public long A03 = -1;
    public int A00 = -1;
    public long A02 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{87, 91, 2, C3307Iz.Z, 50, C3307Iz.Z, 102, 35, 62, C3307Iz.X, 35, 35, 34, 53, 102, 47, 40, 54, 51, 50, 102, 42, 35, 40, C3307Iz.V, 50, C3307Iz.f0, 124, 102, C3307Iz.Z, 28, 1, 7, 2, 2, C8077mf.G, 0, 6, C8077mf.A, C8077mf.z, 82, C3307Iz.X, 51, 36, 82, C8077mf.x, C8077mf.G, 0, 31, 19, 6, 82, 6, C8077mf.m, 2, C8077mf.A, 72, 82, Byte.MAX_VALUE, 68, 89, 95, 90, 90, 69, 88, 94, 79, 78, 10, 69, 88, 10, 95, 68, 88, 79, 73, 69, 77, 68, 67, 80, 79, 78, 10, 93, 75, 92, 10, 76, 67, 70, 79, 10, 94, 83, 90, 79, 4, 103, 81, 70, 117, 72, 68, 66, 81, 83, 68, 95, 66, 17, 5, C8077mf.x, C8077mf.C, 31, 95, C8077mf.A, 71, 65, 65, 93, 17, 28, 17, 7, Byte.MAX_VALUE, 107, 122, 119, 113, 49, 121, C3307Iz.a0, 47, 47, 51, 115, 114, Byte.MAX_VALUE, 105, 55, 35, 50, ED2.a, 57, 121, 36, 55, C3307Iz.V};
    }

    static {
        A03();
        A09 = new HD() { // from class: com.facebook.ads.redexgen.X.l2
            @Override // com.facebook.ads.redexgen.X.HD
            public final H9[] A5N() {
                return C1928kz.A08();
            }

            @Override // com.facebook.ads.redexgen.X.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    private int A00(InterfaceC2033ms interfaceC2033ms) throws IOException {
        AbstractC04543y.A08(this.A02 != -1);
        return ((LL) AbstractC04543y.A01(this.A06)).AIt(interfaceC2033ms, this.A02 - interfaceC2033ms.A8n()) ? -1 : 0;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void A02() {
        AbstractC04543y.A02(this.A05);
    }

    private void A04(InterfaceC2033ms interfaceC2033ms) throws IOException {
        AbstractC04543y.A08(interfaceC2033ms.A8n() == 0);
        int i = this.A00;
        if (A08[5].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[7] = "oJOrgM3DzNUfWcxP3ghI";
        strArr[4] = "cZhhMb4kvP2y4vGeSU9A";
        if (i != -1) {
            interfaceC2033ms.AK3(this.A00);
            this.A01 = 4;
        } else if (LP.A06(interfaceC2033ms)) {
            interfaceC2033ms.AK3((int) (interfaceC2033ms.A8i() - interfaceC2033ms.A8n()));
            this.A01 = 1;
        } else {
            throw C3K.A01(A01(58, 42, 8), null);
        }
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    private void A05(InterfaceC2033ms interfaceC2033ms) throws IOException {
        LN wavFormat = LP.A02(interfaceC2033ms);
        if (wavFormat.A03 == 17) {
            this.A06 = new C1930l1(this.A04, this.A05, wavFormat);
        } else if (wavFormat.A03 == 6) {
            this.A06 = new C1929l0(this.A04, this.A05, wavFormat, A01(112, 15, 82), -1);
        } else if (wavFormat.A03 == 7) {
            this.A06 = new C1929l0(this.A04, this.A05, wavFormat, A01(127, 15, 60), -1);
        } else {
            int A00 = AbstractC0788Hl.A00(wavFormat.A03, wavFormat.A01);
            if (A00 != 0) {
                this.A06 = new C1929l0(this.A04, this.A05, wavFormat, A01(C3503Kz.f0, 9, 116), A00);
            } else {
                throw C3K.A00(A01(29, 29, 80) + wavFormat.A03);
            }
        }
        this.A01 = 3;
    }

    private void A06(InterfaceC2033ms interfaceC2033ms) throws IOException {
        this.A03 = LP.A00(interfaceC2033ms);
        this.A01 = 2;
    }

    private void A07(InterfaceC2033ms interfaceC2033ms) throws IOException {
        Pair<Long, Long> A01 = LP.A01(interfaceC2033ms);
        this.A00 = ((Long) A01.first).intValue();
        long longValue = ((Long) A01.second).longValue();
        if (this.A03 != -1) {
            int i = (longValue > 4294967295L ? 1 : (longValue == 4294967295L ? 0 : -1));
            String[] strArr = A08;
            if (strArr[7].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "zD8CpsX01ISLh3RSws8RgUnhS";
            strArr2[6] = "h3zG6U6JIHw0";
            if (i == 0) {
                longValue = this.A03;
            }
        }
        this.A02 = this.A00 + longValue;
        long A8O = interfaceC2033ms.A8O();
        if (A8O != -1 && this.A02 > A8O) {
            AbstractC04624g.A07(A01(100, 12, 18), A01(2, 27, 100) + this.A02 + A01(0, 2, 89) + A8O);
            this.A02 = A8O;
        }
        ((LL) AbstractC04543y.A01(this.A06)).AA8(this.A00, this.A02);
        this.A01 = 4;
    }

    public static /* synthetic */ H9[] A08() {
        return new H9[]{new C1928kz()};
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AAC(HA ha) {
        this.A04 = ha;
        this.A05 = ha.AKS(0, 1);
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final int AHL(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        A02();
        switch (this.A01) {
            case 0:
                A04(interfaceC2033ms);
                return 0;
            case 1:
                A06(interfaceC2033ms);
                if (A08[5].length() != 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[3] = "VLLh2GyvdfrrOjqYmUQdrqO3c";
                strArr[6] = "Miu4m4vLnYY2";
                return 0;
            case 2:
                A05(interfaceC2033ms);
                return 0;
            case 3:
                A07(interfaceC2033ms);
                return 0;
            case 4:
                return A00(interfaceC2033ms);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AJ6(long j, long j2) {
        this.A01 = j == 0 ? 0 : 4;
        if (this.A06 != null) {
            this.A06.AIk(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final boolean AK5(InterfaceC2033ms interfaceC2033ms) throws IOException {
        return LP.A06(interfaceC2033ms);
    }
}
