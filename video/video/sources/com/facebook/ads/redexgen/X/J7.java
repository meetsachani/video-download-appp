package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.DrmInitData;

/* loaded from: assets/audience_network/classes2.dex */
public final class J7 {
    public static String[] A0A = {"EJzHBf6C0sknf46Vq1Osr72lZWU", "EzVPMe4nRAbvxSng0PXVwtyqLeoR1KIv", "OkBxNGbCc3SGP6NNAhHfxcRtiUQBpmsu", "1fihPQnAv3tt3xF1xxV2XjfJNe5jiXUE", "EaQIZLU4UTAcxpaH6Zb3hTUPzu", "nXVDjS3P8WK4na35on8K5ox1mEuGJ9Tn", "34qesDVsFPLU35m5e8V9GlfuLx1oAXXP", "IwUkif7926Fg"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public J1 A04;
    public JO A05;
    public final InterfaceC0780Hd A06;
    public final JQ A07 = new JQ();
    public final C04774v A09 = new C04774v(1);
    public final C04774v A08 = new C04774v();

    public J7(InterfaceC0780Hd interfaceC0780Hd) {
        this.A06 = interfaceC0780Hd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JP A00() {
        JP encryptionBox;
        int i = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        JP A00 = A00();
        if (A00 == null) {
            return;
        }
        C04774v c04774v = this.A07.A0H;
        if (A00.A00 != 0) {
            c04774v.A0g(A00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c04774v.A0g(c04774v.A0M() * 6);
        }
    }

    public final int A04() {
        C04774v c04774v;
        int vectorSize;
        JP A00 = A00();
        if (A00 == null) {
            return 0;
        }
        if (A00.A00 != 0) {
            c04774v = this.A07.A0H;
            vectorSize = A00.A00;
        } else {
            byte[] initVectorData = A00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c04774v = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean A06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((A06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC0780Hd interfaceC0780Hd = this.A06;
        C04774v initializationVectorData = this.A09;
        interfaceC0780Hd.AIr(initializationVectorData, 1);
        this.A06.AIr(c04774v, vectorSize);
        if (!A06) {
            int vectorSize2 = vectorSize + 1;
            if (A0A[2].charAt(9) != '1') {
                A0A[3] = "cKav7mEAu9tQ2Y9RA5SJHOCCBpQ48rqR";
                return vectorSize2;
            }
            throw new RuntimeException();
        }
        C04774v c04774v2 = this.A07.A0H;
        int A0M = c04774v2.A0M();
        c04774v2.A0g(-2);
        int i = (A0M * 6) + 2;
        this.A06.AIr(c04774v2, i);
        return vectorSize + 1 + i;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0006 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A06(long j) {
        for (int i = this.A01; i < searchIndex; i++) {
            int searchIndex = (this.A07.A00(i) > j ? 1 : (this.A07.A00(i) == j ? 0 : -1));
            if (searchIndex < 0) {
                if (this.A07.A0G[i]) {
                    this.A03 = i;
                }
            } else {
                return;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        JP encryptionBox = this.A05.A00(this.A07.A06.A02);
        this.A06.A6e(this.A05.A07.A09(drmInitData.A01(encryptionBox != null ? encryptionBox.A02 : null)));
    }

    public final void A08(JO jo, J1 j1) {
        this.A05 = (JO) AbstractC04543y.A01(jo);
        this.A04 = (J1) AbstractC04543y.A01(j1);
        this.A06.A6e(jo.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 == this.A07.A0C[this.A02]) {
            this.A02++;
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
