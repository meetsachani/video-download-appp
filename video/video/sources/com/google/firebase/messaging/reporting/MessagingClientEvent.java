package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class MessagingClientEvent {
    public static final MessagingClientEvent p = new Builder().a();
    public final long a;
    public final String b;
    public final String c;
    public final MessageType d;
    public final SDKPlatform e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;
    public final long k;
    public final Event l;
    public final String m;
    public final long n;

    /* renamed from: o  reason: collision with root package name */
    public final String f381o;

    /* loaded from: classes3.dex */
    public static final class Builder {
        public long a = 0;
        public String b = "";
        public String c = "";
        public MessageType d = MessageType.UNKNOWN;
        public SDKPlatform e = SDKPlatform.UNKNOWN_OS;
        public String f = "";
        public String g = "";
        public int h = 0;
        public int i = 0;
        public String j = "";
        public long k = 0;
        public Event l = Event.UNKNOWN_EVENT;
        public String m = "";
        public long n = 0;

        /* renamed from: o  reason: collision with root package name */
        public String f382o = "";

        public MessagingClientEvent a() {
            return new MessagingClientEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f382o);
        }

        public Builder b(String str) {
            this.m = str;
            return this;
        }

        public Builder c(long j) {
            this.k = j;
            return this;
        }

        public Builder d(long j) {
            this.n = j;
            return this;
        }

        public Builder e(String str) {
            this.g = str;
            return this;
        }

        public Builder f(String str) {
            this.f382o = str;
            return this;
        }

        public Builder g(Event event) {
            this.l = event;
            return this;
        }

        public Builder h(String str) {
            this.c = str;
            return this;
        }

        public Builder i(String str) {
            this.b = str;
            return this;
        }

        public Builder j(MessageType messageType) {
            this.d = messageType;
            return this;
        }

        public Builder k(String str) {
            this.f = str;
            return this;
        }

        public Builder l(int i) {
            this.h = i;
            return this;
        }

        public Builder m(long j) {
            this.a = j;
            return this;
        }

        public Builder n(SDKPlatform sDKPlatform) {
            this.e = sDKPlatform;
            return this;
        }

        public Builder o(String str) {
            this.j = str;
            return this;
        }

        public Builder p(int i) {
            this.i = i;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        public final int X;

        Event(int i) {
            this.X = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int k() {
            return this.X;
        }
    }

    /* loaded from: classes3.dex */
    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        public final int X;

        MessageType(int i) {
            this.X = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int k() {
            return this.X;
        }
    }

    /* loaded from: classes3.dex */
    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        public final int X;

        SDKPlatform(int i) {
            this.X = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int k() {
            return this.X;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = messageType;
        this.e = sDKPlatform;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = i2;
        this.j = str5;
        this.k = j2;
        this.l = event;
        this.m = str6;
        this.n = j3;
        this.f381o = str7;
    }

    public static MessagingClientEvent f() {
        return p;
    }

    public static Builder q() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    public String a() {
        return this.m;
    }

    @Protobuf(tag = 11)
    public long b() {
        return this.k;
    }

    @Protobuf(tag = 14)
    public long c() {
        return this.n;
    }

    @Protobuf(tag = 7)
    public String d() {
        return this.g;
    }

    @Protobuf(tag = 15)
    public String e() {
        return this.f381o;
    }

    @Protobuf(tag = 12)
    public Event g() {
        return this.l;
    }

    @Protobuf(tag = 3)
    public String h() {
        return this.c;
    }

    @Protobuf(tag = 2)
    public String i() {
        return this.b;
    }

    @Protobuf(tag = 4)
    public MessageType j() {
        return this.d;
    }

    @Protobuf(tag = 6)
    public String k() {
        return this.f;
    }

    @Protobuf(tag = 8)
    public int l() {
        return this.h;
    }

    @Protobuf(tag = 1)
    public long m() {
        return this.a;
    }

    @Protobuf(tag = 5)
    public SDKPlatform n() {
        return this.e;
    }

    @Protobuf(tag = 10)
    public String o() {
        return this.j;
    }

    @Protobuf(tag = 9)
    public int p() {
        return this.i;
    }
}
