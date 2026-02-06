package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public class ProtobufEncoder {
    public final Map<Class<?>, ObjectEncoder<?>> a;
    public final Map<Class<?>, ValueEncoder<?>> b;
    public final ObjectEncoder<Object> c;

    /* loaded from: classes3.dex */
    public static final class Builder implements EncoderConfig<Builder> {
        public static final ObjectEncoder<Object> d = new ObjectEncoder() { // from class: o.ZJ1
            @Override // com.google.firebase.encoders.Encoder
            public final void a(Object obj, ObjectEncoderContext objectEncoderContext) {
                ProtobufEncoder.Builder.c(obj, objectEncoderContext);
            }
        };
        public final Map<Class<?>, ObjectEncoder<?>> a = new HashMap();
        public final Map<Class<?>, ValueEncoder<?>> b = new HashMap();
        public ObjectEncoder<Object> c = d;

        public static /* synthetic */ void c(Object obj, ObjectEncoderContext objectEncoderContext) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder d() {
            return new ProtobufEncoder(new HashMap(this.a), new HashMap(this.b), this.c);
        }

        @InterfaceC5670cr1
        public Builder e(@InterfaceC5670cr1 Configurator configurator) {
            configurator.a(this);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @InterfaceC5670cr1
        /* renamed from: f */
        public <U> Builder b(@InterfaceC5670cr1 Class<U> cls, @InterfaceC5670cr1 ObjectEncoder<? super U> objectEncoder) {
            this.a.put(cls, objectEncoder);
            this.b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @InterfaceC5670cr1
        /* renamed from: g */
        public <U> Builder a(@InterfaceC5670cr1 Class<U> cls, @InterfaceC5670cr1 ValueEncoder<? super U> valueEncoder) {
            this.b.put(cls, valueEncoder);
            this.a.remove(cls);
            return this;
        }

        @InterfaceC5670cr1
        public Builder h(@InterfaceC5670cr1 ObjectEncoder<Object> objectEncoder) {
            this.c = objectEncoder;
            return this;
        }
    }

    public ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.a = map;
        this.b = map2;
        this.c = objectEncoder;
    }

    public static Builder a() {
        return new Builder();
    }

    public void b(@InterfaceC5670cr1 Object obj, @InterfaceC5670cr1 OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.a, this.b, this.c).C(obj);
    }

    @InterfaceC5670cr1
    public byte[] c(@InterfaceC5670cr1 Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
