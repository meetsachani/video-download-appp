package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class MessagingClientEventExtension {
    public static final MessagingClientEventExtension b = new Builder().a();
    public final MessagingClientEvent a;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public MessagingClientEvent a = null;

        public MessagingClientEventExtension a() {
            return new MessagingClientEventExtension(this.a);
        }

        public Builder b(MessagingClientEvent messagingClientEvent) {
            this.a = messagingClientEvent;
            return this;
        }
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.a = messagingClientEvent;
    }

    public static MessagingClientEventExtension a() {
        return b;
    }

    public static Builder d() {
        return new Builder();
    }

    @Encodable.Ignore
    public MessagingClientEvent b() {
        MessagingClientEvent messagingClientEvent = this.a;
        if (messagingClientEvent == null) {
            return MessagingClientEvent.f();
        }
        return messagingClientEvent;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "messagingClientEvent")
    public MessagingClientEvent c() {
        return this.a;
    }

    public byte[] e() {
        return ProtoEncoderDoNotUse.b(this);
    }

    public void f(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.a(this, outputStream);
    }
}
