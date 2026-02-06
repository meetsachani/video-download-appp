package com.google.android.exoplayer2.ui;

import o.InterfaceC11300zs1;

@Deprecated
/* loaded from: classes2.dex */
public interface l {

    /* loaded from: classes2.dex */
    public interface a {
        void d0(l lVar, long j, boolean z);

        void h0(l lVar, long j);

        void y(l lVar, long j);
    }

    void a(a aVar);

    void b(a aVar);

    void c(@InterfaceC11300zs1 long[] jArr, @InterfaceC11300zs1 boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setKeyCountIncrement(int i);

    void setKeyTimeIncrement(long j);

    void setPosition(long j);
}
