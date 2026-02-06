package o;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: o.d41  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5723d41 {
    public static final C5723d41 c = new a().b();
    public final String a;
    public final List<N31> b;

    /* renamed from: o.d41$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public String a = "";
        public List<N31> b = new ArrayList();

        public a a(N31 n31) {
            this.b.add(n31);
            return this;
        }

        public C5723d41 b() {
            return new C5723d41(this.a, Collections.unmodifiableList(this.b));
        }

        public a c(List<N31> list) {
            this.b = list;
            return this;
        }

        public a d(String str) {
            this.a = str;
            return this;
        }
    }

    public C5723d41(String str, List<N31> list) {
        this.a = str;
        this.b = list;
    }

    public static C5723d41 a() {
        return c;
    }

    public static a d() {
        return new a();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<N31> b() {
        return this.b;
    }

    @Protobuf(tag = 1)
    public String c() {
        return this.a;
    }
}
