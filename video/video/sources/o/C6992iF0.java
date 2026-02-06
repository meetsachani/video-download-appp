package o;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: o.iF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6992iF0<T> extends RequestBody {
    public final C5523cF0 a;
    public final AbstractC8387nv2<T> b;
    public final T c;

    public C6992iF0(C5523cF0 c5523cF0, AbstractC8387nv2<T> abstractC8387nv2, T t) {
        this.a = c5523cF0;
        this.b = abstractC8387nv2;
        this.c = t;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return C6506gF0.d;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC2579Bq interfaceC2579Bq) throws IOException {
        C6506gF0.c(interfaceC2579Bq, this.a, this.b, this.c);
    }
}
