package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    @InterfaceC11300zs1
    @KeepForSdk
    public final DataHolder X;

    @KeepForSdk
    public AbstractDataBuffer(@InterfaceC11300zs1 DataHolder dataHolder) {
        this.X = dataHolder;
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g();
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public void g() {
        DataHolder dataHolder = this.X;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public abstract T get(int i);

    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        DataHolder dataHolder = this.X;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @InterfaceC5670cr1
    public Iterator<T> h1() {
        return new SingleRefDataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @Deprecated
    public boolean isClosed() {
        DataHolder dataHolder = this.X;
        if (dataHolder != null && !dataHolder.isClosed()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    @InterfaceC5670cr1
    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    @InterfaceC11300zs1
    public final Bundle o0() {
        DataHolder dataHolder = this.X;
        if (dataHolder == null) {
            return null;
        }
        return dataHolder.o0();
    }
}
