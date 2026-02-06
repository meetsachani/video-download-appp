package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.oP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2126oP implements AnonymousClass93 {
    public static byte[] A01;
    public static String[] A02 = {"JE7C4PJjP7BCbZqkJpMMyURXZ5h", "iMYF6XNZz1LBnq9Lsd18aPb3vu2", "XxqNLC6c7RSVqgSJXO5oI", "nEpRStmmyFjBR5hyZRShRQxXaXf0Mj7x", "WMevU6o4a2paeBy7iKLxLT9X", "1yBfwy19", "IbfL1f4elDnhfhlOaFmHA7", "3K7V2NpliX3hv5M7KS"};
    public final /* synthetic */ C2123oM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {64, 76, 70, 103, 100, 99, 119, 110, 118, 67, 119, 102, 107, 109, 81, 107, 108, 105, C8077mf.B, 54, ED2.a, 62, 35, 56, ED2.a, 54, 113, 56, 60, C3307Iz.V, 62, 34, 34, 56, 51, C4715Xk.i, 40, 113, C4715Xk.i, 48, 35, 54, 52, 113, 48, 36, 53, 56, 62, 113, C4715Xk.i, 48, C3307Iz.X, 52, ED2.a, 50, 40, 107, 113, 98, 65, 68, 67, 88, 94, 68, 66, 17, 80, 68, 85, 88, 94, 17, 69, 88, 92, 84, 66, 69, 80, 92, 65, 17, C8077mf.C, 87, 67, 80, 92, 84, 17, 65, 94, 66, 88, 69, 88, 94, 95, 17, 92, 88, 66, 92, 80, 69, 82, 89, C8077mf.B, C8077mf.m, 17, 102, 69, 64, 71, 92, 90, 64, 70, C8077mf.y, 84, 64, 81, 92, 90, C8077mf.y, 65, 92, 88, 80, 70, 65, 84, 88, 69, C8077mf.y, C8077mf.G, 70, 76, 70, 65, 80, 88, C8077mf.y, 86, 89, 90, 86, 94, C8077mf.y, 88, 92, 70, 88, 84, 65, 86, 93, 28, C8077mf.q, C8077mf.y};
        if (A02[4].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "crOuuTwIIsvqp0CyO4zKH";
        strArr[6] = "QvBSziwTMADuiMqU3qgYIx";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C2126oP(C2123oM c2123oM) {
        this.A00 = c2123oM;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final void AEM(long j) {
        AbstractC04624g.A07(A00(2, 16, 116), A00(18, 41, 39) + j);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final void AFN(long j) {
        InterfaceC05788v interfaceC05788v;
        InterfaceC05788v interfaceC05788v2;
        interfaceC05788v = this.A00.A0I;
        if (interfaceC05788v != null) {
            C2123oM c2123oM = this.A00;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "XUD65QsQyQCwJDnhFrO8y";
            strArr2[6] = "L1DcP3KlVDNfGhVI0cZDzs";
            interfaceC05788v2 = c2123oM.A0I;
            interfaceC05788v2.AFN(j);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final void AFP(long j, long j2, long j3, long j4) {
        long A06;
        long A07;
        StringBuilder append = new StringBuilder().append(A00(59, 52, 71)).append(j);
        String A00 = A00(0, 2, 26);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A06 = this.A00.A06();
        StringBuilder append3 = append2.append(A06).append(A00);
        A07 = this.A00.A07();
        String sb = append3.append(A07).toString();
        if (!C2123oM.A0v) {
            String message = A00(2, 16, 116);
            AbstractC04624g.A07(message, sb);
            return;
        }
        throw new C9I(sb);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final void AG9(long j, long j2, long j3, long j4) {
        long A06;
        long A07;
        StringBuilder append = new StringBuilder().append(A00(111, 50, 67)).append(j);
        String A00 = A00(0, 2, 26);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A06 = this.A00.A06();
        StringBuilder append3 = append2.append(A06).append(A00);
        A07 = this.A00.A07();
        String sb = append3.append(A07).toString();
        if (!C2123oM.A0v) {
            String message = A00(2, 16, 116);
            AbstractC04624g.A07(message, sb);
            return;
        }
        throw new C9I(sb);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass93
    public final void AGI(int i, long j) {
        InterfaceC05788v interfaceC05788v;
        long j2;
        InterfaceC05788v interfaceC05788v2;
        interfaceC05788v = this.A00.A0I;
        if (interfaceC05788v != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.A00.A07;
            long j3 = elapsedRealtime - j2;
            interfaceC05788v2 = this.A00.A0I;
            interfaceC05788v2.AGJ(i, j, j3);
        }
    }
}
