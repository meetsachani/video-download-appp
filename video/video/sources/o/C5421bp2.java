package o;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: o.bp2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5421bp2 {
    public static final C5421bp2 c = new a().a();
    public final long a;
    public final long b;

    /* renamed from: o.bp2$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public long a = 0;
        public long b = 0;

        public C5421bp2 a() {
            return new C5421bp2(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    public C5421bp2(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static C5421bp2 a() {
        return c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 2)
    public long b() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public long c() {
        return this.a;
    }
}
