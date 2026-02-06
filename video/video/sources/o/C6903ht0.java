package o;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.C4086Qy1;
import o.InterfaceC4651Ws0;

@Deprecated
/* renamed from: o.ht0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6903ht0<T extends InterfaceC4651Ws0<T>> implements C4086Qy1.a<T> {
    public final C4086Qy1.a<? extends T> a;
    @InterfaceC11300zs1
    public final List<C3031Gd2> b;

    public C6903ht0(C4086Qy1.a<? extends T> aVar, @InterfaceC11300zs1 List<C3031Gd2> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // o.C4086Qy1.a
    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T a = this.a.a(uri, inputStream);
        List<C3031Gd2> list = this.b;
        if (list != null && !list.isEmpty()) {
            return (T) a.a(this.b);
        }
        return a;
    }
}
