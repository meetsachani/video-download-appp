package o;

import android.annotation.TargetApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import o.InterfaceC2493At;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@TargetApi(24)
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class KH extends InterfaceC2493At.a {

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<R> implements InterfaceC2493At<R, CompletableFuture<R>> {
        public final Type a;

        @IgnoreJRERequirement
        /* renamed from: o.KH$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0198a implements InterfaceC3386Jt<R> {
            public final CompletableFuture<R> a;

            public C0198a(CompletableFuture<R> completableFuture) {
                this.a = completableFuture;
            }

            @Override // o.InterfaceC3386Jt
            public void a(InterfaceC11302zt<R> interfaceC11302zt, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // o.InterfaceC3386Jt
            public void b(InterfaceC11302zt<R> interfaceC11302zt, FT1<R> ft1) {
                if (ft1.g()) {
                    this.a.complete(ft1.a());
                } else {
                    this.a.completeExceptionally(new C10432wI0(ft1));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // o.InterfaceC2493At
        public Type b() {
            return this.a;
        }

        @Override // o.InterfaceC2493At
        /* renamed from: c */
        public CompletableFuture<R> a(InterfaceC11302zt<R> interfaceC11302zt) {
            b bVar = new b(interfaceC11302zt);
            interfaceC11302zt.g3(new C0198a(bVar));
            return bVar;
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class b<T> extends CompletableFuture<T> {
        public final InterfaceC11302zt<?> X;

        public b(InterfaceC11302zt<?> interfaceC11302zt) {
            this.X = interfaceC11302zt;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.X.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class c<R> implements InterfaceC2493At<R, CompletableFuture<FT1<R>>> {
        public final Type a;

        @IgnoreJRERequirement
        /* loaded from: classes4.dex */
        public class a implements InterfaceC3386Jt<R> {
            public final CompletableFuture<FT1<R>> a;

            public a(CompletableFuture<FT1<R>> completableFuture) {
                this.a = completableFuture;
            }

            @Override // o.InterfaceC3386Jt
            public void a(InterfaceC11302zt<R> interfaceC11302zt, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // o.InterfaceC3386Jt
            public void b(InterfaceC11302zt<R> interfaceC11302zt, FT1<R> ft1) {
                this.a.complete(ft1);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // o.InterfaceC2493At
        public Type b() {
            return this.a;
        }

        @Override // o.InterfaceC2493At
        /* renamed from: c */
        public CompletableFuture<FT1<R>> a(InterfaceC11302zt<R> interfaceC11302zt) {
            b bVar = new b(interfaceC11302zt);
            interfaceC11302zt.g3(new a(bVar));
            return bVar;
        }
    }

    @Override // o.InterfaceC2493At.a
    @InterfaceC10571ws1
    public InterfaceC2493At<?, ?> a(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
        if (InterfaceC2493At.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b2 = InterfaceC2493At.a.b(0, (ParameterizedType) type);
            if (InterfaceC2493At.a.c(b2) != FT1.class) {
                return new a(b2);
            }
            if (b2 instanceof ParameterizedType) {
                return new c(InterfaceC2493At.a.b(0, (ParameterizedType) b2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
