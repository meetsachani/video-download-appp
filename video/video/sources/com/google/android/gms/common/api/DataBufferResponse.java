package com.google.android.gms.common.api;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @KeepForSdk
    public DataBufferResponse() {
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((AbstractDataBuffer) d()).close();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void g() {
        ((AbstractDataBuffer) d()).g();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @InterfaceC5670cr1
    public final T get(int i) {
        return (T) ((AbstractDataBuffer) d()).get(i);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        return ((AbstractDataBuffer) d()).getCount();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @InterfaceC5670cr1
    public final Iterator<T> h1() {
        return ((AbstractDataBuffer) d()).h1();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
        return ((AbstractDataBuffer) d()).isClosed();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    @InterfaceC5670cr1
    public final Iterator<T> iterator() {
        return ((AbstractDataBuffer) d()).iterator();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @InterfaceC11300zs1
    public final Bundle o0() {
        return ((AbstractDataBuffer) d()).o0();
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    /* JADX WARN: Multi-variable type inference failed */
    @KeepForSdk
    public DataBufferResponse(@InterfaceC5670cr1 AbstractDataBuffer abstractDataBuffer) {
        super(abstractDataBuffer);
    }
}
