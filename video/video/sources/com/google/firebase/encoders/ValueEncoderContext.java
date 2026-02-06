package com.google.firebase.encoders;

import java.io.IOException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface ValueEncoderContext {
    @InterfaceC5670cr1
    ValueEncoderContext P(@InterfaceC5670cr1 byte[] bArr) throws IOException;

    @InterfaceC5670cr1
    ValueEncoderContext Q(@InterfaceC11300zs1 String str) throws IOException;

    @InterfaceC5670cr1
    ValueEncoderContext R(boolean z) throws IOException;

    @InterfaceC5670cr1
    ValueEncoderContext S(float f) throws IOException;

    @InterfaceC5670cr1
    ValueEncoderContext add(double d) throws IOException;

    @InterfaceC5670cr1
    ValueEncoderContext add(int i) throws IOException;

    @InterfaceC5670cr1
    ValueEncoderContext add(long j) throws IOException;
}
