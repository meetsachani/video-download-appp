package o;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes2.dex */
public final class N31 {
    public static final N31 c = new a().a();
    public final long a;
    public final b b;

    /* loaded from: classes2.dex */
    public static final class a {
        public long a = 0;
        public b b = b.REASON_UNKNOWN;

        public N31 a() {
            return new N31(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum b implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        public final int X;

        b(int i) {
            this.X = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int k() {
            return this.X;
        }
    }

    public N31(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static N31 a() {
        return c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long b() {
        return this.a;
    }

    @Protobuf(tag = 3)
    public b c() {
        return this.b;
    }
}
