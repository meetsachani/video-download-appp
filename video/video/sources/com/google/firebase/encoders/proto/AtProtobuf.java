package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class AtProtobuf {
    public int a;
    public Protobuf.IntEncoding b = Protobuf.IntEncoding.DEFAULT;

    /* loaded from: classes3.dex */
    public static final class ProtobufImpl implements Protobuf {
        public final int b2;
        public final Protobuf.IntEncoding c2;

        public ProtobufImpl(int i, Protobuf.IntEncoding intEncoding) {
            this.b2 = i;
            this.c2 = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.b2 == protobuf.tag() && this.c2.equals(protobuf.intEncoding())) {
                return true;
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.b2) + (this.c2.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public Protobuf.IntEncoding intEncoding() {
            return this.c2;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public int tag() {
            return this.b2;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b2 + "intEncoding=" + this.c2 + ')';
        }
    }

    public static AtProtobuf b() {
        return new AtProtobuf();
    }

    public Protobuf a() {
        return new ProtobufImpl(this.a, this.b);
    }

    public AtProtobuf c(Protobuf.IntEncoding intEncoding) {
        this.b = intEncoding;
        return this;
    }

    public AtProtobuf d(int i) {
        this.a = i;
        return this;
    }
}
