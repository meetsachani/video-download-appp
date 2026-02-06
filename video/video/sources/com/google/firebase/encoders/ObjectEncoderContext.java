package com.google.firebase.encoders;

import java.io.IOException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public interface ObjectEncoderContext {
    @InterfaceC5670cr1
    ObjectEncoderContext a(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, boolean z) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext b(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, long j) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext c(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, int i) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext d(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, float f) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext e(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext f(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, double d) throws IOException;

    @InterfaceC5670cr1
    @Deprecated
    ObjectEncoderContext g(@InterfaceC5670cr1 String str, boolean z) throws IOException;

    @InterfaceC5670cr1
    @Deprecated
    ObjectEncoderContext h(@InterfaceC5670cr1 String str, double d) throws IOException;

    @InterfaceC5670cr1
    @Deprecated
    ObjectEncoderContext i(@InterfaceC5670cr1 String str, long j) throws IOException;

    @InterfaceC5670cr1
    @Deprecated
    ObjectEncoderContext j(@InterfaceC5670cr1 String str, int i) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext k(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, @InterfaceC11300zs1 Object obj) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext l(@InterfaceC11300zs1 Object obj) throws IOException;

    @InterfaceC5670cr1
    @Deprecated
    ObjectEncoderContext m(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Object obj) throws IOException;

    @InterfaceC5670cr1
    ObjectEncoderContext n(@InterfaceC5670cr1 String str) throws IOException;
}
