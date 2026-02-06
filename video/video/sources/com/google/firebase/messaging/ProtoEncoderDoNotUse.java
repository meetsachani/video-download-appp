package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
import java.io.OutputStream;

@Encodable
/* loaded from: classes3.dex */
public abstract class ProtoEncoderDoNotUse {
    public static final ProtobufEncoder a = ProtobufEncoder.a().e(AutoProtoEncoderDoNotUseEncoder.b).d();

    private ProtoEncoderDoNotUse() {
    }

    public static void a(Object obj, OutputStream outputStream) throws IOException {
        a.b(obj, outputStream);
    }

    public static byte[] b(Object obj) {
        return a.c(obj);
    }

    public abstract MessagingClientEventExtension c();
}
