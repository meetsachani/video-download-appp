package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ex  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0723Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C2197pY A01;
    public final Object A02;
    public final C05527s[] A03;
    public final InterfaceC2054nE[] A04;

    public C0723Ex(C05527s[] c05527sArr, InterfaceC2054nE[] interfaceC2054nEArr, C2197pY c2197pY, Object obj) {
        this.A03 = c05527sArr;
        this.A04 = (InterfaceC2054nE[]) interfaceC2054nEArr.clone();
        this.A01 = c2197pY;
        this.A02 = obj;
        this.A00 = c05527sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C0723Ex c0723Ex, int i) {
        if (c0723Ex == null) {
            return false;
        }
        C05527s[] c05527sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!C5C.A1E(c05527sArr[i], c0723Ex.A03[i])) {
                return false;
            }
            InterfaceC2054nE interfaceC2054nE = this.A04[i];
            InterfaceC2054nE interfaceC2054nE2 = c0723Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return C5C.A1E(interfaceC2054nE, interfaceC2054nE2);
            }
        }
        throw new RuntimeException();
    }
}
