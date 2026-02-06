package com.google.firebase.encoders.proto;

import java.io.OutputStream;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
final class LengthCountingOutputStream extends OutputStream {
    public long X = 0;

    public long a() {
        return this.X;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.X++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.X += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@InterfaceC5670cr1 byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.X += i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
