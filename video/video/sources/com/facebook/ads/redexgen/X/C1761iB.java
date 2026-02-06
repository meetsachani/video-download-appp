package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;

/* renamed from: com.facebook.ads.redexgen.X.iB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1761iB implements InterfaceC0969Om {
    public final SharedPreferences A00;

    public C1761iB(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0969Om
    public final C1762iC A6I() {
        return new C1762iC(this.A00.edit());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0969Om
    public final long A8Q(String str, long j) {
        return this.A00.getLong(str, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0969Om
    public final String A9E(String str, String str2) {
        return this.A00.getString(str, str2);
    }
}
