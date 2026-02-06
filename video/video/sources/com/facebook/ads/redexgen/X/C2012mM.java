package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import o.C2638Cg0;
import o.QC1;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.mM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2012mM implements InterfaceC0814Il {
    public static byte[] A07;
    public static String[] A08 = {"eVwUBMvHO9uBMhknAGNfZP2yr814WJyE", "k5ILRUABeDXqCwWpN", "hJjZHs3Q8zIp76bYyURn3XwI", "BeESTKEHKjvJbhVudlSNXwxkHuAjvLDZ", "rbeMFWTNNauR3FTC2xnHN2ozIe2oUtV0", "bbPaxRhv7ZvGWrZH", "Yl9CHZRrzKaSrdtxcFsBA9EFbwcoGK5g", "dqSnihCeyqEvBM16"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0813Ik A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C0811Ii> A05 = new ArrayDeque<>();
    public final C0819Iq A04 = new C0819Iq();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{98, -121, -113, 122, -123, -126, 125, 57, 126, -123, 126, -122, 126, -121, -115, 57, -115, -110, -119, 126, 57, 91, Byte.MIN_VALUE, -120, 115, 126, 123, 118, 50, QC1.w, 126, -127, 115, -122, 50, -123, 123, -116, 119, 76, 50, -78, -41, -33, C2638Cg0.w7, -43, -46, C2638Cg0.y7, -119, -46, -41, -35, C2638Cg0.z7, -48, C2638Cg0.z7, -37, -119, -36, -46, -29, C2638Cg0.z7, -93, -119, C2638Cg0.r7, -28, -30, C2638Cg0.E7, -34, -41, -112, -43, -36, -43, -35, -43, -34, -28, -112, -29, C2638Cg0.E7, -22, -43, -86, -112};
        if (A08[6].charAt(2) != '9') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[0] = "OJtOaz7eyeuGy8JHYC7MsYj9KI0teM8x";
        strArr[4] = "Pthq8qREsbuOKTWUYG3bxj4Nb5ptFAt8";
    }

    static {
        A05();
    }

    private double A00(InterfaceC2033ms interfaceC2033ms, int i) throws IOException {
        long A02 = A02(interfaceC2033ms, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    @RequiresNonNull({"processor"})
    private long A01(InterfaceC2033ms interfaceC2033ms) throws IOException {
        interfaceC2033ms.AIl();
        while (true) {
            interfaceC2033ms.AGt(this.A06, 0, 4);
            int A00 = C0819Iq.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C0819Iq.A01(this.A06, A00, false);
                if (this.A03.AAW(A01)) {
                    interfaceC2033ms.AK3(A00);
                    return A01;
                }
            }
            interfaceC2033ms.AK3(1);
        }
    }

    private long A02(InterfaceC2033ms interfaceC2033ms, int i) throws IOException {
        interfaceC2033ms.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long value = this.A06[i2] & 255;
            j = (j << 8) | value;
        }
        return j;
    }

    public static String A04(InterfaceC2033ms interfaceC2033ms, int i) throws IOException {
        if (i == 0) {
            return A03(0, 0, 32);
        }
        byte[] bArr = new byte[i];
        interfaceC2033ms.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0814Il
    public final void AAD(InterfaceC0813Ik interfaceC0813Ik) {
        this.A03 = interfaceC0813Ik;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x011d, code lost:
        if (r5 <= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011f, code lost:
        r12.A03.AKK(r12.A00, A04(r13, (int) r12.A02));
        r12.A01 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
        if (r5 <= 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015b, code lost:
        throw com.facebook.ads.redexgen.X.C3K.A01(A03(63, 21, 97) + r12.A02, null);
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0814Il
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AHO(InterfaceC2033ms interfaceC2033ms) throws IOException {
        long j;
        int i;
        AbstractC04543y.A02(this.A03);
        while (true) {
            C0811Ii head = this.A05.peek();
            if (head != null) {
                long A8n = interfaceC2033ms.A8n();
                j = head.A01;
                if (A8n >= j) {
                    InterfaceC0813Ik interfaceC0813Ik = this.A03;
                    i = this.A05.pop().A00;
                    interfaceC0813Ik.A6N(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(interfaceC2033ms, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(interfaceC2033ms);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC2033ms, false, true, 8);
                this.A01 = 2;
            }
            int A7u = this.A03.A7u(this.A00);
            switch (A7u) {
                case 0:
                    interfaceC2033ms.AK3((int) this.A02);
                    this.A01 = 0;
                case 1:
                    long A8n2 = interfaceC2033ms.A8n();
                    this.A05.push(new C0811Ii(this.A00, A8n2 + this.A02));
                    InterfaceC0813Ik interfaceC0813Ik2 = this.A03;
                    int i2 = this.A00;
                    long elementContentPosition = this.A02;
                    interfaceC0813Ik2.AK9(i2, A8n2, elementContentPosition);
                    this.A01 = 0;
                    return true;
                case 2:
                    if (this.A02 <= 8) {
                        this.A03.AAH(this.A00, A02(interfaceC2033ms, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw C3K.A01(A03(41, 22, 90) + this.A02, null);
                case 3:
                    int i3 = (this.A02 > 2147483647L ? 1 : (this.A02 == 2147483647L ? 0 : -1));
                    if (A08[3].charAt(30) == 'v') {
                        A08[3] = "KnGHYIorNoG22Tvn2zIFMGSlF3FZ2Zej";
                        break;
                    } else {
                        A08[2] = "fCyqjQ49ueazrn4tXgyzoG1n";
                        break;
                    }
                case 4:
                    this.A03.A4i(this.A00, (int) this.A02, interfaceC2033ms);
                    this.A01 = 0;
                    return true;
                case 5:
                    int i4 = (this.A02 > 4L ? 1 : (this.A02 == 4L ? 0 : -1));
                    if (A08[6].charAt(2) != '9') {
                        throw new RuntimeException();
                    }
                    A08[2] = "D1RmFcc9PuCELhM1k2KVAJs3";
                    if (i4 == 0 || this.A02 == 8) {
                        this.A03.A6a(this.A00, A00(interfaceC2033ms, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw C3K.A01(A03(21, 20, 3) + this.A02, null);
                default:
                    throw C3K.A01(A03(0, 21, 10) + A7u, null);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0814Il
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
