package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    public static final Charset f = Charset.forName("UTF-8");
    public static final FieldDescriptor g = FieldDescriptor.a("key").b(AtProtobuf.b().d(1).a()).a();
    public static final FieldDescriptor h = FieldDescriptor.a("value").b(AtProtobuf.b().d(2).a()).a();
    public static final ObjectEncoder<Map.Entry<Object, Object>> i = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.a
        @Override // com.google.firebase.encoders.Encoder
        public final void a(Object obj, ObjectEncoderContext objectEncoderContext) {
            ProtobufDataEncoderContext.o((Map.Entry) obj, objectEncoderContext);
        }
    };
    public OutputStream a;
    public final Map<Class<?>, ObjectEncoder<?>> b;
    public final Map<Class<?>, ValueEncoder<?>> c;
    public final ObjectEncoder<Object> d;
    public final ProtobufValueEncoderContext e = new ProtobufValueEncoderContext(this);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.a = outputStream;
        this.b = map;
        this.c = map2;
        this.d = objectEncoder;
    }

    public static Protobuf D(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static int E(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.c(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static /* synthetic */ void o(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.k(g, entry.getKey());
        objectEncoderContext.k(h, entry.getValue());
    }

    public static ByteBuffer y(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    public final <T> ProtobufDataEncoderContext A(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long z2 = z(objectEncoder, t);
        if (z && z2 == 0) {
            return this;
        }
        F((E(fieldDescriptor) << 3) | 2);
        G(z2);
        objectEncoder.a(t, this);
        return this;
    }

    public final <T> ProtobufDataEncoderContext B(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        this.e.b(fieldDescriptor, z);
        valueEncoder.a(t, this.e);
        return this;
    }

    public ProtobufDataEncoderContext C(@InterfaceC11300zs1 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public final void F(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void G(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext d(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, float f2) throws IOException {
        return q(fieldDescriptor, f2, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext e(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext f(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, double d) throws IOException {
        return p(fieldDescriptor, d, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext g(@InterfaceC5670cr1 String str, boolean z) throws IOException {
        return a(FieldDescriptor.d(str), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext h(@InterfaceC5670cr1 String str, double d) throws IOException {
        return f(FieldDescriptor.d(str), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext i(@InterfaceC5670cr1 String str, long j) throws IOException {
        return b(FieldDescriptor.d(str), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext j(@InterfaceC5670cr1 String str, int i2) throws IOException {
        return c(FieldDescriptor.d(str), i2);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext k(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, @InterfaceC11300zs1 Object obj) throws IOException {
        return r(fieldDescriptor, obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext l(@InterfaceC11300zs1 Object obj) throws IOException {
        return C(obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext m(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Object obj) throws IOException {
        return k(FieldDescriptor.d(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext n(@InterfaceC5670cr1 String str) throws IOException {
        return e(FieldDescriptor.d(str));
    }

    public ObjectEncoderContext p(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        F((E(fieldDescriptor) << 3) | 1);
        this.a.write(y(8).putDouble(d).array());
        return this;
    }

    public ObjectEncoderContext q(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, float f2, boolean z) throws IOException {
        if (z && f2 == 0.0f) {
            return this;
        }
        F((E(fieldDescriptor) << 3) | 5);
        this.a.write(y(4).putFloat(f2).array());
        return this;
    }

    public ObjectEncoderContext r(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, @InterfaceC11300zs1 Object obj, boolean z) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    F((E(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f);
                    F(bytes.length);
                    this.a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    r(fieldDescriptor, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    A(i, fieldDescriptor, entry, false);
                }
            } else if (obj instanceof Double) {
                return p(fieldDescriptor, ((Double) obj).doubleValue(), z);
            } else {
                if (obj instanceof Float) {
                    return q(fieldDescriptor, ((Float) obj).floatValue(), z);
                }
                if (obj instanceof Number) {
                    return v(fieldDescriptor, ((Number) obj).longValue(), z);
                }
                if (obj instanceof Boolean) {
                    return x(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (!z || bArr.length != 0) {
                        F((E(fieldDescriptor) << 3) | 2);
                        F(bArr.length);
                        this.a.write(bArr);
                        return this;
                    }
                } else {
                    ObjectEncoder<?> objectEncoder = this.b.get(obj.getClass());
                    if (objectEncoder != null) {
                        return A(objectEncoder, fieldDescriptor, obj, z);
                    }
                    ValueEncoder<?> valueEncoder = this.c.get(obj.getClass());
                    if (valueEncoder != null) {
                        return B(valueEncoder, fieldDescriptor, obj, z);
                    }
                    if (obj instanceof ProtoEnum) {
                        return c(fieldDescriptor, ((ProtoEnum) obj).k());
                    }
                    if (obj instanceof Enum) {
                        return c(fieldDescriptor, ((Enum) obj).ordinal());
                    }
                    return A(this.d, fieldDescriptor, obj, z);
                }
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: s */
    public ProtobufDataEncoderContext c(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, int i2) throws IOException {
        return t(fieldDescriptor, i2, true);
    }

    public ProtobufDataEncoderContext t(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, int i2, boolean z) throws IOException {
        if (!z || i2 != 0) {
            Protobuf D = D(fieldDescriptor);
            int i3 = AnonymousClass1.a[D.intEncoding().ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        F((D.tag() << 3) | 5);
                        this.a.write(y(4).putInt(i2).array());
                        return this;
                    }
                } else {
                    F(D.tag() << 3);
                    F((i2 << 1) ^ (i2 >> 31));
                    return this;
                }
            } else {
                F(D.tag() << 3);
                F(i2);
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: u */
    public ProtobufDataEncoderContext b(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, long j) throws IOException {
        return v(fieldDescriptor, j, true);
    }

    public ProtobufDataEncoderContext v(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (!z || j != 0) {
            Protobuf D = D(fieldDescriptor);
            int i2 = AnonymousClass1.a[D.intEncoding().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        F((D.tag() << 3) | 1);
                        this.a.write(y(8).putLong(j).array());
                        return this;
                    }
                } else {
                    F(D.tag() << 3);
                    G((j >> 63) ^ (j << 1));
                    return this;
                }
            } else {
                F(D.tag() << 3);
                G(j);
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: w */
    public ProtobufDataEncoderContext a(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return x(fieldDescriptor, z, true);
    }

    public ProtobufDataEncoderContext x(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws IOException {
        return t(fieldDescriptor, z ? 1 : 0, z2);
    }

    public final <T> long z(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.a;
            this.a = lengthCountingOutputStream;
            objectEncoder.a(t, this);
            this.a = outputStream;
            long a = lengthCountingOutputStream.a();
            lengthCountingOutputStream.close();
            return a;
        } catch (Throwable th) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
