package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class Tz2 extends IOException {
    public final AbstractC2533Be1 X;
    public final long Y;
    public final long Z;

    public Tz2(AbstractC2533Be1 abstractC2533Be1, long j, long j2) {
        super("Unexpected sample timestamp: " + TD2.b2(j2) + " in chunk [" + abstractC2533Be1.g + C6566gU0.h + abstractC2533Be1.h + C6566gU0.g);
        this.X = abstractC2533Be1;
        this.Y = j;
        this.Z = j2;
    }
}
