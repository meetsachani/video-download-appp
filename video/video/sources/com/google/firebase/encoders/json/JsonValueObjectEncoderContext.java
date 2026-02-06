package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {
    public JsonValueObjectEncoderContext a = null;
    public boolean b = true;
    public final JsonWriter c;
    public final Map<Class<?>, ObjectEncoder<?>> d;
    public final Map<Class<?>, ValueEncoder<?>> e;
    public final ObjectEncoder<Object> f;
    public final boolean g;

    public JsonValueObjectEncoderContext(@InterfaceC5670cr1 Writer writer, @InterfaceC5670cr1 Map<Class<?>, ObjectEncoder<?>> map, @InterfaceC5670cr1 Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
        this.f = objectEncoder;
        this.g = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: A */
    public JsonValueObjectEncoderContext P(@InterfaceC11300zs1 byte[] bArr) throws IOException {
        G();
        if (bArr == null) {
            this.c.nullValue();
            return this;
        }
        this.c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    public final boolean B(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    public void C() throws IOException {
        G();
        this.c.flush();
    }

    public JsonValueObjectEncoderContext D(ObjectEncoder<Object> objectEncoder, Object obj, boolean z) throws IOException {
        if (!z) {
            this.c.beginObject();
        }
        objectEncoder.a(obj, this);
        if (!z) {
            this.c.endObject();
        }
        return this;
    }

    public final JsonValueObjectEncoderContext E(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Object obj) throws IOException, EncodingException {
        G();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
            return this;
        }
        return s(obj, false);
    }

    public final JsonValueObjectEncoderContext F(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        G();
        this.c.name(str);
        return s(obj, false);
    }

    public final void G() throws IOException {
        if (this.b) {
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.a;
            if (jsonValueObjectEncoderContext != null) {
                jsonValueObjectEncoderContext.G();
                this.a.b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext a(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return g(fieldDescriptor.b(), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext b(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, long j) throws IOException {
        return i(fieldDescriptor.b(), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext c(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, int i) throws IOException {
        return j(fieldDescriptor.b(), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext d(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, float f) throws IOException {
        return h(fieldDescriptor.b(), f);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext e(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor) throws IOException {
        return n(fieldDescriptor.b());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext f(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, double d) throws IOException {
        return h(fieldDescriptor.b(), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext k(@InterfaceC5670cr1 FieldDescriptor fieldDescriptor, @InterfaceC11300zs1 Object obj) throws IOException {
        return m(fieldDescriptor.b(), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext l(@InterfaceC11300zs1 Object obj) throws IOException {
        return s(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    public ObjectEncoderContext n(@InterfaceC5670cr1 String str) throws IOException {
        G();
        this.a = new JsonValueObjectEncoderContext(this);
        this.c.name(str);
        this.c.beginObject();
        return this.a;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: o */
    public JsonValueObjectEncoderContext add(double d) throws IOException {
        G();
        this.c.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: p */
    public JsonValueObjectEncoderContext S(float f) throws IOException {
        G();
        this.c.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: q */
    public JsonValueObjectEncoderContext add(int i) throws IOException {
        G();
        this.c.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: r */
    public JsonValueObjectEncoderContext add(long j) throws IOException {
        G();
        this.c.value(j);
        return this;
    }

    @InterfaceC5670cr1
    public JsonValueObjectEncoderContext s(@InterfaceC11300zs1 Object obj, boolean z) throws IOException {
        int[] iArr;
        Class<?> cls;
        if (z && B(obj)) {
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            throw new EncodingException(String.format("%s cannot be encoded inline", cls));
        } else if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    return P((byte[]) obj);
                }
                this.c.beginArray();
                if (obj instanceof int[]) {
                    int length = ((int[]) obj).length;
                    while (i < length) {
                        this.c.value(iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        add(jArr[i]);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.c.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.c.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    for (Number number : (Number[]) obj) {
                        s(number, false);
                    }
                } else {
                    for (Object obj2 : (Object[]) obj) {
                        s(obj2, false);
                    }
                }
                this.c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.c.beginArray();
                for (Object obj3 : (Collection) obj) {
                    s(obj3, false);
                }
                this.c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.c.endObject();
                return this;
            } else {
                ObjectEncoder<?> objectEncoder = this.d.get(obj.getClass());
                if (objectEncoder != null) {
                    return D(objectEncoder, obj, z);
                }
                ValueEncoder<?> valueEncoder = this.e.get(obj.getClass());
                if (valueEncoder != null) {
                    valueEncoder.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    if (obj instanceof NumberedEnum) {
                        add(((NumberedEnum) obj).k());
                        return this;
                    }
                    Q(((Enum) obj).name());
                    return this;
                } else {
                    return D(this.f, obj, z);
                }
            }
        }
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: t */
    public JsonValueObjectEncoderContext Q(@InterfaceC11300zs1 String str) throws IOException {
        G();
        this.c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: u */
    public JsonValueObjectEncoderContext h(@InterfaceC5670cr1 String str, double d) throws IOException {
        G();
        this.c.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: v */
    public JsonValueObjectEncoderContext j(@InterfaceC5670cr1 String str, int i) throws IOException {
        G();
        this.c.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: w */
    public JsonValueObjectEncoderContext i(@InterfaceC5670cr1 String str, long j) throws IOException {
        G();
        this.c.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: x */
    public JsonValueObjectEncoderContext m(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 Object obj) throws IOException {
        if (this.g) {
            return F(str, obj);
        }
        return E(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @InterfaceC5670cr1
    /* renamed from: y */
    public JsonValueObjectEncoderContext g(@InterfaceC5670cr1 String str, boolean z) throws IOException {
        G();
        this.c.name(str);
        return R(z);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @InterfaceC5670cr1
    /* renamed from: z */
    public JsonValueObjectEncoderContext R(boolean z) throws IOException {
        G();
        this.c.value(z);
        return this;
    }

    public JsonValueObjectEncoderContext(JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        this.c = jsonValueObjectEncoderContext.c;
        this.d = jsonValueObjectEncoderContext.d;
        this.e = jsonValueObjectEncoderContext.e;
        this.f = jsonValueObjectEncoderContext.f;
        this.g = jsonValueObjectEncoderContext.g;
    }
}
