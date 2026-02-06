package com.google.firebase.messaging;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int a = 2;
    public static final Configurator b = new AutoProtoEncoderDoNotUseEncoder();

    /* loaded from: classes3.dex */
    public static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {
        public static final MessagingClientEventEncoder a = new MessagingClientEventEncoder();
        public static final FieldDescriptor b = FieldDescriptor.a("projectNumber").b(AtProtobuf.b().d(1).a()).a();
        public static final FieldDescriptor c = FieldDescriptor.a("messageId").b(AtProtobuf.b().d(2).a()).a();
        public static final FieldDescriptor d = FieldDescriptor.a("instanceId").b(AtProtobuf.b().d(3).a()).a();
        public static final FieldDescriptor e = FieldDescriptor.a("messageType").b(AtProtobuf.b().d(4).a()).a();
        public static final FieldDescriptor f = FieldDescriptor.a("sdkPlatform").b(AtProtobuf.b().d(5).a()).a();
        public static final FieldDescriptor g = FieldDescriptor.a("packageName").b(AtProtobuf.b().d(6).a()).a();
        public static final FieldDescriptor h = FieldDescriptor.a("collapseKey").b(AtProtobuf.b().d(7).a()).a();
        public static final FieldDescriptor i = FieldDescriptor.a("priority").b(AtProtobuf.b().d(8).a()).a();
        public static final FieldDescriptor j = FieldDescriptor.a("ttl").b(AtProtobuf.b().d(9).a()).a();
        public static final FieldDescriptor k = FieldDescriptor.a("topic").b(AtProtobuf.b().d(10).a()).a();
        public static final FieldDescriptor l = FieldDescriptor.a("bulkId").b(AtProtobuf.b().d(11).a()).a();
        public static final FieldDescriptor m = FieldDescriptor.a("event").b(AtProtobuf.b().d(12).a()).a();
        public static final FieldDescriptor n = FieldDescriptor.a("analyticsLabel").b(AtProtobuf.b().d(13).a()).a();

        /* renamed from: o  reason: collision with root package name */
        public static final FieldDescriptor f367o = FieldDescriptor.a("campaignId").b(AtProtobuf.b().d(14).a()).a();
        public static final FieldDescriptor p = FieldDescriptor.a("composerLabel").b(AtProtobuf.b().d(15).a()).a();

        private MessagingClientEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.b(b, messagingClientEvent.m());
            objectEncoderContext.k(c, messagingClientEvent.i());
            objectEncoderContext.k(d, messagingClientEvent.h());
            objectEncoderContext.k(e, messagingClientEvent.j());
            objectEncoderContext.k(f, messagingClientEvent.n());
            objectEncoderContext.k(g, messagingClientEvent.k());
            objectEncoderContext.k(h, messagingClientEvent.d());
            objectEncoderContext.c(i, messagingClientEvent.l());
            objectEncoderContext.c(j, messagingClientEvent.p());
            objectEncoderContext.k(k, messagingClientEvent.o());
            objectEncoderContext.b(l, messagingClientEvent.b());
            objectEncoderContext.k(m, messagingClientEvent.g());
            objectEncoderContext.k(n, messagingClientEvent.a());
            objectEncoderContext.b(f367o, messagingClientEvent.c());
            objectEncoderContext.k(p, messagingClientEvent.e());
        }
    }

    /* loaded from: classes3.dex */
    public static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {
        public static final MessagingClientEventExtensionEncoder a = new MessagingClientEventExtensionEncoder();
        public static final FieldDescriptor b = FieldDescriptor.a("messagingClientEvent").b(AtProtobuf.b().d(1).a()).a();

        private MessagingClientEventExtensionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, messagingClientEventExtension.c());
        }
    }

    /* loaded from: classes3.dex */
    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {
        public static final ProtoEncoderDoNotUseEncoder a = new ProtoEncoderDoNotUseEncoder();
        public static final FieldDescriptor b = FieldDescriptor.d("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        /* renamed from: b */
        public void a(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.k(b, protoEncoderDoNotUse.c());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void a(EncoderConfig<?> encoderConfig) {
        encoderConfig.b(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.a);
        encoderConfig.b(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.a);
        encoderConfig.b(MessagingClientEvent.class, MessagingClientEventEncoder.a);
    }
}
