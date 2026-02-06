package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1280aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1284aP A00(AbstractC1847jd abstractC1847jd) {
        if (abstractC1847jd.A2U()) {
            EnumC1284aP enumC1284aP = EnumC1284aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1284aP;
        }
        return EnumC1284aP.A03;
    }

    public static void A01(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        c1673gi.A0F().AAz(enumC1281aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        c1673gi.A0F().AB9(enumC1281aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        c1673gi.A0F().AC7(enumC1281aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        A01(c1673gi, enumC1281aM);
    }

    public static void A05(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        A02(c1673gi, enumC1281aM);
    }

    public static void A06(C1673gi c1673gi, EnumC1281aM enumC1281aM) {
        A03(c1673gi, enumC1281aM);
    }

    public static void A07(VI vi, C1673gi c1673gi, InterfaceC1214Yh interfaceC1214Yh, AbstractC1847jd abstractC1847jd, EnumC1281aM enumC1281aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC1847jd.A2Q()) {
            c1673gi.A0F().AB8(enumC1281aM.name().toLowerCase(Locale.US));
        }
        if (abstractC1847jd.A2U()) {
            c1673gi.A0F().AAy(enumC1281aM.name().toLowerCase(Locale.US));
        }
        C0963Og A002 = AbstractC0964Oh.A00(c1673gi.A02());
        C1669ge A02 = c1673gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC1214Yh != null) {
                interfaceC1214Yh.AAo(abstractC1847jd.A2E(), abstractC1847jd.A2C());
            }
        } else if (TextUtils.isEmpty(abstractC1847jd.A2C().A00())) {
        } else {
            X6.A0O(new X6(), c1673gi, XB.A00(abstractC1847jd.A2C().A00()), abstractC1847jd.A2E());
        }
    }
}
