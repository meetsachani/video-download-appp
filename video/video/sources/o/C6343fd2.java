package o;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: o.fd2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6343fd2 {
    public static final C6343fd2 c = new a().a();
    public final long a;
    public final long b;

    /* renamed from: o.fd2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public long a = 0;
        public long b = 0;

        public C6343fd2 a() {
            return new C6343fd2(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(long j) {
            this.b = j;
            return this;
        }
    }

    public C6343fd2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static C6343fd2 b() {
        return c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 1)
    public long a() {
        return this.a;
    }

    @Protobuf(tag = 2)
    public long c() {
        return this.b;
    }
}
