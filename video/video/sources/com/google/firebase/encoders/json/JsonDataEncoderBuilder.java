package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    public static final ObjectEncoder<Object> e = new ObjectEncoder() { // from class: o.xV0
        @Override // com.google.firebase.encoders.Encoder
        public final void a(Object obj, ObjectEncoderContext objectEncoderContext) {
            JsonDataEncoderBuilder.d(obj, objectEncoderContext);
        }
    };
    public static final ValueEncoder<String> f = new ValueEncoder() { // from class: o.yV0
        @Override // com.google.firebase.encoders.Encoder
        public final void a(Object obj, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.Q((String) obj);
        }
    };
    public static final ValueEncoder<Boolean> g = new ValueEncoder() { // from class: o.zV0
        @Override // com.google.firebase.encoders.Encoder
        public final void a(Object obj, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.R(((Boolean) obj).booleanValue());
        }
    };
    public static final TimestampEncoder h = new TimestampEncoder();
    public final Map<Class<?>, ObjectEncoder<?>> a = new HashMap();
    public final Map<Class<?>, ValueEncoder<?>> b = new HashMap();
    public ObjectEncoder<Object> c = e;
    public boolean d = false;

    /* loaded from: classes3.dex */
    public static final class TimestampEncoder implements ValueEncoder<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ConfigFetchHttpClient.f390o, Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(@InterfaceC5670cr1 Date date, @InterfaceC5670cr1 ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.Q(a.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        a(String.class, f);
        a(Boolean.class, g);
        a(Date.class, h);
    }

    public static /* synthetic */ void d(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    @InterfaceC5670cr1
    public DataEncoder j() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public void a(@InterfaceC5670cr1 Object obj, @InterfaceC5670cr1 Writer writer) throws IOException {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.a, JsonDataEncoderBuilder.this.b, JsonDataEncoderBuilder.this.c, JsonDataEncoderBuilder.this.d);
                jsonValueObjectEncoderContext.s(obj, false);
                jsonValueObjectEncoderContext.C();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public String b(@InterfaceC5670cr1 Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    a(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    @InterfaceC5670cr1
    public JsonDataEncoderBuilder k(@InterfaceC5670cr1 Configurator configurator) {
        configurator.a(this);
        return this;
    }

    @InterfaceC5670cr1
    public JsonDataEncoderBuilder l(boolean z) {
        this.d = z;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @InterfaceC5670cr1
    /* renamed from: m */
    public <T> JsonDataEncoderBuilder b(@InterfaceC5670cr1 Class<T> cls, @InterfaceC5670cr1 ObjectEncoder<? super T> objectEncoder) {
        this.a.put(cls, objectEncoder);
        this.b.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @InterfaceC5670cr1
    /* renamed from: n */
    public <T> JsonDataEncoderBuilder a(@InterfaceC5670cr1 Class<T> cls, @InterfaceC5670cr1 ValueEncoder<? super T> valueEncoder) {
        this.b.put(cls, valueEncoder);
        this.a.remove(cls);
        return this;
    }

    @InterfaceC5670cr1
    public JsonDataEncoderBuilder o(@InterfaceC5670cr1 ObjectEncoder<Object> objectEncoder) {
        this.c = objectEncoder;
        return this;
    }
}
