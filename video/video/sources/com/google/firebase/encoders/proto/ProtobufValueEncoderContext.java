package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
class ProtobufValueEncoderContext implements ValueEncoderContext {
    public boolean a = false;
    public boolean b = false;
    public FieldDescriptor c;
    public final ProtobufDataEncoderContext d;

    public ProtobufValueEncoderContext(ProtobufDataEncoderContext protobufDataEncoderContext) {
        this.d = protobufDataEncoderContext;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext P(@InterfaceC5670cr1 byte[] bArr) throws IOException {
        a();
        this.d.r(this.c, bArr, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext Q(@InterfaceC11300zs1 String str) throws IOException {
        a();
        this.d.r(this.c, str, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext R(boolean z) throws IOException {
        a();
        this.d.x(this.c, z, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext S(float f) throws IOException {
        a();
        this.d.q(this.c, f, this.b);
        return this;
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext add(double d) throws IOException {
        a();
        this.d.p(this.c, d, this.b);
        return this;
    }

    public void b(FieldDescriptor fieldDescriptor, boolean z) {
        this.a = false;
        this.c = fieldDescriptor;
        this.b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext add(int i) throws IOException {
        a();
        this.d.t(this.c, i, this.b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    public ValueEncoderContext add(long j) throws IOException {
        a();
        this.d.v(this.c, j, this.b);
        return this;
    }
}
