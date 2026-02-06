package o;

import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.qu1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9112qu1<T> implements InterfaceC11302zt<T> {
    public final C6802hS1 X;
    public final Object Y;
    public final Call.Factory Y0;
    public final Object[] Z;
    public final InterfaceC7750lN<ResponseBody, T> Z0;
    public volatile boolean a1;
    @InterfaceC8223nF0("this")
    @InterfaceC10571ws1
    public Call b1;
    @InterfaceC8223nF0("this")
    @InterfaceC10571ws1
    public Throwable c1;
    @InterfaceC8223nF0("this")
    public boolean d1;

    /* renamed from: o.qu1$a */
    /* loaded from: classes4.dex */
    public class a implements Callback {
        public final /* synthetic */ InterfaceC3386Jt a;

        public a(InterfaceC3386Jt interfaceC3386Jt) {
            this.a = interfaceC3386Jt;
        }

        public final void a(Throwable th) {
            try {
                this.a.a(C9112qu1.this, th);
            } catch (Throwable th2) {
                C6504gE2.t(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            a(iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            try {
                try {
                    this.a.b(C9112qu1.this, C9112qu1.this.e(response));
                } catch (Throwable th) {
                    C6504gE2.t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                C6504gE2.t(th2);
                a(th2);
            }
        }
    }

    /* renamed from: o.qu1$b */
    /* loaded from: classes4.dex */
    public static final class b extends ResponseBody {
        public final ResponseBody X;
        public final InterfaceC2677Cq Y;
        @InterfaceC10571ws1
        public IOException Z;

        /* renamed from: o.qu1$b$a */
        /* loaded from: classes4.dex */
        public class a extends AbstractC3501Ky0 {
            public a(InterfaceC7072ia2 interfaceC7072ia2) {
                super(interfaceC7072ia2);
            }

            @Override // o.AbstractC3501Ky0, o.InterfaceC7072ia2
            public long read(C5422bq c5422bq, long j) throws IOException {
                try {
                    return super.read(c5422bq, j);
                } catch (IOException e) {
                    b.this.Z = e;
                    throw e;
                }
            }
        }

        public b(ResponseBody responseBody) {
            this.X = responseBody;
            this.Y = C9604su1.e(new a(responseBody.source()));
        }

        public void a() throws IOException {
            IOException iOException = this.Z;
            if (iOException == null) {
                return;
            }
            throw iOException;
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.X.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.X.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.X.contentType();
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC2677Cq source() {
            return this.Y;
        }
    }

    /* renamed from: o.qu1$c */
    /* loaded from: classes4.dex */
    public static final class c extends ResponseBody {
        @InterfaceC10571ws1
        public final MediaType X;
        public final long Y;

        public c(@InterfaceC10571ws1 MediaType mediaType, long j) {
            this.X = mediaType;
            this.Y = j;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.Y;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.X;
        }

        @Override // okhttp3.ResponseBody
        public InterfaceC2677Cq source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public C9112qu1(C6802hS1 c6802hS1, Object obj, Object[] objArr, Call.Factory factory, InterfaceC7750lN<ResponseBody, T> interfaceC7750lN) {
        this.X = c6802hS1;
        this.Y = obj;
        this.Z = objArr;
        this.Y0 = factory;
        this.Z0 = interfaceC7750lN;
    }

    @Override // o.InterfaceC11302zt
    /* renamed from: b */
    public C9112qu1<T> mo16clone() {
        return new C9112qu1<>(this.X, this.Y, this.Z, this.Y0, this.Z0);
    }

    public final Call c() throws IOException {
        Call newCall = this.Y0.newCall(this.X.a(this.Y, this.Z));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // o.InterfaceC11302zt
    public void cancel() {
        Call call;
        this.a1 = true;
        synchronized (this) {
            call = this.b1;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @InterfaceC8223nF0("this")
    public final Call d() throws IOException {
        Call call = this.b1;
        if (call != null) {
            return call;
        }
        Throwable th = this.c1;
        if (th != null) {
            if (!(th instanceof IOException)) {
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                throw ((Error) th);
            }
            throw ((IOException) th);
        }
        try {
            Call c2 = c();
            this.b1 = c2;
            return c2;
        } catch (IOException | Error | RuntimeException e) {
            C6504gE2.t(e);
            this.c1 = e;
            throw e;
        }
    }

    public FT1<T> e(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new c(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                b bVar = new b(body);
                try {
                    return FT1.m(this.Z0.a(bVar), build);
                } catch (RuntimeException e) {
                    bVar.a();
                    throw e;
                }
            }
            body.close();
            return FT1.m(null, build);
        }
        try {
            return FT1.d(C6504gE2.a(body), build);
        } finally {
            body.close();
        }
    }

    @Override // o.InterfaceC11302zt
    public FT1<T> execute() throws IOException {
        Call d;
        synchronized (this) {
            if (!this.d1) {
                this.d1 = true;
                d = d();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.a1) {
            d.cancel();
        }
        return e(d.execute());
    }

    @Override // o.InterfaceC11302zt
    public void g3(InterfaceC3386Jt<T> interfaceC3386Jt) {
        Call call;
        Throwable th;
        Objects.requireNonNull(interfaceC3386Jt, "callback == null");
        synchronized (this) {
            try {
                if (!this.d1) {
                    this.d1 = true;
                    call = this.b1;
                    th = this.c1;
                    if (call == null && th == null) {
                        Call c2 = c();
                        this.b1 = c2;
                        call = c2;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            interfaceC3386Jt.a(this, th);
            return;
        }
        if (this.a1) {
            call.cancel();
        }
        call.enqueue(new a(interfaceC3386Jt));
    }

    @Override // o.InterfaceC11302zt
    public boolean isCanceled() {
        boolean z = true;
        if (this.a1) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.b1;
                if (call == null || !call.isCanceled()) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // o.InterfaceC11302zt
    public synchronized boolean isExecuted() {
        return this.d1;
    }

    @Override // o.InterfaceC11302zt
    public synchronized Request request() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return d().request();
    }

    @Override // o.InterfaceC11302zt
    public synchronized C8120mp2 timeout() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create call.", e);
        }
        return d().timeout();
    }
}
