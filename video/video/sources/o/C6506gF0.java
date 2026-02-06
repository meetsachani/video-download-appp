package o;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: o.gF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6506gF0<T> implements InterfaceC7750lN<T, RequestBody> {
    public static final MediaType d = MediaType.get("application/json; charset=UTF-8");
    public final C5523cF0 a;
    public final AbstractC8387nv2<T> b;
    public final boolean c;

    public C6506gF0(C5523cF0 c5523cF0, AbstractC8387nv2<T> abstractC8387nv2, boolean z) {
        this.a = c5523cF0;
        this.b = abstractC8387nv2;
        this.c = z;
    }

    public static <T> void c(InterfaceC2579Bq interfaceC2579Bq, C5523cF0 c5523cF0, AbstractC8387nv2<T> abstractC8387nv2, T t) throws IOException {
        C5589cW0 A = c5523cF0.A(new OutputStreamWriter(interfaceC2579Bq.F5(), StandardCharsets.UTF_8));
        abstractC8387nv2.i(A, t);
        A.close();
    }

    @Override // o.InterfaceC7750lN
    /* renamed from: b */
    public RequestBody a(T t) throws IOException {
        if (this.c) {
            return new C6992iF0(this.a, this.b, t);
        }
        C5422bq c5422bq = new C5422bq();
        c(c5422bq, this.a, this.b, t);
        return RequestBody.create(d, c5422bq.G4());
    }
}
