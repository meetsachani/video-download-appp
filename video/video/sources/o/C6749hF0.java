package o;

import java.io.IOException;
import okhttp3.ResponseBody;

/* renamed from: o.hF0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6749hF0<T> implements InterfaceC7750lN<ResponseBody, T> {
    public final C5523cF0 a;
    public final AbstractC8387nv2<T> b;

    public C6749hF0(C5523cF0 c5523cF0, AbstractC8387nv2<T> abstractC8387nv2) {
        this.a = c5523cF0;
        this.b = abstractC8387nv2;
    }

    @Override // o.InterfaceC7750lN
    /* renamed from: b */
    public T a(ResponseBody responseBody) throws IOException {
        OV0 z = this.a.z(responseBody.charStream());
        try {
            T e = this.b.e(z);
            if (z.I() == XV0.END_DOCUMENT) {
                return e;
            }
            throw new GV0("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
