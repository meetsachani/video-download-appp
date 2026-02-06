package o;

import android.annotation.TargetApi;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import o.InterfaceC7750lN;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(24)
@IgnoreJRERequirement
/* renamed from: o.Xv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4759Xv1 extends InterfaceC7750lN.a {

    @IgnoreJRERequirement
    /* renamed from: o.Xv1$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC7750lN<ResponseBody, Optional<T>> {
        public final InterfaceC7750lN<ResponseBody, T> a;

        public a(InterfaceC7750lN<ResponseBody, T> interfaceC7750lN) {
            this.a = interfaceC7750lN;
        }

        @Override // o.InterfaceC7750lN
        /* renamed from: b */
        public Optional<T> a(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.a.a(responseBody));
        }
    }

    public static C4759Xv1 f() {
        return new C4759Xv1();
    }

    @Override // o.InterfaceC7750lN.a
    @InterfaceC10571ws1
    public InterfaceC7750lN<ResponseBody, ?> d(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
        if (InterfaceC7750lN.a.b(type) != Optional.class) {
            return null;
        }
        return new a(c8284nU1.n(InterfaceC7750lN.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
