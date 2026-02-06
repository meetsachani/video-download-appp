package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class Y3<T> implements InterfaceC1110Uc<T> {
    public static byte[] A06;
    public static String[] A07 = {"EKA8QeB4steRJ5RPBpFUjw3mjvi5", "fve4ITv79qbm2xvzEK1yqXI", "ABPapESs8CyLRtVNwfFPA7A05iROvZsV", "0Lyphf8QRYP2FOEDF4CKVyWqrMlG", "sjHSRvprFPL1Hzs2shXil", "0UuY0i89chpuUt8804PTKlfzEuvvqf4a", "FkeetCIpWmPLoPieiedf1X3IWnyHYH7Q", "bw9eqk6z"};
    public UU A00;
    public UU A01;
    public List<Y3<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final UT A04;
    public final C1117Uj A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {68, 102, 105, C3307Iz.Z, 104, 105, 107, 126, C3307Iz.Z, 99, 98, 107, 98, 115, 98, C3307Iz.Z, 100, 114, 117, 116, 104, 117, 116, C3307Iz.Z, 119, 104, 110, 105, 115, 110, 105, 96, C3307Iz.Z, 102, 115, C3307Iz.Z, 115, 111, 98, C3307Iz.Z, 99, 102, 115, 102, 101, 102, 116, 98, C3307Iz.Z, 116, 115, 102, 117, 115, 87, 97, 102, 103, 123, 102, 52, 100, 123, 103, 125, 96, 125, 123, 122, 52, 125, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, C4715Xk.i, 56, 52, 117, 122, 112, 52, 102, 113, 119, 123, 102, 112, 52, 114, 125, QC1.w, 113, 52, 103, 113, 101, 97, 113, 122, 119, 113, 52, 103, 96, 117, 102, 96, 103, 52, 117, 96, 52, 60, 49, 112, 56, 49, 112, C4715Xk.i, C3307Iz.f0, 52, 112, 117, 96, 117, 52, 124, 117, 103, 52, 100, 102, 123, 118, 117, 118, QC1.w, 109, 52, 118, 113, 113, 122, 52, QC1.w, 123, 103, 96, 28, 42, C3307Iz.e0, C3307Iz.d0, 48, C3307Iz.e0, Byte.MAX_VALUE, 47, 48, C3307Iz.d0, 54, C3307Iz.c0, 54, 48, 49, Byte.MAX_VALUE, 54, C3307Iz.d0, Byte.MAX_VALUE, 62, C3307Iz.c0, Byte.MAX_VALUE, 119, 122, 59, 115, 122, 59, 118, 115, Byte.MAX_VALUE, C4715Xk.i, 42, C3307Iz.c0, Byte.MAX_VALUE, C3307Iz.e0, 58, 60, 48, C3307Iz.e0, 59, Byte.MAX_VALUE, 57, 54, 51, 58, Byte.MAX_VALUE, C3307Iz.d0, 58, C3307Iz.f0, 42, 58, 49, 60, 58, Byte.MAX_VALUE, 48, 49, 51, C3307Iz.Y, Byte.MAX_VALUE, 55, 62, C3307Iz.d0, Byte.MAX_VALUE, 57, 54, 51, 58, Byte.MAX_VALUE, 122, 59, 101, Byte.MAX_VALUE, 59, 62, C3307Iz.c0, 62, Byte.MAX_VALUE, 55, 62, C3307Iz.d0, Byte.MAX_VALUE, 47, C3307Iz.e0, 48, C4715Xk.i, 62, C4715Xk.i, 51, C3307Iz.Y, Byte.MAX_VALUE, C4715Xk.i, 58, 58, 49, Byte.MAX_VALUE, 51, 48, C3307Iz.d0, C3307Iz.c0, 97, 70, 78, 75, 66, 67, 7, 83, 72, 7, 70, 67, 67, 7, 67, 70, 83, 70, 7, 83, 72, 7, 75, 72, 64, 8, 47, C3307Iz.Z, 34, C3307Iz.c0, 42, 110, 58, C3307Iz.V, 110, C3307Iz.e0, 34, C3307Iz.c0, 47, 60, 110, 42, 47, 58, 47, C3307Iz.d0, 47, C4715Xk.i, C3307Iz.c0, C8077mf.m, C3307Iz.d0, 36, C3307Iz.V, 40, C3307Iz.a0, 109, 57, 34, 109, C3307Iz.c0, 40, 57, C3307Iz.f0, C3307Iz.X, 109, C3307Iz.a0, C3307Iz.d0, 57, C3307Iz.d0, 109, C3307Iz.c0, ED2.a, 34, 32, 109, C3307Iz.V, 34, 42, 102, 65, 73, 76, 69, 68, 0, 84, 79, 0, 71, 69, 84, 0, 82, 69, 67, 79, 82, 68, 0, 67, 79, 85, 78, 84, 73, 110, 102, 99, 106, 107, 47, 123, 96, 47, 122, Byte.MAX_VALUE, 107, 110, 123, 106, 47, 105, 102, 99, 106, 47, 124, 106, 126, 122, 106, 97, 108, 106, 48, 7, 1, 13, C8077mf.r, 6, 36, C8077mf.m, C8077mf.p, 7, 32, 3, 17, 7, 6, 48, 7, 1, 13, C8077mf.r, 6, C3307Iz.Y, 3, C8077mf.z, 3, 0, 3, 17, 7, 66, 1, C8077mf.p, 13, 17, 7, 6, 119, 64, 70, 74, 87, 65, 99, 76, 73, 64, 103, 68, 86, 64, 65, 119, 64, 70, 74, 87, 65, 97, 68, 81, 68, 71, 68, 86, 64, 5, 76, 86, 5, 70, 73, 74, 86, 64, 65, 119, 76, 73, 76, 77, 85, 76, 2, 112, 71, 65, 77, 80, 70, 100, 75, 78, 71, 96, 67, 81, 71, 70, 112, 71, 65, 77, 80, 70, 102, 67, 86, 67, 64, 67, 81, 71, 2, 68, 71, 86, 65, 74, 70, 80, 87, 86, 74, 87, C8077mf.D, 31, 10, 31};
        if (A07[6].charAt(28) == 'd') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "G0nCZJj0prSQWtMWq2fjymNjpmI3wJ1o";
        strArr[2] = "hmxAaa3VGXWJOtMylrC9mnhyviZ0JnjG";
        A06 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Y3<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(Y8 y8) {
        if (this.A02.remove(y8)) {
            if (y8.A6X() > 0 && y8.A01().A02.A05(y8.A01().A01).equals(this.A01)) {
                this.A01 = y8.A00().A02;
            }
            return true;
        }
        return false;
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public Y3(UZ uz, InterfaceC1115Uh interfaceC1115Uh) throws IOException {
        this.A05 = new C1117Uj(uz.A04(A00(515, 4, 103)), interfaceC1115Uh);
        this.A04 = new UT(new File(uz.A05(), A00(509, 6, 60)));
        this.A00 = this.A04.A03();
        A05(interfaceC1115Uh);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        this.A00 = new UU(i, i2);
        this.A04.A04(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y8 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/Y3<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(Y8 y8) throws C1119Ul {
        if (!this.A03) {
            if (A06(y8)) {
                if (y8.A6X() == 0) {
                    return;
                }
                if (this.A00.A04(y8.A00().A02) == 0) {
                    try {
                        for (C1114Ug c1114Ug : y8.A00) {
                            if (c1114Ug.A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), y8.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new C1119Ul(A00(361, 30, 22), e);
                    }
                }
                throw new C1119Ul(A00(0, 54, 30));
            }
            throw new C1119Ul(A00(466, 43, 59));
        }
        throw new C1119Ul(A00(427, 39, 60));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A05(InterfaceC1115Uh interfaceC1115Uh) throws IOException {
        UU uu = new UU(this.A05.A06(), 0);
        UU recordSequenceStart = this.A00;
        if (uu.A04(recordSequenceStart) > 0) {
            Locale locale = Locale.US;
            UU recordSequenceStart2 = this.A00;
            Integer valueOf = Integer.valueOf(recordSequenceStart2.A02());
            UU recordSequenceStart3 = this.A00;
            interfaceC1115Uh.AIc(String.format(locale, A00(54, 102, 13), valueOf, Integer.valueOf(recordSequenceStart3.A03()), Integer.valueOf(uu.A02()), Integer.valueOf(uu.A03())));
            this.A00 = uu;
            return;
        }
        while (r1 < recordSequenceStart.A02()) {
            if (this.A05.A0D()) {
                uu = new UU(this.A05.A06(), 0);
            } else {
                Locale locale2 = Locale.US;
                UU recordSequenceStart4 = this.A00;
                Integer valueOf2 = Integer.valueOf(recordSequenceStart4.A02());
                UU recordSequenceStart5 = this.A00;
                interfaceC1115Uh.AIc(String.format(locale2, A00(C3503Kz.p0, 101, 70), valueOf2, Integer.valueOf(recordSequenceStart5.A03()), Integer.valueOf(uu.A02())));
                UU recordSequenceStart6 = new UU(this.A05.A06(), this.A05.A07());
                this.A00 = recordSequenceStart6;
                UT ut = this.A04;
                UU recordSequenceStart7 = this.A00;
                ut.A04(recordSequenceStart7);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y8 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Uc
    public final synchronized InterfaceC1109Ub A6W(byte[] bArr, int[] iArr) throws C1119Ul {
        Y3<T>.RecordFileBasedFetch y8;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    UX A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i2);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i3 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i += storageOffset2;
                    i2 += i3;
                    if (A0A.A01().A03() == UV.A03) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == UV.A04) {
                        break;
                    } else if (A0A.A01().A03() == UV.A05) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new UU(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i3);
                    }
                }
                y8 = new Y8(this, arrayList, mayHaveMoreData);
                this.A02.add(y8);
                if (!arrayList.isEmpty()) {
                    UU uu = y8.A01().A02;
                    int storageOffset6 = y8.A01().A01;
                    this.A01 = uu.A05(storageOffset6);
                }
            } catch (IOException e) {
                throw new C1119Ul(A00(306, 29, 84), e);
            }
        } else {
            throw new C1119Ul(A00(391, 36, 123));
        }
        return y8;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Uc
    public final synchronized int A8s() throws C1119Ul {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e) {
                throw new C1119Ul(A00(335, 26, 57), e);
            }
        } else {
            throw new C1119Ul(A00(427, 39, 60));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Uc
    public final synchronized void AKH(byte[] bArr) throws C1119Ul {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new C1119Ul(A00(257, 25, 62), e);
            }
        } else {
            throw new C1119Ul(A00(427, 39, 60));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1110Uc
    public final synchronized void clear() throws C1119Ul {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new C1119Ul(A00(282, 24, 87), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Y3 != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
