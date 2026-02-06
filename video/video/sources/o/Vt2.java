package o;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import o.InterfaceC5292bI;

@InterfaceC11123z82
@InterfaceC5292bI(modules = {AbstractC9805tk.class, AbstractC4401Ue0.class, AbstractC5868dg0.class, AbstractC8540oY1.class, AbstractC8053mY1.class, AbstractC3955Po2.class})
/* loaded from: classes2.dex */
public abstract class Vt2 implements Closeable {

    @InterfaceC5292bI.a
    /* loaded from: classes2.dex */
    public interface a {
        @InterfaceC10303vn
        a a(Context context);

        Vt2 build();
    }

    public abstract InterfaceC4207Se0 a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }

    public abstract Ut2 d();
}
