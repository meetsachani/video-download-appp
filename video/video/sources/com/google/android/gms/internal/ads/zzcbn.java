package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzcbn {
    public static final AtomicInteger X = new AtomicInteger(0);
    public static final AtomicInteger Y = new AtomicInteger(0);

    public static int O() {
        return X.get();
    }

    public static int Q() {
        return Y.get();
    }

    public static AtomicInteger u() {
        return X;
    }

    public static AtomicInteger v() {
        return Y;
    }

    public abstract void A(int i);

    public abstract void B(int i);

    public abstract void C(zzcbm zzcbmVar);

    public abstract void D(int i);

    public abstract void E(int i);

    public abstract void F(boolean z);

    public abstract void G(@InterfaceC11300zs1 Integer num);

    public abstract void H(boolean z);

    public abstract void I(int i);

    public abstract void J(Surface surface, boolean z) throws IOException;

    public abstract void K(float f, boolean z) throws IOException;

    public abstract void L();

    public abstract boolean M();

    public abstract int N();

    public abstract int P();

    public abstract long R();

    public abstract long S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long a();

    public abstract long s();

    @InterfaceC11300zs1
    public abstract Integer t();

    public abstract void w(Uri[] uriArr, String str);

    public abstract void x(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z);

    public abstract void y();

    public abstract void z(long j);
}
