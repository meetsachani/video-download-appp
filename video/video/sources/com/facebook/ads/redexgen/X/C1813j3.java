package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.j3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1813j3 implements N9 {
    public static byte[] A02;
    public static String[] A03 = {"ebJtInVgM8lwtLsL8CqjQvfHZTFWXyTj", "MRT4Iz3aNiJEaKRUIrDApfghDq01n6sB", "qhIcWii6jOsLbVLe4G", "jd0Ec4CahT7YYBjB568owPC0gY4s3zOU", "RPiMcfQYBdHC0SSG6XvNc0NsjlYurq5U", "E74vSWGMqEH8Jt4WlgBEkdQ8nTEO7fKB", "DEVdv4rr1ByH9p4ezSF9ryFdFyWOGnGy", "23RYwIDt1nJrIBpc57"};
    public final /* synthetic */ C05447k A00;
    public final /* synthetic */ Runnable A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{89, 10, C8077mf.p, 83, 89, 91, 92, 92, 32, 3, C8077mf.n, C8077mf.n, 7, C8077mf.r, 66, C8077mf.m, C8077mf.q, C8077mf.u, C8077mf.r, 7, 17, 17, C8077mf.m, 13, C8077mf.n, 66, 4, C8077mf.m, C8077mf.r, 7, 6, 28, C8077mf.G, 49, C8077mf.u, C8077mf.G, C8077mf.G, C8077mf.z, 1, ED2.a, 28, C8077mf.x, C8077mf.x, C8077mf.D, C8077mf.G, C8077mf.x, 58, C8077mf.H, 3, 1, C8077mf.z, 0, 0, C8077mf.D, 28, C8077mf.G};
    }

    static {
        A01();
    }

    public C1813j3(C05447k c05447k, Runnable runnable) {
        this.A00 = c05447k;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ADC(InterfaceC1878k8 interfaceC1878k8) {
        AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4a();
        this.A00.A07.A0C();
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ADD(InterfaceC1878k8 interfaceC1878k8, View view) {
        AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4Z(interfaceC1878k8 == ((AbstractC1810j0) this.A00).A00);
        if (interfaceC1878k8 != ((AbstractC1810j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        N1 n1 = ((AbstractC1810j0) this.A00).A01;
        C05447k c05447k = this.A00;
        String[] strArr = A03;
        if (strArr[6].charAt(14) != strArr[5].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[0] = "gfJNIdbF2FrCa8qL8kuytpSS0QUlrsrj";
        strArr2[1] = "KzSpIsxhAVssntgB7OlLodebxm4ynnXJ";
        ((AbstractC1810j0) c05447k).A01 = interfaceC1878k8;
        this.A00.A01 = view;
        if (!this.A00.A0C) {
            this.A00.A07.A0F(interfaceC1878k8);
            return;
        }
        this.A00.A07.A0E(view);
        this.A00.A0Q(n1);
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void ADE(InterfaceC1878k8 interfaceC1878k8) {
        AnonymousClass76 anonymousClass76;
        AbstractC1156Vy.A05(A00(31, 25, 61), A00(8, 23, 44), A00(0, 8, 37));
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4c();
        this.A00.A07.A0D();
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.N9
    public final void AEN(InterfaceC1878k8 interfaceC1878k8, C1145Vm c1145Vm) {
        AnonymousClass76 anonymousClass76;
        anonymousClass76 = this.A00.A02;
        anonymousClass76.A0F().A4b(interfaceC1878k8 == ((AbstractC1810j0) this.A00).A00, c1145Vm.A03().getErrorCode());
        if (interfaceC1878k8 != ((AbstractC1810j0) this.A00).A00) {
            return;
        }
        this.A00.A0H().removeCallbacks(this.A01);
        this.A00.A0Q(interfaceC1878k8);
        this.A00.ADp(c1145Vm);
    }
}
