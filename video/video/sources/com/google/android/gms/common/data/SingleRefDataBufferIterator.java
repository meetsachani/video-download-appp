package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    public T Z;

    public SingleRefDataBufferIterator(@InterfaceC5670cr1 DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    @InterfaceC5670cr1
    public final T next() {
        if (hasNext()) {
            int i = this.Y + 1;
            this.Y = i;
            if (i == 0) {
                T t = (T) Preconditions.r(this.X.get(0));
                this.Z = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(t.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) Preconditions.r(this.Z)).n(this.Y);
            }
            return this.Z;
        }
        int i2 = this.Y;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i2);
        throw new NoSuchElementException(sb2.toString());
    }
}
