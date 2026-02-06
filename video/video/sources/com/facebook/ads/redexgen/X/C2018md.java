package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import o.C10323vs;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.md  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2018md implements H9 {
    public static String[] A0G = {"imixVRybNrgJBpwbrV4yrZtrfnRN6CnJ", "WtIdTgOpLr9NKs5TxCGGWraEed8Ae14z", "nvE", "WSn", "ErTHk7eYnTgSookYOy4dYMthSURbPHEq", "4jyr3GyUtTi8KljoItgNNDucP2AqNlsy", "x6x5cMRZdfdA3RZcYJIixT0Q9ac0Pw6j", "1jBqwsY8y2xmCvig0OcgZP2KEis0q"};
    public static final HD A0H = new HD() { // from class: com.facebook.ads.redexgen.X.me
        @Override // com.facebook.ads.redexgen.X.HD
        public final H9[] A5N() {
            return C2018md.A07();
        }

        @Override // com.facebook.ads.redexgen.X.HD
        public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
            return HC.A01(this, uri, map);
        }
    };
    public int A00;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public HA A06;
    public C2020mf A07;
    public C2015ma A08;
    public boolean A09;
    public boolean A0A;
    public final C04774v A0C = new C04774v(4);
    public final C04774v A0B = new C04774v(9);
    public final C04774v A0E = new C04774v(11);
    public final C04774v A0D = new C04774v();
    public final C2017mc A0F = new C2017mc();
    public int A01 = 1;

    private long A00() {
        if (this.A09) {
            long j = this.A04;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                String[] strArr2 = A0G;
                strArr2[2] = "BRg";
                strArr2[3] = "MUb";
                return j + this.A05;
            }
            throw new RuntimeException();
        } else if (this.A0F.A0D() == C10323vs.b) {
            return 0L;
        } else {
            return this.A05;
        }
    }

    private C04774v A01(InterfaceC2033ms interfaceC2033ms) throws IOException {
        if (this.A02 > this.A0D.A08()) {
            this.A0D.A0j(new byte[Math.max(this.A0D.A08() * 2, this.A02)], 0);
        } else {
            this.A0D.A0f(0);
        }
        this.A0D.A0e(this.A02);
        interfaceC2033ms.readFully(this.A0D.A0l(), 0, this.A02);
        return this.A0D;
    }

    @RequiresNonNull({"extractorOutput"})
    private void A02() {
        if (!this.A0A) {
            this.A06.AJ7(new C2028mn(C10323vs.b));
            this.A0A = true;
        }
    }

    private void A03(InterfaceC2033ms interfaceC2033ms) throws IOException {
        interfaceC2033ms.AK3(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean A04(InterfaceC2033ms interfaceC2033ms) throws IOException {
        if (interfaceC2033ms.AHR(this.A0B.A0l(), 0, 9, true)) {
            this.A0B.A0f(0);
            C04774v c04774v = this.A0B;
            String[] strArr = A0G;
            if (strArr[5].charAt(7) != strArr[0].charAt(7)) {
                String[] strArr2 = A0G;
                strArr2[5] = "nuvUOUbepbklYX7VO8aNhI2QGU1lTbhE";
                strArr2[0] = "EarG3ISTV8IaVYTIGtUgI942SJk0uODJ";
                c04774v.A0g(4);
                int A0I = this.A0B.A0I();
                int flags = A0I & 4;
                boolean z = flags != 0;
                int i = A0I & 1;
                String[] strArr3 = A0G;
                String str = strArr3[2];
                String str2 = strArr3[3];
                int length = str.length();
                int flags2 = str2.length();
                if (length != flags2) {
                    throw new RuntimeException();
                }
                A0G[6] = "imt3Psvl5i5WkMBxXJw1tYAVhho8FT7n";
                boolean hasAudio = i != 0;
                if (z && this.A07 == null) {
                    this.A07 = new C2020mf(this.A06.AKS(8, 1));
                }
                if (hasAudio && this.A08 == null) {
                    this.A08 = new C2015ma(this.A06.AKS(9, 2));
                }
                this.A06.A6O();
                int flags3 = this.A0B.A0C();
                this.A00 = (flags3 - 9) + 4;
                this.A01 = 2;
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    @RequiresNonNull({"extractorOutput"})
    private boolean A05(InterfaceC2033ms interfaceC2033ms) throws IOException {
        long j;
        boolean z = true;
        boolean z2 = false;
        long A00 = A00();
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            z2 = this.A07.A00(A01(interfaceC2033ms), A00);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            z2 = this.A08.A00(A01(interfaceC2033ms), A00);
        } else {
            if (this.A03 == 18) {
                boolean wasConsumed = this.A0A;
                if (!wasConsumed) {
                    z2 = this.A0F.A00(A01(interfaceC2033ms), A00);
                    long timestampUs = this.A0F.A0D();
                    if (timestampUs != C10323vs.b) {
                        this.A06.AJ7(new C2029mo(this.A0F.A0E(), this.A0F.A0F(), timestampUs));
                        this.A0A = true;
                    }
                }
            }
            interfaceC2033ms.AK3(this.A02);
            z = false;
        }
        boolean wasConsumed2 = this.A09;
        if (!wasConsumed2 && z2) {
            this.A09 = true;
            if (this.A0F.A0D() == C10323vs.b) {
                long j2 = this.A05;
                String[] strArr = A0G;
                if (strArr[5].charAt(7) == strArr[0].charAt(7)) {
                    throw new RuntimeException();
                }
                A0G[4] = "qsMwkk9xIwtWzz8Y8bf9D9RZC3dmDCSF";
                j = -j2;
            } else {
                j = 0;
            }
            this.A04 = j;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A06(InterfaceC2033ms interfaceC2033ms) throws IOException {
        if (interfaceC2033ms.AHR(this.A0E.A0l(), 0, 11, true)) {
            this.A0E.A0f(0);
            this.A03 = this.A0E.A0I();
            this.A02 = this.A0E.A0K();
            this.A05 = this.A0E.A0K();
            long A0I = this.A0E.A0I() << 24;
            if (A0G[4].charAt(4) != 'k') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "4ZAub2Q05bEVVYNgLvK28njcI37CKeIt";
            strArr[0] = "aUQSwXMZXC0bGVhjCWvBp2fyGyckkl15";
            this.A05 = (A0I | this.A05) * 1000;
            this.A0E.A0g(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    public static /* synthetic */ H9[] A07() {
        return new H9[]{new C2018md()};
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AAC(HA ha) {
        this.A06 = ha;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw new java.lang.RuntimeException();
     */
    @Override // com.facebook.ads.redexgen.X.H9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AHL(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        AbstractC04543y.A02(this.A06);
        while (true) {
            switch (this.A01) {
                case 1:
                    if (A04(interfaceC2033ms)) {
                        break;
                    } else {
                        return -1;
                    }
                case 2:
                    A03(interfaceC2033ms);
                    break;
                case 3:
                    boolean A06 = A06(interfaceC2033ms);
                    String[] strArr = A0G;
                    if (strArr[2].length() == strArr[3].length()) {
                        A0G[6] = "tWexpPkMi4voS1yCEJ5KNGfvnIQwX6NI";
                        if (A06) {
                            break;
                        } else {
                            return -1;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                case 4:
                    boolean A05 = A05(interfaceC2033ms);
                    if (A0G[6].charAt(17) == 'J') {
                        String[] strArr2 = A0G;
                        strArr2[5] = "hEtErmVw2pGEM2VKW7DPZ3jvJ8JWR8Qp";
                        strArr2[0] = "qL5KjU5Lqv7wAr3B2PcEEy6NtzLZKXIh";
                        if (!A05) {
                            break;
                        } else if (A0G[4].charAt(4) == 'k') {
                            A0G[7] = "EltTpHvyDDt";
                            return 0;
                        }
                    } else {
                        break;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AJ6(long j, long j2) {
        if (j == 0) {
            this.A01 = 1;
            this.A09 = false;
        } else {
            this.A01 = 3;
        }
        this.A00 = 0;
        if (A0G[4].charAt(4) != 'k') {
            throw new RuntimeException();
        }
        A0G[1] = "RsgGxkOp5mo19RRr3aJo3NcocokVUXQ7";
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final boolean AK5(InterfaceC2033ms interfaceC2033ms) throws IOException {
        interfaceC2033ms.AGt(this.A0C.A0l(), 0, 3);
        this.A0C.A0f(0);
        if (this.A0C.A0K() != 4607062) {
            return false;
        }
        interfaceC2033ms.AGt(this.A0C.A0l(), 0, 2);
        this.A0C.A0f(0);
        if ((this.A0C.A0M() & 250) != 0) {
            return false;
        }
        interfaceC2033ms.AGt(this.A0C.A0l(), 0, 4);
        this.A0C.A0f(0);
        int dataOffset = this.A0C.A0C();
        interfaceC2033ms.AIl();
        interfaceC2033ms.A47(dataOffset);
        interfaceC2033ms.AGt(this.A0C.A0l(), 0, 4);
        this.A0C.A0f(0);
        int dataOffset2 = this.A0C.A0C();
        return dataOffset2 == 0;
    }
}
