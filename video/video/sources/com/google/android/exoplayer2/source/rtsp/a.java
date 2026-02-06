package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.g;
import java.io.IOException;
import o.FU;
import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public interface a extends FU {

    /* renamed from: com.google.android.exoplayer2.source.rtsp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0095a {
        a a(int i) throws IOException;

        @InterfaceC11300zs1
        default InterfaceC0095a b() {
            return null;
        }
    }

    String d();

    int e();

    boolean l();

    @InterfaceC11300zs1
    g.b o();
}
