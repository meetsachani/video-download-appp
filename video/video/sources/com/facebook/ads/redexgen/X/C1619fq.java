package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.fq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1619fq {
    public float A00;
    public EnumC0897Lr A01;
    public Map<String, String> A02;

    public C1619fq(EnumC0897Lr enumC0897Lr) {
        this(enumC0897Lr, 0.0f);
    }

    public C1619fq(EnumC0897Lr enumC0897Lr, float f) {
        this(enumC0897Lr, f, null);
    }

    public C1619fq(@Nullable EnumC0897Lr enumC0897Lr, float f, Map<String, String> windowParams) {
        this.A01 = enumC0897Lr;
        this.A00 = f;
        if (windowParams != null) {
            this.A02 = windowParams;
        } else {
            this.A02 = new HashMap();
        }
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A03();
    }

    public final EnumC0897Lr A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC0897Lr.A0I;
    }
}
