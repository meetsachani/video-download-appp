package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.dD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1458dD {
    public static String[] A00 = {"M7M7680JiQXMJzeuHBUdBK3CqcsunIE3", "7YJQc0MEUr6fNb1HoLhvfznehf2fNPi1", "fqXve0BGHc", "EJDyhBK8ScH8NN0H4G45MCvGKFSIU6i3", "lE5hsHUrpnTpaSUAUiDOdKdDJm2EXpBt", "fXhWa5fzMs", "jGMjXmbPjJmsUXbAj46daPhZmilD9JtA", "gy7nSuWAyo"};
    public static final Map<String, WeakReference<C1457dC>> A01 = new HashMap();

    public static int A00() {
        Map<String, WeakReference<C1457dC>> map = A01;
        if (A00[4].charAt(3) != 'h') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "KcOG1rzwVGm5OqslsWQoAqhkYEC7FRij";
        strArr[1] = "Dhj4Lprngz6YVn4AutwbBiUWJOZdaDii";
        return map.size();
    }

    public static C1457dC A01(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, int i, InterfaceC1455dA interfaceC1455dA) {
        C1457dC c1457dC = new C1457dC(c1673gi, abstractC1847jd, c1673gi.A02().A0A(), i);
        c1457dC.A0b(interfaceC1455dA);
        c1457dC.A0X();
        A01.put(abstractC1847jd.A1D(), new WeakReference<>(c1457dC));
        return c1457dC;
    }

    public static C1457dC A02(String str) {
        WeakReference<C1457dC> weakReference = A01.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC1847jd abstractC1847jd, C1457dC c1457dC) {
        A01.put(abstractC1847jd.A1D(), new WeakReference<>(c1457dC));
    }

    public static void A04(String str) {
        A01.remove(str);
    }
}
