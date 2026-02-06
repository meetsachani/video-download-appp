package com.facebook.ads.redexgen.X;

import android.widget.TextView;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Dj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0683Dj extends TextView implements InterfaceC1561eu {
    public static byte[] A02;
    public static String[] A03 = {"KyDK4ozsSQOI8CeBEp6vN7GPAMaKi3Lj", "3K3dE7OkNcMTAukVEMEsyydi1KZJfoYe", "AKsSDy", "td2HYxymrySRBlk8LVzv2Nj", "9YKsZJjoWB8K3TGCGylWNfB", "C67xSy", "ZVZacBuH1Jrb8cRz3UZ99yjmQBL5sCV1", "zO36dBYDIleQnJstGNGNdS3bkLsuKmlY"};
    public static final int A04;
    public C0710Ek A00;
    public final UN<C4A> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[0].charAt(28) == strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[0] = "iGxWfyiSQAQNOwaGoqCiMbtpxtO5GMjZ";
            strArr2[1] = "gQ1pvXOTKlX7L3B8LOaiCsG8OhRO9Yk5";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 61);
            i4++;
        }
    }

    public static void A04() {
        A02 = new byte[]{C8077mf.q, C8077mf.D, C8077mf.B, 78, C8077mf.r, C8077mf.q, C8077mf.D, C8077mf.B, 78, C8077mf.u, C8077mf.u, C8077mf.B, C8077mf.u, C8077mf.u};
    }

    static {
        A04();
        A04 = (int) (XX.A02 * 6.0f);
    }

    public C0683Dj(C1673gi c1673gi) {
        super(c1673gi);
        this.A01 = new C0684Dk(this);
        YB.A0V(this, YB.A06(855638016, A04));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A02(long j) {
        if (j <= 0) {
            return A01(9, 5, 31);
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j);
        long minutes2 = TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        return String.format(Locale.US, A01(0, 9, 23), Long.valueOf(minutes), Long.valueOf(minutes2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AAv(C0710Ek c0710Ek) {
        this.A00 = c0710Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A05(this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1561eu
    public final void AKV(C0710Ek c0710Ek) {
        this.A00 = c0710Ek;
        if (this.A00 != null) {
            this.A00.getEventBus().A06(this.A01);
        }
    }
}
