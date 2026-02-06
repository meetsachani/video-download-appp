package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1717hQ extends WP {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C1713hM A00;
    public final /* synthetic */ C1145Vm A01;

    public C1717hQ(C1713hM c1713hM, C1145Vm c1145Vm) {
        this.A00 = c1713hM;
        this.A01 = c1145Vm;
    }

    @Override // com.facebook.ads.redexgen.X.WP
    public final void A01() {
        C1034Rd c1034Rd;
        C1034Rd c1034Rd2;
        C1034Rd c1034Rd3;
        c1034Rd = this.A00.A01;
        if (c1034Rd.A06() != null) {
            c1034Rd2 = this.A00.A01;
            AdListener A06 = c1034Rd2.A06();
            c1034Rd3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c1034Rd3.A07(), XE.A00(this.A01));
        }
    }
}
