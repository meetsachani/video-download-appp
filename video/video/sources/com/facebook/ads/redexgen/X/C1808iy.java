package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.iy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1808iy implements NC {
    public static byte[] A02;
    public final /* synthetic */ C05437j A00;
    public final /* synthetic */ Runnable A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{66, 70, 66, C8077mf.y, C8077mf.y, 68, 19, 17, 77, 104, 109, 124, QC1.w, 105, 126, C3307Iz.d0, 101, Byte.MAX_VALUE, C3307Iz.d0, 98, 121, 96, 96, C3307Iz.d0, 99, 98, C3307Iz.d0, 96, 99, 109, 104, 69, 98, QC1.w, 105, 126, Byte.MAX_VALUE, QC1.w, 101, QC1.w, 101, 109, 96, 77, 104, 59, 28, 6, C8077mf.A, 0, 1, 6, C8077mf.E, 6, C8077mf.E, 19, C8077mf.H, 82, C8077mf.E, 31, 2, 0, C8077mf.A, 1, 1, C8077mf.E, C8077mf.G, 28, 82, C8077mf.x, C8077mf.E, 0, C8077mf.A, C8077mf.z, ED2.a, 48, 1, ED2.a, C4715Xk.i, 42, 55, 40, 55, 42, C3307Iz.Z, 101, 106, 96, 118, 107, 109, 96, 42, 109, 106, 112, 97, 106, 112, 42, 101, 103, 112, 109, 107, 106, 42, 82, 77, 65, 83, 34, 51, 42, 109, 108, 75, 108, 118, 103, 112, 113, 118, 107, 118, 107, 99, 110, 78, 109, 101, 101, 107, 108, 101, 75, 111, 114, 112, 103, 113, 113, 107, 109, 108};
    }

    public C1808iy(C05437j c05437j, Runnable runnable) {
        this.A00 = c05437j;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEC(C1869jz c1869jz, String str, boolean z) {
        this.A00.A07.A0C();
        boolean clickUrlDefined = !TextUtils.isEmpty(str);
        if (z && clickUrlDefined) {
            try {
                Intent intent = new Intent(A00(85, 26, 62));
                intent.setData(XB.A00(str));
                C1177Wu.A0D(this.A00.A0B, intent);
            } catch (C1175Ws e) {
                Throwable cause = e.getCause();
                Throwable th = e;
                if (cause != null) {
                    th = e.getCause();
                }
                this.A00.A0B.A08().ABC(A00(74, 11, 100), AbstractC1085Td.A04, new C1086Te(th));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AED(C1869jz c1869jz) {
        this.A00.A07.A04();
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEE(C1869jz c1869jz) {
        this.A00.A07.A05();
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEF(C1869jz c1869jz) {
        if (c1869jz != this.A00.A00) {
            return;
        }
        if (c1869jz == null) {
            this.A00.A0B.A08().ABC(A00(111, 3, 121), AbstractC1085Td.A0X, new C1086Te(A00(8, 37, 54)));
            AEG(c1869jz, AdError.internalError(2004));
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A01 = c1869jz;
        this.A00.A0L();
        this.A00.A07.A0F(c1869jz);
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEG(C1869jz c1869jz, AdError adError) {
        if (c1869jz != this.A00.A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(c1869jz);
        this.A00.A0B.A0F().A5g(adError.getErrorCode(), adError.getErrorMessage());
        this.A00.A07.A0G(new C1145Vm(adError.getErrorCode(), adError.getErrorMessage()));
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEH(C1869jz c1869jz) {
        AbstractC1156Vy.A05(A00(114, 31, 56), A00(45, 29, 72), A00(0, 8, 77));
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEI() {
        this.A00.A07.A08();
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEJ() {
        this.A00.A07.A06();
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void AEK() {
        this.A00.A07.A07();
    }

    @Override // com.facebook.ads.redexgen.X.NC
    public final void onInterstitialActivityDestroyed() {
        this.A00.A07.A02();
    }
}
