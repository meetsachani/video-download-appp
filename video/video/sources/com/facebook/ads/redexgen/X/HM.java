package com.facebook.ads.redexgen.X;

import com.facebook.ads.androidx.media3.common.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public final class HM {
    public final C04774v A00 = new C04774v(10);

    public final Metadata A00(InterfaceC2033ms interfaceC2033ms, IE ie) throws IOException {
        int tagLength = 0;
        Metadata metadata = null;
        while (true) {
            try {
                interfaceC2033ms.AGt(this.A00.A0l(), 0, 10);
                this.A00.A0f(0);
                if (this.A00.A0K() != 4801587) {
                    break;
                }
                this.A00.A0g(3);
                int A0H = this.A00.A0H();
                int framesLength = A0H + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[framesLength];
                    System.arraycopy(this.A00.A0l(), 0, bArr, 0, 10);
                    interfaceC2033ms.AGt(bArr, 10, A0H);
                    metadata = new C9U(ie).A0S(bArr, framesLength);
                } else {
                    interfaceC2033ms.A47(A0H);
                }
                tagLength += framesLength;
            } catch (EOFException unused) {
            }
        }
        interfaceC2033ms.AIl();
        interfaceC2033ms.A47(tagLength);
        return metadata;
    }
}
