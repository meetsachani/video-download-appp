package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import o.C10323vs;
import o.C3307Iz;
import o.C8077mf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.lR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1956lR implements H9 {
    public static byte[] A0C;
    public static String[] A0D = {"Jp9jYTsvX0byW8PsTh8WCsi4kS5THTDZ", "u9JmQf2RUpXkbwKGcH1ldYLO1OaAnoG0", "zVRI5h7vLNN08I5W1BFePAuDidXDjkLB", "GupX0AjjIH906l5opBlPCY0Mrv7mkKOY", "YLyM9aD6SKjNKerJ1EloHyT", "oAaNr5RuznTKLecZmpLN", "Q5WjYzMQ2NaCiwYPtyRn68zXUmvTXGHf", "bi8dQH0GL9bk2fQxVP7KQMQdOg6RbrhP"};
    public static final HD A0E;
    public int A00;
    public long A01;
    public long A02;
    public HA A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C04764u A08;
    public final C04774v A09;
    public final C04774v A0A;
    public final C1955lQ A0B;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{C3307Iz.Z, C8077mf.m, 6, C8077mf.n, 5, C8077mf.B, 7, C8077mf.q, C8077mf.p, 74, C3307Iz.c0, C3307Iz.f0, 62, 57, 74, C8077mf.C, C8077mf.H, C8077mf.B, C8077mf.q, C8077mf.m, 7};
    }

    static {
        A04();
        A0E = new HD() { // from class: com.facebook.ads.redexgen.X.lS
            @Override // com.facebook.ads.redexgen.X.HD
            public final H9[] A5N() {
                return C1956lR.A07();
            }

            @Override // com.facebook.ads.redexgen.X.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public C1956lR() {
        this(0);
    }

    public C1956lR(int i) {
        this.A07 = (i & 2) != 0 ? i | 1 : i;
        this.A0B = new C1955lQ(true);
        this.A09 = new C04774v(2048);
        this.A00 = -1;
        this.A01 = -1L;
        this.A0A = new C04774v(10);
        this.A08 = new C04764u(this.A0A.A0l());
    }

    public static int A00(int i, long j) {
        return (int) (((i * 8) * 1000000) / j);
    }

    private int A01(InterfaceC2033ms interfaceC2033ms) throws IOException {
        int i = 0;
        while (true) {
            interfaceC2033ms.AGt(this.A0A.A0l(), 0, 10);
            this.A0A.A0f(0);
            if (this.A0A.A0K() != 4801587) {
                break;
            }
            this.A0A.A0g(3);
            int length = this.A0A.A0H();
            int firstFramePosition = length + 10;
            i += firstFramePosition;
            interfaceC2033ms.A47(length);
        }
        interfaceC2033ms.AIl();
        interfaceC2033ms.A47(i);
        int firstFramePosition2 = (this.A01 > (-1L) ? 1 : (this.A01 == (-1L) ? 0 : -1));
        if (firstFramePosition2 == 0) {
            this.A01 = i;
        }
        return i;
    }

    private C2037mx A02(long j, boolean z) {
        return new C2037mx(j, this.A01, A00(this.A00, this.A0B.A0J()), this.A00, z);
    }

    @RequiresNonNull({"extractorOutput"})
    private void A05(long j, boolean z) {
        if (this.A05) {
            return;
        }
        boolean z2 = (this.A07 & 1) != 0 && this.A00 > 0;
        String[] strArr = A0D;
        if (strArr[2].charAt(14) != strArr[3].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[0] = "wRCLGMQDqXZHrYOEljE7cvu367IJP6qz";
        strArr2[1] = "FofxBB8LpAk5nYyyotl0uMBanfu6Lq1A";
        if (z2 && this.A0B.A0J() == C10323vs.b && !z) {
            return;
        }
        if (!z2 || this.A0B.A0J() == C10323vs.b) {
            this.A03.AJ7(new C2028mn(C10323vs.b));
        } else {
            this.A03.AJ7(A02(j, (this.A07 & 2) != 0));
        }
        this.A05 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
        r10.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
        throw com.facebook.ads.redexgen.X.C3K.A01(A03(0, 21, 88), null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A06(InterfaceC2033ms interfaceC2033ms) throws IOException {
        if (this.A04) {
            return;
        }
        this.A00 = -1;
        interfaceC2033ms.AIl();
        if (interfaceC2033ms.A8n() == 0) {
            A01(interfaceC2033ms);
        }
        int currentFrameSize = 0;
        long j = 0;
        while (true) {
            try {
                if (!interfaceC2033ms.AGu(this.A0A.A0l(), 0, 2, true)) {
                    break;
                }
                this.A0A.A0f(0);
                if (C1955lQ.A0F(this.A0A.A0M())) {
                    if (!interfaceC2033ms.AGu(this.A0A.A0l(), 0, 4, true)) {
                        break;
                    }
                    this.A08.A08(14);
                    int A04 = this.A08.A04(13);
                    int numValidFrames = A0D[7].charAt(7);
                    if (numValidFrames != 114) {
                        A0D[4] = "EiGF";
                        if (A04 <= 6) {
                            break;
                        }
                        j += A04;
                        currentFrameSize++;
                        if (currentFrameSize == 1000) {
                            break;
                        } else if (!interfaceC2033ms.A48(A04 - 6, true)) {
                            break;
                        }
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    currentFrameSize = 0;
                    break;
                }
            } catch (EOFException unused) {
            }
        }
        interfaceC2033ms.AIl();
        if (currentFrameSize > 0) {
            this.A00 = (int) (j / currentFrameSize);
        } else {
            this.A00 = -1;
        }
        this.A04 = true;
    }

    public static /* synthetic */ H9[] A07() {
        return new H9[]{new C1956lR()};
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AAC(HA ha) {
        this.A03 = ha;
        this.A0B.A5c(ha, new LG(0, 1));
        ha.A6O();
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final int AHL(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        AbstractC04543y.A02(this.A03);
        long A8O = interfaceC2033ms.A8O();
        if (((this.A07 & 2) == 0 && ((this.A07 & 1) == 0 || A8O == -1)) ? false : true) {
            A06(interfaceC2033ms);
        }
        int bytesRead = interfaceC2033ms.read(this.A09.A0l(), 0, 2048);
        boolean z = bytesRead == -1;
        A05(A8O, z);
        if (z) {
            return -1;
        }
        this.A09.A0f(0);
        this.A09.A0e(bytesRead);
        if (!this.A06) {
            this.A0B.AGq(this.A02, 4);
            this.A06 = true;
        }
        this.A0B.A5A(this.A09);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AHb() {
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final void AJ6(long j, long j2) {
        this.A06 = false;
        this.A0B.AJ5();
        this.A02 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.H9
    public final boolean AK5(InterfaceC2033ms interfaceC2033ms) throws IOException {
        int headerPosition;
        int A01 = A01(interfaceC2033ms);
        int i = A01;
        int frameSize = 0;
        int syncBytes = 0;
        do {
            interfaceC2033ms.AGt(this.A0A.A0l(), 0, 2);
            this.A0A.A0f(0);
            int startPosition = this.A0A.A0M();
            if (!C1955lQ.A0F(startPosition)) {
                syncBytes = 0;
                frameSize = 0;
                i++;
                interfaceC2033ms.AIl();
                interfaceC2033ms.A47(i);
            } else {
                syncBytes++;
                String[] strArr = A0D;
                String str = strArr[2];
                String str2 = strArr[3];
                int headerPosition2 = str.charAt(14);
                int startPosition2 = str2.charAt(14);
                if (headerPosition2 != startPosition2) {
                    throw new RuntimeException();
                }
                A0D[7] = "vlF0iwwjiK26GT4HTqGcAOiXXpcsHbpg";
                if (syncBytes >= 4 && frameSize > 188) {
                    return true;
                }
                interfaceC2033ms.AGt(this.A0A.A0l(), 0, 4);
                this.A08.A08(14);
                C04764u c04764u = this.A08;
                int headerPosition3 = A0D[5].length();
                if (headerPosition3 == 4) {
                    throw new RuntimeException();
                }
                A0D[4] = "LrBCAcAc8FKB1NeW";
                int headerPosition4 = c04764u.A04(13);
                if (headerPosition4 <= 6) {
                    syncBytes = 0;
                    frameSize = 0;
                    i++;
                    interfaceC2033ms.AIl();
                    interfaceC2033ms.A47(i);
                } else {
                    int startPosition3 = headerPosition4 - 6;
                    interfaceC2033ms.A47(startPosition3);
                    frameSize += headerPosition4;
                }
            }
            headerPosition = i - A01;
        } while (headerPosition < 8192);
        return false;
    }
}
