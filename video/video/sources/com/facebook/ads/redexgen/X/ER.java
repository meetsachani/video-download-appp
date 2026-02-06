package com.facebook.ads.redexgen.X;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* loaded from: assets/audience_network/classes2.dex */
public class ER {
    @Nullable
    public final C2242qI A00;
    public final Throwable A01;

    public ER(@Nullable C2242qI c2242qI, Throwable th) {
        this.A00 = c2242qI;
        this.A01 = th;
    }
}
