package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.kq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1920kq implements InterfaceC0891Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1920kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final void AGj(int i) throws C1917kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final void close() throws C1917kn {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final int length() throws C1917kn {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0891Ll
    public final int read(byte[] bArr) throws C1917kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
