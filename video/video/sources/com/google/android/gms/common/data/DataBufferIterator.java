package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class DataBufferIterator<T> implements Iterator<T> {
    @InterfaceC5670cr1
    public final DataBuffer<T> X;
    public int Y = -1;

    public DataBufferIterator(@InterfaceC5670cr1 DataBuffer<T> dataBuffer) {
        this.X = (DataBuffer) Preconditions.r(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.Y < this.X.getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    @InterfaceC5670cr1
    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.X;
            int i = this.Y + 1;
            this.Y = i;
            return dataBuffer.get(i);
        }
        int i2 = this.Y;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
