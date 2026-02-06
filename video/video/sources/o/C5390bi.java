package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* renamed from: o.bi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5390bi implements Configurator {
    public static final int a = 2;
    public static final Configurator b = new C5390bi();

    /* renamed from: o.bi$a */
    /* loaded from: classes2.dex */
    public static final class a implements ObjectEncoder<ID> {
        public static final a a = new a();
        public static final FieldDescriptor b = FieldDescriptor.a("window").b(AtProtobuf.b().d(1).a()).a();
        public static final FieldDescriptor c = FieldDescriptor.a("logSourceMetrics").b(AtProtobuf.b().d(2).a()).a();
        public static final FieldDescriptor d = FieldDescriptor.a("globalMetrics").b(AtProtobuf.b().d(3).a()).a();
        public static final FieldDescriptor e = FieldDescriptor.a("appNamespace").b(AtProtobuf.b().d(4).a()).a();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(ID id, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, id.g());
            objectEncoderContext.k(c, id.e());
            objectEncoderContext.k(d, id.d());
            objectEncoderContext.k(e, id.a());
        }
    }

    /* renamed from: o.bi$b */
    /* loaded from: classes2.dex */
    public static final class b implements ObjectEncoder<C6004eE0> {
        public static final b a = new b();
        public static final FieldDescriptor b = FieldDescriptor.a("storageMetrics").b(AtProtobuf.b().d(1).a()).a();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(C6004eE0 c6004eE0, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, c6004eE0.c());
        }
    }

    /* renamed from: o.bi$c */
    /* loaded from: classes2.dex */
    public static final class c implements ObjectEncoder<N31> {
        public static final c a = new c();
        public static final FieldDescriptor b = FieldDescriptor.a("eventsDroppedCount").b(AtProtobuf.b().d(1).a()).a();
        public static final FieldDescriptor c = FieldDescriptor.a(SQ0.n).b(AtProtobuf.b().d(3).a()).a();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(N31 n31, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, n31.b());
            objectEncoderContext.k(c, n31.c());
        }
    }

    /* renamed from: o.bi$d */
    /* loaded from: classes2.dex */
    public static final class d implements ObjectEncoder<C5723d41> {
        public static final d a = new d();
        public static final FieldDescriptor b = FieldDescriptor.a("logSource").b(AtProtobuf.b().d(1).a()).a();
        public static final FieldDescriptor c = FieldDescriptor.a("logEventDropped").b(AtProtobuf.b().d(2).a()).a();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(C5723d41 c5723d41, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, c5723d41.c());
            objectEncoderContext.k(c, c5723d41.b());
        }
    }

    /* renamed from: o.bi$e */
    /* loaded from: classes2.dex */
    public static final class e implements ObjectEncoder<VJ1> {
        public static final e a = new e();
        public static final FieldDescriptor b = FieldDescriptor.d("clientMetrics");

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(VJ1 vj1, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, vj1.c());
        }
    }

    /* renamed from: o.bi$f */
    /* loaded from: classes2.dex */
    public static final class f implements ObjectEncoder<C6343fd2> {
        public static final f a = new f();
        public static final FieldDescriptor b = FieldDescriptor.a("currentCacheSizeBytes").b(AtProtobuf.b().d(1).a()).a();
        public static final FieldDescriptor c = FieldDescriptor.a("maxCacheSizeBytes").b(AtProtobuf.b().d(2).a()).a();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(C6343fd2 c6343fd2, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, c6343fd2.a());
            objectEncoderContext.b(c, c6343fd2.c());
        }
    }

    /* renamed from: o.bi$g */
    /* loaded from: classes2.dex */
    public static final class g implements ObjectEncoder<C5421bp2> {
        public static final g a = new g();
        public static final FieldDescriptor b = FieldDescriptor.a("startMs").b(AtProtobuf.b().d(1).a()).a();
        public static final FieldDescriptor c = FieldDescriptor.a("endMs").b(AtProtobuf.b().d(2).a()).a();

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(C5421bp2 c5421bp2, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, c5421bp2.c());
            objectEncoderContext.b(c, c5421bp2.b());
        }
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void a(EncoderConfig<?> encoderConfig) {
        encoderConfig.b(VJ1.class, e.a);
        encoderConfig.b(ID.class, a.a);
        encoderConfig.b(C5421bp2.class, g.a);
        encoderConfig.b(C5723d41.class, d.a);
        encoderConfig.b(N31.class, c.a);
        encoderConfig.b(C6004eE0.class, b.a);
        encoderConfig.b(C6343fd2.class, f.a);
    }
}
