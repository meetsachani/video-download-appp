package o;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: o.eE0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6004eE0 {
    public static final C6004eE0 b = new a().a();
    public final C6343fd2 a;

    /* renamed from: o.eE0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public C6343fd2 a = null;

        public C6004eE0 a() {
            return new C6004eE0(this.a);
        }

        public a b(C6343fd2 c6343fd2) {
            this.a = c6343fd2;
            return this;
        }
    }

    public C6004eE0(C6343fd2 c6343fd2) {
        this.a = c6343fd2;
    }

    public static C6004eE0 a() {
        return b;
    }

    public static a d() {
        return new a();
    }

    @Encodable.Ignore
    public C6343fd2 b() {
        C6343fd2 c6343fd2 = this.a;
        if (c6343fd2 == null) {
            return C6343fd2.b();
        }
        return c6343fd2;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public C6343fd2 c() {
        return this.a;
    }
}
