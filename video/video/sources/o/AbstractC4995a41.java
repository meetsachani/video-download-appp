package o;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
import o.C4513Vi;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* renamed from: o.a41  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4995a41 {

    @InterfaceC6615gi.a
    /* renamed from: o.a41$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        @InterfaceC5670cr1
        public abstract AbstractC4995a41 a();

        @InterfaceC5670cr1
        public abstract a b(@InterfaceC11300zs1 HD hd);

        @InterfaceC5670cr1
        public abstract a c(@InterfaceC11300zs1 List<M31> list);

        @InterfaceC5670cr1
        public abstract a d(@InterfaceC11300zs1 Integer num);

        @InterfaceC5670cr1
        public abstract a e(@InterfaceC11300zs1 String str);

        @InterfaceC5670cr1
        public abstract a f(@InterfaceC11300zs1 YK1 yk1);

        @InterfaceC5670cr1
        public abstract a g(long j);

        @InterfaceC5670cr1
        public abstract a h(long j);

        @InterfaceC5670cr1
        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        @InterfaceC5670cr1
        public a j(@InterfaceC5670cr1 String str) {
            return e(str);
        }
    }

    @InterfaceC5670cr1
    public static a a() {
        return new C4513Vi.b();
    }

    @InterfaceC11300zs1
    public abstract HD b();

    @InterfaceC11300zs1
    @Encodable.Field(name = "logEvent")
    public abstract List<M31> c();

    @InterfaceC11300zs1
    public abstract Integer d();

    @InterfaceC11300zs1
    public abstract String e();

    @InterfaceC11300zs1
    public abstract YK1 f();

    public abstract long g();

    public abstract long h();
}
