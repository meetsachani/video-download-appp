package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import o.InterfaceC7750lN;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* renamed from: o.fF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6251fF0 extends InterfaceC7750lN.a {
    public final C5523cF0 a;
    public final boolean b;

    public C6251fF0(C5523cF0 c5523cF0, boolean z) {
        this.a = c5523cF0;
        this.b = z;
    }

    public static C6251fF0 f() {
        return g(new C5523cF0());
    }

    public static C6251fF0 g(C5523cF0 c5523cF0) {
        if (c5523cF0 != null) {
            return new C6251fF0(c5523cF0, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // o.InterfaceC7750lN.a
    public InterfaceC7750lN<?, RequestBody> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C8284nU1 c8284nU1) {
        return new C6506gF0(this.a, this.a.u(Rv2.c(type)), this.b);
    }

    @Override // o.InterfaceC7750lN.a
    public InterfaceC7750lN<ResponseBody, ?> d(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
        return new C6749hF0(this.a, this.a.u(Rv2.c(type)));
    }

    public C6251fF0 h() {
        return new C6251fF0(this.a, true);
    }
}
