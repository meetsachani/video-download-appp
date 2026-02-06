package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2034mt implements InterfaceC0780Hd {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    public final /* synthetic */ int AIp(InterfaceC04102c interfaceC04102c, int i, boolean z) {
        return AbstractC0777Ha.A00(this, interfaceC04102c, i, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    public final /* synthetic */ void AIr(C04774v c04774v, int i) {
        AbstractC0777Ha.A01(this, c04774v, i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    public final void A6e(C2242qI c2242qI) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    public final int AIq(InterfaceC04102c interfaceC04102c, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = interfaceC04102c.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    public final void AIs(C04774v c04774v, int i, int i2) {
        c04774v.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    public final void AIu(long j, int i, int i2, int i3, C0778Hb c0778Hb) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0780Hd
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AKf(Uri uri) {
    }
}
