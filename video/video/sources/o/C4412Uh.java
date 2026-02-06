package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* renamed from: o.Uh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4412Uh implements Configurator {
    public static final int a = 2;
    public static final Configurator b = new C4412Uh();

    /* renamed from: o.Uh$a */
    /* loaded from: classes2.dex */
    public static final class a implements ObjectEncoder<V8> {
        public static final a a = new a();
        public static final FieldDescriptor b = FieldDescriptor.d(RemoteConfigConstants.RequestFieldKey.e0);
        public static final FieldDescriptor c = FieldDescriptor.d("model");
        public static final FieldDescriptor d = FieldDescriptor.d("hardware");
        public static final FieldDescriptor e = FieldDescriptor.d("device");
        public static final FieldDescriptor f = FieldDescriptor.d(C3209Hz.x);
        public static final FieldDescriptor g = FieldDescriptor.d("osBuild");
        public static final FieldDescriptor h = FieldDescriptor.d(C3209Hz.z);
        public static final FieldDescriptor i = FieldDescriptor.d(C3209Hz.A);
        public static final FieldDescriptor j = FieldDescriptor.d("locale");
        public static final FieldDescriptor k = FieldDescriptor.d("country");
        public static final FieldDescriptor l = FieldDescriptor.d("mccMnc");
        public static final FieldDescriptor m = FieldDescriptor.d("applicationBuild");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(V8 v8, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, v8.m());
            objectEncoderContext.k(c, v8.j());
            objectEncoderContext.k(d, v8.f());
            objectEncoderContext.k(e, v8.d());
            objectEncoderContext.k(f, v8.l());
            objectEncoderContext.k(g, v8.k());
            objectEncoderContext.k(h, v8.h());
            objectEncoderContext.k(i, v8.e());
            objectEncoderContext.k(j, v8.g());
            objectEncoderContext.k(k, v8.c());
            objectEncoderContext.k(l, v8.i());
            objectEncoderContext.k(m, v8.b());
        }
    }

    /* renamed from: o.Uh$b */
    /* loaded from: classes2.dex */
    public static final class b implements ObjectEncoder<AbstractC6133em> {
        public static final b a = new b();
        public static final FieldDescriptor b = FieldDescriptor.d("logRequest");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(AbstractC6133em abstractC6133em, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, abstractC6133em.c());
        }
    }

    /* renamed from: o.Uh$c */
    /* loaded from: classes2.dex */
    public static final class c implements ObjectEncoder<HD> {
        public static final c a = new c();
        public static final FieldDescriptor b = FieldDescriptor.d("clientType");
        public static final FieldDescriptor c = FieldDescriptor.d("androidClientInfo");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(HD hd, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, hd.c());
            objectEncoderContext.k(c, hd.b());
        }
    }

    /* renamed from: o.Uh$d */
    /* loaded from: classes2.dex */
    public static final class d implements ObjectEncoder<M31> {
        public static final d a = new d();
        public static final FieldDescriptor b = FieldDescriptor.d("eventTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.d("eventCode");
        public static final FieldDescriptor d = FieldDescriptor.d("eventUptimeMs");
        public static final FieldDescriptor e = FieldDescriptor.d("sourceExtension");
        public static final FieldDescriptor f = FieldDescriptor.d("sourceExtensionJsonProto3");
        public static final FieldDescriptor g = FieldDescriptor.d("timezoneOffsetSeconds");
        public static final FieldDescriptor h = FieldDescriptor.d("networkConnectionInfo");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(M31 m31, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, m31.c());
            objectEncoderContext.k(c, m31.b());
            objectEncoderContext.b(d, m31.d());
            objectEncoderContext.k(e, m31.f());
            objectEncoderContext.k(f, m31.g());
            objectEncoderContext.b(g, m31.h());
            objectEncoderContext.k(h, m31.e());
        }
    }

    /* renamed from: o.Uh$e */
    /* loaded from: classes2.dex */
    public static final class e implements ObjectEncoder<AbstractC4995a41> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.d("requestTimeMs");
        public static final FieldDescriptor c = FieldDescriptor.d("requestUptimeMs");
        public static final FieldDescriptor d = FieldDescriptor.d("clientInfo");
        public static final FieldDescriptor e = FieldDescriptor.d("logSource");
        public static final FieldDescriptor f = FieldDescriptor.d("logSourceName");
        public static final FieldDescriptor g = FieldDescriptor.d("logEvent");
        public static final FieldDescriptor h = FieldDescriptor.d("qosTier");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(AbstractC4995a41 abstractC4995a41, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, abstractC4995a41.g());
            objectEncoderContext.b(c, abstractC4995a41.h());
            objectEncoderContext.k(d, abstractC4995a41.b());
            objectEncoderContext.k(e, abstractC4995a41.d());
            objectEncoderContext.k(f, abstractC4995a41.e());
            objectEncoderContext.k(g, abstractC4995a41.c());
            objectEncoderContext.k(h, abstractC4995a41.f());
        }
    }

    /* renamed from: o.Uh$f */
    /* loaded from: classes2.dex */
    public static final class f implements ObjectEncoder<AbstractC2675Cp1> {
        public static final f a = new f();
        public static final FieldDescriptor b = FieldDescriptor.d("networkType");
        public static final FieldDescriptor c = FieldDescriptor.d("mobileSubtype");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(AbstractC2675Cp1 abstractC2675Cp1, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, abstractC2675Cp1.c());
            objectEncoderContext.k(c, abstractC2675Cp1.b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void a(EncoderConfig<?> encoderConfig) {
        b bVar = b.a;
        encoderConfig.b(AbstractC6133em.class, bVar);
        encoderConfig.b(C9311ri.class, bVar);
        e eVar = e.a;
        encoderConfig.b(AbstractC4995a41.class, eVar);
        encoderConfig.b(C4513Vi.class, eVar);
        c cVar = c.a;
        encoderConfig.b(HD.class, cVar);
        encoderConfig.b(C2449Ai.class, cVar);
        a aVar = a.a;
        encoderConfig.b(V8.class, aVar);
        encoderConfig.b(C6858hi.class, aVar);
        d dVar = d.a;
        encoderConfig.b(M31.class, dVar);
        encoderConfig.b(C4416Ui.class, dVar);
        f fVar = f.a;
        encoderConfig.b(AbstractC2675Cp1.class, fVar);
        encoderConfig.b(C4911Zi.class, fVar);
    }
}
