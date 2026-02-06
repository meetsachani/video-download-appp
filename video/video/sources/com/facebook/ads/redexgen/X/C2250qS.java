package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import o.C10323vs;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.qS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2250qS implements AnonymousClass24 {
    public static byte[] A06;
    public static String[] A07 = {"HSHJbKu4LLVwlp8kAtKM", "V6sGPCPiRhBLh6", "pDYVgvWCLxIG9LT", "RWHl9GQtcXYH3V7mNtlpSVait36OCwJs", "0F7", "tg3oN59jNUBk8XSE4kwfd", "NBkHOFenkRKh7SKHrVJVIcIm0kDLsOxD", "OSER18TpRPMUQAQSprsMKIJx0xqzVeT1"};
    public static final C2250qS A08;
    public static final AnonymousClass23<C2250qS> A09;
    public static final C2251qT A0A;
    public static final String A0B;
    public static final String A0C;
    public static final String A0D;
    public static final String A0E;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;
    @MetaExoPlayerCustomization("Change back to private after AdsMediaSource fully upgraded")
    public final C2251qT[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C2250qS A00(Bundle bundle) {
        C2251qT[] c2251qTArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A0B);
        if (parcelableArrayList == null) {
            c2251qTArr = new C2251qT[0];
        } else {
            c2251qTArr = new C2251qT[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                c2251qTArr[i] = C2251qT.A09.A6f((Bundle) parcelableArrayList.get(i));
            }
        }
        return new C2250qS(null, c2251qTArr, bundle.getLong(A0C, A08.A02), bundle.getLong(A0D, A08.A03), bundle.getInt(A0E, A08.A01));
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A07;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "7EQT2aPGHNOftenQ9VAvD";
            strArr2[1] = "79Hg5O6oUNL8gh";
            copyOfRange[i4] = (byte) (i5 ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{70, 74, ED2.a, 51, 114, 119, 84, 97, 124, 102, 99, 96, C3307Iz.f0, 72, 116, QC1.w, 57, 60, 10, C4715Xk.i, C3307Iz.c0, C3307Iz.e0, 53, C4715Xk.i, 8, 55, C3307Iz.c0, 49, C3307Iz.d0, 49, 55, 54, 13, C3307Iz.c0, 101, 47, 35, 98, 103, 112, 62, 88, 13, 1, 69, 84, 83, 64, 85, 72, 78, 79, 116, 82, 28, 1, 36, C8077mf.r, C3307Iz.d0, C3307Iz.V, 57, 34, C3307Iz.V, 35, C3307Iz.c0, 19, 52, C3307Iz.V, 52, C3307Iz.X, 104, C3307Iz.V, 36, 51, 9, 36, 125, 80, 36, C8077mf.G, C8077mf.B, 84, C8077mf.q, 8, C8077mf.G, 8, C8077mf.C, 65, 91, 94, 125, 72, 85, 79, 74, C8077mf.u, 78, 83, 87, 95, 111, 73, 7};
    }

    static {
        A03();
        A08 = new C2250qS(null, new C2251qT[0], 0L, C10323vs.b, 0);
        A0A = new C2251qT(0L).A06(0);
        A0B = C5C.A0h(1);
        A0C = C5C.A0h(2);
        A0D = C5C.A0h(3);
        A0E = C5C.A0h(4);
        A09 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qV
            @Override // com.facebook.ads.redexgen.X.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                C2250qS A00;
                A00 = C2250qS.A00(bundle);
                return A00;
            }
        };
    }

    public C2250qS(Object obj, C2251qT[] c2251qTArr, long j, long j2, int i) {
        this.A04 = obj;
        this.A02 = j;
        this.A03 = j2;
        this.A00 = c2251qTArr.length + i;
        this.A05 = c2251qTArr;
        this.A01 = i;
    }

    private boolean A04(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = A07(i).A03;
        if (j3 != Long.MIN_VALUE) {
            return j < j3;
        } else if (A07[3].charAt(17) != 't') {
            throw new RuntimeException();
        } else {
            String[] strArr = A07;
            strArr[5] = "6w59Aw8BMojzvOgPymJyT";
            strArr[1] = "Ceso9EO8QL9NfZ";
            return j2 == C10323vs.b || j < j2;
        }
    }

    public final int A05(long j, long j2) {
        if (j == Long.MIN_VALUE || (j2 != C10323vs.b && j >= j2)) {
            return -1;
        }
        int index = this.A01;
        while (index < this.A00 && ((A07(index).A03 != Long.MIN_VALUE && A07(index).A03 <= j) || !A07(index).A08())) {
            index++;
        }
        if (index < this.A00) {
            return index;
        }
        return -1;
    }

    public final int A06(long j, long j2) {
        int i = this.A00 - 1;
        while (i >= 0 && A04(j, j2, i)) {
            i--;
        }
        if (i < 0 || !A07(i).A07()) {
            return -1;
        }
        return i;
    }

    public final C2251qT A07(int i) {
        if (i < this.A01) {
            return A0A;
        }
        return this.A05[i - this.A01];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2250qS c2250qS = (C2250qS) obj;
        if (C5C.A1E(this.A04, c2250qS.A04) && this.A00 == c2250qS.A00 && this.A02 == c2250qS.A02 && this.A03 == c2250qS.A03 && this.A01 == c2250qS.A01) {
            C2251qT[] c2251qTArr = this.A05;
            String[] strArr = A07;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[5] = "16faulxPxX0sTjyZsuY2d";
            strArr2[1] = "99yT7gYz4zzQy1";
            if (Arrays.equals(c2251qTArr, c2250qS.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A04 == null ? 0 : this.A04.hashCode();
        int result3 = (int) this.A03;
        int result4 = (((((i + result2) * 31) + ((int) this.A02)) * 31) + result3) * 31;
        int result5 = Arrays.hashCode(this.A05);
        return ((result4 + this.A01) * 31) + result5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(55, 22, 92));
        sb.append(this.A04);
        sb.append(A02(14, 21, 68));
        sb.append(this.A02);
        sb.append(A02(2, 12, 15));
        int i = 0;
        while (true) {
            C2251qT[] c2251qTArr = this.A05;
            String[] strArr = A07;
            String str = strArr[0];
            String str2 = strArr[2];
            int i2 = str.length();
            if (i2 == str2.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[0] = "HwwbQlKsFzrVvgzZA70k";
            strArr2[2] = "CWSfdfe0R8gD4PU";
            int length = c2251qTArr.length;
            String A02 = A02(77, 2, 17);
            if (i < length) {
                sb.append(A02(88, 15, 38));
                sb.append(this.A05[i].A03);
                sb.append(A02(35, 7, 31));
                int i3 = 0;
                while (true) {
                    int length2 = this.A05[i].A05.length;
                    String A022 = A02(0, 2, 118);
                    if (i3 < length2) {
                        sb.append(A02(79, 9, 96));
                        int i4 = this.A05[i].A05[i3];
                        switch (i4) {
                            case 0:
                                sb.append('_');
                                break;
                            case 1:
                                sb.append('R');
                                break;
                            case 2:
                                sb.append('S');
                                break;
                            case 3:
                                sb.append('P');
                                break;
                            case 4:
                                sb.append('!');
                                break;
                            default:
                                sb.append('?');
                                break;
                        }
                        sb.append(A02(42, 13, 61));
                        sb.append(this.A05[i].A06[i3]);
                        sb.append(')');
                        int i5 = this.A05[i].A05.length;
                        if (i3 < i5 - 1) {
                            sb.append(A022);
                        }
                        i3++;
                    } else {
                        sb.append(A02);
                        String[] strArr3 = A07;
                        String str3 = strArr3[5];
                        String str4 = strArr3[1];
                        int i6 = str3.length();
                        if (i6 == str4.length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A07;
                        strArr4[0] = "tpRIwkkikLxaZqXNkXQj";
                        strArr4[2] = "ureQIhKfJpTfNVp";
                        if (i < this.A05.length - 1) {
                            sb.append(A022);
                        }
                        i++;
                    }
                }
            } else {
                sb.append(A02);
                return sb.toString();
            }
        }
    }
}
