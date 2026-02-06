package com.google.firebase.encoders.config;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface EncoderConfig<T extends EncoderConfig<T>> {
    @InterfaceC5670cr1
    <U> T a(@InterfaceC5670cr1 Class<U> cls, @InterfaceC5670cr1 ValueEncoder<? super U> valueEncoder);

    @InterfaceC5670cr1
    <U> T b(@InterfaceC5670cr1 Class<U> cls, @InterfaceC5670cr1 ObjectEncoder<? super U> objectEncoder);
}
