package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public class TZ extends AbstractRunnableC1160Wc {
    public static byte[] A02;
    public static String[] A03 = {"rr4pEtDer0K6hYSMypGI4SVA4", "qv2m0fG", "2OIR1Yv9Y7RzsB5MK8fjyIRTaeFBsJy", "02JyCSWW55zn1AQ6h7F4FoBumR9MK", "PV14KCf6Ep37wllo1HHxqudNmgtveNCD", "8xcTKK5W7UNHePnVaLckl2F", "lGpL0wggi73mqN0I3cVtORcNpouSV80j", "84RqxglWV7M6OmuSAB1gnMVf4"};
    public final /* synthetic */ WA A00;
    public final /* synthetic */ WD A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{121, 115, 97, 124, Byte.MAX_VALUE, 112, 112, 123, 108, 97, 117, 123, 103, C8077mf.u, 51, 124, 50, 57, 40, C3307Iz.c0, 51, C3307Iz.f0, 55, 124, ED2.a, 51, 50, 50, 57, ED2.a, 40, 53, 51, 50};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1673gi c1673gi;
        C1673gi c1673gi2;
        C1673gi c1673gi3;
        C1673gi c1673gi4;
        C1673gi c1673gi5;
        long j;
        C1673gi c1673gi6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC1625fw A032;
        C1673gi c1673gi7;
        C1673gi c1673gi8;
        C1673gi c1673gi9;
        C1673gi c1673gi10;
        long j2;
        this.A01.A00 = System.currentTimeMillis();
        c1673gi = this.A01.A05;
        if (AbstractC1206Xz.A00(c1673gi) == EnumC1205Xy.A07) {
            this.A01.A0A();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 62);
            c1673gi10 = this.A01.A05;
            InterfaceC0899Lt A0F = c1673gi10.A0F();
            j2 = this.A01.A01;
            A0F.A3W(Y1.A01(j2), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0E(new C1145Vm(adErrorType, A00));
            return;
        }
        c1673gi2 = this.A01.A05;
        C1095Tn.A08(c1673gi2);
        c1673gi3 = this.A01.A05;
        SZ.A07(c1673gi3);
        UG A002 = UG.A00();
        c1673gi4 = this.A01.A05;
        boolean z = true;
        Map<String, String> A0A = this.A00.A0A(A002.A01(c1673gi4, true).A7y(this.A00.A05()));
        this.A01.A03 = A0A;
        try {
            c1673gi7 = this.A01.A05;
            PackageManager packageManager = c1673gi7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 92);
                StringBuilder sb = new StringBuilder();
                c1673gi8 = this.A01.A05;
                StringBuilder append = sb.append(c1673gi8.getPackageName()).append(A00(0, 1, 59));
                c1673gi9 = this.A01.A05;
                A0A.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c1673gi9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A07() != EnumC1148Vq.A04 && this.A00.A07() != EnumC1148Vq.A06 && this.A00.A07() != EnumC1148Vq.A05 && this.A00.A07() != null) {
                z = false;
            }
            c1673gi6 = this.A01.A05;
            InterfaceC1624fv A022 = C1642gD.A02(z, c1673gi6);
            str = this.A01.A07;
            C1638g9 c1638g9 = new C1638g9();
            map = this.A01.A03;
            byte[] A08 = c1638g9.A05(map).A08();
            A032 = this.A01.A03(Y1.A00(), this.A00);
            A022.AGy(str, A08, A032);
        } catch (Exception e) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            c1673gi5 = this.A01.A05;
            InterfaceC0899Lt A0F2 = c1673gi5.A0F();
            j = this.A01.A01;
            A0F2.A3W(Y1.A01(j), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            WD wd = this.A01;
            C1145Vm A01 = C1145Vm.A01(adErrorType2, message);
            if (A03[3].length() != 29) {
                throw new RuntimeException();
            }
            A03[3] = "TysUXKeFt8WChM0CalDFmuBH7ELd8";
            wd.A0E(A01);
        }
    }

    static {
        A01();
    }

    public TZ(WD wd, WA wa) {
        this.A01 = wd;
        this.A00 = wa;
    }
}
