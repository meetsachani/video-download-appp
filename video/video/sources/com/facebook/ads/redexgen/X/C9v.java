package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.9v  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9v implements InterfaceC2091np, InterfaceC2092nq {
    public static String[] A06 = {"JXRw8dEnvO1Lr4g7cFUS0dvQrSj2gCrD", "hvHNuBxl", "xmWilmV3z2eIIj1", "UUtHfwhImwRJiupXWlBcpFq10hKf2hZ3", "Gjwbiw3zcCnfnivX0C6Z4KLegMayRhyW", "PFLAFIzQgEofbdrT2htWxpP7W2gVOOgi", "405rypbMY6P", "HWuA8Rz9jBHRgd5bymvhijPSyV36G6mN"};
    public long A00;
    public long A01;
    public long A02;
    public InterfaceC2092nq A03;
    public C2095nt[] A04 = new C2095nt[0];
    public final InterfaceC2091np A05;

    public C9v(InterfaceC2091np interfaceC2091np, boolean z, long j, long j2) {
        this.A05 = interfaceC2091np;
        this.A02 = z ? j : C10323vs.b;
        this.A01 = j;
        this.A00 = j2;
    }

    private C05547u A00(long j, C05547u c05547u) {
        long toleranceBeforeUs = C5C.A0T(c05547u.A01, 0L, j - this.A01);
        long A0T = C5C.A0T(c05547u.A00, 0L, this.A00 == Long.MIN_VALUE ? Long.MAX_VALUE : this.A00 - j);
        if (toleranceBeforeUs == c05547u.A01) {
            long j2 = c05547u.A00;
            if (A06[6].length() != 11) {
                throw new RuntimeException();
            }
            A06[0] = "SySHx2FlEzism2SEaRZKk1Ki9OIwKCgL";
            if (A0T == j2) {
                return c05547u;
            }
        }
        return new C05547u(toleranceBeforeUs, A0T);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.DW
    /* renamed from: A01 */
    public final void ADV(InterfaceC2091np interfaceC2091np) {
        ((InterfaceC2092nq) AbstractC04543y.A01(this.A03)).ADV(this);
    }

    public static boolean A02(long j, InterfaceC2054nE[] interfaceC2054nEArr) {
        if (j != 0) {
            for (InterfaceC2054nE interfaceC2054nE : interfaceC2054nEArr) {
                if (interfaceC2054nE != null) {
                    C2242qI A92 = interfaceC2054nE.A92();
                    if (!C3J.A0G(A92.A0W, A92.A0R)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A03() {
        return this.A02 != C10323vs.b;
    }

    @Override // com.facebook.ads.redexgen.X.DX
    @MetaExoPlayerCustomization("Added in D19760981 for cancel request")
    public final void A4s(long j) {
        this.A05.A4s(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final boolean A5C(long j) {
        return this.A05.A5C(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final void A60(long j, boolean z) {
        this.A05.A60(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final long A6r(long j, C05547u c05547u) {
        if (j == this.A01) {
            return this.A01;
        }
        return this.A05.A6r(j, A00(j, c05547u));
    }

    @Override // com.facebook.ads.redexgen.X.DX
    @MetaExoPlayerCustomization("Added in D9949576 for unstall buffer")
    public final long A76(long j) {
        return this.A05.A76(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final long A78() {
        long A78 = this.A05.A78();
        if (A78 == Long.MIN_VALUE || (this.A00 != Long.MIN_VALUE && A78 >= this.A00)) {
            return Long.MIN_VALUE;
        }
        return A78;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final long A8b() {
        long A8b = this.A05.A8b();
        if (A8b != Long.MIN_VALUE) {
            long nextLoadPositionUs = this.A00;
            int i = (nextLoadPositionUs > Long.MIN_VALUE ? 1 : (nextLoadPositionUs == Long.MIN_VALUE ? 0 : -1));
            if (A06[0].charAt(29) != 'C') {
                throw new RuntimeException();
            }
            A06[0] = "QBPPyRyowan8CCGBQiXIHMf03VOUOCSC";
            if (i == 0 || A8b < this.A00) {
                return A8b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final C2072nW A9M() {
        return this.A05.A9M();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final void ACS() throws IOException {
        if (0 == 0) {
            this.A05.ACS();
            return;
        }
        throw null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2092nq
    public final void AFS(InterfaceC2091np interfaceC2091np) {
        if (0 != 0) {
            return;
        }
        ((InterfaceC2092nq) AbstractC04543y.A01(this.A03)).AFS(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final void AH5(InterfaceC2092nq interfaceC2092nq, long j) {
        this.A03 = interfaceC2092nq;
        this.A05.AH5(this, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final long AHQ() {
        if (A03()) {
            long childDiscontinuityUs = this.A02;
            this.A02 = C10323vs.b;
            long AHQ = AHQ();
            return AHQ != C10323vs.b ? AHQ : childDiscontinuityUs;
        }
        InterfaceC2091np interfaceC2091np = this.A05;
        if (A06[2].length() != 0) {
            A06[6] = "ABWUoGiNBoa";
            long AHQ2 = interfaceC2091np.AHQ();
            if (AHQ2 == C10323vs.b) {
                return C10323vs.b;
            }
            long discontinuityUs = this.A01;
            boolean z = true;
            AbstractC04543y.A08(AHQ2 >= discontinuityUs);
            if (this.A00 != Long.MIN_VALUE) {
                long discontinuityUs2 = this.A00;
                if (AHQ2 > discontinuityUs2) {
                    z = false;
                }
            }
            AbstractC04543y.A08(z);
            return AHQ2;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final void AHW(long j) {
        this.A05.AHW(j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    public final long AJ8(@MetaExoPlayerCustomization long j, boolean z) {
        C2095nt[] c2095ntArr;
        this.A02 = C10323vs.b;
        boolean z2 = false;
        for (C2095nt c2095nt : this.A04) {
            if (c2095nt != null) {
                c2095nt.A00();
            }
        }
        long AJ8 = this.A05.AJ8(j, z);
        if (AJ8 == j || (AJ8 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ8 <= this.A00))) {
            z2 = true;
        }
        AbstractC04543y.A08(z2);
        return AJ8;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC2091np
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long AJ9(InterfaceC2054nE[] interfaceC2054nEArr, boolean[] zArr, DT[] dtArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.A04 = new C2095nt[dtArr.length];
        DT[] dtArr2 = new DT[dtArr.length];
        int i2 = 0;
        while (true) {
            DT dt = null;
            if (i2 >= dtArr.length) {
                break;
            }
            this.A04[i2] = (C2095nt) dtArr[i2];
            DT[] childStreams = this.A04;
            if (childStreams[i2] != null) {
                dt = this.A04[i2].A01;
            }
            dtArr2[i2] = dt;
            i2++;
        }
        long AJ9 = this.A05.AJ9(interfaceC2054nEArr, zArr, dtArr2, zArr2, j);
        if (A03() && j == this.A01) {
            long j3 = this.A01;
            String[] strArr = A06;
            if (strArr[4].charAt(5) == strArr[3].charAt(5)) {
                String[] strArr2 = A06;
                strArr2[7] = "en1LL2zHQFU7eKPWWtw7tqDicZnmZ9l5";
                strArr2[5] = "t66o2OzEfyctLQHjRBlZ897u0IFgDWGZ";
                if (A02(j3, interfaceC2054nEArr)) {
                    j2 = AJ9;
                    this.A02 = j2;
                    AbstractC04543y.A08(AJ9 != j || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
                    i = 0;
                    while (true) {
                        int length = dtArr.length;
                        if (A06[1].length() == 30) {
                            String[] strArr3 = A06;
                            strArr3[7] = "DNi9UWzwfCWyYPkB4uGGg0YkPCShAQe6";
                            strArr3[5] = "fAixbEz1F3G47KA6JLUGcT01MO1ZofiJ";
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                                C2095nt[] c2095ntArr = this.A04;
                                String[] strArr4 = A06;
                                if (strArr4[4].charAt(5) != strArr4[3].charAt(5)) {
                                    break;
                                }
                                A06[6] = "ocXNdzhjsFv";
                                c2095ntArr[i] = null;
                            } else {
                                DT[] childStreams2 = this.A04;
                                if (childStreams2[i] != null) {
                                    DT dt2 = this.A04[i].A01;
                                    DT dt3 = dtArr2[i];
                                    if (A06[1].length() != 30) {
                                        String[] strArr5 = A06;
                                        strArr5[4] = "cYzDBwspbZ8a8DM9Dz10VjvDatAoG4Oi";
                                        strArr5[3] = "WIkG6wjldaaFwlHYCP34A8xHiCA5NCte";
                                        if (dt2 == dt3) {
                                        }
                                    } else if (dt2 == dt3) {
                                    }
                                }
                                this.A04[i] = new C2095nt(this, dtArr2[i]);
                            }
                            DT[] childStreams3 = this.A04;
                            dtArr[i] = childStreams3[i];
                            i++;
                        } else {
                            if (i >= length) {
                                break;
                            }
                            if (dtArr2[i] != null) {
                            }
                            DT[] childStreams32 = this.A04;
                            dtArr[i] = childStreams32[i];
                            i++;
                        }
                    }
                    return AJ9;
                }
            }
            throw new RuntimeException();
        }
        j2 = C10323vs.b;
        this.A02 = j2;
        AbstractC04543y.A08(AJ9 != j || (AJ9 >= this.A01 && (this.A00 == Long.MIN_VALUE || AJ9 <= this.A00)));
        i = 0;
        while (true) {
            int length2 = dtArr.length;
            if (A06[1].length() == 30) {
            }
            DT[] childStreams322 = this.A04;
            dtArr[i] = childStreams322[i];
            i++;
        }
        return AJ9;
    }

    @Override // com.facebook.ads.redexgen.X.DX
    @MetaExoPlayerCustomization("Added in D19875605 for error load during pause")
    public final void AJc(boolean z) {
        this.A05.AJc(z);
    }

    @Override // com.facebook.ads.redexgen.X.DX
    @MetaExoPlayerCustomization("Added in D13267633 for lower priority during pause")
    public final void AKb(byte b) {
        this.A05.AKb(b);
    }
}
