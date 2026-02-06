package o;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ID {
    public static final ID e = new a().b();
    public final C5421bp2 a;
    public final List<C5723d41> b;
    public final C6004eE0 c;
    public final String d;

    /* loaded from: classes2.dex */
    public static final class a {
        public C5421bp2 a = null;
        public List<C5723d41> b = new ArrayList();
        public C6004eE0 c = null;
        public String d = "";

        public a a(C5723d41 c5723d41) {
            this.b.add(c5723d41);
            return this;
        }

        public ID b() {
            return new ID(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(C6004eE0 c6004eE0) {
            this.c = c6004eE0;
            return this;
        }

        public a e(List<C5723d41> list) {
            this.b = list;
            return this;
        }

        public a f(C5421bp2 c5421bp2) {
            this.a = c5421bp2;
            return this;
        }
    }

    public ID(C5421bp2 c5421bp2, List<C5723d41> list, C6004eE0 c6004eE0, String str) {
        this.a = c5421bp2;
        this.b = list;
        this.c = c6004eE0;
        this.d = str;
    }

    public static ID b() {
        return e;
    }

    public static a h() {
        return new a();
    }

    @Protobuf(tag = 4)
    public String a() {
        return this.d;
    }

    @Encodable.Ignore
    public C6004eE0 c() {
        C6004eE0 c6004eE0 = this.c;
        if (c6004eE0 == null) {
            return C6004eE0.a();
        }
        return c6004eE0;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public C6004eE0 d() {
        return this.c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<C5723d41> e() {
        return this.b;
    }

    @Encodable.Ignore
    public C5421bp2 f() {
        C5421bp2 c5421bp2 = this.a;
        if (c5421bp2 == null) {
            return C5421bp2.a();
        }
        return c5421bp2;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public C5421bp2 g() {
        return this.a;
    }

    public byte[] i() {
        return VJ1.b(this);
    }

    public void j(OutputStream outputStream) throws IOException {
        VJ1.a(this, outputStream);
    }
}
