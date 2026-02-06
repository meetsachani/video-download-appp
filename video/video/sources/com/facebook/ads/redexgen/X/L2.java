package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.util.Arrays;
import o.C10323vs;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class L2 {
    public static String[] A0I = {"PiFB59Vxde45j8XGh3VNLS0bXquL", "eCGnEp7n3q", "QH0EN4bfbiXOmvaYxmEgWcgYRTVGFgtW", "ynU2FJVvbbIz4lLWIxM7HwzaaEzIs2yM", "B", "nKAZbJPu58l8", "2xLWRKjlXe7o2y", "tMbtJGMRwKJD523"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final InterfaceC0780Hd A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final SparseArray<HR> A0D = new SparseArray<>();
    public final SparseArray<HQ> A0C = new SparseArray<>();
    public L1 A06 = new L1();
    public L1 A07 = new L1();
    public byte[] A0B = new byte[128];
    public final HU A0E = new HU(this.A0B, 0, 0);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 26 out of bounds for length 26
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A05(byte[] bArr, int i, int i2) {
        String[] strArr;
        if (this.A08) {
            int i3 = i2 - i;
            if (this.A0B.length < this.A00 + i3) {
                byte[] bArr2 = this.A0B;
                int i4 = this.A00;
                if (A0I[2].charAt(10) != 'z') {
                    A0I[3] = "fF62whIImPZuUxQ3wOrH7qahZ1W3GZDe";
                    this.A0B = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                throw new RuntimeException();
            }
            System.arraycopy(bArr, i, this.A0B, this.A00, i3);
            this.A00 += i3;
            this.A0E.A08(this.A0B, 0, this.A00);
            if (this.A0E.A0B(8)) {
                this.A0E.A06();
                int A05 = this.A0E.A05(2);
                this.A0E.A07(5);
                if (this.A0E.A09()) {
                    this.A0E.A04();
                    if (this.A0E.A09()) {
                        int A04 = this.A0E.A04();
                        if (!this.A0H) {
                            this.A08 = false;
                            this.A07.A03(A04);
                            if (A0I[1].length() == 10) {
                                String[] strArr2 = A0I;
                                strArr2[4] = "L";
                                strArr2[0] = "t7NRPrzJk7qeXS0lN2m3lGyrxGU0";
                                return;
                            }
                            throw new RuntimeException();
                        } else if (this.A0E.A09()) {
                            int A042 = this.A0E.A04();
                            if (this.A0C.indexOfKey(A042) < 0) {
                                this.A08 = false;
                                return;
                            }
                            HQ hq = this.A0C.get(A042);
                            HR hr = this.A0D.get(hq.A01);
                            if (hr.A0D) {
                                if (!this.A0E.A0B(2)) {
                                    return;
                                }
                                this.A0E.A07(2);
                            }
                            HU hu = this.A0E;
                            int i5 = hr.A02;
                            if (A0I[3].charAt(31) != 'R') {
                                String[] strArr3 = A0I;
                                strArr3[4] = "Y";
                                strArr3[0] = "LBdvSwh0xb7fkSyUzFJrubBBNhQW";
                                if (!hu.A0B(i5)) {
                                    return;
                                }
                            } else if (!hu.A0B(i5)) {
                                return;
                            }
                            boolean z = false;
                            boolean z2 = false;
                            boolean z3 = false;
                            int A052 = this.A0E.A05(hr.A02);
                            if (hr.A0C) {
                                if (A0I[1].length() != 10) {
                                    A0I[6] = "9PoEa2ZU2Rc4Mb";
                                } else {
                                    A0I[6] = "45zkVvkeN2w0fF";
                                }
                            } else if (!this.A0E.A0B(1)) {
                                return;
                            } else {
                                z = this.A0E.A0A();
                                if (z) {
                                    if (!this.A0E.A0B(1)) {
                                        return;
                                    }
                                    z3 = this.A0E.A0A();
                                    z2 = true;
                                } else if (A0I[3].charAt(31) != 'R') {
                                    String[] strArr4 = A0I;
                                    strArr4[4] = C2638Cg0.Z4;
                                    strArr4[0] = "19iwLQZiC4kcbLDxX6EkwfmmLREP";
                                }
                            }
                            boolean z4 = this.A01 == 5;
                            int i6 = 0;
                            if (z4) {
                                if (!this.A0E.A09()) {
                                    return;
                                }
                                i6 = this.A0E.A04();
                            }
                            int i7 = 0;
                            int i8 = 0;
                            int i9 = 0;
                            int i10 = 0;
                            if (hr.A07 != 0) {
                                if (hr.A07 == 1 && !hr.A0B) {
                                    if (!this.A0E.A09()) {
                                        return;
                                    }
                                    i9 = this.A0E.A03();
                                    if (hq.A02 && !z) {
                                        if (!this.A0E.A09()) {
                                            return;
                                        }
                                        i10 = this.A0E.A03();
                                    }
                                }
                                strArr = A0I;
                                if (strArr[5].length() == strArr[7].length()) {
                                }
                            } else if (!this.A0E.A0B(hr.A06)) {
                                return;
                            } else {
                                i7 = this.A0E.A05(hr.A06);
                                if (hq.A02 && !z) {
                                    if (!this.A0E.A09()) {
                                        return;
                                    }
                                    i8 = this.A0E.A03();
                                    if (A0I[3].charAt(31) != 'R') {
                                        A0I[2] = "kr3yeibAy42hiyE0dA9TA4Dy6aRxjun2";
                                    } else {
                                        A0I[1] = "MkKVWDrQaD";
                                    }
                                }
                                strArr = A0I;
                                if (strArr[5].length() == strArr[7].length()) {
                                    A0I[1] = "lSna5RLd1h";
                                } else {
                                    A0I[6] = "3KoChTLYrqIZNd";
                                }
                            }
                            this.A07.A04(hr, A05, A04, A052, A042, z, z2, z3, z4, i6, i7, i8, i9, i10);
                            this.A08 = false;
                        }
                    }
                }
            }
        }
    }

    public L2(InterfaceC0780Hd interfaceC0780Hd, boolean z, boolean z2) {
        this.A0F = interfaceC0780Hd;
        this.A0G = z;
        this.A0H = z2;
        A01();
    }

    private void A00(int i) {
        if (this.A05 == C10323vs.b) {
            return;
        }
        boolean z = this.A0A;
        this.A0F.AIu(this.A05, z ? 1 : 0, (int) (this.A02 - this.A04), i, null);
    }

    public final void A01() {
        this.A08 = false;
        this.A09 = false;
        this.A07.A02();
    }

    public final void A02(long j, int i, long j2) {
        this.A01 = i;
        this.A03 = j2;
        this.A02 = j;
        if (!this.A0G || this.A01 != 1) {
            if (!this.A0H) {
                return;
            }
            if (this.A01 != 5 && this.A01 != 1 && this.A01 != 2) {
                return;
            }
        }
        L1 l1 = this.A06;
        L1 l12 = this.A07;
        if (A0I[1].length() != 10) {
            throw new RuntimeException();
        }
        A0I[6] = "uj74NyijhUvg4q";
        this.A06 = l12;
        this.A07 = l1;
        L1 newSliceHeader = this.A07;
        newSliceHeader.A02();
        this.A00 = 0;
        this.A08 = true;
    }

    public final void A03(HQ hq) {
        this.A0C.append(hq.A00, hq);
    }

    public final void A04(HR hr) {
        this.A0D.append(hr.A09, hr);
    }

    public final boolean A06() {
        return this.A0H;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A07(long j, int i, boolean z, boolean z2) {
        boolean A00;
        boolean z3 = false;
        if (this.A01 != 9) {
            if (this.A0H) {
                A00 = this.A07.A00(this.A06);
            }
            if (this.A0G) {
                z2 = this.A07.A05();
            }
            boolean z4 = this.A0A;
            if (this.A01 != 5 || (z2 && this.A01 == 1)) {
                z3 = true;
            }
            this.A0A = z4 | z3;
            boolean treatIFrameAsKeyframe = this.A0A;
            return treatIFrameAsKeyframe;
        }
        if (z && this.A09) {
            A00(i + ((int) (j - this.A02)));
        }
        this.A04 = this.A02;
        this.A05 = this.A03;
        this.A0A = false;
        this.A09 = true;
        if (this.A0G) {
        }
        boolean z42 = this.A0A;
        if (this.A01 != 5) {
        }
        z3 = true;
        this.A0A = z42 | z3;
        boolean treatIFrameAsKeyframe2 = this.A0A;
        return treatIFrameAsKeyframe2;
    }
}
