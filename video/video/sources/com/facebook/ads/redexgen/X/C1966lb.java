package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1966lb implements InterfaceC0837Jj {
    public static String[] A01 = {"5dk9XJP2wGzKf", "t9Sqq8YLjeTrFPP9jF9lF", "ZSSLQReFK2RnB4Tl20", "6LiPtiUXCvNXZPkDmbiLO", "ML1syn76y5DaiFADQPhnbgz9k8Qidn9e", "l6QdmjZcy6MGH", "", "GeXYkzAGCbUHzEIcx9bq6WN7r3"};
    public static final C1966lb A02 = new C1966lb();
    public final List<C2192pT> A00;

    public C1966lb() {
        this.A00 = Collections.emptyList();
    }

    public C1966lb(C2192pT c2192pT) {
        this.A00 = Collections.singletonList(c2192pT);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final List<C2192pT> A7X(long j) {
        return j >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final long A83(int i) {
        AbstractC04543y.A07(i == 0);
        if (A01[5].length() != 13) {
            throw new RuntimeException();
        }
        A01[7] = "BSEyCnkUJKVAglTMpAGc69o360";
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Jj
    public final int A8a(long j) {
        return j < 0 ? 0 : -1;
    }
}
