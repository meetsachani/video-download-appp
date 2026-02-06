package o;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import o.C8051mY;
import o.InterfaceC2493At;
import okhttp3.Request;

/* renamed from: o.mY  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8051mY extends InterfaceC2493At.a {
    @InterfaceC10571ws1
    public final Executor a;

    /* renamed from: o.mY$a */
    /* loaded from: classes4.dex */
    public class a implements InterfaceC2493At<Object, InterfaceC11302zt<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // o.InterfaceC2493At
        public Type b() {
            return this.a;
        }

        @Override // o.InterfaceC2493At
        /* renamed from: c */
        public InterfaceC11302zt<Object> a(InterfaceC11302zt<Object> interfaceC11302zt) {
            Executor executor = this.b;
            if (executor == null) {
                return interfaceC11302zt;
            }
            return new b(executor, interfaceC11302zt);
        }
    }

    /* renamed from: o.mY$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC11302zt<T> {
        public final Executor X;
        public final InterfaceC11302zt<T> Y;

        /* renamed from: o.mY$b$a */
        /* loaded from: classes4.dex */
        public class a implements InterfaceC3386Jt<T> {
            public final /* synthetic */ InterfaceC3386Jt a;

            public a(InterfaceC3386Jt interfaceC3386Jt) {
                this.a = interfaceC3386Jt;
            }

            public static /* synthetic */ void d(a aVar, InterfaceC3386Jt interfaceC3386Jt, FT1 ft1) {
                if (b.this.Y.isCanceled()) {
                    interfaceC3386Jt.a(b.this, new IOException("Canceled"));
                } else {
                    interfaceC3386Jt.b(b.this, ft1);
                }
            }

            @Override // o.InterfaceC3386Jt
            public void a(InterfaceC11302zt<T> interfaceC11302zt, final Throwable th) {
                Executor executor = b.this.X;
                final InterfaceC3386Jt interfaceC3386Jt = this.a;
                executor.execute(new Runnable() { // from class: o.oY
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC3386Jt.a(C8051mY.b.this, th);
                    }
                });
            }

            @Override // o.InterfaceC3386Jt
            public void b(InterfaceC11302zt<T> interfaceC11302zt, final FT1<T> ft1) {
                Executor executor = b.this.X;
                final InterfaceC3386Jt interfaceC3386Jt = this.a;
                executor.execute(new Runnable() { // from class: o.nY
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8051mY.b.a.d(C8051mY.b.a.this, interfaceC3386Jt, ft1);
                    }
                });
            }
        }

        public b(Executor executor, InterfaceC11302zt<T> interfaceC11302zt) {
            this.X = executor;
            this.Y = interfaceC11302zt;
        }

        @Override // o.InterfaceC11302zt
        public void cancel() {
            this.Y.cancel();
        }

        @Override // o.InterfaceC11302zt
        public FT1<T> execute() throws IOException {
            return this.Y.execute();
        }

        @Override // o.InterfaceC11302zt
        public void g3(InterfaceC3386Jt<T> interfaceC3386Jt) {
            Objects.requireNonNull(interfaceC3386Jt, "callback == null");
            this.Y.g3(new a(interfaceC3386Jt));
        }

        @Override // o.InterfaceC11302zt
        public boolean isCanceled() {
            return this.Y.isCanceled();
        }

        @Override // o.InterfaceC11302zt
        public boolean isExecuted() {
            return this.Y.isExecuted();
        }

        @Override // o.InterfaceC11302zt
        public Request request() {
            return this.Y.request();
        }

        @Override // o.InterfaceC11302zt
        public C8120mp2 timeout() {
            return this.Y.timeout();
        }

        @Override // o.InterfaceC11302zt
        public InterfaceC11302zt<T> clone() {
            return new b(this.X, this.Y.mo16clone());
        }
    }

    public C8051mY(@InterfaceC10571ws1 Executor executor) {
        this.a = executor;
    }

    @Override // o.InterfaceC2493At.a
    @InterfaceC10571ws1
    public InterfaceC2493At<?, ?> a(Type type, Annotation[] annotationArr, C8284nU1 c8284nU1) {
        Executor executor = null;
        if (InterfaceC2493At.a.c(type) != InterfaceC11302zt.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type g = C6504gE2.g(0, (ParameterizedType) type);
            if (!C6504gE2.l(annotationArr, X82.class)) {
                executor = this.a;
            }
            return new a(g, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
