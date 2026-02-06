package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    void g();

    T get(int i);

    int getCount();

    @InterfaceC5670cr1
    Iterator<T> h1();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    @InterfaceC5670cr1
    Iterator<T> iterator();

    @InterfaceC11300zs1
    @KeepForSdk
    Bundle o0();
}
